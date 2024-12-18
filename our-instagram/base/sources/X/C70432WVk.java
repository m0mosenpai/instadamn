package X;

/* renamed from: X.WVk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70432WVk implements InterfaceC48212Jk {
    public final /* synthetic */ C70567Wd1 A00;

    public C70432WVk(C70567Wd1 c70567Wd1) {
        this.A00 = c70567Wd1;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C70567Wd1 c70567Wd1 = this.A00;
        C14360o3.A0A(th);
        c70567Wd1.onFailure(th);
    }
}
