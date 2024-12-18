package X;

/* renamed from: X.IMh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41218IMh {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C41218IMh c41218IMh = (C41218IMh) obj;
            if (this.A00 != c41218IMh.A00 || !AbstractC50102Ry.A00(this.A01, c41218IMh.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(Integer.valueOf(this.A00), this.A01);
    }

    public C41218IMh(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }
}
