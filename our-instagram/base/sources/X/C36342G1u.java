package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36342G1u implements InterfaceC37154GYr {
    public final Bundle A00;
    public final UserSession A01;
    public final boolean A02;

    public C36342G1u(Bundle bundle, UserSession userSession, boolean z) {
        C14360o3.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
        this.A02 = z;
    }

    @Override // X.InterfaceC37154GYr
    public final boolean CY3() {
        if (this.A02) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36330123334533829L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37154GYr
    public final void Cgf(FragmentActivity fragmentActivity) {
        AbstractC31180DnO.A1T(fragmentActivity);
        UserSession userSession = this.A01;
        AbstractC34888FZa.A00(this.A00, fragmentActivity, new EL4(), userSession, "channel_creation_configure");
    }
}
