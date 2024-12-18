package X;

/* renamed from: X.SBv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62442SBv {
    public final String A00;

    public C62442SBv(String str, String str2) {
        int length = str.length();
        Object[] A1Z = AbstractC25228BEl.A1Z(str, 23);
        if (length <= 23) {
            this.A00 = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw AbstractC58319PtB.A0j("tag \"%s\" is longer than the %d character maximum", A1Z);
    }
}
