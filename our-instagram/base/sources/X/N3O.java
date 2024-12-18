package X;

/* loaded from: classes9.dex */
public final class N3O extends C40781ul {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        int i = this.mStatusCode;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }
}
