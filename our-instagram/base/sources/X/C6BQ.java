package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.6BQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BQ {
    public static final Fragment A00(C6FG c6fg) {
        C14360o3.A0B(c6fg, 0);
        return (Fragment) c6fg.A00(R.id.bloks_ig_fragment);
    }

    public static final FragmentActivity A03(C6FG c6fg) {
        C14360o3.A0B(c6fg, 0);
        return (FragmentActivity) c6fg.A00(R.id.bloks_ig_fragment_activity);
    }

    public static final FragmentActivity A04(C6FQ c6fq) {
        C14360o3.A0B(c6fq, 0);
        return A03(A09(c6fq));
    }

    public static final InterfaceC11380iw A07(C6FG c6fg) {
        C14360o3.A0B(c6fg, 0);
        return (InterfaceC11380iw) c6fg.A00(R.id.bloks_ig_analytics_module);
    }

    public static final InterfaceC11380iw A08(C6FQ c6fq) {
        C14360o3.A0B(c6fq, 0);
        return A07(A09(c6fq));
    }

    public static final C6FG A09(C6FQ c6fq) {
        C14360o3.A0B(c6fq, 0);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            return c6fg;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final AbstractC12990ll A0A(C6FG c6fg) {
        C14360o3.A0B(c6fg, 0);
        return (AbstractC12990ll) c6fg.A00(R.id.bloks_ig_session);
    }

    public static final AbstractC12990ll A0B(C6FQ c6fq) {
        C14360o3.A0B(c6fq, 0);
        return A0A(A09(c6fq));
    }

    public static final C57112jm A0D(C6FG c6fg) {
        C14360o3.A0B(c6fg, 0);
        return (C57112jm) c6fg.A01.get(R.id.bloks_viewpoint_manager);
    }

    public static final Object A0E(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, Object... objArr) {
        int i = 0;
        C14360o3.A0B(c6fq, 0);
        if (interfaceC103384lE == null) {
            return null;
        }
        C6FX c6fx = new C6FX();
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i++;
            c6fx.A03(objArr[i2], i3);
            i2++;
            i3 = i;
        }
        return C131845xK.A00(c6fq, new C6FW(c6fx.A00), interfaceC103384lE);
    }

    public static final String A0G(Object obj) {
        C14360o3.A0B(obj, 0);
        if (!(obj instanceof Number) && (obj instanceof Boolean)) {
            if (((Boolean) obj).booleanValue()) {
                return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            return "0";
        }
        return obj.toString();
    }

    public static final HashMap A0H(Map map) {
        String A0G;
        C14360o3.A0B(map, 0);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String A0G2 = A0G(key);
            if (value == null) {
                A0G = null;
            } else {
                A0G = A0G(value);
            }
            hashMap.put(A0G2, A0G);
        }
        return hashMap;
    }

    public static final void A0I(C6FG c6fg, InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(c6fg, 0);
        C14360o3.A0B(interfaceC60602pj, 1);
        InterfaceC08430c6 A00 = A00(c6fg);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.fragment.lifecyclelistener.FragmentLifecycleListenable");
        ((InterfaceC59992oh) A00).registerLifecycleListener(interfaceC60602pj);
    }

    public static final void A0J(C6FG c6fg, InterfaceC60602pj interfaceC60602pj) {
        C14360o3.A0B(c6fg, 0);
        C14360o3.A0B(interfaceC60602pj, 1);
        InterfaceC08430c6 A00 = A00(c6fg);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.fragment.lifecyclelistener.FragmentLifecycleListenable");
        ((InterfaceC59992oh) A00).unregisterLifecycleListener(interfaceC60602pj);
    }

    public static final Fragment A01(C6FQ c6fq) {
        return A00(A09(c6fq));
    }

    public static final Fragment A02(C6FQ c6fq) {
        return (Fragment) A09(c6fq).A01.get(R.id.bloks_ig_fragment);
    }

    public static final AbstractC10360h2 A05(C6FQ c6fq) {
        return (AbstractC10360h2) A09(c6fq).A00(R.id.bloks_ig_fragment_manager);
    }

    public static final C62862tP A06(C6FQ c6fq) {
        return (C62862tP) A09(c6fq).A02;
    }

    public static final C1GL A0C(C6FQ c6fq) {
        return (C1GL) A09(c6fq).A00(R.id.bloks_ig_scheduler);
    }

    @Deprecated(level = AbstractC68219VIb.WARNING, message = "Read your object from the environment directly", replaceWith = @ReplaceWith(expression = "environment.get(id)", imports = {}))
    public static final Object A0F(C6FQ c6fq, Class cls, int i) {
        return cls.cast(((SparseArray) A09(c6fq).A00(R.id.bloks_ig_object_store_deprecated)).get(i));
    }

    public static final void A0K(C6FQ c6fq, InterfaceC60602pj interfaceC60602pj) {
        A0I(A09(c6fq), interfaceC60602pj);
    }

    public static final void A0L(C6FQ c6fq, InterfaceC60602pj interfaceC60602pj) {
        A0J(A09(c6fq), interfaceC60602pj);
    }
}
