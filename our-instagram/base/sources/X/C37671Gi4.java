package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gi4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37671Gi4 extends AbstractC116895Qv implements JIH {
    public C50627MWo A00;
    public Integer A02;
    public final UserSession A05;
    public final C1M1 A06;
    public final C13920nI A03 = C13920nI.A00;
    public final C23541Cq A04 = new C23541Cq();
    public C23541Cq A01 = new C23541Cq();

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        A02(true);
        this.A04.A01.clear();
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C110974z9 A00 = this.A01.A00(c38321qM);
            C14360o3.A0B(this.A03, 0);
            IEM iem = A00.A0A;
            iem.A01 = i + (i2 * A00.A07.A01);
            iem.A00 = System.currentTimeMillis() / 1000;
            this.A01.A00(c38321qM).A0B = Double.valueOf((i / i2) + r6.A07.A01);
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C110974z9 A00 = this.A01.A00(c38321qM);
            C14360o3.A0B(this.A03, 0);
            IEL iel = A00.A07;
            iel.A01++;
            iel.A00 = AbstractC31177DnL.A06();
        }
    }

    public static final void A00(C37671Gi4 c37671Gi4, Integer num) {
        if (c37671Gi4.A00 != null) {
            C0f5 AEp = C18950wb.A01.AEp("ClipsViewerSessionMediaInfo#onDestinationEntry", 817902720);
            AEp.ABW(DialogModule.KEY_MESSAGE, "Entering destination when previous destination has not been finalized");
            AEp.report();
        }
        c37671Gi4.A02 = num;
        C50627MWo c50627MWo = new C50627MWo(null, null, 1, 28);
        C14360o3.A0B(c37671Gi4.A03, 0);
        c50627MWo.A00 = AbstractC31173DnH.A0g();
        c37671Gi4.A00 = c50627MWo;
    }

    public final String A01() {
        C23541Cq c23541Cq = this.A04;
        c23541Cq.A01(this.A01);
        this.A01 = new C23541Cq();
        try {
            c23541Cq.A00 = this.A06.getSessionId();
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            String str = c23541Cq.A00;
            if (str != null) {
                A0S.A0S(AbstractC31192Dnb.A00(42, 10, 38), str);
            }
            Map map = c23541Cq.A01;
            A0S.A0r("media_info");
            A0S.A0d();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                if (!C16V.A04(A0S, entry)) {
                    C110974z9 c110974z9 = (C110974z9) entry.getValue();
                    A0S.A0d();
                    IEM iem = c110974z9.A0A;
                    A0S.A0r("total_watch_time_ms");
                    A0S.A0d();
                    A0S.A0R(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, iem.A01);
                    A0S.A0R("latest_play_end_ts", iem.A00);
                    A0S.A0a();
                    IEL iel = c110974z9.A07;
                    A0S.A0r("num_loops");
                    A0S.A0d();
                    A0S.A0R(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, iel.A01);
                    A0S.A0R("last_loop_end_ts", iel.A00);
                    A0S.A0a();
                    if (c110974z9.A08 != null) {
                        A0S.A0r("reshare_button_tap");
                        C40943IBq c40943IBq = c110974z9.A08;
                        A0S.A0d();
                        A0S.A0T("did_tap", c40943IBq.A00);
                        A0S.A0a();
                    }
                    if (c110974z9.A04 != null) {
                        A0S.A0r("external_reshare_button_tap");
                        C40940IBn c40940IBn = c110974z9.A04;
                        A0S.A0d();
                        A0S.A0T("did_tap", c40940IBn.A00);
                        A0S.A0a();
                    }
                    if (c110974z9.A02 != null) {
                        A0S.A0r("profile_visit");
                        AbstractC40563Hyj.A00(c110974z9.A02, A0S);
                    }
                    if (c110974z9.A00 != null) {
                        A0S.A0r("audio_page_visit");
                        AbstractC40563Hyj.A00(c110974z9.A00, A0S);
                    }
                    if (c110974z9.A01 != null) {
                        A0S.A0r("effect_page_visit");
                        AbstractC40563Hyj.A00(c110974z9.A01, A0S);
                    }
                    if (c110974z9.A03 != null) {
                        A0S.A0r("comment_button_tap");
                        C40939IBm c40939IBm = c110974z9.A03;
                        A0S.A0d();
                        A0S.A0T("did_tap", c40939IBm.A00);
                        A0S.A0a();
                    }
                    if (c110974z9.A09 != null) {
                        A0S.A0r("screenshot");
                        C40944IBr c40944IBr = c110974z9.A09;
                        A0S.A0d();
                        A0S.A0T("did_capture", c40944IBr.A00);
                        A0S.A0a();
                    }
                    if (c110974z9.A05 != null) {
                        A0S.A0r(AbstractC111324zv.A00(1028));
                        C40941IBo c40941IBo = c110974z9.A05;
                        A0S.A0d();
                        A0S.A0T("impression_control_button_tap", c40941IBo.A00);
                        A0S.A0a();
                    }
                    if (c110974z9.A06 != null) {
                        A0S.A0r("not_interested");
                        C40942IBp c40942IBp = c110974z9.A06;
                        A0S.A0d();
                        A0S.A0T("impression_control_button_tap", c40942IBp.A00);
                        A0S.A0a();
                    }
                    A0S.A0a();
                }
            }
            A0S.A0a();
            return AbstractC167017dG.A0l(A0S, A0O);
        } catch (IOException unused) {
            return null;
        }
    }

    public final void A02(boolean z) {
        C23541Cq c23541Cq;
        C23531Cp A00 = AbstractC23521Co.A00(this.A05);
        if (z) {
            c23541Cq = this.A04;
        } else {
            c23541Cq = this.A01;
        }
        C14360o3.A0B(c23541Cq, 0);
        if (C18U.A06(C06090Tz.A05, A00.A01, 36323109654440966L)) {
            A00.A00.A01(c23541Cq);
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public C37671Gi4(UserSession userSession) {
        this.A05 = userSession;
        this.A06 = AbstractC37497GfF.A00(userSession);
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
