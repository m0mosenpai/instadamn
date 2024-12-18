package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.7wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178777wp {
    public final HashMap A00 = new HashMap();

    public final void A00(String str, int i) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            if (!hashMap.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, i);
                AbstractC09770fa.A00(handlerThread);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                if (looper != null) {
                    hashMap.put(str, new Pair(handlerThread, new Handler(looper)));
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Looper is null: ", str));
                }
            }
        }
    }

    public final void finalize() {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                HandlerThread handlerThread = (HandlerThread) ((Pair) it.next()).first;
                handlerThread.quitSafely();
                try {
                    handlerThread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            hashMap.clear();
        }
    }

    public C178777wp() {
        A00("Lite-Controller-Thread", 0);
        A00("Lite-SurfacePipe-Thread", 0);
        A00("Lite-CPU-Frames-Thread", 0);
        A00("Lite-GPU-Monitor-Thread", 0);
    }
}
