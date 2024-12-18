package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jlp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44483Jlp extends AbstractC52922bZ {
    public final AvatarStickerGraphQLRepository A00;
    public final UserSession A01;
    public final C05A A02;

    public /* synthetic */ C44483Jlp(UserSession userSession) {
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = avatarStickerGraphQLRepository;
        this.A02 = C10E.A00(KZw.A00);
    }
}
