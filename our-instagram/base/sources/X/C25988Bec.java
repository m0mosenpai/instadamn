package X;

/* renamed from: X.Bec, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25988Bec extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C25988Bec(int i, int i2, String str, String str2) {
        C14360o3.A0B(str2, 4);
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25988Bec) {
                C25988Bec c25988Bec = (C25988Bec) obj;
                if (this.A01 != c25988Bec.A01 || this.A00 != c25988Bec.A00 || !C14360o3.A0K(this.A03, c25988Bec.A03) || !C14360o3.A0K(this.A02, c25988Bec.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A03, ((this.A01 * 31) + this.A00) * 31));
    }
}
