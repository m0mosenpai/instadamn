package X;

/* renamed from: X.JwC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45021JwC extends C0T6 {
    public final C47315KvQ A00;
    public final C47316KvR A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45021JwC) {
                C45021JwC c45021JwC = (C45021JwC) obj;
                if (!C14360o3.A0K(this.A01, c45021JwC.A01) || !C14360o3.A0K(this.A00, c45021JwC.A00) || !C14360o3.A0K(this.A02, c45021JwC.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public C45021JwC(C47315KvQ c47315KvQ, C47316KvR c47316KvR, String str) {
        AbstractC167027dH.A13(c47316KvR, c47315KvQ, str);
        this.A01 = c47316KvR;
        this.A00 = c47315KvQ;
        this.A02 = str;
    }
}
