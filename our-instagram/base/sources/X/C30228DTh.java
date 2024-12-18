package X;

import android.os.Handler;
import androidx.compose.ui.Modifier;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.ExecutionLogger;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.DTh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30228DTh extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30228DTh(Object obj, Object obj2, String str, String str2, String str3, int i) {
        super(2);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        switch (this.A00) {
            case 0:
                QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) obj;
                C47576Kzm c47576Kzm = (C47576Kzm) obj2;
                boolean A1R = AbstractC167007dF.A1R(0, quickPerformanceLogger, c47576Kzm);
                JZK jzk = (JZK) this.A02;
                LJd lJd = new LJd(quickPerformanceLogger, c47576Kzm, this.A03, this.A04, this.A05, (HashMap) this.A01);
                jzk.A01 = lJd;
                RunnableC29570D0x runnableC29570D0x = new RunnableC29570D0x(jzk);
                C47576Kzm c47576Kzm2 = lJd.A0C;
                String str = lJd.A0F;
                UserSession userSession = c47576Kzm2.A01;
                if (!AbstractC94034Kn.A00(userSession) && (AbstractC166987dD.A1a(AbstractC47132Ef.A00(userSession).A10.get()) || str.equals(AbstractC111324zv.A00(1199)))) {
                    lJd.A05 = runnableC29570D0x;
                    QuickPerformanceLogger quickPerformanceLogger2 = lJd.A0B;
                    String str2 = lJd.A0D;
                    quickPerformanceLogger2.markerStart(755177991, str2.hashCode(), false);
                    ExecutionLogger.activeFlowMarkerStart(755177991);
                    MarkerEditor withMarker = quickPerformanceLogger2.withMarker(755177991);
                    withMarker.setSurviveUserSwitch(A1R);
                    withMarker.markerEditingCompleted();
                    LJd.A00(lJd, null, null, "SyncBatchId", lJd.A0E);
                    LJd.A00(lJd, null, null, AbstractC43591JPw.A00(708), str);
                    LJd.A00(lJd, Boolean.valueOf(A1R), null, "IsPlatform", null);
                    LJd.A00(lJd, null, null, AbstractC43591JPw.A00(707), AbstractC43591JPw.A00(422));
                    long A0N = AbstractC166987dD.A0N(AbstractC47132Ef.A00(userSession).A11.A00());
                    if (A0N > 0) {
                        Handler handler = lJd.A01;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        Handler A0J = AbstractC167007dF.A0J();
                        lJd.A01 = A0J;
                        A0J.postDelayed(new RunnableC49812LzJ(lJd), 1000 * A0N);
                    }
                    AccountSession A02 = C61A.A02(userSession, false);
                    if (A02 != null) {
                        SessionedNotificationCenter sessionedNotificationCenter = A02.getSessionedNotificationCenter();
                        C14360o3.A07(sessionedNotificationCenter);
                        sessionedNotificationCenter.addObserver(lJd.A0A, AbstractC111324zv.A00(3666), A1R ? 1 : 0, null);
                        AccountSession A022 = C61A.A02(userSession, false);
                        if (A022 != null) {
                            SessionedNotificationCenter sessionedNotificationCenter2 = A022.getSessionedNotificationCenter();
                            C14360o3.A07(sessionedNotificationCenter2);
                            sessionedNotificationCenter2.addObserver(lJd.A09, AbstractC43591JPw.A00(657), A1R ? 1 : 0, null);
                            C14360o3.A0C(c47576Kzm2, AbstractC43591JPw.A00(1202));
                            C65076Td9 c65076Td9 = new C65076Td9(27, lJd, c47576Kzm2);
                            C18C.A0F(C14360o3.A0K(userSession.userId, str2));
                            c65076Td9.invoke(LG5.A05.A00(userSession).A02.A01);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    runnableC29570D0x.run();
                }
                return C0eB.A00;
            case 1:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1609423289, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous>.<anonymous>.<anonymous> (FeedPostRow.kt:1341)");
                    }
                    throw AbstractC166987dD.A15("followStatus");
                }
                break;
            default:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1787852380, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetHeader.<anonymous> (ClipsSpinsReplyBottomSheetHeader.kt:33)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
                    Modifier A09 = AbstractC118185Wd.A09(AbstractC25227BEk.A0M(A0T, 10.0f), 54.0f);
                    InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                    C26052Bff c26052Bff = (C26052Bff) this.A02;
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                    String str3 = this.A04;
                    String str4 = this.A03;
                    String str5 = this.A05;
                    InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
                    InterfaceC1127857k A023 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 48);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, A09);
                    InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                    InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A023, A04, interfaceC16620sF);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
                    }
                    InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
                    C6L0 c6l0 = C6L0.A00;
                    BGD.A03(c5Tl, AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c26052Bff.A01)), C29191Ctw.A00);
                    Modifier A0A = AbstractC118175Wb.A0A(c6l0.A00(c1130158n), 12.0f, 8.0f);
                    InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                    int A002 = C5X2.A00(c5Tl);
                    C59P A042 = C117505Tk.A04(c117505Tk);
                    Modifier A012 = C5X3.A01(c5Tl, A0A);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                    C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                    }
                    C5XJ.A00(c5Tl, A012, A1K);
                    Modifier A0E = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 8.0f);
                    InterfaceC1127857k A024 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 54);
                    int A003 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(c117505Tk);
                    Modifier A013 = C5X3.A01(c5Tl, A0E);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                    C5XJ.A00(c5Tl, A024, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                    }
                    C5XJ.A00(c5Tl, A013, A1K);
                    C5WR.A0m(c5Tl, AbstractC25226BEj.A0h(c5Tl), str4, 1, 390, 11262, 0L);
                    c5Tl.Eno(1007813829);
                    if (str5 != null) {
                        long A0M = AbstractC25226BEj.A0M(c5Tl);
                        C5WR.A0M(c5Tl, AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), "•", 54, A0M);
                        long A0M2 = AbstractC25226BEj.A0M(c5Tl);
                        C5WR.A0F(c5Tl, AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), str5, 1, 2, 48, A0M2);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    c5Tl.ASW();
                    C5WR.A0m(c5Tl, AbstractC25226BEj.A0c(c5Tl), str3, 2, 390, 11258, AbstractC25226BEj.A0M(c5Tl));
                    c5Tl.ASW();
                    c5Tl.Eno(1686866360);
                    if (!c26052Bff.A05) {
                        CLM.A00(c5Tl, interfaceC16820sZ, 0, c26052Bff.A06);
                    }
                    if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                        C0fH.A00(-834595904);
                    }
                    return C0eB.A00;
                }
                break;
        }
        c5Tl.Em9();
        return C0eB.A00;
    }
}
