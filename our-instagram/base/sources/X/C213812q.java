package X;

/* renamed from: X.12q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C213812q extends C12T {
    public static final C213812q A00 = new C12T();

    @Override // X.C12T
    public final boolean A02(C12W c12w) {
        return false;
    }

    @Override // X.C12T
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        C3IW c3iw = (C3IW) c12w.get(C3IW.A01);
        if (c3iw != null) {
            c3iw.A00 = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // X.C12T
    public final C12T A03(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
