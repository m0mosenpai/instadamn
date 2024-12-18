package X;

/* renamed from: X.Wvm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC71537Wvm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC69781VvI A01;
    public final /* synthetic */ EnumC68128VCm A02;

    public /* synthetic */ RunnableC71537Wvm(AbstractC69781VvI abstractC69781VvI, EnumC68128VCm enumC68128VCm, int i) {
        this.A01 = abstractC69781VvI;
        this.A02 = enumC68128VCm;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A04(this.A02, VDE.A06, "FAILED_INSTALL", String.valueOf(this.A00));
    }
}
