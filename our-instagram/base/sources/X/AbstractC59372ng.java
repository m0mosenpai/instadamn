package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.2ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59372ng {
    public static final Map A00 = AbstractC16850sd.A0M(new C09530e4("component_tag", "vito2"));
    public static final Map A01 = AbstractC06930Yk.A06(new C09530e4("origin", "memory_bitmap"), new C09530e4("origin_sub", "shortcut"));

    public static final C59392ni A00(C1VO c1vo, C1W1 c1w1, C59252nR c59252nR) {
        Map map;
        InterfaceC27851Wn interfaceC27851Wn;
        PointF pointF;
        Map map2;
        C3QC c3qc;
        Map map3 = A00;
        Map map4 = A01;
        if (c1w1 != null) {
            map = c1w1.A04;
        } else {
            map = null;
        }
        Rect rect = c59252nR.A01;
        C2nP c2nP = c59252nR.A02;
        if (c2nP != null) {
            interfaceC27851Wn = c2nP.A01.A0E;
        } else {
            interfaceC27851Wn = null;
        }
        String valueOf = String.valueOf(interfaceC27851Wn);
        C2nP c2nP2 = c59252nR.A02;
        if (c2nP2 != null) {
            pointF = c2nP2.A01.A07;
        } else {
            pointF = null;
        }
        if (c1vo != null && (c3qc = (C3QC) c1vo.A04()) != null) {
            map2 = c3qc.B3v();
        } else {
            map2 = null;
        }
        return AbstractC59382nh.A00(pointF, rect, c59252nR.A05, valueOf, map3, map4, map, null, map2);
    }
}
