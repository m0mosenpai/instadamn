package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;

/* renamed from: X.CmP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28731CmP implements InterfaceC30903DiG {
    public final C5Y6 A00;

    public C28731CmP(C5Y6 c5y6) {
        this.A00 = c5y6;
    }

    @Override // X.InterfaceC30903DiG
    public final /* bridge */ /* synthetic */ Object ACL(C6MC c6mc, Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        float A09 = AbstractC166987dD.A09(obj);
        float A092 = AbstractC166987dD.A09(obj2);
        return SnapFlingBehaviorKt.A00(this.A00, BG4.A00(0.0f, A092), c6mc, interfaceC23621Ds, interfaceC16660sJ, Math.abs(A09) * Math.signum(A092), A09);
    }
}
