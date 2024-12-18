package X;

/* renamed from: X.YHp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73525YHp implements Runnable {
    public final YG2 A00;
    public final /* synthetic */ C72331XbT A01;

    public RunnableC73525YHp(YG2 yg2, C72331XbT c72331XbT) {
        this.A01 = c72331XbT;
        this.A00 = yg2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        YG2 yg2 = this.A00;
        yg2.A03 = true;
        this.A01.A00.remove(yg2);
    }
}
