package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.5cU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120315cU {
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0208, code lost:
    
        if (r1 == null) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.instagram.camera.effect.models.CameraAREffect parseFromJson(X.C16L r7) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC120315cU.parseFromJson(X.16L):com.instagram.camera.effect.models.CameraAREffect");
    }

    public static void A00(AnonymousClass182 anonymousClass182, CameraAREffect cameraAREffect) {
        anonymousClass182.A0d();
        String str = cameraAREffect.A0K;
        if (str != null) {
            anonymousClass182.A0S("effect_id", str);
        }
        String str2 = cameraAREffect.A0M;
        if (str2 != null) {
            anonymousClass182.A0S("effect_package_id", str2);
        }
        String str3 = cameraAREffect.A0J;
        if (str3 != null) {
            anonymousClass182.A0S("effect_file_id", str3);
        }
        anonymousClass182.A0T("is_draft", cameraAREffect.A0d);
        anonymousClass182.A0T("is_animated_photo_effect", cameraAREffect.A0c);
        String str4 = cameraAREffect.A0G;
        if (str4 != null) {
            anonymousClass182.A0S("cache_key", str4);
        }
        String str5 = cameraAREffect.A0H;
        if (str5 != null) {
            anonymousClass182.A0S(TraceFieldType.CompressionType, str5);
        }
        String str6 = cameraAREffect.A0S;
        if (str6 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str6);
        }
        String str7 = cameraAREffect.A0A;
        if (str7 != null) {
            anonymousClass182.A0S("asset_url", str7);
        }
        anonymousClass182.A0R("file_size", cameraAREffect.A02);
        anonymousClass182.A0R("uncompressed_file_size", cameraAREffect.A03);
        String str8 = cameraAREffect.A0P;
        if (str8 != null) {
            anonymousClass182.A0S("md5_hash", str8);
        }
        if (cameraAREffect.A07 != null) {
            anonymousClass182.A0r("thumbnail_url");
            AbstractC222616c.A01(anonymousClass182, cameraAREffect.A07);
        }
        if (cameraAREffect.A08 != null) {
            anonymousClass182.A0r("transparent_background_thumbnail_url");
            AbstractC222616c.A01(anonymousClass182, cameraAREffect.A08);
        }
        if (cameraAREffect.A0X != null) {
            C16V.A03(anonymousClass182, "effect_instructions");
            for (C173027nG c173027nG : cameraAREffect.A0X) {
                if (c173027nG != null) {
                    AbstractC173017nF.A00(anonymousClass182, c173027nG);
                }
            }
            anonymousClass182.A0Z();
        }
        if (cameraAREffect.A0b != null) {
            C16V.A03(anonymousClass182, "supported_capture_modes");
            for (String str9 : cameraAREffect.A0b) {
                if (str9 != null) {
                    anonymousClass182.A0u(str9);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("internal_only", cameraAREffect.A0f);
        if (cameraAREffect.A0a != null) {
            C16V.A03(anonymousClass182, "capabilities_set");
            for (String str10 : cameraAREffect.A0a) {
                if (str10 != null) {
                    anonymousClass182.A0u(str10);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num = cameraAREffect.A09;
        if (num != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC120335cZ.A00(num));
        }
        String str11 = cameraAREffect.A0B;
        if (str11 != null) {
            anonymousClass182.A0S("attribution_id", str11);
        }
        String str12 = cameraAREffect.A0C;
        if (str12 != null) {
            anonymousClass182.A0S("attribution_username", str12);
        }
        if (cameraAREffect.A05 != null) {
            anonymousClass182.A0r("attribution_profile_image_url");
            AbstractC222616c.A01(anonymousClass182, cameraAREffect.A05);
        }
        if (cameraAREffect.A0T != null) {
            C16V.A03(anonymousClass182, "capabilities_min_version_models");
            for (ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling : cameraAREffect.A0T) {
                if (aRCapabilityMinVersionModeling != null) {
                    AbstractC120345ca.A00(aRCapabilityMinVersionModeling, anonymousClass182);
                }
            }
            anonymousClass182.A0Z();
        }
        if (cameraAREffect.A04 != null) {
            anonymousClass182.A0r("spark_vision_capability");
            SparkVisionCapability sparkVisionCapability = cameraAREffect.A04;
            anonymousClass182.A0d();
            if (sparkVisionCapability.A00 != null) {
                C16V.A03(anonymousClass182, "identifiers");
                for (String str13 : sparkVisionCapability.A00) {
                    if (str13 != null) {
                        anonymousClass182.A0u(str13);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_network_consent_required", cameraAREffect.A0g);
        anonymousClass182.A0T("uses_flm_capability", cameraAREffect.A0j);
        if (cameraAREffect.A0V != null) {
            C16V.A03(anonymousClass182, "effect_info_ui_items");
            for (String str14 : cameraAREffect.A0V) {
                if (str14 != null) {
                    anonymousClass182.A0u(str14);
                }
            }
            anonymousClass182.A0Z();
        }
        if (cameraAREffect.A0W != null) {
            C16V.A03(anonymousClass182, "effect_info_ui_secondary_items");
            for (String str15 : cameraAREffect.A0W) {
                if (str15 != null) {
                    anonymousClass182.A0u(str15);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("save_status", cameraAREffect.A01);
        String str16 = cameraAREffect.A0L;
        if (str16 != null) {
            anonymousClass182.A0S("effect_manifest_json", str16);
        }
        if (cameraAREffect.A06 != null) {
            anonymousClass182.A0r("preview_video_media");
            AbstractC222616c.A01(anonymousClass182, cameraAREffect.A06);
        }
        if (cameraAREffect.A0U != null) {
            C16V.A03(anonymousClass182, "effect_file_contents");
            for (AGB agb : cameraAREffect.A0U) {
                if (agb != null) {
                    ADM.A00(anonymousClass182, agb);
                }
            }
            anonymousClass182.A0Z();
        }
        String str17 = cameraAREffect.A0I;
        if (str17 != null) {
            anonymousClass182.A0S("effect_collection_id", str17);
        }
        anonymousClass182.A0T("use_hands_free", cameraAREffect.A0i);
        anonymousClass182.A0Q("hands_free_duration_ms", cameraAREffect.A00);
        anonymousClass182.A0T("is_encrypted", cameraAREffect.A0e);
        if (cameraAREffect.A0Y != null) {
            C16V.A03(anonymousClass182, "product_capabilities");
            for (String str18 : cameraAREffect.A0Y) {
                if (str18 != null) {
                    anonymousClass182.A0u(str18);
                }
            }
            anonymousClass182.A0Z();
        }
        String str19 = cameraAREffect.A0N;
        if (str19 != null) {
            anonymousClass182.A0S("formatted_media_count", str19);
        }
        String str20 = cameraAREffect.A0O;
        if (str20 != null) {
            anonymousClass182.A0S("formatted_media_count_accessibility", str20);
        }
        String str21 = cameraAREffect.A0D;
        if (str21 != null) {
            anonymousClass182.A0S("avatar_sdk_preset_glb", str21);
        }
        String str22 = cameraAREffect.A0R;
        if (str22 != null) {
            anonymousClass182.A0S("required_sdk_version", str22);
        }
        String str23 = cameraAREffect.A0F;
        if (str23 != null) {
            anonymousClass182.A0S("best_instance_id", str23);
        }
        String str24 = cameraAREffect.A0E;
        if (str24 != null) {
            anonymousClass182.A0S("avatar_type", str24);
        }
        anonymousClass182.A0a();
    }
}
