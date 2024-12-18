package X;

/* renamed from: X.M5k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49995M5k implements Runnable {
    public final /* synthetic */ C1579977j A00;
    public final /* synthetic */ C43678JTm A01;
    public final /* synthetic */ C7SX A02;

    public RunnableC49995M5k(C1579977j c1579977j, C43678JTm c43678JTm, C7SX c7sx) {
        this.A00 = c1579977j;
        this.A01 = c43678JTm;
        this.A02 = c7sx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1579977j c1579977j = this.A00;
        C43678JTm c43678JTm = this.A01;
        C1579977j.A02(c1579977j, c43678JTm, this.A02);
        L7B l7b = c43678JTm.A04;
        if (l7b != null) {
            l7b.A00();
        }
        c43678JTm.A04 = null;
    }
}
