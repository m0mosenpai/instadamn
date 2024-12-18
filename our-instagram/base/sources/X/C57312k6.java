package X;

import kotlin.Deprecated;

/* renamed from: X.2k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57312k6 implements C19L, InterfaceC09670ek {
    public final C07T A00;
    public final C12W A01;

    public C57312k6(C07T c07t, C12W c12w) {
        C14360o3.A0B(c12w, 2);
        this.A00 = c07t;
        this.A01 = c12w;
        if (c07t.A07() == C07S.DESTROYED) {
            C57Z.A01(null, this.A01);
        }
    }

    @Deprecated(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final void A00(InterfaceC16620sF interfaceC16620sF) {
        D52 d52 = new D52(this, interfaceC16620sF, (InterfaceC23621Ds) null, 34);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, d52, this);
    }

    @Override // X.C19L
    public final C12W Arv() {
        return this.A01;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C07T c07t = this.A00;
        if (c07t.A07().compareTo(C07S.DESTROYED) <= 0) {
            c07t.A0A(this);
            C57Z.A01(null, this.A01);
        }
    }

    public C57312k6() {
    }
}
