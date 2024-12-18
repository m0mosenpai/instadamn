package X;

/* renamed from: X.3eR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77993eR extends C76223bS {
    public boolean A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0ps, java.lang.Object] */
    public static final void A00(C2XI c2xi, C2YN c2yn, InterfaceC16610sE interfaceC16610sE) {
        AnonymousClass418 anonymousClass418;
        if (c2xi != null) {
            anonymousClass418 = new Object();
        } else {
            anonymousClass418 = null;
        }
        c2yn.A02(new C78183ek(anonymousClass418, anonymousClass418, c2xi, interfaceC16610sE, new Object()), new Object[]{c2xi});
    }

    public final long A01() {
        C2XE c2xe = this.A05;
        C2XK c2xk = c2xe.A02.A00;
        if (c2xk != null) {
            return c2xk.A00(c2xe.A08(), 0);
        }
        throw new IllegalStateException("Attempt to use a released RenderStateContext");
    }
}
