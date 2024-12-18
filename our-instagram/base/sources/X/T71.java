package X;

/* loaded from: classes10.dex */
public final class T71 implements InterfaceC65424Tjv {
    public final /* synthetic */ S58 A00;
    public final /* synthetic */ String A01;

    public T71(S58 s58, String str) {
        this.A00 = s58;
        this.A01 = str;
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        C14360o3.A0B(exc, 0);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("API_ERROR: ");
        AbstractC58318PtA.A1U(A1C, exc);
        A1C.append(':');
        String A0x = AbstractC166997dE.A0x(exc.getMessage(), A1C);
        String str = this.A01;
        C14360o3.A0A(str);
        C14360o3.A0B(A0x, 0);
        C41451vu.A01.E4s(new C36048Fvk(A0x, C05F.A0C, str));
    }
}
