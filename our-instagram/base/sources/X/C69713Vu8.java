package X;

/* renamed from: X.Vu8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69713Vu8 {
    public String A05 = null;
    public String A04 = null;
    public String A03 = null;
    public long A00 = 0;
    public C68826Vch A02 = null;
    public C68825Vcg A01 = null;
    public String A06 = AbstractC166997dE.A0n();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69713Vu8 c69713Vu8 = (C69713Vu8) obj;
            if (!AbstractC50102Ry.A00(this.A05, c69713Vu8.A05) || !AbstractC50102Ry.A00(this.A06, c69713Vu8.A06)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A05, this.A06);
    }
}
