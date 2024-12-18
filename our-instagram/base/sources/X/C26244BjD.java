package X;

/* renamed from: X.BjD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26244BjD extends C0T6 implements InterfaceC30860DhZ {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26244BjD) {
                C26244BjD c26244BjD = (C26244BjD) obj;
                if (!C14360o3.A0K(this.A00, c26244BjD.A00) || !C14360o3.A0K(this.A01, c26244BjD.A01) || this.A03 != c26244BjD.A03 || this.A02 != c26244BjD.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00))));
    }

    public C26244BjD(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z, boolean z2) {
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A03 = z;
        this.A02 = z2;
    }
}
