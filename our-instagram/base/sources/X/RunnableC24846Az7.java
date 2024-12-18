package X;

/* renamed from: X.Az7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24846Az7 implements Runnable {
    public final /* synthetic */ EnumC46283KeF A00;
    public final /* synthetic */ C7YJ A01;
    public final /* synthetic */ C7T3 A02;
    public final /* synthetic */ boolean A03;

    public RunnableC24846Az7(EnumC46283KeF enumC46283KeF, C7YJ c7yj, C7T3 c7t3, boolean z) {
        this.A01 = c7yj;
        this.A02 = c7t3;
        this.A03 = z;
        this.A00 = enumC46283KeF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01(this.A00, this.A02, null, this.A03);
    }
}
