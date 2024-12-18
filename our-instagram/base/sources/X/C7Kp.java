package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7Kp, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Kp {
    public final Map A01 = new LinkedHashMap();
    public Map A00 = new LinkedHashMap();

    public final void A00(C66340UAd c66340UAd, String str) {
        C14360o3.A0B(c66340UAd, 1);
        Map map = this.A01;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C69607VsA c69607VsA = new C69607VsA(str);
            VaZ vaZ = (VaZ) this.A00.remove(str);
            if (vaZ != null) {
                c69607VsA.A00(vaZ);
            }
            map.put(str, c69607VsA);
            obj2 = c69607VsA;
        }
        C69607VsA c69607VsA2 = (C69607VsA) obj2;
        c69607VsA2.A02 = new WeakReference(c66340UAd);
        String A0R = AnonymousClass001.A0R(c69607VsA2.A04, "back");
        if (!C14360o3.A0K(c66340UAd.A01, A0R)) {
            c66340UAd.setTargetId(A0R);
            c66340UAd.A05.clear();
            c66340UAd.A03.removeCallbacksAndMessages(null);
            c66340UAd.invalidate();
            Path path = new Path();
            path.moveTo(-13.0f, 15.0f);
            path.lineTo(5.0f, -18.0f);
            c66340UAd.A05(path, 0.5f, 5.0f, 51, 500L, false);
            Path path2 = new Path();
            path2.moveTo(-6.0f, -3.0f);
            path2.lineTo(6.0f, -15.0f);
            c66340UAd.A05(path2, 0.5f, -5.0f, 53, 650L, false);
        }
        VaZ vaZ2 = c69607VsA2.A00;
        if (vaZ2 != null) {
            c66340UAd.A06(vaZ2);
            c69607VsA2.A00 = null;
        }
    }

    public final void A01(C66340UAd c66340UAd, String str) {
        C14360o3.A0B(c66340UAd, 1);
        Map map = this.A01;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C69607VsA c69607VsA = new C69607VsA(str);
            VaZ vaZ = (VaZ) this.A00.remove(str);
            if (vaZ != null) {
                c69607VsA.A00(vaZ);
            }
            map.put(str, c69607VsA);
            obj2 = c69607VsA;
        }
        C69607VsA c69607VsA2 = (C69607VsA) obj2;
        c69607VsA2.A03 = new WeakReference(c66340UAd);
        String A0R = AnonymousClass001.A0R(c69607VsA2.A04, "front");
        if (!C14360o3.A0K(c66340UAd.A01, A0R)) {
            c66340UAd.setTargetId(A0R);
            c66340UAd.A05.clear();
            c66340UAd.A03.removeCallbacksAndMessages(null);
            c66340UAd.invalidate();
            Path path = new Path();
            path.moveTo(-11.0f, 19.0f);
            path.quadTo(-5.0f, 13.0f, 12.0f, 7.0f);
            c66340UAd.A05(path, 0.67f, 15.0f, 85, 0L, true);
            Path path2 = new Path();
            path2.moveTo(22.0f, 12.0f);
            path2.quadTo(-8.0f, 12.0f, -8.0f, 12.0f);
            c66340UAd.A05(path2, 0.5f, -15.0f, 83, 200L, true);
            Path path3 = new Path();
            path3.moveTo(45.0f, 20.0f);
            path3.lineTo(15.0f, 20.0f);
            path3.arcTo(new RectF(-15.0f, -40.0f, 45.0f, 20.0f), 90.0f, 90.0f);
            c66340UAd.A05(path3, 1.0f, -15.0f, 51, 425L, true);
            Path path4 = new Path();
            path4.lineTo(-10.0f, -21.0f);
            c66340UAd.A05(path4, 0.33f, -15.0f, 53, 575L, true);
        }
        VaZ vaZ2 = c69607VsA2.A01;
        if (vaZ2 != null) {
            c66340UAd.A06(vaZ2);
            c69607VsA2.A01 = null;
        }
    }

    public final void A02(C66340UAd c66340UAd, String str) {
        C14360o3.A0B(c66340UAd, 1);
        Map map = this.A01;
        C69607VsA c69607VsA = (C69607VsA) map.get(str);
        if (c69607VsA != null) {
            WeakReference weakReference = c69607VsA.A02;
            if (weakReference != null) {
                if (weakReference.get() == c66340UAd) {
                    c69607VsA.A02 = null;
                } else {
                    return;
                }
            }
            if (c69607VsA.A03 == null) {
                map.remove(str);
            }
        }
    }

    public final void A03(C66340UAd c66340UAd, String str) {
        C14360o3.A0B(c66340UAd, 1);
        Map map = this.A01;
        C69607VsA c69607VsA = (C69607VsA) map.get(str);
        if (c69607VsA != null) {
            WeakReference weakReference = c69607VsA.A03;
            if (weakReference != null && weakReference.get() == c66340UAd) {
                c69607VsA.A03 = null;
                weakReference = null;
            }
            if (c69607VsA.A02 == null && weakReference == null) {
                map.remove(str);
            }
        }
    }

    public final boolean A04(String str) {
        WeakReference weakReference;
        C66340UAd c66340UAd;
        WeakReference weakReference2;
        C66340UAd c66340UAd2;
        C69607VsA c69607VsA = (C69607VsA) this.A01.get(str);
        if (c69607VsA != null && (weakReference = c69607VsA.A02) != null && (c66340UAd = (C66340UAd) weakReference.get()) != null && c66340UAd.getCanReleaseHearts() && (weakReference2 = c69607VsA.A03) != null && (c66340UAd2 = (C66340UAd) weakReference2.get()) != null && c66340UAd2.getCanReleaseHearts()) {
            return true;
        }
        return false;
    }
}
