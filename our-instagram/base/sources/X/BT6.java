package X;

/* loaded from: classes5.dex */
public final class BT6 extends C0T6 implements InterfaceC30863Dhc {
    public final boolean A00;
    public final C120985dq A01;
    public final C37644Ghd A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BT6) {
                BT6 bt6 = (BT6) obj;
                if (!C14360o3.A0K(this.A01, bt6.A01) || !C14360o3.A0K(this.A02, bt6.A02) || this.A00 != bt6.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    public BT6(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A00 = z;
    }
}
