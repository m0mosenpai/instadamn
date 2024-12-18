package X;

import com.instagram.maps.ui.IgStaticMapView;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class X24 extends HashMap {
    public final int A00;
    public final Object A01;

    public X24(C203128yU c203128yU) {
        this.A00 = 4;
        String A00 = AbstractC111324zv.A00(3827);
        this.A01 = c203128yU;
        C203118yT c203118yT = c203128yU.A01;
        put("user_name", c203118yT.A00);
        put("profile_pic_url", c203118yT.A01);
        put("resolver_type", A00);
    }

    public X24(C66356UBx c66356UBx, String str, int i, long j) {
        long j2;
        this.A00 = i;
        this.A01 = c66356UBx;
        double d = C66356UBx.A0p;
        if (i != 0) {
            j2 = c66356UBx.A0L;
        } else {
            j2 = c66356UBx.A0I;
        }
        put("duration", Long.valueOf(j - j2));
        put("surface", str == null ? "unknown" : str);
    }

    public X24(C66535ULq c66535ULq, String str) {
        this.A00 = 3;
        this.A01 = c66535ULq;
        put("surface", str);
        Thread thread = C66535ULq.A06;
        put(AbstractC58317Pt9.A00(87), Long.valueOf(((WU2) c66535ULq).A01.get()));
        put("cache_hit_count", Long.valueOf(c66535ULq.A04.get()));
        put("cache_miss_count", Long.valueOf(c66535ULq.A05.get()));
    }

    public X24(IgStaticMapView igStaticMapView) {
        this.A00 = 2;
        this.A01 = igStaticMapView;
        put("map_url", igStaticMapView.A05.toString());
        put("surface", igStaticMapView.A0I.A08);
    }
}
