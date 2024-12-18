package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import java.io.IOException;

/* renamed from: X.9yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226239yg {
    public static SharePlatformStickerClientModel parseFromJson(C16L c16l) {
        EnumC222859sQ enumC222859sQ;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            SharePlatformStickerClientModel sharePlatformStickerClientModel = new SharePlatformStickerClientModel();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_upload_metadata".equals(A0s)) {
                    MediaUploadMetadata parseFromJson = AbstractC93554Hv.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    sharePlatformStickerClientModel.A07 = parseFromJson;
                } else if ("attribution_url".equals(A0s)) {
                    sharePlatformStickerClientModel.A09 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(2522).equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    sharePlatformStickerClientModel.A0A = A0m;
                } else if ("image_width".equals(A0s)) {
                    sharePlatformStickerClientModel.A03 = c16l.A1D();
                } else if ("image_height".equals(A0s)) {
                    sharePlatformStickerClientModel.A02 = c16l.A1D();
                } else if ("rotation".equals(A0s)) {
                    sharePlatformStickerClientModel.A04 = c16l.A1D();
                } else if ("sticker_width".equals(A0s)) {
                    sharePlatformStickerClientModel.A06 = c16l.A1D();
                } else if ("sticker_height".equals(A0s)) {
                    sharePlatformStickerClientModel.A05 = c16l.A1D();
                } else if ("should_keep_on_screen".equals(A0s)) {
                    sharePlatformStickerClientModel.A0B = c16l.A0d();
                } else if ("share_platform_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G || (A1P = c16l.A1P()) == null || (enumC222859sQ = (EnumC222859sQ) EnumC222859sQ.A01.get(A1P)) == null) {
                        enumC222859sQ = EnumC222859sQ.A06;
                    }
                    sharePlatformStickerClientModel.A08 = enumC222859sQ;
                } else if ("start_time_ms".equals(A0s)) {
                    sharePlatformStickerClientModel.A01 = (float) c16l.A0U();
                } else if ("end_time_ms".equals(A0s)) {
                    sharePlatformStickerClientModel.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return sharePlatformStickerClientModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
