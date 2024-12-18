package X;

import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.8GO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GO {
    public static final C8GO A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final C8GW A02(UserSession userSession, C81W c81w) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int A002;
        C14360o3.A0B(c81w, 0);
        switch (c81w.ordinal()) {
            case 0:
                i = 2131954609;
                i2 = R.drawable.instagram_boomerang_outline_44;
                i3 = 2131954610;
                return new C8GW(i, i2, i3, false);
            case 1:
                C06090Tz c06090Tz = C06090Tz.A05;
                int i9 = 2131954613;
                if (C18U.A06(c06090Tz, userSession, 36330823414268963L)) {
                    i9 = 2131954698;
                }
                int i10 = 2131954614;
                if (C18U.A06(c06090Tz, userSession, 36330823414268963L)) {
                    i10 = 2131954699;
                }
                return new C8GW(i9, R.drawable.instagram_text_filled_44, i10, false);
            case 2:
                i = 2131954615;
                i2 = R.drawable.instagram_text_filled_44;
                i3 = 2131954616;
                return new C8GW(i, i2, i3, false);
            case 3:
                i = 2131954669;
                i2 = R.drawable.instagram_layout_remix1_outline_44;
                i3 = 2131954670;
                return new C8GW(i, i2, i3, false);
            case 4:
                i = 2131954633;
                i2 = R.drawable.instagram_layout_outline_44;
                i3 = 2131954634;
                return new C8GW(i, i2, i3, false);
            case 5:
                i7 = 2131954635;
                i8 = R.drawable.instagram_layout_4_grid_outline_44;
                return new C8GW(i7, i8, 0, false);
            case 6:
                i = 2131954629;
                i2 = R.drawable.instagram_hands_free_outline_44;
                i3 = 2131954630;
                return new C8GW(i, i2, i3, false);
            case 7:
                i4 = 2131954625;
                i5 = R.drawable.instagram_hand_pano_filled_24;
                i6 = 2131954626;
                return new C8GW(i4, i5, i6, true);
            case 8:
                i = 2131954619;
                i2 = R.drawable.instagram_duration_15_outline_44;
                i3 = 2131954620;
                return new C8GW(i, i2, i3, false);
            case 9:
                i = 2131954655;
                i2 = R.drawable.instagram_music_outline_44;
                i3 = 2131954656;
                return new C8GW(i, i2, i3, false);
            case 10:
                i = 2131954674;
                i2 = R.drawable.instagram_clips_speed_off;
                i3 = 2131954685;
                return new C8GW(i, i2, i3, false);
            case 11:
                i = 2131954674;
                i2 = R.drawable.instagram_speed_1_outline_44;
                i3 = 2131954695;
                return new C8GW(i, i2, i3, false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 2131954621;
                i2 = R.drawable.instagram_edit_clip_outline_44;
                i3 = 2131954622;
                return new C8GW(i, i2, i3, false);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                if (userSession == null) {
                    A002 = R.drawable.instagram_sparkles_outline_44;
                } else {
                    A002 = AbstractC172037lY.A00(userSession);
                }
                return new C8GW(2131954623, A002, 2131954624, false);
            case 14:
                i4 = 2131954700;
                i5 = R.drawable.instagram_clock_pano_outline_24;
                i6 = 2131954701;
                return new C8GW(i4, i5, i6, true);
            case Process.SIGTERM /* 15 */:
                i = 2131954601;
                i2 = R.drawable.instagram_clips_ghost_off;
                i3 = 2131954602;
                return new C8GW(i, i2, i3, false);
            case 16:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 35:
            case 36:
            case 39:
            case 43:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown camera tool: ");
                sb.append(this);
                AbstractC12120kG.A00("CameraToolMenuHelper", sb.toString());
                return null;
            case 17:
                i = 2131954653;
                i2 = R.drawable.instagram_align_left_outline_44;
                i3 = 2131954654;
                return new C8GW(i, i2, i3, false);
            case 18:
                i = 2131954641;
                i2 = R.drawable.instagram_align_left_outline_44;
                i3 = 2131954642;
                return new C8GW(i, i2, i3, false);
            case Process.SIGSTOP /* 19 */:
                i = 2131954643;
                i2 = R.drawable.instagram_donations_outline_44;
                i3 = 2131954644;
                return new C8GW(i, i2, i3, false);
            case 20:
                i = 2131954639;
                i2 = R.drawable.instagram_badges_outline_44;
                i3 = 2131954640;
                return new C8GW(i, i2, i3, false);
            case 21:
                i = 2131954657;
                i2 = R.drawable.instagram_microphone_outline_44;
                i3 = 2131954658;
                return new C8GW(i, i2, i3, false);
            case 22:
                i = 2131954659;
                i2 = R.drawable.instagram_video_chat_outline_44;
                i3 = 2131954660;
                return new C8GW(i, i2, i3, false);
            case 23:
                i = 2131954645;
                i2 = R.drawable.instagram_app_instagram_outline_44;
                i3 = 2131954646;
                return new C8GW(i, i2, i3, false);
            case 24:
                i = 2131954647;
                i2 = R.drawable.instagram_calendar_outline_44;
                i3 = 2131954648;
                return new C8GW(i, i2, i3, false);
            case 25:
                i = 2131954649;
                i2 = R.drawable.instagram_shopping_bag_outline_44;
                i3 = 2131954650;
                return new C8GW(i, i2, i3, false);
            case 26:
                i = 2131964036;
                i2 = R.drawable.instagram_users_outline_44;
                i3 = 2131954638;
                return new C8GW(i, i2, i3, false);
            case 27:
                i = 2131954636;
                i2 = R.drawable.instagram_level_outline_44;
                i3 = 2131954637;
                return new C8GW(i, i2, i3, false);
            case 28:
                i = 2131954617;
                i2 = R.drawable.instagram_dual_camera_outline_44;
                i3 = 2131954618;
                return new C8GW(i, i2, i3, false);
            case 30:
                i = 2131954703;
                i2 = R.drawable.instagram_layout_outline_44;
                i3 = 2131954704;
                return new C8GW(i, i2, i3, false);
            case 31:
                i7 = 2131954635;
                i8 = R.drawable.instagram_layout_2_vert_outline_44;
                return new C8GW(i7, i8, 0, false);
            case 32:
                i = 2131954705;
                i2 = R.drawable.instagram_fit_outline_44;
                i3 = 2131954706;
                return new C8GW(i, i2, i3, false);
            case 33:
            case 34:
                i = 2131954663;
                i2 = R.drawable.instagram_layout_remix3_outline_44;
                i3 = 2131954664;
                return new C8GW(i, i2, i3, false);
            case 37:
                i = 2131954651;
                i2 = R.drawable.instagram_crown_outline_44;
                i3 = 2131954652;
                return new C8GW(i, i2, i3, false);
            case 38:
                i = 2131954599;
                i2 = R.drawable.instagram_reply_outline_44;
                i3 = 2131954600;
                return new C8GW(i, i2, i3, false);
            case 40:
                i = 2131972617;
                i2 = R.drawable.instagram_roll_call_story_outline_44;
                i3 = 2131954673;
                return new C8GW(i, i2, i3, false);
            case Seq.NULL_REFNUM /* 41 */:
                i4 = 2131954671;
                i5 = R.drawable.instagram_roll_call_chat_pano_outline_24;
                i6 = 2131954672;
                return new C8GW(i4, i5, i6, true);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                i = 2131954627;
                i2 = R.drawable.instagram_green_screen_outline_44;
                i3 = 2131954628;
                return new C8GW(i, i2, i3, false);
            case 59:
                i = 2131954696;
                i2 = R.drawable.instagram_templates_outline_44;
                i3 = 2131954697;
                return new C8GW(i, i2, i3, false);
        }
    }

    public static final C55982hj A00(InterfaceC55932he interfaceC55932he, double d, double d2) {
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(C55942hf.A03(d, d2));
        A02.A0A(interfaceC55932he);
        return A02;
    }

    public static final void A01(UserSession userSession, boolean z) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        A002.A61.Egi(A002, Boolean.valueOf(z), C23031Ai.A8c[297]);
    }
}
