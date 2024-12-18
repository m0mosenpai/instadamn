package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.NCv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52306NCv extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC142806cg A02;

    public C52306NCv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = enumC142806cg;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A01;
        EnumC142806cg enumC142806cg = this.A02;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        AbstractC147746kz A002 = AbstractC147746kz.A0A.A00(this.A00, userSession, enumC142806cg);
        IgLiveBroadcastInfoManager A01 = A00.A01();
        IgLiveQuestionsRepository igLiveQuestionsRepository = (IgLiveQuestionsRepository) A00.A0D.getValue();
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = (IgLiveQuestionSubmissionsRepository) A00.A0C.getValue();
        return new C147896lL(userSession, enumC142806cg, (InterfaceC147786l3) A002.A06.getValue(), (C147886lK) A00.A0B.getValue(), igLiveQuestionSubmissionsRepository, igLiveQuestionsRepository, A01);
    }
}
