package X;

import android.content.Context;
import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.Gsh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CountDownTimerC38298Gsh extends CountDownTimer {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C6UI A03;
    public final /* synthetic */ UpcomingEvent A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC38298Gsh(Context context, UserSession userSession, C6UI c6ui, UpcomingEvent upcomingEvent, float f, long j) {
        super(j, 1000L);
        this.A03 = c6ui;
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = upcomingEvent;
        this.A00 = f;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C6UJ c6uj = this.A03.A02;
        Context context = this.A01;
        UpcomingEvent upcomingEvent = this.A04;
        c6uj.A00(context, new L72(context, C13920nI.A00).A00(AbstractC41774Ieq.A03(upcomingEvent), new Date(AbstractC41774Ieq.A01(upcomingEvent))), this.A00);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        cancel();
    }
}
