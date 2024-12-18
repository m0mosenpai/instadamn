package X;

/* renamed from: X.K9r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45430K9r extends AbstractC46379Kg1 {
    public final boolean A00;
    public final String A01;

    public C45430K9r(boolean z, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = z;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45430K9r) {
                C45430K9r c45430K9r = (C45430K9r) obj;
                if (this.A00 != c45430K9r.A00 || !C14360o3.A0K(this.A01, c45430K9r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC25225BEi.A08(this.A00));
    }
}
