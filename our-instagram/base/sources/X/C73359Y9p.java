package X;

/* renamed from: X.Y9p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73359Y9p implements YNY {
    public static final int[] A00 = {8224};

    /* JADX WARN: Type inference failed for: r5v0, types: [X.XeB, java.lang.Object, X.XRp] */
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        ?? obj = new Object();
        long[] jArr = new long[1];
        int[] iArr = A00;
        if (C0JC.A01("/proc/self/oom_score", iArr, jArr)) {
            obj.A00 = Long.valueOf(jArr[0]);
        }
        if (C0JC.A01("/proc/self/oom_score_adj", iArr, jArr)) {
            obj.A01 = Long.valueOf(jArr[0]);
        }
        return obj;
    }
}
