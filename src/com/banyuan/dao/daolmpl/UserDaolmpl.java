package com.banyuan.dao.daolmpl;

import com.banyuan.dao.UserDao;
import com.banyuan.pojo.Questions;
import com.banyuan.pojo.Student;
import com.banyuan.util.C3p0_Util;
import com.banyuan.util.DriudUtil;

import java.sql.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class UserDaolmpl implements UserDao {
    //dao层，写一些sql语句

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * 对学生增加
     *
     * @param student
     * @return
     */
    @Override
    public boolean addStu(Student student) {
        try {
            con = DriudUtil.getConnection();

            String sql = "insert into Student(StuName,StuPassword,StuScore) values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, student.getStuName());
            ps.setString(2, student.getStuPassword());
            ps.setInt(3, student.getStuScore());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return false;
    }

    /**
     * 对学生删除
     *
     * @param stuNum
     * @return
     */
    @Override
    public boolean delStu(Integer stuNum) {
        try {
            con = DriudUtil.getConnection();
            String sql = "delete from Student where StuNum=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, stuNum);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 对学生修改
     *
     * @param stuNum
     * @return
     */
    @Override
    public boolean updateStu(Student student, Integer stuNum) {

        try {
            con = DriudUtil.getConnection();
//
            String sql = "update Student set StuName=?,StuPassword=? ,StuScore=? where StuNum=?";
            ps = con.prepareStatement(sql);
            ps.setInt(4, stuNum);
            ps.setString(1, student.getStuName());
            ps.setString(2, student.getStuPassword());
            ps.setInt(3, student.getStuScore());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 对学生查询
     *
     * @param stuNum
     */
    @Override
    public String selStu(Integer stuNum) {
        try {
            con = DriudUtil.getConnection();

            String sql = "select *from Student where StuNum=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, stuNum);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("stuNum") + "." + rs.getString("stuName") + "  " + rs.getString("stuPassword") + "  " + rs.getInt("stuScore");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 对试题增加
     *
     * @param question
     * @return
     */
    @Override
    public boolean addQus(Questions question) {
        try {
            con = DriudUtil.getConnection();

            String sql = "insert into Questions(Question,ChooseA,ChooseB,ChooseC,ChooseD,Answer) values(?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getChooseA());
            ps.setString(3, question.getChooseB());
            ps.setString(4, question.getChooseC());
            ps.setString(5, question.getChooseD());
            ps.setString(6, question.getAnswer());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return false;
    }

    /**
     * 对试题删除
     *
     * @param qusNum
     * @return
     */
    @Override
    public boolean delQus(Integer qusNum) {
        try {
            con = DriudUtil.getConnection();

            String sql = "delete from Questions where qusNum=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, qusNum);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 对试题修改
     *
     * @param qusNum
     * @return
     */
    @Override
    public boolean updateQus(Questions question, Integer qusNum) {

        try {
            con = DriudUtil.getConnection();

            String sql = "update Questions set Question=?,ChooseA=? ,ChooseB=?,ChooseC=?,ChooseD=?,Answer=? where QusNum=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getChooseA());
            ps.setString(3, question.getChooseB());
            ps.setString(4, question.getChooseC());
            ps.setString(5, question.getChooseD());
            ps.setString(6, question.getAnswer());
            ps.setInt(7, qusNum);
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 对试题查询
     *
     * @param qusNum
     */
    @Override
    public String selQus(Integer qusNum) {
        try {
            con = DriudUtil.getConnection();
            String sql = "select Question,chooseA,chooseB,chooseC,chooseD,Answer,QusNum,Answer from Questions where QusNum= ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, qusNum);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String str = rs.getString("Question") + "\n" + rs.getString("chooseA") + "\t" + rs.getString("chooseB") + "\n" + rs.getString("chooseC") + "\t" + rs.getString("chooseD") + rs.getString("Answer");
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 学生登陆
     *
     * @param stuName
     * @param stuPassword
     * @return
     */
    @Override
    public boolean stuLoad(String stuName, String stuPassword) {
        String[] str = new String[2];
        try {
            con = DriudUtil.getConnection();

            String sql = "select StuName,StuPassword from Student where StuName= ? and  StuPassword = ?";
            //System.out.println(stuName+"---"+stuPassword+"-------"+sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, stuName);
            ps.setString(2, stuPassword);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return false;
    }

    /**
     * 管理员登陆
     *
     * @param admName
     * @param admPassword
     * @return
     */
    @Override
    public boolean admLoad(String admName, String admPassword) {
        String[] str = new String[2];
        try {
            con = DriudUtil.getConnection();

            String sql = "select AdmName ,AdmPassword from Admin where AdmName= ? and  AdmPassword = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, admName);
            ps.setString(2, admPassword);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    @Override
    public String selScore(int stuNum) {
        con = DriudUtil.getConnection();
        String sql = "select  StuScore from Student where StuNum=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stuNum);
            rs = ps.executeQuery();
            rs.next();
            String str = "" + rs.getInt("StuScore");
            return str;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 对学生成绩进行添加，修改
     */
    @Override
    public boolean updateStuScore(Student student) {

        try {
            con = DriudUtil.getConnection();
//
            String sql = "update Student set StuScore=? ,StuUseTime=? where StuName=? and StuPassword=? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, student.getStuScore());
            ps.setInt(2, student.getStuUseTime());
            ps.setString(3, student.getStuName());
            ps.setString(4, student.getStuPassword());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 修改学生密码
     */
    @Override
    public boolean updateStuPassword(Student student) {
        try {
            con = DriudUtil.getConnection();

            String sql = "update Student set StuPassword=? where StuName=? and StuPassword=? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, student.getStuPassword2());
            ps.setString(2, student.getStuName());
            ps.setString(3, student.getStuPassword());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;

    }

    /**
     * 对学生进行时间倒序排序
     */
    @Override
    public String sort(Integer i) {
        try {
            con = DriudUtil.getConnection();

            String sql = "select *from Student order by StuUseTime desc ";
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            boolean r = rs.next();
            int count = 0;
            String[] nn=new String[15] ;
            while (r) {
                nn[count]=rs.getInt("stuNum") + "." + rs.getString("stuName") + "  " + rs.getString("stuPassword") + "  " + rs.getInt("stuScore") + "" + rs.getInt("StuUseTime") + "·";
                count++;
            }
            String str = "";
            for (int j = 0; j < count; j++) {
                str = str + nn[j];
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
