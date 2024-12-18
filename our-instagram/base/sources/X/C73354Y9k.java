package X;

import android.os.Debug;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.Y9k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73354Y9k implements YNY {
    /* JADX WARN: Type inference failed for: r6v0, types: [X.XeB, java.lang.Object, X.XRq] */
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        Runtime runtime = Runtime.getRuntime();
        ?? obj = new Object();
        obj.A01 = runtime.maxMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        obj.A00 = (runtime.totalMemory() - runtime.freeMemory()) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        obj.A03 = Debug.getNativeHeapSize() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        obj.A02 = Debug.getNativeHeapAllocatedSize() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        return obj;
    }
}
