package X;

import android.os.Debug;

/* renamed from: X.Y9n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73357Y9n implements YNY {
    public Debug.MemoryInfo A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.XeB, java.lang.Object, X.XRr] */
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        ?? obj = new Object();
        Debug.MemoryInfo memoryInfo = this.A00;
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            this.A00 = memoryInfo;
        }
        Debug.getMemoryInfo(memoryInfo);
        Debug.MemoryInfo memoryInfo2 = this.A00;
        obj.A03 = Integer.valueOf(memoryInfo2.getTotalPrivateDirty());
        obj.A04 = Integer.valueOf(memoryInfo2.getTotalPss());
        memoryInfo2.getTotalSharedDirty();
        obj.A00 = Integer.valueOf(memoryInfo2.dalvikPss);
        obj.A01 = Integer.valueOf(memoryInfo2.nativePss);
        obj.A02 = Integer.valueOf(memoryInfo2.getTotalPrivateClean());
        memoryInfo2.getTotalSharedClean();
        memoryInfo2.getTotalSwappablePss();
        return obj;
    }
}
