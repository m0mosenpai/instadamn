package X;

/* renamed from: X.VxF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69888VxF {
    public static final String A01(String str) {
        C14360o3.A0B(str, 0);
        String str2 = (String) AbstractC167007dF.A0m(str, "_", 0).get(0);
        if (AbstractC001900j.A0a(str2, ".", false)) {
            return (String) AbstractC167007dF.A0m(str2, "\\.", 0).get(1);
        }
        return str2;
    }

    public static final C1Y6 A00() {
        C1Y6 c1y6 = C1Y6.A01;
        if (c1y6 != null) {
            return c1y6;
        }
        C14360o3.A0F("instance");
        throw C00O.createAndThrow();
    }
}
