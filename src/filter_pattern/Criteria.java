package filter_pattern;


import  java.util.List;
public interface Criteria {
    List<Person> meetCriteria(List<Person> person);
}
