package androidx.compose.foundation.layout;

import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.C25750BZp;
import X.C58J;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class OffsetPxElement extends C58N {
    public final InterfaceC16660sJ A00;
    public final boolean A01;
    public final InterfaceC16660sJ A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        return offsetPxElement != null && this.A00 == offsetPxElement.A00 && this.A01 == offsetPxElement.A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.BZp] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        boolean z = this.A01;
        ?? c58j = new C58J();
        c58j.A00 = interfaceC16660sJ;
        c58j.A01 = z;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25750BZp c25750BZp = (C25750BZp) c58j;
        c25750BZp.A00 = this.A00;
        c25750BZp.A01 = this.A01;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public OffsetPxElement(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        this.A00 = interfaceC16660sJ;
        this.A01 = z;
        this.A02 = interfaceC16660sJ2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OffsetPxModifier(offset=");
        A1C.append(this.A00);
        A1C.append(", rtlAware=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
