package X;

/* renamed from: X.WVl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70433WVl implements InterfaceC48212Jk {
    public final /* synthetic */ C70566Wd0 A00;

    public C70433WVl(C70566Wd0 c70566Wd0) {
        this.A00 = c70566Wd0;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C70566Wd0 c70566Wd0 = this.A00;
        C14360o3.A0A(th);
        c70566Wd0.onFailure(th);
    }
}
