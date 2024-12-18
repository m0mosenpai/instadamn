package X;

import android.app.ActivityManager;
import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.0cQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08620cQ extends C0k0 {
    public ActivityManager A00;

    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "ig_memory_perf_stats";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0k0
    public final /* bridge */ /* synthetic */ Object A03() {
        C11150iW c11150iW;
        ActivityManager activityManager = this.A00;
        if (activityManager != null) {
            Object obj = new Object();
            C11150iW.A0W = activityManager;
            c11150iW = obj;
        } else {
            c11150iW = new C11150iW();
        }
        c11150iW.A0V = true;
        c11150iW.A0U = false;
        c11150iW.A05 = Debug.getNativeHeapAllocatedSize();
        Runtime runtime = Runtime.getRuntime();
        c11150iW.A04 = runtime.totalMemory() - runtime.freeMemory();
        C09170dP.A06.size();
        return c11150iW;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        ActivityManager.MemoryInfo memoryInfo;
        C11150iW c11150iW = (C11150iW) obj;
        C14360o3.A0B(runnableC16080r6, 0);
        if (c11150iW != null && c11150iW.A0U && (memoryInfo = c11150iW.A0M) != null) {
            C0XF BTP = runnableC16080r6.BTP();
            C0XF.A00(BTP);
            BTP.A01.add("memory_stats");
            runnableC16080r6.BTP().A02("avail_mem", memoryInfo.availMem);
            runnableC16080r6.BTP().A02("low_mem", memoryInfo.threshold);
            runnableC16080r6.BTP().A02("total_mem", memoryInfo.totalMem);
            runnableC16080r6.BTP().A02("native_heap_at_start", c11150iW.A05);
            runnableC16080r6.BTP().A02("java_heap_at_start", c11150iW.A04);
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return C11150iW.class;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return true;
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ void EoT(Object obj) {
        C11150iW c11150iW = (C11150iW) obj;
        if (c11150iW != null) {
            c11150iW.A03(4);
        }
    }
}
