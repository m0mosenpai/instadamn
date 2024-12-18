package X;

/* renamed from: X.Aqn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24344Aqn implements Runnable {
    public final /* synthetic */ C8XV A00;

    public RunnableC24344Aqn(C8XV c8xv) {
        this.A00 = c8xv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8XV c8xv = this.A00;
        C8Y1 c8y1 = c8xv.A00;
        if (c8y1 != null) {
            c8y1.A00();
            C8Y1 c8y12 = c8xv.A00;
            if (c8y12 != null) {
                c8y12.A01();
                return;
            }
        }
        C14360o3.A0F("backPressDelegate");
        throw C00O.createAndThrow();
    }
}
