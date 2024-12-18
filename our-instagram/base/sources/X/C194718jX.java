package X;

import android.content.res.Resources;
import android.os.Build;
import android.os.StatFs;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194718jX {
    public static final C194718jX A00 = new Object();
    public static final Map A01 = new LinkedHashMap();

    public final double[] A00() {
        long j;
        Map map = A01;
        if (map.isEmpty()) {
            C0JK A012 = C0JK.A01();
            A012.A07();
            C0JK.A03(A012);
            C0JK.A04(A012);
            StatFs statFs = A012.A03;
            if (statFs != null) {
                j = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            } else {
                j = -1;
            }
            map.put("device_total_space", Double.valueOf(j));
            C0JK.A01().A07();
            map.put("device_free_space", Double.valueOf(r0.A05()));
            map.put("os_sdk", Double.valueOf(Build.VERSION.SDK_INT));
            Resources resources = AbstractC12290kX.A00.getResources();
            C14360o3.A07(resources);
            C14360o3.A07(resources.getDisplayMetrics());
            map.put("screen_resolution", Double.valueOf(r0.widthPixels * r0.heightPixels));
            map.put("reliable_core_count", Double.valueOf(C15900qk.A01().A06()));
            C15900qk A013 = C15900qk.A01();
            if (A013.A00 == 0) {
                C15900qk.A03(A013);
            }
            map.put("cpu_max_freq", Double.valueOf(A013.A00));
            Resources resources2 = AbstractC12290kX.A00.getResources();
            C14360o3.A07(resources2);
            C14360o3.A07(resources2.getDisplayMetrics());
            map.put("density_dpi", Double.valueOf(r0.densityDpi));
            C15900qk A014 = C15900qk.A01();
            if (A014.A00 == 0) {
                C15900qk.A03(A014);
            }
            map.put("low_power_cpu_max_freq", Double.valueOf(A014.A01));
        }
        Collection values = map.values();
        C14360o3.A0B(values, 0);
        double[] dArr = new double[values.size()];
        Iterator it = values.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = ((Number) it.next()).doubleValue();
            i++;
        }
        return dArr;
    }
}
