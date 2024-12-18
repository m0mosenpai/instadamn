package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155616yq implements InterfaceC155566yl {
    @Override // X.InterfaceC155566yl
    public final /* synthetic */ String BSd(Activity activity, UserSession userSession) {
        return AbstractC68566VVt.A00(activity, userSession, this);
    }

    @Override // X.InterfaceC155566yl
    public final int BT3(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Integer A00 = AbstractC152666tt.A00(userSession);
        if (A00 != null) {
            return A00.intValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC155566yl
    public final int CId(Context context, boolean z) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    @Override // X.InterfaceC155566yl
    public final void Dts(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        AbstractC152666tt.A01(userSession);
    }

    @Override // X.InterfaceC155566yl
    public final long EM4() {
        return 1000L;
    }

    @Override // X.InterfaceC155566yl
    public final boolean Ejp(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (AbstractC152666tt.A00(userSession) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC155566yl
    public final boolean Ejw() {
        return false;
    }

    @Override // X.InterfaceC155566yl
    public final EnumC155546yj BeX() {
        return EnumC155546yj.A08;
    }
}
