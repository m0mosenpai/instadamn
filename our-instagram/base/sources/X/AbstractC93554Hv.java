package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.IOException;

/* renamed from: X.4Hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93554Hv {
    public static MediaUploadMetadata parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("app_attribution_namespace".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A03 = str;
                } else if ("app_attribution_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A02 = str;
                } else if ("upload_media_source".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A09 = str;
                } else if ("album_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A01 = str;
                } else if ("metagallery_media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A08 = str;
                } else if ("wearables_media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A0A = str;
                } else if ("attributed_device_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A05 = str;
                } else if ("app_attribution_raw_namespace".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A04 = str;
                } else if ("is_meta_gallery".equals(A0q)) {
                    mediaUploadMetadata.A0B = c16l.A0d();
                } else if ("external_share_app_namespace".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A06 = str;
                } else if (MSV.A00(211).equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    mediaUploadMetadata.A07 = str;
                } else if ("immersive_media_metadata".equals(A0q)) {
                    mediaUploadMetadata.A00 = AbstractC225959yE.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return mediaUploadMetadata;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MediaUploadMetadata mediaUploadMetadata) {
        anonymousClass182.A0d();
        String str = mediaUploadMetadata.A03;
        if (str != null) {
            anonymousClass182.A0S("app_attribution_namespace", str);
        }
        String str2 = mediaUploadMetadata.A02;
        if (str2 != null) {
            anonymousClass182.A0S("app_attribution_id", str2);
        }
        String str3 = mediaUploadMetadata.A09;
        if (str3 != null) {
            anonymousClass182.A0S("upload_media_source", str3);
        }
        String str4 = mediaUploadMetadata.A01;
        if (str4 != null) {
            anonymousClass182.A0S("album_name", str4);
        }
        String str5 = mediaUploadMetadata.A08;
        if (str5 != null) {
            anonymousClass182.A0S("metagallery_media_id", str5);
        }
        String str6 = mediaUploadMetadata.A0A;
        if (str6 != null) {
            anonymousClass182.A0S("wearables_media_id", str6);
        }
        String str7 = mediaUploadMetadata.A05;
        if (str7 != null) {
            anonymousClass182.A0S("attributed_device_name", str7);
        }
        String str8 = mediaUploadMetadata.A04;
        if (str8 != null) {
            anonymousClass182.A0S("app_attribution_raw_namespace", str8);
        }
        anonymousClass182.A0T("is_meta_gallery", mediaUploadMetadata.A0B);
        String str9 = mediaUploadMetadata.A06;
        if (str9 != null) {
            anonymousClass182.A0S("external_share_app_namespace", str9);
        }
        String str10 = mediaUploadMetadata.A07;
        if (str10 != null) {
            anonymousClass182.A0S(MSV.A00(211), str10);
        }
        if (mediaUploadMetadata.A00 != null) {
            anonymousClass182.A0r("immersive_media_metadata");
            ImmersiveMediaFields immersiveMediaFields = mediaUploadMetadata.A00;
            anonymousClass182.A0d();
            String str11 = immersiveMediaFields.A00;
            if (str11 != null) {
                anonymousClass182.A0S("glbUrl", str11);
            }
            anonymousClass182.A0T(AbstractC111324zv.A00(2588), immersiveMediaFields.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
