package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.90k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2039790k {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public HandlerThread A04;
    public ScaleGestureDetector A05;
    public C22900A7v A06;
    public APx A07;
    public ABK A08;
    public AAV A09;
    public AKQ A0A;
    public WeakReference A0C;
    public boolean A0E;
    public final AbstractC2039690j A0G;
    public final Handler A0F = new Handler(Looper.getMainLooper());
    public boolean A0D = false;
    public final TouchGesturesListener$HitTestCallback A0R = new AWv(this);
    public final java.util.Set A0Q = new HashSet();
    public C2039890l A0B = new C2039890l(false, false, false, false, false, false, false);
    public final Map A0K = new HashMap();
    public final Map A0L = new HashMap();
    public final Map A0J = new HashMap();
    public final Map A0M = new HashMap();
    public final List A0I = new LinkedList();
    public final List A0H = new LinkedList();
    public final java.util.Set A0O = new HashSet();
    public final java.util.Set A0P = new HashSet();
    public final java.util.Set A0N = new LinkedHashSet();

    public static long A00(C2039790k c2039790k, Gesture.GestureType gestureType) {
        long j = c2039790k.A03;
        c2039790k.A03 = 1 + j;
        Map map = c2039790k.A0K;
        Long valueOf = Long.valueOf(j);
        map.put(gestureType, valueOf);
        c2039790k.A0L.put(valueOf, EnumC222669s7.HIT_TESTING);
        return j;
    }

    public static void A01(C2039790k c2039790k) {
        List list = c2039790k.A0I;
        LinkedHashSet<MotionEvent> linkedHashSet = new LinkedHashSet(list);
        list.clear();
        c2039790k.A0N.addAll(linkedHashSet);
        for (MotionEvent motionEvent : linkedHashSet) {
            WeakReference weakReference = c2039790k.A0C;
            if (weakReference != null && weakReference.get() != null) {
                ((View) weakReference.get()).dispatchTouchEvent(motionEvent);
            }
        }
    }

    public static void A02(C2039790k c2039790k) {
        c2039790k.A0K.clear();
        c2039790k.A0L.clear();
        c2039790k.A0M.clear();
        c2039790k.A0I.clear();
        c2039790k.A0O.clear();
        c2039790k.A0N.clear();
        c2039790k.A0H.clear();
        c2039790k.A0D = false;
        c2039790k.A01 = 0;
        c2039790k.A00 = 0;
    }

    public static void A03(C2039790k c2039790k) {
        java.util.Set set = c2039790k.A0Q;
        set.clear();
        if (c2039790k.A0B.A05) {
            set.add(Gesture.GestureType.TAP);
        }
        if (c2039790k.A0B.A01) {
            set.add(Gesture.GestureType.PAN);
        }
        if (c2039790k.A0B.A02) {
            set.add(Gesture.GestureType.PINCH);
        }
        if (c2039790k.A0B.A04) {
            set.add(Gesture.GestureType.ROTATE);
        }
        if (c2039790k.A0B.A00) {
            set.add(Gesture.GestureType.LONG_PRESS);
        }
        if (c2039790k.A0B.A03) {
            set.add(Gesture.GestureType.RAW_TOUCH);
            AKQ akq = c2039790k.A0A;
            if (akq != null) {
                akq.A08 = true;
            }
        }
    }

    public static void A04(C2039790k c2039790k, Gesture.GestureType gestureType) {
        Object remove;
        Object remove2;
        Map map = c2039790k.A0K;
        if (map.containsKey(gestureType) && (remove = map.remove(gestureType)) != null && (remove2 = c2039790k.A0L.remove(remove)) != null && remove2 == EnumC222669s7.GESTURE_IS_HANDLED_BY_ENGINE) {
            c2039790k.A00--;
        }
        java.util.Set set = c2039790k.A0O;
        if (set.contains(gestureType)) {
            set.remove(gestureType);
        }
    }

    public static void A05(C2039790k c2039790k, Gesture gesture) {
        int ordinal;
        java.util.Set set;
        List list;
        Map map = c2039790k.A0L;
        if (map.containsKey(Long.valueOf(gesture.id)) && (ordinal = ((EnumC222669s7) map.get(Long.valueOf(gesture.id))).ordinal()) != 2) {
            if (ordinal != 3) {
                if (ordinal != 0) {
                    Map map2 = c2039790k.A0M;
                    if (!map2.containsKey(Long.valueOf(gesture.id))) {
                        list = new LinkedList();
                        map2.put(Long.valueOf(gesture.id), list);
                    } else {
                        list = (List) map2.get(Long.valueOf(gesture.id));
                    }
                    list.add(gesture);
                    return;
                }
                c2039790k.A01++;
                map.put(Long.valueOf(gesture.id), EnumC222669s7.WAIT_HIT_TEST_RESULT);
                Iterator it = c2039790k.A0G.A01().iterator();
                while (it.hasNext()) {
                    ((InterfaceC25202BDa) it.next()).enqueueForHitTest(gesture, c2039790k.A0R);
                }
                return;
            }
            Iterator it2 = c2039790k.A0G.A01().iterator();
            while (it2.hasNext()) {
                ((InterfaceC25202BDa) it2.next()).addGestureEvent(gesture);
            }
            Gesture.GestureState gestureState = gesture.gestureState;
            if (gestureState != Gesture.GestureState.ENDED && gestureState != Gesture.GestureState.CANCELLED && gestureState != Gesture.GestureState.FAILED) {
                return;
            }
            Comparable gestureType = gesture.getGestureType();
            if (gestureType == Gesture.GestureType.RAW_TOUCH) {
                set = c2039790k.A0P;
                gestureType = Long.valueOf(gesture.id);
            } else {
                set = c2039790k.A0O;
            }
            set.add(gestureType);
        }
    }

    public static void A06(C2039790k c2039790k, TouchEvent touchEvent) {
        Iterator it = c2039790k.A0G.A01().iterator();
        while (it.hasNext()) {
            ((InterfaceC25202BDa) it.next()).addTouchEvent(touchEvent);
        }
    }

    public static void A07(C2039790k c2039790k, Long l) {
        Object remove = c2039790k.A0L.remove(l);
        if (remove != null && remove == EnumC222669s7.GESTURE_IS_HANDLED_BY_ENGINE) {
            c2039790k.A00--;
        }
        java.util.Set set = c2039790k.A0P;
        if (set.contains(l)) {
            set.remove(l);
        }
    }

    public static boolean A08(C2039790k c2039790k, long j) {
        Map map = c2039790k.A0L;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf) && map.get(valueOf) == EnumC222669s7.GESTURE_IS_HANDLED_BY_CLIENT) {
            return true;
        }
        return false;
    }

    public C2039790k(AbstractC2039690j abstractC2039690j) {
        this.A0G = abstractC2039690j;
    }
}
