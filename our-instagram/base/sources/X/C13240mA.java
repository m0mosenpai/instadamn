package X;

import android.os.Message;
import android.view.ViewGroup;
import com.facebook.systrace.Systrace;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.0mA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13240mA extends Thread {
    public static final C13240mA A02;
    public final C12550kz A00;
    public final ArrayBlockingQueue A01;

    static {
        C13240mA c13240mA = new C13240mA();
        A02 = c13240mA;
        c13240mA.start();
    }

    public C13240mA() {
        super("InflateThread");
        this.A01 = new ArrayBlockingQueue(10);
        this.A00 = new C12550kz(10);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C13220m8 c13220m8;
        int i;
        C13270mD c13270mD;
        while (true) {
            try {
                c13220m8 = (C13220m8) this.A01.take();
                if (Systrace.A0E(1L)) {
                    C0fO.A01("AsyncViewInflation", 923825321);
                }
                try {
                    try {
                        c13270mD = c13220m8.A03;
                    } catch (RuntimeException e) {
                        android.util.Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread.", e);
                        if (Systrace.A0E(1L)) {
                            i = 1351492381;
                        }
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-75009252);
                    }
                    throw th;
                }
            } catch (InterruptedException e2) {
                android.util.Log.w("AsyncLayoutInflater", e2);
            }
            if (c13270mD != null) {
                c13220m8.A01 = c13270mD.A02.inflate(c13220m8.A00, (ViewGroup) null, false);
                if (Systrace.A0E(1L)) {
                    i = 128023167;
                    C0fO.A00(i);
                }
                C13270mD c13270mD2 = c13220m8.A03;
                if (c13270mD2 != null) {
                    Message.obtain(c13270mD2.A01, 0, c13220m8).sendToTarget();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
                break;
            }
        }
    }
}
