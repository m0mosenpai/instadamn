package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G3h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36381G3h implements InterfaceC58045PoW {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C33090Eip A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC58045PoW
    public final void DtR() {
        UserSession userSession = this.A01;
        C33090Eip c33090Eip = this.A02;
        String str = c33090Eip.A04;
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C35142Fej.A00(userSession, "customer_details_tos_accept", str, c16920sk);
        C1GJ.A07(C12L.A00.CPG(994363717, 3), new PXP(this.A00, userSession, this, c33090Eip, this.A03, null));
    }

    public C36381G3h(FragmentActivity fragmentActivity, UserSession userSession, C33090Eip c33090Eip, String str) {
        this.A01 = userSession;
        this.A02 = c33090Eip;
        this.A00 = fragmentActivity;
        this.A03 = str;
    }

    @Override // X.InterfaceC58045PoW
    public final void DtS() {
        UserSession userSession = this.A01;
        String str = this.A02.A04;
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C35142Fej.A00(userSession, "customer_details_tos_decline", str, c16920sk);
    }
}
