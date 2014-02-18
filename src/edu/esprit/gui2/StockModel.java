/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui2;

import edu.esprit.dao.StockDAO;
import edu.esprit.entities.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amine
 */
public class StockModel extends AbstractTableModel {

    List<Stock> stocks = new ArrayList<Stock>();
    String[] entete = {"ID Stock", "Type Vet", "Quantite", "Depot"};

    public StockModel() {
        stocks = new StockDAO().DisplayAllStocks();
    }

    public int getRowCount() {
        return stocks.size();
    }

    public int getColumnCount() {
        return entete.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return stocks.get(rowIndex).getNumero_stock();
            case 1:
                return stocks.get(rowIndex).getType_vet_stock();
            case 2:
                return stocks.get(rowIndex).getNombre_articles();
            case 3:
                return stocks.get(rowIndex).getDepot().getAdresse_depot();
            default:
                 throw new IllegalArgumentException();
        }
        
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
    
}
