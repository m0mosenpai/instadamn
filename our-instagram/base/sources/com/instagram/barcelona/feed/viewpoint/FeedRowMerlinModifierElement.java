package com.instagram.barcelona.feed.viewpoint;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5EE;
import X.InterfaceC132245y2;
import X.VVV;

/* loaded from: classes5.dex */
public final class FeedRowMerlinModifierElement extends C58N {
    public final int A00;
    public final InterfaceC132245y2 A01;
    public final Integer A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedRowMerlinModifierElement) {
                FeedRowMerlinModifierElement feedRowMerlinModifierElement = (FeedRowMerlinModifierElement) obj;
                if (!C14360o3.A0K(this.A01, feedRowMerlinModifierElement.A01) || this.A00 != feedRowMerlinModifierElement.A00 || this.A02 != feedRowMerlinModifierElement.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C5EE(this.A01, this.A02, this.A00);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5EE c5ee = (C5EE) c58j;
        C14360o3.A0B(c5ee, 0);
        InterfaceC132245y2 interfaceC132245y2 = this.A01;
        int i = this.A00;
        Integer num = this.A02;
        AbstractC167007dF.A1D(interfaceC132245y2, 0, num);
        c5ee.A01 = interfaceC132245y2;
        c5ee.A00 = i;
        c5ee.A04.A0F(interfaceC132245y2.BKd(), num, interfaceC132245y2.Bet().A03);
    }

    @Override // X.C58N
    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + this.A00) * 31) + VVV.A00(this.A02);
    }

    public FeedRowMerlinModifierElement(InterfaceC132245y2 interfaceC132245y2, Integer num, int i) {
        this.A01 = interfaceC132245y2;
        this.A00 = i;
        this.A02 = num;
    }
}
