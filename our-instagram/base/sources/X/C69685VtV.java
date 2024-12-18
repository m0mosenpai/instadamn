package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VtV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69685VtV {
    public final ArrayList A01 = new ArrayList();
    public boolean A00 = false;

    public final void A00() {
        this.A00 = true;
    }

    public final void A01(X9A x9a) {
        C69563VrS c69563VrS;
        if (this.A00) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                Map map = ((Vh4) it.next()).A02;
                Iterator A12 = AbstractC43593JPy.A12(map);
                while (A12.hasNext()) {
                    X9A x9a2 = (X9A) A12.next();
                    if (x9a.getClass().equals(x9a2.getClass()) && x9a2.FDX(x9a) && (c69563VrS = (C69563VrS) map.get(x9a2)) != null) {
                        for (VJ5 vj5 : c69563VrS.A01) {
                            C68691VaR c68691VaR = vj5.A01;
                            if (c68691VaR != null) {
                                Map map2 = c69563VrS.A02;
                                C14360o3.A0A(map2);
                                Object obj = c68691VaR.A00.A00;
                                map2.put("opacity_value_key", obj);
                                map2.put("opacity_values_key", new Float[]{Float.valueOf(0.0f), (Float) obj});
                            }
                            vj5.A00.ATJ(c69563VrS.A00, c69563VrS.A02);
                        }
                    }
                }
            }
        }
    }
}
