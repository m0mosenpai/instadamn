package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.Reel;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.J2b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43061J2b implements InterfaceC31137Dmc {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C2XI A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C39G A03;
    public final /* synthetic */ C41176IKp A04;
    public final /* synthetic */ InterfaceC60442pS A05;
    public final /* synthetic */ C75113Zb A06;
    public final /* synthetic */ CU0 A07;
    public final /* synthetic */ HashMap A08;

    @Override // X.JI8
    public final void AGM(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
    }

    @Override // X.InterfaceC31013DkC
    public final C120985dq AoJ(int i) {
        return null;
    }

    @Override // X.JI8
    public final long BYI() {
        return 0L;
    }

    @Override // X.JI2
    public final int BmI(C120985dq c120985dq) {
        return 0;
    }

    @Override // X.InterfaceC31159Dn3
    public final void CJR(View view, C38321qM c38321qM) {
    }

    @Override // X.JI2
    public final boolean CST(C120985dq c120985dq) {
        return false;
    }

    @Override // X.JI8
    public final boolean CT2(C120985dq c120985dq) {
        return false;
    }

    @Override // X.JI8
    public final boolean CT3(C120985dq c120985dq) {
        return false;
    }

    @Override // X.JI2
    public final boolean CT4(C120985dq c120985dq, Boolean bool) {
        return false;
    }

    @Override // X.XEZ
    public final boolean CUN(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        return false;
    }

    @Override // X.JI2
    public final boolean Cax(C120985dq c120985dq) {
        return false;
    }

    @Override // X.InterfaceC31159Dn3
    public final void CiU(C38321qM c38321qM, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void CiV(C38321qM c38321qM, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cip(EnumC120795dP enumC120795dP, BQL bql, C120985dq c120985dq, C37644Ghd c37644Ghd, Integer num) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Ciq(EnumC120795dP enumC120795dP, BQL bql, C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JI8
    public final void Co0(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC30964DjL
    public final void Cok(View view) {
    }

    @Override // X.InterfaceC31159Dn3
    public final boolean Com(View view) {
        return false;
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cos(View view) {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvC(String str, String str2) {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvD() {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvE() {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvG() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvx() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvy() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvz() {
    }

    @Override // X.InterfaceC31028DkR
    public final void Cx4(C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb, String str, float f, float f2, int i, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC31028DkR
    public final void Cx5(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
    }

    @Override // X.InterfaceC43399JFo
    public final /* synthetic */ void Cx8(C120985dq c120985dq, Integer num, String str) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void CxK(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxp(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final View.OnTouchListener Cxr(C120985dq c120985dq) {
        return null;
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxv() {
    }

    @Override // X.InterfaceC31159Dn3
    public final void CyG(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void CyH(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void CyR(C51757Mtg c51757Mtg) {
    }

    @Override // X.InterfaceC144816g1
    public final void CzU(UpcomingEvent upcomingEvent, String str, boolean z) {
    }

    @Override // X.InterfaceC31069DlB
    public final void Czs(C120985dq c120985dq, boolean z) {
    }

    @Override // X.InterfaceC31073DlF
    public final void D0X(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j) {
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void D0e(List list) {
    }

    @Override // X.InterfaceC30970DjR
    public final void D0g(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC30966DjN
    public final void D14(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC144776fx
    public final /* synthetic */ void D27() {
    }

    @Override // X.InterfaceC144776fx
    public final /* synthetic */ void D29() {
    }

    @Override // X.InterfaceC144776fx
    public final /* synthetic */ void D2C(C84823qW c84823qW, int i, int i2) {
    }

    @Override // X.InterfaceC30973DjU
    public final void D2b(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, boolean z) {
    }

    @Override // X.InterfaceC144836g3
    public final void D2p(C38321qM c38321qM, InterfaceC144306fC interfaceC144306fC, C144296fB c144296fB, C84823qW c84823qW) {
    }

    @Override // X.C3h2
    public final void D3H(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D4v(InterfaceC43434JGy interfaceC43434JGy, C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb, Boolean bool, String str, String str2, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC30974DjV
    public final void D50(C120985dq c120985dq, C38321qM c38321qM, SPM spm, C27845CPi c27845CPi, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D53(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D5B(C120985dq c120985dq, String str, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D5N(String str, String str2) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D5O(InterfaceC43434JGy interfaceC43434JGy, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC30972DjT
    public final void D5r(InterfaceC102674k2 interfaceC102674k2, C38321qM c38321qM, String str, int i, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D68(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        InterfaceC16600sD interfaceC16600sD = this.A04.A0I;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                interfaceC16600sD.invoke(c38321qM, c75113Zb, AbstractC37301Gc2.A0d(c75113Zb), false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31159Dn3
    public final void D6E(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        InterfaceC16600sD interfaceC16600sD = this.A04.A0I;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                interfaceC16600sD.invoke(c38321qM, c75113Zb, AbstractC37301Gc2.A0d(c75113Zb), false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31073DlF
    public final void D6N(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, int i, long j) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D6O(C120985dq c120985dq, C37644Ghd c37644Ghd, String str) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D7i(ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw) {
    }

    @Override // X.InterfaceC144786fy
    public final void D7u(C41181vS c41181vS, AlC alC) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D8e(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D8g(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D99(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
    }

    @Override // X.C3h2
    public final void D9l(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DAY(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DCc(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC43436JHa
    public final void DGJ(C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC30965DjM
    public final void DIc(Integer num) {
        C14360o3.A0B(num, 1);
    }

    @Override // X.InterfaceC31007Dk6
    public final void DIh(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31007Dk6
    public final void DIi(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC144916gB
    public final void DIm(C41181vS c41181vS, AlB alB, C144186f0 c144186f0) {
    }

    @Override // X.InterfaceC31008Dk7
    public final void DJf(C120985dq c120985dq, C37644Ghd c37644Ghd, C37526Gfi c37526Gfi, Integer num, String str, int i) {
    }

    @Override // X.InterfaceC30963DjK
    public final void DJg(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, int i) {
    }

    @Override // X.InterfaceC144846g4
    public final void DJm(C217859kI c217859kI) {
    }

    @Override // X.InterfaceC144856g5
    public final void DJo(C41181vS c41181vS, C217859kI c217859kI) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DL9(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DLC(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void DLj(PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void DLk(PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DLy(InterfaceC109864xE interfaceC109864xE, C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DLz(InterfaceC109094vY interfaceC109094vY, C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DML(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31009Dk8
    public final void DMM(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // X.InterfaceC31009Dk8
    public final void DMO(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // X.InterfaceC97454Zf
    public final void DMX(C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DP0(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A04.A04;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            interfaceC16660sJ.invoke(c38321qM);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31073DlF
    public final void DP4(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DP5(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DPG() {
    }

    @Override // X.XEZ
    public final void DQg(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        C14360o3.A0B(c37644Ghd, 1);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A02();
        A0R.A0A(new C44290Jhg(3, this.A04, this.A01));
        A0R.A04();
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null && !c75113Zb.A2h) {
            c75113Zb.A2h = true;
            C75113Zb.A00(c75113Zb, 30);
        }
    }

    @Override // X.XEZ
    public final void DQh(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        C14360o3.A0B(c37644Ghd, 1);
        C2XI c2xi = this.A01;
        if (((Number) c2xi.A00).floatValue() != 1.0f) {
            C55982hj A0R = AbstractC167007dF.A0R();
            A0R.A06 = true;
            A0R.A05(((Number) c2xi.A00).floatValue());
            A0R.A0A(new C44290Jhg(4, this.A04, c2xi));
            A0R.A03();
        }
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null && c75113Zb.A2h) {
            c75113Zb.A2h = false;
            C75113Zb.A00(c75113Zb, 30);
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DS7(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DSD(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DSK(C51757Mtg c51757Mtg) {
    }

    @Override // X.InterfaceC144796fz
    public final void DTK(C38321qM c38321qM, InterfaceC144306fC interfaceC144306fC, C84823qW c84823qW) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DTs(C38321qM c38321qM, C75113Zb c75113Zb, List list) {
    }

    @Override // X.InterfaceC31008Dk7
    public final void DU1(View view, C120985dq c120985dq, Integer num, Integer num2, String str, int i) {
    }

    @Override // X.InterfaceC144806g0
    public final void DUQ(MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
    }

    @Override // X.InterfaceC144806g0
    public final void DUR(C41181vS c41181vS, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel, String str) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DUw(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
    }

    @Override // X.InterfaceC31069DlB
    public final void DVD(MediaControlEventSourceEnum mediaControlEventSourceEnum, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31011DkA
    public final void DVw(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC104764ng interfaceC104764ng) {
    }

    @Override // X.InterfaceC31006Dk5
    public final void DWF(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31006Dk5
    public final void DWG(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DWX(C120985dq c120985dq) {
    }

    @Override // X.C3h2
    public final void DWg(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
    }

    @Override // X.JIE
    public final /* synthetic */ void DWz(String str) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DXJ(C120985dq c120985dq, C40971v4 c40971v4) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DXK(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC144906gA
    public final void DYh(String str) {
    }

    @Override // X.XEZ
    public final void DYl(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
    }

    @Override // X.InterfaceC144926gC
    public final void DZT(InterfaceC41201vU interfaceC41201vU, C144506fW c144506fW) {
    }

    @Override // X.InterfaceC31011DkA
    public final void DZW(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC97544Zo
    public final void DZX() {
    }

    @Override // X.InterfaceC97544Zo
    public final void DZY(InterfaceC41201vU interfaceC41201vU, C101394gx c101394gx, InterfaceC97554Zq interfaceC97554Zq, String str, String str2, float f, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DZc(C8JW c8jw, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DZd(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31069DlB
    public final void DZq(MediaControlEventSourceEnum mediaControlEventSourceEnum, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DbS(C38321qM c38321qM, Product product) {
    }

    @Override // X.InterfaceC30967DjO
    public final void DbV(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31010Dk9
    public final void Dbc(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C65 c65, User user, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC25229BEm.A1I(c37644Ghd, 1, str);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && c38321qM.A4j() && AbstractC166997dE.A1Z(bool2, true) && AbstractC100604fP.A03(this.A02, c38321qM)) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                C56().DwX(c38321qM, c75113Zb, true, false);
                return;
            }
            return;
        }
        if (user != null) {
            UserSession userSession = this.A02;
            Reel A01 = C1OU.A01(userSession, user);
            if (view != null && A01 != null) {
                FragmentActivity fragmentActivity = this.A00;
                C38E c38e = new C38E(this.A05, userSession, new C31479DsO(fragmentActivity, fragmentActivity));
                c38e.A05 = new C31559Dtj(fragmentActivity, view, new C42790IwS(interfaceC16820sZ, 3));
                c38e.A0C = AbstractC166997dE.A0n();
                c38e.A06(A01, C3G2.A0Q, null, AbstractC166987dD.A1J(A01), AbstractC166987dD.A1J(A01), AbstractC166987dD.A1J(A01));
                return;
            }
        }
        InterfaceC16600sD interfaceC16600sD = this.A04.A0H;
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            C75113Zb c75113Zb2 = c37644Ghd.A0E;
            if (c75113Zb2 != null) {
                if (user != null) {
                    interfaceC16600sD.invoke(c38321qM2, c75113Zb2, user.getId(), AbstractC37301Gc2.A0d(c75113Zb2));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC97664a1
    public final void DcA(PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC97664a1
    public final void DcG(C38321qM c38321qM, PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC97664a1
    public final void DcH(C8JW c8jw, C38321qM c38321qM, PromptStickerModel promptStickerModel, C8FC c8fc, List list) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dck(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC144826g2
    public final void Dcm(InterfaceC41201vU interfaceC41201vU, AlD alD, JFZ jfz) {
    }

    @Override // X.InterfaceC144826g2
    public final void Dcn(InterfaceC41201vU interfaceC41201vU, AlD alD) {
    }

    @Override // X.InterfaceC97614Zw
    public final void Dct(InterfaceC41201vU interfaceC41201vU, C97624Zx c97624Zx, Wm1 wm1, int i) {
    }

    @Override // X.InterfaceC144896g9
    public final void Dd4(C84823qW c84823qW) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DfU(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DfV(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31073DlF
    public final void DfX(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Di4(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Di6(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Di7(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DjZ(C120985dq c120985dq, C38321qM c38321qM, C75113Zb c75113Zb, EnumC25465BOe enumC25465BOe, int i) {
    }

    @Override // X.InterfaceC144766fw
    public final void Djf() {
    }

    @Override // X.InterfaceC144766fw
    public final void Djg(InterfaceC41201vU interfaceC41201vU) {
    }

    @Override // X.InterfaceC144766fw
    public final void Djh() {
    }

    @Override // X.InterfaceC144766fw
    public final void Dji() {
    }

    @Override // X.InterfaceC144766fw
    public final void Djj() {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Djo(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DlL(View view, C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 1);
        InterfaceC16620sF interfaceC16620sF = this.A04.A0A;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            interfaceC16620sF.invoke(view, c38321qM);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void DlO(MotionEvent motionEvent, C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 1);
        InterfaceC16620sF interfaceC16620sF = this.A04.A0B;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            interfaceC16620sF.invoke(motionEvent, c38321qM);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC30968DjP
    public final void Dlq(C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC97494Zj
    public final /* synthetic */ void Dn0(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, boolean z) {
    }

    @Override // X.InterfaceC97494Zj
    public final /* synthetic */ void Dn1() {
    }

    @Override // X.InterfaceC97494Zj
    public final /* synthetic */ void Dn2(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C41160IJz c41160IJz) {
    }

    @Override // X.InterfaceC97494Zj
    public final /* synthetic */ void Dn3() {
    }

    @Override // X.InterfaceC144886g8
    public final void Dn8(C41181vS c41181vS, C41629IbK c41629IbK) {
    }

    @Override // X.InterfaceC31073DlF
    public final void DnE(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, List list) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnF(SocialContextType socialContextType, C38321qM c38321qM, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnT(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnV(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnW(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dnc(C120985dq c120985dq, String str, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dnd(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dnf(View view, C120985dq c120985dq, String str, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DoU(C120985dq c120985dq, User user) {
    }

    @Override // X.InterfaceC144786fy, X.InterfaceC144866g6, X.InterfaceC144876g7
    public final void Dok(View view, C41181vS c41181vS, C84823qW c84823qW) {
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void DpF(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C8FC c8fc) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dqf(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DsU(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31073DlF
    public final void DsY(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC30971DjS
    public final void Dt8(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, boolean z) {
    }

    @Override // X.InterfaceC97454Zf
    public final void DvW(View view, C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
    }

    @Override // X.InterfaceC97454Zf
    public final void DvX(C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
    }

    @Override // X.InterfaceC30945Dj2
    public final void Dva(C38321qM c38321qM, EnumC75183Zl enumC75183Zl) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvb(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvi(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvj(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvk(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvl(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31069DlB
    public final void Dvm(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31069DlB
    public final void Dvn(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvv(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DwF(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, SPM spm, C27845CPi c27845CPi) {
    }

    @Override // X.InterfaceC144816g1
    public final void Dww(IJ3 ij3, UpcomingEvent upcomingEvent, String str) {
    }

    @Override // X.InterfaceC31073DlF
    public final void Dy4(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j) {
    }

    @Override // X.InterfaceC31069DlB
    public final void E0h(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
    }

    @Override // X.InterfaceC31069DlB
    public final void E0i(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void E0m(C120985dq c120985dq, C37644Ghd c37644Ghd) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void E0n(C37644Ghd c37644Ghd, C38321qM c38321qM, String str) {
    }

    @Override // X.InterfaceC30948Dj5
    public final void E1H(C38321qM c38321qM, String str, String str2, boolean z) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void E1L(C37644Ghd c37644Ghd, C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void E1N(C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC30969DjQ
    public final void E1X(C120985dq c120985dq, String str, String str2, String str3) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void E2X(JMS jms, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM) {
    }

    @Override // X.InterfaceC30977DjY
    public final void E32(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        C14360o3.A0B(c37644Ghd, 2);
    }

    @Override // X.InterfaceC31159Dn3
    public final void EHS(JLM jlm, JMS jms, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void EI7(C38321qM c38321qM, C75113Zb c75113Zb, EnumC25465BOe enumC25465BOe, int i) {
    }

    @Override // X.JI8
    public final void EJo() {
    }

    @Override // X.InterfaceC31013DkC
    public final void EMM(boolean z) {
    }

    @Override // X.InterfaceC30929Dij
    public final /* synthetic */ void EPR(C25377BKu c25377BKu, C40971v4 c40971v4) {
    }

    public C43061J2b(FragmentActivity fragmentActivity, C2XI c2xi, UserSession userSession, C39G c39g, C41176IKp c41176IKp, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, CU0 cu0, HashMap hashMap) {
        this.A03 = c39g;
        this.A04 = c41176IKp;
        this.A07 = cu0;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = interfaceC60442pS;
        this.A08 = hashMap;
        this.A01 = c2xi;
        this.A06 = c75113Zb;
    }

    @Override // X.AnonymousClass372
    public final C39G Ar3() {
        return this.A03;
    }

    @Override // X.JI2
    public final CUJ As5() {
        return new CUJ(this.A02);
    }

    @Override // X.C37B
    public final InterfaceC31076DlJ C56() {
        return new C29393CxQ(this.A04, this.A07);
    }

    @Override // X.XEZ
    public final boolean CYD() {
        return this.A06.A2h;
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxs(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        this.A04.A07.invoke(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31138Dmd
    public final void E0P() {
    }

    @Override // X.InterfaceC31138Dmd
    public final void EKl() {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.A04.A0E.invoke(seekBar, Integer.valueOf(i), Boolean.valueOf(z));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A04.A05.invoke(seekBar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.A04.A06.invoke(seekBar);
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxq(C8JW c8jw, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A04.A07.invoke(c120985dq, c37644Ghd);
    }

    @Override // X.XEZ
    public final void DBQ(C120985dq c120985dq, C37644Ghd c37644Ghd, C37905Gm2 c37905Gm2) {
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            UserSession userSession = this.A02;
            C41176IKp c41176IKp = this.A04;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                c75113Zb.A0J(c37905Gm2, AbstractC37301Gc2.A1a(userSession, c38321qM), A1a, A1a, C18U.A06(C06090Tz.A05, userSession, 36322242069604431L));
                if (c37905Gm2 != null) {
                    c41176IKp.A0J.invoke(c38321qM, c75113Zb, c37905Gm2, AbstractC37301Gc2.A0d(c75113Zb));
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DOx(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC16590sC interfaceC16590sC = this.A04.A0K;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                interfaceC16590sC.invoke(c38321qM, c75113Zb, AbstractC37301Gc2.A0d(c75113Zb), "feed_timeline", null);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31159Dn3
    public final void DTo(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC16610sE interfaceC16610sE = this.A04.A0D;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                interfaceC16610sE.invoke(c38321qM, c75113Zb, AbstractC37301Gc2.A0d(c75113Zb));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31159Dn3
    public final void DlM(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC16610sE interfaceC16610sE = this.A04.A0F;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                interfaceC16610sE.invoke(c38321qM, c75113Zb, AbstractC37301Gc2.A0d(c75113Zb));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.XEZ
    public final void Dmd(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, Float f, Float f2) {
        String id;
        Object obj;
        int i;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (id = c38321qM.getId()) != null && (obj = (C3Y7) this.A08.get(id)) != null) {
            C41176IKp c41176IKp = this.A04;
            boolean A1b = AbstractC25231BEo.A1b(c41176IKp.A00);
            C25370BKn c25370BKn = (C25370BKn) obj;
            Context context = c25370BKn.A08.getContext();
            if (A1b) {
                i = R.drawable.instagram_volume_off_pano_filled_24;
            } else {
                i = R.drawable.instagram_volume_pano_filled_24;
            }
            C25370BKn.A00(context.getDrawable(i), c25370BKn);
            c41176IKp.A0C.invoke(c120985dq, c37644Ghd);
        }
    }

    @Override // X.InterfaceC31138Dmd
    public final void ARt(boolean z) {
    }

    @Override // X.InterfaceC30975DjW
    public final void D6J(C120985dq c120985dq, C37644Ghd c37644Ghd, String str) {
        AbstractC167017dG.A1R(c37644Ghd, str);
    }

    @Override // X.InterfaceC31010Dk9
    public final View.OnTouchListener Dbd(C120985dq c120985dq, User user, String str) {
        return ViewOnTouchListenerC42062IkV.A00;
    }

    @Override // X.InterfaceC43436JHa
    public final void Dj4(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final View.OnTouchListener DnU(C38321qM c38321qM, String str) {
        return ViewOnTouchListenerC42063IkW.A00;
    }

    @Override // X.InterfaceC31138Dmd
    public final void EPE(int i, Paint paint) {
    }

    @Override // X.InterfaceC31138Dmd
    public final void EkF(boolean z) {
    }

    @Override // X.InterfaceC43432JGw
    public final void ElR(C38321qM c38321qM, String str) {
    }

    @Override // X.XEZ
    public final void Cuj(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31073DlF
    public final void DHZ(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, int i, long j) {
    }

    @Override // X.InterfaceC30976DjX
    public final void DMC(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167027dH.A13(c120985dq, c37644Ghd, str);
    }
}
