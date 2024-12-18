package X;

/* loaded from: classes8.dex */
public final class KVL extends AbstractC46453KhD {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KVL) {
                KVL kvl = (KVL) obj;
                if (!C14360o3.A0K(this.A01, kvl.A01) || !C14360o3.A0K(this.A00, kvl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public KVL(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
