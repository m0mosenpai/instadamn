package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155586yn implements InterfaceC155566yl {
    @Override // X.InterfaceC155566yl
    public final /* synthetic */ String BSd(Activity activity, UserSession userSession) {
        return AbstractC68566VVt.A00(activity, userSession, this);
    }

    @Override // X.InterfaceC155566yl
    public final int CId(Context context, boolean z) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    @Override // X.InterfaceC155566yl
    public final void Dts(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A3X);
        int i = A03.getInt("panavision_profile_tab_tooltip_view_total_times_seen_key", 0);
        InterfaceC19610xo ARD = A03.ARD();
        ARD.E7D("panavision_profile_tab_tooltip_view_total_times_seen_key", i + 1);
        ARD.apply();
    }

    @Override // X.InterfaceC155566yl
    public final long EM4() {
        return 3000L;
    }

    @Override // X.InterfaceC155566yl
    public final boolean Ejp(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (z && C1AT.A01(userSession).A03(C1AV.A3X).getInt("panavision_profile_tab_tooltip_view_total_times_seen_key", 0) < 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC155566yl
    public final EnumC155546yj BeX() {
        return EnumC155546yj.A0S;
    }

    @Override // X.InterfaceC155566yl
    public final /* synthetic */ boolean Ejw() {
        return true;
    }

    @Override // X.InterfaceC155566yl
    public final int BT3(UserSession userSession) {
        return 2131969314;
    }
}
