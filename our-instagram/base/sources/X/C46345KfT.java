package X;

/* renamed from: X.KfT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46345KfT extends Exception {
    public final EnumC72388XcO A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46345KfT) {
                C46345KfT c46345KfT = (C46345KfT) obj;
                if (!C14360o3.A0K(this.A01, c46345KfT.A01) || this.A00 != c46345KfT.A00 || !C14360o3.A0K(this.A02, c46345KfT.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C46345KfT(EnumC72388XcO enumC72388XcO, String str, String str2) {
        this.A01 = str;
        this.A00 = enumC72388XcO;
        this.A02 = str2;
    }
}
