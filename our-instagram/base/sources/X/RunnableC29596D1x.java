package X;

import android.os.CountDownTimer;

/* renamed from: X.D1x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29596D1x implements Runnable {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ C25371BKo A01;

    public RunnableC29596D1x(C120985dq c120985dq, C25371BKo c25371BKo) {
        this.A01 = c25371BKo;
        this.A00 = c120985dq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        C25371BKo c25371BKo = this.A01;
        C120985dq c120985dq = this.A00;
        Long A01 = C25371BKo.A01(c120985dq, c25371BKo);
        if (A01 != null) {
            j = A01.longValue();
            j2 = c25371BKo.A0L;
            if (j == j2) {
                j = j2;
            }
        } else {
            j = c25371BKo.A0L;
            j2 = j;
        }
        c25371BKo.A05 = j;
        if (j == j2 && !c25371BKo.A0C) {
            C25371BKo.A06(c25371BKo, C05F.A0C);
            c25371BKo.A0C = true;
        } else if (!c25371BKo.A0F) {
            C25371BKo.A06(c25371BKo, C05F.A0Y);
        }
        c25371BKo.A0F = false;
        CountDownTimer countDownTimer = c25371BKo.A07;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c25371BKo.A06.cancel();
        c25371BKo.A07 = new U92(c120985dq, c25371BKo, c25371BKo.A05).start();
        C25371BKo.A05(c25371BKo);
    }
}
