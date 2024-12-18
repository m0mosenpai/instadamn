package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WmU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71013WmU implements XDu {
    public boolean A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final List A06;
    public final boolean A07;

    @Override // X.XDu
    public final /* synthetic */ C65956Tx8 E4l(String str, List list) {
        return VWU.A00(this, str);
    }

    @Override // X.XDu
    public final void DjE(C51621MrE c51621MrE) {
        this.A00 = c51621MrE.A02;
    }

    public C71013WmU(UserSession userSession, List list, boolean z, boolean z2) {
        boolean z3;
        AbstractC167017dG.A1P(userSession, list);
        this.A06 = list;
        this.A07 = z;
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C50168MDv(42, userSession, z2));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(userSession, 7));
        EnumC09460dv enumC09460dv2 = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv2, new C57239PbN(userSession, 8));
        this.A04 = AbstractC09440dt.A00(enumC09460dv2, new C57239PbN(userSession, 10));
        this.A03 = AbstractC09440dt.A00(enumC09460dv2, new C57239PbN(userSession, 9));
        if (!AbstractC31178DnM.A1a(this.A04) && (C2TN.A00(userSession) || !AbstractC167007dF.A1Z(this.A03))) {
            z3 = MZJ.A05.A00(userSession).A00();
        } else {
            z3 = false;
        }
        this.A00 = z3;
    }

    private final ArrayList A00(List list) {
        ArrayList A0U = AbstractC001800i.A0U(list);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) it.next();
            if (OQD.A01(abstractC65924TwV.A01(), this.A06)) {
                it.remove();
            }
        }
        return A0U;
    }

    @Override // X.XDu
    public final C65956Tx8 E4m() {
        return U24.A00();
    }

    @Override // X.XDu
    public final C65956Tx8 E4n(String str, String str2, List list, List list2) {
        boolean A1b = AbstractC25233BEq.A1b(str, list, list2);
        boolean z = this.A07;
        C65965TxI c65965TxI = new C65965TxI(z, A1b, this.A00);
        C66155U1w c66155U1w = (C66155U1w) this.A05.getValue();
        if (c66155U1w != null) {
            c65965TxI.A05(A00(c66155U1w.A00(str)), str2);
        }
        if (!z) {
            InterfaceC09390do interfaceC09390do = this.A01;
            if (((AbstractC65924TwV) interfaceC09390do.getValue()).A05(str)) {
                if (!OQD.A01(((AbstractC65924TwV) interfaceC09390do.getValue()).A01(), this.A06)) {
                    Object value = interfaceC09390do.getValue();
                    C65954Twz c65954Twz = new C65954Twz();
                    c65954Twz.A09 = "client_side_matching";
                    c65954Twz.A05 = "server_results";
                    c65965TxI.A02(c65954Twz, value);
                }
            }
        }
        if (AbstractC31178DnM.A1a(this.A02)) {
            c65965TxI.A06(A00(list2), str2);
        }
        c65965TxI.A07(A00(list), str2);
        return c65965TxI.A00();
    }
}
