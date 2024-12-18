package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.JeO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44099JeO {
    public boolean A00;
    public final UserSession A01;
    public final C44100JeP A02;
    public final C44101JeQ A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C44099JeO(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A08 = MHK.A00(this, enumC09460dv, 28);
        this.A04 = MHK.A00(this, enumC09460dv, 23);
        this.A05 = MHK.A00(this, enumC09460dv, 24);
        this.A06 = MHK.A00(this, enumC09460dv, 25);
        this.A07 = MHK.A00(this, enumC09460dv, 27);
        this.A02 = new C44100JeP(userSession);
        this.A03 = new C44101JeQ(userSession);
    }

    public final void A00(Fragment fragment, UserSession userSession, MOZ moz, Integer num) {
        C14360o3.A0B(userSession, 0);
        C6CF A00 = C6CE.A00(userSession);
        boolean A002 = A00.A00();
        C0K8.A0D("EncryptedBackupsInboxLauncher", AnonymousClass001.A1D("maybeShowNux isEncryptedBackupsEnabled ", A002));
        if (A002) {
            if (C6CB.A02(A00.A00, 36315928477175617L)) {
                AbstractC43592JPx.A0b(this.A06).A03();
                C11T.A04(new M0S(this), 120000L);
            }
            C3LC A003 = C3LB.A00(userSession);
            if (A003.A00.getBoolean("eb_disable_nux", false)) {
                C0K8.A0D("EncryptedBackupsInboxLauncher", "maybeShowNux nux disabled");
                ((KPS) this.A06.getValue()).A0C("NUX_DISABLED", C05F.A0C);
            } else {
                C48519LdH A004 = AbstractC46742Klz.A00(userSession, AbstractC47156Ksr.A00);
                A004.A07(new C44253Jgx(0, this, A003, fragment, moz, num, userSession, A004, A00));
            }
        }
    }
}
