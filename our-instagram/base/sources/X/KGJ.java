package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGJ extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C25804BbL A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, userSession);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C48519LdH A002 = AbstractC46742Klz.A00(userSession, C05F.A0Y);
        return new C44546Jmq(A0r, C12L.A00, AbstractC47843LBl.A00(userSession, "EncryptedBackupsFishfoodingViewModel"), AbstractC47843LBl.A01(userSession, "EncryptedBackupsFishfoodingViewModel"), userSession, this.A02, A002, A00);
    }

    public KGJ(FragmentActivity fragmentActivity, UserSession userSession, C25804BbL c25804BbL) {
        AbstractC167017dG.A1Q(userSession, c25804BbL);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = c25804BbL;
    }
}
