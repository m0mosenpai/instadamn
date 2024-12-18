package X;

/* renamed from: X.Y9z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73368Y9z implements YNa {
    @Override // X.YNa
    public final /* bridge */ /* synthetic */ void reportTo(AbstractC72463XeB abstractC72463XeB, YNZ ynz) {
        C72184XRu c72184XRu = (C72184XRu) abstractC72463XeB;
        AbstractC167017dG.A1N(c72184XRu, ynz);
        AbstractC72539Xg7.A00(ynz, Long.valueOf(c72184XRu.A02), "pgpgin");
        AbstractC72539Xg7.A00(ynz, Long.valueOf(c72184XRu.A03), "pgpgout");
        AbstractC72539Xg7.A00(ynz, Long.valueOf(c72184XRu.A04), "pswpin");
        AbstractC72539Xg7.A00(ynz, Long.valueOf(c72184XRu.A05), "pswpout");
        AbstractC72539Xg7.A00(ynz, Long.valueOf(c72184XRu.A00), "pgfault");
        AbstractC72539Xg7.A00(ynz, Long.valueOf(c72184XRu.A01), "pgmajfault");
    }
}
