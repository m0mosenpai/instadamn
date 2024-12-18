package X;

/* renamed from: X.KJv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45684KJv extends C2AH {
    public final /* synthetic */ InterfaceC50448MPc A00;

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A00.onFailure(exc);
    }

    public C45684KJv(InterfaceC50448MPc interfaceC50448MPc) {
        this.A00 = interfaceC50448MPc;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.DqF(AbstractC25228BEl.A1C(obj));
    }
}
