package X;

/* loaded from: classes8.dex */
public final class KNO extends L8Z {
    public final int A00;
    public final String A01;

    public KNO(int i, String str) {
        super(i, null);
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KNO) {
                KNO kno = (KNO) obj;
                if (this.A00 != kno.A00 || !C14360o3.A0K(this.A01, kno.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
    }
}
