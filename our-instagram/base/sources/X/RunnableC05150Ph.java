package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC05150Ph implements Runnable {
    public C11530jC A00;
    public long A01;
    public final ActivityManager.RunningAppProcessInfo A03;
    public final Context A04;
    public final Object A02 = new Object();
    public final List A05 = new CopyOnWriteArrayList();

    public RunnableC05150Ph(Context context) {
        this.A04 = context;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        this.A03 = runningAppProcessInfo;
        runningAppProcessInfo.importance = 0;
        this.A00 = null;
    }

    private boolean A00() {
        int i;
        boolean z;
        int i2;
        Integer num;
        byte[] bArr;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = this.A03;
        synchronized (runningAppProcessInfo) {
            i = runningAppProcessInfo.importance;
            try {
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                z = true;
                this.A01 = SystemClock.uptimeMillis();
                i2 = runningAppProcessInfo.importance;
            } catch (RuntimeException e) {
                C0K8.A0F("ProcessImportanceProvider", "Could not get current importance", e);
                z = false;
                i2 = i;
            }
        }
        synchronized (this.A02) {
            C11530jC c11530jC = this.A00;
            if (c11530jC != null) {
                C07960bG c07960bG = c11530jC.A00;
                synchronized (c07960bG) {
                    if (c07960bG.A0D != null) {
                        if (z && c07960bG.A00 != i2) {
                            Integer num2 = (Integer) C07960bG.A0I.get(Integer.valueOf(i2));
                            if (num2 == null) {
                                num = C05F.A15;
                            } else {
                                num = C05F.A0u;
                            }
                            if (num2 != null) {
                                bArr = new byte[]{num2.byteValue()};
                            } else {
                                bArr = new byte[]{(byte) (i2 >>> 8), (byte) i2};
                            }
                            C07960bG.A02(c07960bG, num, bArr);
                            c07960bG.A00 = i2;
                        } else {
                            C07960bG.A00(c07960bG);
                        }
                    }
                }
            }
        }
        if (z && i != i2) {
            Iterator it = this.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onImportanceChanged");
            }
        }
        return z;
    }

    public final long A01(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        long j;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = this.A03;
        synchronized (runningAppProcessInfo2) {
            boolean z = false;
            if (A00() || this.A01 > 0) {
                z = true;
            }
            j = this.A01;
            if (z) {
                runningAppProcessInfo.importance = runningAppProcessInfo2.importance;
                runningAppProcessInfo.lastTrimLevel = runningAppProcessInfo2.lastTrimLevel;
            }
        }
        return j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            A00();
            try {
                Thread.sleep(0L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
