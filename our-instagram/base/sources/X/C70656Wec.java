package X;

/* renamed from: X.Wec, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70656Wec implements XDI {
    public final /* synthetic */ XDI A00;

    @Override // X.XDI
    public final void DFk(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A00.DFk(str, str2);
    }

    @Override // X.XDI
    public final void onStart() {
    }

    public C70656Wec(XDI xdi) {
        this.A00 = xdi;
    }

    @Override // X.XDI
    public final void onSuccess() {
        this.A00.onSuccess();
    }
}
