package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import java.util.List;

/* renamed from: X.GtO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38329GtO extends AbstractC52922bZ {
    public final UserSession A00;
    public final InterfaceC24731Iq A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;
    public final C0UO A04;

    public C38329GtO(UserSession userSession, TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        TaggingFeedMultiSelectState taggingFeedMultiSelectState2 = taggingFeedMultiSelectState;
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        if (taggingFeedMultiSelectState == null) {
            taggingFeedMultiSelectState2 = new TaggingFeedMultiSelectState(null, C16930sl.A00, AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E());
        }
        C008002u A1H = AbstractC25225BEi.A1H(taggingFeedMultiSelectState2);
        this.A03 = A1H;
        this.A04 = A1H;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A01 = c24721Ip;
        this.A02 = AbstractC07080Za.A03(c24721Ip);
    }

    public final ProductCollection A01() {
        TaggingFeedMultiSelectState taggingFeedMultiSelectState = (TaggingFeedMultiSelectState) this.A04.getValue();
        C14360o3.A0B(taggingFeedMultiSelectState, 0);
        return (ProductCollection) AbstractC001800i.A0A(taggingFeedMultiSelectState.A02.values());
    }

    public final void A02(C38645Gym c38645Gym, Product product, List list) {
        this.A03.Egh(new C30177DRh(21, this, c38645Gym, product, list).invoke(this.A04.getValue()));
    }

    public static TaggingFeedMultiSelectState A00(InterfaceC09390do interfaceC09390do) {
        return (TaggingFeedMultiSelectState) ((C38329GtO) interfaceC09390do.getValue()).A04.getValue();
    }
}
