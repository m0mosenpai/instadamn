package X;

/* renamed from: X.Bhp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26164Bhp extends C0T6 implements InterfaceC166367c5 {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26164Bhp) {
                C26164Bhp c26164Bhp = (C26164Bhp) obj;
                if (this.A00 != c26164Bhp.A00 || this.A01 != c26164Bhp.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25225BEi.A08(this.A00));
    }

    public C26164Bhp(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
