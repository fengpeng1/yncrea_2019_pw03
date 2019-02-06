package yncrea.pw03.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yncrea.pw01.model.Drug;
import yncrea.pw03.entity.Student;

@WebServlet(urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
	
	private List<Student> students;
	
	@Override
    public void init() throws ServletException {
        super.init();
        students = new ArrayList<>();
        
    }
	
	@Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students",students);
        req.getRequestDispatcher("Students.jsp").forward(req,resp);
    }


    
}
