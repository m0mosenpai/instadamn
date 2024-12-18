package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I98 {
    public static final void A00(IgImageView igImageView, InterfaceC60442pS interfaceC60442pS, ProductImageContainer productImageContainer, Integer num, boolean z) {
        ImageInfo BGx;
        List AlQ;
        ExtendedImageUrl A02;
        C14360o3.A0B(igImageView, 0);
        if (productImageContainer != null && (BGx = productImageContainer.BGx()) != null && (AlQ = BGx.AlQ()) != null && !AlQ.isEmpty() && (A02 = AbstractC40161tk.A02(BGx)) != null) {
            ImageUrl imageUrl = igImageView.A0C;
            if (imageUrl == null || imageUrl.getUrl() == null || z) {
                igImageView.setUrl(A02, interfaceC60442pS);
                if (num != null) {
                    AbstractC13880nE.A0W(igImageView, (int) (num.intValue() / AbstractC40161tk.A00(BGx)));
                    return;
                }
                return;
            }
            return;
        }
        igImageView.A0B();
    }
}
