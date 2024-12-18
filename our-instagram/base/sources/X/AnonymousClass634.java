package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.634, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass634 {
    public static final InterfaceC102914kS A00 = new InterfaceC102914kS() { // from class: X.635
        @Override // X.InterfaceC102914kS
        public final Object CsV(final C6FG c6fg, final C102884kP c102884kP) {
            C103054kg A002 = AbstractC103044kf.A00();
            if (A002 != null && AnonymousClass634.A0B(c6fg)) {
                return AbstractC103044kf.A01(EnumC103014kc.A05, A002, new InterfaceC16820sZ() { // from class: X.U6Q
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        C6FG c6fg2 = c6fg;
                        C102884kP c102884kP2 = c102884kP;
                        Object A04 = C1LZ.A00().A08.A04(c6fg2, c102884kP2);
                        if (A04 == null) {
                            return C1LZ.A00().A09.A00(c6fg2, c102884kP2);
                        }
                        return A04;
                    }
                });
            }
            Object A04 = C1LZ.A00().A08.A04(c6fg, c102884kP);
            if (A04 != null) {
                return A04;
            }
            return C1LZ.A00().A09.A00(c6fg, c102884kP);
        }
    };

    public static boolean A0B(C6FG c6fg) {
        if (c6fg == null) {
            return false;
        }
        return Boolean.TRUE.equals(c6fg.A01.get(R.id.bk_context_key_is_signals_enabled));
    }

    public static WYB A00(C6FG c6fg, String str) {
        return (WYB) ((AbstractMap) c6fg.A00(R.id.bk_context_key_videos)).get(str);
    }

    public static C6FG A01(Context context, SparseArray sparseArray, AnonymousClass630 anonymousClass630, InterfaceC62872tQ interfaceC62872tQ, String str) {
        SparseArray clone = interfaceC62872tQ.AMf().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        clone.put(R.id.bk_context_key_states, new HashMap());
        if (anonymousClass630 == null) {
            anonymousClass630 = new AnonymousClass630(C1338462s.A04(new C102884kP(-1)), C63162tt.A00, C1339162z.A00);
        }
        clone.put(R.id.bk_context_key_tree, anonymousClass630);
        clone.put(R.id.bk_context_key_scoped_client_id_mapper, new C6FD());
        clone.put(R.id.bk_context_key_animations, new HashMap());
        clone.put(R.id.bk_context_key_timers, new HashMap());
        clone.put(R.id.bk_context_key_videos, new HashMap());
        clone.put(R.id.bk_context_key_cleanup_callbacks, new HashSet());
        clone.put(R.id.bk_context_key_logging_id, str);
        if (context.getApplicationContext() != null) {
            clone.put(R.id.bk_context_key_bind_manager, new C6FE(context));
        }
        if (clone.get(R.id.bk_context_key_performance_logger) == null) {
            clone.put(R.id.bk_context_key_performance_logger, C64466TFc.A00);
        }
        clone.put(R.id.bk_context_key_controller_by_server_id, Collections.synchronizedMap(new HashMap()));
        return new C6FG(context, clone, interfaceC62872tQ);
    }

    public static AnonymousClass630 A02(C6FG c6fg) {
        return (AnonymousClass630) c6fg.A00(R.id.bk_context_key_tree);
    }

    public static InterfaceC136226Ez A03(C6FG c6fg, String str) {
        Map map = (Map) c6fg.A01.get(R.id.bk_context_key_data_modules);
        if (map == null) {
            map = Collections.emptyMap();
        }
        return (InterfaceC136226Ez) map.get(str);
    }

    public static C6F3 A04(C6FG c6fg, String str) {
        Map map = (Map) c6fg.A00(R.id.bk_context_key_legacy_data_modules);
        if (map == null) {
            return null;
        }
        return (C6F3) map.get(str);
    }

    public static InterfaceC103074ki A05(C6FG c6fg) {
        InterfaceC103074ki interfaceC103074ki = (InterfaceC103074ki) c6fg.A01.get(R.id.bk_context_key_interpreter_extensions);
        if (interfaceC103074ki == null) {
            InterfaceC103074ki interfaceC103074ki2 = C1LZ.A00().A0B;
            interfaceC103074ki2.getClass();
            return interfaceC103074ki2;
        }
        return interfaceC103074ki;
    }

    public static Object A06(C6FG c6fg, C102884kP c102884kP) {
        Object A01 = c6fg.A01(A00, c102884kP, R.id.bk_context_key_controller_associated_object);
        String A0D = c102884kP.A0D();
        if (A0D != null) {
            ((Map) c6fg.A00(R.id.bk_context_key_controller_by_server_id)).put(A0D, A01);
        }
        return A01;
    }

    public static void A07(Animator animator, C6FG c6fg) {
        ((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).values().remove(animator);
    }

    public static void A08(C6FG c6fg) {
        HashMap hashMap = (HashMap) c6fg.A00(R.id.bk_context_key_animations);
        Iterator it = ((AbstractMap) hashMap.clone()).values().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) c6fg.A00(R.id.bk_context_key_timers);
        Iterator it2 = ((AbstractMap) hashMap2.clone()).values().iterator();
        while (it2.hasNext()) {
            ((CUH) it2.next()).A00();
        }
        if (!hashMap2.isEmpty()) {
            AbstractC25241Le.A02("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        ((AbstractMap) c6fg.A00(R.id.bk_context_key_videos)).clear();
        HashSet hashSet = (HashSet) c6fg.A00(R.id.bk_context_key_cleanup_callbacks);
        Iterator it3 = ((java.util.Set) hashSet.clone()).iterator();
        while (it3.hasNext()) {
            ((InterfaceC25166BBm) it3.next()).cleanup();
        }
        hashSet.clear();
        AnonymousClass630 A02 = A02(c6fg);
        A02.A0O = true;
        A02.A07 = null;
        A02.A03 = null;
        List list = A02.A0F;
        synchronized (list) {
            list.clear();
        }
        List list2 = A02.A0G;
        synchronized (list2) {
            list2.clear();
        }
        C6FE c6fe = A02.A02;
        if (c6fe != null) {
            c6fe.A00();
        }
        C6TA c6ta = (C6TA) c6fg.A01.get(R.id.bk_context_key_render_callback_queue);
        if (c6ta != null) {
            c6ta.A00 = true;
            ((Handler) c6ta.A05.getValue()).removeCallbacksAndMessages(c6ta.A03);
            Choreographer.getInstance().removeFrameCallback(c6ta.A02);
        }
    }

    public static void A09(C6FG c6fg, InterfaceC25166BBm interfaceC25166BBm) {
        java.util.Set set = (java.util.Set) c6fg.A00(R.id.bk_context_key_cleanup_callbacks);
        if (set.contains(interfaceC25166BBm)) {
            AbstractC25241Le.A02("IBloksContextCleanupCallback", "Attempting to add a cleanup callback that already exists.");
        } else {
            set.add(interfaceC25166BBm);
        }
    }

    public static boolean A0A(C6FG c6fg) {
        Boolean bool = (Boolean) c6fg.A01.get(R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
