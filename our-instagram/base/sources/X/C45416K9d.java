package X;

/* renamed from: X.K9d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45416K9d extends AbstractC46377Kfz {
    public final boolean A00;
    public final String A01;

    public C45416K9d(boolean z, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = z;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45416K9d) {
                C45416K9d c45416K9d = (C45416K9d) obj;
                if (this.A00 != c45416K9d.A00 || !C14360o3.A0K(this.A01, c45416K9d.A01)) {
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
