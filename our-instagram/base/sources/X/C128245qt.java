package X;

/* renamed from: X.5qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128245qt extends C1P1 {
    public final C1P1 A00;

    public C128245qt(C1P1 c1p1) {
        C14360o3.A0B(c1p1, 1);
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1744960163);
        C14360o3.A0B(abstractC115105If, 0);
        C1P1 c1p1 = this.A00;
        c1p1.onFail(abstractC115105If);
        c1p1.onFinish();
        C0f9.A0A(1065464871, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1274674716);
        C14360o3.A0B(abstractC115105If, 0);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(-677493621, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-500376419);
        this.A00.onStart();
        C0f9.A0A(-533765357, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1438698873);
        int A032 = C0f9.A03(64596885);
        C14360o3.A0B(obj, 0);
        C1P1 c1p1 = this.A00;
        c1p1.onSuccess(obj);
        c1p1.onFinish();
        C0f9.A0A(-761652704, A032);
        C0f9.A0A(1067949142, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-27105606);
        int A032 = C0f9.A03(220280697);
        C14360o3.A0B(obj, 0);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(938727743, A032);
        C0f9.A0A(-307721480, A03);
    }
}
