package X;

/* renamed from: X.CVd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27981CVd {
    public final float A00;
    public final long A01;
    public final C5Y5 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27981CVd) {
                C27981CVd c27981CVd = (C27981CVd) obj;
                if (Float.compare(this.A00, c27981CVd.A00) == 0) {
                    long j = this.A01;
                    long j2 = c27981CVd.A01;
                    long j3 = C5AD.A01;
                    if (j != j2 || !C14360o3.A0K(this.A02, c27981CVd.A02)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A02 = AbstractC25235BEs.A02(this.A00);
        long j = this.A01;
        long j2 = C5AD.A01;
        return AbstractC166987dD.A0I(this.A02, AbstractC25236BEt.A01(j, A02));
    }

    public C27981CVd(C5Y5 c5y5, float f, long j) {
        this.A00 = f;
        this.A01 = j;
        this.A02 = c5y5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Scale(scale=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(3453));
        long j = this.A01;
        long j2 = C5AD.A01;
        A1C.append((Object) AnonymousClass001.A0K(AbstractC111324zv.A00(3785), ')', j));
        A1C.append(", animationSpec=");
        A1C.append(this.A02);
        A1C.append(')');
        return A1C.toString();
    }
}
