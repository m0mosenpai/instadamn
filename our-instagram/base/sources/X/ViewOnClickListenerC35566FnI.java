package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.FnI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35566FnI implements View.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public ViewOnClickListenerC35566FnI(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        if (this.A00 != 0) {
            A05 = C0f9.A05(-695790679);
            ViewOnClickListenerC35610Fo1 viewOnClickListenerC35610Fo1 = (ViewOnClickListenerC35610Fo1) this.A02;
            UserSession userSession = ((TimeSpentReminderFullyBlockingFragment) viewOnClickListenerC35610Fo1.A01).A01;
            Fragment fragment = (Fragment) viewOnClickListenerC35610Fo1.A04;
            C62862tP A0N = AbstractC31172DnG.A0N(fragment, userSession);
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            new BitSet(0);
            A1G.put("requested_extension_time_seconds", Long.valueOf(this.A01));
            A1G.put("timezone_offset_seconds_from_gmt", Long.valueOf(C23831Eq.A00()));
            FTe.A00(new C36028FvQ(this, 5), "com.bloks.www.yp.time_limits.time_limit_extension_request_time.async", A1G, A1G2).A00(fragment.requireActivity(), A0N);
            i = 1821583227;
        } else {
            A05 = C0f9.A05(1342525570);
            FI8 fi8 = ((C33189Ekb) this.A02).A00;
            if (fi8 == null) {
                C14360o3.A0F("dailyLimitRemindAgainMenuItemListener");
                throw C00O.createAndThrow();
            }
            long j = this.A01;
            TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = (TimeSpentReminderFullyBlockingFragment) fi8.A00.A01;
            C18920wW A0L = AbstractC31176DnK.A0L(null, timeSpentReminderFullyBlockingFragment.A01);
            if (j == 300) {
                str = "daily_limit_reminder_in_5_mins_button";
            } else {
                str = "daily_limit_reminder_in_15_mins_button";
            }
            AbstractC31179DnN.A14(A0L, "daily_limit_reminder", str);
            long A06 = AbstractC31177DnL.A06();
            AnonymousClass280.A01.A09(timeSpentReminderFullyBlockingFragment.A01, A06 + j);
            AbstractC25231BEo.A16(timeSpentReminderFullyBlockingFragment);
            C455127l.A03(timeSpentReminderFullyBlockingFragment.A01).A0S();
            i = -1345813632;
        }
        C0f9.A0C(i, A05);
    }
}
