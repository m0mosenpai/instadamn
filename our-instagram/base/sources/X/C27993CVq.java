package X;

/* renamed from: X.CVq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27993CVq {
    public final int A00;
    public final int A01;
    public final String A02;

    public C27993CVq(int i, int i2, String str) {
        C14360o3.A0B(str, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27993CVq) {
                C27993CVq c27993CVq = (C27993CVq) obj;
                if (this.A01 != c27993CVq.A01 || this.A00 != c27993CVq.A00 || !C14360o3.A0K(this.A02, c27993CVq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Mention(startIndex=");
        A1C.append(this.A01);
        A1C.append(", endIndex=");
        A1C.append(this.A00);
        A1C.append(", name=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
