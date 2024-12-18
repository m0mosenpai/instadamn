package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bwy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27074Bwy extends C3PD {
    public final int A00;
    public final Object A01;

    public C27074Bwy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    ((C25865BcK) ((C214729fA) this.A01).A0A.getValue()).A01(C29224CuT.A00);
                    return true;
                }
                return false;
            case 1:
                C26834Bsw c26834Bsw = (C26834Bsw) this.A01;
                InterfaceC09390do interfaceC09390do = c26834Bsw.A0I;
                AbstractC208329Jr.A05(c26834Bsw, AbstractC166987dD.A0r(interfaceC09390do));
                C63397SjR A0y = AbstractC25228BEl.A0y(c26834Bsw.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), C2Fb.A1W, C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36882872740676053L));
                A0y.A0S = "horizon_worlds_pivot_page";
                A0y.A0A();
                return true;
            case 2:
                C14360o3.A0B(view, 0);
                C37855Gl9 c37855Gl9 = C37855Gl9.A00;
                C26833Bsv c26833Bsv = (C26833Bsv) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26833Bsv.A0G);
                C38321qM c38321qM = c26833Bsv.A06;
                if (c38321qM == null) {
                    str = "media";
                } else {
                    C211729Zg c211729Zg = c26833Bsv.A03;
                    if (c211729Zg == null) {
                        str = "arguments";
                    } else {
                        c37855Gl9.A0I(c26833Bsv, c26833Bsv.requireActivity(), C22P.A1O, c26833Bsv, A0r, c38321qM, Integer.valueOf(c211729Zg.A01), null);
                        return true;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                C26832Bsu c26832Bsu = (C26832Bsu) this.A01;
                C38321qM c38321qM2 = c26832Bsu.A01;
                if (c38321qM2 == null) {
                    return true;
                }
                AbstractC40927IAz.A00(c26832Bsu.requireActivity(), c26832Bsu, C22P.A1X, null, AbstractC166987dD.A0r(c26832Bsu.A06), c38321qM2, null, true);
                return true;
            case 4:
                C14360o3.A0B(view, 0);
                AbstractC25225BEi.A1U(((C51759Mti) this.A01).A00, view);
                return true;
            default:
                C14360o3.A0B(view, 0);
                C26583Bog c26583Bog = (C26583Bog) this.A01;
                if (C76493bt.A07(c26583Bog.A02, c26583Bog.A03)) {
                    C26583Bog.A04(view, c26583Bog.A08, c26583Bog, "center_profile_icon", null);
                    return true;
                }
                return false;
        }
    }
}
