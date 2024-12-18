package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class OQI {
    public static N3J parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            N3J n3j = new N3J();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    HashMap hashMap = null;
                    if ("upload_url".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        n3j.A0H = A0m;
                    } else if ("fbvp_tcp_upload_url".equals(A0s)) {
                        String A0m2 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m2, 0);
                        n3j.A0F = A0m2;
                    } else if ("fbvp_quic_upload_url".equals(A0s)) {
                        String A0m3 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m3, 0);
                        n3j.A0E = A0m3;
                    } else if ("fbvp_fallback_upload_url".equals(A0s)) {
                        String A0m4 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m4, 0);
                        n3j.A0D = A0m4;
                    } else if (TraceFieldType.BroadcastId.equals(A0s)) {
                        String A0m5 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m5, 0);
                        n3j.A0C = A0m5;
                    } else if ("max_allowed_participants".equals(A0s)) {
                        n3j.A03 = c16l.A1D();
                    } else if ("max_time_in_seconds".equals(A0s)) {
                        n3j.A0B = c16l.A0y();
                    } else if ("stream_video_width".equals(A0s)) {
                        n3j.A0A = c16l.A1D();
                    } else if ("stream_video_bit_rate".equals(A0s)) {
                        n3j.A08 = c16l.A1D();
                    } else if ("stream_video_fps".equals(A0s)) {
                        n3j.A09 = c16l.A1D();
                    } else if ("stream_audio_sample_rate".equals(A0s)) {
                        n3j.A07 = c16l.A1D();
                    } else if ("stream_audio_channels".equals(A0s)) {
                        n3j.A05 = c16l.A1D();
                    } else if ("stream_audio_bit_rate".equals(A0s)) {
                        n3j.A04 = c16l.A1D();
                    } else if ("stream_audio_profile".equals(A0s)) {
                        n3j.A06 = c16l.A1D();
                    } else if ("heartbeat_interval".equals(A0s)) {
                        c16l.A1D();
                    } else if ("pass_thru_enabled".equals(A0s)) {
                        n3j.A0L = c16l.A0d();
                    } else if ("display_server_message".equals(A0s)) {
                        n3j.A00 = c16l.A1D();
                    } else if ("live_trace_enabled".equals(A0s)) {
                        n3j.A0K = c16l.A0d();
                    } else if ("live_trace_sample_interval_in_seconds".equals(A0s)) {
                        n3j.A01 = c16l.A1D();
                    } else if ("live_trace_sampling_source".equals(A0s)) {
                        n3j.A02 = c16l.A1D();
                    } else if ("server_abr_enabled".equals(A0s)) {
                        n3j.A0M = c16l.A0d();
                    } else if ("is_premium".equals(A0s)) {
                        n3j.A0J = c16l.A0d();
                    } else if ("live_badge_setting".equals(A0s)) {
                        AbstractC109824x9.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("stream_initial_bitrate_prediction".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    Double valueOf = Double.valueOf(c16l.A0U());
                                    if (valueOf != null) {
                                        A1G.put(A1P, valueOf);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        C14360o3.A0B(hashMap, 0);
                        n3j.A0I = hashMap;
                    } else if ("stream_ig_quality_mos".equals(A0s)) {
                        String A0m6 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m6, 0);
                        n3j.A0G = A0m6;
                    } else {
                        C55702hA.A01(c16l, n3j, A0s);
                    }
                    c16l.A0z();
                } else {
                    return n3j;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
