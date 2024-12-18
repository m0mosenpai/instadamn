package com.instagram.debug.devoptions.debughead.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C19260xA;
import X.C19280xC;
import X.C193668hm;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class ScrollPerfData {
    public static final List SCROLL_PERF_FIELDS = Arrays.asList("timestamp", "container_module", "1_frame_drop_bucket", "4_frame_drop_bucket", "8_frame_drop_bucket", "total_time_spent", "total_busy_time_spent", AggregateScrollData.UTILIZATION_FIELD, "heap_free_ratio", "display_refresh_rate", "active_threads", "post_lfd_threads");
    public final Map mData;

    public Object getFieldValue(String str) {
        Object obj = this.mData.get(str);
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException(str);
    }

    public ScrollPerfData(C19280xC c19280xC) {
        HashMap A1G = AbstractC166987dD.A1G();
        this.mData = A1G;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
        List list = SCROLL_PERF_FIELDS;
        A1G.put(AbstractC166987dD.A16(list), simpleDateFormat.format(new Date(c19280xC.A00)));
        A1G.put(list.get(1), c19280xC.A03);
        Object obj = list.get(2);
        C19260xA c19260xA = c19280xC.A06;
        A1G.put(obj, c19260xA.A03("1_frame_drop_bucket"));
        A1G.put(list.get(3), c19280xC.A02("4_frame_drop_bucket"));
        A1G.put(list.get(4), c19280xC.A02("8_frame_drop_bucket"));
        A1G.put(list.get(5), c19260xA.A04("total_time_spent"));
        A1G.put(list.get(6), c19260xA.A04("total_busy_time_spent"));
        Object obj2 = list.get(7);
        Long A04 = c19260xA.A04("total_busy_time_spent");
        A04.getClass();
        float longValue = ((float) A04.longValue()) * 100.0f;
        Long A042 = c19260xA.A04("total_time_spent");
        A042.getClass();
        A1G.put(obj2, Float.valueOf(longValue / ((float) A042.longValue())));
        Object obj3 = list.get(8);
        Double A02 = c19260xA.A02("heap_free_ratio");
        A02.getClass();
        AbstractC166997dE.A1T(obj3, A1G, A02.doubleValue() * 100.0d);
        A1G.put(list.get(9), c19280xC.A02("display_refresh_rate"));
    }

    public ScrollPerfData(C193668hm c193668hm) {
        HashMap A1G = AbstractC166987dD.A1G();
        this.mData = A1G;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
        List list = SCROLL_PERF_FIELDS;
        A1G.put(AbstractC166987dD.A16(list), simpleDateFormat.format(new Date(c193668hm.A04)));
        A1G.put(list.get(1), c193668hm.A07);
        AbstractC166997dE.A1U(list.get(2), A1G, c193668hm.A03);
        A1G.put(list.get(3), Float.valueOf(c193668hm.A02));
        A1G.put(list.get(4), Float.valueOf(0.0f));
        A1G.put(list.get(5), Long.valueOf(c193668hm.A06));
        A1G.put(list.get(6), Long.valueOf(c193668hm.A05));
        A1G.put(list.get(7), Float.valueOf((((float) c193668hm.A05) * 100.0f) / ((float) c193668hm.A06)));
        AbstractC166997dE.A1T(list.get(8), A1G, c193668hm.A00 * 100.0d);
        A1G.put(list.get(9), Float.valueOf(c193668hm.A01));
        A1G.put(list.get(10), c193668hm.A08);
        A1G.put(list.get(11), c193668hm.A09);
    }
}
