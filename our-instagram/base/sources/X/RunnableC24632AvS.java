package X;

/* renamed from: X.AvS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24632AvS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8C0 A01;

    public /* synthetic */ RunnableC24632AvS(C8C0 c8c0, int i) {
        this.A01 = c8c0;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8C0 c8c0 = this.A01;
        int i = this.A00;
        if (c8c0.A0C) {
            if (c8c0.A0D) {
                i++;
            }
            int A02 = C8C0.A02(c8c0);
            if (A02 != i) {
                c8c0.A07 = true;
                c8c0.EMO(i, A02);
                c8c0.A07 = false;
            }
        }
    }
}
