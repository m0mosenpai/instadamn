package X;

import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76093bE {
    public static final C78373f3 A00(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, AbstractC76013b6 abstractC76013b6, C75803al c75803al, String str, int i, int i2) {
        C78323ey A05;
        C14360o3.A0B(c2xe, 0);
        C14360o3.A0B(abstractC50812Vc, 1);
        C14360o3.A0B(c75803al, 2);
        AbstractC76113bG.A07.addAndGet(1L);
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            if (str != null) {
                try {
                    ComponentsSystrace.A02(AnonymousClass001.A0R("extra:", str));
                } catch (Throwable th) {
                    C2XO c2xo = c75803al.A05;
                    c2xo.A00.A00(c2xo);
                    if (isTracing) {
                        ComponentsSystrace.A01();
                        if (str != null) {
                            ComponentsSystrace.A01();
                        }
                    }
                    throw th;
                }
            }
            C1LP A00 = ComponentsSystrace.A00(AnonymousClass001.A0R("resolveTree:", abstractC50812Vc.A0H()));
            A00.ACV("treeId", i2);
            A00.ACV("rootId", abstractC50812Vc.A00);
            A00.flush();
        }
        C2XO c2xo2 = c75803al.A05;
        C2XJ c2xj = c2xo2.A00;
        synchronized (c2xj) {
            try {
                c2xj.A00.add(c2xo2);
            } finally {
            }
        }
        C76133bI c76133bI = null;
        C76123bH c76123bH = new C76123bH(null);
        int i3 = abstractC50812Vc.A00;
        Object systemService = c2xe.A0C.getSystemService("accessibility");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        C76133bI c76133bI2 = new C76133bI(c2w1, c76123bH, abstractC76013b6, c75803al, i2, i, i3, C2XS.A00((AccessibilityManager) systemService));
        ThreadLocal threadLocal = c2xe.A0E;
        C2XR c2xr = (C2XR) threadLocal.get();
        try {
            threadLocal.set(c76133bI2);
            C2W1 A03 = C76163bL.A03(abstractC50812Vc, c2xe, c76133bI2);
            threadLocal.set(c2xr);
            if (c76133bI2.A00()) {
                A05 = null;
            } else {
                A05 = C76163bL.A05(A03);
                c76133bI2.A08.A00 = true;
            }
            if (C78333ez.A05) {
                synchronized (C78333ez.A06) {
                    try {
                        Map map = (Map) C78333ez.A08.getValue();
                        Integer valueOf = Integer.valueOf(i2);
                        Object obj = map.get(valueOf);
                        if (obj == null) {
                            obj = new ArrayList();
                            map.put(valueOf, obj);
                        }
                        ((List) obj).add(Boolean.valueOf(C2XV.A01()));
                    } finally {
                    }
                }
            }
            C76123bH c76123bH2 = c76133bI2.A08;
            boolean A002 = c76133bI2.A00();
            List list = c76133bI2.A01;
            if (c76133bI2.A00()) {
                c76133bI = c76133bI2;
            }
            C78373f3 c78373f3 = new C78373f3(abstractC50812Vc, c2xe, A03, c76123bH2, c76133bI, A05, c75803al, list, i, A002);
            c2xj.A00(c2xo2);
            if (isTracing) {
                ComponentsSystrace.A01();
                if (str != null) {
                    ComponentsSystrace.A01();
                }
            }
            return c78373f3;
        } catch (Throwable th2) {
            threadLocal.set(c2xr);
            throw th2;
        }
    }
}
