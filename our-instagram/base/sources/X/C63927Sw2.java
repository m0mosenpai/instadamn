package X;

/* renamed from: X.Sw2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63927Sw2 implements InterfaceC65635Tpw, InterfaceC65338TiJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63927Sw2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        if (this.A00 != 0) {
        } else {
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
        if (this.A00 != 0) {
            ((SMM) this.A02).A00((InterfaceC159157Cb) this.A01, 0);
        } else {
            ((InterfaceC65636Tpx) ((C63928Sw3) this.A01).A02).onSuccess(this.A02);
        }
    }
}
