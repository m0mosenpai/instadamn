package X;

import android.os.Handler;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;

/* loaded from: classes6.dex */
public final class GNF implements Runnable {
    public final /* synthetic */ TimeSpentReminderFullyBlockingFragment A00;

    public GNF(TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment) {
        this.A00 = timeSpentReminderFullyBlockingFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = this.A00;
        if (timeSpentReminderFullyBlockingFragment.A02.ordinal() == 0) {
            if (AbstractC31174DnI.A1Z(timeSpentReminderFullyBlockingFragment)) {
                AbstractC34359FDb.A00(ScreenTimeScreenType.A04, timeSpentReminderFullyBlockingFragment.A01, AbstractC31177DnL.A06());
            }
            Handler handler = timeSpentReminderFullyBlockingFragment.A06;
            Runnable runnable = timeSpentReminderFullyBlockingFragment.A07;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 10000L);
        }
    }
}
