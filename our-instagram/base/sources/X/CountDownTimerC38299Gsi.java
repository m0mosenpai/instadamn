package X;

import android.os.CountDownTimer;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.Gsi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CountDownTimerC38299Gsi extends CountDownTimer {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ C115645La A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ L72 A03;
    public final /* synthetic */ UpcomingEvent A04;
    public final /* synthetic */ Date A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC38299Gsi(IgTextView igTextView, C115645La c115645La, C75113Zb c75113Zb, L72 l72, UpcomingEvent upcomingEvent, Date date, long j) {
        super(j, 1000L);
        this.A00 = igTextView;
        this.A03 = l72;
        this.A05 = date;
        this.A04 = upcomingEvent;
        this.A01 = c115645La;
        this.A02 = c75113Zb;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.A01.A00(this.A02);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.A00.setText(this.A03.A00(AbstractC41774Ieq.A03(this.A04), this.A05));
    }
}
