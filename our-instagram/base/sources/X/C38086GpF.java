package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.GpF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38086GpF extends AbstractC38087GpG implements JPS {
    public final UserSession A00;
    public final C38088GpH A01;
    public final InterfaceC65952yX A02;
    public final C1571273r A03;
    public final InterfaceC62602sz A04;
    public final Map A05;
    public final InterfaceC43405JFv A06;

    public C38086GpF(UserSession userSession, InterfaceC43405JFv interfaceC43405JFv, InterfaceC65952yX interfaceC65952yX, C1571273r c1571273r, InterfaceC62602sz interfaceC62602sz, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25233BEq.A0w(1, userSession, interfaceC43405JFv, interfaceC62602sz);
        this.A00 = userSession;
        this.A02 = interfaceC65952yX;
        this.A06 = interfaceC43405JFv;
        this.A04 = interfaceC62602sz;
        this.A03 = c1571273r;
        this.A01 = new C38088GpH(interfaceC16660sJ, userSession);
        this.A05 = AbstractC166987dD.A1I();
    }

    public final void A07(String str, List list) {
        Long A0k;
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            Class<?> cls = null;
            if (!(obj instanceof C128005qU)) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(AbstractC111324zv.A00(340));
                if (obj != null) {
                    cls = obj.getClass();
                }
                throw AbstractC166987dD.A14(AbstractC166997dE.A0v(cls, A1C));
            }
            for (InterfaceC127955qO interfaceC127955qO : ((C128005qU) obj).A02) {
                if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null && (interfaceC127955qO instanceof InterfaceC127985qR)) {
                    InterfaceC127985qR interfaceC127985qR = (InterfaceC127985qR) interfaceC127955qO;
                    if (interfaceC127985qR.Bb4() == -1) {
                        interfaceC127985qR.EaT(A0k.longValue());
                    }
                }
            }
            A12.add(obj);
        }
        ArrayList A06 = this.A01.A06(this.A02, A12);
        if (AbstractC25226BEj.A1b(A06)) {
            this.A06.DCe(A06, str);
        }
        A03();
    }

    @Override // X.XLO
    public final void EWn(C07X c07x, MTQ mtq) {
        C14360o3.A0B(mtq, 0);
        super.A00.add(new C38121Gpo(this, mtq));
    }

    public final void A05() {
        C38088GpH c38088GpH = this.A01;
        c38088GpH.A03.clear();
        c38088GpH.A05.clear();
        C38088GpH.A00(c38088GpH);
        this.A05.clear();
        A03();
    }

    public final void A06(String str, Object obj, int i) {
        if (obj instanceof C128005qU) {
            C38088GpH c38088GpH = this.A01;
            C128005qU c128005qU = (C128005qU) obj;
            InterfaceC65952yX interfaceC65952yX = this.A02;
            AbstractC167017dG.A1P(c128005qU, interfaceC65952yX);
            ArrayList A1E = AbstractC166987dD.A1E();
            LinkedHashSet A0l = AbstractC31171DnF.A0l();
            if (C38088GpH.A02(c38088GpH, c128005qU, interfaceC65952yX, A0l, i)) {
                c38088GpH.A03.add(i, c128005qU);
                c38088GpH.A05.addAll(A0l);
            } else {
                C38088GpH.A01(c128005qU, A1E);
            }
            C38088GpH.A00(c38088GpH);
            if (AbstractC25226BEj.A1b(A1E)) {
                this.A06.DCe(A1E, str);
            }
            A03();
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC111324zv.A00(340));
        throw AbstractC166987dD.A14(AbstractC166997dE.A0v(obj.getClass(), A1C));
    }

    @Override // X.InterfaceC43401JFq
    public final /* bridge */ /* synthetic */ C5qT BAL(InterfaceC66482zP interfaceC66482zP) {
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) interfaceC66482zP;
        C14360o3.A0B(abstractC127945qN, 0);
        return this.A01.A03(abstractC127945qN);
    }

    @Override // X.InterfaceC57967PnD
    public final /* bridge */ /* synthetic */ C5qT BAM(Object obj) {
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        C14360o3.A0B(abstractC127945qN, 0);
        return this.A01.A03(abstractC127945qN);
    }
}
