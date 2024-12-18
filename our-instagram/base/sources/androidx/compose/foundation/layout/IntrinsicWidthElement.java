package androidx.compose.foundation.layout;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.C25739BZa;
import X.C58J;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class IntrinsicWidthElement extends C58N {
    public final Integer A00;
    public final boolean A01 = true;
    public final InterfaceC16660sJ A02;

    public IntrinsicWidthElement(Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = num;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        return intrinsicWidthElement != null && this.A00 == intrinsicWidthElement.A00 && this.A01 == intrinsicWidthElement.A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.BZa] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        Integer num = this.A00;
        boolean z = this.A01;
        ?? c58j = new C58J();
        c58j.A00 = num;
        c58j.A01 = z;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25739BZa c25739BZa = (C25739BZa) c58j;
        c25739BZa.A00 = this.A00;
        c25739BZa.A01 = this.A01;
    }

    @Override // X.C58N
    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "Min";
        } else {
            str = "Max";
        }
        return AbstractC166987dD.A0K(this.A01, AbstractC25228BEl.A0F(str, intValue));
    }
}
