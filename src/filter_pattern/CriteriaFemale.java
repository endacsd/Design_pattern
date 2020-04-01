package filter_pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons =new ArrayList<>();

        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("Female")){
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
