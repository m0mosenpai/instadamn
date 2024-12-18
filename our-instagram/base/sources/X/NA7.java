package X;

/* loaded from: classes9.dex */
public abstract class NA7 extends C1P1 {
    public final C1P1 A00;

    public NA7(C1P1 c1p1) {
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1420154755);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(2142669173, A0N);
    }

    @Override // X.C1P1
    public void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 406205892);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(1303412379, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1055294187);
        this.A00.onFinish();
        C0f9.A0A(1787318387, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-340027552);
        this.A00.onStart();
        C0f9.A0A(623934768, A03);
    }

    @Override // X.C1P1
    public void onSuccess(Object obj) {
        int A03 = C0f9.A03(417370329);
        this.A00.onSuccess(obj);
        C0f9.A0A(1696977451, A03);
    }

    @Override // X.C1P1
    public final void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-40390505);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(-892149085, A03);
    }
}
