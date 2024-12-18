package X;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: X.W4r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70119W4r {
    public final void A02(Activity activity, C4IB c4ib, X9O x9o) {
        C14360o3.A0B(c4ib, 1);
        C69686VtW c69686VtW = new C69686VtW(C4IA.A08, c4ib);
        Integer A01 = A01(activity);
        if (A01 != C05F.A00) {
            x9o.DYF(A00(activity, c69686VtW.A01, false), A01);
        }
        C64483TFt c64483TFt = new C64483TFt(4, c69686VtW, A01, x9o, this);
        String[] A012 = c69686VtW.A01();
        AbstractC23451Ch.A04(activity, c64483TFt, (String[]) Arrays.copyOf(A012, A012.length));
    }

    public static final C4IC A00(Context context, C4IB c4ib, boolean z) {
        C4IA c4ia;
        C4IC c4ic;
        if (z) {
            c4ia = C4IA.A07;
        } else {
            c4ia = C4IA.A08;
        }
        C69686VtW c69686VtW = new C69686VtW(c4ia, c4ib);
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

    public final Integer A01(Context context) {
        Object systemService = context.getSystemService("location");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isLocationEnabled()) {
            return C05F.A00;
        }
        return C05F.A01;
    }
}
