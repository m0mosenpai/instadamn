package X;

/* renamed from: X.TFb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64465TFb implements InterfaceC65528Tlx {
    public final /* synthetic */ C60915RbU A00;
    public final /* synthetic */ C62563SGo A01;

    @Override // X.InterfaceC65528Tlx
    public final void AGv(int i, boolean z) {
    }

    public C64465TFb(C60915RbU c60915RbU, C62563SGo c62563SGo) {
        this.A01 = c62563SGo;
        this.A00 = c60915RbU;
    }

    @Override // X.InterfaceC65528Tlx
    public final void cancel() {
        this.A01.A01.ATO(new Rc3(this.A00));
    }
}
