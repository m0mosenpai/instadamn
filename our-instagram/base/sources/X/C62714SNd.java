package X;

/* renamed from: X.SNd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62714SNd {
    public final String A00;
    public final String A01;

    public C62714SNd(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62714SNd) {
                C62714SNd c62714SNd = (C62714SNd) obj;
                if (!C14360o3.A0K(this.A00, c62714SNd.A00) || !C14360o3.A0K(this.A01, c62714SNd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01);
    }
}
