package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* renamed from: X.Ggp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37594Ggp {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC43589JPu A03;
    public final C37546Gg2 A04;
    public final JI2 A05;
    public final C37560GgG A06;
    public final C37556GgC A07;

    public C37594Ggp(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, C37546Gg2 c37546Gg2, JI2 ji2, C37560GgG c37560GgG, C37556GgC c37556GgC) {
        AbstractC25234BEr.A0j(1, userSession, interfaceC60442pS, interfaceC43589JPu, c37560GgG);
        C14360o3.A0B(ji2, 8);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A02 = interfaceC60442pS;
        this.A03 = interfaceC43589JPu;
        this.A06 = c37560GgG;
        this.A04 = c37546Gg2;
        this.A07 = c37556GgC;
        this.A05 = ji2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC65577TnB interfaceC65577TnB, C2Fb c2Fb, SPM spm, C27845CPi c27845CPi, Boolean bool, String str, float f, float f2, boolean z, boolean z2, boolean z3) {
        C40971v4 A07;
        C40971v4 A072;
        ArrayList A3S;
        Product product;
        String str2;
        C46p Atz;
        C40971v4 A073;
        String str3;
        InterfaceC16820sZ interfaceC16820sZ;
        C2Fb c2Fb2 = c2Fb;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != 0) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                if (c120985dq.CdW()) {
                    A07 = c120985dq.A06();
                } else {
                    A07 = c120985dq.A07();
                    if (A07 == null) {
                        A07 = c38321qM;
                    }
                }
                UserSession userSession = this.A01;
                C5SE c5se = new C5SE(userSession, A07, c75113Zb.A06());
                c5se.A04 = c75113Zb.A1K;
                JI2 ji2 = this.A05;
                if (ji2.CT4(c120985dq, false) && (interfaceC16820sZ = ji2.As5().A02) != null) {
                    interfaceC16820sZ.invoke();
                }
                C06090Tz c06090Tz = C06090Tz.A06;
                if (C18U.A06(c06090Tz, userSession, 2342164546910889544L)) {
                    AbstractC59962oe abstractC59962oe = this.A00;
                    if (abstractC59962oe.getActivity() == null) {
                        if (c120985dq.CdW()) {
                            A073 = c120985dq.A06();
                        } else {
                            A073 = c120985dq.A07();
                            if (A073 == null) {
                                str3 = null;
                                C0f5 AEp = C18950wb.A01.AEp(String.valueOf(this), 817896246);
                                AEp.ABW("FragmentDetachedActivity", AbstractC167017dG.A0n(abstractC59962oe, "Could not get activity from fragment: ", AbstractC166987dD.A1C()));
                                AEp.ABW("UrlSource", String.valueOf(c2Fb2));
                                AEp.ABW("UserId", userSession.userId);
                                AEp.ABW("AdId", String.valueOf(str3));
                                AEp.ABW("FragmentState", String.valueOf(abstractC59962oe.mLifecycleRegistry.A07()));
                                AEp.report();
                                return;
                            }
                        }
                        str3 = A073.A0S;
                        C0f5 AEp2 = C18950wb.A01.AEp(String.valueOf(this), 817896246);
                        AEp2.ABW("FragmentDetachedActivity", AbstractC167017dG.A0n(abstractC59962oe, "Could not get activity from fragment: ", AbstractC166987dD.A1C()));
                        AEp2.ABW("UrlSource", String.valueOf(c2Fb2));
                        AEp2.ABW("UserId", userSession.userId);
                        AEp2.ABW("AdId", String.valueOf(str3));
                        AEp2.ABW("FragmentState", String.valueOf(abstractC59962oe.mLifecycleRegistry.A07()));
                        AEp2.report();
                        return;
                    }
                }
                AbstractC59962oe abstractC59962oe2 = this.A00;
                if (c2Fb == null) {
                    c2Fb2 = C2Fb.A0x;
                }
                InterfaceC60442pS interfaceC60442pS = this.A02;
                C37952Gmu c37952Gmu = new C37952Gmu(abstractC59962oe2, userSession, c5se, interfaceC60442pS, c2Fb2);
                if (c120985dq.CdW()) {
                    A072 = c120985dq.A06();
                } else {
                    A072 = c120985dq.A07();
                }
                if (A072 != null) {
                    c37952Gmu.A0O = A072;
                    c37952Gmu.A0J = c38321qM;
                    c37952Gmu.A0B = c75113Zb.getPosition();
                    c37952Gmu.A0K = c75113Zb;
                    InterfaceC43589JPu interfaceC43589JPu = this.A03;
                    c37952Gmu.A0i = interfaceC43589JPu.getSessionId();
                    c37952Gmu.A06 = f;
                    c37952Gmu.A07 = f2;
                    c37952Gmu.A0o = z;
                    c37952Gmu.A0p = z2;
                    c37952Gmu.A0r = z3;
                    if (c120985dq.A0F()) {
                        c37952Gmu.A09 = c75113Zb.A03;
                    }
                    IntentAwareAdsInfoIntf A00 = c120985dq.A00();
                    if (A00 != null) {
                        c37952Gmu.A0H = A00;
                        if (c120985dq.A0G()) {
                            Integer A0B = c120985dq.A0B();
                            if (A0B != null) {
                                c37952Gmu.A0Y = A0B;
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                    if (c120985dq.A06().A0t) {
                        c37952Gmu.A0I = ITO.A00(ji2.BmI(c120985dq));
                    }
                    String str4 = c37644Ghd.A05;
                    if (str4 != null) {
                        c37952Gmu.A0e = str4;
                        c37644Ghd.A05 = null;
                    }
                    C38321qM c38321qM2 = c120985dq.A02;
                    if (c38321qM2 != null && (Atz = c38321qM2.A0C.Atz()) != null && AbstractC166997dE.A1Z(Atz.BvZ(), true) && C18U.A06(C06090Tz.A05, userSession, 36321567759672946L)) {
                        FragmentActivity requireActivity = abstractC59962oe2.requireActivity();
                        String sessionId = interfaceC43589JPu.getSessionId();
                        C14360o3.A0B(sessionId, 6);
                        C38915HBm c38915HBm = new C38915HBm();
                        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                        A0y.A0g = requireActivity.getString(2131963747);
                        A0y.A0K = AbstractC37693GiU.A00(new ViewOnClickListenerC42018Ijn(c38915HBm, c120985dq, userSession, c5se, interfaceC60442pS, c75113Zb, sessionId, f, f2, z, z2), EnumC71343Hv.A0H, userSession, null);
                        A0y.A1J = true;
                        A0y.A0v = true;
                        AbstractC31173DnH.A0w(requireActivity, c38915HBm, A0y);
                        return;
                    }
                    if (z3) {
                        c37952Gmu.A0S = new C43031J0w(abstractC59962oe2.requireActivity(), c120985dq, userSession, c38321qM, c75113Zb, c27845CPi != null ? c27845CPi.A00 : null, spm, this.A04, this.A06, this.A07);
                        c37952Gmu.A0b = str;
                        c37952Gmu.A0T = spm;
                        c37952Gmu.A0R = interfaceC65577TnB;
                        c37952Gmu.A03 = (float) C18U.A00(c06090Tz, userSession, 37165962626466204L);
                        c37952Gmu.A0s = !C18U.A06(c06090Tz, userSession, 36321537696212543L);
                        c37952Gmu.A0t = true;
                        boolean A06 = C18U.A06(c06090Tz, userSession, 36321537695295031L);
                        if (A06 || C18U.A06(c06090Tz, userSession, 36321537695622713L)) {
                            c37952Gmu.A0Q = new J0Q(userSession);
                            if (A06) {
                                c37952Gmu.A0v = true;
                            }
                            if (C18U.A06(c06090Tz, userSession, 36321537695753787L)) {
                                c37952Gmu.A0u = true;
                                c37952Gmu.A02 = (float) C18U.A00(c06090Tz, userSession, 37165962625941915L);
                                int A074 = AbstractC25225BEi.A07(c06090Tz, userSession, 36603012673835892L);
                                int i = 4;
                                if (A074 != 3) {
                                    if (A074 != 4) {
                                        i = 2;
                                    }
                                } else {
                                    i = 3;
                                }
                                c37952Gmu.A08 = i;
                            } else {
                                c37952Gmu.A08 = 1;
                            }
                        }
                        if (C18U.A06(c06090Tz, userSession, 36321537695360568L)) {
                            c37952Gmu.A0U = new W4O(AbstractC13330mJ.A00(abstractC59962oe2.requireContext()), userSession);
                        }
                    }
                    if (z) {
                        if (C18U.A06(C06090Tz.A05, c37952Gmu.A11, 36328740355063553L) && c38321qM.A0C.BEO() != null) {
                            String BEO = c38321qM.A0C.BEO();
                            if (BEO != null) {
                                c37952Gmu.A0L = AbstractC114965Hm.A00(BEO);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                    if ((C59942oc.A04(c120985dq) || (AbstractC166997dE.A1Z(bool, true) && C59942oc.A05(c120985dq))) && (A3S = c38321qM.A3S(true)) != null && A3S.size() == 1 && (product = (Product) A3S.get(0)) != null && (str2 = product.A0F) != null) {
                        c37952Gmu.A0L = AbstractC114965Hm.A00(str2);
                    }
                    if (bool != null) {
                        c37952Gmu.A0m = bool.booleanValue();
                    }
                    C37953Gmv.A02(c37952Gmu);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
