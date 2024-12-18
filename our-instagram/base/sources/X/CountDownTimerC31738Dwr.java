package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.Dwr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC31738Dwr extends CountDownTimer {
    public final C32271EJg A00;
    public final DateFormat A01;

    public CountDownTimerC31738Dwr(C32271EJg c32271EJg, long j) {
        super(j, 1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("m:ss", Locale.US);
        this.A01 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.A00 = c32271EJg;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C32271EJg c32271EJg = this.A00;
        TextView textView = c32271EJg.A03;
        if (textView != null) {
            AbstractC25227BEk.A12(textView, c32271EJg, 2131972602);
            if (c32271EJg.mArguments != null) {
                C0J8.A03(c32271EJg.A07, "createRobocallRequest() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
                Context requireContext = c32271EJg.requireContext();
                UserSession userSession = c32271EJg.A07;
                String A0j = AbstractC31173DnH.A0j(c32271EJg.requireArguments(), PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
                C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
                A0M.A0B("accounts/robocall_user/");
                AbstractC31179DnN.A0j(requireContext, A0M, AbstractC31182DnR.A03(), A0j);
                A0M.A0R = true;
                C1ON A0S = AbstractC31172DnG.A0S(A0M, EDV.class, C34810FVm.class);
                A0S.A00 = new C32513ETp(c32271EJg.requireContext(), AbstractC31180DnO.A0T(c32271EJg), c32271EJg.A07.token);
                c32271EJg.schedule(A0S);
            }
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Date date = new Date(j);
        C32271EJg c32271EJg = this.A00;
        String format = this.A01.format(date);
        TextView textView = c32271EJg.A03;
        if (textView != null) {
            AbstractC31177DnL.A10(textView, c32271EJg, format, 2131972603);
        }
    }
}
