package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175907s4 {
    public static final C175907s4 A02 = new C175907s4();
    public final Map A01 = new HashMap();
    public final Map A00 = new HashMap();

    public static Handler A01(String str) {
        return A00(null, A02, str, 0);
    }

    public static void A02(Handler handler, boolean z, boolean z2) {
        Map map;
        C175907s4 c175907s4 = A02;
        if (handler != null) {
            Map map2 = c175907s4.A00;
            HandlerThread handlerThread = (HandlerThread) map2.get(handler);
            if (handlerThread == null) {
                C0K8.A0D("ThreadPool", "Trying to quit thread not managed by ThreadPool - abort");
                return;
            }
            map2.remove(handler);
            synchronized (c175907s4) {
                map = c175907s4.A01;
                ThreadPoolImpl$LifeStatus threadPoolImpl$LifeStatus = (ThreadPoolImpl$LifeStatus) map.get(handlerThread);
                if (threadPoolImpl$LifeStatus == ThreadPoolImpl$LifeStatus.TAKEN) {
                    ThreadPoolImpl$LifeStatus threadPoolImpl$LifeStatus2 = ThreadPoolImpl$LifeStatus.AVAILABLE;
                    map.put(handlerThread, threadPoolImpl$LifeStatus2);
                    if (map.get(handlerThread) == threadPoolImpl$LifeStatus2) {
                        map.put(handlerThread, ThreadPoolImpl$LifeStatus.QUITTING);
                        if (!z2) {
                            handlerThread.quitSafely();
                        } else {
                            handlerThread.quit();
                        }
                        if (z) {
                            try {
                                if (Thread.currentThread() != handlerThread) {
                                    handlerThread.join(1000L);
                                }
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        map.remove(handlerThread);
                    } else {
                        C0K8.A0D("ThreadPool", "Trying to kill thread that is not AVAILABLE");
                    }
                } else {
                    C0K8.A0P("ThreadPool", "Trying to quit thread that is not TAKEN but in %s", threadPoolImpl$LifeStatus);
                }
            }
            map.size();
        }
    }

    public static Handler A00(Handler.Callback callback, C175907s4 c175907s4, String str, int i) {
        Map map;
        boolean z;
        HandlerThread handlerThread;
        if (!str.isEmpty()) {
            synchronized (c175907s4) {
                map = c175907s4.A01;
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Thread) it.next()).getName().equals(str)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    C0K8.A0P("ThreadPool", "Thread name already exists %s", str);
                }
                handlerThread = new HandlerThread("DO_NOT_USE_thread", i);
                AbstractC09770fa.A00(handlerThread);
                handlerThread.setName(str);
            }
            handlerThread.start();
            if (handlerThread.isAlive()) {
                synchronized (c175907s4) {
                    map.put(handlerThread, ThreadPoolImpl$LifeStatus.AVAILABLE);
                }
                Handler handler = new Handler(handlerThread.getLooper(), callback);
                c175907s4.A00.put(handler, handlerThread);
                synchronized (c175907s4) {
                    map.put(handlerThread, ThreadPoolImpl$LifeStatus.TAKEN);
                }
                map.size();
                return handler;
            }
            throw new RuntimeException("Thread start was unsuccessful");
        }
        throw new RuntimeException("Thread name cannot be empty");
    }
}
