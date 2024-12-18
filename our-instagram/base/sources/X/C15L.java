package X;

/* renamed from: X.15L, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15L {
    public static C15N A00;
    public static C15M A01;
    public static C15N A02;

    static {
        C15M c15m = new C15M("com.samsung.android.os.SemPerfManager");
        A01 = c15m;
        Class cls = Boolean.TYPE;
        A02 = c15m.A02("onScrollEvent", cls);
        A00 = A01.A03("onSmoothScrollEvent", cls);
    }
}
