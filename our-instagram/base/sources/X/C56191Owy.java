package X;

import android.view.View;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Owy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56191Owy implements InterfaceC13380mO {
    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        int i;
        Map map;
        int i2;
        int i3;
        C55043OZp c55043OZp = (C55043OZp) ((C54483O5l) obj).A00.get();
        if (c55043OZp != null) {
            Map map2 = c55043OZp.A09;
            Iterator A15 = AbstractC166997dE.A15(map2);
            int i4 = 0;
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                AbstractC54484O5m abstractC54484O5m = (AbstractC54484O5m) A1K.getValue();
                Object key = A1K.getKey();
                Map map3 = c55043OZp.A08;
                AbstractC54484O5m abstractC54484O5m2 = (AbstractC54484O5m) map3.get(key);
                if (abstractC54484O5m2 != null) {
                    View view = abstractC54484O5m2.A00;
                    if (view.equals(key)) {
                        i3 = 0;
                        i4 += i3;
                    } else if (!abstractC54484O5m.A00.equals(view)) {
                        c55043OZp.A03.removeView(view);
                    }
                }
                View view2 = abstractC54484O5m.A00;
                view2.setOutlineProvider(new C66347UAt(c55043OZp, 2));
                view2.setClipToOutline(c55043OZp.A00.A04);
                c55043OZp.A03.addView(view2, 0);
                map3.put(key, abstractC54484O5m);
                i3 = 1;
                i4 += i3;
            }
            map2.clear();
            java.util.Set set = c55043OZp.A0A;
            int i5 = 0;
            for (Object obj2 : set) {
                Map map4 = c55043OZp.A08;
                AbstractC54484O5m abstractC54484O5m3 = (AbstractC54484O5m) map4.get(obj2);
                if (abstractC54484O5m3 != null) {
                    map4.remove(obj2);
                    c55043OZp.A03.removeView(abstractC54484O5m3.A00);
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i5 += i2;
            }
            set.clear();
            int i6 = i4 + i5;
            C54820OKy c54820OKy = c55043OZp.A01;
            boolean z = false;
            if (c54820OKy != null && !c54820OKy.equals(c55043OZp.A00)) {
                C54820OKy c54820OKy2 = c55043OZp.A01;
                if (c54820OKy2.A00 != c55043OZp.A00.A00) {
                    z = true;
                }
                c55043OZp.A00 = c54820OKy2;
                c55043OZp.A01 = null;
                c55043OZp.A07.A00 = c54820OKy2.A03;
                if (z) {
                    Iterator A16 = AbstractC166997dE.A16(c55043OZp.A08);
                    while (A16.hasNext()) {
                        ((AbstractC54484O5m) A16.next()).A00.setOutlineProvider(new C66347UAt(c55043OZp, 2));
                    }
                }
                i = 1;
            } else {
                i = 0;
            }
            int i7 = i6 + i;
            boolean z2 = true;
            if (i7 != 1) {
                z2 = false;
                if (i7 <= 0) {
                    return;
                }
            }
            if (c55043OZp.A00.A04) {
                map = c55043OZp.A08;
                Iterator A162 = AbstractC166997dE.A16(map);
                while (A162.hasNext()) {
                    ((AbstractC54484O5m) A162.next()).A00.setClipToOutline(true);
                }
            } else {
                map = c55043OZp.A08;
                Iterator A163 = AbstractC166997dE.A16(map);
                while (A163.hasNext()) {
                    ((AbstractC54484O5m) A163.next()).A00.setClipToOutline(false);
                }
            }
            C55043OZp.A00(c55043OZp, z2);
            if (map.containsKey(0)) {
                AbstractC54484O5m abstractC54484O5m4 = (AbstractC54484O5m) map.get(0);
                map.size();
                abstractC54484O5m4.A00.setOnTouchListener(null);
            }
        }
    }
}
