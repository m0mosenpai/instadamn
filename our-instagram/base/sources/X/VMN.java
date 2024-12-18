package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VMN {
    public static final C59392ni A00(C1VO c1vo, C1W1 c1w1, C2nP c2nP, UML uml) {
        Map map;
        Map map2;
        Map map3;
        InterfaceC27851Wn interfaceC27851Wn;
        PointF pointF;
        String str;
        if (c1vo != null) {
            map = ((C3QC) c1vo.A04()).B3v();
        } else {
            map = null;
        }
        C2nP BGo = uml.BGo();
        if (BGo != null) {
            Object obj = BGo.A03.get("image_source_extras");
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                map2 = null;
            }
        } else {
            map2 = null;
        }
        Map map4 = C70426WVe.A07;
        Map map5 = C70426WVe.A08;
        if (c1w1 != null) {
            map3 = c1w1.A04;
        } else {
            map3 = null;
        }
        Rect rect = uml.A00;
        Drawable A02 = uml.A02(1);
        if (!(A02 instanceof UMN)) {
            interfaceC27851Wn = null;
        } else {
            interfaceC27851Wn = ((UMN) A02).A05;
        }
        String valueOf = String.valueOf(interfaceC27851Wn);
        Drawable A022 = uml.A02(1);
        if (!(A022 instanceof UMN)) {
            pointF = null;
        } else {
            pointF = ((UMN) A022).A04;
        }
        C59392ni A00 = AbstractC59382nh.A00(pointF, rect, uml.Ajt(), valueOf, map4, map5, map3, map2, map);
        Map map6 = c2nP.A03;
        Object obj2 = map6.get("modified_url");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        A00.A07 = str;
        Object obj3 = map6.get("original_url");
        A00.A02 = obj3 instanceof android.net.Uri ? (android.net.Uri) obj3 : null;
        return A00;
    }
}
