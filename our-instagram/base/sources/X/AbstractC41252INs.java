package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.INs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41252INs {
    public static CommentGiphyMediaImages parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CommentGiphyMediaFixedHeightImagesImpl commentGiphyMediaFixedHeightImagesImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("fixed_height".equals(AbstractC166997dE.A0s(c16l))) {
                    commentGiphyMediaFixedHeightImagesImpl = AbstractC39842Hlq.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new CommentGiphyMediaImages(commentGiphyMediaFixedHeightImagesImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, CommentGiphyMediaImages commentGiphyMediaImages) {
        anonymousClass182.A0d();
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages = commentGiphyMediaImages.A00;
        if (commentGiphyMediaFixedHeightImages != null) {
            anonymousClass182.A0r("fixed_height");
            CommentGiphyMediaFixedHeightImagesImpl EsN = commentGiphyMediaFixedHeightImages.EsN();
            anonymousClass182.A0d();
            Integer num = EsN.A00;
            if (num != null) {
                anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num.intValue());
            }
            String str = EsN.A05;
            if (str != null) {
                anonymousClass182.A0S("mp4", str);
            }
            Integer num2 = EsN.A01;
            if (num2 != null) {
                anonymousClass182.A0Q("mp4_size", num2.intValue());
            }
            Integer num3 = EsN.A02;
            if (num3 != null) {
                anonymousClass182.A0Q("size", num3.intValue());
            }
            String str2 = EsN.A06;
            if (str2 != null) {
                anonymousClass182.A0S("url", str2);
            }
            String str3 = EsN.A07;
            if (str3 != null) {
                anonymousClass182.A0S("webp", str3);
            }
            Integer num4 = EsN.A03;
            if (num4 != null) {
                anonymousClass182.A0Q("webp_size", num4.intValue());
            }
            Integer num5 = EsN.A04;
            if (num5 != null) {
                anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num5.intValue());
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
