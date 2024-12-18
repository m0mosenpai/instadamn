package X;

/* renamed from: X.Aty, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24541Aty implements Runnable {
    public final /* synthetic */ C23331AWa A00;
    public final /* synthetic */ C23578AcX A01;

    public RunnableC24541Aty(C23331AWa c23331AWa, C23578AcX c23578AcX) {
        this.A00 = c23331AWa;
        this.A01 = c23578AcX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23331AWa c23331AWa = this.A00;
        C23578AcX c23578AcX = this.A01;
        c23331AWa.A0I = c23578AcX;
        if (c23331AWa.A02 != null) {
            boolean A00 = C178607wY.A00();
            AnonymousClass810 anonymousClass810 = c23331AWa.A02;
            if (A00) {
                anonymousClass810 = ((C9YQ) anonymousClass810).A00;
            }
            c23578AcX.A02(anonymousClass810);
        }
    }
}
