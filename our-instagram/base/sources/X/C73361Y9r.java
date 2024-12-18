package X;

import java.util.List;

/* renamed from: X.Y9r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73361Y9r implements YNY {
    public static final List A00 = AbstractC16960so.A1Q("pgpgin", "pgpgout", "pswpin", "pswpout", "pgfault", "pgmajfault");

    /* JADX WARN: Type inference failed for: r2v0, types: [X.XeB, java.lang.Object, X.XRu] */
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        ?? obj = new Object();
        List list = A00;
        long[] jArr = new long[list.size()];
        if (C0JC.A02("/proc/vmstat", jArr, (String[]) list.toArray(new String[0]))) {
            obj.A02 = jArr[list.indexOf("pgpgin")];
            obj.A03 = jArr[list.indexOf("pgpgout")];
            obj.A04 = jArr[list.indexOf("pswpin")];
            obj.A05 = jArr[list.indexOf("pswpout")];
            obj.A00 = jArr[list.indexOf("pgfault")];
            obj.A01 = jArr[list.indexOf("pgmajfault")];
        }
        return obj;
    }
}
