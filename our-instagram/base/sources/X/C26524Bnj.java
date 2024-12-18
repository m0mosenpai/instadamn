package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Bnj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26524Bnj extends AbstractC51572Yf {
    public final C2XI A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC31137Dmc A06;
    public final C37577GgY A07;
    public final InterfaceC31048Dkm A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final boolean A0B;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        String str2;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A02;
        C4NM c4nm = c120985dq.A08().A08;
        C4NV c4nv = c4nm.A01;
        if (c4nv != null) {
            String str3 = c4nv.A00.A00;
            str = str3;
            if (str3 == null) {
                str = "";
            }
        } else {
            str = null;
        }
        C4NN c4nn = c4nm.A09;
        C117095Rs c117095Rs = c4nm.A03;
        if (c117095Rs != null) {
            str2 = c117095Rs.A00;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        C37644Ghd c37644Ghd = this.A03;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb == null) {
            return null;
        }
        Object A00 = C29904DGs.A00(c76223bS, AbstractC77073ct.A00(c76223bS, DG2.A00), new Object[0], 48);
        Object A002 = C29904DGs.A00(c76223bS, AbstractC77073ct.A00(c76223bS, DG3.A00), new Object[0], 49);
        Object A003 = AbstractC77183d4.A00(c76223bS, new BQP(AbstractC77073ct.A00(c76223bS, DG4.A00), 0), new Object[0]);
        C75933ay c75933ay = C51722Yv.A02;
        long A04 = AbstractC77623dm.A04(c76223bS);
        long A07 = AbstractC77623dm.A07(c76223bS);
        C51722Yv A004 = C9CU.A00(null, C05F.A08, 0, A04);
        Integer num = C05F.A0A;
        C51722Yv A005 = C9CU.A00(A004, num, 0, A07);
        long A042 = AbstractC77623dm.A04(c76223bS);
        Integer num2 = C05F.A04;
        C51722Yv A006 = C9CU.A00(A005, num2, 0, A042);
        String str4 = c4nn.A00;
        if (str4 == null) {
            str4 = "";
        }
        Integer num3 = C05F.A0N;
        C51722Yv A007 = C9CV.A00(A006, num3, str4, 0);
        Integer num4 = C05F.A0C;
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.auth_credential_title_text_size);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        int A02 = AbstractC25232BEp.A02(context, c76223bS);
        String str5 = c4nn.A00;
        if (str5 == null) {
            str5 = "";
        }
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        Integer num5 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str5, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A0D);
        A0a.A0S(1);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
        AbstractC25230BEn.A1M(A0a, num4, num5);
        AbstractC25230BEn.A1J(A0a, 1.09f, false);
        A0a.A0M(2);
        AbstractC25234BEr.A17(A007, A0a, false);
        C51682Yq A0A = A0a.A0A();
        C51722Yv A0V = AbstractC25233BEq.A0V(C9CU.A00(null, num, 0, AbstractC77623dm.A04(c76223bS)), AbstractC25225BEi.A0n(num2, 0, AbstractC77623dm.A04(c76223bS)), num3, str2, 0);
        long A05 = AbstractC77623dm.A05(c76223bS);
        int A022 = AbstractC25232BEp.A02(context, c76223bS);
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str2, 0);
        AbstractC25233BEq.A19(c76223bS, A0a2, A022, A05);
        A0a2.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a2, A0D2);
        A0a2.A0X(num4);
        AbstractC25233BEq.A1E(A0a2, num5, 1.09f, false);
        A0a2.A0M(3);
        AbstractC25234BEr.A17(A0V, A0a2, false);
        C51682Yq A0A2 = A0a2.A0A();
        EnumC76913cd enumC76913cd = AbstractC51432Xq.A04;
        C89813zN A008 = AbstractC51432Xq.A00(enumC76913cd, "caption_bg");
        AbstractC25226BEj.A1S(A008, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        InterfaceC79483gv interfaceC79483gv = AbstractC79463gt.A00;
        A008.A03(interfaceC79483gv);
        AbstractC89903zW.A00(c76223bS, A008);
        AbstractC77313dH.A00(c76223bS, new C29709D8c(6, A00, c75113Zb, A002, A003), AbstractC25230BEn.A1a());
        C89803zM c89803zM = new C89803zM(1000);
        C89813zN A009 = AbstractC51432Xq.A00(enumC76913cd, "end_scene_background");
        AbstractC25228BEl.A1N(c89803zM, A009, interfaceC79483gv, 0.0f);
        AbstractC89903zW.A00(c76223bS, A009);
        C3e8 c3e8 = C3e8.SPACE_BETWEEN;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        Integer num6 = C05F.A01;
        C51722Yv A0N = AbstractC25234BEr.A0N(null, num6, num5, 100.0f, 0);
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num7 = C05F.A0Y;
        C51722Yv A0010 = C9CV.A00(A0N, num7, enumC77933eL, 3);
        C2XE c2xe2 = A0P.A00;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe2);
        UserSession userSession = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A04;
        InterfaceC31137Dmc interfaceC31137Dmc = this.A06;
        A0P2.A00(new BNS(null, this.A01, c120985dq, c37644Ghd, interfaceC11380iw, userSession, interfaceC31137Dmc, null, this.A0A, this.A09, 0.0f, 0.0f, false, this.A0B));
        AbstractC25226BEj.A1R(A0P2, A0P, A0010);
        C2XI c2xi = this.A00;
        C51722Yv A0011 = C9CV.A00(AbstractC25233BEq.A0T(AbstractC25231BEo.A0X(c2xi, null, num5), AbstractC25225BEi.A0m(num6, 50.0f, 0), num5, 100.0f, 0), num7, enumC77933eL, 3);
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_END;
        AbstractC25234BEr.A0r(AbstractC77623dm.A0E(A0P, R.drawable.clips_viewer_gradient_background), c2xe2, A0P, C9CV.A00(A0011, num5, enumC77683ds, 3));
        C51722Yv A0X = AbstractC25231BEo.A0X(c2xi, AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0o(num5, enumC77683ds, 3), num6, 100.0f, 0), num5);
        C3e8 c3e82 = C3e8.FLEX_END;
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe2);
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num6, 50.0f, 0);
        C2Z0 A13 = AbstractC25232BEp.A13(A0P3);
        C51722Yv A0012 = C9CU.A00(C9CU.A00(AbstractC25234BEr.A0N(AbstractC25233BEq.A0T(C9CV.A00(null, num5, enumC77683ds, 3), new C9CV(c2xi, num5), num6, 100.0f, 0), num6, num4, 1.0f, 1), C05F.A1I, 0, AbstractC77623dm.A0C(A13)), C05F.A0E, 0, AbstractC77623dm.A04(A13));
        C2XE c2xe3 = A13.A00;
        C2Z0 A0P4 = AbstractC167007dF.A0P(c2xe3);
        C51722Yv A0N2 = AbstractC25234BEr.A0N(null, num5, num6, 100.0f, 0);
        EnumC77683ds enumC77683ds2 = EnumC77683ds.FLEX_START;
        C2Z0 A132 = AbstractC25232BEp.A13(A0P4);
        A132.A00(new BN0(c120985dq, interfaceC11380iw, userSession, interfaceC31137Dmc, this.A08));
        A132.A00(A0A);
        A132.A00(A0A2);
        C37577GgY c37577GgY = this.A07;
        A132.A00(new C26418Bm1(c120985dq, c37577GgY, num6, str));
        A132.A00(new C26340Bkl(c120985dq, c37577GgY));
        A0P4.A00(AbstractC76963ci.A06(A132, A0P4, A0N2, enumC77683ds2, enumC77683ds2, c3e82, false));
        A13.A00(AbstractC76963ci.A0E(A0P4, A13, A0012));
        AbstractC25231BEo.A1A(AbstractC25226BEj.A0l(new C26464Bml(null, c120985dq, c37644Ghd, interfaceC11380iw, userSession, interfaceC31137Dmc), AbstractC167007dF.A0P(c2xe3), A13, C9CV.A00(AbstractC25234BEr.A0N(null, num6, num5, 100.0f, 0), num7, enumC77933eL, 3)), A13, A0P3, A0d);
        A0P.A00(AbstractC76963ci.A02(A0P3, A0P, A0X));
        if (c37644Ghd.A0f) {
            A0P.A00(new C26564BoN(AbstractC77363dM.A00(A0P), c120985dq, c37644Ghd, userSession, interfaceC31137Dmc, true, false));
        }
        return new C2WH(null, null, c3e8, null, null, A0P.A01, false);
    }

    public C26524Bnj(C2XI c2xi, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, C37577GgY c37577GgY, InterfaceC31048Dkm interfaceC31048Dkm, HashMap hashMap, HashMap hashMap2, boolean z) {
        AbstractC25234BEr.A1R(userSession, interfaceC11380iw, c37577GgY, interfaceC31137Dmc, hashMap);
        AbstractC167007dF.A1I(hashMap2, 7, interfaceC31048Dkm);
        AbstractC25232BEp.A1P(c37644Ghd, c2xi);
        C14360o3.A0B(clipsViewerConfig, 13);
        this.A02 = c120985dq;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A07 = c37577GgY;
        this.A06 = interfaceC31137Dmc;
        this.A0A = hashMap;
        this.A09 = hashMap2;
        this.A08 = interfaceC31048Dkm;
        this.A03 = c37644Ghd;
        this.A00 = c2xi;
        this.A0B = z;
        this.A01 = clipsViewerConfig;
    }
}
