package X;

/* loaded from: classes8.dex */
public final class K2M extends C0T6 implements MSK, MNK {
    public final C51761Mtk A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2M) {
                K2M k2m = (K2M) obj;
                if (!C14360o3.A0K(this.A00, k2m.A00) || !C14360o3.A0K(this.A01, k2m.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.MSK
    public final String AYy() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public K2M(C51761Mtk c51761Mtk, String str) {
        this.A00 = c51761Mtk;
        this.A01 = str;
    }

    public K2M() {
        this(null, null);
    }
}
