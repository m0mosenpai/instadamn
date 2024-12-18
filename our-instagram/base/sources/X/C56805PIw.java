package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import go.Seq;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.PIw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56805PIw implements InterfaceC147786l3, InterfaceC58088PpD {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C54667OCt A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public long A0J;
    public final Context A0K;
    public final Handler A0L;
    public final OKO A0M;
    public final InterfaceC02550Ad A0N;
    public final InterfaceC11380iw A0O;
    public final UserSession A0P;
    public final C1QE A0Q;
    public final C1CM A0R;
    public final Runnable A0S;
    public final java.util.Set A0T;
    public final ConcurrentHashMap A0U;
    public final ConcurrentHashMap A0V;
    public final AtomicBoolean A0W;
    public final AtomicInteger A0X;
    public final AtomicInteger A0Y;
    public final AtomicInteger A0Z;
    public final AtomicInteger A0a;
    public final AtomicInteger A0b;
    public final AtomicInteger A0c;
    public final AtomicInteger A0d;
    public final AtomicInteger A0e;
    public final AtomicInteger A0f;
    public final AtomicInteger A0g;
    public final AtomicInteger A0h;
    public final AtomicInteger A0i;
    public final AtomicInteger A0j;
    public final AtomicInteger A0k;
    public final AtomicInteger A0l;
    public final AtomicInteger A0m;
    public final AtomicInteger A0n;
    public final AtomicLong A0o;
    public final AtomicLong A0p;
    public final AtomicLong A0q;
    public final boolean A0r;

    public C56805PIw(Context context, InterfaceC02550Ad interfaceC02550Ad, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A0K = context;
        this.A0N = interfaceC02550Ad;
        this.A0O = interfaceC11380iw;
        this.A0P = userSession;
        this.A0R = new C1CM(context);
        C1QE A00 = C1QE.A00(interfaceC11380iw, MSY.A0h(this));
        this.A0Q = A00;
        this.A0M = OZK.A01(OZK.A02("/proc/self/stat"));
        this.A0r = AbstractC25230BEn.A1S(10, new Random().nextInt(100));
        this.A0L = new Handler();
        this.A0n = MSW.A1C(0);
        this.A0b = MSW.A1C(0);
        this.A0k = MSW.A1C(0);
        this.A0m = MSW.A1C(0);
        this.A0d = MSW.A1C(0);
        this.A0l = MSW.A1C(0);
        this.A0j = MSW.A1C(0);
        this.A0a = MSW.A1C(0);
        this.A0X = MSW.A1C(0);
        this.A0i = MSW.A1C(0);
        this.A0e = MSW.A1C(0);
        this.A0h = MSW.A1C(0);
        this.A0Z = MSW.A1C(0);
        this.A0Y = MSW.A1C(0);
        this.A0p = new AtomicLong(0L);
        this.A0U = new ConcurrentHashMap();
        this.A0V = new ConcurrentHashMap();
        this.A0T = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A0f = MSW.A1C(0);
        this.A0g = MSW.A1C(0);
        this.A0W = new AtomicBoolean(false);
        this.A0q = new AtomicLong(0L);
        this.A0o = new AtomicLong(0L);
        this.A0c = MSW.A1C(0);
        this.A07 = C05F.A01;
        this.A09 = "";
        this.A0B = true;
        this.A0C = true;
        this.A0E = true;
        A00.A08();
        this.A0S = new RunnableC56934POb(this);
    }

    public final void A0D(int i, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 2);
        C25531Mh A04 = A04(this, C05F.A05);
        AbstractC55113ObX.A03(A04, str, str2, str3, str4, i);
        A04.Cht();
    }

    public final void A0E(Integer num, String str) {
        long elapsedRealtime;
        String str2;
        C14360o3.A0B(num, 0);
        ConcurrentHashMap concurrentHashMap = this.A0V;
        Number A0W = AbstractC31171DnF.A0W(str, concurrentHashMap);
        if (A0W == null) {
            elapsedRealtime = -1;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - A0W.longValue();
        }
        C15500q5.A04(concurrentHashMap).remove(str);
        C25531Mh A02 = A02(this, C05F.A0m);
        switch (num.intValue()) {
            case 1:
                str2 = "GUEST_REJECT";
                break;
            case 2:
                str2 = "INVITE_EXPIRED";
                break;
            case 3:
                str2 = "CANDIDATE_INELIGIBLE";
                break;
            default:
                str2 = "BROADCASTER_CANCEL";
                break;
        }
        A02.A0R("reason", str2);
        A02.A0R("guest_id", str);
        A02.A0Q("is_viewer", 1L);
        A02.A0P("respond_time", MSZ.A0g(elapsedRealtime));
        ConcurrentHashMap concurrentHashMap2 = this.A0U;
        ArrayList A0o = AbstractC50522MSa.A0o(A02, concurrentHashMap2);
        Iterator A14 = AbstractC166997dE.A14(concurrentHashMap2);
        while (A14.hasNext()) {
            AbstractC31177DnL.A1R((String) MSZ.A0m(A14), A0o);
        }
        A08(A02, this, A0o);
        A02.Cht();
    }

    public final void A0F(String str) {
        C14360o3.A0B(str, 0);
        A0H(str, "");
    }

    public final void A0G(String str, Integer num) {
        C14360o3.A0B(num, 0);
        MSX.A1N(str, this.A0V, SystemClock.elapsedRealtime());
        this.A0h.incrementAndGet();
        C25531Mh A02 = A02(this, C05F.A0l);
        A02.A0o(AbstractC54264Nyk.A00(num));
        A02.A0R("guest_id", str);
        A02.A0Q("is_viewer", 1L);
        ConcurrentHashMap concurrentHashMap = this.A0U;
        ArrayList A0o = AbstractC50522MSa.A0o(A02, concurrentHashMap);
        Iterator A14 = AbstractC166997dE.A14(concurrentHashMap);
        while (A14.hasNext()) {
            AbstractC31177DnL.A1R((String) MSZ.A0m(A14), A0o);
        }
        A08(A02, this, A0o);
        A02.Cht();
    }

    public final void A0H(String str, String str2) {
        C14360o3.A0B(str2, 1);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0N, "ig_broadcast_waterfall");
        A06(A0H, this, "broadcast_debug");
        AbstractC37301Gc2.A15(A0H, this.A0O);
        A05(A0H, this, (float) this.A02);
        A0H.AAP("debug_title", str);
        if (str2.length() > 0) {
            A0H.AAP("debug_msg", str2);
        }
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void CiP() {
    }

    @Override // X.InterfaceC58088PpD
    public final void CjH(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C14360o3.A0B(str, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicBoolean atomicBoolean = this.A0W;
        boolean z2 = atomicBoolean.get();
        if (z) {
            if (!z2) {
                this.A0o.set(elapsedRealtime);
            }
            this.A0g.incrementAndGet();
        } else if (z2) {
            this.A0q.addAndGet(elapsedRealtime - this.A0o.get());
        }
        atomicBoolean.set(z);
        C25531Mh A03 = A03(this, C05F.A0q);
        if (z) {
            str5 = "apply";
        } else {
            str5 = "remove";
        }
        A03.A0j(str5);
        A03.A0R("current_face_effect_id", str);
        A03.A0R("current_face_effect_fileid", str2);
        A03.A0R("target_face_effect_id", str3);
        A03.A0R("target_face_effect_fileid", str4);
        OQU.A01(A03, this.A07);
    }

    @Override // X.InterfaceC147786l3
    public final void Cl2(long j, String str, String str2) {
        long j2;
        Long A0k;
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0N, "ig_live_delete_question");
        AbstractC50523MSb.A11(A0H, str, str2, j);
        int A00 = A00(A0H, this);
        String str3 = this.A08;
        if (str3 != null && (A0k = AbstractC003100w.A0k(A00, str3)) != null) {
            j2 = A0k.longValue();
        } else {
            j2 = 0;
        }
        MSY.A12(A0H, j2);
        A07(A0H, this, "container_module", this.A0O.getModuleName());
        MSX.A1D(A0H);
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl3(long j, String str, String str2) {
        long j2;
        Long A0k;
        C14360o3.A0B(str2, 2);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0N, "ig_live_deselect_question");
        A0H.A8I("dwell_time", AbstractC37302Gc3.A0S(System.currentTimeMillis() - this.A0J));
        AbstractC50523MSb.A11(A0H, str2, str, j);
        int A00 = A00(A0H, this);
        String str3 = this.A08;
        if (str3 != null && (A0k = AbstractC003100w.A0k(A00, str3)) != null) {
            j2 = A0k.longValue();
        } else {
            j2 = 0;
        }
        MSY.A12(A0H, j2);
        A07(A0H, this, "container_module", this.A0O.getModuleName());
        MSX.A1D(A0H);
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl4(int i, String str, String str2, long j) {
    }

    @Override // X.InterfaceC147786l3
    public final void Cl5(int i, String str, String str2, long j) {
        long j2;
        Long A0k;
        C14360o3.A0B(str2, 2);
        this.A0c.incrementAndGet();
        this.A0J = System.currentTimeMillis();
        InterfaceC02590Ai A0H = MSY.A0H(this.A0N, "ig_live_select_question");
        MSX.A1D(A0H);
        AbstractC50523MSb.A11(A0H, str2, str, j);
        int A00 = A00(A0H, this);
        A0H.A9K("question_index", AbstractC31171DnF.A0V(i));
        String str3 = this.A08;
        if (str3 != null && (A0k = AbstractC003100w.A0k(A00, str3)) != null) {
            j2 = A0k.longValue();
        } else {
            j2 = 0;
        }
        MSY.A12(A0H, j2);
        A07(A0H, this, "container_module", this.A0O.getModuleName());
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl7(String str) {
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl8(int i, String str, String str2, long j) {
    }

    public static int A00(InterfaceC02590Ai interfaceC02590Ai, C56805PIw c56805PIw) {
        String str = c56805PIw.A0P.userId;
        C14360o3.A0B(str, 0);
        interfaceC02590Ai.A9K("a_pk", AbstractC003100w.A0k(10, str));
        interfaceC02590Ai.AAP("m_pk", c56805PIw.A0A);
        return 10;
    }

    public static InterfaceC02590Ai A01(C56805PIw c56805PIw, Object obj, String str) {
        C18920wW c18920wW = (C18920wW) obj;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAK(new C4SX(Long.valueOf(Long.parseLong(c56805PIw.A0P.userId))), "a_pk");
        return A00;
    }

    public static final C25531Mh A04(C56805PIw c56805PIw, Integer num) {
        String str;
        C25531Mh A0A = AbstractC31171DnF.A0A(MSY.A0H(c56805PIw.A0N, "ig_broadcast_waterfall"), 198);
        switch (num.intValue()) {
            case 1:
                str = "broadcast_create_result";
                break;
            case 2:
                str = "broadcast_verification";
                break;
            case 3:
                str = "broadcast_begin_attempt";
                break;
            case 4:
                str = "broadcast_begin_result";
                break;
            case 5:
                str = "broadcast_updated";
                break;
            case 6:
                str = "broadcast_paused";
                break;
            case 7:
                str = "broadcast_resumed";
                break;
            case 8:
                str = "broadcast_cancelled";
                break;
            case 9:
                str = "broadcast_ended";
                break;
            case 10:
                str = "broadcast_summary";
                break;
            case 11:
                str = "broadcast_pin_comment";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "broadcast_unpin_comment";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "broadcast_error";
                break;
            case 14:
                str = "broadcast_warning";
                break;
            case Process.SIGTERM /* 15 */:
                str = "broadcast_debug";
                break;
            case 16:
                str = "broadcast_stats";
                break;
            case 17:
                str = "broadcast_viewers_list_impression";
                break;
            case 18:
                str = "broadcast_viewer_count_button_tap";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "broadcast_user_joined_comment_tap";
                break;
            case 20:
                str = "broadcast_dvr_start";
                break;
            case 21:
                str = "broadcast_save_initiated";
                break;
            case 22:
                str = "broadcast_save_result";
                break;
            case 23:
                str = "broadcast_save_impression";
                break;
            case 24:
                str = "broadcast_end_screen_impression";
                break;
            case 25:
                str = "broadcast_done_button_tap";
                break;
            case 26:
                str = "broadcast_got_audio_focus";
                break;
            case 27:
                str = "broadcast_lost_audio_focus";
                break;
            case 28:
                str = "broadcast_camera_flip";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                str = "comments_expanded";
                break;
            case 30:
                str = "comments_collapsed";
                break;
            case 31:
                str = "tap_header";
                break;
            case 32:
                str = "sup_stream_started";
                break;
            case 33:
                str = "sup_disconnected";
                break;
            case 34:
                str = "broadcast_sup_toggled";
                break;
            case 35:
                str = "broadcast_share_to_igtv_attempt";
                break;
            case 36:
                str = "broadcast_share_to_igtv_init";
                break;
            case 37:
                str = "broadcast_liveswap_try_connect_to_mws";
                break;
            case 38:
                str = "broadcast_liveswap";
                break;
            case 39:
                str = "broadcast_liveswap_connect_to_mws_failed";
                break;
            case 40:
                str = "broadcast_liveswap_first_frame_pts_delay";
                break;
            case Seq.NULL_REFNUM /* 41 */:
                str = "broadcast_send_invite";
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                str = "broadcast_send_invite_succeeded";
                break;
            case 43:
                str = "broadcast_send_invite_failed";
                break;
            case 44:
                str = "broadcast_initial_warning_shown";
                break;
            case 45:
                str = "broadcast_audio_toggled_on";
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                str = "broadcast_audio_toggled_off";
                break;
            case 47:
                str = "broadcast_video_toggled_on";
                break;
            case 48:
                str = "broadcast_video_toggled_off";
                break;
            case 49:
                str = "guest_invite_sheet_opened";
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                str = "guest_candidate_selected";
                break;
            case 51:
                str = "guest_invite_sent";
                break;
            case 52:
                str = "guest_invite_disabled";
                break;
            case 53:
                str = "cobroadcast_started";
                break;
            case 54:
                str = "cobroadcast_ended";
                break;
            case 55:
                str = "face_effect_button_impression";
                break;
            default:
                str = "face_effect_updated";
                break;
        }
        A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        String A05 = c56805PIw.A0Q.A05();
        C14360o3.A07(A05);
        A0A.A0R("waterfall_id", A05);
        A0A.A0R("container_module", c56805PIw.A0O.getModuleName());
        A0A.A0P("duration", MSZ.A0g(c56805PIw.A02));
        A0A.A0R("broadcast_type", c56805PIw.A09);
        A0A.A0R(TraceFieldType.BroadcastId, c56805PIw.A08);
        return A0A;
    }

    public static void A05(InterfaceC02590Ai interfaceC02590Ai, C56805PIw c56805PIw, float f) {
        interfaceC02590Ai.A8I("duration", Double.valueOf(f / 1000.0f));
        interfaceC02590Ai.AAP("broadcast_type", c56805PIw.A09);
        interfaceC02590Ai.AAP(TraceFieldType.BroadcastId, c56805PIw.A08);
    }

    public static void A06(InterfaceC02590Ai interfaceC02590Ai, C56805PIw c56805PIw, String str) {
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        String A05 = c56805PIw.A0Q.A05();
        C14360o3.A07(A05);
        interfaceC02590Ai.AAP("waterfall_id", A05);
    }

    public static void A08(AbstractC02600Aj abstractC02600Aj, C56805PIw c56805PIw, List list) {
        abstractC02600Aj.A0S("current_guest_ids", list);
        abstractC02600Aj.A0Q("guest_join_counter", Long.valueOf(c56805PIw.A0Z.get()));
    }

    public static final void A0A(C56805PIw c56805PIw) {
        C1CM c1cm = c56805PIw.A0R;
        c1cm.A04();
        int i = c56805PIw.A00;
        int i2 = c56805PIw.A0I;
        C1CM.A00(c1cm);
        c56805PIw.A00 = i + Math.max(0, i2 - c1cm.A00);
        C1CM.A00(c1cm);
        c56805PIw.A0I = c1cm.A00;
    }

    public final void A0C() {
        Handler handler = this.A0L;
        Runnable runnable = this.A0S;
        handler.removeCallbacks(runnable);
        if (this.A0G) {
            handler.postDelayed(runnable, 10000L);
        }
        C1CM c1cm = this.A0R;
        c1cm.A04();
        C1CM.A00(c1cm);
        this.A0I = c1cm.A00;
    }

    public final void A0I(String str, Throwable th) {
        Object obj = AbstractC63327Shb.A00;
        String A0m = AbstractC50522MSa.A0m(th);
        C14360o3.A07(A0m);
        A0H(str, A0m);
    }

    public final void A0J(boolean z, String str) {
        C25531Mh A03 = A03(this, C05F.A0Y);
        A03.A0Q("result", Long.valueOf(AbstractC37302Gc3.A03(z ? 1 : 0)));
        A03.A0R("result_info", str);
        A03.A0P("response_time", MSZ.A0g(SystemClock.elapsedRealtime() - this.A01));
        A03.A0Q("mqtt_connection_status", Long.valueOf(AbstractC37302Gc3.A03(RealtimeClientManager.getInstance(this.A0P).isMqttConnected() ? 1 : 0)));
        A03.A0O("allow_cobroadcast_invite", Boolean.valueOf(this.A0B));
        AbstractC55113ObX.A02(this.A0K, A03);
        A03.Cht();
        if (z) {
            this.A0G = true;
            A0C();
            DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        }
    }

    public final void A0K(boolean z, String str) {
        C25531Mh A04 = A04(this, C05F.A01);
        A04.A0Q("result", Long.valueOf(AbstractC37302Gc3.A03(z ? 1 : 0)));
        A04.A0R("result_info", str);
        A04.A0P("response_time", MSZ.A0g(SystemClock.elapsedRealtime() - this.A01));
        AbstractC55113ObX.A02(this.A0K, A04);
        A04.Cht();
    }

    public final void A0L(boolean z, boolean z2) {
        InterfaceC02590Ai A0H = MSY.A0H(this.A0N, "ig_broadcast_waterfall");
        A06(A0H, this, "broadcast_done_button_tap");
        AbstractC37301Gc2.A15(A0H, this.A0O);
        A05(A0H, this, (float) this.A02);
        AbstractC37300Gc1.A0l(A0H, this.A0A);
        A0H.A7v("share_status", AbstractC31173DnH.A0d(A0H, Boolean.valueOf(z2), "share_to_igtv_flag", z));
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl6(int i, int i2, int i3, int i4, int i5) {
        long j;
        Long A0k;
        InterfaceC02590Ai A0H = MSY.A0H(this.A0N, "ig_live_question_tray_impression");
        A0H.A9K("unanswered_question_count", MSX.A0a(A0H, MSX.A0a(A0H, MSX.A0a(A0H, MSX.A0a(A0H, AbstractC31171DnF.A0V(i), "question_count", i2), "live_question_count", i3), "stories_question_count", i4), "answered_question_count", i5));
        int A00 = A00(A0H, this);
        String str = this.A08;
        if (str != null && (A0k = AbstractC003100w.A0k(A00, str)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        MSY.A12(A0H, j);
        A07(A0H, this, "container_module", this.A0O.getModuleName());
        MSX.A1D(A0H);
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void CmA(boolean z) {
        String str;
        long j;
        Long A0k;
        InterfaceC02550Ad interfaceC02550Ad = this.A0N;
        if (z) {
            str = "ig_live_turn_on_questions";
        } else {
            str = "ig_live_turn_off_questions";
        }
        InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, str);
        int A00 = A00(A0H, this);
        String str2 = this.A08;
        if (str2 != null && (A0k = AbstractC003100w.A0k(A00, str2)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        MSY.A12(A0H, j);
        A07(A0H, this, "container_module", this.A0O.getModuleName());
        MSX.A1D(A0H);
        A0H.Cht();
    }

    @Override // X.InterfaceC58088PpD
    public final void CoC() {
        if (this.A06 == null) {
            this.A06 = new C54667OCt();
        }
    }

    public static C25531Mh A02(C56805PIw c56805PIw, Integer num) {
        C25531Mh A04 = A04(c56805PIw, num);
        A04.A0l(c56805PIw.A0A);
        return A04;
    }

    public static final C25531Mh A03(C56805PIw c56805PIw, Integer num) {
        C25531Mh A02 = A02(c56805PIw, num);
        ((AbstractC02600Aj) A02).A00.A9M("perf", AbstractC11490j8.A03(AbstractC55113ObX.A00(c56805PIw.A0M, c56805PIw.A0R)));
        A02.A0Q("last_av_pts_offset_ms", Long.valueOf(c56805PIw.A03));
        long j = 0;
        A02.A0Q("last_av_sent_time_offset_ms", 0L);
        A02.A0O("has_connection", Boolean.valueOf(c56805PIw.A0C));
        A02.A0R("camera", OQU.A00(c56805PIw.A07));
        AtomicBoolean atomicBoolean = c56805PIw.A0W;
        if (atomicBoolean.get()) {
            j = 1;
        }
        A02.A0Q("is_face_effect_enabled", Long.valueOf(j));
        A02.A0Q("current_viewer_count", MSY.A0Z(c56805PIw.A0n));
        A02.A0Q("is_chat_on", Long.valueOf(AbstractC37302Gc3.A03(c56805PIw.A0E ? 1 : 0)));
        A02.A0Q("user_comment_shown_count", AbstractC31171DnF.A0V(c56805PIw.A0m.getAndSet(0)));
        A02.A0Q("system_comment_shown_count", AbstractC31171DnF.A0V(c56805PIw.A0d.getAndSet(0)));
        A02.A0Q("like_shown_count", AbstractC31171DnF.A0V(c56805PIw.A0a.getAndSet(0)));
        A02.A0Q("burst_like_shown_count", AbstractC31171DnF.A0V(c56805PIw.A0X.getAndSet(0)));
        ConcurrentHashMap concurrentHashMap = c56805PIw.A0U;
        ArrayList A0o = AbstractC50522MSa.A0o(A02, concurrentHashMap);
        Iterator A14 = AbstractC166997dE.A14(concurrentHashMap);
        while (A14.hasNext()) {
            AbstractC31177DnL.A1R((String) MSZ.A0m(A14), A0o);
        }
        A08(A02, c56805PIw, A0o);
        A02.A0Q("is_audio_muted", Long.valueOf(AbstractC37302Gc3.A03(c56805PIw.A0D ? 1 : 0)));
        A02.A0Q("is_video_muted", Long.valueOf(AbstractC37302Gc3.A03(c56805PIw.A0F ? 1 : 0)));
        long j2 = c56805PIw.A0q.get();
        if (atomicBoolean.get()) {
            j2 += SystemClock.elapsedRealtime() - c56805PIw.A0o.get();
        }
        A02.A0Q("total_face_effect_applied", MSY.A0Z(c56805PIw.A0g));
        A02.A0Q("total_camera_flip_count", MSY.A0Z(c56805PIw.A0f));
        A02.A0Q("total_duration_with_face_effect", Long.valueOf(j2));
        Enumeration keys = concurrentHashMap.keys();
        if (keys.hasMoreElements()) {
            ArrayList list = Collections.list(keys);
            C14360o3.A07(list);
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                C14360o3.A0A(A1B);
                AbstractC31177DnL.A1R(A1B, A0q);
            }
            A02.A0S("guest_list", A0q);
        }
        return A02;
    }

    public static void A07(InterfaceC02590Ai interfaceC02590Ai, C56805PIw c56805PIw, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        Enumeration keys = c56805PIw.A0U.keys();
        C14360o3.A07(keys);
        ArrayList list = Collections.list(keys);
        C14360o3.A07(list);
        interfaceC02590Ai.AAk("current_guest_ids", list);
    }

    public static void A09(C25531Mh c25531Mh, C56805PIw c56805PIw, long j) {
        c25531Mh.A0Q(TraceFieldType.BroadcastId, Long.valueOf(j));
        c25531Mh.A0R("container_module", c56805PIw.A0O.getModuleName());
        Enumeration keys = c56805PIw.A0U.keys();
        C14360o3.A07(keys);
        ArrayList list = Collections.list(keys);
        C14360o3.A07(list);
        c25531Mh.A0S("current_guest_ids", list);
        c25531Mh.A0l(c56805PIw.A0A);
        c25531Mh.Cht();
    }

    public static void A0B(C56805PIw c56805PIw, Integer num) {
        C25531Mh A04 = A04(c56805PIw, num);
        A04.A0l(c56805PIw.A0A);
        A04.Cht();
    }
}
