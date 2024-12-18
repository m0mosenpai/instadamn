package X;

/* renamed from: X.AwF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24674AwF implements Runnable {
    public final /* synthetic */ C23327AVm A00;
    public final /* synthetic */ Long A01;

    public /* synthetic */ RunnableC24674AwF(C23327AVm c23327AVm, Long l) {
        this.A00 = c23327AVm;
        this.A01 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23327AVm c23327AVm = this.A00;
        Long l = this.A01;
        C219909nc c219909nc = c23327AVm.A02.A06;
        c219909nc.A00 = 3;
        ((AbstractC208809Lo) c219909nc).A00.A03(l);
        C80F c80f = c23327AVm.A00;
        if (c80f != null) {
            c80f.DRr(l);
        }
    }
}
