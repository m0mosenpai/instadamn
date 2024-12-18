package X;

/* renamed from: X.Axw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24774Axw implements Runnable {
    public final /* synthetic */ CallableC24927B1a A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24774Axw(CallableC24927B1a callableC24927B1a, String str, boolean z) {
        this.A00 = callableC24927B1a;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.DiH(this.A02, this.A01);
    }
}
