package X;

/* loaded from: classes6.dex */
public final class EDV extends C40781ul {
    public String A00;
    public boolean A01;

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        if (this.A01 && super.isOk()) {
            return true;
        }
        return false;
    }

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getErrorMessage() {
        return this.A00;
    }
}
