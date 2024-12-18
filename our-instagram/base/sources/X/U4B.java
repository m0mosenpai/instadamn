package X;

/* loaded from: classes11.dex */
public abstract class U4B {
    public static final boolean A00(C102884kP c102884kP) {
        C102884kP A08;
        C14360o3.A0B(c102884kP, 0);
        C102884kP A082 = c102884kP.A08(132);
        if (A082 == null || A082.A05 != 13366 || (A08 = A082.A08(54)) == null) {
            return false;
        }
        boolean A0S = A08.A0S(35, false);
        String A0G = A08.A0G();
        if (A0G == null) {
            A0G = "start";
        }
        if (!A0S || !A0G.equals("start")) {
            return false;
        }
        return true;
    }
}
