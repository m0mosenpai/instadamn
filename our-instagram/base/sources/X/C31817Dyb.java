package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository;
import java.util.List;

/* renamed from: X.Dyb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31817Dyb extends AbstractC52922bZ {
    public List A00;
    public AnonymousClass195 A01;
    public final C2GT A02;
    public final ChannelXpostingRepository A03;
    public final C05A A04;
    public final C05A A05;
    public final UserSession A06;

    public C31817Dyb(UserSession userSession, ChannelXpostingRepository channelXpostingRepository) {
        C14360o3.A0B(channelXpostingRepository, 2);
        this.A06 = userSession;
        this.A03 = channelXpostingRepository;
        EnumC33334EoT enumC33334EoT = EnumC33334EoT.A02;
        C008002u A1H = AbstractC25225BEi.A1H(enumC33334EoT);
        this.A05 = A1H;
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = c16930sl;
        C008002u A00 = C10E.A00(null);
        this.A04 = A00;
        C15150pV A03 = C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 9), A1H, A00);
        this.A02 = AbstractC31172DnG.A0E(AbstractC208910l.A01(new FKP(enumC33334EoT, null, c16930sl), AbstractC141776au.A00(this), A03, C10I.A01));
    }
}
