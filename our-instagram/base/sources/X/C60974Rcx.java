package X;

/* renamed from: X.Rcx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60974Rcx extends WlZ {
    public final int A00;
    public final Object A01;

    public C60974Rcx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71983XDs
    public final void Dat() {
        if (this.A00 == 0) {
            ((InterfaceC16820sZ) this.A01).invoke();
        }
    }

    @Override // X.InterfaceC71983XDs
    public final void onCancel() {
        if (this.A00 != 0) {
            ((C63002SaQ) this.A01).A00.finish();
        }
    }

    @Override // X.WlZ, X.InterfaceC71983XDs
    public final void onDismiss() {
        if (1 - this.A00 == 0) {
            ((C63002SaQ) this.A01).A00.finish();
        }
    }
}
