package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.audience.AudienceUseCase;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import java.io.Closeable;

/* renamed from: X.Bu9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26906Bu9 extends AbstractC61152qd {
    public final AudienceUseCase A00;
    public final C26891Bts A01;
    public final C26893Btu A02;

    public /* synthetic */ C26906Bu9(UserSession userSession, AudienceRepository audienceRepository, CreatorAiSettingsRepository creatorAiSettingsRepository, String str) {
        C008002u A1H = AbstractC25225BEi.A1H(new C38052Gof(7, 2, false, false));
        C008002u A00 = C10E.A00(AbstractC06930Yk.A0E());
        C008002u A002 = C10E.A00(C16910sj.A00);
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC53314Nhq.NOBODY);
        AudienceUseCase audienceUseCase = new AudienceUseCase(audienceRepository, creatorAiSettingsRepository, str, A1H2, A1H, A00, A002);
        C26893Btu c26893Btu = new C26893Btu(userSession, audienceRepository, str, A00, A002);
        C26891Bts c26891Bts = new C26891Bts(audienceRepository, A1H, A1H2);
        this.A00 = audienceUseCase;
        this.A02 = c26893Btu;
        this.A01 = c26891Bts;
        audienceUseCase.A04(this, true);
        c26893Btu.A04(this, true);
        c26891Bts.A04(this, true);
        addCloseable((Closeable) audienceRepository);
    }

    public final void A00(EnumC53314Nhq enumC53314Nhq) {
        C14360o3.A0B(enumC53314Nhq, 0);
        AudienceUseCase audienceUseCase = this.A00;
        audienceUseCase.A06.Egh(enumC53314Nhq);
        audienceUseCase.A09.Egh(enumC53314Nhq);
        if (audienceUseCase.A00) {
            audienceUseCase.A05.Egh(C6R.A03);
        }
        AbstractC166987dD.A1Z(new D53(audienceUseCase, null, 16), audienceUseCase.A03());
    }
}
