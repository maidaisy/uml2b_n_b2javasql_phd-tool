/**
 * generated by Xtext 2.10.0
 */
package b2sql.generator;

import b2sql.b2SQL2.Attribute;
import b2sql.b2SQL2.BOperation;
import b2sql.b2SQL2.BParameterTyping;
import b2sql.b2SQL2.BPredicate;
import b2sql.b2SQL2.BSQLMachine;
import b2sql.b2SQL2.BSubTrue;
import b2sql.b2SQL2.BTable;
import b2sql.b2SQL2.BType;
import b2sql.b2SQL2.BoolOperation;
import b2sql.b2SQL2.SQLCall;
import b2sql.b2SQL2.StringOperation;
import b2sql.b2SQL2.TIAssignment;
import b2sql.b2SQL2.TableInstance;
import b2sql.b2SQL2.VoidOperation;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class B2SQL2Generator extends AbstractGenerator {
  private BTable table;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<BSQLMachine> _filter = Iterables.<BSQLMachine>filter(_iterable, BSQLMachine.class);
    for (final BSQLMachine t : _filter) {
      {
        BTable _inv = t.getInv();
        boolean _notEquals = (!Objects.equal(_inv, null));
        if (_notEquals) {
          BTable _inv_1 = t.getInv();
          this.table = _inv_1;
        }
        String _vars = t.getVars();
        String _plus = (_vars + ".sql");
        CharSequence _maptoProcedure = this.maptoProcedure(t);
        fsa.generateFile(_plus, _maptoProcedure);
      }
    }
  }
  
  public CharSequence maptoProcedure(final BSQLMachine m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("--SQL code of ");
    String _m_name = m.getM_name();
    _builder.append(_m_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("//compile a log table");
    _builder.newLine();
    {
      BTable _inv = m.getInv();
      String _table_name = _inv.getTable_name();
      String _string = _table_name.toString();
      boolean _endsWith = _string.endsWith("log");
      if (_endsWith) {
        _builder.append("\t");
        BTable _inv_1 = m.getInv();
        CharSequence _maptoLogTable = this.maptoLogTable(_inv_1);
        _builder.append(_maptoLogTable, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("//compile a object table");
        _builder.newLine();
      } else {
        BTable _inv_2 = m.getInv();
        CharSequence _maptoFunTable = this.maptoFunTable(_inv_2);
        _builder.append(_maptoFunTable, "");
        _builder.newLineIfNotEmpty();
        {
          EList<BOperation> _bops = m.getBops();
          for(final BOperation o : _bops) {
            CharSequence _maptoProcedure = this.maptoProcedure(o);
            _builder.append(_maptoProcedure, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * generate a table from a log B structure
   */
  public CharSequence maptoLogTable(final BTable t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*generate the SQL table from the B variable ");
    String _table_name = t.getTable_name();
    _builder.append(_table_name, "");
    _builder.append("*/\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TABLE ");
    String _table_name_1 = t.getTable_name();
    _builder.append(_table_name_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = t.getAttributes();
      boolean _hasElements = false;
      for(final Attribute a : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        {
          String _att_name = a.getAtt_name();
          String _string = _att_name.toString();
          boolean _startsWith = _string.startsWith("order");
          if (_startsWith) {
            String _att_name_1 = a.getAtt_name();
            _builder.append(_att_name_1, "\t");
            _builder.append(" DATETIME DEFAULT CURRENT_TIMESTAMP");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
          } else {
            CharSequence _textAtrribute = this.toTextAtrribute(a);
            _builder.append(_textAtrribute, "\t");
            _builder.append(" NOT NULL ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("/*the key is a set of attributes denoting the parameters of the method to log*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PRIMARY KEY(");
    {
      ArrayList<Attribute> _tableAttr = this.getTableAttr(this.table, 2);
      boolean _hasElements_1 = false;
      for(final Attribute attr : _tableAttr) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _att_name_2 = attr.getAtt_name();
        _builder.append(_att_name_2, "\t");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * generate a table from a object B structure
   */
  public CharSequence maptoFunTable(final BTable t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*generate the SQL table from the B variable ");
    String _table_name = t.getTable_name();
    _builder.append(_table_name, "");
    _builder.append("*/\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TABLE ");
    String _table_name_1 = t.getTable_name();
    _builder.append(_table_name_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("/*the key is the first attribute*/");
    _builder.newLine();
    _builder.append("\t");
    EList<Attribute> _attributes = t.getAttributes();
    Attribute first = IterableExtensions.<Attribute>head(_attributes);
    CharSequence _textAtrribute = this.toTextAtrribute(first);
    _builder.append(_textAtrribute, "\t");
    _builder.append(" PRIMARY KEY NOT NULL ");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes_1 = t.getAttributes();
      boolean _hasElements = false;
      for(final Attribute a : _attributes_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        {
          boolean _equals = a.equals(first);
          if (_equals) {
          } else {
            _builder.append("\t");
            CharSequence _textAtrribute_1 = this.toTextAtrribute(a);
            _builder.append(_textAtrribute_1, "\t");
            _builder.append(" NOT NULL ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTextAtrribute(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    String _att_name = a.getAtt_name();
    _builder.append(_att_name, "");
    _builder.append(" ");
    BType _type = a.getType();
    CharSequence _maptoSQLType = this.maptoSQLType(_type);
    _builder.append(_maptoSQLType, "");
    return _builder;
  }
  
  public CharSequence maptoSQLType(final BType t) {
    StringConcatenation _builder = new StringConcatenation();
    String _switchResult = null;
    String _type_name = t.getType_name();
    switch (_type_name) {
      case "NAT":
        _switchResult = "INT /*convert type NAT in B to INT in SQL*/";
        break;
      case "BOOL":
        _switchResult = "BIT /*convert type BOOL in B to BIT in SQL*/";
        break;
      case "STR":
        _switchResult = "VARCHAR(25)";
        break;
      case "Users":
        _switchResult = "VARCHAR(25)";
        break;
      case "Roles":
        _switchResult = "VARCHAR(25)";
        break;
      default:
        _switchResult = "INT";
        break;
    }
    _builder.append(_switchResult, "");
    return _builder;
  }
  
  public CharSequence maptoProcedure(final BOperation o) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BoolOperation _bops = o.getBops();
      boolean _notEquals = (!Objects.equal(_bops, null));
      if (_notEquals) {
        _builder.append(" ");
        BoolOperation _bops_1 = o.getBops();
        CharSequence _compile = this.compile(_bops_1);
        _builder.append(_compile, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      StringOperation _sops = o.getSops();
      boolean _notEquals_1 = (!Objects.equal(_sops, null));
      if (_notEquals_1) {
        _builder.append(" ");
        StringOperation _sops_1 = o.getSops();
        CharSequence _compile_1 = this.compile(_sops_1);
        _builder.append(_compile_1, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      VoidOperation _vops = o.getVops();
      boolean _notEquals_2 = (!Objects.equal(_vops, null));
      if (_notEquals_2) {
        _builder.append(" ");
        VoidOperation _vops_1 = o.getVops();
        CharSequence _compile_2 = this.compile(_vops_1);
        _builder.append(_compile_2, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final StringOperation so) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    return _builder;
  }
  
  public CharSequence compile(final VoidOperation vo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    return _builder;
  }
  
  public CharSequence compile(final BoolOperation bo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* generated stored procedure of the operation ");
    String _op_name = bo.getOp_name();
    _builder.append(_op_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("**/");
    _builder.newLine();
    _builder.append("CREATE PROCEDURE ");
    String _op_name_1 = bo.getOp_name();
    _builder.append(_op_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    {
      EList<BParameterTyping> _pTyping = bo.getPTyping();
      boolean _hasElements = false;
      for(final BParameterTyping p : _pTyping) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "   ");
        }
        _builder.append("@");
        String _p_name = p.getP_name();
        _builder.append(_p_name, "   ");
        _builder.append(" ");
        BType _type = p.getType();
        CharSequence _maptoSQLType = this.maptoSQLType(_type);
        _builder.append(_maptoSQLType, "   ");
      }
    }
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("@res BIT OUTPUT /*BOOL type in B is converted to BIT type in SQL*/");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("AS");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("/*checks the existance of records*/");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("DECLARE @exist int");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("SELECT @exist = COUNT(*) FROM ");
    {
      BSubTrue _reshas = bo.getReshas();
      TableInstance _objTable = _reshas.getObjTable();
      String _ti_name = _objTable.getTi_name();
      BSubTrue _reshas_1 = bo.getReshas();
      TableInstance _objTable_1 = _reshas_1.getObjTable();
      TIAssignment _ti_type = _objTable_1.getTi_type();
      String _instance_name = _ti_type.getInstance_name();
      boolean _equals = _ti_name.equals(_instance_name);
      if (_equals) {
        BSubTrue _reshas_2 = bo.getReshas();
        TableInstance _objTable_2 = _reshas_2.getObjTable();
        TIAssignment _ti_type_1 = _objTable_2.getTi_type();
        String _instance_type = _ti_type_1.getInstance_type();
        _builder.append(_instance_type, "   \t\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("   \t\t");
    _builder.append("/*generates conditions from the B predicates*/");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("WHERE ");
    {
      BSubTrue _reshas_3 = bo.getReshas();
      EList<BPredicate> _pres = _reshas_3.getPres();
      boolean _hasElements_1 = false;
      for(final BPredicate p_1 : _pres) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" AND ", "   \t\t");
        }
        SQLCall _pLeft = p_1.getPLeft();
        String _sRight = _pLeft.getSRight();
        _builder.append(_sRight, "   \t\t");
        _builder.append("=");
        {
          String _pRight = p_1.getPRight();
          boolean _equals_1 = _pRight.equals("FALSE");
          if (_equals_1) {
            _builder.append(" 0 ");
          } else {
            String _pRight_1 = p_1.getPRight();
            boolean _equals_2 = _pRight_1.equals("TRUE");
            if (_equals_2) {
              _builder.append(" 1 ");
            } else {
              String _pRight_2 = p_1.getPRight();
              if ((_pRight_2 instanceof String)) {
                _builder.append(" @");
                String _pRight_3 = p_1.getPRight();
                _builder.append(_pRight_3, "   \t\t");
              } else {
                _builder.append(" ");
                String _pRight_4 = p_1.getPRight();
                _builder.append(_pRight_4, "   \t\t");
                _builder.append(" ");
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("   \t\t");
    _builder.append("/*returns 1 (corresponds to TRUE in B) if there exists such an instance, ");
    _builder.newLine();
    _builder.append("   \t\t\t");
    _builder.append("returns 0 (corresponds to FALSE in B) otherwise*/");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("IF(@exist > 0) ");
    _builder.newLine();
    _builder.append("   \t\t\t");
    _builder.append("SET @res = 1");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.append("ELSE ");
    _builder.newLine();
    _builder.append("   \t\t\t");
    _builder.append("SET @res = 0\t");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("GO");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * get the attributes of a table:
   * mode == 0: get all the attributes.
   * mode == 1: get the attributes except the order
   * mode == 2: get the attributes except the user and the order
   */
  public ArrayList<Attribute> getTableAttr(final BTable table, final int mode) {
    final ArrayList<Attribute> listAttrs = new ArrayList<Attribute>();
    EList<Attribute> _attributes = table.getAttributes();
    for (final Attribute attr : _attributes) {
      if ((mode == 0)) {
        listAttrs.add(attr);
      } else {
        if ((mode == 1)) {
          String _att_name = attr.getAtt_name();
          String _string = _att_name.toString();
          boolean _startsWith = _string.startsWith("order");
          boolean _not = (!_startsWith);
          if (_not) {
            listAttrs.add(attr);
          }
        } else {
          if ((mode == 2)) {
            boolean _not_1 = (!(attr.getAtt_name().toString().startsWith("user") || attr.getAtt_name().toString().startsWith("order")));
            if (_not_1) {
              listAttrs.add(attr);
            }
          }
        }
      }
    }
    return listAttrs;
  }
}
