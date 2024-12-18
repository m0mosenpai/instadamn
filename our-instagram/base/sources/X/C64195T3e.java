package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.T3e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64195T3e implements InterfaceC65511Tlg {
    public final /* synthetic */ C67752UxP A00;
    public final /* synthetic */ RunnableC64713TQu A01;

    public C64195T3e(C67752UxP c67752UxP, RunnableC64713TQu runnableC64713TQu) {
        this.A01 = runnableC64713TQu;
        this.A00 = c67752UxP;
    }

    @Override // X.InterfaceC65511Tlg
    public final void D1p() {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putBoolean("success", false);
        this.A01.A00.resolve(A0c);
        this.A00.A07();
    }

    @Override // X.InterfaceC65511Tlg
    public final void D7k() {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putBoolean("success", true);
        this.A01.A00.resolve(A0c);
        this.A00.A07();
    }
}
