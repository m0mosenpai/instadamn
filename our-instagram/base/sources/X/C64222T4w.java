package X;

@Deprecated
/* renamed from: X.T4w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64222T4w implements C61X {
    public static final C64222T4w A02 = new C64222T4w(null, AbstractC166997dE.A0a());
    public final String A00;
    public final boolean A01;

    public C64222T4w(String str, Boolean bool) {
        this.A01 = bool.booleanValue();
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C64222T4w) {
                C64222T4w c64222T4w = (C64222T4w) obj;
                if (this.A01 != c64222T4w.A01 || !SSI.A01(this.A00, c64222T4w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(null, Boolean.valueOf(this.A01), this.A00);
    }
}
