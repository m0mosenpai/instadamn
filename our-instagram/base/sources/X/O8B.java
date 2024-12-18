package X;

/* loaded from: classes9.dex */
public final class O8B {
    public final InterfaceC40821up A00;
    public final String A01;

    public O8B(AbstractC115105If abstractC115105If) {
        InterfaceC40821up interfaceC40821up;
        String errorMessage;
        C115115Ig c115115Ig;
        if ((abstractC115105If instanceof C115115Ig) && (c115115Ig = (C115115Ig) abstractC115105If) != null) {
            interfaceC40821up = (InterfaceC40821up) c115115Ig.A00;
        } else {
            interfaceC40821up = null;
        }
        this.A00 = interfaceC40821up;
        this.A01 = (interfaceC40821up == null || (errorMessage = interfaceC40821up.getErrorMessage()) == null || interfaceC40821up.getStatusCode() != 400 || AbstractC25228BEl.A1A(errorMessage).length() <= 0) ? null : errorMessage;
        if (interfaceC40821up != null) {
            interfaceC40821up.getErrorBody();
        }
    }
}
