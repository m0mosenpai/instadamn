package X;

import java.util.Map;
import java.util.Random;

/* renamed from: X.1yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42961yO {
    public static C42921yK A07;
    public static final C42961yO A08;
    public static final C42961yO A09;
    public static final C42961yO A0A;
    public static final C42961yO A0B;
    public static final C42961yO A0C;
    public static final C42961yO A0D;
    public static final C42961yO A0E;
    public static final C42961yO A0F;
    public static final C42961yO A0G;
    public static final C42961yO A0H;
    public static final C42961yO A0I;
    public static final C42961yO A0J;
    public static final C42961yO A0K;
    public static final C42961yO A0L;
    public static final C42961yO A0M;
    public static final C42961yO A0N;
    public static final C42961yO A0O;
    public static final C42961yO A0P;
    public static final C42961yO A0Q;
    public static final C42961yO A0R;
    public static final C42961yO A0S;
    public static final C42961yO A0T;
    public static final C42961yO A0U;
    public static final C42961yO A0V;
    public static final C42961yO A0W;
    public static final C42961yO[] A0X;
    public static final Random A0Y;
    public int A00 = 0;
    public long A01 = Long.MIN_VALUE;
    public long A02 = Long.MAX_VALUE;
    public long A03 = 0;
    public long[] A04;
    public final String A05;
    public final boolean A06;

    public final void A03(String str) {
        synchronized (this) {
            if (A07 != null) {
                C0w9.A03(this.A05, str);
            }
        }
    }

    private void A00(long j) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j2 = this.A01;
        if (j2 <= j) {
            j2 = j;
        }
        this.A01 = j2;
        long j3 = this.A02;
        if (j3 >= j) {
            j3 = j;
        }
        this.A02 = j3;
        this.A03 += j;
        int i = this.A00;
        if (i < 256) {
            jArr[i] = j;
        } else {
            int nextInt = A0Y.nextInt(i + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 == 256) {
            if (this.A06) {
                synchronized (this) {
                    A01(this);
                }
            } else {
                A01(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2 > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C42961yO r17) {
        /*
            X.1yK r8 = X.C42961yO.A07
            r9 = r17
            if (r8 == 0) goto Lca
            int r2 = r9.A00
            r0 = 256(0x100, float:3.59E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r2 >= r0) goto L11
            r1 = r2
            if (r2 <= 0) goto Lca
        L11:
            java.lang.String r7 = r9.A05
            long[] r0 = r9.A04
            r11 = 5
            long[] r6 = new long[r11]
            if (r1 <= 0) goto L4c
            long[] r17 = java.util.Arrays.copyOf(r0, r1)
            java.util.Arrays.sort(r17)
            r0 = 1
            int r1 = r1 - r0
            int r14 = r1 >> 2
            r10 = 0
            int r13 = r1 >> 1
            int r12 = r1 - r14
            double r1 = (double) r1
            r3 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r3 = r3 * r1
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 + r15
            int r5 = (int) r3
            r3 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            double r1 = r1 * r3
            double r1 = r1 + r15
            int r0 = (int) r1
            int[] r2 = new int[]{r14, r13, r12, r5, r0}
        L41:
            r0 = r2[r10]
            r0 = r17[r0]
            r6[r10] = r0
            int r10 = r10 + 1
            if (r10 >= r11) goto L4c
            goto L41
        L4c:
            int r12 = r9.A00
            long r4 = r9.A01
            long r2 = r9.A02
            long r0 = r9.A03
            X.0xC r7 = X.C19280xC.A00(r8, r7)
            r10 = 0
            r10 = r6[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "percentile_25"
            r7.A0B(r10, r11)
            r10 = 1
            r10 = r6[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "percentile_50"
            r7.A0B(r10, r11)
            r10 = 2
            r10 = r6[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "percentile_75"
            r7.A0B(r10, r11)
            r10 = 3
            r10 = r6[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "percentile_90"
            r7.A0B(r10, r11)
            r10 = 4
            r10 = r6[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r6 = "percentile_99"
            r7.A0B(r6, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            java.lang.String r6 = "instance_size"
            r7.A08(r10, r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "max_sample_value"
            r7.A0B(r4, r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "min_sample_value"
            r7.A0B(r2, r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "sum_sample_value"
            r7.A0B(r0, r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.0xH r0 = X.AbstractC11060iN.A00(r0)
            r0.EHW(r7)
        Lca:
            r0 = -9223372036854775808
            r9.A01 = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.A02 = r0
            r0 = 0
            r9.A03 = r0
            r0 = 0
            r9.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42961yO.A01(X.1yO):void");
    }

    public final void A02(long j) {
        if (this.A06) {
            synchronized (this) {
                A00(j);
            }
        } else {
            A00(j);
        }
    }

    public final void A04(Throwable th) {
        synchronized (this) {
            if (A07 != null) {
                C0w9.A06(this.A05, "", th);
            }
        }
    }

    public final void A05(Map map) {
        String obj;
        C42921yK c42921yK = A07;
        if (c42921yK != null) {
            C19280xC A00 = C19280xC.A00(c42921yK, this.A05);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj2 = map.get(str);
                    if (obj2 == null) {
                        obj = null;
                    } else {
                        obj = obj2.toString();
                    }
                    A00.A0C(str, obj);
                }
            }
            AbstractC11060iN.A00(c42921yK.A00).EHW(A00);
        }
    }

    static {
        C42961yO c42961yO = new C42961yO("oxygen_map_draw_time_ns", false);
        A0F = c42961yO;
        C42961yO c42961yO2 = new C42961yO("oxygen_map_layout_time_ns", false);
        A0L = c42961yO2;
        A0V = new C42961yO("oxygen_map_touch_event_time_ns", false);
        C42961yO c42961yO3 = new C42961yO("oxygen_map_tile_download_time_ns", true);
        A0U = c42961yO3;
        C42961yO c42961yO4 = new C42961yO("oxygen_map_tile_download_size", true);
        A0T = c42961yO4;
        C42961yO c42961yO5 = new C42961yO("oxygen_map_tree_compaction_time", true);
        A0W = c42961yO5;
        C42961yO c42961yO6 = new C42961yO("oxygen_map_marker_draw_time", false);
        A0N = c42961yO6;
        C42961yO c42961yO7 = new C42961yO("oxygen_map_marker_touch_detection_time", false);
        A0O = c42961yO7;
        C42961yO c42961yO8 = new C42961yO("oxygen_map_info_window_draw_time", false);
        A0K = c42961yO8;
        A0M = new C42961yO("oxygen_map_tile_overlay_draw_time_ns", false);
        A0X = new C42961yO[]{c42961yO, c42961yO2, c42961yO3, c42961yO4, c42961yO5, c42961yO6, c42961yO7, c42961yO8};
        A08 = new C42961yO("oxygen_map_bitmap_reuse_error", true);
        A0C = new C42961yO("oxygen_map_disk_cache_null_key_error", true);
        A0E = new C42961yO("oxygen_map_disk_cache_write_error", true);
        A0D = new C42961yO("oxygen_map_disk_cache_read_error", true);
        A0B = new C42961yO("oxygen_map_disk_cache_init_error", true);
        A09 = new C42961yO("oxygen_map_config_fetch_error", true);
        A0S = new C42961yO("oxygen_map_tile_download_error", true);
        A0J = new C42961yO("oxygen_map_empty_cluster_error", true);
        A0R = new C42961yO("oxygen_map_suppressed_drain_to_byte_array_error", true);
        A0P = new C42961yO("oxygen_map_static_map_report_button_clicked", false);
        A0A = new C42961yO("oxygen_map_default_reporter_dialog_clicked", false);
        A0Q = new C42961yO("oxygen_map_static_map_view_impression", false);
        A0I = new C42961yO("oxygen_map_dynamic_map_warm_tti_ns", false);
        A0G = new C42961yO("oxygen_map_dynamic_map_cold_tti_ns", false);
        A0H = new C42961yO("oxygen_map_dynamic_map_stats_per_impression", false);
        A0Y = new Random();
    }

    public C42961yO(String str, boolean z) {
        this.A05 = str;
        this.A06 = z;
    }
}
