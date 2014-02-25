package de.vogella.mysql.first;

import de.vogella.mysql.first.MySqlAcces;

public class main {
  public static void main(String[] args) throws Exception {
	  MySqlAcces dao = new MySqlAcces();
    dao.readDataBase();
  }


} 