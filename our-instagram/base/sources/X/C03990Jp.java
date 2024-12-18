package X;

/* renamed from: X.0Jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03990Jp extends C1P1 {
    public final C1P1 A00;
    public final InterfaceC03960Jm A01;

    public C03990Jp(C1P1 c1p1, InterfaceC03960Jm interfaceC03960Jm) {
        C14360o3.A0B(interfaceC03960Jm, 2);
        this.A00 = c1p1;
        this.A01 = interfaceC03960Jm;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1814329873);
        C14360o3.A0B(abstractC115105If, 0);
        this.A00.onFail(abstractC115105If);
        this.A01.AIn(null);
        C0f9.A0A(-1413765547, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1789602439);
        C14360o3.A0B(abstractC115105If, 0);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(-1707668277, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1005619434);
        this.A00.onFinish();
        C0f9.A0A(-1310615216, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2111469717);
        this.A00.onStart();
        C0f9.A0A(1644563582, A03);
    }

    @Override // X.C1P1
    public final void onSuccess(Object obj) {
        int A03 = C0f9.A03(-43882817);
        this.A00.onSuccess(obj);
        this.A01.AIn(null);
        C0f9.A0A(-851116108, A03);
    }

    @Override // X.C1P1
    public final void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(35559448);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(-1080661143, A03);
    }
}
