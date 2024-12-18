package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.dextricks.DexStore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.TGm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64500TGm implements InterfaceC65674Tr4 {
    public int A00;
    public Integer A01;
    public Bundle A02;
    public AbstractC12990ll A03;
    public String A04;
    public volatile String A0S;
    public final AtomicLong A0R = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0Q = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0P = AbstractC58318PtA.A15(-1);
    public final AtomicLong A08 = AbstractC58318PtA.A15(-1);
    public final AtomicLong A07 = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0K = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0D = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0L = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0E = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0C = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0N = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0M = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0O = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0J = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0I = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0A = AbstractC58318PtA.A15(-1);
    public final AtomicLong A09 = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0F = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0G = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0H = AbstractC58318PtA.A15(-1);
    public final AtomicLong A0B = AbstractC58318PtA.A15(-1);
    public final AtomicInteger A05 = MSW.A1C(-1);
    public final AtomicInteger A06 = MSW.A1C(-1);

    private void A01() {
        this.A01 = null;
        this.A00 = 0;
        this.A0R.set(-1L);
        this.A0Q.set(-1L);
        this.A0P.set(-1L);
        this.A08.set(-1L);
        this.A07.set(-1L);
        this.A0K.set(-1L);
        this.A0D.set(-1L);
        this.A0L.set(-1L);
        this.A0E.set(-1L);
        this.A0C.set(-1L);
        this.A0N.set(-1L);
        this.A0M.set(-1L);
        this.A0O.set(-1L);
        this.A0J.set(-1L);
        this.A0I.set(-1L);
        this.A0A.set(-1L);
        this.A09.set(-1L);
        this.A0F.set(-1L);
        this.A0G.set(-1L);
        this.A0H.set(-1L);
        this.A0B.set(-1L);
        this.A05.set(-1);
        this.A06.set(-1);
    }

    @Override // X.InterfaceC65674Tr4
    public final synchronized void Cks() {
        long j;
        String str;
        Integer num = this.A01;
        if (num != null) {
            Integer num2 = C05F.A01;
            boolean equals = num.equals(num2);
            AtomicLong atomicLong = this.A0K;
            if (equals) {
                if (atomicLong.get() > -1 && this.A0E.get() > -1) {
                    atomicLong = this.A0C;
                }
            }
            if (atomicLong.get() > -1) {
                String str2 = "";
                AtomicLong atomicLong2 = this.A08;
                AtomicLong atomicLong3 = this.A07;
                if (atomicLong2.get() != -1 && atomicLong3.get() != -1) {
                    j = atomicLong3.get() - atomicLong2.get();
                } else {
                    j = 0;
                }
                if (this.A01 == num2) {
                    if (j == 0) {
                        str2 = "warm";
                    } else {
                        str2 = "cold";
                    }
                }
                "ig_react_native_view".getClass();
                C19280xC A01 = C19280xC.A01("ig_react_native_view", null);
                A01.A0C("view", this.A04);
                if (1 - this.A01.intValue() != 0) {
                    str = "native";
                } else {
                    str = "react_native";
                }
                A01.A0C("tag", str);
                A01.A0C(DexStore.CONFIG_FILENAME, "");
                A03(A01, "plugin_init_time", this.A0Q, this.A0P);
                A01.A0B("bridge_init_time", Long.valueOf(j));
                A01.A0C("bridge_init_state", str2);
                AtomicLong atomicLong4 = this.A0R;
                A03(A01, "time_to_js", atomicLong4, this.A0L);
                A02(A01, "js_app_require_time", this.A0D);
                A02(A01, "js_time", this.A0E);
                A02(A01, "idle_time", this.A0C);
                A03(A01, "tti_time", atomicLong4, atomicLong);
                AtomicLong atomicLong5 = this.A0N;
                A03(A01, "time_to_unpacker_check", atomicLong4, atomicLong5);
                A03(A01, "unpacker_check_time", atomicLong5, this.A0M);
                A03(A01, "unpacking_time", atomicLong5, this.A0O);
                A03(A01, "run_js_bundle_time", this.A0J, this.A0I);
                A03(A01, "create_ui_manager_module_time", this.A0A, this.A09);
                A02(A01, "jsc_block_size", this.A0F);
                A02(A01, "jsc_malloc_size", this.A0G);
                A02(A01, "jsc_object_size", this.A0H);
                A02(A01, "fetch_relay_query", this.A0B);
                AtomicInteger atomicInteger = this.A05;
                if (atomicInteger.get() != -1) {
                    AbstractC58318PtA.A1O(A01, "used_relay_modern", atomicInteger.get());
                }
                AtomicInteger atomicInteger2 = this.A06;
                if (atomicInteger2.get() != -1) {
                    AbstractC58318PtA.A1O(A01, "used_relay_prefetcher", atomicInteger2.get());
                }
                String str3 = this.A0S;
                if (str3 != null) {
                    A01.A0C("tti_event_tag", str3);
                }
                if (this.A01 == num2) {
                    A01.A08(AbstractC25227BEk.A0p(), "ota");
                }
                if (C0K8.A01.isLoggable(3)) {
                    C0K8.A0D("AnalyticsEvent", A01.A03());
                }
                AbstractC31173DnH.A1S(A01, this.A03);
                int i = this.A00;
                if (i != 0) {
                    C006802i c006802i = C006802i.A0p;
                    c006802i.markerAnnotate(i, "bridge_state", str2);
                    Bundle bundle = this.A02;
                    if (bundle != null && bundle.containsKey("prefetch_checkout_info")) {
                        c006802i.markerAnnotate(this.A00, "prefetch_checkout_info", bundle.getBoolean("prefetch_checkout_info"));
                    }
                    c006802i.markerEnd(this.A00, (short) 2);
                }
                A01();
            }
        }
    }

    @Override // X.InterfaceC65674Tr4
    public final synchronized void Dri() {
        int i = this.A00;
        if (i != 0) {
            C006802i.A0p.markerEnd(i, (short) 4);
            this.A00 = 0;
        }
    }

    @Override // X.InterfaceC65674Tr4
    public final synchronized void Emq(Integer num, Integer num2, String str) {
        Emr(null, num, null, str, 0);
    }

    @Override // X.InterfaceC65674Tr4
    public final synchronized void Emr(Bundle bundle, Integer num, Integer num2, String str, int i) {
        A01();
        this.A01 = num;
        this.A04 = str;
        this.A00 = i;
        this.A02 = bundle;
        int A00 = A00(this, this.A0R);
        if (A00 != 0) {
            C006802i.A0p.markerStart(A00);
        }
    }

    public static void A02(C19280xC c19280xC, String str, AtomicLong atomicLong) {
        c19280xC.A0B(str, Long.valueOf(Math.max(atomicLong.get(), 0L)));
    }

    public C64500TGm(AbstractC12990ll abstractC12990ll) {
        this.A03 = abstractC12990ll;
    }

    public static int A00(C64500TGm c64500TGm, AtomicLong atomicLong) {
        atomicLong.set(SystemClock.uptimeMillis());
        return c64500TGm.A00;
    }

    public static void A03(C19280xC c19280xC, String str, AtomicLong atomicLong, AtomicLong atomicLong2) {
        long j;
        if (atomicLong.get() != -1 && atomicLong2.get() != -1) {
            j = atomicLong2.get() - atomicLong.get();
        } else {
            j = 0;
        }
        c19280xC.A0B(str, Long.valueOf(j));
    }
}
