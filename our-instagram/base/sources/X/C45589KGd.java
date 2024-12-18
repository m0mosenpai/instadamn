package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45589KGd extends AbstractC61132qb {
    public final AvatarStickerGraphQLRepository A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;

    public /* synthetic */ C45589KGd(UserSession userSession, String str, String str2) {
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = avatarStickerGraphQLRepository;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44533Jmd(this.A00, this.A01, this.A03, this.A02);
    }
}
