package X;

/* loaded from: classes8.dex */
public final class M35 implements Runnable {
    public final /* synthetic */ LYZ A00;
    public final /* synthetic */ C38321qM A01;

    public M35(LYZ lyz, C38321qM c38321qM) {
        this.A00 = lyz;
        this.A01 = c38321qM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C168077f2 c168077f2 = this.A00.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        c168077f2.EkZ(this.A01);
    }
}
