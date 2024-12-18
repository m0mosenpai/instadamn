package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.HHa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39050HHa extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC72365Xc1 A02;
    public final String A03;
    public final boolean A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new SettingsScreenViewModel(this.A00, userSession, this.A02, this.A03, this.A04);
    }

    public C39050HHa(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC72365Xc1 enumC72365Xc1, String str, boolean z) {
        AbstractC167017dG.A1Q(userSession, enumC72365Xc1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = enumC72365Xc1;
        this.A04 = z;
        this.A03 = str;
    }
}
