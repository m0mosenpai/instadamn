package androidx.lifecycle;

import X.AbstractC09560e7;
import X.AbstractC23641Du;
import X.AnonymousClass131;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C05F;
import X.C0eB;
import X.C12P;
import X.C12T;
import X.C19L;
import X.C206639Cu;
import X.C58252li;
import X.C58262lj;
import X.C9CW;
import X.C9D3;
import X.InterfaceC23621Ds;

/* loaded from: classes2.dex */
public final class CoroutineLiveData extends C58252li {
    public C58262lj A00;

    public final C0eB A0F(InterfaceC23621Ds interfaceC23621Ds) {
        C9CW c9cw;
        int i;
        if (C9CW.A00(interfaceC23621Ds, 6)) {
            c9cw = (C9CW) interfaceC23621Ds;
            int i2 = c9cw.A00;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c9cw.A00 = i2 - Integer.MIN_VALUE;
                Object obj = c9cw.A02;
                i = c9cw.A00;
                if (i == 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
        }
        c9cw = new C9CW(this, interfaceC23621Ds, 6);
        Object obj2 = c9cw.A02;
        i = c9cw.A00;
        if (i == 0) {
        }
        AbstractC09560e7.A00(obj2);
        return C0eB.A00;
    }

    @Override // X.C58252li, X.C2GT
    public final void A03() {
        super.A03();
        C58262lj c58262lj = this.A00;
        if (c58262lj != null) {
            AnonymousClass195 anonymousClass195 = c58262lj.A00;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            c58262lj.A00 = null;
            if (c58262lj.A01 == null) {
                C19L c19l = c58262lj.A05;
                C9D3 c9d3 = new C9D3(c58262lj, null, 5);
                c58262lj.A01 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
            }
        }
    }

    @Override // X.C58252li, X.C2GT
    public final void A04() {
        super.A04();
        C58262lj c58262lj = this.A00;
        if (c58262lj != null) {
            if (c58262lj.A00 == null) {
                C19L c19l = c58262lj.A05;
                C12T c12t = C12P.A00;
                c58262lj.A00 = AbstractC23641Du.A03(C05F.A00, AnonymousClass131.A00.A06(), new C206639Cu(c58262lj, null, 2), c19l);
                return;
            }
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
    }
}
