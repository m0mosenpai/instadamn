package X;

/* renamed from: X.95E, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C95E {
    public static final C95F A00;
    public static final C95F A01;
    public static final C95F A02;
    public static final C95F A03;
    public static final C95F A04;
    public static final C95F A05;
    public static final C95F A06;
    public static final C95F A07;
    public static final C95H A08;
    public static final C95H A09;
    public static final C95H A0A;
    public static final C95H A0B;
    public static final C95H A0C;
    public static final C95H A0D;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.95G, X.95H] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.95G, X.95F] */
    static {
        ?? c95g = new C95G();
        A04 = c95g;
        A03 = (C95F) c95g.A00("prefs/");
        A05 = (C95F) c95g.A00("settings/");
        A00 = (C95F) c95g.A00("config/");
        A06 = (C95F) c95g.A00("shared/");
        A07 = (C95F) c95g.A00("shortcut/");
        ?? c95g2 = new C95G();
        c95g2.A00 = false;
        A0B = c95g2;
        ?? c95g3 = new C95G(c95g2, "prefs/");
        c95g3.A00 = false;
        A0A = c95g3;
        boolean z = c95g2.A00;
        ?? c95g4 = new C95G(c95g2, "settings/");
        c95g4.A00 = z;
        A0C = c95g4;
        boolean z2 = c95g2.A00;
        ?? c95g5 = new C95G(c95g2, "config/");
        c95g5.A00 = z2;
        A09 = c95g5;
        boolean z3 = c95g2.A00;
        ?? c95g6 = new C95G(c95g2, "shared/");
        c95g6.A00 = z3;
        A0D = c95g6;
        A01 = (C95F) c95g.A00("dash/");
        A02 = (C95F) c95g.A00("fb_android/");
        boolean z4 = c95g2.A00;
        ?? c95g7 = new C95G(c95g2, "fb_android/");
        c95g7.A00 = z4;
        A08 = c95g7;
    }
}
