package X;

/* renamed from: X.Krv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47100Krv {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.OUl] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2pS, java.lang.Object] */
    public static final C46088Kam A00(String str) {
        C14360o3.A0B(str, 0);
        C46088Kam c46088Kam = C46088Kam.A02;
        if (C14360o3.A0K(C46088Kam.A01, str) && c46088Kam != null) {
            return c46088Kam;
        }
        C46088Kam c46088Kam2 = new C46088Kam(new Object(), new Object(), str);
        C46088Kam.A02 = c46088Kam2;
        C46088Kam.A01 = str;
        return c46088Kam2;
    }
}
