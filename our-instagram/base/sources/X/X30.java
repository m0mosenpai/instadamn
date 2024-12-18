package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.screentime.IGScreenTimeApi;
import go.Seq;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class X30 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X30(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.2fr, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        AbstractC12990ll abstractC12990ll;
        C06090Tz c06090Tz;
        long j;
        Object value;
        InterfaceC19610xo ARD;
        String A00;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
            case Process.SIGSTOP /* 19 */:
                return AbstractC167027dH.A0B(this.A01);
            case 1:
                return new C27003Bvi((UserSession) ((C26793BsH) this.A01).A00.getValue());
            case 2:
            case 3:
                ((InterfaceC16820sZ) this.A01).invoke();
                return C0eB.A00;
            case 4:
                return Integer.valueOf(((List) this.A01).size());
            case 5:
                abstractC12990ll = (AbstractC12990ll) ((C26823Bsl) this.A01).A0B.getValue();
                c06090Tz = C06090Tz.A05;
                j = 36330123334795977L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 6:
                abstractC12990ll = (AbstractC12990ll) ((C26823Bsl) this.A01).A0B.getValue();
                c06090Tz = C06090Tz.A05;
                j = 36330123334533829L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 7:
                abstractC12990ll = (AbstractC12990ll) ((C26823Bsl) this.A01).A0B.getValue();
                c06090Tz = C06090Tz.A05;
                j = 36324685906194825L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 8:
                C54558O8k c54558O8k = ((C51015MgN) ((C26823Bsl) this.A01).A0F.getValue()).A01;
                boolean z = c54558O8k.A01;
                C23031Ai A002 = AbstractC23021Ah.A00(c54558O8k.A00);
                if (z) {
                    InterfaceC19630xq interfaceC19630xq = A002.A01;
                    ARD = interfaceC19630xq.ARD();
                    i3 = interfaceC19630xq.getInt(MSV.A00(564), 0) + 1;
                    i4 = 1569;
                    ARD.E7D(MSV.A00(i4), i3);
                    ARD.apply();
                    return C0eB.A00;
                }
                InterfaceC19630xq interfaceC19630xq2 = A002.A01;
                ARD = interfaceC19630xq2.ARD();
                A00 = MSV.A00(564);
                i2 = interfaceC19630xq2.getInt(A00, 0);
                ARD.E7D(A00, i2 + 1);
                ARD.apply();
                return C0eB.A00;
            case 9:
                C51015MgN c51015MgN = (C51015MgN) ((C26823Bsl) this.A01).A0F.getValue();
                C05A c05a = c51015MgN.A05;
                do {
                    value = c05a.getValue();
                } while (!c05a.AIi(value, C51725Mt2.A00(null, null, (C51725Mt2) value, null, null, 255)));
                C54558O8k c54558O8k2 = c51015MgN.A01;
                boolean z2 = c54558O8k2.A01;
                C23031Ai A003 = AbstractC23021Ah.A00(c54558O8k2.A00);
                if (z2) {
                    InterfaceC19630xq interfaceC19630xq3 = A003.A01;
                    ARD = interfaceC19630xq3.ARD();
                    i3 = interfaceC19630xq3.getInt(MSV.A00(563), 0) + 1;
                    i4 = 1568;
                    ARD.E7D(MSV.A00(i4), i3);
                    ARD.apply();
                    return C0eB.A00;
                }
                InterfaceC19630xq interfaceC19630xq4 = A003.A01;
                ARD = interfaceC19630xq4.ARD();
                A00 = MSV.A00(563);
                i2 = interfaceC19630xq4.getInt(A00, 0);
                ARD.E7D(A00, i2 + 1);
                ARD.apply();
                return C0eB.A00;
            case 10:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) ((C26823Bsl) this.A01).A0F.getValue();
                PZC.A02(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 24);
                return C0eB.A00;
            case 11:
                C26823Bsl.A00((C26823Bsl) this.A01);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C27961Xa A004 = AbstractC54912fq.A00();
                C26823Bsl c26823Bsl = (C26823Bsl) this.A01;
                UserSession userSession = (UserSession) c26823Bsl.A0B.getValue();
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0t;
                AbstractC54912fq.A00();
                ?? obj = new Object();
                obj.A0B = AbstractC166997dE.A0a();
                obj.A01(new C70971Wlf(c26823Bsl, 2), (C64742wY) c26823Bsl.A08.getValue());
                return A004.A02(c26823Bsl, c26823Bsl, userSession, obj.A00(), quickPromotionSlot);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C27961Xa A005 = AbstractC54912fq.A00();
                C26823Bsl c26823Bsl2 = (C26823Bsl) this.A01;
                return A005.A05((UserSession) c26823Bsl2.A0B.getValue(), (HashMap) c26823Bsl2.A03.getValue());
            case 14:
                return AbstractC018607g.A00((Fragment) this.A01);
            case Process.SIGTERM /* 15 */:
                return new C29138Ct5((UserSession) ((C26823Bsl) this.A01).A0B.getValue());
            case 16:
                abstractC12990ll = (AbstractC12990ll) ((C26823Bsl) this.A01).A0B.getValue();
                c06090Tz = C06090Tz.A05;
                j = 36324685906522510L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 17:
                return this.A01;
            case 18:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 20:
                C26823Bsl c26823Bsl3 = (C26823Bsl) this.A01;
                return AbstractC12220kQ.A01(c26823Bsl3, (AbstractC12990ll) c26823Bsl3.A0B.getValue());
            case 21:
                abstractC12990ll = (AbstractC12990ll) ((C26823Bsl) this.A01).A0B.getValue();
                c06090Tz = C06090Tz.A05;
                j = 36324685906325899L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 22:
                C26823Bsl c26823Bsl4 = (C26823Bsl) this.A01;
                UserSession userSession2 = (UserSession) c26823Bsl4.A0B.getValue();
                Application application = c26823Bsl4.requireActivity().getApplication();
                C14360o3.A07(application);
                return new C52290NCf(application, userSession2);
            case 23:
                return new C68083V9o((UserSession) this.A01);
            case 24:
                return new C68084V9p((UserSession) this.A01);
            case 25:
                UserSession userSession3 = (UserSession) this.A01;
                C99004cK c99004cK = C12Y.A0A;
                C99014cL c99014cL = new C99014cL(c99004cK);
                C99014cL c99014cL2 = new C99014cL(c99004cK);
                AbstractC167017dG.A1N(c99004cK, userSession3);
                return new C12Y(userSession3, (IGScreenTimeApi) userSession3.A01(IGScreenTimeApi.class, new C29901DGp(23, c99004cK, userSession3, c99014cL2, c99014cL)));
            case 26:
                return new U2U((UserSession) this.A01);
            case 27:
                return new U2R((UserSession) this.A01);
            case 28:
                return new U08((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new U10((UserSession) this.A01);
            case 30:
                return new U11((UserSession) this.A01);
            case 31:
                return new W61((UserSession) this.A01);
            case 32:
                return new U0z((UserSession) this.A01);
            case 33:
                return new C70811WhU((UserSession) this.A01);
            case 34:
                return new C65740TtF((UserSession) this.A01);
            case 35:
                return new VgC((UserSession) this.A01);
            case 36:
                return new U0M((UserSession) this.A01);
            case 37:
                return new MZF((UserSession) this.A01);
            case 38:
                return new U2T((UserSession) this.A01);
            case 39:
                return new U0J((UserSession) this.A01);
            case 40:
                return C56352iT.A0t.A03(((C65872Tva) this.A01).A00);
            case Seq.NULL_REFNUM /* 41 */:
                abstractC12990ll = ((C65872Tva) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 36330621551330236L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return Integer.valueOf(AbstractC57322k7.A00(((C65872Tva) this.A01).A00));
            case 43:
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                UserSession session = abstractC67878V0j.getSession();
                String A04 = abstractC67878V0j.A06().A04();
                C14360o3.A0B(session, 1);
                return new AbstractC41190ILd("music/audio_global_search/", "audio_serp_page", new C50270MHz(A04, session, 1));
            case 44:
                U1U u1u = ((AbstractC65919TwQ) this.A01).A06;
                if (u1u != null) {
                    u1u.A01();
                    u1u.A02();
                }
                return C0eB.A00;
            case 45:
                AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                C65960TxC c65960TxC = abstractC65919TwQ.A07;
                if (c65960TxC != null) {
                    C65963TxG.A00(c65960TxC, abstractC65919TwQ);
                    return C0eB.A00;
                }
                C14360o3.A0F("dataSource");
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            default:
                UserSession A0E = ((AbstractC65919TwQ) this.A01).A0E();
                C14360o3.A0B(A0E, 0);
                return C3o3.A00(A0E);
            case 48:
                return AbstractC58232lf.A00(AnonymousClass191.A00, (InterfaceC19390xP) MZJ.A05.A00(((AbstractC65919TwQ) this.A01).A0E()).A02.getValue());
            case 49:
                AbstractC65919TwQ abstractC65919TwQ2 = (AbstractC65919TwQ) this.A01;
                UserSession A0E2 = abstractC65919TwQ2.A0E();
                C65918TwP c65918TwP = (C65918TwP) abstractC65919TwQ2;
                String str = c65918TwP.A09;
                if (str != null) {
                    C65918TwP c65918TwP2 = c65918TwP.A0b;
                    String str2 = c65918TwP2.A07;
                    XB8 xb8 = abstractC65919TwQ2.A0k;
                    InterfaceC72022XFk interfaceC72022XFk = abstractC65919TwQ2.A0i;
                    C66151U1s c66151U1s = (C66151U1s) c65918TwP2.A0h.getValue();
                    if (c66151U1s != null) {
                        C66152U1t c66152U1t = (C66152U1t) c65918TwP2.A0f.getValue();
                        if (c66152U1t != null) {
                            C43812JYz c43812JYz = (C43812JYz) c65918TwP2.A0i.getValue();
                            XAn xAn = abstractC65919TwQ2.A0d;
                            C38E c38e = new C38E(abstractC65919TwQ2, abstractC65919TwQ2.A0E(), new C38C(abstractC65919TwQ2));
                            InterfaceC190488c6 A0F = abstractC65919TwQ2.A0F();
                            C123835ix c123835ix = new C123835ix(abstractC65919TwQ2, abstractC65919TwQ2.A0E());
                            U14 u14 = new U14(abstractC65919TwQ2, 1);
                            XB4 xb4 = abstractC65919TwQ2.A0f;
                            XB7 xb7 = abstractC65919TwQ2.A0j;
                            boolean z3 = abstractC65919TwQ2.A0M;
                            boolean z4 = abstractC65919TwQ2.A0N;
                            XDv xDv = abstractC65919TwQ2.A0l;
                            X30 x30 = new X30(abstractC65919TwQ2, 44);
                            X30 x302 = new X30(abstractC65919TwQ2, 45);
                            UserSession A0E3 = abstractC65919TwQ2.A0E();
                            boolean A06 = C18U.A06(AbstractC166997dE.A0U(A0E3), A0E3, 36328242140495230L);
                            UserSession A0E4 = abstractC65919TwQ2.A0E();
                            C14360o3.A0B(A0E4, 0);
                            C06090Tz c06090Tz2 = C06090Tz.A05;
                            boolean A062 = C18U.A06(c06090Tz2, A0E4, 36328242139774323L);
                            UserSession A0E5 = abstractC65919TwQ2.A0E();
                            C14360o3.A0B(A0E5, 0);
                            C65921TwS c65921TwS = new C65921TwS(A0E2, xAn, c123835ix, c38e, null, A0F, xb4, interfaceC72022XFk, xb7, xb8, u14, xDv, c66151U1s, c43812JYz, c66152U1t, str, str2, x30, x302, z3, z4, A06, A062, C18U.A06(c06090Tz2, A0E5, 36328242139905397L));
                            C66392zG A006 = C66362zD.A00(abstractC65919TwQ2.requireContext());
                            UserSession A0E6 = abstractC65919TwQ2.A0E();
                            C14360o3.A0B(A0E6, 0);
                            if (C18U.A06(c06090Tz2, A0E6, 36327950081080298L)) {
                                C66136U1d A0I = abstractC65919TwQ2.A0I();
                                UserSession A0E7 = abstractC65919TwQ2.A0E();
                                C14360o3.A0B(A0E7, 0);
                                boolean A063 = C18U.A06(c06090Tz2, A0E7, 36327950082653183L);
                                boolean A1Z = AbstractC65702TsY.A1Z(abstractC65919TwQ2);
                                UserSession A0E8 = abstractC65919TwQ2.A0E();
                                C14360o3.A0B(A0E8, 0);
                                A006.A01(new NFL(c65921TwS, A0I, (int) C18U.A01(c06090Tz2, A0E8, 36609425058174858L), A063, A1Z));
                            }
                            UserSession A0E9 = abstractC65919TwQ2.A0E();
                            C66136U1d A0I2 = abstractC65919TwQ2.A0I();
                            C14360o3.A0B(A0E9, 0);
                            boolean A1Y = AbstractC65702TsY.A1Y(A0E9);
                            boolean A064 = C18U.A06(c06090Tz2, A0E9, 36319025139030930L);
                            boolean A1Y2 = AbstractC65702TsY.A1Y(A0E9);
                            Wk0 wk0 = new Wk0(c65918TwP, 9);
                            boolean A065 = C18U.A06(c06090Tz2, A0E9, 36316336489697557L);
                            boolean A1P = AbstractC167007dF.A1P(U0B.A00(A0E9).A01, 2);
                            A006.A01(new U1G(c65918TwP, A0E9, c65921TwS, A0I2, A1Y2 ? 1 : 0, false, A1Y));
                            A006.A01(new U1F(c65918TwP, c65921TwS, A0I2, A1Y));
                            A006.A01(new U1E(c65921TwS, A0I2, A1Y2 ? 1 : 0, A1Y, A065, A1P, A064, AbstractC167007dF.A1Z(c65918TwP.A0q), c65918TwP.A0D, c65918TwP.A0C));
                            A006.A01(new U1H(A0E9, c65921TwS, new U1R(c65918TwP), A0I2, false, false, false, A1Y));
                            A006.A01(new C31697Dw2(wk0, new U1S(c65918TwP), 2131972993));
                            A006.A01(new U1I(c65918TwP, A0E9, c65921TwS, A0I2, A1Y));
                            A006.A01(new U1Q(c65918TwP, c65921TwS));
                            A006.A01(new U1P(c65918TwP.requireContext(), A0E9, c65921TwS));
                            A006.A01(new C31698Dw3(c65918TwP.requireContext(), c65918TwP, A0E9, c65921TwS));
                            A006.A01(new C31700Dw5(c65918TwP.requireContext(), new U1O(A0E9, c65918TwP)));
                            A006.A01(new U1J(abstractC65919TwQ2.requireActivity(), abstractC65919TwQ2, abstractC65919TwQ2.A0E(), c65921TwS, abstractC65919TwQ2.A0I(), c65918TwP.A0e, C18U.A06(c06090Tz2, abstractC65919TwQ2.A0E(), 36326193439454955L), true, abstractC65919TwQ2.A0P, true, true, true, false));
                            Context requireContext = abstractC65919TwQ2.requireContext();
                            C65960TxC c65960TxC2 = abstractC65919TwQ2.A07;
                            if (c65960TxC2 != null) {
                                XB6 xb6 = abstractC65919TwQ2.A0h;
                                GYT gyt = abstractC65919TwQ2.A0p;
                                XLN xln = abstractC65919TwQ2.A0c;
                                XAq xAq = abstractC65919TwQ2.A0e;
                                XBD xbd = abstractC65919TwQ2.A0m;
                                U0M A007 = U0B.A00(abstractC65919TwQ2.A0E());
                                int i5 = A007.A01;
                                if (i5 != 0 && (!A007.A02.A04.isEmpty()) && i5 != 3) {
                                    i = A007.A00;
                                } else {
                                    i = -1;
                                }
                                return new U1T(requireContext, A006, xln, xAq, c65960TxC2, xb6, xb8, xbd, c65921TwS, gyt, i, abstractC65919TwQ2.A00, abstractC65919TwQ2.A0P, abstractC65919TwQ2.A0Q, abstractC65919TwQ2.A0K, abstractC65919TwQ2.A0O, abstractC65919TwQ2.A0L);
                            }
                            C14360o3.A0F("dataSource");
                            throw C00O.createAndThrow();
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
        }
    }
}
