package X;

import kotlin.Deprecated;

/* renamed from: X.7mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172627mX {
    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final Object A00(C07T c07t, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        C07S c07s = C07S.STARTED;
        C12T c12t = C12P.A00;
        return AbstractC23641Du.A00(interfaceC23621Ds, AnonymousClass131.A00.A06(), new C9DM(c07t, c07s, interfaceC16620sF, null, 2));
    }
}
