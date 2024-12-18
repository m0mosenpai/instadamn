package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36337G1p implements InterfaceC37154GYr {
    public final Bundle A00;
    public final UserSession A01;

    public C36337G1p(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC37154GYr
    public final boolean CY3() {
        if (C5SJ.A01(this.A01) && AbstractC16960so.A1Q(EnumC33330EoP.A02, null).contains(AbstractC34104F3g.A00(this.A00))) {
            return true;
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
