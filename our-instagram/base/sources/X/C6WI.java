package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6WI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WI {
    public static C6WI A0Z;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A08;
    public int A09;
    public ExistingStandaloneFundraiserForFeedModel A0A;
    public String A0B;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A07 = -1;
    public final List A0Y = new ArrayList();
    public String A0C = "";

    private C19280xC A00(String str, String str2) {
        C19280xC A04 = C1QE.A01("capture_flow_v2").A04("ig_creation_flow_step");
        A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A04.A0C("next_step", str2);
        A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A0C);
        return A04;
    }

    public static C6WI A01() {
        C6WI c6wi = A0Z;
        if (c6wi == null) {
            C6WI c6wi2 = new C6WI();
            A0Z = c6wi2;
            return c6wi2;
        }
        return c6wi;
    }

    public static String A02() {
        return C1QE.A01("capture_flow_v2").A05();
    }

    public final void A03(UserSession userSession, String str) {
        String str2;
        String str3;
        C19280xC A00 = A00(AbstractC43591JPw.A00(946), str);
        A00.A08(Integer.valueOf(this.A04), "long_press_count");
        A00.A08(Integer.valueOf(this.A09), "rearrange_count");
        A00.A08(Integer.valueOf(this.A00), "tap_add_media_count");
        A00.A08(Integer.valueOf(this.A01), "delete_media_count");
        A00.A08(Integer.valueOf(this.A02), "edit_sub_media_count");
        A00.A08(Integer.valueOf(this.A03), "last_filter_id");
        if (this.A0N) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str2 = "0";
        }
        A00.A0C("filter_strength_toggle", str2);
        if (this.A0Q) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        A00.A0C("mute_all_audio_toggle", str3);
        AbstractC11060iN.A00(userSession).EHW(A00);
        this.A04 = 0;
        this.A09 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A0N = false;
        this.A0Q = false;
    }

    public final void A04(UserSession userSession, String str) {
        AbstractC11060iN.A00(userSession).EHW(A00("media_crop", str));
        this.A0L = false;
    }

    public final void A05(UserSession userSession, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C19280xC A00 = A00("gallery", str);
        if (this.A0R) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str2 = "0";
        }
        A00.A0C("nonsquare_toggle", str2);
        if (this.A0J) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        A00.A0C("carousel_toggle", str3);
        if (this.A0P) {
            str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str4 = "0";
        }
        A00.A0C("draft_manage_toggle", str4);
        if (this.A0K) {
            str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str5 = "0";
        }
        A00.A0C("draft_select_toggle", str5);
        A00.A08(0, "draft_count");
        if (this.A0I) {
            str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str6 = "0";
        }
        A00.A0C("carousel_long_press_toggle", str6);
        A00.A08(Integer.valueOf(this.A06), "media_selected");
        A00.A08(Integer.valueOf(this.A05), "max_media_selected");
        AbstractC11060iN.A00(userSession).EHW(A00);
        this.A0M = false;
        this.A0R = false;
        this.A0J = false;
        this.A0I = false;
        this.A0P = false;
        this.A0K = false;
        this.A06 = 0;
        this.A05 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(com.instagram.common.session.UserSession r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6WI.A06(com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public final void A07(UserSession userSession, String str, boolean z) {
        String A00;
        if (z) {
            A00 = AbstractC43591JPw.A00(352);
        } else {
            A00 = MSV.A00(437);
        }
        AbstractC11060iN.A00(userSession).EHW(A00(A00, str));
    }
}
