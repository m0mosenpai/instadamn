package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes7.dex */
public final /* synthetic */ class J7H extends C03E implements InterfaceC16600sD {
    public static final J7H A00 = new J7H();

    public J7H() {
        super(4, AbstractC39671Hj0.class, "genPlaceholderHeaderUiState", "genPlaceholderHeaderUiState(Lcom/instagram/common/session/UserSession;Lcom/instagram/model/reels/Reel;Lcom/instagram/model/reels/ReelItem;Lcom/instagram/stories/common/data/StoriesViewerParameters;)Lcom/instagram/stories/header/domain/StoriesHeaderViewModel$UiState;", 1);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UserSession userSession = (UserSession) obj;
        Reel reel = (Reel) obj2;
        C41181vS c41181vS = (C41181vS) obj3;
        C147236jz c147236jz = (C147236jz) obj4;
        AbstractC167027dH.A12(userSession, reel, c41181vS);
        C14360o3.A0B(c147236jz, 3);
        return C41611Ib1.A00.A00(null, null, userSession, reel, c41181vS, c147236jz, new C40980IDb(userSession), C43368JEj.A00, true);
    }
}
