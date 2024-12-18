package X;

/* renamed from: X.6X8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6X8 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6X7 A01;
    public final /* synthetic */ boolean A02;

    public C6X8(C6X7 c6x7, long j, boolean z) {
        this.A01 = c6x7;
        this.A00 = j;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.Cge(this.A00, this.A02);
    }
}
