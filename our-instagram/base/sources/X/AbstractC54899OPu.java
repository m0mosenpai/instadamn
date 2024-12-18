package X;

/* renamed from: X.OPu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54899OPu {
    public static final C51905Mwn A00() {
        C16930sl c16930sl = C16930sl.A00;
        return new C51905Mwn(null, null, c16930sl, c16930sl, AbstractC06930Yk.A0E(), 0, 0, 0, false, false, false, false, false, true, false, false, false);
    }

    public static final String A01(C51876MwK c51876MwK, String str, String str2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c51876MwK.A03);
        if (!c51876MwK.A04) {
            A1C.append(" ");
            A1C.append(str);
        }
        if (!c51876MwK.A07 && !c51876MwK.A06) {
            A1C.append(" ");
            A1C.append(str2);
        }
        return AbstractC166987dD.A19(A1C);
    }
}
