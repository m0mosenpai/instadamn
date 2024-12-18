package X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.insights.GPUInsights;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.22C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22C extends C22F implements InterfaceC13050lr, InterfaceC13000lm {
    public final C24Q A00;
    public final C447324d A01;
    public final C447024a A02;
    public final C24U A03;
    public final C447624g A04;
    public final C449524z A05;
    public final C447924j A06;
    public final C448024k A07;
    public final C448224m A08;
    public final C448124l A09;
    public final C449124v A0A;
    public final C448324n A0B;
    public final C448424o A0C;
    public final C448524p A0D;
    public final C448624q A0E;
    public final C448724r A0F;
    public final C448824s A0G;
    public final C448924t A0H;
    public final C449024u A0I;
    public final C447724h A0J;
    public final AnonymousClass250 A0K;

    public static C81X A00(EnumC185288Jt enumC185288Jt) {
        if (enumC185288Jt != null) {
            switch (enumC185288Jt.ordinal()) {
                case 1:
                    return C81X.A2O;
                case 2:
                    return C81X.A2K;
                case 3:
                    return C81X.A0q;
                case 4:
                    return C81X.A0t;
                case 5:
                    return C81X.A1p;
                case 7:
                    return C81X.A38;
            }
        }
        return null;
    }

    public static C19280xC A01(C22C c22c, String str) {
        Integer num;
        int A00;
        C22M c22m = ((C22F) c22c).A04;
        if (c22m.A0L == null) {
            AbstractC12120kG.A01(C22F.A08.getModuleName(), AnonymousClass001.A0R(str, ": mCameraSession is null"));
        }
        C19280xC A002 = C19280xC.A00(C22F.A08, str);
        C1810981l c1810981l = c22m.A0E;
        if (c1810981l == null || (num = c1810981l.A0A()) == null) {
            num = C05F.A0C;
        }
        int i = c22m.A00;
        if (i == -1) {
            A00 = AbstractC449424y.A01(num);
        } else {
            A00 = AbstractC449424y.A00(((C22F) c22c).A03, num, i);
        }
        A002.A0C(AbstractC69998VzI.A00(0, 10, 45), c22m.A0L);
        A002.A0B(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, Long.valueOf(c22m.A09.A00));
        A002.A0C("ig_userid", ((C22F) c22c).A03.userId);
        A002.A08(2, "event_type");
        A002.A08(Integer.valueOf(A00), "capture_type");
        A002.A08(0, "capture_format_index");
        String str2 = c22m.A0O;
        if (str2 != null) {
            A002.A0C("discovery_session_id", str2);
        }
        String str3 = c22m.A0P;
        if (str3 != null) {
            A002.A0C("search_session_id", str3);
        }
        return A002;
    }

    public static void A03(AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, C22C c22c, String str, boolean z, boolean z2) {
        c22c.A09.A0R(null, anonymousClass249, null, enumC50631MWs, null, null, null, null, str, null, null, null, z, z2);
    }

    public static void A04(EnumC50631MWs enumC50631MWs, C81X c81x, C22C c22c, String str, boolean z) {
        c22c.A09.A0R(null, ((C22F) c22c).A04.A0A, null, enumC50631MWs, c81x, null, null, null, str, null, null, null, z, false);
    }

    public static void A06(EnumC50631MWs enumC50631MWs, C22C c22c, String str, int i, boolean z) {
        c22c.A09.A0R(null, ((C22F) c22c).A04.A0A, null, enumC50631MWs, null, Boolean.valueOf(z), Long.valueOf(i), null, str, null, null, null, true, false);
    }

    public static void A08(EnumC50631MWs enumC50631MWs, C22C c22c, String str, boolean z) {
        A03(((C22F) c22c).A04.A0A, enumC50631MWs, c22c, str, z, false);
    }

    public static void A09(EnumC50631MWs enumC50631MWs, C22C c22c, String str, boolean z) {
        A03(((C22F) c22c).A04.A0A, enumC50631MWs, c22c, str, true, z);
    }

    public final void A18(C22P c22p, EnumC50631MWs enumC50631MWs, C1810981l c1810981l, C5JK c5jk, PromptStickerModel promptStickerModel, List list, int i, int i2) {
        A16(c22p, null, enumC50631MWs, null, c1810981l, c5jk, null, promptStickerModel, null, null, null, null, null, null, list, i, i2);
    }

    public final void A1A(AnonymousClass249 anonymousClass249) {
        if (A0J() != null) {
            A03(anonymousClass249, EnumC50631MWs.A0I, this, "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_TAP", false, false);
        }
    }

    public final void A1B(AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, int i, int i2) {
        C448624q c448624q = this.A0E;
        C14360o3.A0B(anonymousClass249, 3);
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(Long.valueOf(i), Long.valueOf(i2));
            C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
            if (c448624q.A0P() && ((AbstractC02600Aj) A0A).A00.isSampled()) {
                A0A.A0M(C81X.A0d, "tool_type");
                A0A.A0s("IG_CAMERA_COLOR_FILTER_APPLIED");
                C448624q.A00(A0A, c448624q);
                C16930sl c16930sl = C16930sl.A00;
                A0A.A0S("applied_effect_ids", c16930sl);
                A0A.A0S("applied_effect_instance_ids", c16930sl);
                A0A.A0O("auto_applied", false);
                A0A.A0a(c448624q.A0J());
                A0A.A0M(c448624q.A0I(), "capture_type");
                A0A.A0R("color_effect_id", Integer.toString(i));
                ((AbstractC02600Aj) A0A).A00.A9M("effect_indices", hashMap);
                C22M c22m = c448624q.A04;
                A0A.A0b(c22m.A09);
                A0A.A0W(2);
                A0A.A0c(anonymousClass249);
                A0A.A0m(C22F.A08.getModuleName());
                A0A.A0M(enumC50631MWs, "surface");
                int i3 = 2;
                if (c22m.A01 != 2) {
                    i3 = 1;
                }
                A0A.A0V(i3);
                A0A.A0R("composition_str_id", c22m.A0M);
                A0A.A0M(anonymousClass249, "composition_media_type");
                A0A.A0t(C1QM.A00.A02.A00);
                A0A.A0O("is_carousel", Boolean.valueOf(c22m.A0A == AnonymousClass249.ALBUM));
                A0A.Cht();
            }
        }
    }

    public final void A1R(EnumC50631MWs enumC50631MWs, String str) {
        A08(enumC50631MWs, this, str, false);
    }

    public final void A22(String str, boolean z) {
        A0D(this, str, A0N(0), z);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.22F, X.24k] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.24l, X.22F] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.24m, X.22F] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.24n, X.22F] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.24o, X.22F] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.24p, X.22F] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.24q, X.22F] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.24r, X.22F] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.24s, X.22F] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.24t, X.22F] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.24u, X.22F] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.22F, X.24z] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.22F, X.24j] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.251, X.250, X.22F] */
    public C22C(UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        super(userSession, new C22M());
        C22M c22m = super.A04;
        c22m.A0J = str5;
        c22m.A0T = str4;
        C218914p c218914p = C218914p.A08;
        C24M c24m = super.A05;
        C24Q c24q = new C24Q(c218914p, userSession, c24m, super.A06);
        this.A00 = c24q;
        this.A03 = new C24U(c24q, userSession);
        C18920wW c18920wW = super.A01;
        C006802i c006802i = super.A00;
        C24P c24p = super.A07;
        this.A02 = new C447024a(c006802i, c18920wW, userSession, c24p);
        this.A01 = new C447324d(userSession, c24p);
        this.A04 = new C447624g(userSession);
        this.A0J = new C447724h(c24q, userSession, c24m);
        this.A06 = new C22F(userSession, c22m);
        this.A07 = new C22F(userSession, c22m);
        this.A09 = new C22F(userSession, c22m);
        this.A08 = new C22F(userSession, c22m);
        this.A0B = new C22F(userSession, c22m);
        this.A0C = new C22F(userSession, c22m);
        this.A0D = new C22F(userSession, c22m);
        this.A0E = new C22F(userSession, c22m);
        this.A0F = new C22F(userSession, c22m);
        this.A0G = new C22F(userSession, c22m);
        this.A0H = new C22F(userSession, c22m);
        this.A0I = new C22F(userSession, c22m);
        this.A0A = new C449124v(c24q, userSession, c22m, str, str2, str3);
        this.A05 = new C22F(userSession, c22m);
        ?? c22f = new C22F(userSession, c22m);
        if (C18U.A06(C06090Tz.A05, userSession, 36325849842070985L)) {
            AbstractC193298h9.A01 = true;
            GPUInsights gPUInsights = AbstractC193298h9.A00;
            if (gPUInsights == null) {
                gPUInsights = new GPUInsights();
                AbstractC193298h9.A00 = gPUInsights;
            }
            gPUInsights.gpuEventLogger = c22f;
        }
        this.A0K = c22f;
    }

    private void A02() {
        C22M c22m = super.A04;
        c22m.A0L = null;
        c22m.A0E = null;
        c22m.A09 = C22P.A5N;
        c22m.A0O = null;
        c22m.A0P = null;
        c22m.A0W = false;
        c22m.A00 = -1;
        c22m.A0F = null;
        c22m.A0Y.clear();
        c22m.A0X.clear();
        c22m.A08 = null;
        c22m.A0B = null;
        c22m.A07 = null;
        A0A(C0LK.A5z, null);
        C193288h8 A00 = AbstractC193278h7.A00(super.A03);
        synchronized (A00.A01) {
            A00.A00 = null;
        }
        this.A03.A01();
    }

    public static void A05(EnumC50631MWs enumC50631MWs, C22C c22c, Boolean bool, Long l, String str, String str2) {
        C448124l c448124l = c22c.A09;
        if (c448124l.A0J() != null) {
            C25531Mh A08 = C25531Mh.A08(c448124l.A02);
            if (((AbstractC02600Aj) A08).A00.isSampled()) {
                A08.A0s("IG_CAMERA_ENTITY_TAP");
                A08.A0q(str);
                C448124l.A00(A08, c448124l);
                A08.A0a(c448124l.A0J());
                C22M c22m = c448124l.A04;
                A08.A0b(c22m.A09);
                A08.A0W(2);
                A08.A0M(enumC50631MWs, "surface");
                A08.A0m(C22F.A09.getModuleName());
                A08.A0c(c22m.A0A);
                A08.A0R("composition_str_id", c22m.A0M);
                A08.A0M(c22m.A0A, "composition_media_type");
                A08.A0R("timeline_element", str2);
                A08.A0t(C1QM.A00.A02.A00);
                A08.A0O("is_timeline", true);
                A08.A0Q("number_of_audio_track_clips", l);
                A08.A0O("contains_mix", bool);
                A08.Cht();
            }
        }
    }

    public static void A07(EnumC50631MWs enumC50631MWs, C22C c22c, String str, int i, boolean z) {
        c22c.A09.A0R(null, ((C22F) c22c).A04.A0A, null, enumC50631MWs, null, Boolean.valueOf(z), Long.valueOf(i), null, str, "SLIDER", null, null, true, false);
    }

    public static void A0A(C0LE c0le, String str) {
        Integer num;
        if (C0L6.A04 == null) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (num == C05F.A01) {
            if (!TextUtils.isEmpty(str)) {
                C0L6.A05(c0le, str);
                return;
            } else {
                C0L6.A04(c0le);
                return;
            }
        }
        C0PX c0px = AbstractC04290Kv.A00;
        if (c0px == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            c0px.A01(c0le, str);
        } else {
            c0px.A00(c0le);
        }
    }

    public static void A0B(C22C c22c, String str) {
        if (((C22F) c22c).A04.A0L != null) {
            AbstractC12120kG.A01(C22F.A08.getModuleName(), AnonymousClass001.A0R(str, " mCameraSession is not null"));
        }
        C449124v c449124v = c22c.A0A;
        c449124v.A0e(true);
        c22c.A02();
        C449224w c449224w = c449124v.A04;
        C10190gb A00 = C10190gb.A00();
        InterfaceC10180ga interfaceC10180ga = c449224w.A02;
        if (interfaceC10180ga != null) {
            A00.A00.remove(interfaceC10180ga);
        }
        C24Q c24q = c22c.A00;
        if (c24q.A01 != null) {
            C218914p.A06(c24q.A05);
        }
        GPUInsights gPUInsights = AbstractC193298h9.A00;
        if (gPUInsights != null) {
            gPUInsights.gpuEventLogger = null;
        }
    }

    public static void A0C(C22C c22c, String str) {
        A08(EnumC50631MWs.A0I, c22c, str, true);
    }

    public static void A0D(C22C c22c, String str, List list, boolean z) {
        C447924j c447924j = c22c.A06;
        C18920wW c18920wW = c447924j.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_draft");
        if (A00.isSampled()) {
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "SAVE_APPLIED");
            A00.AAQ(c447924j.A0M(), "creation_session_state");
            C22M c22m = c447924j.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c447924j.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            if (z) {
                A00.A8R(EnumC53336Nim.SPINNABLE_REEL, "spin_type");
            }
            EnumC50631MWs enumC50631MWs = c22m.A0B;
            if (enumC50631MWs != null) {
                A00.A8R(enumC50631MWs, "surface");
            }
            A00.A8p("event_type", 2);
            A00.AAP("composition_str_id", str);
            A00.AAk("camera_tools_struct", list);
            A00.A9K("media_id", c22m.A0I);
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_DRAFT_SAVE_SUCCESS");
            A00.Cht();
        }
    }

    public final String A0R() {
        C3o9 c3o9 = super.A04.A0G;
        if (c3o9 != null) {
            return JRE.A00(c3o9).A00;
        }
        return null;
    }

    public final void A0T() {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A02);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_CLIPS_FINISH_REORDER_TAP");
            A08.A0q("CLIPS_FINISH_REORDER_TAP");
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0U();
            A08.A0m(C22F.A09.getModuleName());
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A08.A0V(i);
            A08.A0Q("capture_format_index", -1L);
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A0U() {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A25, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_SELECT_SEGMENT_TAP");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.A8R(AnonymousClass249.VIDEO, "media_type");
            A00.AAP("module", C22F.A09.getModuleName());
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A0V() {
        C448424o c448424o = this.A0C;
        C18920wW c18920wW = c448424o.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_nux");
        if (A00.isSampled()) {
            A00.AAP("entity", "CONTINUE_SESSION_OPTION_CONTINUE_TAP");
            A00.AAP("nux_step", "TAP");
            C22M c22m = c448424o.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_CONTINUE_SESSION_OPTION_CONTINUE_TAP");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448424o.A0I(), "capture_type");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A0W() {
        C1810981l c1810981l = super.A04.A0E;
        if (c1810981l != null) {
            this.A0A.A0c((C55U) c1810981l.A08.A00);
        }
        if (A0P()) {
            C449124v c449124v = this.A0A;
            C18920wW c18920wW = ((C22F) c449124v).A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_camera_session");
            if (A00.isSampled()) {
                EnumC114925Hg A0J = c449124v.A0J();
                A00.A8p("event_type", 1);
                A00.AAP("module", C22F.A08.getModuleName());
                if (A0J == null) {
                    A0J = EnumC114925Hg.NONE;
                }
                A00.A8R(A0J, "camera_destination");
                C22M c22m = ((C22F) c449124v).A04;
                String str = c22m.A0L;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                A00.AAP("camera_session_id", str);
                A00.A8p("exit_point", Integer.valueOf(c22m.A02));
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                int i = 2;
                if (c22m.A01 != 2) {
                    i = 1;
                }
                A00.A8p("camera_position", Integer.valueOf(i));
                A00.A9K("capture_format_index", 0L);
                String str3 = c22m.A0O;
                if (str3 == null) {
                    str3 = "";
                }
                A00.AAP("discovery_session_id", str3);
                String str4 = c22m.A0P;
                if (str4 != null) {
                    str2 = str4;
                }
                A00.AAP("search_session_id", str2);
                A00.A8R(c449124v.A0I(), "capture_type");
                EnumC50631MWs enumC50631MWs = c22m.A0B;
                if (enumC50631MWs == null) {
                    enumC50631MWs = c22m.A0C;
                }
                A00.A8R(enumC50631MWs, "surface");
                A00.AAQ(AbstractC449424y.A07(((C22F) c449124v).A00, ((C22F) c449124v).A03), "system_info");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.A9K("media_id", c22m.A0I);
                if (c22m.A0C == EnumC50631MWs.A0I) {
                    A00.A8R(c22m.A0A, "media_type");
                }
                A00.Cht();
            }
        }
        A02();
        this.A0A.A0e(false);
    }

    public final void A0X() {
        C448024k c448024k = this.A07;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "GALLERY");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_GALLERY_SESSION");
            String str = c448024k.A04.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c448024k.A0J(), "camera_destination");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A0Y() {
        EnumC114925Hg A0J;
        C448024k c448024k = this.A07;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled() && (A0J = c448024k.A0J()) != null) {
            A00.AAP("entity", "GALLERY");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_GALLERY_SESSION");
            C22M c22m = c448024k.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(A0J, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0H, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A0Z() {
        C448024k c448024k = this.A07;
        C22M c22m = c448024k.A04;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "PRE_CAPTURE");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_PRE_CAPTURE_SESSION");
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c448024k.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("composition_str_id", c22m.A0M);
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448024k.A0I(), "capture_type");
            A00.AAk("camera_tools_struct", c448024k.A0N(0));
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.A8p("event_type", 1);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("search_session_id", c22m.A0P);
            A00.A8R(c22m.A0A, "composition_media_type");
            EnumC50631MWs enumC50631MWs = c22m.A0B;
            if (enumC50631MWs == null) {
                enumC50631MWs = c22m.A0C;
            }
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
        c22m.A0K = null;
    }

    public final void A0a() {
        C447924j c447924j = this.A06;
        C18920wW c18920wW = c447924j.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_draft");
        if (A00.isSampled()) {
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "ENTER_FOLDER");
            A00.AAQ(c447924j.A0M(), "creation_session_state");
            C22M c22m = c447924j.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c447924j.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A8R(c447924j.A0I(), "capture_type");
            A00.A8p("event_type", 2);
            A00.AAQ(AbstractC449424y.A07(c447924j.A00, c447924j.A03), "system_info");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_ENTER_DRAFTS");
            A00.Cht();
        }
    }

    public final void A0b() {
        C448024k c448024k = this.A07;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "GALLERY");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_GALLERY_EXIT_WITH_TAP");
            C22M c22m = c448024k.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.AAP("gallery_exit_point", "TAP");
            A00.A8R(c448024k.A0J(), "camera_destination");
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448024k.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A0c() {
        C448024k c448024k = this.A07;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "LAYOUT");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_LAYOUT_SESSION");
            C22M c22m = c448024k.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448024k.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 1);
            A00.A8R(AnonymousClass249.PHOTO, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.A9K("capture_format_index", 0L);
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A0d() {
        C22M c22m = super.A04;
        if (c22m.A0L != null) {
            C18920wW c18920wW = super.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_notification_impression");
            if (A00.isSampled()) {
                A00.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                A00.AAP("camera_session_id", c22m.A0L);
                A00.A8p("entity_type", 47);
                A00.AAP("module", C22F.A08.getModuleName());
                A00.A8R(EnumC50631MWs.A0I, "surface");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.Cht();
            }
        }
    }

    public final void A0e() {
        C22M c22m = super.A04;
        if (c22m.A0L != null) {
            C18920wW c18920wW = super.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_notification_impression");
            if (A00.isSampled()) {
                A00.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                A00.AAP("camera_session_id", c22m.A0L);
                A00.A8p("entity_type", 46);
                A00.AAP("module", C22F.A08.getModuleName());
                A00.A8R(EnumC50631MWs.A0I, "surface");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.Cht();
            }
        }
    }

    public final void A0f() {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_LONG_PRESS_CAPTURE_BUTTON");
            A08.A0q("LONG_PRESS_CAPTURE_BUTTON");
            C448124l.A00(A08, c448124l);
            C22M c22m = c448124l.A04;
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A08.A0V(i);
            A08.A0Q("capture_format_index", 0L);
            A08.A0a(c448124l.A0J());
            A08.A0M(c448124l.A0I(), "capture_type");
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0c(c22m.A0A);
            A08.A0m(C22F.A08.getModuleName());
            A08.A0M(EnumC50631MWs.A0J, "surface");
            A08.A0t(C1QM.A00.A02.A00);
            String str = c22m.A0P;
            if (str != null && str.length() != 0) {
                A08.A0R("search_session_id", str);
            }
            String str2 = c22m.A0O;
            if (str2 != null && str2.length() != 0) {
                A08.A0R("discovery_session_id", str2);
            }
            A08.Cht();
        }
    }

    public final void A0i() {
        C448424o c448424o = this.A0C;
        C18920wW c18920wW = c448424o.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_nux");
        if (A00.isSampled()) {
            A00.AAP("entity", "TRANSLATE_TEXT_STICKER");
            A00.AAP("nux_step", "OPEN");
            C22M c22m = c448424o.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448424o.A0I(), "capture_type");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.A9K("capture_format_index", 0L);
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A0j() {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        C22M c22m = c448124l.A04;
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null && enumC50631MWs != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("PUBLISH_SCREEN_TAG_PEOPLE");
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0M(enumC50631MWs, "surface");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A0k() {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A02);
        EnumC114925Hg A0J = c448124l.A0J();
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("TIMELINE_SWAP_DONE_TAP");
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0U();
            A08.A0m(C22F.A09.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A0l() {
        C448424o c448424o = this.A0C;
        C18920wW c18920wW = c448424o.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_nux");
        if (A00.isSampled()) {
            A00.AAP("entity", "TRANSLATE_AND_DUB_REEL_SHOW");
            A00.AAP("nux_step", "OPEN");
            C22M c22m = c448424o.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448424o.A0I(), "capture_type");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.A9K("capture_format_index", 0L);
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A0m(double d) {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_CLIPS_EDITOR_CONFIRM_TRIM_BUTTON");
            A08.A0q("CLIPS_EDITOR_CONFIRM_TRIM_BUTTON");
            C448124l.A00(A08, c448124l);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0M(EnumC50631MWs.A0J, "surface");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0P("segment_duration", Double.valueOf(d));
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0N(AbstractC449424y.A07(c448124l.A00, c448124l.A03), "system_info");
            A08.Cht();
        }
    }

    public final void A0n(double d, double d2, double d3, long j, boolean z) {
        C18920wW c18920wW;
        InterfaceC11380iw interfaceC11380iw;
        C448624q c448624q = this.A0E;
        if (z) {
            c18920wW = c448624q.A02;
        } else {
            c18920wW = c448624q.A01;
        }
        C25531Mh A0A = C25531Mh.A0A(c18920wW);
        if (((AbstractC02600Aj) A0A).A00.isSampled()) {
            A0A.A0M(C81X.A0R, "tool_type");
            A0A.A0s("IG_CAMERA_DEFAULT_TRIM_VIDEO");
            C448624q.A00(A0A, c448624q);
            A0A.A0Q("video_hash_id", Long.valueOf(j));
            A0A.A0P("original_video_length_ms", Double.valueOf(d));
            A0A.A0P("start_time_ms", Double.valueOf(d2));
            A0A.A0P("stop_time_ms", Double.valueOf(d3));
            C22M c22m = c448624q.A04;
            A0A.A0b(c22m.A09);
            A0A.A0W(2);
            if (z) {
                interfaceC11380iw = C22F.A09;
            } else {
                interfaceC11380iw = C22F.A08;
            }
            A0A.A0m(interfaceC11380iw.getModuleName());
            A0A.A0M(c22m.A0C, "surface");
            A0A.Cht();
        }
    }

    public final void A0o(int i) {
        C55U c55u;
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A1K, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_SELECT_LAYOUT_SCALE_MODE");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0C, "surface");
            A00.A8p("scale_mode", Integer.valueOf(i));
            C1810981l c1810981l = c22m.A0E;
            if (c1810981l == null || (c55u = (C55U) c1810981l.A08.A00) == null) {
                c55u = C81U.A00;
            }
            A00.A8R(c55u.A00, "camera_destination");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A0p(int i, String str, int i2) {
        String str2;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_gallery_album_impression");
        if (A00.isSampled()) {
            A00.A8R(A0J(), "camera_destination");
            C22M c22m = super.A04;
            A00.AAP("camera_session_id", c22m.A0L);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A9K("album_index", Long.valueOf(i));
            A00.A8p("entity_type", 34);
            A00.A8R(c22m.A0C, "surface");
            if (i2 != 1) {
                if (i2 != 3) {
                    str2 = "ALBUMS";
                } else {
                    str2 = "MEDIA_TYPES";
                }
            } else {
                str2 = "META";
            }
            A00.AAP("album_category_type", str2);
            A00.AAP("album_name", str);
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(null, "composition_media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A0q(long j, long j2) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A1v, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_REORDER_SEGMENT");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.AAP("module", C22F.A09.getModuleName());
            A00.A9K("prev_index", Long.valueOf(j));
            A00.A9K("new_index", Long.valueOf(j2));
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
            A00.Cht();
        }
    }

    public final void A0r(Pair pair, AnonymousClass249 anonymousClass249, String str, String str2) {
        C447924j c447924j = this.A06;
        C14360o3.A0B(anonymousClass249, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "DELETE_APPLY_STORY_TEMP");
            A00.A0m(str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(((Number) pair.first).intValue()));
            arrayList.add(Long.valueOf(((Number) pair.second).intValue()));
            A00.A0W(2);
            A00.A0R("composition_str_id", str);
            A00.A0M(anonymousClass249, "composition_media_type");
            A00.A0S("draft_position", arrayList);
            A00.A0s("IG_CAMERA_STORIES_DELETE_DRAFT");
            A00.Cht();
        }
    }

    public final void A0s(C5GJ c5gj, EnumC114925Hg enumC114925Hg, EnumC50631MWs enumC50631MWs, VHl vHl, MusicOverlayStickerModel musicOverlayStickerModel, Product product, String str, String str2, int i) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_apply_sticker");
        if (str != null && A00.isSampled()) {
            C22M c22m = super.A04;
            String str3 = c22m.A0L;
            if (str3 != null) {
                if (enumC114925Hg == null) {
                    enumC114925Hg = A0J();
                }
                A00.A8R(enumC114925Hg, "camera_destination");
                A00.AAP("camera_session_id", str3);
                A00.AAP("module", C22F.A08.getModuleName());
                A00.AAP("sticker_id", str);
                A00.A8R(A0I(), "capture_type");
                A00.A8R(enumC50631MWs, "surface");
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A00.A8R(c5gj, "action_source");
                A00.A8R(vHl, "sticker_type");
                A00.A8p("sticker_source", Integer.valueOf(i));
                A00.AAP("browse_session_id", str2);
                if (musicOverlayStickerModel != null) {
                    A00.A9K("audio_asset_id", AbstractC449424y.A08(musicOverlayStickerModel.A0S));
                    A00.AAP("song_name", musicOverlayStickerModel.A0m);
                    A00.AAP("artist_name", musicOverlayStickerModel.A0Y);
                    A00.A8I(TraceFieldType.StartTime, Double.valueOf(musicOverlayStickerModel.A0K.doubleValue()));
                    A00.AAP("product", AbstractC65993Txo.A00(musicOverlayStickerModel.A02));
                    A00.AAP("browse_session_id", musicOverlayStickerModel.A0U);
                    A00.AAP("alacorn_session_id", musicOverlayStickerModel.A0Q);
                }
                if (product != null) {
                    Long A08 = AbstractC449424y.A08(product.A0H);
                    Long A082 = AbstractC449424y.A08(AbstractC76433bn.A00(product.A0B));
                    if (A08 == null) {
                        AbstractC12120kG.A01("IgCameraLoggerImpl", "Invalid product id");
                    }
                    if (A082 == null) {
                        AbstractC12120kG.A01("IgCameraLoggerImpl", "Invalid merchant id");
                    }
                    A00.A9K("product_id", A08);
                    A00.A9K("merchant_id", A082);
                    A00.AAP("product_name", product.A0J);
                }
                A00.AAP("composition_str_id", c22m.A0M);
                A00.A8R(c22m.A0A, "composition_media_type");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.Cht();
                return;
            }
            AbstractC12120kG.A01("IgCameraLoggerImpl", "logApplySticker() cameraSession is null");
        }
    }

    public final void A0t(EnumC46263Kdv enumC46263Kdv, EnumC203578zI enumC203578zI, EnumC50631MWs enumC50631MWs) {
        C448924t c448924t = this.A0H;
        C25531Mh A0B = C25531Mh.A0B(c448924t.A01);
        if (((AbstractC02600Aj) A0B).A00.isSampled()) {
            A0B.A0M(C81X.A1d, "tool_type");
            C448924t.A00(A0B, c448924t);
            A0B.A0a(c448924t.A0J());
            A0B.A0T();
            A0B.A0M(enumC50631MWs, "surface");
            A0B.A0M(enumC203578zI, "surface_element");
            A0B.A0R("product_name", AbstractC65993Txo.A00(MusicProduct.A0G));
            A0B.A0M(c448924t.A0I(), "capture_type");
            A0B.A0N(AbstractC449424y.A07(c448924t.A00, c448924t.A03), "system_info");
            A0B.A0M(enumC46263Kdv, "audio_editor_entry_point");
            A0B.Cht();
        }
    }

    public final void A0u(EnumC193318hB enumC193318hB) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A1h, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_MUSIC_BROWSE_SAVED_AUDIO_TAB_OPEN");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0C, "surface");
            A00.AAP("module", C22F.A08.getModuleName());
            EnumC114925Hg A0J = c448724r.A0J();
            if (A0J == null) {
                A0J = EnumC114925Hg.CLIPS;
            }
            A00.A8R(A0J, "camera_destination");
            A00.A8R(AnonymousClass249.VIDEO, "media_type");
            A00.A8R(enumC193318hB, "capture_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A0v(EnumC223439ta enumC223439ta, String str) {
        String str2;
        C448624q c448624q = this.A0E;
        C14360o3.A0B(str, 1);
        C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
        Long l = null;
        if (enumC223439ta == EnumC223439ta.TEMPLATES) {
            str2 = "";
        } else {
            str2 = str;
            str = null;
        }
        if (((AbstractC02600Aj) A0A).A00.isSampled()) {
            A0A.A0M(C81X.A0o, "tool_type");
            A0A.A0s("IG_CAMERA_CREATE_MODE_SUB_FORMAT_SELECTED");
            C448624q.A00(A0A, c448624q);
            A0A.A0V(1);
            A0A.A0Q("capture_format_index", 0L);
            A0A.A0M(c448624q.A0I(), "capture_type");
            A0A.A0M(enumC223439ta, "create_mode_format");
            C22M c22m = c448624q.A04;
            A0A.A0b(c22m.A09);
            A0A.A0T();
            A0A.A0M(c22m.A0C, "surface");
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            }
            A0A.A0Q("template_id", l);
            A0A.A0m(C22F.A08.getModuleName());
            A0A.A0c(c22m.A0A);
            A0A.A0R("card_id", str2);
            A0A.A0t(C1QM.A00.A02.A00);
            A0A.Cht();
        }
    }

    public final void A0w(EnumC114925Hg enumC114925Hg) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A2U, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_TAP");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.AAP("module", C22F.A09.getModuleName());
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("timeline_entry_point", "EDIT_BUTTON");
            A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
            A00.Cht();
        }
    }

    public final void A0x(EnumC114925Hg enumC114925Hg, double d, double d2, long j) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            if (enumC114925Hg == null) {
                enumC114925Hg = c448724r.A0J();
            }
            A00.A8R(C81X.A32, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_TRIM_SEGMENT");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.AAP("module", C22F.A09.getModuleName());
            if (enumC114925Hg == null) {
                enumC114925Hg = EnumC114925Hg.CLIPS;
            }
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.A7v("is_timeline", true);
            A00.A9K("video_hash_id", Long.valueOf(j));
            A00.A8I("start_time_ms", Double.valueOf(d));
            A00.A8I("stop_time_ms", Double.valueOf(d2));
            A00.Cht();
        }
    }

    public final void A0y(EnumC114925Hg enumC114925Hg, AnonymousClass249 anonymousClass249, EnumC50631MWs enumC50631MWs, String str, String str2) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_tap_capture_button");
        if (A00.isSampled()) {
            C22M c22m = super.A04;
            if (c22m.A0L == null) {
                AbstractC12120kG.A01("IgCameraLoggerImpl", "logTapCaptureButton() cameraSession is null");
            }
            UserSession userSession = super.A03;
            A00.AAk("applied_effect_ids", AbstractC449424y.A0D(str));
            A00.AAk("applied_effect_instance_ids", AbstractC449424y.A0D(str2));
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.AAP("camera_session_id", c22m.A0L);
            A00.A9K("capture_format_index", 0L);
            A00.A8R(A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(anonymousClass249, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            EnumC50631MWs enumC50631MWs2 = c22m.A0B;
            if (enumC50631MWs2 == null) {
                enumC50631MWs2 = enumC50631MWs;
            }
            A00.A8R(enumC50631MWs2, "surface");
            Double valueOf = Double.valueOf(0.0d);
            A00.A8I("time_user_tapped_on_capture_button_in_milliseconds", valueOf);
            A00.A8I("time_user_tapped_on_capture_button_in_seconds", valueOf);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(super.A00, userSession), "system_info");
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
        C448124l c448124l = this.A09;
        C14360o3.A0B(enumC50631MWs, 1);
        C14360o3.A0B(enumC114925Hg, 2);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            C22M c22m2 = c448124l.A04;
            if (c22m2.A0L == null) {
                AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", "logTapCaptureButton() cameraSession is null", null);
            }
            A08.A0s("IG_CAMERA_TAP_CAPTURE_BUTTON");
            A08.A0q("TAP_CAPTURE_BUTTON");
            C448124l.A00(A08, c448124l);
            UserSession userSession2 = c448124l.A03;
            A08.A0S("applied_effect_ids", AbstractC449424y.A0D(str));
            A08.A0S("applied_effect_instance_ids", AbstractC449424y.A0D(str2));
            A08.A0a(enumC114925Hg);
            A08.A0Q("capture_format_index", 0L);
            A08.A0M(c448124l.A0I(), "capture_type");
            A08.A0b(c22m2.A09);
            A08.A0W(2);
            A08.A0c(anonymousClass249);
            A08.A0m(C22F.A08.getModuleName());
            EnumC50631MWs enumC50631MWs3 = c22m2.A0B;
            if (enumC50631MWs3 != null) {
                enumC50631MWs = enumC50631MWs3;
            }
            A08.A0M(enumC50631MWs, "surface");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0N(AbstractC449424y.A07(c448124l.A00, userSession2), "system_info");
            A08.Cht();
        }
    }

    public final void A0z(EnumC114925Hg enumC114925Hg, AnonymousClass249 anonymousClass249, String str) {
        EnumC114925Hg enumC114925Hg2;
        C448024k c448024k = this.A07;
        C14360o3.A0B(anonymousClass249, 2);
        C22M c22m = c448024k.A04;
        c22m.A00 = -1;
        c22m.A0A = anonymousClass249;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "POST_CAPTURE");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_POST_CAPTURE_SESSION");
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            if (enumC114925Hg == null) {
                enumC114925Hg2 = c448024k.A0J();
            } else {
                enumC114925Hg2 = enumC114925Hg;
            }
            A00.A8R(enumC114925Hg2, "camera_destination");
            A00.AAk("camera_tools_struct", c448024k.A0N(0));
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448024k.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            boolean z = true;
            A00.A8p("event_type", 1);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            EnumC50631MWs enumC50631MWs = c22m.A0B;
            if (enumC50631MWs == null) {
                enumC50631MWs = EnumC50631MWs.A0I;
            }
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.AAP("discovery_session_id", c22m.A0O);
            if (str == null) {
                str = "tap";
            }
            A00.AAP("save_method", str);
            A00.AAP("search_session_id", c22m.A0P);
            if (enumC114925Hg != EnumC114925Hg.FEED) {
                z = false;
            }
            A00.A7v("is_panavision", Boolean.valueOf(z));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(c448024k.A03, false)));
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A10(EnumC114925Hg enumC114925Hg, EnumC203578zI enumC203578zI) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A0W, "tool_type");
            A00.A8R(enumC203578zI, "surface_element");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_OPEN_CAMERA_FROM_GALLERY");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(EnumC50631MWs.A0J, "surface");
            boolean z = false;
            if (enumC114925Hg == EnumC114925Hg.FEED) {
                z = true;
            }
            A00.A7v("is_panavision", Boolean.valueOf(z));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A11(EnumC114925Hg enumC114925Hg, EnumC203578zI enumC203578zI, String str, String str2, String str3, int i, int i2, boolean z) {
        C448724r c448724r = this.A0F;
        C14360o3.A0B(enumC114925Hg, 2);
        C22M c22m = c448724r.A04;
        List list = null;
        if (c22m.A0L == null) {
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", "logCameraDialSelect() cameraSession is null", null);
        }
        if (c22m.A0C == null) {
            AbstractC12120kG.A07("IgCameraBaseFalcoLoggerImpl", "logCameraDialSelect() surface is null", null);
        }
        String moduleName = C22F.A08.getModuleName();
        if (i2 == 5) {
            moduleName = "clips_inspiration_hub";
        }
        UserSession userSession = c448724r.A03;
        List A0D = AbstractC449424y.A0D(str);
        List A0D2 = AbstractC449424y.A0D(str2);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A0N, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_DIAL_SELECT");
            String str4 = c22m.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A00.AAP("camera_session_id", str4);
            A00.AAk("applied_effect_ids", A0D);
            A00.AAk("applied_effect_instance_ids", A0D2);
            A00.A8R(enumC114925Hg, "camera_destination");
            int i3 = 2;
            if (c22m.A01 != 2) {
                i3 = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i3));
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A7v("effect_is_saved", Boolean.valueOf(z));
            A00.A8p("effect_source", Integer.valueOf(i2));
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A9K("index", Long.valueOf(i));
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", moduleName);
            A00.A8R(c22m.A0C, "surface");
            A00.AAP("effect_collection", str3);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, userSession), "system_info");
            if (enumC203578zI != null) {
                list = Arrays.asList(enumC203578zI);
            }
            A00.AAk("creative_tool_source", list);
            A00.Cht();
        }
    }

    public final void A14(EnumC114925Hg enumC114925Hg, C81X c81x) {
        C448824s c448824s = this.A0G;
        C14360o3.A0B(enumC114925Hg, 1);
        C18920wW c18920wW = c448824s.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_impression");
        if (A00.isSampled()) {
            A00.A8R(c81x, "tool_type");
            C22M c22m = c448824s.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.AAP("action", "MODIFY");
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A09, "surface");
            A00.A8R(c22m.A0A, "media_type");
            A00.A8R(c448824s.A0I(), "capture_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448824s.A00, c448824s.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A15(EnumC114925Hg enumC114925Hg, C81X c81x) {
        C448824s c448824s = this.A0G;
        C14360o3.A0B(c81x, 0);
        C18920wW c18920wW = c448824s.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_impression");
        if (A00.isSampled()) {
            A00.A8R(c81x, "tool_type");
            C22M c22m = c448824s.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0L, "surface");
            A00.A8R(c22m.A0A, "media_type");
            A00.A8R(c448824s.A0I(), "capture_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448824s.A00, c448824s.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A17(C22P c22p, EnumC50631MWs enumC50631MWs, C1810981l c1810981l, C5JK c5jk, int i) {
        A16(c22p, null, enumC50631MWs, null, c1810981l, c5jk, null, null, null, null, null, null, null, null, null, i, -1);
    }

    public final void A19(MYO myo, Boolean bool, String str, String str2, boolean z) {
        String str3;
        if (str == null) {
            str3 = C22F.A08.getModuleName();
        } else {
            str3 = str;
        }
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_clips_share_to_facebook_primer_selection");
        if (A00.isSampled()) {
            C22M c22m = super.A04;
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.A8R(AnonymousClass249.VIDEO, "media_type");
            A00.A8R(myo, "media_source");
            A00.A8R(A0I(), "capture_type");
            A00.AAP("camera_session_id", c22m.A0L);
            A00.AAP("module", str3);
            A00.A7v("allow_selection", Boolean.valueOf(z));
            A00.A7v("is_crosspost", bool);
            A00.AAP("version", str2);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
        C448724r c448724r = this.A0F;
        C14360o3.A0B(str2, 4);
        C18920wW c18920wW2 = c448724r.A01;
        InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "ig_camera_ui_tool_click");
        if (A002.isSampled()) {
            A002.A8R(C81X.A2H, "tool_type");
            A002.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_SELECTION");
            C22M c22m2 = c448724r.A04;
            String str4 = c22m2.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A002.AAP("camera_session_id", str4);
            A002.A8R(c22m2.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8p("event_type", 2);
            A002.A8R(EnumC50631MWs.A0I, "surface");
            A002.A8R(AnonymousClass249.VIDEO, "media_type");
            A002.A8R(myo, "media_source");
            A002.A8R(c448724r.A0I(), "capture_type");
            if (str == null) {
                str = C22F.A08.getModuleName();
            }
            A002.AAP("module", str);
            A002.A7v("allow_selection", Boolean.valueOf(z));
            A002.A7v("is_crosspost", bool);
            A002.AAP("version", str2);
            A002.AAP("nav_chain", C1QM.A00.A02.A00);
            A002.Cht();
        }
    }

    public final void A1C(EnumC53380NjV enumC53380NjV, C81X c81x) {
        this.A0F.A0V(enumC53380NjV, c81x, "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP", true);
    }

    public final void A1D(EnumC203578zI enumC203578zI) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (c448724r.A0P() && A00.isSampled()) {
            A00.A8R(C81X.A1a, "tool_type");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c448724r.A0J(), "camera_destination");
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A8R(enumC203578zI, "surface_element");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1E(EnumC203578zI enumC203578zI, EnumC50631MWs enumC50631MWs, String str, String str2, String str3, String str4, boolean z) {
        C447924j c447924j = this.A06;
        C18920wW c18920wW = c447924j.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_draft");
        if (A00.isSampled()) {
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "SAVE_CLICK");
            A00.AAQ(c447924j.A0M(), "creation_session_state");
            C22M c22m = c447924j.A04;
            String str5 = c22m.A0L;
            if (str5 == null) {
                str5 = "";
            }
            A00.AAP("camera_session_id", str5);
            A00.A8R(c447924j.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            if (enumC50631MWs != null) {
                A00.A8R(enumC50631MWs, "surface");
            }
            if (str2 != null) {
                A00.AAP("module", str2);
            }
            if (z) {
                A00.A8R(EnumC53336Nim.SPINNABLE_REEL, "spin_type");
            }
            A00.A8p("event_type", 2);
            A00.AAP("composition_str_id", str);
            A00.AAk("camera_tools_struct", c447924j.A0N(0));
            A00.A9K("media_id", c22m.A0I);
            A00.A8R(enumC203578zI, "surface_element");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_DRAFT_SAVE_CLICK");
            A00.AAP("genai_response_id", str3);
            A00.AAP("genai_content_id", str4);
            A00.Cht();
        }
    }

    public final void A1F(EnumC203578zI enumC203578zI, String str) {
        C447924j c447924j = this.A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "DELETE_CLICK");
            A00.A0T();
            A00.A0R("composition_str_id", str);
            A00.A0M(enumC203578zI, "surface_element");
            A00.A0s("IG_CAMERA_DRAFT_DELETE_CLICK");
            A00.Cht();
        }
    }

    public final void A1H(EnumC50631MWs enumC50631MWs) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_sticker_aggregation_page_impression");
        C22M c22m = super.A04;
        String str = c22m.A0L;
        if (A00.isSampled() && A0J() != null && str != null) {
            A00.A8R(A0J(), "camera_destination");
            A00.AAP("camera_session_id", str);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("sticker_id", ReelTappableObjectType.A0e.A00);
            A00.A8p("entity_type", 20);
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1I(EnumC50631MWs enumC50631MWs) {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled() && c448124l.A0J() != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("CLIPS_ADD_YOURS_STICKER_AGGREGATION_PAGE_ENTRY");
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0M(enumC50631MWs, "surface");
            A08.A0m(C22F.A08.getModuleName());
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A08.A0V(i);
            A08.A0Q("capture_format_index", 0L);
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A1J(EnumC50631MWs enumC50631MWs, int i, int i2) {
        C448724r c448724r = this.A0F;
        C14360o3.A0B(enumC50631MWs, 2);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (c448724r.A0P() && A00.isSampled()) {
            A00.A8R(C81X.A2p, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TEXT_COLOR_SELECTED");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A9K("color_source", Long.valueOf(i2));
            A00.AAP("color", AbstractC13950nL.A0G(i));
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(enumC50631MWs, "surface");
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1K(EnumC50631MWs enumC50631MWs, VHl vHl, String str, ArrayList arrayList) {
        C448624q c448624q = this.A0E;
        C14360o3.A0B(enumC50631MWs, 0);
        C14360o3.A0B(str, 1);
        C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
        if (((AbstractC02600Aj) A0A).A00.isSampled()) {
            A0A.A0M(C81X.A2W, "tool_type");
            C448624q.A00(A0A, c448624q);
            C22M c22m = c448624q.A04;
            A0A.A0b(c22m.A09);
            A0A.A0M(c448624q.A0I(), "capture_type");
            A0A.A0b(c22m.A09);
            A0A.A0W(2);
            A0A.A0m(C22F.A08.getModuleName());
            A0A.A0M(enumC50631MWs, "surface");
            A0A.A0R("sticker_id", str);
            A0A.A0M(vHl, "sticker_type");
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A0A.A0V(i);
            A0A.A0R("composition_str_id", c22m.A0M);
            A0A.A0a(c448624q.A0J());
            A0A.A0t(C1QM.A00.A02.A00);
            A0A.A0S("sticker_filters", arrayList);
            A0A.Cht();
        }
    }

    public final void A1L(EnumC50631MWs enumC50631MWs, EnumC185288Jt enumC185288Jt, String str, List list, boolean z) {
        EnumC50631MWs enumC50631MWs2 = enumC50631MWs;
        C448124l c448124l = this.A09;
        if (enumC50631MWs == null) {
            enumC50631MWs2 = super.A04.A0C;
        }
        c448124l.A0R(null, super.A04.A0A, null, enumC50631MWs2, A00(enumC185288Jt), null, null, null, str, null, this.A03.A07, list, z, false);
    }

    public final void A1N(EnumC50631MWs enumC50631MWs, Boolean bool, String str) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_clips_nux_tooltip_impression");
        if (A00.isSampled()) {
            A00.AAP("camera_session_id", super.A04.A0L);
            A00.AAP("module", str);
            A00.A8R(enumC50631MWs, "surface");
            A00.A8p("entity_type", 12);
            A00.A7v("is_crosspost", bool);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1P(EnumC50631MWs enumC50631MWs, Boolean bool, String str, String str2) {
        C448024k c448024k = this.A07;
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(enumC50631MWs, 2);
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "STICKER_EDIT");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_STICKER_EDIT_SESSION");
            C22M c22m = c448024k.A04;
            String str3 = c22m.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A00.AAP("camera_session_id", str3);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 1);
            A00.AAP("module", str2);
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("sticker_id", str);
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(c448024k.A03, false)));
            A00.A7v("ads_mode_boost_story_enabled", bool);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A1Q(EnumC50631MWs enumC50631MWs, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        StringBuilder sb;
        String str8;
        String str9 = str7;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ar_effect_applied");
        C22M c22m = super.A04;
        String str10 = c22m.A0L;
        if (A00.isSampled() && str10 != null) {
            ArrayList arrayList = new ArrayList();
            if (str3 != null) {
                arrayList.add(str3);
            }
            String str11 = str;
            Long A08 = AbstractC449424y.A08(str11);
            if (A08 == null) {
                sb = new StringBuilder();
                str8 = "Effect Id is invalid value : ";
            } else {
                str11 = str2;
                Long A082 = AbstractC449424y.A08(str11);
                if (A082 == null) {
                    sb = new StringBuilder();
                    str8 = "EffectInstanceId is invalid value : ";
                } else {
                    String moduleName = C22F.A08.getModuleName();
                    if (i4 == 5) {
                        moduleName = "clips_inspiration_hub";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(A08, Long.valueOf(i2));
                    int i5 = 2;
                    if (i != 2) {
                        i5 = 1;
                    }
                    A00.AAk("applied_effect_ids", Collections.singletonList(A08));
                    A00.AAk("applied_effect_instance_ids", Collections.singletonList(A082));
                    A00.AAk("attribution_ids", arrayList);
                    A00.A8p("camera_position", Integer.valueOf(i5));
                    A00.AAP("camera_session_id", str10);
                    A00.A8R(A0J(), "camera_destination");
                    A00.AAk("camera_tools", A0O(null, null, null, false, false));
                    A00.AAk("camera_tools_struct", A0N(0));
                    A00.A9K("capture_format_index", 0L);
                    A00.A8R(A0I(), "capture_type");
                    A00.A9M("effect_indices", hashMap);
                    A00.A7v("effect_is_saved", Boolean.valueOf(z));
                    A00.A8p("effect_source", Integer.valueOf(i4));
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("event_type", 2);
                    A00.A7v("is_initial_product", bool);
                    A00.A8R(c22m.A0A, "media_type");
                    A00.AAP("module", moduleName);
                    A00.A8R(enumC50631MWs, "surface");
                    A00.AAk("attribution_usernames", Arrays.asList(str4));
                    A00.AAP("discovery_session_id", c22m.A0O);
                    A00.A7v("during_recording", null);
                    if (str7 == null) {
                        str9 = "";
                    }
                    A00.AAP("effect_collection", str9);
                    A00.A9K("merchant_id", AbstractC449424y.A08(str5));
                    A00.A9K("product_id", AbstractC449424y.A08(str6));
                    A00.AAP("retailer_product_id", null);
                    A00.AAP("search_session_id", c22m.A0P);
                    A00.AAP("composition_str_id", c22m.A0M);
                    A00.A8R(c22m.A0A, "composition_media_type");
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
                    if (enumC50631MWs == EnumC50631MWs.A0I) {
                        A00.A8R(AbstractC449424y.A03(i3), "media_source");
                    }
                    EnumC174597pt enumC174597pt = c22m.A06;
                    if (enumC174597pt != null) {
                        A00.A8R(enumC174597pt, "folding_state");
                    }
                    if (list != null) {
                        A00.AAk("creative_tool_source", list);
                    }
                    A00.A7v("ads_mode_boost_story_enabled", Boolean.valueOf(z2));
                    A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                    A00.AAP("device_fold_state", AbstractC82683mW.A00);
                    A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                    A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                    A00.Cht();
                    return;
                }
            }
            sb.append(str8);
            sb.append(str11);
            AbstractC12120kG.A01("IgCameraLoggerImpl", sb.toString());
        }
    }

    public final void A1T(EnumC50631MWs enumC50631MWs, String str, String str2) {
        C448524p c448524p = this.A0D;
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(enumC50631MWs, 2);
        C18920wW c18920wW = c448524p.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
        if (A00.isSampled()) {
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_START_STICKER_EDIT_SESSION");
            A00.AAP("entity", "STICKER_EDIT");
            C22M c22m = c448524p.A04;
            String str3 = c22m.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A00.AAP("camera_session_id", str3);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 1);
            A00.AAP("module", str2);
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("sticker_id", str);
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(c448524p.A03, false)));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A1U(EnumC50631MWs enumC50631MWs, String str, String str2, String str3, String str4) {
        C18920wW c18920wW = super.A01;
        C12180kM c12180kM = c18920wW.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c12180kM, "ig_camera_share_sheet_entity_impression");
        C22M c22m = super.A04;
        String str5 = c22m.A0L;
        if (A00.isSampled()) {
            A00.A8R(A0J(), "camera_destination");
            A00.AAP("camera_session_id", str5);
            A00.A8p("entity_type", 48);
            A00.AAP("module", str4);
            if (str == null) {
                str = c22m.A0M;
            }
            A00.AAP("composition_str_id", str);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
        InterfaceC02590Ai A002 = c18920wW.A00(c12180kM, "ig_nme_benefits");
        if (A002.isSampled()) {
            A002.AAP("event_type", "impression");
            A002.AAP("benefit_type", "BIZ_LINKS_IN_REELS");
            A002.AAP("subject_type", "subscriber");
            A002.AAP("object_type", str3);
            A002.A9K("pbs_owner_id", Long.valueOf(Long.parseLong(str2)));
            A002.AAP("surface", "ig_reels_publish_page");
            A002.Cht();
        }
    }

    public final void A1V(EnumC50631MWs enumC50631MWs, String str, String str2, String str3, String str4, String str5) {
        C448124l c448124l = this.A09;
        C14360o3.A0B(str5, 3);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0M(enumC50631MWs, "surface");
            A08.A0m(str5);
            A08.A0c(c22m.A0A);
            if (str2 == null) {
                str2 = c22m.A0M;
            }
            A08.A0R("composition_str_id", str2);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0O("is_panavision", false);
            A08.A0O("is_timeline", false);
            A08.Cht();
        }
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_nme_benefits");
        if (A00.isSampled()) {
            A00.AAP("event_type", "click");
            A00.AAP("benefit_type", "BIZ_LINKS_IN_REELS");
            A00.AAP("subject_type", "subscriber");
            A00.AAP("object_type", str4);
            A00.A9K("pbs_owner_id", Long.valueOf(Long.parseLong(str3)));
            A00.AAP("surface", "ig_reels_publish_page");
            A00.Cht();
        }
    }

    public final void A1W(EnumC50631MWs enumC50631MWs, String str, String str2, boolean z, boolean z2) {
        C448724r c448724r = this.A0F;
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A2A, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_ACCESS_SETTINGS");
            C22M c22m = c448724r.A04;
            String str3 = c22m.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A00.AAP("camera_session_id", str3);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", str);
            A00.A8R(enumC50631MWs, "surface");
            A00.A7v("is_crosspost", Boolean.valueOf(z));
            A00.AAP("text_variant", str2);
            A00.A7v("allow_selection", Boolean.valueOf(z2));
            A00.Cht();
        }
    }

    public final void A1X(C24H c24h, String str, String str2) {
        C448124l c448124l = this.A09;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c24h, 1);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        C22M c22m = c448124l.A04;
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (((AbstractC02600Aj) A08).A00.isSampled() && c448124l.A0J() != null && enumC50631MWs != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str2);
            C448124l.A00(A08, c448124l);
            A08.A0a(EnumC114925Hg.CLIPS);
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0M(enumC50631MWs, "surface");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0Q("clips_template_media_id", AbstractC003100w.A0k(10, str));
            A08.A0M(c24h, "template_browser_entry_point");
            A08.Cht();
        }
    }

    public final void A1Y(C81X c81x) {
        this.A0F.A0V(null, c81x, "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP", false);
    }

    public final void A1Z(C81X c81x) {
        C448924t c448924t = this.A0H;
        C25531Mh A0B = C25531Mh.A0B(c448924t.A01);
        if (((AbstractC02600Aj) A0B).A00.isSampled()) {
            A0B.A0M(c81x, "tool_type");
            C448924t.A00(A0B, c448924t);
            A0B.A0a(c448924t.A0J());
            A0B.A0T();
            A0B.A0M(EnumC50631MWs.A0L, "surface");
            A0B.A0M(c448924t.A0I(), "capture_type");
            A0B.A0N(AbstractC449424y.A07(c448924t.A00, c448924t.A03), "system_info");
            A0B.Cht();
        }
    }

    public final void A1a(C81X c81x) {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("CAMERA_TOOL_APPLIED");
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0M(c22m.A0C, "surface");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0M(c81x, "camera_tool");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A1b(C55U c55u) {
        C448424o c448424o = this.A0C;
        C14360o3.A0B(c55u, 0);
        C18920wW c18920wW = c448424o.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_nux");
        if (A00.isSampled() && c448424o.A0Q("logArEffectBoostToast()")) {
            C22M c22m = c448424o.A04;
            if (c22m.A0C == null) {
                C18950wb.A00.AEp(AnonymousClass001.A0R("surface is null,  userSessionId = ", c448424o.A03.token), 817892914).report();
                return;
            }
            A00.AAP("entity", "AR_EFFECT_BOOST_SHOW");
            A00.AAP("nux_step", "OPEN");
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_AR_EFFECT_BOOST_TOAST");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c55u.A00, "camera_destination");
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c448424o.A0I(), "capture_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1c(C55U c55u) {
        C448724r c448724r = this.A0F;
        C14360o3.A0B(c55u, 0);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (c448724r.A0P() && A00.isSampled()) {
            A00.A8R(C81X.A0X, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TAP_SETTINGS_BUTTON");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c55u.A00, "camera_destination");
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.AAP("discovery_session_id", c22m.A0O);
            A00.AAP("search_session_id", c22m.A0P);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A1d(C81W c81w, String str) {
        C448024k c448024k = this.A07;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "GENAI");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_GENAI_SESSION");
            C22M c22m = c448024k.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c448024k.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("magicmod_session_id", str);
            A00.A8p("genai_exit_point", 1);
            List singletonList = Collections.singletonList(C22F.A0E(c81w, c22m.A0E, 0));
            C14360o3.A07(singletonList);
            A00.AAk("camera_tools_struct", singletonList);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A1e(C81W c81w, String str) {
        C448524p c448524p = this.A0D;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = c448524p.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
        if (A00.isSampled()) {
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_START_GENAI_SESSION");
            A00.AAP("entity", "GENAI");
            C22M c22m = c448524p.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c448524p.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("magicmod_session_id", str);
            A00.A8p("genai_entry_point", 1);
            List singletonList = Collections.singletonList(C22F.A0E(c81w, c22m.A0E, 0));
            C14360o3.A07(singletonList);
            A00.AAk("camera_tools_struct", singletonList);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A1f(C81W c81w, String str, int i) {
        C448024k c448024k = this.A07;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            A00.AAP("entity", "GENAI");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_GENAI_SESSION");
            C22M c22m = c448024k.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c448024k.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("magicmod_session_id", str);
            A00.A8p("genai_exit_point", Integer.valueOf(i));
            List singletonList = Collections.singletonList(C22F.A0E(c81w, c22m.A0E, 0));
            C14360o3.A07(singletonList);
            A00.AAk("camera_tools_struct", singletonList);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A1g(C81W c81w, String str, int i) {
        C448524p c448524p = this.A0D;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = c448524p.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
        if (A00.isSampled()) {
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_START_GENAI_SESSION");
            A00.AAP("entity", "GENAI");
            C22M c22m = c448524p.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c448524p.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("magicmod_session_id", str);
            A00.A8p("genai_entry_point", Integer.valueOf(i));
            List singletonList = Collections.singletonList(C22F.A0E(c81w, c22m.A0E, 0));
            C14360o3.A07(singletonList);
            A00.AAk("camera_tools_struct", singletonList);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A1h(VoiceOption voiceOption) {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A02);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("TEXT_TO_SPEECH_VOICE");
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0U();
            A08.A0m(C22F.A09.getModuleName());
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A08.A0V(i);
            A08.A0Q("capture_format_index", 0L);
            A08.A0c(AnonymousClass249.VIDEO);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0R("text_to_speech_voice", AbstractC449424y.A0A(voiceOption));
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A1i(MusicAssetModel musicAssetModel, String str, String str2) {
        String str3;
        String str4;
        String str5;
        C448624q c448624q = this.A0E;
        C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
        if (((AbstractC02600Aj) A0A).A00.isSampled()) {
            A0A.A0M(C81X.A2M, "tool_type");
            A0A.A0s("IG_CAMERA_SONG_ISRC_LOADED");
            C448624q.A00(A0A, c448624q);
            A0A.A0b(c448624q.A04.A09);
            A0A.A0W(1);
            A0A.A0M(EnumC50631MWs.A0J, "surface");
            A0A.A0m(C22F.A08.getModuleName());
            A0A.A0a(EnumC114925Hg.CLIPS);
            String str6 = null;
            if (musicAssetModel != null) {
                str3 = musicAssetModel.A0E;
            } else {
                str3 = null;
            }
            A0A.A0Q("audio_asset_id", AbstractC449424y.A08(str3));
            if (musicAssetModel != null) {
                str4 = musicAssetModel.A0B;
            } else {
                str4 = null;
            }
            A0A.A0Q("audio_cluster_id", AbstractC449424y.A08(str4));
            A0A.A0R("load_isrc_result", str);
            A0A.A0R("isrc", str2);
            if (musicAssetModel != null) {
                str5 = musicAssetModel.A0D;
            } else {
                str5 = null;
            }
            A0A.A0R("artist_name", str5);
            if (musicAssetModel != null) {
                str6 = musicAssetModel.A0I;
            }
            A0A.A0R("song_name", str6);
            A0A.Cht();
        }
    }

    public final void A1j(Long l, String str, String str2) {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0U();
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0Q("audience_list_id", l);
            A08.A0R("audience_list_name", str2);
            A08.Cht();
        }
    }

    public final void A1k(Long l, String str, String str2, int i) {
        String str3;
        C22M c22m = super.A04;
        List list = c22m.A0X;
        if (!list.contains(str)) {
            list.add(str);
            C18920wW c18920wW = super.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_sticker_impression");
            if (A00.isSampled() && (str3 = c22m.A0L) != null) {
                A00.A8R(A0J(), "camera_destination");
                A00.AAP("camera_session_id", str3);
                A00.AAP("module", C22F.A08.getModuleName());
                A00.AAP("sticker_id", str);
                if (i == Integer.MIN_VALUE) {
                    i = c22m.A03;
                }
                A00.A8p("sticker_source", Integer.valueOf(i));
                A00.A8p("entity_type", 1);
                A00.A8R(c22m.A0C, "surface");
                A00.AAP("sticker_tray_session_id", c22m.A0U);
                A00.AAP("composition_str_id", c22m.A0M);
                A00.A8R(c22m.A0A, "composition_media_type");
                A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(super.A03, false)));
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.A9K("position", l);
                A00.AAP("sticker_action_type", str2);
                A00.Cht();
            }
        }
    }

    public final void A1l(String str) {
        C18920wW c18920wW = this.A05.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "avatar_effect_load_success");
        if (A00.isSampled()) {
            HashMap hashMap = new HashMap();
            hashMap.put("surface", str);
            A00.A9M("extra_client_data", hashMap);
            A00.Cht();
        }
    }

    public final void A1m(String str) {
        A1R(super.A04.A0C, str);
    }

    public final void A1n(String str) {
        C448624q c448624q = this.A0E;
        C25531Mh A0A = C25531Mh.A0A(c448624q.A02);
        if (((AbstractC02600Aj) A0A).A00.isSampled()) {
            A0A.A0M(C81X.A32, "tool_type");
            A0A.A0s("IG_CAMERA_CLIPS_LAYER_TIME_EDIT");
            C448624q.A00(A0A, c448624q);
            C22M c22m = c448624q.A04;
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A0A.A0V(i);
            A0A.A0M(c448624q.A0I(), "capture_type");
            A0A.A0b(c22m.A09);
            A0A.A0T();
            A0A.A0m(C22F.A09.getModuleName());
            A0A.A0U();
            A0A.A0Q("capture_format_index", 0L);
            A0A.A0R("discovery_session_id", c22m.A0O);
            A0A.A0c(AnonymousClass249.VIDEO);
            A0A.A0R("search_session_id", c22m.A0P);
            A0A.A0t(C1QM.A00.A02.A00);
            A0A.A0R("timeline_element", str);
            A0A.Cht();
        }
    }

    public final void A1o(String str) {
        C448124l c448124l = this.A09;
        C14360o3.A0B(str, 0);
        C22M c22m = c448124l.A04;
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (c448124l.A0J() != null && enumC50631MWs != null) {
            C25531Mh A08 = C25531Mh.A08(c448124l.A01);
            if (((AbstractC02600Aj) A08).A00.isSampled()) {
                A08.A0s("IG_CAMERA_ENTITY_TAP");
                A08.A0q("SHARE_SHEET_AUDIENCE_ROW_TAP");
                C448124l.A00(A08, c448124l);
                A08.A0a(c448124l.A0J());
                A08.A0b(c22m.A09);
                A08.A0T();
                A08.A0M(enumC50631MWs, "surface");
                A08.A0m(str);
                A08.A0c(c22m.A0A);
                A08.A0R("composition_str_id", c22m.A0M);
                A08.A0t(C1QM.A00.A02.A00);
                A08.Cht();
            }
        }
    }

    public final void A1p(String str) {
        C447924j c447924j = this.A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "DELETE_APPLIED");
            A00.A0W(1);
            A00.A0R("composition_str_id", str);
            A00.A0s("IG_CAMERA_DRAFT_DELETE_SUCCESS");
            A00.Cht();
        }
    }

    public final void A1q(String str) {
        C447924j c447924j = this.A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "RENAME_CLICK");
            A00.A0T();
            A00.A0R("composition_str_id", str);
            A00.A0s("IG_CAMERA_DRAFT_RENAME_CLICK");
            A00.Cht();
        }
    }

    public final void A1r(String str) {
        C447924j c447924j = this.A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "RENAME_APPLIED");
            A00.A0T();
            A00.A0R("composition_str_id", str);
            A00.A0s("IG_CAMERA_DRAFT_RENAME_SUCCESS");
            A00.Cht();
        }
    }

    public final void A1s(String str) {
        C447924j c447924j = this.A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "RESTORE_CLICK");
            A00.A0W(2);
            A00.A0R("composition_str_id", str);
            A00.A0s("IG_CAMERA_DRAFT_RESTORE_CLICK");
            A00.Cht();
        }
    }

    public final void A1t(String str) {
        C447924j c447924j = this.A06;
        C25531Mh A07 = C25531Mh.A07(c447924j.A01);
        if (((AbstractC02600Aj) A07).A00.isSampled()) {
            C25531Mh A00 = C447924j.A00(A07, c447924j, "RESTORE_APPLIED");
            A00.A0W(2);
            A00.A0R("composition_str_id", str);
            A00.A0s("IG_CAMERA_DRAFT_RESTORE_SUCCESS");
            A00.Cht();
        }
    }

    public final void A1u(String str) {
        C448524p c448524p = this.A0D;
        C22M c22m = c448524p.A04;
        c22m.A0C = EnumC50631MWs.A0J;
        c22m.A0M = str;
        c22m.A0K = UUID.randomUUID().toString();
        C18920wW c18920wW = c448524p.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
        if (A00.isSampled()) {
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_START_PRE_CAPTURE_SESSION");
            A00.AAP("entity", "PRE_CAPTURE");
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c448524p.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("module", C22F.A08.getModuleName());
            EnumC50631MWs enumC50631MWs = c22m.A0B;
            if (enumC50631MWs == null) {
                enumC50631MWs = c22m.A0C;
            }
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("composition_str_id", str);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448524p.A00, c448524p.A03), "system_info");
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            C3o9 c3o9 = c22m.A0G;
            if (c3o9 != null) {
                A00.AAP("open_thread_id", AbstractC43827JZq.A01(c3o9));
                A00.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(c3o9));
                A00.A7v("is_e2ee", Boolean.valueOf(JRE.A09(c3o9)));
            }
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A1v(String str) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A2m, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TEXT_ALIGNMENT_SELECTED");
            C22M c22m = c448724r.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("alignment", str);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1w(String str) {
        C448724r c448724r = this.A0F;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A2n, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TEXT_ANIMATION_SELECTED");
            C22M c22m = c448724r.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.AAP("animation", str);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1x(String str, long j, long j2, long j3, boolean z) {
        AnonymousClass249 anonymousClass249;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_gallery_multi_unselect_media");
        if (A00.isSampled()) {
            if (z) {
                anonymousClass249 = AnonymousClass249.VIDEO;
            } else {
                anonymousClass249 = AnonymousClass249.PHOTO;
            }
            A00.A8R(anonymousClass249, "media_type");
            A00.A9K("media_width", Long.valueOf(j));
            A00.A9K("media_height", Long.valueOf(j2));
            A00.AAP("album_title", str);
            A00.A9K("media_index", Long.valueOf(j3));
            A00.A8R(A0J(), "camera_destination");
            C22M c22m = super.A04;
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            A00.AAP("camera_session_id", c22m.A0L);
            A00.AAP("module", C22F.A08.getModuleName());
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(A0I(), "capture_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A1y(String str, String str2, long j, long j2, long j3, boolean z) {
        AnonymousClass249 anonymousClass249;
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_gallery_multi_select_media");
        if (A00.isSampled()) {
            if (z) {
                anonymousClass249 = AnonymousClass249.VIDEO;
            } else {
                anonymousClass249 = AnonymousClass249.PHOTO;
            }
            A00.A8R(anonymousClass249, "media_type");
            A00.A9K("media_width", Long.valueOf(j));
            A00.A9K("media_height", Long.valueOf(j2));
            A00.AAP("album_title", str);
            A00.A9K("media_index", Long.valueOf(j3));
            A00.A8R(A0J(), "camera_destination");
            C22M c22m = super.A04;
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            A00.AAP("camera_session_id", c22m.A0L);
            A00.AAP("module", C22F.A08.getModuleName());
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(A0I(), "capture_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
            A00.A8R(c22m.A0D, "template_browser_entry_point");
            A00.A9K("clips_template_media_id", c22m.A0H);
            A00.AAP("template_browser_section", c22m.A0V);
            A00.AAP("user_behavior", str2);
            A00.Cht();
        }
    }

    public final void A1z(String str, String str2, String str3) {
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0L;
        AnonymousClass249 anonymousClass249 = super.A04.A0A;
        List singletonList = Collections.singletonList(C22F.A0F(str3));
        this.A09.A0R(null, anonymousClass249, null, enumC50631MWs, null, null, null, C22F.A0F(str2), str, null, null, singletonList, false, false);
    }

    public final void A20(String str, String str2, String str3, String str4) {
        AnonymousClass249 anonymousClass249;
        C448024k c448024k = this.A07;
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(str4, 4);
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (A00.isSampled()) {
            int i = 1;
            if (str3.equals("back")) {
                i = 2;
            }
            A00.AAP("entity", "ADD_CALL_TO_ACTION");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_ADD_CALL_TO_ACTION_SESSION");
            C22M c22m = c448024k.A04;
            String str5 = c22m.A0L;
            if (str5 == null) {
                str5 = "";
            }
            A00.AAP("camera_session_id", str5);
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(c448024k.A0I(), "capture_type");
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("link_type", str2);
            if (str4.equals("IGMediaTypePhoto")) {
                anonymousClass249 = AnonymousClass249.PHOTO;
            } else if (str4.equals("IGMediaTypeVideo")) {
                anonymousClass249 = AnonymousClass249.VIDEO;
            } else {
                anonymousClass249 = AnonymousClass249.OTHER;
            }
            A00.A8R(anonymousClass249, "media_type");
            A00.AAP("module", str);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.Cht();
        }
    }

    public final void A21(String str, List list, int i, int i2, int i3, boolean z) {
        String str2;
        String str3;
        if (z) {
            str = AnonymousClass001.A0O("Personalized", str.hashCode());
        }
        C448724r c448724r = this.A0F;
        C14360o3.A0B(str, 2);
        C14360o3.A0B(list, 5);
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        A00.A8R(C81X.A13, "tool_type");
        A00.AAP("legacy_falco_event_name", "IG_CAMERA_ALBUM_PICKER_TAP_ALBUM");
        C22M c22m = c448724r.A04;
        String str4 = c22m.A0L;
        if (str4 == null) {
            str4 = "";
        }
        A00.AAP("camera_session_id", str4);
        if (i3 == 3) {
            str2 = "media_type_album";
        } else if (i3 == 1) {
            str2 = "remote_album";
        } else {
            switch (i2) {
                case -10:
                case -9:
                case Process.SD_BLACK_HOLE /* -3 */:
                case -2:
                case -1:
                    str2 = "android_default_album";
                    break;
                case -8:
                case -7:
                case -6:
                    str2 = "android_instagram_album";
                    break;
                case Process.SD_STDOUT /* -5 */:
                    str2 = "android_external";
                    break;
                case Process.SD_PIPE /* -4 */:
                default:
                    str2 = "android_other_album";
                    break;
            }
        }
        A00.AAP("album_category", str2);
        if (i3 != 1) {
            if (i3 != 3) {
                str3 = "ALBUMS";
            } else {
                str3 = "MEDIA_TYPES";
            }
        } else {
            str3 = "META";
        }
        A00.AAP("album_category_type", str3);
        A00.A9K("album_index", Long.valueOf(i));
        A00.AAP("album_entrypoint", "ALBUM_PICKER");
        A00.AAP("album_name", str);
        A00.A8R(c448724r.A0J(), "camera_destination");
        A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.A8p("event_type", 2);
        A00.A8R(c22m.A0A, "media_type");
        A00.AAP("module", C22F.A08.getModuleName());
        A00.A8R(EnumC50631MWs.A0J, "surface");
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.A7v("has_rbs_folder", Boolean.valueOf(C22F.A0H(list)));
        A00.Cht();
    }

    public final void A23(List list) {
        C448524p c448524p = this.A0D;
        C14360o3.A0B(list, 0);
        C18920wW c18920wW = c448524p.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
        if (A00.isSampled()) {
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_OPEN_ALBUM_PICKER");
            A00.AAP("entity", "GALLERY_ALBUM_OPEN");
            C22M c22m = c448524p.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c448524p.A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.A9K("total_album_count", Long.valueOf(list.size()));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("has_rbs_folder", Boolean.valueOf(C22F.A0H(list)));
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A24(List list) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_editing_tool_impression");
        if (A0P() && A00.isSampled()) {
            A00.A8R(A0J(), "camera_destination");
            C22M c22m = super.A04;
            A00.AAP("camera_session_id", c22m.A0L);
            A00.A8p("entity_type", 32);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.AAP("composition_str_id", c22m.A0M);
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAk("camera_editing_tool", list);
            A00.Cht();
        }
    }

    public final void A25(List list, String str) {
        AnonymousClass249 anonymousClass249;
        C448524p c448524p = this.A0D;
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = c448524p.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_start_session");
        if (c448524p.A0P() && A00.isSampled()) {
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_START_ADD_CALL_TO_ACTION_SESSION");
            A00.AAP("entity", "ADD_CALL_TO_ACTION");
            C22M c22m = c448524p.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            int i = 2;
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.AAk("candidate_link_types", list);
            A00.A8R(c448524p.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            if (str.equals("IGMediaTypePhoto")) {
                anonymousClass249 = AnonymousClass249.PHOTO;
            } else if (str.equals("IGMediaTypeVideo")) {
                anonymousClass249 = AnonymousClass249.VIDEO;
            } else {
                anonymousClass249 = AnonymousClass249.OTHER;
            }
            A00.A8R(anonymousClass249, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    public final void A28(boolean z) {
        String str;
        C448124l c448124l = this.A09;
        String moduleName = C22F.A08.getModuleName();
        C14360o3.A0B(moduleName, 0);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            if (z) {
                str = "ZOOM_IN";
            } else {
                str = "ZOOM_OUT";
            }
            A08.A0q(str);
            C448124l.A00(A08, c448124l);
            A08.A0a(EnumC114925Hg.FEED);
            A08.A0b(c448124l.A04.A09);
            A08.A0T();
            A08.A0U();
            A08.A0c(AnonymousClass249.ALBUM);
            A08.A0M(MYO.GALLERY, "media_source");
            A08.A0m(moduleName);
            A08.A0M(EnumC193318hB.A03, "capture_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
        }
    }

    public final void A29(boolean z) {
        C448124l c448124l = this.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (c448124l.A0P() && ((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("TRANSFORMED");
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0W(2);
            A08.A0M(EnumC50631MWs.A0I, "surface");
            A08.A0m(C22F.A08.getModuleName());
            A08.A0c(c22m.A0A);
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0O("is_timeline", Boolean.valueOf(z));
            A08.Cht();
        }
    }

    public final void A2A(boolean z, boolean z2) {
        String str;
        EnumC50631MWs enumC50631MWs;
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (c448724r.A0P() && A00.isSampled()) {
            if (z2) {
                str = "clips_postcapture_camera";
            } else {
                str = "trim_editor";
            }
            C81X c81x = C81X.A22;
            A00.A8R(c81x, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_SELECT_TOOL");
            C22M c22m = c448724r.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", str);
            if (z) {
                enumC50631MWs = EnumC50631MWs.A0I;
            } else {
                enumC50631MWs = EnumC50631MWs.A0J;
            }
            A00.A8R(enumC50631MWs, "surface");
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.A8R(c81x, "camera_tool");
            A00.AAk("camera_tools_struct", c448724r.A0N(0));
            A00.A9K("selected_index", 1L);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    public final void A0S() {
        AbstractC11060iN.A00(super.A03).EHW(A01(this, "ig_camera_clips_draft_picked"));
        A0J();
    }

    public final void A0g() {
        EnumC114925Hg A0J = A0J();
        if (A0J == null) {
            AbstractC12120kG.A01("IgCameraLoggerImpl", "Missing camera destination when attempting to log postcap effect button shown");
            return;
        }
        Long valueOf = Long.valueOf(A0J.A00);
        java.util.Set set = super.A04.A0Y;
        if (set.contains(valueOf)) {
            return;
        }
        set.add(valueOf);
    }

    public final void A0h() {
        if (A0J() != null) {
            A08(EnumC50631MWs.A0I, this, "TIMELINE_BACK_TO_POSTCAP_TAP", true);
        }
    }

    public final void A12(EnumC114925Hg enumC114925Hg, EnumC50631MWs enumC50631MWs, VHl vHl, String str, String str2, boolean z, boolean z2) {
        C18920wW c18920wW;
        C18920wW c18920wW2;
        InterfaceC11380iw interfaceC11380iw;
        InterfaceC11380iw interfaceC11380iw2;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        if (z) {
            c18920wW = super.A02;
        } else {
            c18920wW = super.A01;
        }
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_remove_sticker");
        if (enumC114925Hg == null) {
            enumC114925Hg = A0J();
        }
        if (A00.isSampled()) {
            C22M c22m = super.A04;
            String str3 = c22m.A0L;
            if (str3 != null) {
                A00.AAP("sticker_id", str);
                A00.A8R(vHl, "sticker_type");
                A00.A8R(enumC114925Hg, "camera_destination");
                A00.AAP("camera_session_id", str3);
                A00.A8R(enumC50631MWs, "surface");
                A00.A8R(A0I(), "capture_type");
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (z) {
                    interfaceC11380iw2 = C22F.A09;
                } else {
                    interfaceC11380iw2 = C22F.A08;
                }
                A00.AAP("module", interfaceC11380iw2.getModuleName());
                A00.AAP("delete_variant", str2);
                A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(super.A03, false)));
                A00.A7v("ads_mode_boost_story_enabled", Boolean.valueOf(z2));
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.Cht();
            } else {
                AbstractC12120kG.A01("IgCameraLoggerImpl", "logRemoveSticker() cameraSession is null");
            }
        }
        C448924t c448924t = this.A0H;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC50631MWs, 2);
        if (z) {
            c18920wW2 = c448924t.A02;
        } else {
            c18920wW2 = c448924t.A01;
        }
        C25531Mh A0B = C25531Mh.A0B(c18920wW2);
        if (((AbstractC02600Aj) A0B).A00.isSampled()) {
            A0B.A0M(C81X.A2V, "tool_type");
            A0B.A0s("IG_CAMERA_REMOVE_STICKER");
            C448924t.A00(A0B, c448924t);
            int length = str.length();
            boolean z3 = false;
            if (length == 0) {
                z3 = true;
            }
            String str4 = str;
            if (z3) {
                str4 = "unknown";
            }
            A0B.A0R("sticker_id", str4);
            A0B.A0M(vHl, "sticker_type");
            if (enumC114925Hg == null) {
                enumC114925Hg = c448924t.A0J();
            }
            A0B.A0a(enumC114925Hg);
            A0B.A0M(enumC50631MWs, "surface");
            A0B.A0M(c448924t.A0I(), "capture_type");
            if (z) {
                interfaceC11380iw = C22F.A09;
            } else {
                interfaceC11380iw = C22F.A08;
            }
            A0B.A0m(interfaceC11380iw.getModuleName());
            A0B.A0R("delete_variant", str2);
            A0B.A0O("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(c448924t.A03, false)));
            A0B.A0O("ads_mode_boost_story_enabled", Boolean.valueOf(z2));
            C51414MnM A0K = c448924t.A0K();
            if (length == 0) {
                str = "unknown";
            }
            C9Va c9Va = new C9Va();
            c9Va.A06("str_id", str);
            c9Va.A01(vHl, "sticker_type");
            List singletonList = Collections.singletonList(c9Va);
            C14360o3.A07(singletonList);
            A0K.A07("stickers", singletonList);
            A0B.A0S("media_struct", AbstractC16960so.A1N(A0K));
            A0B.Cht();
        }
    }

    public final void A1G(EnumC50631MWs enumC50631MWs) {
        C448724r c448724r = this.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A32, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_TRIM_SEGMENT");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("module", "trim_editor");
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
            A00.Cht();
        }
    }

    public final void A1M(EnumC50631MWs enumC50631MWs, Boolean bool) {
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_notification_impression");
        if (A00.isSampled()) {
            A00.A8R(A0J(), "camera_destination");
            A00.AAP("camera_session_id", super.A04.A0L);
            A00.A8p("entity_type", 5);
            A00.AAP("module", "panavideo_share_sheet");
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.A7v("is_crosspost", bool);
            A00.Cht();
        }
    }

    public final void A1O(EnumC50631MWs enumC50631MWs, Boolean bool, String str) {
        C448124l c448124l = this.A09;
        C14360o3.A0B(enumC50631MWs, 1);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            C448124l.A00(A08, c448124l);
            A08.A0a(c448124l.A0J());
            A08.A0b(c448124l.A04.A09);
            A08.A0T();
            A08.A0M(enumC50631MWs, "surface");
            A08.A0m("panavideo_share_sheet");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0O("is_crosspost", bool);
            A08.Cht();
        }
    }

    public final void A1S(EnumC50631MWs enumC50631MWs, String str) {
        C19280xC A01 = A01(this, "ig_camera_color_picker");
        A01.A0C("create_mode_format", str);
        A01.A0B("surface", Long.valueOf(enumC50631MWs.A00));
        AbstractC11060iN.A00(super.A03).EHW(A01);
    }

    public final void A26(boolean z) {
        String str;
        if (A0J() != null) {
            if (z) {
                str = "LONG_PRESS";
            } else {
                str = "TAP";
            }
            C448124l c448124l = this.A09;
            String moduleName = C22F.A08.getModuleName();
            C14360o3.A0B(moduleName, 0);
            C25531Mh A08 = C25531Mh.A08(c448124l.A01);
            if (((AbstractC02600Aj) A08).A00.isSampled()) {
                A08.A0q("SEGMENT_REMOVE_TAP");
                C448124l.A00(A08, c448124l);
                A08.A0a(EnumC114925Hg.FEED);
                A08.A0b(c448124l.A04.A09);
                A08.A0R("user_behavior", str);
                A08.A0T();
                A08.A0U();
                A08.A0c(AnonymousClass249.ALBUM);
                A08.A0M(MYO.GALLERY, "media_source");
                A08.A0m(moduleName);
                A08.A0M(EnumC193318hB.A03, "capture_type");
                A08.A0t(C1QM.A00.A02.A00);
                A08.Cht();
            }
        }
    }

    public final void A27(boolean z) {
        C22M c22m;
        String str;
        String str2;
        if (A0J() != null) {
            C448724r c448724r = this.A0F;
            C18920wW c18920wW = c448724r.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
            if (A00.isSampled() && (str = (c22m = c448724r.A04).A0L) != null) {
                A00.A8R(C81X.A1v, "tool_type");
                A00.AAP("camera_session_id", str);
                if (z) {
                    str2 = "LONG_PRESS";
                } else {
                    str2 = "TAP";
                }
                A00.AAP("user_behavior", str2);
                String str3 = c22m.A0L;
                if (str3 == null) {
                    str3 = "";
                }
                A00.AAP("camera_session_id", str3);
                A00.A8R(c448724r.A0J(), "camera_destination");
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                int i = 2;
                A00.A8p("event_type", 2);
                A00.AAP("module", C22F.A08.getModuleName());
                if (c22m.A01 != 2) {
                    i = 1;
                }
                A00.A8p("camera_position", Integer.valueOf(i));
                A00.A8R(EnumC50631MWs.A0I, "surface");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
                A00.Cht();
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A0B(this, "onSessionWillEnd");
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A0B(this, "onUserSessionWillEnd");
    }

    public final void A13(EnumC114925Hg enumC114925Hg, EnumC50631MWs enumC50631MWs, String str, String str2, String str3, Map map, Map map2, int i, int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(Long.valueOf(Long.parseLong(str)));
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(Long.valueOf(Long.parseLong((String) entry.getKey())), Long.valueOf(Long.parseLong((String) entry.getValue())));
        }
        ArrayList arrayList3 = new ArrayList();
        if (str3 != null) {
            arrayList3.add(str3);
        }
        C18920wW c18920wW = super.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ar_effect_impression");
        if (A00.isSampled()) {
            C22M c22m = super.A04;
            String str4 = c22m.A0L;
            if (str4 == null && enumC50631MWs != EnumC50631MWs.A0N) {
                AbstractC12120kG.A01("IgCameraLoggerImpl", "logArEffectImpression() cameraSession is null");
                return;
            }
            C0Zx c0Zx = new C0Zx() { // from class: X.8ye
            };
            c0Zx.A05("effect_id", Long.valueOf(Long.parseLong(str)));
            c0Zx.A00.put("effect_source", Integer.valueOf(i2));
            c0Zx.A03("is_saved", Boolean.valueOf(z));
            A00.AAk("applied_effect_ids", arrayList);
            A00.AAk("applied_effect_instance_ids", arrayList2);
            A00.AAk("attribution_ids", arrayList3);
            A00.A8R(enumC114925Hg, "camera_destination");
            int i3 = 2;
            if (i != 2) {
                i3 = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i3));
            A00.AAP("camera_session_id", str4);
            A00.A8R(A0I(), "capture_type");
            A00.A9M("effect_indices", hashMap);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(c0Zx, "effect_metadata");
            A00.AAQ(AbstractC449424y.A07(super.A00, super.A03), "system_info");
            if (map2 != null) {
                String str5 = (String) map2.get("merchant_id");
                String str6 = (String) map2.get("product_id");
                if (str5 != null) {
                    A00.A9K("merchant_id", Long.valueOf(Long.parseLong(str5)));
                }
                if (str6 != null) {
                    A00.A9K("product_id", Long.valueOf(Long.parseLong(str6)));
                }
            }
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            if (str2 != null) {
                A00.AAP("effect_collection", str2);
            }
            A00.A7v("ads_mode_boost_story_enabled", Boolean.valueOf(z2));
            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A00.AAP("device_fold_state", AbstractC82683mW.A00);
            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A00.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x026d, code lost:
    
        if (r30.A0L() != false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A16(X.C22P r23, X.EnumC190198bd r24, X.EnumC50631MWs r25, X.C8JW r26, X.C1810981l r27, X.C5JK r28, X.C3o9 r29, com.instagram.reels.prompt.model.PromptStickerModel r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.List r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22C.A16(X.22P, X.8bd, X.MWs, X.8JW, X.81l, X.5JK, X.3o9, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int):void");
    }
}
