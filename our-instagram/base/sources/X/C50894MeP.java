package X;

import com.instagram.avatars.graphql.AvatarMentionsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.MeP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50894MeP extends AbstractC52922bZ {
    public final AvatarMentionsRepository A00;
    public final UserSession A01;
    public final C05A A02;

    public /* synthetic */ C50894MeP(UserSession userSession) {
        AvatarMentionsRepository avatarMentionsRepository = new AvatarMentionsRepository(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = avatarMentionsRepository;
        this.A02 = C10E.A00(NRy.A00);
    }
}
