package X;

/* renamed from: X.ESi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32482ESi extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32538EUo A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C32482ESi(C32538EUo c32538EUo, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = c32538EUo;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -2018700106);
        super.onFailInBackground(abstractC115105If);
        int i = this.A00;
        if (i < 11) {
            C14270nr.A00().A01(new C32668EZs(this.A01, this.A03, this.A02, i + 1), 3600000L);
        }
        C0f9.A0A(488485038, A0N);
    }
}
