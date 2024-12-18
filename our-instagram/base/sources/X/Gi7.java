package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class Gi7 implements InterfaceC31071DlD, InterfaceC31022DkL {
    public InterfaceC16610sE A00;
    public InterfaceC16660sJ A01;
    public InterfaceC16660sJ A02;
    public InterfaceC16620sF A03;
    public InterfaceC16610sE A04;
    public InterfaceC16610sE A05;
    public final InterfaceC116925Qy A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final MVO A09;
    public final InterfaceC31022DkL A0A;
    public final C37604Ggz A0B;
    public final IG5 A0C;
    public final C37671Gi4 A0D;

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A0A.ER9(interfaceC16610sE);
    }

    private final void A00(C45103JxX c45103JxX, MVN mvn, C120985dq c120985dq, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, String str, boolean z) {
        A01((ClipsViewerConfig) mvn.A03, (C120985dq) mvn.A04, (C65) c45103JxX.A03, interfaceC60442pS, c75113Zb, null, Float.valueOf(c45103JxX.A00), Float.valueOf(c45103JxX.A01), z);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String A1E = AbstractC25226BEj.A1E(c120985dq);
            C14360o3.A0B(A1E, 0);
            String id = c38321qM.getId();
            if (id != null) {
                SourceModelInfoParams sourceModelInfoParams = new SourceModelInfoParams(id, str, AbstractC25226BEj.A1G(c38321qM), c75113Zb.getPosition(), c75113Zb.A03);
                UserSession userSession = this.A08;
                IJ2 ij2 = new IJ2(null, sourceModelInfoParams, A1E, AbstractC151266rU.A01(userSession, c120985dq.A06()), z);
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null && A2E.A01() == 31 && C18U.A06(C06090Tz.A05, userSession, 36327765397486430L)) {
                    InterfaceC16620sF interfaceC16620sF = this.A03;
                    if (interfaceC16620sF != null) {
                        interfaceC16620sF.invoke(c38321qM, c75113Zb);
                        return;
                    }
                    return;
                }
                if (c75113Zb.A1o && C18U.A06(C06090Tz.A06, userSession, 36321537696540227L)) {
                    InterfaceC16660sJ interfaceC16660sJ = this.A01;
                    if (interfaceC16660sJ == null) {
                        return;
                    }
                    interfaceC16660sJ.invoke(ij2);
                    return;
                }
                InterfaceC16610sE interfaceC16610sE = this.A04;
                if (interfaceC16610sE == null) {
                    return;
                }
                interfaceC16610sE.invoke(ij2, c38321qM, c75113Zb);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final void A01(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C65 c65, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, User user, Float f, Float f2, boolean z) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A08;
            C42548IsR c42548IsR = new C42548IsR(c120985dq, userSession, c75113Zb, user);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                boolean A2N = A2E.A2N();
                int position = c75113Zb.getPosition();
                C32U.A0J(userSession, c42548IsR, c65, c120985dq, interfaceC60442pS, this.A0B, f, f2, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, clipsViewerConfig.A14, clipsViewerConfig.A15, clipsViewerConfig.A19, position, A2N, z);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public /* synthetic */ Gi7(InterfaceC116925Qy interfaceC116925Qy, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31022DkL interfaceC31022DkL, IG5 ig5) {
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        C14360o3.A0B(A00, 5);
        C14360o3.A0B(interfaceC31022DkL, 6);
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0C = ig5;
        this.A06 = interfaceC116925Qy;
        this.A0B = A00;
        this.A0A = interfaceC31022DkL;
        this.A0D = new C37671Gi4(userSession);
        this.A09 = new MVO(userSession);
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A0A.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.InterfaceC31071DlD
    public final void EZz(InterfaceC16610sE interfaceC16610sE) {
        this.A00 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31071DlD
    public final void EaZ(InterfaceC16610sE interfaceC16610sE) {
        this.A04 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31071DlD
    public final void Eaa(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31071DlD
    public final void Ebh(InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31071DlD
    public final void EcM(InterfaceC16610sE interfaceC16610sE) {
        this.A05 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31071DlD
    public final void EhM(InterfaceC16620sF interfaceC16620sF) {
        this.A03 = interfaceC16620sF;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // X.InterfaceC31071DlD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dbj(android.content.Context r37, android.view.View r38, X.C45103JxX r39, X.MVN r40, X.InterfaceC60442pS r41, X.C75113Zb r42, com.instagram.user.model.User r43, X.InterfaceC16820sZ r44, boolean r45, boolean r46, boolean r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gi7.Dbj(android.content.Context, android.view.View, X.JxX, X.MVN, X.2pS, X.3Zb, com.instagram.user.model.User, X.0sZ, boolean, boolean, boolean, boolean):void");
    }
}
