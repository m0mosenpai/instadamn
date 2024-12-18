package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.PGi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56740PGi implements InterfaceC57995Pnf {
    public final /* synthetic */ ShoppingCreationConfig A00;
    public final /* synthetic */ ClipsEditMetadataController A01;

    public C56740PGi(ShoppingCreationConfig shoppingCreationConfig, ClipsEditMetadataController clipsEditMetadataController) {
        this.A01 = clipsEditMetadataController;
        this.A00 = shoppingCreationConfig;
    }

    @Override // X.InterfaceC57995Pnf
    public final void onClick() {
        String str;
        Long l;
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (this.A00 != null) {
            BrandedContentTag brandedContentTag = (BrandedContentTag) AbstractC001800i.A0J(clipsEditMetadataController.A0P);
            String str2 = null;
            if (brandedContentTag != null) {
                str = brandedContentTag.A01;
            } else {
                str = null;
            }
            UserSession userSession = clipsEditMetadataController.A0s;
            AbstractC59962oe abstractC59962oe = clipsEditMetadataController.A0q;
            String str3 = clipsEditMetadataController.A14;
            TaggingFeedMultiSelectState taggingFeedMultiSelectState = clipsEditMetadataController.A0I;
            C38321qM c38321qM = clipsEditMetadataController.A0D;
            if (c38321qM != null) {
                l = Long.valueOf(c38321qM.A1C());
            } else {
                l = null;
            }
            C38321qM c38321qM2 = clipsEditMetadataController.A0D;
            if (c38321qM2 != null) {
                str2 = c38321qM2.getId();
            }
            AbstractC54313NzX.A00(abstractC59962oe, userSession, null, taggingFeedMultiSelectState, l, str3, str, str2, null, null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
