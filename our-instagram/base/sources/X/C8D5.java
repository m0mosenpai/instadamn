package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8D5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8D5 extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C8D6(this.A00, this.A01);
    }

    public C8D5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
