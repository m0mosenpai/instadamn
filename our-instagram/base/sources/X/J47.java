package X;

/* loaded from: classes7.dex */
public final class J47 implements Runnable {
    public final /* synthetic */ HCZ A00;

    public J47(HCZ hcz) {
        this.A00 = hcz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HCZ hcz = this.A00;
        C3FR c3fr = hcz.A03;
        if (c3fr != null) {
            c3fr.EWc(true);
        }
        C38968HDw c38968HDw = hcz.A05;
        if (c38968HDw == null) {
            C14360o3.A0F("clipsSavedTabFetcher");
            throw C00O.createAndThrow();
        }
        c38968HDw.A01();
    }
}
