package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

/* renamed from: X.8aK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189418aK {
    public static final Integer A01(C22P c22p) {
        C14360o3.A0B(c22p, 0);
        switch (c22p.ordinal()) {
            case 4:
            case 7:
            case 9:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 51:
            case 164:
                return C05F.A1I;
            case 5:
            case 130:
                return C05F.A0j;
            case 14:
                return C05F.A0N;
            case Process.SIGTERM /* 15 */:
                return C05F.A0Y;
            case 16:
            case 135:
                return C05F.A0u;
            case 17:
            case 31:
                return C05F.A0C;
            case 39:
                return C05F.A02;
            case 48:
                return C05F.A05;
            case 49:
                return C05F.A06;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 105:
                return C05F.A07;
            case 179:
            case 485:
            case 486:
            case 487:
                return C05F.A15;
            case 218:
                return C05F.A1F;
            case 231:
                return C05F.A09;
            case 246:
                return C05F.A0A;
            case 247:
                return C05F.A08;
            case 249:
                return C05F.A0B;
            case C8S8.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                return C05F.A0D;
            case 251:
                return C05F.A0E;
            case 252:
                return C05F.A0F;
            case 275:
                return C05F.A0G;
            case 276:
                return C05F.A03;
            case 277:
                return C05F.A04;
            case 366:
                return C05F.A0H;
            case 401:
            case 402:
                return C05F.A0I;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized entry point for media import: ");
                sb.append(c22p);
                AbstractC12120kG.A07("EntryPointUtil", sb.toString(), null);
                return C05F.A0J;
        }
    }

    public static final boolean A02(C22P c22p) {
        C14360o3.A0B(c22p, 0);
        if (c22p != C22P.A5E && c22p != C22P.A2g && c22p != C22P.A5H) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final C22P A00(String str) {
        String A00;
        switch (str.hashCode()) {
            case -2075285002:
                if (str.equals("action_story_share_threads")) {
                    return C22P.A5H;
                }
                return C22P.A5N;
            case -2027472363:
                if (str.equals(AbstractC111324zv.A00(2925))) {
                    return C22P.A43;
                }
                return C22P.A5N;
            case -1752799159:
                if (str.equals(AbstractC111324zv.A00(1186))) {
                    return C22P.A4L;
                }
                return C22P.A5N;
            case -1533607595:
                if (str.equals("quick_camera_launcher_shortcut_variant_avatar")) {
                    return C22P.A3L;
                }
                return C22P.A5N;
            case -1411076672:
                if (str.equals("camera_upsell_dialog")) {
                    return C22P.A0e;
                }
                return C22P.A5N;
            case -1385596165:
                A00 = AbstractC43591JPw.A00(362);
                break;
            case -1316163253:
                if (str.equals("profile_tap_on_ar_notification")) {
                    return C22P.A0Q;
                }
                return C22P.A5N;
            case -1278884738:
                if (str.equals(AbstractC111324zv.A00(1120))) {
                    return C22P.A3e;
                }
                return C22P.A5N;
            case -1130641820:
                if (str.equals("inspiration_hub_create_post")) {
                    return C22P.A3J;
                }
                return C22P.A5N;
            case -939907210:
                if (str.equals("your_story_dialog_option")) {
                    return C22P.A5c;
                }
                return C22P.A5N;
            case -865541175:
                if (str.equals(AbstractC111324zv.A00(2021))) {
                    return C22P.A0d;
                }
                return C22P.A5N;
            case -811302394:
                if (str.equals("story_share_intent")) {
                    return C22P.A4w;
                }
                return C22P.A5N;
            case -471528113:
                if (str.equals("camera_tab_bar")) {
                    return C22P.A0a;
                }
                return C22P.A5N;
            case -182151899:
                if (str.equals(AbstractC111324zv.A00(1187))) {
                    return C22P.A3p;
                }
                return C22P.A5N;
            case -154070497:
                if (str.equals(AbstractC111324zv.A00(2941))) {
                    return C22P.A0T;
                }
                return C22P.A5N;
            case -138284514:
                if (str.equals(AbstractC111324zv.A00(2233))) {
                    return C22P.A4W;
                }
                return C22P.A5N;
            case -104996226:
                if (str.equals(AbstractC111324zv.A00(99))) {
                    return C22P.A45;
                }
                return C22P.A5N;
            case -38101822:
                if (str.equals(AbstractC111324zv.A00(2940))) {
                    return C22P.A0R;
                }
                return C22P.A5N;
            case 25999906:
                if (str.equals("quick_camera_startup_uri")) {
                    return C22P.A0M;
                }
                return C22P.A5N;
            case 109854522:
                if (str.equals("swipe")) {
                    return C22P.A5C;
                }
                return C22P.A5N;
            case 137920146:
                if (str.equals("camera_action_bar_button_main_feed")) {
                    return C22P.A3O;
                }
                return C22P.A5N;
            case 171320519:
                if (str.equals("story_captured_media_recovery")) {
                    return C22P.A0i;
                }
                return C22P.A5N;
            case 179250025:
                if (str.equals(AbstractC43591JPw.A00(190))) {
                    return C22P.A46;
                }
                return C22P.A5N;
            case 676472861:
                if (str.equals("your_story_placeholder")) {
                    return C22P.A5b;
                }
                return C22P.A5N;
            case 791895943:
                if (str.equals("action_fb_post_reshare")) {
                    return C22P.A2g;
                }
                return C22P.A5N;
            case 963440836:
                if (str.equals(AbstractC111324zv.A00(1279))) {
                    return C22P.A4b;
                }
                return C22P.A5N;
            case 1198338927:
                if (str.equals(AbstractC111324zv.A00(867))) {
                    return C22P.A4X;
                }
                return C22P.A5N;
            case 1364086253:
                A00 = "third_party_intent";
                break;
            case 1383860305:
                if (str.equals(AbstractC111324zv.A00(3030))) {
                    return C22P.A4E;
                }
                return C22P.A5N;
            case 1479815600:
                if (str.equals("quick_camera_launcher_shortcut_variant_glyph")) {
                    return C22P.A3M;
                }
                return C22P.A5N;
            case 1791076262:
                if (str.equals(AbstractC111324zv.A00(2356))) {
                    return C22P.A2j;
                }
                return C22P.A5N;
            case 1904101413:
                if (str.equals("activity_recreated")) {
                    return C22P.A0L;
                }
                return C22P.A5N;
            case 1965399843:
                if (str.equals("profile_picture_tap_on_self_profile")) {
                    return C22P.A44;
                }
                return C22P.A5N;
            case 2017458945:
                if (str.equals(AbstractC111324zv.A00(2059))) {
                    return C22P.A0s;
                }
                return C22P.A5N;
            case 2026871498:
                if (str.equals(AbstractC111324zv.A00(2232))) {
                    return C22P.A4Y;
                }
                return C22P.A5N;
            default:
                return C22P.A5N;
        }
        if (str.equals(A00)) {
            return C22P.A5E;
        }
        return C22P.A5N;
    }
}
