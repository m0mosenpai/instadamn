package X;

import android.content.Context;
import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;

/* renamed from: X.8br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190338br {
    public boolean A00;
    public final C208579Kr A01;
    public final C208589Ks A02;
    public final C677933t A03;
    public final C208569Kq A04;
    public final C95334Qt A05;
    public final UserSession A06;

    public final void A00(final int i) {
        C677933t c677933t = this.A03;
        c677933t.A06(false);
        if (!this.A00) {
            final C208569Kq c208569Kq = this.A04;
            if (c208569Kq.A00 != null) {
                c208569Kq.A00();
            }
            final long j = i;
            c208569Kq.A00 = new CountDownTimer(j) { // from class: X.9T6
                @Override // android.os.CountDownTimer
                public final void onTick(long j2) {
                    float f = (float) j2;
                    float f2 = i;
                    float f3 = 0.0f - f2;
                    float f4 = 1.0f - 0.0f;
                    float f5 = 0.0f;
                    if (f3 != 0.0f) {
                        f5 = (f - f2) / f3;
                    }
                    C208569Kq c208569Kq2 = c208569Kq;
                    c208569Kq2.A02.A00(c208569Kq2.A01.getInterpolation((f5 * f4) + 0.0f));
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    c208569Kq.A02.A00(1.0f);
                }
            };
            c208569Kq.A02.A00(0.0f);
            CountDownTimer countDownTimer = c208569Kq.A00;
            if (countDownTimer != null) {
                countDownTimer.start();
            }
            C208589Ks c208589Ks = this.A02;
            c208589Ks.A01 = true;
            c208589Ks.A03.clear();
            C1815383g c1815383g = c208589Ks.A00;
            if (c1815383g != null) {
                c1815383g.A05(c208589Ks);
            }
            this.A05.start();
            c677933t.A01();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public C190338br(Context context, UserSession userSession, C208579Kr c208579Kr, C677933t c677933t) {
        this.A06 = userSession;
        this.A03 = c677933t;
        this.A01 = c208579Kr;
        C95334Qt c95334Qt = new C95334Qt(context, userSession, "recording_backing");
        this.A05 = c95334Qt;
        C208589Ks c208589Ks = new C208589Ks(c208579Kr, c677933t, c95334Qt);
        this.A02 = c208589Ks;
        c95334Qt.A0M = c208589Ks;
        c95334Qt.EhH(1.0f);
        this.A04 = new C208569Kq(new C208599Kt(this));
    }
}
