package X;

/* renamed from: X.4oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105084oO extends C1Dr {
    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return AnonymousClass191.A00;
    }

    public AbstractC105084oO(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        if (interfaceC23621Ds != null && interfaceC23621Ds.getContext() != AnonymousClass191.A00) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }
}
