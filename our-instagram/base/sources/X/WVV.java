package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WVV implements XGp {
    public long A00;
    public XGp A01;
    public WVW A02;
    public ColorFilter A04;
    public Rect A05;
    public final C0JO A06;
    public final ScheduledExecutorService A08;
    public boolean A03 = false;
    public final Runnable A07 = new RunnableC71242WqX(this);

    public static synchronized void A00(WVV wvv) {
        synchronized (wvv) {
            if (!wvv.A03) {
                wvv.A03 = true;
                wvv.A08.schedule(wvv.A07, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // X.XGp
    public final boolean AQi(Canvas canvas, Drawable drawable, int i) {
        this.A00 = this.A06.now();
        boolean A1M = AbstractC167007dF.A1M(this.A01.AQi(canvas, drawable, i) ? 1 : 0);
        A00(this);
        return A1M;
    }

    @Override // X.InterfaceC71970XDc
    public final int B8b(int i) {
        return this.A01.B8b(i);
    }

    @Override // X.XGp
    public final int BJF() {
        return this.A01.BJF();
    }

    @Override // X.XGp
    public final int BJI() {
        return this.A01.BJI();
    }

    @Override // X.InterfaceC71970XDc
    public final int BPM() {
        return this.A01.BPM();
    }

    @Override // X.XGp
    public final void EPb(int i) {
        this.A01.EPb(i);
    }

    @Override // X.XGp
    public final void EPi(C68673Va9 c68673Va9) {
        this.A01.EPi(c68673Va9);
    }

    @Override // X.XGp
    public final void EQS(Rect rect) {
        this.A01.EQS(rect);
        this.A05 = rect;
    }

    @Override // X.XGp
    public final void ERi(ColorFilter colorFilter) {
        this.A01.ERi(colorFilter);
        this.A04 = colorFilter;
    }

    @Override // X.InterfaceC71970XDc
    public final int getFrameCount() {
        return this.A01.getFrameCount();
    }

    @Override // X.InterfaceC71970XDc
    public final int getLoopCount() {
        return this.A01.getLoopCount();
    }

    public WVV(C0JO c0jo, XGp xGp, WVW wvw, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = xGp;
        this.A02 = wvw;
        this.A06 = c0jo;
        this.A08 = scheduledExecutorService;
    }
}
