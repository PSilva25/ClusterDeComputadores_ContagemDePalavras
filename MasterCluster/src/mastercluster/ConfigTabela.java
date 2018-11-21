package mastercluster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ConfigTabela extends AbstractTableModel {

    private ArrayList<Componentes> produtos;
    private int COL_ID = 0, COL_IP = 1, COL_STATUS = 2;

    public ConfigTabela() {
        produtos = new ArrayList();
    }

    public ConfigTabela(List lista) {
        this();
        produtos.addAll(lista);
    }

    public int getRowCount() {
        return produtos.size();
    }

    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_ID) {
            return "Nº";
        } else if (column == COL_IP) {
            return "IP";
        } else if (column == COL_STATUS) {
            return "Status";
        }
        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_IP) {
            return String.class;
        } else if (columnIndex == COL_STATUS) {
            return String.class;
        }
        return String.class;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Componentes p = (Componentes) produtos.get(rowIndex);

        if (columnIndex == COL_ID) {
            return p.getID();
        } else if (columnIndex == COL_IP) {
            return p.getIP();
        } else if (columnIndex == COL_STATUS) {
            return p.getEstado();
        }
        return "";
    }

    public void setValueAt(Componentes aValue, int rowIndex, int columnIndex) {
        Componentes p = produtos.get(rowIndex);
        p.setEstado(aValue.getEstado());
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void ordenarPorStatus() {
        Collections.sort(produtos, (Componentes o1, Componentes o2) -> o1.getEstado().compareTo(o2.getEstado()));

        fireTableDataChanged();
    }

    public void inserir(Componentes p) {
        produtos.add(p);

        fireTableDataChanged();
    }

    public ArrayList excluir(int pos) {
        System.out.println(produtos.get(pos).getIP());
        produtos.remove(pos);

        fireTableDataChanged();

        return produtos;
    }

    public ArrayList excluir(Componentes p) {
        produtos.remove(p);

        fireTableDataChanged();

        return produtos;
    }

    public Componentes getComponentes(int pos) {
        if (pos < 0 || pos >= produtos.size()) {
            return null;
        }

        return produtos.get(pos);
    }
}
