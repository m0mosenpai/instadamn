package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wjo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70895Wjo implements InterfaceC71925XAj {
    public final int A00;
    public final Object A01;

    public C70895Wjo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71925XAj
    public final void DcU() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                V1R v1r = (V1R) this.A01;
                W4b w4b = v1r.A0I;
                String str = "feedRequestController";
                if (w4b != null) {
                    if (AbstractC37303Gc4.A1a(W4b.A00(w4b.A00, w4b).A02)) {
                        return;
                    }
                    W4b w4b2 = v1r.A0I;
                    if (w4b2 != null) {
                        if (W4b.A00(w4b2.A00, w4b2).A02.A03.A03 == C05F.A01) {
                            Context requireContext = v1r.requireContext();
                            UserSession A00 = V1R.A00(v1r);
                            C19280xC A002 = C19280xC.A00(v1r, AbstractC111324zv.A00(3833));
                            C150856qj.A03(requireContext, A002);
                            WE1.A01(A002, A00);
                            AbstractC31173DnH.A1S(A002, A00);
                        }
                        WG5 wg5 = v1r.A0c;
                        C68034V7f c68034V7f = v1r.A08;
                        if (c68034V7f == null) {
                            str = "dataSource";
                        } else {
                            String obj = c68034V7f.A00.toString();
                            C14360o3.A0B(obj, 0);
                            WG5.A03(wg5, obj, 20643842);
                            V1R.A08(v1r, v1r.A0O, 20643842, true, true);
                            V1R.A06(v1r, -1);
                            C64842wi c64842wi = v1r.A0L;
                            if (c64842wi == null) {
                                str = "quickPromotionDelegate";
                            } else {
                                c64842wi.DiZ();
                                C69359Vm5 c69359Vm5 = v1r.A0J;
                                if (c69359Vm5 == null) {
                                    str = "viewpointHelper";
                                } else {
                                    c69359Vm5.A03.A01.clear();
                                    c69359Vm5.A04.A00.clear();
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                V1B v1b = (V1B) this.A01;
                v1b.A0D.A01(v1b.A07.A00, true, true);
                return;
        }
    }
}
