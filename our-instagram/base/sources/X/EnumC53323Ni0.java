package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ni0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class EnumC53323Ni0 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53323Ni0[] A02;
    public static final EnumC53323Ni0 A03;
    public static final EnumC53323Ni0 A04;
    public static final EnumC53323Ni0 A05;
    public static final EnumC53323Ni0 A06;
    public static final EnumC53323Ni0 A07;
    public static final EnumC53323Ni0 A08;
    public static final EnumC53323Ni0 A09;
    public static final EnumC53323Ni0 A0A;
    public static final EnumC53323Ni0 A0B;
    public static final EnumC53323Ni0 A0C;
    public static final EnumC53323Ni0 A0D;
    public static final EnumC53323Ni0 A0E;
    public static final EnumC53323Ni0 A0F;
    public static final EnumC53323Ni0 A0G;
    public static final EnumC53323Ni0 A0H;
    public static final EnumC53323Ni0 A0I;
    public static final EnumC53323Ni0 A0J;
    public static final EnumC53323Ni0 A0K;
    public static final EnumC53323Ni0 A0L;
    public static final EnumC53323Ni0 A0M;
    public static final EnumC53323Ni0 A0N;
    public static final EnumC53323Ni0 A0O;
    public static final EnumC53323Ni0 A0P;
    public static final EnumC53323Ni0 A0Q;
    public static final EnumC53323Ni0 A0R;
    public static final EnumC53323Ni0 A0S;
    public static final EnumC53323Ni0 A0T;
    public static final EnumC53323Ni0 A0U;
    public final String A00;

    static {
        NRR nrr = new NRR();
        A0N = nrr;
        NRS nrs = new NRS();
        A0O = nrs;
        EnumC53323Ni0 enumC53323Ni0 = new EnumC53323Ni0("SIDECAR", 2, "media/configure_sidecar/");
        A0M = enumC53323Ni0;
        EnumC53323Ni0 enumC53323Ni02 = new EnumC53323Ni0("NAMETAG", 3, "media/configure_to_nametag/");
        A0E = enumC53323Ni02;
        EnumC53323Ni0 enumC53323Ni03 = new EnumC53323Ni0("IGTV", 4, "media/configure_to_igtv/");
        A0C = enumC53323Ni03;
        EnumC53323Ni0 enumC53323Ni04 = new EnumC53323Ni0("FEED", 5, "media/configure/");
        A0A = enumC53323Ni04;
        EnumC53323Ni0 enumC53323Ni05 = new EnumC53323Ni0("FINISH", 6, "media/upload_finish/");
        A0B = enumC53323Ni05;
        EnumC53323Ni0 enumC53323Ni06 = new EnumC53323Ni0("QUALITY_REPORT", 7, "media/update_video_with_quality_info/");
        A0J = enumC53323Ni06;
        EnumC53323Ni0 enumC53323Ni07 = new EnumC53323Ni0("PDQ_HASH_REPORT", 8, "media/update_media_with_pdq_hash_info/");
        A0H = enumC53323Ni07;
        EnumC53323Ni0 enumC53323Ni08 = new EnumC53323Ni0("CLIPS", 9, "media/configure_to_clips/");
        A04 = enumC53323Ni08;
        EnumC53323Ni0 enumC53323Ni09 = new EnumC53323Ni0("CLIPS_ASYNC", 10, "media/upload_clips_configure_params/");
        A05 = enumC53323Ni09;
        EnumC53323Ni0 enumC53323Ni010 = new EnumC53323Ni0("CONFIGURE_STATUS_CLIPS", 11, "media/clips_configure_status/");
        A07 = enumC53323Ni010;
        EnumC53323Ni0 enumC53323Ni011 = new EnumC53323Ni0("CONFIGURE_STATUS_STORY", 12, "media/story_configure_status/");
        A08 = enumC53323Ni011;
        EnumC53323Ni0 enumC53323Ni012 = new EnumC53323Ni0("MEDIA_KIT", 13, "media/configure_to_media_kit_cover/");
        A0D = enumC53323Ni012;
        EnumC53323Ni0 enumC53323Ni013 = new EnumC53323Ni0("TEXT_ONLY", 14, "media/configure_text_only_post/");
        A0S = enumC53323Ni013;
        EnumC53323Ni0 enumC53323Ni014 = new EnumC53323Ni0("TEXT_APP_FEED", 15, "media/configure_text_post_app_feed/");
        A0Q = enumC53323Ni014;
        EnumC53323Ni0 enumC53323Ni015 = new EnumC53323Ni0("TEXT_APP_SIDECAR", 16, "media/configure_text_post_app_sidecar/");
        A0R = enumC53323Ni015;
        EnumC53323Ni0 enumC53323Ni016 = new EnumC53323Ni0("RAVEN", 17, "direct_v2/threads/broadcast/raven_attachment/");
        A0L = enumC53323Ni016;
        NRQ nrq = new NRQ();
        A03 = nrq;
        EnumC53323Ni0 enumC53323Ni017 = new EnumC53323Ni0("OPEN_CAROUSEL_SUBMISSION", 19, "media/configure_to_open_carousel/");
        A0G = enumC53323Ni017;
        EnumC53323Ni0 enumC53323Ni018 = new EnumC53323Ni0("CUTOUT_STICKER", 20, "media/configure_to_cutout_sticker/");
        A09 = enumC53323Ni018;
        EnumC53323Ni0 enumC53323Ni019 = new EnumC53323Ni0("STORY_TEMPLATE_ASSET", 21, "media/configure_to_story_template_asset/");
        A0P = enumC53323Ni019;
        EnumC53323Ni0 enumC53323Ni020 = new EnumC53323Ni0("CLIPS_TEMPLATE_REUSABLE_ASSETS", 22, "media/configure_to_reusable_template_assets/");
        A06 = enumC53323Ni020;
        EnumC53323Ni0 enumC53323Ni021 = new EnumC53323Ni0("VIDEO_IN_NOTE_POG", 23, "media/configure_to_note_pog_video/");
        A0T = enumC53323Ni021;
        EnumC53323Ni0 enumC53323Ni022 = new EnumC53323Ni0("OPEN_CAROUSEL_ACCEPTANCE", 24, "media/manage_submitted_sub_post/");
        A0F = enumC53323Ni022;
        EnumC53323Ni0 enumC53323Ni023 = new EnumC53323Ni0("WONDER_WALL", 25, "media/configure_to_wall/");
        A0U = enumC53323Ni023;
        EnumC53323Ni0 enumC53323Ni024 = new EnumC53323Ni0("QUICKSNAP", 26, "media/configure_to_quick_snap/");
        A0K = enumC53323Ni024;
        EnumC53323Ni0 enumC53323Ni025 = new EnumC53323Ni0("POTATO", 27, "media/configure_potato/");
        A0I = enumC53323Ni025;
        EnumC53323Ni0[] enumC53323Ni0Arr = new EnumC53323Ni0[28];
        System.arraycopy(new EnumC53323Ni0[]{nrr, nrs, enumC53323Ni0, enumC53323Ni02, enumC53323Ni03, enumC53323Ni04, enumC53323Ni05, enumC53323Ni06, enumC53323Ni07, enumC53323Ni08, enumC53323Ni09, enumC53323Ni010, enumC53323Ni011, enumC53323Ni012, enumC53323Ni013, enumC53323Ni014, enumC53323Ni015, enumC53323Ni016, nrq, enumC53323Ni017, enumC53323Ni018, enumC53323Ni019, enumC53323Ni020, enumC53323Ni021, enumC53323Ni022, enumC53323Ni023, enumC53323Ni024}, 0, enumC53323Ni0Arr, 0, 27);
        System.arraycopy(new EnumC53323Ni0[]{enumC53323Ni025}, 0, enumC53323Ni0Arr, 27, 1);
        A02 = enumC53323Ni0Arr;
        A01 = AbstractC12190kN.A00(enumC53323Ni0Arr);
    }

    public static EnumC53323Ni0 valueOf(String str) {
        return (EnumC53323Ni0) Enum.valueOf(EnumC53323Ni0.class, str);
    }

    public static EnumC53323Ni0[] values() {
        return (EnumC53323Ni0[]) A02.clone();
    }

    public final void A00(C25621Ms c25621Ms, UserSession userSession, StringBuilder sb) {
        if (!(this instanceof NRR) && !(this instanceof NRS) && !(this instanceof NRQ)) {
            sb.append(this.A00);
            return;
        }
        sb.append(this.A00);
        Pair A00 = AnonymousClass566.A00(userSession);
        Object obj = A00.first;
        C14360o3.A06(obj);
        c25621Ms.A0H((String) obj, (String) A00.second);
    }

    public EnumC53323Ni0(String str, int i, String str2) {
        this.A00 = str2;
    }
}
