package com.spring.restapi.sequence;
import java.io.Serializable;
import java.sql.*;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class TaskIdGenerator implements IdentifierGenerator{

//    @Override
    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {

        String prefix = "TASK_";
        
        String generatedId = prefix + System.currentTimeMillis();
//        Connection connection = session.connection();
//
//        try {
//            Statement statement=connection.createStatement();
//
//            ResultSet rs=statement.executeQuery("select count(Department_Id) as Id from demo.Department");
//
//            if(rs.next())
//            {
//                int id=rs.getInt(1)+101;
//                String generatedId = prefix + new Integer(id).toString();
//                System.out.println("Generated Id: " + generatedId);
//                return generatedId;
//            }
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }


        return generatedId;
    }

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		return generate(null, null);
	}

}