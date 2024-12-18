package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155576ym implements InterfaceC155566yl {
    public int A00;

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
    public final long EM4() {
        return 0L;
    }

    @Override // X.InterfaceC155566yl
    public final boolean Ejp(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (z && C08730cb.A00(userSession).A00().A1M() && !AbstractC19730y1.A00(AbstractC12960li.A00).A00.getBoolean("has_seen_organic_insights_nux", false)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC155566yl
    public final EnumC155546yj BeX() {
        return EnumC155546yj.A0R;
    }

    @Override // X.InterfaceC155566yl
    public final void Dts(UserSession userSession) {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E77("has_seen_organic_insights_nux", true);
        ARD.apply();
    }

    @Override // X.InterfaceC155566yl
    public final /* synthetic */ boolean Ejw() {
        return true;
    }

    @Override // X.InterfaceC155566yl
    public final int BT3(UserSession userSession) {
        return this.A00;
    }
}
