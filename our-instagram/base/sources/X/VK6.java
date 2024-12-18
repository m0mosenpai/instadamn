package X;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class VK6 {
    public C4IC A01(Context context) {
        C4IA c4ia;
        C4IC c4ic;
        if (this instanceof V9I) {
            c4ia = C4IA.A0A;
        } else if (this instanceof V9H) {
            c4ia = C4IA.A09;
        } else {
            c4ia = C4IA.A05;
        }
        C69686VtW c69686VtW = new C69686VtW(c4ia, C4IB.A0C);
        String[] A01 = c69686VtW.A01();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(A01.length));
        for (String str : A01) {
            if (AbstractC23451Ch.A07(context, str)) {
                c4ic = C4IC.A06;
            } else {
                c4ic = C4IC.A05;
            }
            linkedHashMap.put(str, c4ic);
        }
        return c69686VtW.A00(linkedHashMap);
    }

    public void A02(Activity activity, C69090Vhg c69090Vhg) {
        C4IA c4ia;
        if (this instanceof V9I) {
            c4ia = C4IA.A0A;
        } else if (this instanceof V9H) {
            c4ia = C4IA.A09;
        } else {
            c4ia = C4IA.A05;
        }
        C69686VtW c69686VtW = new C69686VtW(c4ia, C4IB.A0C);
        C70784Wgx c70784Wgx = new C70784Wgx(3, c69686VtW, c69090Vhg, this);
        String[] A01 = c69686VtW.A01();
        AbstractC23451Ch.A04(activity, c70784Wgx, (String[]) Arrays.copyOf(A01, A01.length));
    }
}
