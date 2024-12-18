package X;

/* renamed from: X.L9k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47802L9k {
    public String A00 = null;
    public String A01 = null;
    public boolean A03 = false;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47802L9k) {
                C47802L9k c47802L9k = (C47802L9k) obj;
                if (!C14360o3.A0K(this.A00, c47802L9k.A00) || !C14360o3.A0K(this.A01, c47802L9k.A01) || this.A03 != c47802L9k.A03 || this.A02 != c47802L9k.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, ((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01)) * 31) + AbstractC53644Nnp.A00()) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetricProperties(openThreadId=");
        A1C.append(this.A00);
        A1C.append(", pushCategory=");
        A1C.append(this.A01);
        A1C.append(", messageMatched=");
        A1C.append(false);
        A1C.append(", missingMessageId=");
        A1C.append(this.A03);
        A1C.append(", isInstamadillo=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
