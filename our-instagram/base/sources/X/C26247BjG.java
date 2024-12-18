package X;

/* renamed from: X.BjG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26247BjG extends C0T6 implements InterfaceC30876Dhp {
    public final C51759Mti A00;
    public final C26051Bfe A01;
    public final C51750MtZ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26247BjG) {
                C26247BjG c26247BjG = (C26247BjG) obj;
                if (!C14360o3.A0K(this.A02, c26247BjG.A02) || !C14360o3.A0K(this.A00, c26247BjG.A00) || !C14360o3.A0K(this.A01, c26247BjG.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02)));
    }

    public C26247BjG(C51750MtZ c51750MtZ, C51759Mti c51759Mti, C26051Bfe c26051Bfe) {
        this.A02 = c51750MtZ;
        this.A00 = c51759Mti;
        this.A01 = c26051Bfe;
    }
}
