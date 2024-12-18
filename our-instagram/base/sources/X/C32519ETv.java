package X;

/* renamed from: X.ETv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32519ETv extends C1P1 {
    public final /* synthetic */ AbstractC12990ll A00;
    public final /* synthetic */ C7K9 A01;
    public final /* synthetic */ C4LM A02;
    public final /* synthetic */ String A03;

    public C32519ETv(AbstractC12990ll abstractC12990ll, C7K9 c7k9, C4LM c4lm, String str) {
        this.A02 = c4lm;
        this.A03 = str;
        this.A00 = abstractC12990ll;
        this.A01 = c7k9;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1648578244);
        C7K9 c7k9 = this.A01;
        if (c7k9 != null) {
            c7k9.onFail(abstractC115105If);
        }
        C0f9.A0A(-259710450, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-562159813);
        this.A02.A01.remove(this.A03);
        C0f9.A0A(-603587886, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(863863808);
        EC7 ec7 = (EC7) obj;
        int A032 = C0f9.A03(-1187414877);
        AbstractC25651Mw.A00(this.A00).E4s(new C36094FwU(ec7.A00));
        C7K9 c7k9 = this.A01;
        if (c7k9 != null) {
            c7k9.onSuccess(ec7.A00);
        }
        C0f9.A0A(-627035808, A032);
        C0f9.A0A(1044783312, A03);
    }
}
