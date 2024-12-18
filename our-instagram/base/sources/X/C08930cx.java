package X;

import com.facebook.memorytimeline.MemoryTimeline;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08930cx extends C0k0 {
    public final Map A00;
    public final AtomicReference A01 = new AtomicReference(null);

    public C08930cx() {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.put(C0TP.A0V, "java_heap_used");
        hashMap.put(C0TP.A08, "address_space_used");
        hashMap.put(C0TP.A0A, "bitmap_count");
        hashMap.put(C0TP.A0B, "bitmap_kb");
        hashMap.put(C0TP.A17, "window_count");
        hashMap.put(C0TP.A0H, "fresco_in_use_bitmap_kb");
        hashMap.put(C0TP.A16, "video_memory_cache_kb");
        hashMap.put(C0TP.A15, "video_buffer_total_kb");
        hashMap.put(C0TP.A0P, "hermes_allocated_kb");
        hashMap.put(C0TP.A0Q, "hermes_heap_kb");
        hashMap.put(C0TP.A0R, "hermes_malloc_size_kb");
    }

    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "mobile_infra_memory_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 52;
    }

    private void A00(RunnableC16080r6 runnableC16080r6, Collection collection, boolean z) {
        String str;
        if (z) {
            str = "_start";
        } else {
            str = "_end";
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0TJ c0tj = (C0TJ) it.next();
            String str2 = (String) this.A00.get(c0tj.A02);
            if (str2 != null) {
                runnableC16080r6.BTP().A02(AnonymousClass001.A0R(str2, str), c0tj.A00);
            }
        }
    }

    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        MemoryTimeline memoryTimeline = (MemoryTimeline) this.A01.get();
        if (memoryTimeline == null) {
            return null;
        }
        return C2RK.A00(C0TG.A03, (C2RK) memoryTimeline, -1);
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        C0TS c0ts = (C0TS) obj;
        C0TS c0ts2 = (C0TS) obj2;
        if (c0ts != null && c0ts2 != null) {
            A00(runnableC16080r6, c0ts.A00, true);
            A00(runnableC16080r6, c0ts2.A00, false);
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return C0TS.class;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return C20150ym.A07(AbstractC20100yh.A00(36312269155664925L));
    }
}
