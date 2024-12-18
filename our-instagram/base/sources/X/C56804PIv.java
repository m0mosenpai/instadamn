package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.PIv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56804PIv implements InterfaceC147786l3, InterfaceC58088PpD {
    public long A00;
    public C54667OCt A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A09;
    public final OKO A0B;
    public final InterfaceC02550Ad A0C;
    public final InterfaceC11380iw A0D;
    public final C1QE A0E;
    public final C1CM A0F;
    public final Runnable A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final Handler A0A = new Handler();
    public final java.util.Set A0M = AbstractC31171DnF.A0l();
    public final AtomicInteger A0O = MSW.A1C(0);
    public final AtomicInteger A0P = MSW.A1C(0);
    public final AtomicBoolean A0N = new AtomicBoolean(false);
    public final AtomicLong A0R = new AtomicLong(0);
    public final AtomicLong A0Q = new AtomicLong(0);
    public final long A08 = SystemClock.elapsedRealtime();

    @Override // X.InterfaceC58088PpD
    public final void CjH(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C14360o3.A0B(str, 1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicBoolean atomicBoolean = this.A0N;
        boolean z2 = atomicBoolean.get();
        if (z) {
            if (!z2) {
                this.A0Q.set(elapsedRealtime);
            }
            this.A0P.incrementAndGet();
        } else if (z2) {
            this.A0R.addAndGet(elapsedRealtime - this.A0Q.get());
        }
        atomicBoolean.set(z);
        C25531Mh A03 = A03(this, C05F.A08);
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
        A03.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl2(long j, String str, String str2) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0C, "ig_live_delete_question");
        AbstractC50523MSb.A11(A0H, str, str2, j);
        AbstractC37301Gc2.A15(A0H, A04(A0H, this, A00(A0H, this)));
        MSW.A1T(A0H, "guest");
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl3(long j, String str, String str2) {
    }

    @Override // X.InterfaceC147786l3
    public final void Cl4(int i, String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0C, AbstractC111324zv.A00(4607));
        MSW.A1T(A0H, "guest");
        AbstractC50523MSb.A11(A0H, str, str2, j);
        int A00 = A00(A0H, this);
        A0H.A9K("question_index", AbstractC31171DnF.A0V(i));
        AbstractC37301Gc2.A15(A0H, A04(A0H, this, A00));
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl5(int i, String str, String str2, long j) {
    }

    @Override // X.InterfaceC147786l3
    public final void Cl7(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0C, AbstractC111324zv.A00(4608));
        MSW.A1T(A0H, "guest");
        A0H.AAP("question_text", str);
        A0H.A9K("a_pk", AbstractC003100w.A0k(10, this.A0I));
        AbstractC37301Gc2.A15(A0H, A04(A0H, this, 10));
        AbstractC37300Gc1.A0l(A0H, this.A0K);
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl8(int i, String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0H = MSY.A0H(this.A0C, AbstractC111324zv.A00(4609));
        MSW.A1T(A0H, "guest");
        AbstractC50523MSb.A11(A0H, str, str2, j);
        int A00 = A00(A0H, this);
        A0H.A9K("question_index", AbstractC31171DnF.A0V(i));
        AbstractC37301Gc2.A15(A0H, A04(A0H, this, A00));
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void CmA(boolean z) {
    }

    public static int A00(InterfaceC02590Ai interfaceC02590Ai, C56804PIv c56804PIv) {
        interfaceC02590Ai.A9K("a_pk", AbstractC003100w.A0k(10, c56804PIv.A0I));
        interfaceC02590Ai.AAP("m_pk", c56804PIv.A0K);
        return 10;
    }

    public static C25531Mh A01(C56804PIv c56804PIv) {
        C18920wW c18920wW = (C18920wW) c56804PIv.A0C;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_cobroadcast_waterfall"), 209);
        c25531Mh.A0l(c56804PIv.A0K);
        c25531Mh.A0P("duration", Double.valueOf((SystemClock.elapsedRealtime() - c56804PIv.A08) / 1000.0d));
        String A05 = c56804PIv.A0E.A05();
        C14360o3.A07(A05);
        c25531Mh.A0R("waterfall_id", A05);
        c25531Mh.A0R("container_module", c56804PIv.A0D.getModuleName());
        return c25531Mh;
    }

    public static InterfaceC11380iw A04(InterfaceC02590Ai interfaceC02590Ai, C56804PIv c56804PIv, int i) {
        interfaceC02590Ai.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(i, c56804PIv.A0H));
        return c56804PIv.A0D;
    }

    private final void A05() {
        C25531Mh A03 = A03(this, C05F.A05);
        C54667OCt c54667OCt = this.A01;
        if (c54667OCt != null) {
            C0Zx c0Zx = new C0Zx();
            long j = 0;
            c0Zx.A05("button_tap_count", 0L);
            if (c54667OCt.A04) {
                j = 1;
            }
            c0Zx.A05("button_was_shown", Long.valueOf(j));
            c0Zx.A05("face_effect_off_tap_count", 0L);
            c0Zx.A05("num_effects_in_tray", 0L);
            C19260xA c19260xA = new C19260xA();
            Iterator A0k = AbstractC167007dF.A0k(c54667OCt.A00);
            if (A0k.hasNext()) {
                A0k.next();
                throw AbstractC166987dD.A15("getNumTimesSelected");
            }
            HashMap A032 = AbstractC11490j8.A03(c19260xA);
            ArrayList A17 = AbstractC25225BEi.A17(A032.size());
            Iterator A14 = AbstractC166997dE.A14(A032);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                A17.add(AbstractC167007dF.A0n(A1K.getKey(), A1K.getValue()));
            }
            c0Zx.A07("selected_effect_usage_stats", A17);
            c0Zx.A07("selected_face_effect_session_ids", Collections.unmodifiableList(c54667OCt.A01));
            c0Zx.A05("supports_face_filters", 0L);
            c0Zx.A05("tray_dismissed_with_active_effect_count", 0L);
            A03.A0N(c0Zx, "face_effect_usage_stats");
        }
        A03.Cht();
    }

    public static void A06(InterfaceC02590Ai interfaceC02590Ai, C56804PIv c56804PIv, int i) {
        C25531Mh c25531Mh = new C25531Mh(interfaceC02590Ai, i);
        c25531Mh.A0R("view_mode", "guest");
        c25531Mh.A0Q("a_pk", AbstractC003100w.A0k(10, c56804PIv.A0I));
        c25531Mh.A0Q(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, c56804PIv.A0H));
        c25531Mh.A0R("container_module", c56804PIv.A0D.getModuleName());
        c25531Mh.A0S("current_guest_ids", AbstractC001800i.A0a(c56804PIv.A0M));
        c25531Mh.A0l(c56804PIv.A0K);
        c25531Mh.Cht();
    }

    public static final void A07(C56804PIv c56804PIv, Integer num, String str) {
        String str2;
        String str3;
        switch (num.intValue()) {
            case 0:
                str2 = "INIT";
                break;
            case 1:
                str2 = "ATTEMPT";
                break;
            default:
                str2 = "STARTED";
                break;
        }
        Integer num2 = c56804PIv.A03;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str3 = "ATTEMPT";
                    break;
                case 2:
                    str3 = "STARTED";
                    break;
                case 3:
                    str3 = "ENDED";
                    break;
                case 4:
                    str3 = "ABORTED";
                    break;
                default:
                    str3 = "INIT";
                    break;
            }
        } else {
            str3 = "null";
        }
        C0w9.A03("IgLiveWithGuestWaterfall", AnonymousClass001.A13("invalid mJoinState; expected: ", str2, ", actual: ", str3, ", description: ", str));
    }

    public final void A08(Integer num) {
        this.A0O.incrementAndGet();
        C25531Mh A01 = A01(this);
        A01.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "broadcast_camera_flip");
        A01.A0Q(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A0H));
        java.util.Set set = this.A0M;
        ArrayList A0i = AbstractC167007dF.A0i(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0i);
        }
        A01.A0S("current_guest_ids", A0i);
        A01.A0R("livewith_stack", "rsys_rtc");
        OQU.A01(A01, num);
    }

    public final void A09(String str, Integer num) {
        String str2;
        Integer num2;
        String str3;
        String str4;
        C14360o3.A0B(str, 1);
        this.A0M.remove(str);
        Integer num3 = this.A03;
        if (num3 == C05F.A01) {
            C25531Mh A03 = A03(this, C05F.A0C);
            if (1 - num.intValue() != 0) {
                str4 = "broadcaster_initiated";
            } else {
                str4 = "guest_initiated";
            }
            AbstractC50523MSb.A15(A03, str4, "");
            A03.Cht();
            num2 = C05F.A0Y;
        } else {
            Integer num4 = C05F.A0C;
            if (num3 == num4) {
                A05();
                if (this.A03 == num4) {
                    num2 = C05F.A0N;
                    C25531Mh A032 = A03(this, num2);
                    if (1 - num.intValue() != 0) {
                        str3 = "broadcaster_initiated";
                    } else {
                        str3 = "guest_initiated";
                    }
                    AbstractC50523MSb.A15(A032, str3, "");
                    A032.Cht();
                } else {
                    if (1 - num.intValue() != 0) {
                        str2 = "BROADCASTER_INITIATED";
                    } else {
                        str2 = "GUEST_INITIATED";
                    }
                    A07(this, num4, AnonymousClass001.A0u("ending broadcast. reason: ", str2, " reasonInfo: ", ""));
                }
            }
            this.A07 = false;
            this.A0A.removeCallbacks(this.A0G);
        }
        this.A03 = num2;
        this.A07 = false;
        this.A0A.removeCallbacks(this.A0G);
    }

    public final void A0A(String str, String str2) {
        C25531Mh A02 = A02(this, C05F.A15);
        A02.A0R("debug_title", str);
        if (str2.length() != 0) {
            A02.A0R("debug_msg", str2);
        }
        A02.Cht();
    }

    public final void A0C(String str, Throwable th) {
        Object obj = AbstractC63327Shb.A00;
        String A0m = AbstractC50522MSa.A0m(th);
        C14360o3.A07(A0m);
        A0A(str, A0m);
    }

    @Override // X.InterfaceC147786l3
    public final void CiP() {
        InterfaceC02590Ai A0H = MSY.A0H(this.A0C, AbstractC111324zv.A00(4596));
        A0H.A9K("a_pk", AbstractC003100w.A0k(10, this.A0I));
        AbstractC37301Gc2.A15(A0H, A04(A0H, this, 10));
        AbstractC37300Gc1.A0l(A0H, this.A0K);
        MSW.A1T(A0H, "guest");
        A0H.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl6(int i, int i2, int i3, int i4, int i5) {
        InterfaceC02590Ai A0H = MSY.A0H(this.A0C, "ig_live_question_tray_impression");
        A0H.A9K("unanswered_question_count", MSX.A0a(A0H, MSX.A0a(A0H, MSX.A0a(A0H, MSX.A0a(A0H, AbstractC31171DnF.A0V(i), "question_count", i2), "live_question_count", i3), "stories_question_count", i4), "answered_question_count", i5));
        AbstractC37301Gc2.A15(A0H, A04(A0H, this, A00(A0H, this)));
        MSW.A1T(A0H, "guest");
        A0H.Cht();
    }

    @Override // X.InterfaceC58088PpD
    public final void CoC() {
        if (this.A01 == null) {
            this.A01 = new C54667OCt();
        }
    }

    public C56804PIv(Context context, InterfaceC02550Ad interfaceC02550Ad, InterfaceC11380iw interfaceC11380iw, C1CM c1cm, String str, String str2, String str3, String str4, String str5, java.util.Set set) {
        this.A0F = c1cm;
        this.A0H = str;
        this.A0I = str2;
        this.A0K = str3;
        this.A0L = str4;
        this.A0J = str5;
        this.A0C = interfaceC02550Ad;
        this.A0D = interfaceC11380iw;
        this.A09 = AbstractC166987dD.A0O(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.A0M.add(AbstractC25226BEj.A15(it).getId());
        }
        this.A00 = 0L;
        this.A0B = OZK.A01(OZK.A02("/proc/self/stat"));
        C1QE A00 = C1QE.A00(this.A0D, MSY.A0h(this));
        this.A0E = A00;
        A00.A08();
        A00.A05();
        DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        this.A03 = C05F.A00;
        this.A0G = new RunnableC56935POc(this);
    }

    public static final C25531Mh A02(C56804PIv c56804PIv, Integer num) {
        C25531Mh A01 = A01(c56804PIv);
        A01.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, AbstractC54265Nyl.A00(num));
        java.util.Set set = c56804PIv.A0M;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0q);
        }
        A01.A0S("current_guest_ids", A0q);
        A01.A0R("livewith_stack", "rsys_rtc");
        return A01;
    }

    public static final C25531Mh A03(C56804PIv c56804PIv, Integer num) {
        String str;
        C25531Mh A01 = A01(c56804PIv);
        A01.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, AbstractC54265Nyl.A00(num));
        A01.A0Q(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, c56804PIv.A0H));
        ((AbstractC02600Aj) A01).A00.A9M("perf", AbstractC11490j8.A03(AbstractC55113ObX.A00(c56804PIv.A0B, c56804PIv.A0F)));
        Integer num2 = c56804PIv.A02;
        if (num2 != null) {
            str = OQU.A00(num2);
        } else {
            str = "";
        }
        A01.A0R("camera", str);
        AtomicBoolean atomicBoolean = c56804PIv.A0N;
        A01.A0Q("face_effect_enabled", Long.valueOf(AbstractC37302Gc3.A03(atomicBoolean.get() ? 1 : 0)));
        A01.A0R("network_connection", AbstractC15820qc.A08(c56804PIv.A09));
        A01.A0R("a_i", "organic");
        A01.A0O(AbstractC111324zv.A00(1050), AbstractC166997dE.A0b());
        A01.A0R("invite_type", c56804PIv.A0J);
        A01.A0R("tracking_token", c56804PIv.A0L);
        A01.A0Q("is_audio_muted", Long.valueOf(AbstractC37302Gc3.A03(c56804PIv.A05 ? 1 : 0)));
        A01.A0Q("is_video_muted", Long.valueOf(AbstractC37302Gc3.A03(c56804PIv.A06 ? 1 : 0)));
        java.util.Set set = c56804PIv.A0M;
        ArrayList A0i = AbstractC167007dF.A0i(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0i);
        }
        A01.A0S("current_guest_ids", A0i);
        A01.A0R("livewith_stack", "rsys_rtc");
        long j = c56804PIv.A0R.get();
        if (atomicBoolean.get()) {
            j += SystemClock.elapsedRealtime() - c56804PIv.A0Q.get();
        }
        A01.A0Q("total_face_effect_applied", MSY.A0Z(c56804PIv.A0P));
        A01.A0Q("total_camera_flip_count", MSY.A0Z(c56804PIv.A0O));
        A01.A0Q("total_duration_with_face_effect", Long.valueOf(AbstractC166987dD.A0L(j)));
        return A01;
    }

    public final void A0B(String str, String str2, String str3, boolean z) {
        Integer num;
        StringBuilder A1C;
        String str4;
        Integer num2;
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        C25531Mh A03 = A03(this, C05F.A1F);
        String A0R = AnonymousClass001.A0R("Reason: ", str2);
        if (str3 != null) {
            A0R = AnonymousClass001.A0g(A0R, ", Description: ", str3);
        }
        C0K8.A0C("IgLiveWithGuestWaterfall", A0R);
        A03.A0Q(TraceFieldType.ErrorCode, 2000L);
        A03.A0R(AbstractC58317Pt9.A00(23), str);
        A03.A0R("error_info", A0R);
        A03.Cht();
        if (z) {
            Integer num3 = this.A03;
            int intValue = num3.intValue();
            if (intValue != A1a) {
                if (intValue == 2) {
                    if (str3 == null) {
                        str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                    }
                    num = C05F.A0C;
                    if (num3 == num) {
                        num2 = C05F.A0N;
                        C25531Mh A032 = A03(this, num2);
                        AbstractC50523MSb.A15(A032, "broadcast_failure", str3);
                        A032.Cht();
                        this.A03 = num2;
                        return;
                    }
                    A1C = AbstractC166987dD.A1C();
                    A1C.append("ending broadcast. reason: ");
                    str4 = "BROADCAST_FAILURE";
                    A1C.append(str4);
                    A07(this, num, MSZ.A0u(" reasonInfo: ", str3, A1C));
                }
                return;
            }
            A05();
            if (str3 == null) {
                str3 = NetInfoModule.CONNECTION_TYPE_NONE;
            }
            Integer num4 = this.A03;
            num = C05F.A01;
            if (num4 == num) {
                C25531Mh A033 = A03(this, C05F.A0C);
                AbstractC50523MSb.A15(A033, "error", str3);
                A033.Cht();
                num2 = C05F.A0Y;
                this.A03 = num2;
                return;
            }
            A1C = AbstractC166987dD.A1C();
            A1C.append("aborting broadcast. reason: ");
            str4 = "ERROR";
            A1C.append(str4);
            A07(this, num, MSZ.A0u(" reasonInfo: ", str3, A1C));
        }
    }
}
