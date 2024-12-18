package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.IOException;

/* renamed from: X.4Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93544Hu {
    public static ClipInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ClipInfo clipInfo = new ClipInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("clipFilePath".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    clipInfo.A0F = str;
                } else if ("photoFilePath".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    clipInfo.A0D = str;
                } else if ("camera_id".equals(A0q)) {
                    clipInfo.A03 = c16l.A1D();
                } else if ("pan".equals(A0q)) {
                    clipInfo.A02 = (float) c16l.A0U();
                } else if ("rotation".equals(A0q)) {
                    clipInfo.A0C = Integer.valueOf(c16l.A1D());
                } else if ("colorTransfer".equals(A0q)) {
                    clipInfo.A04 = c16l.A1D();
                } else if ("aspectPostCrop".equals(A0q)) {
                    clipInfo.A00 = (float) c16l.A0U();
                } else if ("startMS".equals(A0q)) {
                    clipInfo.A07 = c16l.A1D();
                } else if ("endMS".equals(A0q)) {
                    clipInfo.A05 = c16l.A1D();
                } else if ("isTrimmed".equals(A0q)) {
                    clipInfo.A0H = c16l.A0d();
                } else if ("trimScroll".equals(A0q)) {
                    clipInfo.A08 = c16l.A1D();
                } else if ("videoWidth".equals(A0q)) {
                    clipInfo.A09 = c16l.A1D();
                } else if ("videoHeight".equals(A0q)) {
                    clipInfo.A06 = c16l.A1D();
                } else if ("software".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    clipInfo.A0E = str;
                } else if ("h_flip".equals(A0q)) {
                    clipInfo.A0L = c16l.A0d();
                } else if ("is_boomerang".equals(A0q)) {
                    clipInfo.A0J = c16l.A0d();
                } else if ("is_clips_horizontal_remix".equals(A0q)) {
                    clipInfo.A0K = c16l.A0d();
                } else if ("is_square_crop".equals(A0q)) {
                    clipInfo.A0N = c16l.A0d();
                } else if ("original_duration_ms".equals(A0q)) {
                    clipInfo.A0A = c16l.A0y();
                } else if ("is_pending_photo_to_video".equals(A0q)) {
                    clipInfo.A0M = c16l.A0d();
                } else if ("media_upload_metadata".equals(A0q)) {
                    MediaUploadMetadata parseFromJson = AbstractC93554Hv.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    clipInfo.A0B = parseFromJson;
                } else if ("is_virtual".equals(A0q)) {
                    clipInfo.A0O = c16l.A0d();
                } else if ("is_audio_muted".equals(A0q)) {
                    clipInfo.A0I = c16l.A0d();
                } else if ("frameRate".equals(A0q)) {
                    clipInfo.A01 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return clipInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ClipInfo clipInfo) {
        anonymousClass182.A0d();
        String str = clipInfo.A0F;
        if (str != null) {
            anonymousClass182.A0S("clipFilePath", str);
        }
        String str2 = clipInfo.A0D;
        if (str2 != null) {
            anonymousClass182.A0S("photoFilePath", str2);
        }
        anonymousClass182.A0Q("camera_id", clipInfo.A03);
        anonymousClass182.A0P("pan", clipInfo.A02);
        Integer num = clipInfo.A0C;
        if (num != null) {
            anonymousClass182.A0Q("rotation", num.intValue());
        }
        anonymousClass182.A0Q("colorTransfer", clipInfo.A04);
        anonymousClass182.A0P("aspectPostCrop", clipInfo.A00);
        anonymousClass182.A0Q("startMS", clipInfo.A07);
        anonymousClass182.A0Q("endMS", clipInfo.A05);
        anonymousClass182.A0T("isTrimmed", clipInfo.A0H);
        anonymousClass182.A0Q("trimScroll", clipInfo.A08);
        anonymousClass182.A0Q("videoWidth", clipInfo.A09);
        anonymousClass182.A0Q("videoHeight", clipInfo.A06);
        String str3 = clipInfo.A0E;
        if (str3 != null) {
            anonymousClass182.A0S("software", str3);
        }
        anonymousClass182.A0T("h_flip", clipInfo.A0L);
        anonymousClass182.A0T("is_boomerang", clipInfo.A0J);
        anonymousClass182.A0T("is_clips_horizontal_remix", clipInfo.A0K);
        anonymousClass182.A0T("is_square_crop", clipInfo.A0N);
        anonymousClass182.A0R("original_duration_ms", clipInfo.A0A);
        anonymousClass182.A0T("is_pending_photo_to_video", clipInfo.A0M);
        if (clipInfo.A0B != null) {
            anonymousClass182.A0r("media_upload_metadata");
            AbstractC93554Hv.A00(anonymousClass182, clipInfo.A0B);
        }
        anonymousClass182.A0T("is_virtual", clipInfo.A0O);
        anonymousClass182.A0T("is_audio_muted", clipInfo.A0I);
        anonymousClass182.A0P("frameRate", clipInfo.A01);
        anonymousClass182.A0a();
    }
}
