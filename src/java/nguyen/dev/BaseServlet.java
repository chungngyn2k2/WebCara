/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyen.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import nguyen.dev.data.dao.Database;
import nguyen.dev.data.dao.DatabaseDao;

/**
 *
 * @author tranq
 */
public class BaseServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
         super.init();
                DatabaseDao.init(new Database());
    }
    
}
