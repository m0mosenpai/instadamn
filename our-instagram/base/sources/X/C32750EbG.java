package X;

/* renamed from: X.EbG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32750EbG extends FKR {
    public final C148286ly A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32750EbG) {
                C32750EbG c32750EbG = (C32750EbG) obj;
                if (!C14360o3.A0K(this.A01, c32750EbG.A01) || !C14360o3.A0K(this.A00, c32750EbG.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32750EbG(C148286ly c148286ly, String str) {
        super(C2EY.A0O, str);
        this.A01 = str;
        this.A00 = c148286ly;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
