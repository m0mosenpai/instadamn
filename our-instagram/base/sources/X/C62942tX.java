package X;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.Window;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.memorytimeline.MemoryTimeline;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.2tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62942tX {
    public static int A0Z;
    public static boolean A0a;
    public static boolean A0b;
    public static final InterfaceC62962tZ A0c = new InterfaceC62962tZ() { // from class: X.2tY
        @Override // X.InterfaceC62962tZ
        public final void onLargeFrameDrop(String str, int i) {
        }

        @Override // X.InterfaceC62962tZ
        public final void onScrollStart() {
        }

        @Override // X.InterfaceC62962tZ
        public final void onScrollStop() {
        }

        @Override // X.InterfaceC62962tZ
        public final void onScrolled(int i, int i2) {
        }

        @Override // X.InterfaceC62962tZ
        public final void onSmallFrameDrop(String str) {
        }

        @Override // X.InterfaceC62962tZ
        public final void registerModule(String str) {
        }

        @Override // X.InterfaceC62962tZ
        public final void reportScrollForDebugNew(C193668hm c193668hm) {
        }
    };
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final AwakeTimeSinceBootClock A08;
    public final C5GP A09;
    public final InterfaceC11380iw A0A;
    public final C006802i A0B;
    public final C18920wW A0C;
    public final C62972ta A0D;
    public final C63082tl A0E;
    public final InterfaceC62962tZ A0F;
    public final C63022tf A0G;
    public final C62912tU A0H;
    public final C1KH A0I;
    public final C62882tR A0J;
    public final Boolean A0K;
    public final Boolean A0L;
    public final Runnable A0M;
    public final InterfaceC08830cm A0N;
    public final InterfaceC08830cm A0O;
    public final InterfaceC08830cm A0P;
    public final InterfaceC08830cm A0Q;
    public final InterfaceC08830cm A0R;
    public final InterfaceC08830cm A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final InterfaceC63062tj A0Y;

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        C63022tf c63022tf = this.A0G;
        if (c63022tf.A0C.length() == 0) {
            c63022tf.A0C = str;
        }
    }

    public static final void A00(C62942tX c62942tX) {
        String str;
        Number valueOf;
        Number valueOf2;
        Number valueOf3;
        Number valueOf4;
        C0TS c0ts;
        long j;
        String str2;
        String str3;
        String str4;
        Number number;
        Number number2;
        if (c62942tX.A02) {
            C63022tf c63022tf = c62942tX.A0G;
            C63082tl c63082tl = c62942tX.A0E;
            C63032tg A01 = c63082tl.A01();
            int i = -1;
            int i2 = 0;
            if (c63022tf.A0H) {
                i2 = -1;
            }
            if (!c63022tf.A0G) {
                i = 0;
            }
            c63022tf.A08 = new C63032tg(A01.A01 + i2, A01.A00 + i);
            C5GP c5gp = c62942tX.A09;
            if (c62942tX.A0U && c5gp != null) {
                c5gp.APM();
            }
            c62942tX.A02 = false;
            InterfaceC11380iw interfaceC11380iw = c62942tX.A0A;
            interfaceC11380iw.getModuleName();
            boolean z = c62942tX.A0V;
            if (z) {
                c62942tX.A00++;
            }
            if (c63022tf.A07 > 0 && (!c62942tX.A03 || !c62942tX.A0T || c63022tf.A01 > 0 || c63022tf.A00 > 0)) {
                long now = c62942tX.A08.now();
                String str5 = C1QM.A00.A02.A00;
                if (A01()) {
                    C18920wW c18920wW = c62942tX.A0C;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "feed_scroll_perf");
                    if (A00.isSampled()) {
                        A00.A8I("1_frame_drop_bucket", Double.valueOf(c63022tf.A08.A01));
                        A00.A8I("4_frame_drop_bucket", Double.valueOf(c63022tf.A08.A00));
                        A00.A8I("display_refresh_rate", Double.valueOf(((Number) c63082tl.A06.getValue()).floatValue()));
                        A00.A8I("total_time_spent", Double.valueOf(c63022tf.A07 / 1000000.0d));
                        A00.AAP("current_ts_ms", String.valueOf(now));
                        A00.AAP("startup_ts_ms", String.valueOf(C1CC.A08));
                        A00.A7v("is_user_logging_enabled", Boolean.valueOf(A0b));
                        A00.A9K("user_sample_rate", Long.valueOf(A0Z));
                        A00.AAP("startup_type", C1CC.A09.toString());
                        A00.AAP("nav_chain", str5);
                        A00.Cht();
                    }
                    C006802i c006802i = c62942tX.A0B;
                    int i3 = c62942tX.A07;
                    int i4 = c62942tX.A06;
                    c006802i.markerAnnotate(i3, i4, "1_frame_drop_bucket", c63022tf.A08.A01);
                    c006802i.markerAnnotate(i3, i4, "4_frame_drop_bucket", c63022tf.A08.A00);
                    c006802i.markerAnnotate(i3, i4, "total_time_spent", c63022tf.A07 / 1000000);
                    c006802i.markerAnnotate(i3, i4, "total_busy_time_spent", c63022tf.A06 / 1000000);
                    C0UO c0uo = c63082tl.A06;
                    c006802i.markerAnnotate(i3, i4, "display_refresh_rate", ((Number) c0uo.getValue()).floatValue());
                    c006802i.markerAnnotate(i3, i4, "container_module", interfaceC11380iw.getModuleName());
                    c006802i.markerAnnotate(i3, i4, "vsync_time", (int) Math.ceil(1000.0f / ((Number) c0uo.getValue()).floatValue()));
                    c006802i.markerAnnotate(i3, i4, "current_ts_ms", now);
                    c006802i.markerAnnotate(i3, i4, "time_since_startup_bucket", C1CC.A01(now));
                    c006802i.markerAnnotate(i3, i4, "startup_ts_ms", C1CC.A08);
                    c006802i.markerAnnotate(i3, i4, "startup_type", C1CC.A09.toString());
                    c006802i.markerAnnotate(i3, i4, "is_user_logging_enabled", A0b);
                    c006802i.markerAnnotate(i3, i4, "user_sample_rate", A0Z);
                    c006802i.markerAnnotate(i3, i4, "is_debug_logging_enabled", A0a);
                    if (z) {
                        c006802i.markerAnnotate(i3, i4, "num_of_scrolls", c62942tX.A00);
                    }
                    long j2 = -1;
                    if (C1CC.A00 != -1) {
                        j2 = System.currentTimeMillis() - C1CC.A00;
                    }
                    c006802i.markerAnnotate(i3, i4, "time_since_upgrade_ms", j2);
                    c006802i.markerAnnotate(i3, i4, "foreground_cold_start_count_since_upgrade", C1CC.A05);
                    c006802i.markerAnnotate(i3, i4, "all_cold_start_count_since_upgrade", C1CC.A04);
                    c006802i.markerAnnotate(i3, i4, "foreground_timespent_since_upgrade_ms", C1CC.A06);
                    C1KH c1kh = c62942tX.A0I;
                    c006802i.markerAnnotate(i3, i4, "heap_free_ratio", c1kh.A05());
                    switch (c63022tf.A09.intValue()) {
                        case 0:
                            str = "UP";
                            break;
                        case 1:
                            str = "DOWN";
                            break;
                        case 2:
                            str = "LEFT";
                            break;
                        case 3:
                            str = "RIGHT";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    c006802i.markerAnnotate(i3, i4, "scroll_direction", str);
                    c006802i.markerAnnotate(i3, i4, "source_media_type", c63022tf.A0D);
                    c006802i.markerAnnotate(i3, i4, "destination_media_type", c63022tf.A0B);
                    c006802i.markerAnnotate(i3, i4, "source_description", c63022tf.A0C);
                    c006802i.markerAnnotate(i3, i4, "destination_description", c63022tf.A0A);
                    boolean z2 = c62942tX.A0X;
                    int i5 = c63022tf.A03;
                    if (z2) {
                        valueOf = Float.valueOf(i5 / c62942tX.A04);
                    } else {
                        valueOf = Integer.valueOf(i5);
                    }
                    c006802i.markerAnnotate(i3, i4, "scroll_distance_x", valueOf.doubleValue());
                    int i6 = c63022tf.A04;
                    if (z2) {
                        valueOf2 = Float.valueOf(i6 / c62942tX.A04);
                    } else {
                        valueOf2 = Integer.valueOf(i6);
                    }
                    c006802i.markerAnnotate(i3, i4, "scroll_distance_y", valueOf2.doubleValue());
                    int i7 = c63022tf.A00;
                    if (z2) {
                        valueOf3 = Float.valueOf(i7 / c62942tX.A04);
                    } else {
                        valueOf3 = Integer.valueOf(i7);
                    }
                    c006802i.markerAnnotate(i3, i4, "agg_scroll_distance_x", valueOf3.doubleValue());
                    int i8 = c63022tf.A01;
                    if (z2) {
                        valueOf4 = Float.valueOf(i8 / c62942tX.A04);
                    } else {
                        valueOf4 = Integer.valueOf(i8);
                    }
                    c006802i.markerAnnotate(i3, i4, "agg_scroll_distance_y", valueOf4.doubleValue());
                    c006802i.markerAnnotate(i3, i4, "display_density", c62942tX.A05);
                    if (str5 == null) {
                        str5 = "";
                    }
                    c006802i.markerAnnotate(i3, i4, "nav_chain", str5);
                    Boolean bool = c62942tX.A0K;
                    if (bool != null) {
                        c006802i.markerAnnotate(i3, i4, "has_linked_open_thread_id", bool.booleanValue());
                    }
                    InterfaceC08830cm interfaceC08830cm = c62942tX.A0Q;
                    if (interfaceC08830cm != null) {
                        Object obj = interfaceC08830cm.get();
                        C14360o3.A07(obj);
                        c006802i.markerAnnotate(i3, i4, "is_vm", ((Boolean) obj).booleanValue());
                    }
                    Boolean bool2 = c62942tX.A0L;
                    if (bool2 != null) {
                        c006802i.markerAnnotate(i3, i4, "is_mixvm", bool2.booleanValue());
                    }
                    InterfaceC08830cm interfaceC08830cm2 = c62942tX.A0S;
                    if (interfaceC08830cm2 != null) {
                        Object obj2 = interfaceC08830cm2.get();
                        C14360o3.A07(obj2);
                        c006802i.markerAnnotate(i3, i4, "is_mixvm_eligible", ((Boolean) obj2).booleanValue());
                    }
                    InterfaceC08830cm interfaceC08830cm3 = c62942tX.A0R;
                    if (interfaceC08830cm3 != null) {
                        Object obj3 = interfaceC08830cm3.get();
                        C14360o3.A07(obj3);
                        c006802i.markerAnnotate(i3, i4, "is_instamadillo", ((Boolean) obj3).booleanValue());
                    }
                    InterfaceC08830cm interfaceC08830cm4 = c62942tX.A0N;
                    if (interfaceC08830cm4 != null && (number2 = (Number) interfaceC08830cm4.get()) != null) {
                        c006802i.markerAnnotate(i3, i4, "ephemeral_lifetime_ms", number2.longValue());
                    }
                    InterfaceC08830cm interfaceC08830cm5 = c62942tX.A0O;
                    if (interfaceC08830cm5 != null && (number = (Number) interfaceC08830cm5.get()) != null) {
                        c006802i.markerAnnotate(i3, i4, AbstractC111324zv.A00(722), number.longValue());
                    }
                    InterfaceC08830cm interfaceC08830cm6 = c62942tX.A0P;
                    if (interfaceC08830cm6 != null && (str4 = (String) interfaceC08830cm6.get()) != null) {
                        c006802i.markerAnnotate(i3, i4, TraceFieldType.TransportType, str4);
                    }
                    C62882tR c62882tR = c62942tX.A0J;
                    Integer num = c62882tR.A03;
                    if (num != null) {
                        if (1 - num.intValue() != 0) {
                            str3 = "list";
                        } else {
                            str3 = "grid";
                        }
                        c006802i.markerAnnotate(i3, i4, "feed_mode", str3);
                    }
                    if (c62882tR.A0B) {
                        c006802i.markerAnnotate(i3, i4, "is_professional_account", C17060sy.A01.A01(c62882tR.A0D).A2I());
                    }
                    MemoryTimeline memoryTimeline = c62882tR.A00;
                    if (memoryTimeline != null && (c0ts = (C0TS) ((C2RK) memoryTimeline).A0F.get()) != null) {
                        for (C0TJ c0tj : c0ts.A00) {
                            C0TP c0tp = C0TP.A0u;
                            C0TP c0tp2 = c0tj.A02;
                            if (c0tp.equals(c0tp2)) {
                                c006802i.markerAnnotate(i3, i4, "meminfo_current_system_anonymous_kb", c0tj.A00);
                                j = c0tj.A01;
                                str2 = "meminfo_total_system_ram_kb";
                            } else if (C0TP.A0V.equals(c0tp2)) {
                                c006802i.markerAnnotate(i3, i4, "meminfo_current_java_heap_kb", c0tj.A00);
                                j = c0tj.A01;
                                str2 = "meminfo_total_java_heap_kb";
                            } else if (C0TP.A11.equals(c0tp2)) {
                                j = c0tj.A00;
                                str2 = "meminfo_current_system_non_evictable_kb";
                            } else if (C0TP.A0g.equals(c0tp2)) {
                                j = c0tj.A00;
                                str2 = "meminfo_current_app_ion_heap_kb";
                            } else if (C0TP.A0w.equals(c0tp2)) {
                                j = c0tj.A00;
                                str2 = "meminfo_current_sys_ion_heap_kb";
                            }
                            c006802i.markerAnnotate(i3, i4, str2, j);
                        }
                    }
                    Boolean bool3 = c62882tR.A02;
                    if (bool3 != null) {
                        c006802i.markerAnnotate(i3, i4, "is_group", bool3.booleanValue());
                    }
                    Integer num2 = c62882tR.A04;
                    if (num2 != null) {
                        c006802i.markerAnnotate(i3, i4, "thread_type_value", num2.intValue());
                    }
                    String str6 = c62882tR.A06;
                    if (str6 != null) {
                        c006802i.markerAnnotate(i3, i4, "thread_type_str", str6);
                    }
                    String str7 = c62882tR.A05;
                    if (str7 != null) {
                        c006802i.markerAnnotate(i3, i4, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str7);
                    }
                    if (!c62882tR.A08.isEmpty()) {
                        c006802i.markerAnnotate(i3, i4, "thread_type_value_list", AbstractC38301qK.A04(c62882tR.A08));
                    }
                    if (!c62882tR.A09.isEmpty()) {
                        c006802i.markerAnnotate(i3, i4, "thread_type_str_list", (String[]) c62882tR.A09.toArray(new String[0]));
                    }
                    if (!c62882tR.A07.isEmpty()) {
                        c006802i.markerAnnotate(i3, i4, "thread_id_list", (String[]) c62882tR.A07.toArray(new String[0]));
                    }
                    if (c62882tR.A0A) {
                        c006802i.markerAnnotate(i3, i4, "has_instamadillo_thread", true);
                    }
                    c006802i.markerEnd(i3, i4, (short) 2);
                    C193668hm c193668hm = new C193668hm();
                    c193668hm.A07 = interfaceC11380iw.getModuleName();
                    C63032tg c63032tg = c63022tf.A08;
                    c193668hm.A03 = c63032tg.A01;
                    c193668hm.A02 = c63032tg.A00;
                    c193668hm.A06 = c63022tf.A07 / 1000000;
                    c193668hm.A05 = c63022tf.A06 / 1000000;
                    c193668hm.A04 = now;
                    c193668hm.A00 = c1kh.A05();
                    c193668hm.A01 = ((Number) c0uo.getValue()).floatValue();
                    c193668hm.A08 = c63022tf.A0E;
                    c193668hm.A09 = c63022tf.A0F;
                    c62942tX.A0F.reportScrollForDebugNew(c193668hm);
                }
            } else if (A01()) {
                c62942tX.A0B.markerDrop(c62942tX.A07, c62942tX.A06);
            }
            c62942tX.A0F.onScrollStop();
        }
    }

    public static final boolean A01() {
        if (!A0a && !A0b) {
            return false;
        }
        return true;
    }

    public final void A03(boolean z) {
        if (z) {
            A00(this);
            return;
        }
        if (!this.A02 && A01()) {
            this.A02 = true;
            this.A0A.getModuleName();
            C63022tf c63022tf = this.A0G;
            c63022tf.A07 = 0L;
            c63022tf.A06 = 0L;
            c63022tf.A02 = 0;
            c63022tf.A05 = -1L;
            c63022tf.A0H = false;
            c63022tf.A0G = false;
            c63022tf.A03 = 0;
            c63022tf.A04 = 0;
            c63022tf.A00 = 0;
            c63022tf.A01 = 0;
            c63022tf.A09 = C05F.A0Y;
            c63022tf.A0C = "";
            c63022tf.A0A = "";
            c63022tf.A0D = "";
            c63022tf.A0B = "";
            c63022tf.A08 = new C63032tg(0, 0.0f);
            c63022tf.A0E = new HashSet();
            c63022tf.A0F = new HashSet();
            this.A0E.A02();
            C5GP c5gp = this.A09;
            if (this.A0U && c5gp != null) {
                c5gp.ARQ();
            }
        }
        InterfaceC62962tZ interfaceC62962tZ = this.A0F;
        interfaceC62962tZ.registerModule(this.A0A.getModuleName());
        interfaceC62962tZ.onScrollStart();
    }

    public C62942tX(Activity activity, AwakeTimeSinceBootClock awakeTimeSinceBootClock, InterfaceC11380iw interfaceC11380iw, C006802i c006802i, C18920wW c18920wW, C62972ta c62972ta, C62992tc c62992tc, InterfaceC62962tZ interfaceC62962tZ, C62912tU c62912tU, C1KH c1kh, C62882tR c62882tR, Boolean bool, Boolean bool2, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C5GP c5gp;
        C008002u A00;
        C5GP yaj;
        this.A0A = interfaceC11380iw;
        this.A0J = c62882tR;
        this.A07 = i;
        this.A0D = c62972ta;
        this.A0B = c006802i;
        this.A0F = interfaceC62962tZ;
        this.A08 = awakeTimeSinceBootClock;
        this.A0C = c18920wW;
        this.A0I = c1kh;
        this.A0H = c62912tU;
        this.A0K = bool;
        this.A0Q = interfaceC08830cm;
        this.A0L = bool2;
        this.A0S = interfaceC08830cm2;
        this.A0P = interfaceC08830cm3;
        this.A0N = interfaceC08830cm4;
        this.A0O = interfaceC08830cm5;
        this.A0W = z;
        this.A0U = z3;
        this.A0V = z4;
        this.A0T = z5;
        this.A05 = i2;
        this.A04 = f;
        this.A0X = z6;
        this.A0R = interfaceC08830cm6;
        interfaceC62962tZ.registerModule(interfaceC11380iw.getModuleName());
        this.A0G = new C63022tf();
        this.A06 = new Random().nextInt();
        if (z3) {
            Window window = activity.getWindow();
            String moduleName = interfaceC11380iw.getModuleName();
            if (window == null) {
                yaj = new YAI(activity, new C72754XmV(activity, c006802i, moduleName));
            } else {
                yaj = new YAJ(activity.getWindow(), new C72754XmV(activity, c006802i, moduleName));
            }
            c5gp = yaj;
        } else {
            c5gp = null;
        }
        this.A09 = c5gp;
        this.A0M = new Runnable() { // from class: X.2th
            @Override // java.lang.Runnable
            public final void run() {
                C62942tX c62942tX = C62942tX.this;
                c62942tX.A0G.A06 += System.nanoTime() - c62942tX.A01;
                if (C62942tX.A01() && !AbstractC06440Vm.A00()) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ScrollPerf.FrameEnded", 1990132090);
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1653128677);
                    }
                }
            }
        };
        InterfaceC63062tj interfaceC63062tj = new InterfaceC63062tj() { // from class: X.2ti
            @Override // X.InterfaceC63062tj
            public final void DIU(long j, long j2) {
                C62942tX c62942tX = C62942tX.this;
                if (c62942tX.A02) {
                    C62912tU c62912tU2 = c62942tX.A0H;
                    C62912tU.A00(c62912tU2, new C207039Ei(c62912tU2, j, 4));
                    c62942tX.A01 = j;
                    C63022tf c63022tf = c62942tX.A0G;
                    if (c63022tf.A05 == -1) {
                        c63022tf.A05 = j;
                        if (C62942tX.A01()) {
                            c62942tX.A0B.markerStart(c62942tX.A07, c62942tX.A06);
                            return;
                        }
                        return;
                    }
                    c62942tX.A0D.A00(c62942tX.A0M);
                    c63022tf.A07 += j2;
                    if (!C62942tX.A01() || AbstractC06440Vm.A00()) {
                        return;
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ScrollPerf.FrameStarted", 30471236);
                    }
                    if (!Systrace.A0E(1L)) {
                        return;
                    }
                    C0fO.A00(1687001523);
                }
            }

            @Override // X.InterfaceC63062tj
            public final void DOQ(long j, int i3) {
                C62942tX c62942tX = C62942tX.this;
                if (c62942tX.A02) {
                    C63022tf c63022tf = c62942tX.A0G;
                    if (c63022tf.A05 == j && !c62942tX.A0W) {
                        c63022tf.A0G = true;
                        return;
                    }
                    C62912tU c62912tU2 = c62942tX.A0H;
                    C62912tU.A00(c62912tU2, new C207039Ei(c62912tU2, j, 5));
                    c62942tX.A0F.onLargeFrameDrop(c62942tX.A0A.getModuleName(), i3);
                    if (!C62942tX.A01()) {
                        return;
                    }
                    int i4 = c63022tf.A02;
                    if (i4 < 8) {
                        C006802i c006802i2 = c62942tX.A0B;
                        int i5 = c62942tX.A07;
                        int i6 = c62942tX.A06;
                        c63022tf.A02 = i4 + 1;
                        c006802i2.markerPoint(i5, i6, AnonymousClass001.A0O("ScrollPerf.LargeFrameDrop", i4), String.valueOf(i3));
                    }
                    if (AbstractC06440Vm.A00()) {
                        return;
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ScrollPerf.LargeFrameDropped", 2033569308);
                    }
                    if (!Systrace.A0E(1L)) {
                        return;
                    }
                    C0fO.A00(-361665890);
                }
            }

            @Override // X.InterfaceC63062tj
            public final void Dn7(long j) {
                C62942tX c62942tX = C62942tX.this;
                if (c62942tX.A02) {
                    C63022tf c63022tf = c62942tX.A0G;
                    if (c63022tf.A05 == j) {
                        c63022tf.A0H = true;
                        return;
                    }
                    c62942tX.A0F.onSmallFrameDrop(c62942tX.A0A.getModuleName());
                    if (!C62942tX.A01() || AbstractC06440Vm.A00()) {
                        return;
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ScrollPerf.FrameDropped", 921983882);
                    }
                    if (!Systrace.A0E(1L)) {
                        return;
                    }
                    C0fO.A00(832396222);
                }
            }
        };
        this.A0Y = interfaceC63062tj;
        C14360o3.A0B(interfaceC63062tj, 0);
        C15920qm c15920qm = AbstractC15930qn.A02;
        if (c15920qm.A0a) {
            Context context = c62992tc.A00;
            boolean z7 = c15920qm.A0Z;
            float f2 = C63012te.A00;
            A00 = new C008002u(Float.valueOf(60.0f));
            C19L c19l = C63012te.A04;
            AbstractC23641Du.A05(AnonymousClass191.A00, new D4w(context, (InterfaceC23621Ds) null, A00, 80, z7), c19l);
        } else {
            A00 = C10E.A00(Float.valueOf(C63012te.A03.A00(c62992tc.A00, 80)));
        }
        AnonymousClass059 A02 = AbstractC208910l.A02(A00);
        Choreographer choreographer = Choreographer.getInstance();
        C14360o3.A07(choreographer);
        this.A0E = new C63082tl((C63102tn) C63082tl.A0B.getValue(), interfaceC63062tj, new C63072tk(choreographer), A02, z2);
    }
}
