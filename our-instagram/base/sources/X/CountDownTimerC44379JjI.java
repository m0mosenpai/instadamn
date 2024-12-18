package X;

import android.os.CountDownTimer;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.direct.ui.countertextview.CounterTextView;

/* renamed from: X.JjI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CountDownTimerC44379JjI extends CountDownTimer {
    public boolean A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ CountdownTimerPill A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC44379JjI(CountdownTimerPill countdownTimerPill, InterfaceC16820sZ interfaceC16820sZ, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        super(j3, j4);
        this.A03 = countdownTimerPill;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = interfaceC16820sZ;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (!this.A00) {
            InterfaceC16820sZ interfaceC16820sZ = this.A04;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
            this.A00 = true;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        CountdownTimerPill countdownTimerPill = this.A03;
        CounterTextView counterTextView = countdownTimerPill.A03;
        counterTextView.A06((int) this.A01, CountdownTimerPill.A00(countdownTimerPill, j, this.A02, this.A06), true);
        if (j < CountdownTimerPill.A04) {
            if (this.A05) {
                counterTextView.setVisibility(4);
                countdownTimerPill.A02.A06.start();
                CountDownTimer countDownTimer = countdownTimerPill.A00;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
            }
            if (!this.A00) {
                InterfaceC16820sZ interfaceC16820sZ = this.A04;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                this.A00 = true;
            }
        }
    }
}
