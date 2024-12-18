package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final /* synthetic */ class J7I extends C03E implements InterfaceC16600sD {
    public static final J7I A00 = new J7I();

    public J7I() {
        super(4, AbstractC39673Hj2.class, "genLikePlaceholderState", "genLikePlaceholderState(Lcom/instagram/common/session/UserSession;Lcom/instagram/model/reels/Reel;Lcom/instagram/model/reels/ReelItem;Lcom/instagram/stories/common/data/StoriesViewerParameters;)Lcom/instagram/stories/like/domain/StoryViewerLikeViewModel$UiState;", 1);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UserSession userSession = (UserSession) obj;
        C41181vS c41181vS = (C41181vS) obj3;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(obj2, c41181vS, obj4);
        return AbstractC40894I9s.A00(userSession, c41181vS, false);
    }
}
