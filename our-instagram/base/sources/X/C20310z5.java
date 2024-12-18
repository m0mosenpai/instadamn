package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.Choreographer;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20310z5 extends C0VQ {
    public static final int A0C = ProvidersRegistry.A00.A02("frames");
    public final C0KE A00;
    public final Runnable A01;
    public final AtomicBoolean A02;
    public final Context A03;
    public final Handler A04;
    public final Runnable A05;
    public final Runnable A06;
    public volatile double A07;
    public volatile int A08;
    public volatile long A09;
    public volatile long A0A;
    public volatile C0KF A0B;

    public C20310z5(Context context) {
        super(null);
        this.A06 = new Runnable() { // from class: X.0WO
            @Override // java.lang.Runnable
            public final void run() {
                C0KF c0kf;
                C20310z5 c20310z5 = C20310z5.this;
                int i = C20310z5.A0C;
                if (c20310z5.A0B == null) {
                    c20310z5.A0B = new C0AU(Choreographer.getInstance(), c20310z5.A00);
                }
                if (c20310z5.A02.get() && c20310z5.A0A != -1 && (c0kf = c20310z5.A0B) != null) {
                    c0kf.ARQ();
                }
            }
        };
        this.A05 = new Runnable() { // from class: X.0WP
            @Override // java.lang.Runnable
            public final void run() {
                C20310z5.A01(C20310z5.this);
            }
        };
        this.A01 = new Runnable() { // from class: X.0WQ
            @Override // java.lang.Runnable
            public final void run() {
                C20310z5 c20310z5 = C20310z5.this;
                int i = C20310z5.A0C;
                long j = c20310z5.A0A;
                if (c20310z5.A02.get() && j != -1) {
                    c20310z5.A07("ScrollPerf.FrameEnded");
                }
            }
        };
        this.A02 = new AtomicBoolean(false);
        this.A0A = -1L;
        this.A0B = null;
        this.A08 = 0;
        this.A07 = 0.0d;
        this.A09 = 0L;
        this.A03 = context;
        this.A04 = new Handler(Looper.getMainLooper());
        this.A00 = new C0KE() { // from class: X.0z4
            @Override // X.C0KE
            public final void DIN(long j) {
                if (j > 0) {
                    C20310z5 c20310z5 = C20310z5.this;
                    int i = C20310z5.A0C;
                    if (c20310z5.A02.get() && c20310z5.A0A != -1) {
                        C0KD c0kd = C0KD.A04;
                        if (c0kd == null) {
                            c0kd = new C0KD();
                            C0KD.A04 = c0kd;
                        }
                        Runnable runnable = c20310z5.A01;
                        if (!c0kd.A03) {
                            Handler handler = c0kd.A00;
                            if (handler == null) {
                                handler = new Handler(Looper.getMainLooper());
                                c0kd.A00 = handler;
                            }
                            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, runnable));
                        } else {
                            try {
                                c0kd.A02.invoke(c0kd.A01, 3, runnable, null);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                        long max = Math.max(1L, j);
                        long round = Math.round((max * 1.0d) / c20310z5.A0A) - 1;
                        c20310z5.A08 = (int) (c20310z5.A08 + round);
                        double d = round;
                        if (d >= 4.0d) {
                            c20310z5.A07 += d / 4.0d;
                        }
                        c20310z5.A09 += max;
                        if (round >= 1) {
                            c20310z5.A02().writeStandardEntry(6, 44, 0L, 0, 8126498, 0, round);
                            c20310z5.A07("ScrollPerf.FrameDropped");
                            if (d >= 4.0d) {
                                c20310z5.A07("ScrollPerf.LargeFrameDropped");
                            }
                        }
                        c20310z5.A07("ScrollPerf.FrameStarted");
                    }
                }
            }
        };
    }

    @Override // X.C0VQ
    public final boolean A06() {
        return true;
    }

    public static void A01(C20310z5 c20310z5) {
        C0KF c0kf = c20310z5.A0B;
        if (c0kf != null) {
            c20310z5.A00(8126532, c20310z5.A0A);
            c20310z5.A00(8126533, c20310z5.A08);
            c20310z5.A00(8126534, c20310z5.A09);
            String valueOf = String.valueOf(c20310z5.A07);
            MultiBufferLogger A02 = c20310z5.A02();
            A02.writeBytesEntry(0, 57, A02.writeBytesEntry(0, 56, A02.writeStandardEntry(6, 52, 0L, 0, 8126535, 0, 0L), "4_frame_drop_uncapped"), valueOf);
            c0kf.APM();
        }
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return A0C;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        if (this.A02.get()) {
            return A0C;
        }
        return 0;
    }

    static {
        TimeUnit.NANOSECONDS.convert(1L, TimeUnit.MILLISECONDS);
    }

    private void A00(int i, long j) {
        A02().writeStandardEntry(6, 52, 0L, 0, i, 0, j);
    }

    public final void A07(String str) {
        MultiBufferLogger A02 = A02();
        A02.writeBytesEntry(1, 83, A02.writeStandardEntry(6, 21, 0L, 0, 0, 0, 0L), str);
        A02.writeStandardEntry(6, 22, 0L, 0, 0, 0, 0L);
    }

    @Override // X.C0VQ
    public final void disable() {
        int i;
        int A03 = C0f9.A03(365365400);
        C0KF c0kf = this.A0B;
        if (!this.A02.getAndSet(false)) {
            i = -536166528;
        } else {
            if (c0kf == null) {
                this.A04.post(this.A05);
            } else {
                A01(this);
            }
            i = 793906493;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C0VQ
    public final void enable() {
        C0KF c0kf;
        int i;
        int A03 = C0f9.A03(2007067407);
        AtomicBoolean atomicBoolean = this.A02;
        if (atomicBoolean.getAndSet(true)) {
            i = 1410611369;
        } else {
            if (this.A0A == -1) {
                C0KH c0kh = C0KH.A01;
                if (c0kh == null) {
                    c0kh = new C0KH();
                    C0KH.A01 = c0kh;
                }
                this.A0A = c0kh.A00(this.A03);
            }
            if (this.A0B == null) {
                if (Process.myTid() == Process.myPid()) {
                    if (this.A0B == null) {
                        this.A0B = new C0AU(Choreographer.getInstance(), this.A00);
                    }
                } else {
                    this.A04.post(this.A06);
                    i = 420174886;
                }
            }
            if (atomicBoolean.get() && this.A0A != -1 && (c0kf = this.A0B) != null) {
                c0kf.ARQ();
            }
            i = 420174886;
        }
        C0f9.A0A(i, A03);
    }
}
