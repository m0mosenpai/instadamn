package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hlp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39841Hlp {
    public static Map A00(CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (commentGiphyMediaFixedHeightImages.BDS() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, commentGiphyMediaFixedHeightImages.BDS());
        }
        if (commentGiphyMediaFixedHeightImages.BV4() != null) {
            A1I.put("mp4", commentGiphyMediaFixedHeightImages.BV4());
        }
        if (commentGiphyMediaFixedHeightImages.BV5() != null) {
            A1I.put("mp4_size", commentGiphyMediaFixedHeightImages.BV5());
        }
        if (commentGiphyMediaFixedHeightImages.Bxa() != null) {
            A1I.put("size", commentGiphyMediaFixedHeightImages.Bxa());
        }
        if (commentGiphyMediaFixedHeightImages.getUrl() != null) {
            AbstractC37300Gc1.A13(commentGiphyMediaFixedHeightImages.getUrl(), A1I);
        }
        if (commentGiphyMediaFixedHeightImages.CHQ() != null) {
            A1I.put("webp", commentGiphyMediaFixedHeightImages.CHQ());
        }
        if (commentGiphyMediaFixedHeightImages.CHR() != null) {
            A1I.put("webp_size", commentGiphyMediaFixedHeightImages.CHR());
        }
        if (commentGiphyMediaFixedHeightImages.CHg() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, commentGiphyMediaFixedHeightImages.CHg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
