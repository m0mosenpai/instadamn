package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCO extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public NCO(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new Gt6(MSX.A06(this.A00), this.A01);
    }
}
