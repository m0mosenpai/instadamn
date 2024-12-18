package X;

import android.app.Application;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.NDu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52331NDu extends AbstractC61132qb {
    public final Application A00;
    public final C07X A01;
    public final CallerContext A02;
    public final C44475Jlh A03;
    public final C44466JlY A04;
    public final C50880MeB A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final ClipsSharingDraftViewModel A08;
    public final C50991Mfy A09;
    public final OVl A0A;
    public final C54818OKt A0B;
    public final C50994Mg1 A0C;
    public final P0I A0D;
    public final C51022MgU A0E;
    public final C50899MeU A0F;
    public final C50997Mg4 A0G;
    public final C8B7 A0H;
    public final PendingRecipient A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A07;
        ClipsSharingDraftViewModel clipsSharingDraftViewModel = this.A08;
        C07X c07x = this.A01;
        C52457NJb c52457NJb = new C52457NJb(c07x, userSession, clipsSharingDraftViewModel);
        String str = this.A0K;
        boolean z = this.A0O;
        boolean z2 = this.A0P;
        boolean z3 = this.A0R;
        NJM njm = new NJM(userSession, str, z, z2, z3, this.A0M);
        C52468NJm c52468NJm = new C52468NJm(userSession, c52457NJb);
        NKN nkn = new NKN(userSession, this.A0A, this.A0B, c52457NJb);
        NK9 nk9 = new NK9(c52457NJb);
        C52465NJj c52465NJj = new C52465NJj(c52457NJb);
        NK1 nk1 = new NK1(userSession, c52457NJb, this.A0N, this.A0S, this.A0T);
        P0I p0i = this.A0D;
        Application application = this.A00;
        NKO nko = new NKO(AbstractC166987dD.A0O(application), userSession, p0i, c52457NJb, null, false);
        NKC nkc = new NKC(userSession, c52457NJb);
        boolean z4 = this.A0Q;
        InterfaceC11380iw interfaceC11380iw = this.A06;
        NKJ nkj = new NKJ(interfaceC11380iw, userSession, c52457NJb, z4);
        NK2 nk2 = new NK2(interfaceC11380iw, userSession, c52457NJb, z, z2, z4);
        String str2 = this.A0L;
        NKH nkh = new NKH(interfaceC11380iw, userSession, c52457NJb, str2);
        NK3 nk3 = new NK3(c52457NJb);
        NK8 nk8 = new NK8(c52457NJb);
        C52475NJt c52475NJt = new C52475NJt(userSession, c52457NJb);
        NK7 nk7 = new NK7(userSession, c52457NJb, z3);
        NKM nkm = new NKM(this.A02, userSession, c52457NJb, this.A0E, this.A0F, this.A0H, interfaceC11380iw.getModuleName(), z, z2, z3);
        NK5 nk5 = new NK5(userSession, c52457NJb, this.A0G);
        C52474NJs c52474NJs = new C52474NJs(userSession, c52457NJb);
        C52464NJi c52464NJi = new C52464NJi(c52457NJb);
        C52481NJz c52481NJz = new C52481NJz(c52457NJb);
        C52466NJk c52466NJk = new C52466NJk(c52457NJb);
        NK4 nk4 = new NK4(c52457NJb);
        NKF nkf = new NKF(c07x, userSession, c52457NJb);
        NKK nkk = new NKK(AbstractC166987dD.A0O(application), p0i.A00, interfaceC11380iw, userSession, c52457NJb);
        C52473NJr c52473NJr = new C52473NJr(userSession, EnumC53117NeU.A02, c52457NJb, z3);
        C52471NJp c52471NJp = new C52471NJp(userSession, c52457NJb);
        NKB nkb = new NKB(userSession, c52457NJb);
        TrialUseCase trialUseCase = new TrialUseCase(interfaceC11380iw, userSession, c52457NJb, z2, z3);
        NKG nkg = new NKG(AbstractC166987dD.A0O(application), userSession, c52457NJb);
        PendingRecipient pendingRecipient = this.A0I;
        NK0 nk0 = new NK0(interfaceC11380iw, userSession, c52457NJb, pendingRecipient);
        C52477NJv c52477NJv = new C52477NJv(userSession, c52457NJb, interfaceC11380iw.getModuleName());
        C52469NJn c52469NJn = new C52469NJn(userSession, c52457NJb, str, this.A0J);
        C52476NJu c52476NJu = new C52476NJu(userSession, c52457NJb, z3);
        C52472NJq c52472NJq = new C52472NJq(userSession, c52457NJb);
        C44466JlY c44466JlY = this.A04;
        C50991Mfy c50991Mfy = this.A09;
        C50994Mg1 c50994Mg1 = this.A0C;
        return new NJR(application, c07x, this.A03, c44466JlY, this.A05, userSession, c52468NJm, c50991Mfy, c50994Mg1, njm, c52464NJi, c52481NJz, nkj, c52471NJp, nkb, nk3, nk9, c52465NJj, c52472NJq, nkn, c52473NJr, c52457NJb, nk8, c52474NJs, c52477NJv, c52469NJn, nko, nkf, nk1, nkh, nk0, c52475NJt, nkk, c52476NJu, nk7, nkg, nk2, c52466NJk, nk4, trialUseCase, nkc, nk5, nkm, pendingRecipient, str2, z3);
    }

    public C52331NDu(Application application, C07X c07x, CallerContext callerContext, C44475Jlh c44475Jlh, C44466JlY c44466JlY, C50880MeB c50880MeB, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ClipsSharingDraftViewModel clipsSharingDraftViewModel, C50991Mfy c50991Mfy, OVl oVl, C54818OKt c54818OKt, C50994Mg1 c50994Mg1, P0I p0i, C51022MgU c51022MgU, C50899MeU c50899MeU, C50997Mg4 c50997Mg4, C8B7 c8b7, PendingRecipient pendingRecipient, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AbstractC25234BEr.A1R(callerContext, clipsSharingDraftViewModel, c50997Mg4, c51022MgU, c50899MeU);
        C14360o3.A0B(c44466JlY, 7);
        AbstractC25234BEr.A0l(8, c50991Mfy, c50994Mg1, c50880MeB, c44475Jlh);
        AbstractC25229BEm.A1O(userSession, 14, oVl);
        C14360o3.A0B(p0i, 17);
        C14360o3.A0B(interfaceC11380iw, 18);
        C14360o3.A0B(str3, 21);
        this.A00 = application;
        this.A02 = callerContext;
        this.A08 = clipsSharingDraftViewModel;
        this.A0G = c50997Mg4;
        this.A0E = c51022MgU;
        this.A0F = c50899MeU;
        this.A04 = c44466JlY;
        this.A09 = c50991Mfy;
        this.A0C = c50994Mg1;
        this.A05 = c50880MeB;
        this.A03 = c44475Jlh;
        this.A0H = c8b7;
        this.A01 = c07x;
        this.A07 = userSession;
        this.A0A = oVl;
        this.A0B = c54818OKt;
        this.A0D = p0i;
        this.A06 = interfaceC11380iw;
        this.A0K = str;
        this.A0J = str2;
        this.A0L = str3;
        this.A0R = z;
        this.A0O = z2;
        this.A0P = z3;
        this.A0Q = z4;
        this.A0N = z5;
        this.A0S = z6;
        this.A0T = z7;
        this.A0I = pendingRecipient;
        this.A0M = z8;
    }
}
