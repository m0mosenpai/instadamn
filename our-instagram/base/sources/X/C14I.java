package X;

/* renamed from: X.14I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14I {
    public final synchronized C14H A00() {
        C14H c14h;
        if (C14H.A02 && C14H.A00 == null) {
            InterfaceC09390do interfaceC09390do = C14H.A01;
            if (interfaceC09390do != null) {
                C14H.A00 = (C14H) interfaceC09390do.getValue();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c14h = C14H.A00;
        if (c14h == null) {
            throw new IllegalStateException("IgIntentFactory not initialized");
        }
        return c14h;
    }
}
