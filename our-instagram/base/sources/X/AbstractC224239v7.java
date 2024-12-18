package X;

import android.os.SystemClock;

/* renamed from: X.9v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224239v7 {
    public long A00(long j) {
        C211489Wx c211489Wx = (C211489Wx) this;
        if (c211489Wx.A00 < 0 && j > 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            c211489Wx.A00 = elapsedRealtimeNanos;
            c211489Wx.A01 = elapsedRealtimeNanos - j;
        }
        return j + c211489Wx.A01;
    }
}
