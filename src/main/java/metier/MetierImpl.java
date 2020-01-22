package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.IDao;
@Component("metier")
public class MetierImpl implements IMetier{
@Autowired
private IDao dao;

	public void setDao(IDao dao) {
	this.dao = dao;
}


	public double calcul() {
		double nb=dao.getValue();
		return nb*6;
	}

}
