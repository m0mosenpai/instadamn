package com.instagram.zero.dogfooding;

import X.AbstractC12990ll;
import X.AbstractC19750y3;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C12P;
import X.C14360o3;
import X.C18U;
import X.C19K;
import X.C1R3;
import X.C1R4;
import X.C206649Cv;
import X.C29892DGg;
import X.C3Q1;
import X.InterfaceC13000lm;

/* loaded from: classes4.dex */
public final class IgZeroDogfoodingInit implements InterfaceC13000lm {
    public final AbstractC12990ll A00;
    public final AnonymousClass195 A01;

    public IgZeroDogfoodingInit(AbstractC12990ll abstractC12990ll) {
        Object value;
        boolean z;
        Object value2;
        Object value3;
        C1R4 A02;
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
        boolean z2 = AbstractC19750y3.A01("ig_zero_dogfooding_device").getBoolean("manually_changed", false);
        C05A c05a = C1R3.A03.A01;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C1R4.A02((C1R4) value, null, null, 0, 0, 1791, 0L, 0L, false, false, false, false, z2)));
        if (z2) {
            boolean z3 = AbstractC19750y3.A01("ig_zero_dogfooding_device").getBoolean("enabled", false);
            do {
                value3 = c05a.getValue();
                A02 = C1R4.A02((C1R4) value3, null, null, 0, 0, 2046, 0L, 0L, z3, false, false, false, false);
            } while (!c05a.AIi(value3, A02));
        } else {
            AbstractC12990ll abstractC12990ll2 = this.A00;
            if (C3Q1.A00 != null) {
                z = C18U.A06(C06090Tz.A05, abstractC12990ll2, 36328156239707401L);
            } else {
                z = false;
            }
            do {
                value2 = c05a.getValue();
            } while (!c05a.AIi(value2, C1R4.A02((C1R4) value2, null, null, 0, 0, 2046, 0L, 0L, z, false, false, false, false)));
        }
        C19K A022 = AnonymousClass194.A02(C12P.A02);
        C206649Cv c206649Cv = new C206649Cv(this, null, 48);
        this.A01 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A022);
    }

    public static final IgZeroDogfoodingInit getInstance(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return (IgZeroDogfoodingInit) abstractC12990ll.A01(IgZeroDogfoodingInit.class, new C29892DGg(abstractC12990ll, 24));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.AGH(null);
    }
}
