package X;

/* renamed from: X.Au6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24549Au6 implements Runnable {
    public final /* synthetic */ C3LV A00;
    public final /* synthetic */ C6VJ A01;

    public RunnableC24549Au6(C3LV c3lv, C6VJ c6vj) {
        this.A01 = c6vj;
        this.A00 = c3lv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6VJ c6vj = this.A01;
        C3LV c3lv = this.A00;
        C6VJ.A00(c3lv, c6vj);
        C6VL.A00.remove(c3lv);
    }
}
