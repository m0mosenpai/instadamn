package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.24a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C447024a {
    public final C24P A00;
    public final C0JO A01;
    public final C006802i A02;
    public final C18920wW A03;
    public final UserSession A04;

    public C447024a(C006802i c006802i, C18920wW c18920wW, UserSession userSession, C24P c24p) {
        C14360o3.A0B(c18920wW, 2);
        C14360o3.A0B(c24p, 4);
        this.A04 = userSession;
        this.A03 = c18920wW;
        this.A02 = c006802i;
        this.A00 = c24p;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C14360o3.A07(realtimeSinceBootClock);
        this.A01 = realtimeSinceBootClock;
    }

    public static final void A00(C447024a c447024a, String str) {
        A01(c447024a, str, null, null, null, null, null, null, null, null);
    }

    public final void A03(String str, String str2, String str3) {
        C24P c24p = this.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        A01(this, "user_post_capture_click_next", str, str2, str3, null, null, null, null, null);
    }

    public final void A04(String str, String str2, String str3) {
        C24P c24p = this.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        A01(this, "user_pre_capture_clicked_suggested_audio_pill", str, str2, str3, null, null, null, null, null);
    }

    public final void A05(String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 0);
        C24P c24p = this.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        A01(this, "user_pre_capture_restored_draft_with_music", str2, str3, str4, null, str, null, null, null);
    }

    public final void A06(String str, boolean z) {
        String str2;
        String str3;
        C24P c24p = this.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        if (z) {
            str3 = AnonymousClass001.A0R("user_post_capture_music_remove_", str);
            str2 = null;
        } else {
            str2 = null;
            str3 = "system_post_capture_music_remove";
        }
        A01(this, str3, str2, str2, str2, str2, str2, str2, str2, str2);
    }

    public static final void A01(C447024a c447024a, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C18920wW c18920wW = c447024a.A03;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_music_selection_oracle");
        if (A00.isSampled()) {
            A00.AAP("oracle_event_name", str);
            A00.A9K("custom_timestamp_ms", Long.valueOf(c447024a.A01.now()));
            C24P c24p = c447024a.A00;
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8p("event_type", 2);
            C22F c22f = c24p.A00;
            C22M c22m = c22f.A04;
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (str9 == null && (str9 = c22m.A0L) == null) {
                str9 = "";
            }
            A00.AAP("camera_session_id", str9);
            A00.A8R(c22f.A0J(), "camera_destination");
            if (str6 == null) {
                str6 = c22m.A0N;
            }
            A00.AAP("draft_session_id", str6);
            if (str5 == null) {
                str5 = c22m.A0M;
            }
            A00.AAP("composition_str_id", str5);
            A00.AAP("audio_asset_id", str2);
            A00.AAP("audio_cluster_id", str3);
            A00.A9K("audio_asset_start_time_in_ms", 0L);
            A00.A9K("overlap_duration_in_ms", 0L);
            A00.AAP("song_name", str4);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c447024a.A02, c447024a.A04), "system_info");
            A00.A8R(c24p.A00(), "surface");
            A00.AAP("upload_id", str7);
            A00.AAP("ingest_session_id", str8);
            A00.Cht();
        }
    }

    public final void A02() {
        C24P c24p = this.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        A00(this, "user_post_capture_multi_track_remove");
    }
}
