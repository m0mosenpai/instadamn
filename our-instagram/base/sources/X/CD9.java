package X;

import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CD9 {
    public static void A00(View view, C71333Hu c71333Hu, List list, List list2, List list3) {
        C71363Hx c71363Hx;
        HashSet A1H = AbstractC166987dD.A1H();
        while (view != null) {
            Map map = c71333Hu.A02;
            if (map.get(view) != null && map.get(view) != C71363Hx.A07 && (c71363Hx = (C71363Hx) map.get(view)) != null) {
                InterfaceC79643hF interfaceC79643hF = c71363Hx.A05;
                String str = c71363Hx.A06;
                if (str == null && interfaceC79643hF != null) {
                    str = interfaceC79643hF.AWz();
                    c71363Hx.A06 = str;
                }
                C71353Hw c71353Hw = c71363Hx.A04;
                InterfaceC79643hF interfaceC79643hF2 = c71363Hx.A05;
                C93574Hy c93574Hy = c71363Hx.A03;
                if (c93574Hy == null && interfaceC79643hF2 != null) {
                    c93574Hy = interfaceC79643hF2.AWp();
                    c71363Hx.A03 = c93574Hy;
                }
                if (str != null && !A1H.contains(str)) {
                    list.add(str);
                    A1H.add(str);
                }
                if (c71353Hw != null) {
                    list2.add(c71353Hw);
                }
                if (c93574Hy != null) {
                    list3.add(c93574Hy);
                }
            }
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                return;
            }
        }
    }
}
