package com.instagram.feed.tifu.ui;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.C14360o3;
import X.C25747BZl;
import X.C58J;
import X.C58N;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;

/* loaded from: classes5.dex */
public final class VisibilityUpdateModifier extends C58N {
    public final Integer A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisibilityUpdateModifier) {
                VisibilityUpdateModifier visibilityUpdateModifier = (VisibilityUpdateModifier) obj;
                if (this.A00 != visibilityUpdateModifier.A00 || !C14360o3.A0K(this.A03, visibilityUpdateModifier.A03) || !C14360o3.A0K(this.A01, visibilityUpdateModifier.A01) || !C14360o3.A0K(this.A02, visibilityUpdateModifier.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C25747BZl(this.A00, this.A01, this.A02, this.A03);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25747BZl c25747BZl = (C25747BZl) c58j;
        C14360o3.A0B(c25747BZl, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        C14360o3.A0B(interfaceC16660sJ, 0);
        c25747BZl.A04 = interfaceC16660sJ;
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c25747BZl.A02 = interfaceC16820sZ;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A02;
        C14360o3.A0B(interfaceC16820sZ2, 0);
        c25747BZl.A03 = interfaceC16820sZ2;
        Integer num = this.A00;
        C14360o3.A0B(num, 0);
        c25747BZl.A01 = num;
    }

    @Override // X.C58N
    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "BOUNDS_IN_WINDOW";
        } else {
            str = "LOCAL_TO_WINDOW";
        }
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC25228BEl.A0F(str, intValue))));
    }

    public VisibilityUpdateModifier(Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = num;
        this.A03 = interfaceC16660sJ;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }
}
