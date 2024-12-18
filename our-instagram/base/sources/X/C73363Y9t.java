package X;

/* renamed from: X.Y9t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73363Y9t implements YNa {
    @Override // X.YNa
    public final /* bridge */ /* synthetic */ void reportTo(AbstractC72463XeB abstractC72463XeB, YNZ ynz) {
        C72185XRv c72185XRv = (C72185XRv) abstractC72463XeB;
        AbstractC72539Xg7.A00(ynz, c72185XRv.A05, "total_bytes_freed");
        AbstractC72539Xg7.A00(ynz, c72185XRv.A04, "total_alloc_count_bytes");
        AbstractC72539Xg7.A00(ynz, c72185XRv.A02, "gc_count");
        AbstractC72539Xg7.A00(ynz, c72185XRv.A03, "gc_time");
        AbstractC72539Xg7.A00(ynz, c72185XRv.A00, AbstractC58317Pt9.A00(695));
        AbstractC72539Xg7.A00(ynz, c72185XRv.A01, AbstractC58317Pt9.A00(696));
        String str = c72185XRv.A07;
        if (str != null) {
            ynz.A7n("gc_count_rate_histogram", str);
        }
        String str2 = c72185XRv.A06;
        if (str2 != null) {
            ynz.A7n("gc_blocking_gc_count_rate_histogram", str2);
        }
    }
}
