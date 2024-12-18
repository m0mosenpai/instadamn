package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46302As {
    public final Context A00;
    public final C46322Au A01;
    public final C46332Av A02;
    public final AtomicReference A03 = new AtomicReference(new LruCache(10));

    public C46302As(Context context, C2A4 c2a4, C46272Ao c46272Ao, C42081wy c42081wy, HeroPlayerSetting heroPlayerSetting, InterfaceC460429o interfaceC460429o) {
        this.A00 = context;
        C46322Au c46322Au = new C46322Au();
        this.A01 = c46322Au;
        this.A02 = new C46332Av(context, c46322Au, c2a4, c46272Ao, c42081wy, heroPlayerSetting, interfaceC460429o);
    }

    public final void A00(HeroPlayerSetting heroPlayerSetting, Map map) {
        int i;
        int i2;
        C46322Au c46322Au = this.A01;
        if (map.containsKey("dash.live_max_dash_segments_per_video_buffered")) {
            i = Integer.parseInt((String) map.get("dash.live_max_dash_segments_per_video_buffered"));
        } else {
            i = 12;
        }
        int i3 = i * 2;
        AtomicInteger atomicInteger = c46322Au.A00;
        int i4 = atomicInteger.get();
        if (i3 > 0 && atomicInteger.compareAndSet(i4, i3)) {
            AbstractC459729h.A01("DashChunkMemoryCache", "Max buffer size is updated: old=%d, new=%d", Integer.valueOf(i4), Integer.valueOf(i3));
        }
        AtomicReference atomicReference = c46322Au.A01;
        synchronized (atomicReference) {
            AbstractC459729h.A03("DashChunkMemoryCache", atomicReference);
        }
        this.A02.A05 = heroPlayerSetting.A18;
        synchronized (this) {
            AbstractC459729h.A03("DashLiveChunkSourceCache", this.A03);
        }
        if (map.containsKey("dash.live_max_dash_segments_per_video_buffered")) {
            i2 = Integer.parseInt((String) map.get("dash.live_max_dash_segments_per_video_buffered"));
        } else {
            i2 = 12;
        }
        int i5 = i2 * 2;
        int i6 = i5 * 10;
        VKD vkd = Wc7.A0B;
        AbstractC459729h.A01("PrefetchableDataSource", "updateParam: totalSegments=%d, segmentsPerVideo=%d, ", Integer.valueOf(i6), Integer.valueOf(i5));
        VKD vkd2 = Wc7.A0B;
        synchronized (vkd2) {
            if (i6 <= 0) {
                i6 = HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
            }
            if (i5 <= 0) {
                i5 = 12;
            }
            if (i5 != vkd2.A00) {
                HashMap hashMap = vkd2.A03;
                for (Map.Entry entry : hashMap.entrySet()) {
                    C66339U9y c66339U9y = new C66339U9y(vkd2, i5);
                    Map snapshot = ((LruCache) entry.getValue()).snapshot();
                    for (UMT umt : snapshot.keySet()) {
                        c66339U9y.put(umt, (InterfaceC92354Bq) snapshot.get(umt));
                    }
                    hashMap.put((String) entry.getKey(), c66339U9y);
                }
                vkd2.A00 = i5;
            }
            if (i6 != vkd2.A01) {
                C66338U9x c66338U9x = new C66338U9x(vkd2, i6);
                Map snapshot2 = vkd2.A02.snapshot();
                for (UMT umt2 : snapshot2.keySet()) {
                    c66338U9x.put(umt2, (InterfaceC92354Bq) snapshot2.get(umt2));
                }
                vkd2.A02 = c66338U9x;
                vkd2.A01 = i6;
            }
        }
    }
}
