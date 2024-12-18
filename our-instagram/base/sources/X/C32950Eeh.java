package X;

/* renamed from: X.Eeh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32950Eeh extends AbstractC154286wd {
    public final /* synthetic */ C38J A00;

    public C32950Eeh(C38J c38j) {
        this.A00 = c38j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1106731772);
        C38J.A04(this.A00);
        C0f9.A0A(-1927071078, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(-798228833, C0f9.A03(1297432883));
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(-735698514, C0f9.A03(685997413));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1188755107);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A0N = AbstractC167017dG.A0N(c74293Vk, 1956233078);
        C38J c38j = this.A00;
        c38j.A0b(c74293Vk);
        C38J.A04(c38j);
        C0f9.A0A(2114266178, A0N);
        C0f9.A0A(1461618533, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(654861365);
        C0f9.A0A(1713081385, C0f9.A03(2044463268));
        C0f9.A0A(1504306704, A03);
    }
}
