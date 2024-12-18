package X;

/* loaded from: classes12.dex */
public abstract class XOv {
    public static C72126XOy A00(YNC ync) {
        C72123XOu c72123XOu = new C72123XOu();
        C72126XOy c72126XOy = new C72126XOy(c72123XOu);
        c72123XOu.A00 = c72126XOy;
        c72123XOu.A02 = ync.getClass();
        try {
            c72123XOu.A02 = ync.ACy(c72123XOu);
            return c72126XOy;
        } catch (Exception e) {
            c72126XOy.A00.A07(e);
            return c72126XOy;
        }
    }
}
