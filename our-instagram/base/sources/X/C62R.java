package X;

/* renamed from: X.62R, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C62R {
    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        AnonymousClass577 anonymousClass577 = (AnonymousClass577) interfaceC23621Ds.getContext().get(AnonymousClass577.A00);
        if (anonymousClass577 != null) {
            return anonymousClass577.FE9(interfaceC23621Ds, new DRU(interfaceC16660sJ, 20));
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object A01(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        AnonymousClass577 anonymousClass577 = (AnonymousClass577) interfaceC23621Ds.getContext().get(AnonymousClass577.A00);
        if (anonymousClass577 != null) {
            return anonymousClass577.FE9(interfaceC23621Ds, interfaceC16660sJ);
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
