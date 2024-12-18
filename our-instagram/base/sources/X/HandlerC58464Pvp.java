package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.Pvp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC58464Pvp extends Handler {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final LightweightQuickPerformanceLogger A04;
    public final boolean A05;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long j;
        long uptimeMillis;
        Object obj;
        C003501a clone;
        C14360o3.A0B(message, 0);
        removeMessages(0);
        removeMessages(1);
        removeMessages(2);
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (this.A05 && (obj = message.obj) != null) {
                uptimeMillis = AbstractC166987dD.A0N(obj);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                long j2 = this.A02;
                long j3 = j2 + uptimeMillis;
                C003501a c003501a = C107064s7.A06;
                synchronized (c003501a) {
                    clone = c003501a.clone();
                }
                int A00 = clone.A00();
                int i2 = 0;
                while (true) {
                    if (i2 >= A00) {
                        break;
                    }
                    long longValue = ((Number) clone.A04(i2)).longValue();
                    if (longValue >= uptimeMillis && longValue < j3) {
                        if (uptimeMillis2 - uptimeMillis < this.A01) {
                            j = this.A03;
                        }
                    } else {
                        i2++;
                    }
                }
                if (uptimeMillis2 - uptimeMillis >= j2 + this.A03) {
                    this.A04.markerAnnotate(this.A00, "extended_trace", true);
                }
            }
            this.A04.markerEnd(this.A00, (short) 2);
            return;
        }
        Object obj2 = message.obj;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Long");
        long A0N = AbstractC166987dD.A0N(obj2);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
        int i3 = this.A00;
        lightweightQuickPerformanceLogger.markerStart(i3);
        lightweightQuickPerformanceLogger.markerAnnotate(i3, "time_since_foreground_millis", A0N);
        lightweightQuickPerformanceLogger.markerAnnotate(i3, "apl", true);
        boolean z = this.A05;
        j = this.A02;
        if (z) {
            uptimeMillis = SystemClock.uptimeMillis();
        } else {
            sendEmptyMessageDelayed(1, j);
            return;
        }
        sendMessageDelayed(obtainMessage(1, Long.valueOf(uptimeMillis)), j);
    }

    public HandlerC58464Pvp(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, long j, long j2, long j3, boolean z) {
        super(Looper.getMainLooper());
        this.A04 = lightweightQuickPerformanceLogger;
        this.A02 = j;
        this.A05 = z;
        this.A03 = j2;
        this.A01 = j3;
        this.A00 = 566770968;
    }
}
