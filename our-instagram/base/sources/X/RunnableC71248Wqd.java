package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Wqd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71248Wqd implements Runnable {
    public final /* synthetic */ C66542ULx A00;

    public RunnableC71248Wqd(C66542ULx c66542ULx) {
        this.A00 = c66542ULx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66542ULx c66542ULx = this.A00;
        if (((AbstractC68892Vdo) c66542ULx).A00) {
            AbstractC66543ULy.A04(c66542ULx, AbstractC31173DnH.A0g(), "CURRENT_TIME_UPDATED");
            LiveLocationSession liveLocationSession = C66542ULx.A00(c66542ULx).A03;
            if (liveLocationSession != null) {
                long j = liveLocationSession.A00;
                if (j != -1 && j <= System.currentTimeMillis()) {
                    C66542ULx.A03(c66542ULx, liveLocationSession, false);
                }
            }
            c66542ULx.A00.postDelayed(this, 10000L);
        }
    }
}
