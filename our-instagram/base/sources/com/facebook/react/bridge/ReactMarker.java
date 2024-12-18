package com.facebook.react.bridge;

import X.AbstractC166987dD;
import X.AbstractC43594JPz;
import X.C006802i;
import X.C62482SDj;
import X.C64500TGm;
import X.InterfaceC65215Tg6;
import X.InterfaceC65216Tg7;
import X.RhX;
import X.STV;
import X.T0E;
import X.ThQ;
import android.os.SystemClock;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class ReactMarker {
    public static Queue sNativeReactMarkerQueue = new ConcurrentLinkedQueue();
    public static final List sListeners = new CopyOnWriteArrayList();
    public static final List sFabricMarkerListeners = new CopyOnWriteArrayList();

    public static native void nativeLogMarker(String str, long j);

    public static void addFabricListener(InterfaceC65215Tg6 interfaceC65215Tg6) {
        AbstractC43594JPz.A1Q(interfaceC65215Tg6, sFabricMarkerListeners);
    }

    public static void addListener(InterfaceC65216Tg7 interfaceC65216Tg7) {
        AbstractC43594JPz.A1Q(interfaceC65216Tg7, sListeners);
    }

    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    public static void logFabricMarker(RhX rhX, String str, int i, long j) {
        Iterator it = sFabricMarkerListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("logFabricMarker");
        }
    }

    public static void notifyNativeMarker(RhX rhX, Long l) {
        if (rhX.A00) {
            if (l == null) {
                l = Long.valueOf(SystemClock.uptimeMillis());
            }
            if (STV.A00) {
                String name = rhX.name();
                long longValue = l.longValue();
                while (true) {
                    nativeLogMarker(name, longValue);
                    C62482SDj c62482SDj = (C62482SDj) sNativeReactMarkerQueue.poll();
                    if (c62482SDj != null) {
                        name = c62482SDj.A01;
                        longValue = c62482SDj.A00;
                    } else {
                        return;
                    }
                }
            } else {
                sNativeReactMarkerQueue.add(new C62482SDj(rhX.name(), l.longValue()));
            }
        }
    }

    public static void removeFabricListener(InterfaceC65215Tg6 interfaceC65215Tg6) {
        sFabricMarkerListeners.remove(interfaceC65215Tg6);
    }

    public static void removeListener(InterfaceC65216Tg7 interfaceC65216Tg7) {
        sListeners.remove(interfaceC65216Tg7);
    }

    public static void logMarker(String str) {
        logMarker(str, (String) null, 0);
    }

    public static void logMarker(RhX rhX) {
        logMarker(rhX, (String) null, 0);
    }

    public static void logMarker(RhX rhX, String str, int i) {
        logMarker(rhX, str, i, null);
    }

    public static void logMarker(RhX rhX, int i) {
        logMarker(rhX, (String) null, i);
    }

    public static void logMarker(RhX rhX, String str) {
        logMarker(rhX, str, 0);
    }

    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    public static void logMarker(String str, String str2, int i) {
        logMarker(RhX.valueOf(str), str2, i);
    }

    public static void logMarker(RhX rhX, long j) {
        logMarker(rhX, null, 0, Long.valueOf(j));
    }

    public static void logMarker(RhX rhX, String str, int i, Long l) {
        logFabricMarker(rhX, str, i);
        Iterator it = sListeners.iterator();
        while (it.hasNext()) {
            T0E t0e = (T0E) ((InterfaceC65216Tg7) it.next());
            switch (rhX.ordinal()) {
                case 3:
                    Iterator it2 = t0e.A00.iterator();
                    while (it2.hasNext()) {
                        C64500TGm c64500TGm = (C64500TGm) ((ThQ) it2.next());
                        synchronized (c64500TGm) {
                            int A00 = C64500TGm.A00(c64500TGm, c64500TGm.A07);
                            if (A00 != 0) {
                                C006802i.A0p.markerPoint(A00, "BRIDGE_STARTUP_DID_FINISH");
                            }
                        }
                    }
                    break;
                case 14:
                    Iterator it3 = t0e.A00.iterator();
                    while (it3.hasNext()) {
                        C64500TGm c64500TGm2 = (C64500TGm) ((ThQ) it3.next());
                        synchronized (c64500TGm2) {
                            int A002 = C64500TGm.A00(c64500TGm2, c64500TGm2.A0J);
                            if (A002 != 0) {
                                C006802i.A0p.markerPoint(A002, "START_EXECUTING_JS_BUNDLE");
                            }
                        }
                    }
                    break;
                case Process.SIGTERM /* 15 */:
                    Iterator it4 = t0e.A00.iterator();
                    while (it4.hasNext()) {
                        C64500TGm c64500TGm3 = (C64500TGm) ((ThQ) it4.next());
                        synchronized (c64500TGm3) {
                            int A003 = C64500TGm.A00(c64500TGm3, c64500TGm3.A0I);
                            if (A003 != 0) {
                                C006802i.A0p.markerPoint(A003, "FINISH_EXECUTING_JS_BUNDLE");
                            }
                        }
                    }
                    break;
                case 21:
                    Iterator it5 = t0e.A00.iterator();
                    while (it5.hasNext()) {
                        C64500TGm c64500TGm4 = (C64500TGm) ((ThQ) it5.next());
                        synchronized (c64500TGm4) {
                            int A004 = C64500TGm.A00(c64500TGm4, c64500TGm4.A0A);
                            if (A004 != 0) {
                                C006802i.A0p.markerPoint(A004, "CREATE_UI_MANAGER_MODULE_START");
                            }
                        }
                    }
                    break;
                case 22:
                    Iterator it6 = t0e.A00.iterator();
                    while (it6.hasNext()) {
                        C64500TGm c64500TGm5 = (C64500TGm) ((ThQ) it6.next());
                        synchronized (c64500TGm5) {
                            int A005 = C64500TGm.A00(c64500TGm5, c64500TGm5.A09);
                            if (A005 != 0) {
                                C006802i.A0p.markerPoint(A005, "CREATE_UI_MANAGER_MODULE_END");
                            }
                        }
                    }
                    break;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    Iterator it7 = t0e.A00.iterator();
                    while (it7.hasNext()) {
                        C64500TGm c64500TGm6 = (C64500TGm) ((ThQ) it7.next());
                        synchronized (c64500TGm6) {
                            int A006 = C64500TGm.A00(c64500TGm6, c64500TGm6.A0N);
                            if (A006 != 0) {
                                C006802i.A0p.markerPoint(A006, "UNPACKER_CHECK_START");
                            }
                        }
                    }
                    break;
                case 51:
                    Iterator it8 = t0e.A00.iterator();
                    while (it8.hasNext()) {
                        C64500TGm c64500TGm7 = (C64500TGm) ((ThQ) it8.next());
                        synchronized (c64500TGm7) {
                            int A007 = C64500TGm.A00(c64500TGm7, c64500TGm7.A0M);
                            if (A007 != 0) {
                                C006802i.A0p.markerPoint(A007, "UNPACKER_CHECK_END");
                            }
                        }
                    }
                    break;
                case 52:
                    Iterator it9 = t0e.A00.iterator();
                    while (it9.hasNext()) {
                        C64500TGm c64500TGm8 = (C64500TGm) ((ThQ) it9.next());
                        synchronized (c64500TGm8) {
                            int A008 = C64500TGm.A00(c64500TGm8, c64500TGm8.A0O);
                            if (A008 != 0) {
                                C006802i.A0p.markerPoint(A008, "UNPACKING_END");
                            }
                        }
                    }
                    break;
            }
        }
        notifyNativeMarker(rhX, l);
    }

    public static void logFabricMarker(RhX rhX, String str, int i) {
        logFabricMarker(rhX, str, i, SystemClock.uptimeMillis(), 0);
    }

    public static void logFabricMarker(RhX rhX, String str, int i, long j, int i2) {
        Iterator it = sFabricMarkerListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("logFabricMarker");
        }
    }
}
