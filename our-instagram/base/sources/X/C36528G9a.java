package X;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.G9a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36528G9a implements GZE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ GY5 A03;
    public final /* synthetic */ C35231FgO A04;
    public final /* synthetic */ EnumC31713DwI A05;
    public final /* synthetic */ String A06;

    public C36528G9a(Activity activity, AbstractC12990ll abstractC12990ll, GY5 gy5, C35231FgO c35231FgO, EnumC31713DwI enumC31713DwI, String str, long j) {
        this.A04 = c35231FgO;
        this.A01 = activity;
        this.A02 = abstractC12990ll;
        this.A05 = enumC31713DwI;
        this.A00 = j;
        this.A03 = gy5;
        this.A06 = str;
    }

    @Override // X.GZE
    public final void DqC(String str) {
        Pattern pattern;
        Activity activity = this.A01;
        if (LHp.A00(activity)) {
            C14360o3.A0B(str, 0);
            pattern = C35118FeL.A01;
        } else {
            C14360o3.A0B(str, 0);
            pattern = C35118FeL.A03;
        }
        C14360o3.A08(pattern);
        String A00 = C35118FeL.A00(str, pattern);
        if (!TextUtils.isEmpty(A00)) {
            AbstractC12990ll abstractC12990ll = this.A02;
            String str2 = this.A05.A01;
            double elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
            double A002 = AbstractC31174DnI.A00(str2, 1);
            double A003 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_sms_retriever_received_sms");
            AbstractC31176DnK.A1K(A0f, A002);
            A0f.A8I("duration", Double.valueOf(elapsedRealtime));
            AbstractC31177DnL.A1B(A0f, A002, A003);
            AbstractC35274Fh9.A05(A0f);
            AbstractC35274Fh9.A06(A0f);
            AbstractC31177DnL.A1G(A0f, "release_channel", AbstractC35274Fh9.A01(), A003);
            AbstractC31171DnF.A1A(A0f, str2);
            AbstractC31179DnN.A15(A0f);
            AbstractC35274Fh9.A0B(A0f, abstractC12990ll);
            this.A03.Dhw(activity, A00, this.A06);
            return;
        }
        C35231FgO.A02(this.A02, this.A05, "parse_error", SystemClock.elapsedRealtime() - this.A00);
    }

    @Override // X.GZE
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null && A01.getMessage() != null) {
            str = A01.getMessage();
        } else {
            str = "unknown";
        }
        if (MSV.A00(595).equals(str)) {
            C35231FgO c35231FgO = this.A04;
            C35231FgO.A00(this.A01, this.A02, c35231FgO, this.A06);
        }
        C35231FgO.A02(this.A02, this.A05, str, SystemClock.elapsedRealtime() - this.A00);
    }
}
