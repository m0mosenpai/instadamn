package X;

/* renamed from: X.EbL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32755EbL extends FKR {
    public final GKP A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32755EbL) {
                C32755EbL c32755EbL = (C32755EbL) obj;
                if (!C14360o3.A0K(this.A01, c32755EbL.A01) || !C14360o3.A0K(this.A00, c32755EbL.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32755EbL(GKP gkp, String str) {
        super(C2EY.A0w, str);
        this.A01 = str;
        this.A00 = gkp;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
