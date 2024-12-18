package X;

import android.R;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* loaded from: classes6.dex */
public final class EUS extends C1P1 {
    public long A00;
    public final String A01 = "phone_id";
    public final /* synthetic */ C32288EKb A02;

    public EUS(C32288EKb c32288EKb) {
        this.A02 = c32288EKb;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1831560887);
        super.onFail(abstractC115105If);
        C07270a1 c07270a1 = this.A02.A05;
        double A00 = AbstractC31177DnL.A00(c07270a1);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "show_continue_as_failed");
        AbstractC31179DnN.A16(A0f, A00, A002);
        AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A002);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC31171DnF.A1A(A0f, "landing");
        AbstractC35274Fh9.A08(A0f, c07270a1);
        C0f9.A0A(1451830526, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1185498701);
        C07270a1 c07270a1 = this.A02.A05;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C14360o3.A0B(c07270a1, 0);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "show_continue_as_finished");
        AbstractC31179DnN.A18(A0f, A01, A00);
        AbstractC31171DnF.A1A(A0f, "landing");
        A0f.A9K("ts", Long.valueOf(elapsedRealtime));
        AbstractC35274Fh9.A0D(A0f, "waterfall_id", C1Q9.A01());
        A0f.AAP("release_channel", null);
        A0f.AAP(CacheBehaviorLogger.SOURCE, null);
        AbstractC31172DnG.A1O(A0f);
        A0f.Cht();
        C0f9.A0A(-1283061582, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-141495388);
        this.A00 = SystemClock.elapsedRealtime();
        C0f9.A0A(-806559348, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(2083097532);
        ED7 ed7 = (ED7) obj;
        int A032 = C0f9.A03(-1588751818);
        C32288EKb c32288EKb = this.A02;
        if (c32288EKb.A0A && "phone_id".equals(this.A01)) {
            C35037FcA A06 = C1Q9.A0H.A02(c32288EKb.A05).A06(null, EnumC31713DwI.A0r);
            synchronized (C35037FcA.A00(A06)) {
            }
            synchronized (C35037FcA.A00(A06)) {
            }
            synchronized (C35037FcA.A00(A06)) {
            }
            synchronized (C35037FcA.A00(A06)) {
            }
            A06.A02();
            i = -1473518509;
        } else if (!ed7.A04) {
            C07270a1 c07270a1 = c32288EKb.A05;
            String str = this.A01;
            AbstractC167017dG.A1O(c07270a1, str);
            double A01 = AbstractC31171DnF.A01();
            double A00 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c07270a1), "show_continue_as_user_not_found");
            AbstractC31179DnN.A18(A0f, A01, A00);
            AbstractC31175DnJ.A0y(A0f);
            AbstractC31171DnF.A1A(A0f, "landing");
            AbstractC35274Fh9.A04(A0f);
            AbstractC35274Fh9.A09(A0f, c07270a1);
            AbstractC31180DnO.A1I(A0f, str);
            i = -1586535647;
        } else {
            if (!TextUtils.isEmpty(null)) {
                String str2 = ed7.A02;
                String str3 = ed7.A00;
                C14360o3.A0B(null, 0);
                AbstractC33580Ess.A00 = new Pair(null, str3);
                AbstractC33580Ess.A01 = new Pair(null, str2);
            }
            String A0u = AbstractC31174DnI.A0u((TextView) c32288EKb.A02.getCurrentView());
            boolean z = false;
            String A0w = AbstractC31174DnI.A0w(c32288EKb, ed7.A01, 2131956788);
            if (!A0w.equals(A0u)) {
                c32288EKb.A02.setText(A0w);
            }
            if (c32288EKb.A03 != null && (z = AbstractC31171DnF.A1X(ed7.A03))) {
                int integer = AbstractC166997dE.A0N(c32288EKb).getInteger(R.integer.config_mediumAnimTime);
                c32288EKb.A03.setAlpha(0.0f);
                c32288EKb.A03.setText(ed7.A03);
                c32288EKb.A03.animate().alpha(1.0f).setDuration(integer).start();
            }
            C07270a1 c07270a12 = c32288EKb.A05;
            EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0r;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - c32288EKb.A00);
            Boolean valueOf2 = Boolean.valueOf(z);
            C14360o3.A0B(c07270a12, 0);
            FDA.A00(c07270a12, enumC31713DwI, valueOf2, valueOf);
            i = 784446352;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(394506618, A03);
    }
}
