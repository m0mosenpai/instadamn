package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;

/* renamed from: X.Eaw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32730Eaw extends ChannelDiscoveryViewModel {
    public final C05A A00;
    public final UserSession A01;

    public AbstractC32730Eaw(UserSession userSession, EnumC33329EoO enumC33329EoO) {
        super(userSession, enumC33329EoO, true);
        this.A01 = userSession;
        this.A00 = AbstractC25225BEi.A1H(EnumC33424Epv.A06);
    }

    public void A0G(EnumC33424Epv enumC33424Epv) {
        C14360o3.A0B(enumC33424Epv, 0);
        this.A00.Egh(enumC33424Epv);
        A0E();
    }
}
