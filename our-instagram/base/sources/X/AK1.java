package X;

/* loaded from: classes4.dex */
public abstract class AK1 {
    public static final C95F A00;
    public static final C95F A01;
    public static final C95F A02;

    static {
        C95F c95f = (C95F) C95E.A00.A00("offlineexperiment/");
        A01 = c95f;
        A02 = (C95F) c95f.A00("values/");
        A00 = (C95F) c95f.A00("exposed/");
    }

    public static final String A00(String str) {
        String A012 = A02.A00(AnonymousClass001.A0C(str, '/')).A00("fdid/").A00("last_expose_time").A01();
        C14360o3.A07(A012);
        return A012;
    }

    public static final String A01(String str) {
        String A012 = A02.A00(AnonymousClass001.A0C(str, '/')).A00("fdid/").A00("unit_segment").A01();
        C14360o3.A07(A012);
        return A012;
    }
}
