package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.6oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149776oU extends C4A7 {
    public final AvatarStickerGraphQLRepository A00;
    public final AvatarStore A01;
    public final UserSession A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C149776oU(UserSession userSession) {
        super("StoriesTemplateParticipationRepository", C4A8.A01(1342004349, 3));
        AvatarStore A00 = C20Y.A00(userSession);
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 2);
        this.A02 = userSession;
        this.A01 = A00;
        this.A00 = avatarStickerGraphQLRepository;
    }
}
