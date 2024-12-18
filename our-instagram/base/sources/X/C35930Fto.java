package X;

/* renamed from: X.Fto, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35930Fto implements InterfaceC37147GYi {
    public final /* synthetic */ GZR A00;
    public final /* synthetic */ String A01;

    public C35930Fto(GZR gzr, String str) {
        this.A00 = gzr;
        this.A01 = str;
    }

    @Override // X.InterfaceC37147GYi
    public final void Dqa(EnumC33332EoR enumC33332EoR) {
        this.A00.onAuthorizeSuccess(this.A01);
    }

    @Override // X.InterfaceC37147GYi
    public final void onError(Throwable th) {
        this.A00.onAuthorizeFail();
    }
}
