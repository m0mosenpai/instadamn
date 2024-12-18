package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.WDf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70155WDf {
    public static final List A05 = AbstractC43594JPz.A11(303970949, 303965077);
    public boolean A00;
    public final EnumC39619HeT A01;
    public final EnumC65855TvH A02;
    public final VG2 A03;
    public final String A04;

    public C70155WDf(EnumC39619HeT enumC39619HeT, EnumC65855TvH enumC65855TvH, VG2 vg2, String str) {
        AbstractC167027dH.A0a(1, str, enumC39619HeT, enumC65855TvH, vg2);
        this.A04 = str;
        this.A01 = enumC39619HeT;
        this.A02 = enumC65855TvH;
        this.A03 = vg2;
    }

    public final synchronized void A01() {
        if (this.A00) {
            A00((short) 615);
            C006802i.A0p.markerEnd(303960177, (short) 6646);
            this.A00 = false;
        }
    }

    public final synchronized void A02(int i) {
        String A00 = MSV.A00(1421);
        if (this.A00) {
            C006802i.A0p.markerPoint(i, A00);
        }
    }

    public final synchronized void A03(int i) {
        String A00 = AbstractC111324zv.A00(1121);
        if (this.A00) {
            C006802i.A0p.markerPoint(i, A00);
        }
    }

    public final synchronized void A04(int i) {
        String A00 = AbstractC111324zv.A00(1122);
        if (this.A00) {
            C006802i.A0p.markerPoint(i, A00);
        }
    }

    public final synchronized void A05(Boolean bool, Integer num, Integer num2, String str, Map map, int i) {
        int i2;
        String str2;
        C006802i c006802i = C006802i.A0p;
        if (num != null) {
            c006802i.markerAnnotate(i, "request_type", VXW.A00(num));
        }
        if (map != null) {
            c006802i.markerAnnotate(i, AbstractC50532MSl.A00(), (String) map.get("trigger_session_id"));
        }
        c006802i.markerAnnotate(i, "container_module", this.A04);
        String A19 = AbstractC166987dD.A19(AbstractC72894XqT.A00(this.A01));
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String lowerCase = A19.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        c006802i.markerAnnotate(i, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, lowerCase);
        String lowerCase2 = AbstractC166987dD.A19(AbstractC72894XqT.A01(this.A02)).toLowerCase(locale);
        C14360o3.A07(lowerCase2);
        c006802i.markerAnnotate(i, "location", lowerCase2);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        c006802i.markerAnnotate(i, "fetch_type", i2);
        if (i == 303960177) {
            switch (this.A03.ordinal()) {
                case 0:
                    str2 = "ig_media";
                    break;
                case 1:
                    str2 = "ig_comment";
                    break;
                case 2:
                    str2 = "ig_direct_message";
                    break;
                case 3:
                    str2 = "ig_direct_message_thread";
                    break;
                case 4:
                    str2 = "ig_user";
                    break;
                case 5:
                    str2 = "ig_product";
                    break;
                case 6:
                    str2 = "ig_ad";
                    break;
                case 7:
                    str2 = "ig_hashtag";
                    break;
                case 8:
                    str2 = "ig_cowatch_local_media";
                    break;
                case 9:
                    str2 = "ig_story_question_response";
                    break;
                case 10:
                    str2 = "ig_story_highlight";
                    break;
                case 11:
                    str2 = "ig_ar_effect";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str2 = "ig_song";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str2 = "ig_fundraiser";
                    break;
                case 14:
                    str2 = "ig_guide";
                    break;
                case Process.SIGTERM /* 15 */:
                    str2 = "ig_frx_object";
                    break;
                case 16:
                    str2 = "ig_room";
                    break;
                case 17:
                    str2 = "ig_encrypted_direct_message";
                    break;
                case 18:
                    str2 = "ig_live_question";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str2 = "ig_service";
                    break;
                case 20:
                    str2 = "ig_commerce_fb_review";
                    break;
                case 21:
                    str2 = "ig_commerce_ig_review";
                    break;
                case 22:
                    str2 = "ig_commerce_review_response";
                    break;
                case 23:
                    str2 = "ig_commerce_fb_question";
                    break;
                case 24:
                    str2 = "ig_commerce_ig_question";
                    break;
                case 25:
                    str2 = "ig_commerce_platform_answer";
                    break;
                case 26:
                    str2 = "ig_commerce_external_question";
                    break;
                case 27:
                    str2 = "ig_commerce_external_answer";
                    break;
                case 28:
                case 32:
                case 44:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                case 47:
                default:
                    throw new IllegalArgumentException("Unsupported FRXObject type");
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str2 = "ig_location_page";
                    break;
                case 30:
                    str2 = "ig_canvas";
                    break;
                case 31:
                    str2 = "ig_prompt";
                    break;
                case 33:
                    str2 = "ig_igd_prompt";
                    break;
                case 34:
                    str2 = "ig_igd_prompt_response";
                    break;
                case 35:
                    str2 = "ig_third_party_app";
                    break;
                case 36:
                    str2 = "igd_shared_stack_single_attachment";
                    break;
                case 37:
                    str2 = AbstractC43591JPw.A00(390);
                    break;
                case 38:
                    str2 = "ig_reuse_text";
                    break;
                case 39:
                    str2 = "ig_event";
                    break;
                case 40:
                    str2 = "ig_gen_ai_magic_mod";
                    break;
                case Seq.NULL_REFNUM /* 41 */:
                    str2 = "ig_text_app_keyword";
                    break;
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    str2 = "ig_gen_ai_retexturing";
                    break;
                case 43:
                    str2 = "ig_collection";
                    break;
                case 45:
                    str2 = "ig_thread_theme";
                    break;
                case 48:
                    str2 = MSV.A00(1277);
                    break;
            }
            c006802i.markerAnnotate(i, TraceFieldType.ContentType, str2);
            c006802i.markerAnnotate(i, "locale", C1Q2.A03().getLanguage());
        } else {
            c006802i.markerAnnotate(i, "object_type", this.A03.toString());
            if (str == null) {
                str = "[]";
            }
            c006802i.markerAnnotate(i, "selected_tags", str);
            if (bool != null) {
                c006802i.markerAnnotate(i, "is_bloks", bool.booleanValue());
            }
        }
    }

    public final synchronized void A06(Integer num, String str, boolean z) {
        if (this.A00) {
            A00((short) 111);
        }
        this.A00 = true;
        C006802i.A0p.markerStart(303965077);
        A05(Boolean.valueOf(z), num, null, str, null, 303965077);
    }

    public final synchronized void A07(short s) {
        if (this.A00) {
            A00(s);
            this.A00 = false;
        }
    }

    public static final void A00(short s) {
        C006802i c006802i = C006802i.A0p;
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            c006802i.markerEnd(AbstractC167007dF.A0B(it), s);
        }
    }
}
