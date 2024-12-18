package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;

/* loaded from: classes6.dex */
public final class EWX extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC33329EoO A01;
    public final boolean A02;
    public final boolean A03;

    public EWX(UserSession userSession, EnumC33329EoO enumC33329EoO, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = enumC33329EoO;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        ChannelDiscoveryViewModel channelDirectoryInboxViewModel;
        EnumC33329EoO enumC33329EoO;
        boolean z = this.A02;
        if (z && this.A03 && (enumC33329EoO = this.A01) == EnumC33329EoO.A02) {
            channelDirectoryInboxViewModel = new C32729Eau(this.A00, enumC33329EoO);
        } else {
            channelDirectoryInboxViewModel = new ChannelDirectoryInboxViewModel(this.A00, this.A01);
        }
        channelDirectoryInboxViewModel.A02 = this.A03;
        channelDirectoryInboxViewModel.A01 = z;
        return channelDirectoryInboxViewModel;
    }
}
