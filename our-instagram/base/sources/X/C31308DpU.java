package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DpU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31308DpU extends AbstractC46524KiP implements GZA {
    public C34492FIe A00;
    public C2EC A01;
    public final UserSession A02;
    public final C2056398n A03;
    public final FragmentActivity A04;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        C34492FIe c34492FIe = new C34492FIe(context, this);
        this.A00 = c34492FIe;
        return c34492FIe.A00;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        String BAY;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null && c2ec.CVQ() && C4GR.A01(c2ec.C7g()) && c2ec.BI1() != 8 && c2ec.CVT() && (BAY = c2ec.BAY()) != null && BAY.length() != 0) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36315859748130448L)) {
                InterfaceC19630xq interfaceC19630xq = this.A03.A00;
                if (!interfaceC19630xq.getBoolean("discoverable_chats_has_seen_link_sharing_banner", false) && interfaceC19630xq.getInt(AbstractC111324zv.A00(4327), 0) >= 2 && interfaceC19630xq.getBoolean(AbstractC111324zv.A00(4326), false)) {
                    this.A01 = c2ec;
                    interfaceC37159GYw.Dpu(this);
                    return;
                }
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.GZA
    public final /* synthetic */ void onBannerDismissed() {
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        InterfaceC19610xo ARD = this.A03.A00.ARD();
        ARD.E77("discoverable_chats_has_seen_link_sharing_banner", true);
        ARD.apply();
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String BAY;
        C2EC c2ec = this.A01;
        if (c2ec != null && (BAY = c2ec.BAY()) != null) {
            FragmentActivity fragmentActivity = this.A04;
            AbstractC61765RtK.A00(fragmentActivity, BAY);
            C9GR.A07(fragmentActivity, 2131963335);
            C34492FIe c34492FIe = this.A00;
            if (c34492FIe != null) {
                c34492FIe.A00.setVisibility(8);
            }
        }
    }

    public C31308DpU(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A04 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = AbstractC2056298m.A00(userSession);
    }
}
