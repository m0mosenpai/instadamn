package com.instagram.archive.updateshub;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.BZn;
import X.Bf4;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5EF;
import X.VVV;

/* loaded from: classes5.dex */
public final class UserReelMerlinModifierElement extends C58N {
    public final Bf4 A00;
    public final Integer A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserReelMerlinModifierElement) {
                UserReelMerlinModifierElement userReelMerlinModifierElement = (UserReelMerlinModifierElement) obj;
                if (!C14360o3.A0K(this.A00, userReelMerlinModifierElement.A00) || this.A01 != userReelMerlinModifierElement.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C5EF(this.A00, this.A01);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5EF c5ef = (C5EF) c58j;
        C14360o3.A0B(c5ef, 0);
        Bf4 bf4 = this.A00;
        C14360o3.A0B(bf4, 0);
        c5ef.A00 = bf4;
        BZn bZn = c5ef.A02;
        String A00 = AbstractC111324zv.A00(5541);
        String str = bf4.A05;
        bZn.A0F(AnonymousClass001.A0R(A00, str), c5ef.A03, str);
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + VVV.A00(this.A01);
    }

    public UserReelMerlinModifierElement(Bf4 bf4, Integer num) {
        this.A00 = bf4;
        this.A01 = num;
    }
}
