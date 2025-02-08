package set;

import java.util.Objects;

public class StudentMarks {

    private int maths;
    private int physics;

   public StudentMarks (int maths,int physics){
    this.maths=maths;
    this.physics=physics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return maths == that.maths && physics == that.physics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maths, physics);
    }
}
