package X;

/* renamed from: X.YId, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73533YId implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C147426kS A02;
    public final /* synthetic */ C72699XlS A03;

    public RunnableC73533YId(C147426kS c147426kS, C72699XlS c72699XlS, int i, int i2) {
        this.A03 = c72699XlS;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c147426kS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72699XlS c72699XlS = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        C147396kP c147396kP = c72699XlS.A00;
        C41181vS c41181vS = c147396kP.A00;
        if (c41181vS != null) {
            c147396kP.A04.A0R(c41181vS, i, i2);
        }
        this.A02.A01 = false;
    }
}
