package X;

/* renamed from: X.14K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14K {
    public final C14J A00() {
        C14J c14j;
        if (C14J.A03) {
            synchronized (this) {
                c14j = C14J.A01;
                if (c14j == null) {
                    InterfaceC09390do interfaceC09390do = C14J.A02;
                    if (interfaceC09390do != null) {
                        c14j = (C14J) interfaceC09390do.getValue();
                    } else {
                        c14j = null;
                    }
                    C14J.A01 = c14j;
                }
            }
            return c14j;
        }
        return C14J.A01;
    }
}
