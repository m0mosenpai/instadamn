package X;

/* renamed from: X.Axh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24759Axh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C218279kz A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24759Axh(C218279kz c218279kz, int i, boolean z) {
        this.A02 = z;
        this.A01 = c218279kz;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A02;
        C218279kz c218279kz = this.A01;
        if (z) {
            ((C8J9) c218279kz).A01.EMO(this.A00, ((C8JF) c218279kz.A00).A00);
        } else {
            ((C8J9) c218279kz).A01.A08(this.A00);
        }
    }
}
