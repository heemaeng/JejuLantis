package com.khd.jejulantis.admin.run.DAO;

import java.util.List;

import com.khd.jejulantis.model.Admin;
import com.khd.jejulantis.model.Manager;

public interface RunDao {

	List<Admin> adminList(String manager_id);

	List<Admin> adminList();

	void adminApproveDelete(long manager_no);

	List<Admin> adminApproveContent(long manager_no);

	void adminApproveUpdate(Admin admin);

}
