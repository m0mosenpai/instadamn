package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OOe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54869OOe {
    public static C52435NIf parseFromJson(C16L c16l) {
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            Integer num = null;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            String str2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            C26086BgF c26086BgF = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            C18160v1 c18160v1 = null;
            C206169Az c206169Az = null;
            String str3 = null;
            HashMap hashMap = null;
            Integer num5 = null;
            MediaUploadMetadata mediaUploadMetadata = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("file_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("duration_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("rotation".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("fill_screen".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_replaced".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("auto_created_reels_segment_info".equals(A0s)) {
                    c26086BgF = MWV.parseFromJson(c16l);
                } else if ("is_from_draft".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("has_template_reusable_asset".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(3228).equals(A0s)) {
                    c18160v1 = AbstractC14610oZ.parseFromJson(c16l);
                } else if ("layout_transform".equals(A0s)) {
                    c206169Az = AbstractC202168ww.parseFromJson(c16l);
                } else if ("original_medium_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("exif_data".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                str = null;
                            } else {
                                str = c16l.A1P();
                                if (str != null) {
                                }
                            }
                            hashMap.put(A1P, str);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("exif_orientation".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("media_upload_metadata".equals(A0s)) {
                    mediaUploadMetadata = AbstractC93554Hv.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("file_path", c16l, "IgPhotoSegment");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.WIDTH, c16l, "IgPhotoSegment");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactMediaPickerNativeModule.HEIGHT, c16l, "IgPhotoSegment");
                } else if (num4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("rotation", c16l, "IgPhotoSegment");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("fill_screen", c16l, "IgPhotoSegment");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_replaced", c16l, "IgPhotoSegment");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_from_draft", c16l, "IgPhotoSegment");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("has_template_reusable_asset", c16l, "IgPhotoSegment");
                } else if (num5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("exif_orientation", c16l, "IgPhotoSegment");
                } else {
                    return new C52435NIf(c206169Az, c26086BgF, mediaUploadMetadata, c18160v1, str2, str3, hashMap, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("duration_ms", c16l, "IgPhotoSegment");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C52435NIf c52435NIf) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("file_path", c52435NIf.A0E);
        anonymousClass182.A0Q("duration_ms", c52435NIf.A00);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c52435NIf.A0C);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c52435NIf.A0A);
        anonymousClass182.A0Q("rotation", c52435NIf.A0B);
        anonymousClass182.A0T("fill_screen", c52435NIf.A05);
        anonymousClass182.A0T("is_replaced", c52435NIf.A08);
        C26086BgF c26086BgF = c52435NIf.A02;
        if (c26086BgF != null) {
            anonymousClass182.A0r("auto_created_reels_segment_info");
            MWV.A00(c26086BgF, anonymousClass182);
        }
        anonymousClass182.A0T("is_from_draft", c52435NIf.A07);
        anonymousClass182.A0T("has_template_reusable_asset", c52435NIf.A06);
        C18160v1 c18160v1 = c52435NIf.A03;
        if (c18160v1 != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(3228));
            AbstractC14610oZ.A00(anonymousClass182, c18160v1);
        }
        if (c52435NIf.A01 != null) {
            anonymousClass182.A0r("layout_transform");
            AbstractC202168ww.A00(c52435NIf.A01, anonymousClass182);
        }
        String str = c52435NIf.A04;
        if (str != null) {
            anonymousClass182.A0S("original_medium_id", str);
        }
        Map map = c52435NIf.A0F;
        if (map != null) {
            anonymousClass182.A0r("exif_data");
            anonymousClass182.A0d();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A15);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("exif_orientation", c52435NIf.A09);
        MediaUploadMetadata mediaUploadMetadata = c52435NIf.A0D;
        if (mediaUploadMetadata != null) {
            anonymousClass182.A0r("media_upload_metadata");
            AbstractC93554Hv.A00(anonymousClass182, mediaUploadMetadata);
        }
        anonymousClass182.A0a();
    }
}
