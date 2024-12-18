package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.8nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196998nU {
    public static C196998nU A08;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final C1814082s A07 = new C1814082s();
    public Handler A06 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.8nV
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C1814082s c1814082s = C196998nU.this.A07;
            if (!c1814082s.A00.isEmpty()) {
                List list = c1814082s.A00;
                int i = 0;
                switch (message.what) {
                    case 0:
                        if (0 < list.size()) {
                            list.get(0);
                            throw new NullPointerException("onPhotoCaptureDelivered");
                        }
                        break;
                    case 1:
                        if (0 < list.size()) {
                            list.get(0);
                            throw new NullPointerException("onSwitchCamera");
                        }
                        break;
                    case 2:
                        while (i < list.size()) {
                            list.get(i);
                            i++;
                        }
                        break;
                    case 3:
                        while (i < list.size()) {
                            list.get(i);
                            i++;
                        }
                        break;
                    case 4:
                        if (0 < list.size()) {
                            list.get(0);
                            throw new NullPointerException("onFirstSurfaceTextureUpdate");
                        }
                        break;
                    case 5:
                        if (0 < list.size()) {
                            list.get(0);
                            throw new NullPointerException("onFirstPreviewFrame");
                        }
                        break;
                    case 6:
                        if (0 < list.size()) {
                            list.get(0);
                            throw new NullPointerException("onPhotoCaptureCompleted");
                        }
                        break;
                }
            }
            return true;
        }
    });

    public static synchronized C196998nU A00() {
        C196998nU c196998nU;
        synchronized (C196998nU.class) {
            c196998nU = A08;
            if (c196998nU == null) {
                c196998nU = new C196998nU();
                A08 = c196998nU;
            }
        }
        return c196998nU;
    }

    public static void A01(C196998nU c196998nU, int i, long j) {
        if (!c196998nU.A07.A00.isEmpty()) {
            Handler handler = c196998nU.A06;
            Message obtain = Message.obtain(handler, i);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
            handler.sendMessage(obtain);
        }
    }

    public final void A02() {
        long j = this.A02;
        if (j == 0) {
            this.A02 = SystemClock.elapsedRealtime();
            A01(this, 5, this.A00);
        } else {
            A01(this, 3, j);
            this.A02 = SystemClock.elapsedRealtime();
        }
    }

    public final void A03() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A01(this, 4, this.A00);
        } else {
            A01(this, 2, j);
            this.A01 = SystemClock.elapsedRealtime();
        }
    }
}
