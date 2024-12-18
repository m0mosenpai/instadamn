package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PH0 implements InterfaceC57997Pnh {
    public final int A00;
    public final Object A01;

    public PH0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        AbstractC54847OMw n1n;
        String str;
        Long l;
        AbstractC53637Nni abstractC53637Nni;
        EnumC50631MWs enumC50631MWs;
        EnumC53335Nil enumC53335Nil;
        N13 n13;
        N10 n10;
        int i = this.A00;
        C14360o3.A0B(c54845OMq, 0);
        switch (i) {
            case 0:
                C8JN c8jn = (C8JN) this.A01;
                UserSession userSession = c8jn.A08;
                boolean A0Y = c8jn.A09.A0Y();
                AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
                EnumC53367NjI enumC53367NjI = null;
                if (abstractC55198Oe5 != null) {
                    l = ((N10) abstractC55198Oe5).A05.A01();
                } else {
                    l = null;
                }
                AbstractC55198Oe5 abstractC55198Oe52 = c54845OMq.A09;
                if ((abstractC55198Oe52 instanceof N10) && (n10 = (N10) abstractC55198Oe52) != null) {
                    abstractC53637Nni = n10.A05;
                } else {
                    abstractC53637Nni = null;
                }
                if ((abstractC53637Nni instanceof N13) && (n13 = (N13) abstractC53637Nni) != null) {
                    enumC53367NjI = n13.A03();
                }
                MXK mxk = MXK.A0C;
                String A05 = mxk.A05();
                String A07 = mxk.A07();
                if (A0Y) {
                    enumC50631MWs = EnumC50631MWs.A0M;
                } else {
                    enumC50631MWs = EnumC50631MWs.A0J;
                }
                C448524p c448524p = AnonymousClass229.A01(userSession).A0D;
                String str2 = AbstractC53606NnD.A01;
                EnumC53334Nik enumC53334Nik = null;
                if (str2 != null) {
                    enumC53335Nil = OXp.A01(str2);
                } else {
                    enumC53335Nil = null;
                }
                String str3 = AbstractC53606NnD.A03;
                if (str3 != null) {
                    enumC53334Nik = OXp.A00(str3);
                }
                String str4 = AbstractC53606NnD.A02;
                String str5 = AbstractC53606NnD.A00;
                C22M c22m = c448524p.A04;
                if (c22m.A0L == null) {
                    return;
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448524p.A01, "ig_camera_start_session");
                if (!A0f.isSampled()) {
                    return;
                }
                MSZ.A1E(A0f, c22m, "entity", "SMART_GLASSES");
                AbstractC166997dE.A1N(A0f, "camera_position", 4);
                A0f.A8R(EnumC114925Hg.STORY, "camera_destination");
                MSW.A1M(enumC50631MWs, A0f);
                AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
                A0f.A8R(enumC53335Nil, "device_type");
                A0f.A8R(enumC53334Nik, "device_build_type");
                A0f.AAP("soc_version", str4);
                A0f.AAP("build_flavor", str5);
                A0f.A9K("battery_level_pct", l);
                A0f.A8R(enumC53367NjI, "thermal_throttling_state");
                A0f.AAP("glasses_connection_session_id", A05);
                AbstractC167027dH.A0u(A0f, "glasses_activation_session_id", A07);
                return;
            case 1:
                N55 n55 = (N55) this.A01;
                n55.A0D = c54845OMq;
                c54845OMq.A0B.Efy(true);
                c54845OMq.A02(7);
                c54845OMq.A04(new N1O(1, c54845OMq, n55), "sup:SupGlassesToolkit_KEY");
                C54845OMq c54845OMq2 = n55.A0D;
                if (c54845OMq2 == null) {
                    C14360o3.A0F("mediaStreamController");
                    throw C00O.createAndThrow();
                }
                c54845OMq2.A01();
                return;
            case 2:
                OWe oWe = (OWe) this.A01;
                oWe.A01 = c54845OMq;
                InterfaceC57912PmI interfaceC57912PmI = oWe.A0B.A01;
                C14360o3.A0B(interfaceC57912PmI, 0);
                c54845OMq.A0F = interfaceC57912PmI;
                c54845OMq.A0B.Een(interfaceC57912PmI);
                n1n = new N1N(oWe, 2);
                str = "sup:MediaStreamControllerDelegate";
                break;
            case 3:
                n1n = new N1O(2, c54845OMq, this.A01);
                str = "sup:SupDelegate|SupLiveDelegate_KEY";
                break;
            default:
                ((C52154N6e) this.A01).A00 = c54845OMq;
                return;
        }
        c54845OMq.A04(n1n, str);
    }
}
