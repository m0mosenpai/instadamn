package X;

/* renamed from: X.560, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass560 implements C11R {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C99074cU A01;

    @Override // X.C11R
    public final String getName() {
        return "ReplayableCacheData";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 773867903;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    public AnonymousClass560(C1P1 c1p1, C99074cU c99074cU) {
        this.A00 = c1p1;
        this.A01 = c99074cU;
    }

    @Override // X.C11R
    public final void onFinish() {
        C1P1 c1p1 = this.A00;
        c1p1.onFinish();
        c1p1.onSuccess(this.A01.A01);
    }

    @Override // X.C11R
    public final void onStart() {
        this.A00.onStart();
    }

    @Override // X.C11R
    public final void run() {
        this.A00.onSuccessInBackground(this.A01.A01);
    }
}
