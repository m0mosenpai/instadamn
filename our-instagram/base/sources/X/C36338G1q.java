package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36338G1q implements InterfaceC37154GYr {
    public final Bundle A00;
    public final UserSession A01;

    public C36338G1q(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC37154GYr
    public final boolean CY3() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
        return !AbstractC167017dG.A1b(A00, A00.A2Y, C23031Ai.A8c, 392);
    }

    @Override // X.InterfaceC37154GYr
    public final void Cgf(FragmentActivity fragmentActivity) {
        AbstractC31180DnO.A1T(fragmentActivity);
        AbstractC34888FZa.A00(this.A00, fragmentActivity, new C32322ELq(), this.A01, AbstractC111324zv.A00(4080));
    }
}
