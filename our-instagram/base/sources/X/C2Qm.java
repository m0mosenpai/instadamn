package X;

/* renamed from: X.2Qm, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Qm implements InterfaceC23621Ds {
    public static final C2Qm A00 = new Object();

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }
}
