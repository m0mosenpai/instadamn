package X;

/* renamed from: X.M6g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50017M6g implements Runnable {
    public final /* synthetic */ C1586479z A00;
    public final /* synthetic */ JUG A01;
    public final /* synthetic */ MRJ A02;
    public final /* synthetic */ JUe A03;
    public final /* synthetic */ JUe A04;

    public RunnableC50017M6g(C1586479z c1586479z, JUG jug, MRJ mrj, JUe jUe, JUe jUe2) {
        this.A00 = c1586479z;
        this.A01 = jug;
        this.A04 = jUe;
        this.A02 = mrj;
        this.A03 = jUe2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1586479z c1586479z = this.A00;
        C43695JUf c43695JUf = (C43695JUf) c1586479z.A0A.getValue();
        JUG jug = this.A01;
        JUe jUe = this.A04;
        c43695JUf.A01(jug, this.A02, jUe, new C49389LsN(c1586479z, jug, this.A03));
        C162907Rb c162907Rb = c1586479z.A09;
        if (c162907Rb != null) {
            c162907Rb.A02(jug, jUe);
        }
    }
}
