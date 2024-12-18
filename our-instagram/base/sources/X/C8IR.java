package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8IR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8IR {
    public static Medium parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Medium medium = new Medium();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    medium.A05 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    medium.A08 = c16l.A1D();
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    ArrayList arrayList = null;
                    String str13 = null;
                    String str14 = null;
                    String str15 = null;
                    String str16 = null;
                    String str17 = null;
                    if ("path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        C14360o3.A0B(str2, 0);
                        medium.A0X = str2;
                    } else if ("bucket_id".equals(A0q)) {
                        medium.A02 = c16l.A1D();
                    } else if ("bucket_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        medium.A0O = str3;
                    } else if ("rotation".equals(A0q)) {
                        medium.A07 = c16l.A1D();
                    } else if ("duration_in_ms".equals(A0q)) {
                        medium.A03 = c16l.A1D();
                    } else if ("date_taken".equals(A0q)) {
                        medium.A0D = c16l.A0y();
                    } else if ("date_added".equals(A0q)) {
                        medium.A0C = c16l.A0y();
                    } else if ("is_favorite".equals(A0q)) {
                        medium.A0f = c16l.A0d();
                    } else if ("uri".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        medium.A0b = str4;
                    } else if ("friendly_duration".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        medium.A0U = str5;
                    } else if ("thumbnail_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str6 = c16l.A1P();
                        }
                        medium.A0a = str6;
                    } else if ("max_sample_size".equals(A0q)) {
                        medium.A06 = c16l.A1D();
                    } else if ("landscape_colors".equals(A0q)) {
                        medium.A0H = AbstractC14530oR.parseFromJson(c16l);
                    } else if ("attribution_content_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str7 = c16l.A1P();
                        }
                        medium.A0N = str7;
                    } else if ("should_fetch_audio_preview".equals(A0q)) {
                        medium.A0g = c16l.A0d();
                    } else if ("has_lat_lng".equals(A0q)) {
                        medium.A0d = c16l.A0d();
                    } else if (Location.LATITUDE.equals(A0q)) {
                        medium.A00 = c16l.A0U();
                    } else if ("longitude".equals(A0q)) {
                        medium.A01 = c16l.A0U();
                    } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                        medium.A0B = c16l.A1D();
                    } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                        medium.A04 = c16l.A1D();
                    } else if ("locality".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str8 = c16l.A1P();
                        }
                        medium.A0V = str8;
                    } else if ("feature_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str9 = c16l.A1P();
                        }
                        medium.A0T = str9;
                    } else if ("sub_admin_area".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str10 = c16l.A1P();
                        }
                        medium.A0Z = str10;
                    } else if ("admin_area".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str11 = c16l.A1P();
                        }
                        medium.A0L = str11;
                    } else if ("countryName".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str12 = c16l.A1P();
                        }
                        medium.A0R = str12;
                    } else if ("faces".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                FaceCenter parseFromJson = AbstractC225939yC.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        medium.A0c = arrayList;
                    } else if ("source_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str13 = c16l.A1P();
                        }
                        medium.A0Y = str13;
                    } else if ("ar_effect_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str14 = c16l.A1P();
                        }
                        medium.A0M = str14;
                    } else if ("capture_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str15 = c16l.A1P();
                        }
                        medium.A0Q = str15;
                    } else if ("camera_position".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str16 = c16l.A1P();
                        }
                        medium.A0P = str16;
                    } else if ("effect_persisted_metadata".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str17 = c16l.A1P();
                        }
                        medium.A0S = str17;
                    } else if ("video_highlight_start_time_in_ms".equals(A0q)) {
                        medium.A0A = c16l.A1D();
                    } else if ("video_highlight_duration_in_ms".equals(A0q)) {
                        medium.A09 = c16l.A1D();
                    } else if ("original_media_uri".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        medium.A0W = str;
                    } else if ("is_motion_photo".equals(A0q)) {
                        medium.A0I = Boolean.valueOf(c16l.A0d());
                    } else if ("is_remix".equals(A0q)) {
                        medium.A0K = Boolean.valueOf(c16l.A0d());
                    } else if ("generated_media_metadata".equals(A0q)) {
                        medium.A0E = AbstractC225949yD.parseFromJson(c16l);
                    } else if ("media_upload_metadata".equals(A0q)) {
                        MediaUploadMetadata parseFromJson2 = AbstractC93554Hv.parseFromJson(c16l);
                        C14360o3.A0B(parseFromJson2, 0);
                        medium.A0G = parseFromJson2;
                    } else if ("is_quicksnap_recap".equals(A0q)) {
                        medium.A0J = Boolean.valueOf(c16l.A0d());
                    }
                }
                c16l.A0z();
            }
            return medium;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, Medium medium) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, medium.A05);
        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, medium.A08);
        String str = medium.A0X;
        if (str != null) {
            anonymousClass182.A0S("path", str);
        }
        anonymousClass182.A0Q("bucket_id", medium.A02);
        String str2 = medium.A0O;
        if (str2 != null) {
            anonymousClass182.A0S("bucket_name", str2);
        }
        anonymousClass182.A0Q("rotation", medium.A07);
        anonymousClass182.A0Q("duration_in_ms", medium.A03);
        anonymousClass182.A0R("date_taken", medium.A0D);
        anonymousClass182.A0R("date_added", medium.A0C);
        anonymousClass182.A0T("is_favorite", medium.A0f);
        String str3 = medium.A0b;
        if (str3 != null) {
            anonymousClass182.A0S("uri", str3);
        }
        String str4 = medium.A0U;
        if (str4 != null) {
            anonymousClass182.A0S("friendly_duration", str4);
        }
        String str5 = medium.A0a;
        if (str5 != null) {
            anonymousClass182.A0S("thumbnail_path", str5);
        }
        anonymousClass182.A0Q("max_sample_size", medium.A06);
        if (medium.A0H != null) {
            anonymousClass182.A0r("landscape_colors");
            BackgroundGradientColors backgroundGradientColors = medium.A0H;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("top_color", backgroundGradientColors.A01);
            anonymousClass182.A0Q("bottom_color", backgroundGradientColors.A00);
            anonymousClass182.A0a();
        }
        String str6 = medium.A0N;
        if (str6 != null) {
            anonymousClass182.A0S("attribution_content_url", str6);
        }
        anonymousClass182.A0T("should_fetch_audio_preview", medium.A0g);
        anonymousClass182.A0T("has_lat_lng", medium.A0d);
        anonymousClass182.A0O(Location.LATITUDE, medium.A00);
        anonymousClass182.A0O("longitude", medium.A01);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, medium.A0B);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, medium.A04);
        String str7 = medium.A0V;
        if (str7 != null) {
            anonymousClass182.A0S("locality", str7);
        }
        String str8 = medium.A0T;
        if (str8 != null) {
            anonymousClass182.A0S("feature_name", str8);
        }
        String str9 = medium.A0Z;
        if (str9 != null) {
            anonymousClass182.A0S("sub_admin_area", str9);
        }
        String str10 = medium.A0L;
        if (str10 != null) {
            anonymousClass182.A0S("admin_area", str10);
        }
        String str11 = medium.A0R;
        if (str11 != null) {
            anonymousClass182.A0S("countryName", str11);
        }
        if (medium.A0c != null) {
            C16V.A03(anonymousClass182, "faces");
            for (FaceCenter faceCenter : medium.A0c) {
                if (faceCenter != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0P("x", faceCenter.A01);
                    anonymousClass182.A0P("y", faceCenter.A02);
                    anonymousClass182.A0P("confidence", faceCenter.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str12 = medium.A0Y;
        if (str12 != null) {
            anonymousClass182.A0S("source_media_id", str12);
        }
        String str13 = medium.A0M;
        if (str13 != null) {
            anonymousClass182.A0S("ar_effect_id", str13);
        }
        String str14 = medium.A0Q;
        if (str14 != null) {
            anonymousClass182.A0S("capture_type", str14);
        }
        String str15 = medium.A0P;
        if (str15 != null) {
            anonymousClass182.A0S("camera_position", str15);
        }
        String str16 = medium.A0S;
        if (str16 != null) {
            anonymousClass182.A0S("effect_persisted_metadata", str16);
        }
        anonymousClass182.A0Q("video_highlight_start_time_in_ms", medium.A0A);
        anonymousClass182.A0Q("video_highlight_duration_in_ms", medium.A09);
        String str17 = medium.A0W;
        if (str17 != null) {
            anonymousClass182.A0S("original_media_uri", str17);
        }
        Boolean bool = medium.A0I;
        if (bool != null) {
            anonymousClass182.A0T("is_motion_photo", bool.booleanValue());
        }
        Boolean bool2 = medium.A0K;
        if (bool2 != null) {
            anonymousClass182.A0T("is_remix", bool2.booleanValue());
        }
        if (medium.A0E != null) {
            anonymousClass182.A0r("generated_media_metadata");
            GeneratedMediaMetadata generatedMediaMetadata = medium.A0E;
            anonymousClass182.A0d();
            String str18 = generatedMediaMetadata.A00;
            if (str18 != null) {
                anonymousClass182.A0S("generated_media_prompt", str18);
            }
            anonymousClass182.A0T("is_internal", generatedMediaMetadata.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0r("media_upload_metadata");
        AbstractC93554Hv.A00(anonymousClass182, medium.A0G);
        Boolean bool3 = medium.A0J;
        if (bool3 != null) {
            anonymousClass182.A0T("is_quicksnap_recap", bool3.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
