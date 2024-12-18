package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
public final class LRT implements C03L {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LRT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        Float f;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c011504d, 1);
                if (c011504d.A00.A0I(8)) {
                    InterfaceC24901Jp interfaceC24901Jp = (InterfaceC24901Jp) this.A01;
                    if (interfaceC24901Jp.isActive()) {
                        interfaceC24901Jp.resumeWith(null);
                        AbstractC008903d.A00((View) this.A02, null);
                    }
                }
                return C011504d.A01;
            case 1:
                C14360o3.A0B(c011504d, 1);
                if (!c011504d.A00.A0I(8)) {
                    CRR crr = ((CTu) this.A01).A00;
                    if (!crr.A00) {
                        crr.A01.Egh(EnumC27367C5w.A02);
                        crr.A00 = true;
                    }
                    AbstractC008903d.A00((View) this.A02, null);
                    return c011504d;
                }
                return c011504d;
            case 2:
                C48259LXi c48259LXi = (C48259LXi) this.A01;
                Context context = (Context) this.A02;
                c48259LXi.A04 = c011504d.A03();
                C47988LJq c47988LJq = c48259LXi.A0F;
                if (c47988LJq != null) {
                    if (c48259LXi.A0S.A0W) {
                        f = Float.valueOf(C48259LXi.A01(context.getResources(), c48259LXi));
                    } else {
                        f = null;
                    }
                    c47988LJq.A04(f, C48259LXi.A00(context, c48259LXi));
                }
                return AbstractC010103p.A05(view, c011504d);
            case 3:
                C14360o3.A0B(c011504d, 1);
                C02I A05 = c011504d.A00.A05(7);
                C14360o3.A07(A05);
                View view2 = (View) this.A01;
                AbstractC13880nE.A0f(view2, A05.A03);
                int i = A05.A00;
                AbstractC13880nE.A0U(view2, i);
                ((EKZ) this.A02).A00 = i;
                return c011504d;
            default:
                C14360o3.A0B(c011504d, 1);
                C02I A052 = c011504d.A00.A05(7);
                C14360o3.A07(A052);
                View view3 = (View) this.A01;
                AbstractC13880nE.A0f(view3, A052.A03);
                int i2 = A052.A00;
                AbstractC13880nE.A0U(view3, i2);
                ((C32246EIf) this.A02).A00 = i2;
                return c011504d;
        }
    }
}
