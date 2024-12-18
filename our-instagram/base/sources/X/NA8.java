package X;

import kotlin.Deprecated;

@Deprecated(message = "This is a temporary class used to test ThreadPoolScheduler with legacy code")
/* loaded from: classes9.dex */
public final class NA8 extends C1P1 {
    public C1ON A00;
    public final C1P1 A01;

    public NA8(C1P1 c1p1, C1ON c1on) {
        this.A01 = c1p1;
        this.A00 = c1on;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1541768829);
        super.onFail(abstractC115105If);
        this.A01.onFail(abstractC115105If);
        C0f9.A0A(1610177505, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1735151155);
        super.onFailInBackground(abstractC115105If);
        this.A01.onFailInBackground(abstractC115105If);
        C0f9.A0A(-404095081, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1169190881);
        super.onFinish();
        this.A00 = null;
        this.A01.onFinish();
        C0f9.A0A(-2068179176, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(660626260);
        super.onStart();
        this.A01.onStart();
        C0f9.A0A(-1976955950, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-373758927);
        int A0N = AbstractC167017dG.A0N(obj, -116750762);
        super.onSuccess(obj);
        this.A01.onSuccess(obj);
        C0f9.A0A(1491361739, A0N);
        C0f9.A0A(733338256, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(767402589);
        int A0N = AbstractC167017dG.A0N(obj, -1859899829);
        super.onSuccessInBackground(obj);
        this.A01.onSuccessInBackground(obj);
        C0f9.A0A(213348820, A0N);
        C0f9.A0A(293801057, A03);
    }
}
