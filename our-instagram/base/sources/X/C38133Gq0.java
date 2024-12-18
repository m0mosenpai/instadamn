package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.Gq0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38133Gq0 extends AbstractC64292vo {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        InterfaceC127975qQ interfaceC127975qQ;
        C38321qM BQN;
        String id;
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) obj;
        if ((interfaceC127955qO instanceof InterfaceC127975qQ) && (BQN = (interfaceC127975qQ = (InterfaceC127975qQ) interfaceC127955qO).BQN()) != null && (id = BQN.getId()) != null) {
            C115785Lr c115785Lr = (C115785Lr) C115775Lq.A02.get(id);
            if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
                if (c115785Lr != null && AbstractC31171DnF.A1b(c115785Lr.A01)) {
                    C14360o3.A0B(interfaceC127955qO, 0);
                    LinkedHashMap A02 = AbstractC77703du.A02(id);
                    C38321qM BQN2 = interfaceC127975qQ.BQN();
                    if ((!A02.isEmpty()) && BQN2 != null) {
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_rendering_validation_automatic");
                        if (A0f.isSampled()) {
                            UserSession userSession = this.A01;
                            String A07 = AbstractC41071vF.A07(userSession, BQN2);
                            C115775Lq c115775Lq = C115775Lq.A00;
                            ArrayList A022 = C115775Lq.A02(id);
                            ArrayList A072 = c115775Lq.A07(id);
                            C0Zx c0Zx = new C0Zx();
                            if (A072 != null && !A072.isEmpty()) {
                                c0Zx.A07(AbstractC111324zv.A00(4094), A022);
                                c0Zx.A07(AbstractC111324zv.A00(5303), A072);
                                c0Zx.A04("dwell_time", C115775Lq.A01(id));
                            }
                            C138406Ow A00 = C115775Lq.A00(id);
                            String str = "";
                            if (A07 == null) {
                                A07 = "";
                            }
                            A0f.AAP("ad_id", A07);
                            A0f.AAP("a_pk", userSession.userId);
                            AbstractC37300Gc1.A0l(A0f, id);
                            String A0F = AbstractC41071vF.A0F(userSession, BQN2);
                            if (A0F != null) {
                                str = A0F;
                            }
                            AbstractC37300Gc1.A0o(A0f, str);
                            A0f.AAP("source_of_action", this.A02.getModuleName());
                            A0f.AAP("fb_locale", C1Q2.A00());
                            A0f.AAP("country", C1Q2.A02().getCountry());
                            A0f.AAP("media_type", BQN2.BRp().name());
                            A0f.A9M("pc_component_dict_new", A02);
                            AbstractC37303Gc4.A0b(A0f);
                            A0f.AAQ(c0Zx, AbstractC111324zv.A00(4199));
                            A0f.AAQ(A00, "layout_info");
                            A0f.Cht();
                        }
                    }
                }
                C115775Lq.A03(id);
                return;
            }
            A02(c59062n7, interfaceC57162jr, id, false);
        }
    }

    public C38133Gq0(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(userSession);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
    }
}
