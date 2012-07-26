package school;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import school.classesofschool.ClassesOfSchoolMatcher;
import school.classesofteacher.ClassesOfTeacherMatcher;
import school.classesofteachernames.ClassesOfTeacherNamesMatcher;
import school.coursesofteacher.CoursesOfTeacherMatcher;
import school.coursesofteachernames.CoursesOfTeacherNamesMatcher;
import school.coursewithnamelongerthanweight.CourseWithNameLongerThanWeightMatcher;
import school.coursewithprimeweight.CourseWithPrimeWeightMatcher;
import school.coursewithweightthirty.CourseWithWeightThirtyMatcher;
import school.finalpattern.FinalPatternMatcher;
import school.friendlyto.FriendlyToMatcher;
import school.inthecircleoffriends.InTheCircleOfFriendsMatcher;
import school.morefriendsthan.MoreFriendsThanMatcher;
import school.schools.SchoolsMatcher;
import school.schoolsnames.SchoolsNamesMatcher;
import school.studentofschool.StudentOfSchoolMatcher;
import school.studentofschoolnames.StudentOfSchoolNamesMatcher;
import school.teachers.TeachersMatcher;
import school.teachersnames.TeachersNamesMatcher;
import school.teachersofschool.TeachersOfSchoolMatcher;
import school.teachersofschoolnames.TeachersOfSchoolNamesMatcher;
import school.teacherwithoutclass.TeacherWithoutClassMatcher;
import school.teachesmoreclasses.TeachesMoreClassesMatcher;
import school.teachesthemostcourses.TeachesTheMostCoursesMatcher;
import school.theoneswiththebiggestcircle.TheOnesWithTheBiggestCircleMatcher;

public final class GroupOfFileSchoolqueries extends BaseGeneratedPatternGroup {
  public GroupOfFileSchoolqueries() throws IncQueryException {
    matcherFactories.add(FriendlyToMatcher.factory());
    matcherFactories.add(TeachesTheMostCoursesMatcher.factory());
    matcherFactories.add(CoursesOfTeacherMatcher.factory());
    matcherFactories.add(ClassesOfSchoolMatcher.factory());
    matcherFactories.add(SchoolsMatcher.factory());
    matcherFactories.add(StudentOfSchoolMatcher.factory());
    matcherFactories.add(FinalPatternMatcher.factory());
    matcherFactories.add(TheOnesWithTheBiggestCircleMatcher.factory());
    matcherFactories.add(TeachersMatcher.factory());
    matcherFactories.add(TeachersOfSchoolMatcher.factory());
    matcherFactories.add(TeachersNamesMatcher.factory());
    matcherFactories.add(TeachersOfSchoolNamesMatcher.factory());
    matcherFactories.add(CourseWithWeightThirtyMatcher.factory());
    matcherFactories.add(MoreFriendsThanMatcher.factory());
    matcherFactories.add(InTheCircleOfFriendsMatcher.factory());
    matcherFactories.add(StudentOfSchoolNamesMatcher.factory());
    matcherFactories.add(TeacherWithoutClassMatcher.factory());
    matcherFactories.add(ClassesOfTeacherNamesMatcher.factory());
    matcherFactories.add(SchoolsNamesMatcher.factory());
    matcherFactories.add(CourseWithNameLongerThanWeightMatcher.factory());
    matcherFactories.add(CoursesOfTeacherNamesMatcher.factory());
    matcherFactories.add(TeachesMoreClassesMatcher.factory());
    matcherFactories.add(CourseWithPrimeWeightMatcher.factory());
    matcherFactories.add(ClassesOfTeacherMatcher.factory());
    
  }
}
