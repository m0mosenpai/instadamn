package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC98524bV extends Handler implements Runnable {
    public int A00;
    public C98014ag A01;
    public IOException A02;
    public C4YW A03;
    public Thread A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final InterfaceC98244b3 A08;
    public volatile boolean A09;
    public final /* synthetic */ C98004af A0A;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                try {
                    z = false;
                    if (!this.A05) {
                        z = true;
                    }
                    this.A04 = Thread.currentThread();
                } finally {
                }
            }
            if (z) {
                InterfaceC98244b3 interfaceC98244b3 = this.A08;
                AbstractC460729r.A01(AnonymousClass001.A0R("load:", interfaceC98244b3.getClass().getSimpleName()));
                try {
                    interfaceC98244b3.ChG();
                    AbstractC460729r.A00();
                } catch (Throwable th) {
                    AbstractC460729r.A00();
                    throw th;
                }
            }
            synchronized (this) {
                try {
                    this.A04 = null;
                    Thread.interrupted();
                } finally {
                }
            }
            if (!this.A09) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.A09) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (OutOfMemoryError e2) {
            if (!this.A09) {
                AbstractC46512Bo.A05("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(2, new C222479ro(e2)).sendToTarget();
            }
        } catch (Error e3) {
            if (!this.A09) {
                AbstractC46512Bo.A05("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (!this.A09) {
                AbstractC46512Bo.A05("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(2, new C222479ro(e4)).sendToTarget();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC98524bV(Looper looper, C4YW c4yw, InterfaceC98244b3 interfaceC98244b3, C98004af c98004af, int i, long j) {
        super(looper);
        this.A0A = c98004af;
        this.A08 = interfaceC98244b3;
        this.A03 = c4yw;
        this.A06 = i;
        this.A07 = j;
    }

    public final void A01(boolean z) {
        this.A09 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            this.A05 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            synchronized (this) {
                this.A05 = true;
                this.A08.AGY();
                Thread thread = this.A04;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (!z) {
                return;
            }
        }
        this.A0A.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C4YW c4yw = this.A03;
        c4yw.getClass();
        c4yw.DPZ(this.A08, elapsedRealtime, elapsedRealtime - this.A07, true);
        this.A03 = null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.A09) {
            int i = message.what;
            if (i != 0) {
                if (i != 3) {
                    C98004af c98004af = this.A0A;
                    c98004af.A01 = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.A07;
                    C4YW c4yw = this.A03;
                    c4yw.getClass();
                    if (this.A05) {
                        c4yw.DPZ(this.A08, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return;
                        }
                        IOException iOException = (IOException) message.obj;
                        this.A02 = iOException;
                        int i3 = this.A00 + 1;
                        this.A00 = i3;
                        C98014ag DPf = c4yw.DPf(this.A08, iOException, i3, elapsedRealtime, j);
                        this.A01 = DPf;
                        int i4 = DPf.A00;
                        if (i4 == 3) {
                            c98004af.A02 = this.A02;
                            return;
                        }
                        if (i4 == 2) {
                            return;
                        }
                        if (i4 == 1) {
                            this.A00 = 1;
                        }
                        long j2 = DPf.A01;
                        if (j2 == -9223372036854775807L) {
                            j2 = (int) Math.min(((this.A00 - 1) * 1000) + 500, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        }
                        boolean z = false;
                        if (c98004af.A01 == null) {
                            z = true;
                        }
                        C4B8.A04(z);
                        c98004af.A01 = this;
                        if (j2 > 0) {
                            sendEmptyMessageDelayed(0, j2);
                            return;
                        }
                    } else {
                        try {
                            c4yw.DPd(this.A08, elapsedRealtime, j);
                            return;
                        } catch (RuntimeException e) {
                            AbstractC46512Bo.A05("LoadTask", "Unexpected exception handling load completed", e);
                            c98004af.A02 = new C222479ro(e);
                            return;
                        }
                    }
                } else {
                    throw ((Throwable) message.obj);
                }
            }
            A00(this);
        }
    }

    public static void A00(HandlerC98524bV handlerC98524bV) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        handlerC98524bV.A03.DPv(handlerC98524bV.A08, handlerC98524bV.A00, elapsedRealtime, elapsedRealtime - handlerC98524bV.A07);
        handlerC98524bV.A02 = null;
        C98004af c98004af = handlerC98524bV.A0A;
        ExecutorService executorService = c98004af.A03;
        HandlerC98524bV handlerC98524bV2 = c98004af.A01;
        handlerC98524bV2.getClass();
        executorService.execute(handlerC98524bV2);
    }
}
