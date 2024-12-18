package X;

import java.util.List;

/* renamed from: X.Y9q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73360Y9q implements YNY {
    public static final List A00 = AbstractC16960so.A1Q("VmHWM:", "VmRSS:", "VmData:", "VmLib:", "Threads:");

    /* JADX WARN: Type inference failed for: r2v0, types: [X.XeB, java.lang.Object, X.XRs] */
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        ?? obj = new Object();
        List list = A00;
        long[] jArr = new long[list.size()];
        C0JC.A02(AbstractC111324zv.A00(1474), jArr, (String[]) list.toArray(new String[0]));
        obj.A02 = jArr[list.indexOf("VmHWM:")];
        obj.A04 = jArr[list.indexOf("VmRSS:")];
        obj.A01 = jArr[list.indexOf("VmData:")];
        obj.A03 = jArr[list.indexOf("VmLib:")];
        obj.A00 = jArr[list.indexOf("Threads:")];
        return obj;
    }
}
