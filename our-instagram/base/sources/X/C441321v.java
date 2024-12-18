package X;

import ca.psiphon.PsiphonTunnel;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.21v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C441321v implements Serializable {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final double A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final EnumC440821q A0W;
    public final EnumC440821q A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    public C441321v(EnumC440821q enumC440821q, EnumC440821q enumC440821q2, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0a = str3;
        this.A0A = i3;
        this.A00 = d;
        this.A0U = i23;
        this.A01 = d2;
        this.A02 = d3;
        this.A06 = d7;
        this.A07 = d8;
        this.A05 = d6;
        this.A0Q = i19;
        this.A0T = i22;
        this.A0i = z8;
        this.A0b = z;
        this.A0c = z2;
        this.A0d = z3;
        this.A0O = i17;
        this.A0N = i16;
        this.A0P = i18;
        this.A03 = d4;
        this.A04 = d5;
        this.A08 = i;
        this.A09 = i2;
        this.A0B = i4;
        this.A0Z = str2;
        this.A0W = enumC440821q;
        this.A0X = enumC440821q2;
        this.A0e = z4;
        this.A0F = i8;
        this.A0R = i20;
        this.A0S = i21;
        this.A0Y = str;
        this.A0E = i7;
        this.A0K = i13;
        this.A0V = i24;
        this.A0f = z5;
        this.A0D = i6;
        this.A0J = i12;
        this.A0C = i5;
        this.A0I = i11;
        this.A0h = z7;
        this.A0H = i10;
        this.A0M = i15;
        this.A0G = i9;
        this.A0L = i14;
        this.A0g = z6;
    }

    public static C441321v A01(String str) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int A00 = A00("desired_buffer", jSONObject, 6000);
            int A002 = A00("min_time_between_speed_changes_ms", jSONObject, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            int A003 = A00("max_time_between_speed_changes_ms", jSONObject, 10000);
            try {
                d = jSONObject.getDouble("pid_integral_param");
            } catch (JSONException unused) {
                d = 6.0E-6d;
            }
            try {
                d2 = jSONObject.getDouble("pid_proportional_param");
            } catch (JSONException unused2) {
                d2 = 8.0E-6d;
            }
            int A004 = A00("adjust_speed_top_threshold_ms", jSONObject, 700);
            int A005 = A00("adjust_speed_bottom_threshold_ms", jSONObject, PsiphonTunnel.VPN_INTERFACE_MTU);
            int A006 = A00("desired_buffer_acceptable_error_ms", jSONObject, 200);
            int A007 = A00("pid_integral_bound_ms", jSONObject, 10000);
            try {
                d3 = jSONObject.getDouble("speedup_bandwidth_multiplier");
            } catch (JSONException unused3) {
                d3 = 2.0d;
            }
            try {
                d4 = jSONObject.getDouble("threshold_to_adjust_playback_speed");
            } catch (JSONException unused4) {
                d4 = 0.03d;
            }
            try {
                d5 = jSONObject.getDouble("threshold_to_set_regular_speed");
            } catch (JSONException unused5) {
                d5 = 0.04d;
            }
            try {
                d6 = jSONObject.getDouble("threshold_between_speeds");
            } catch (JSONException unused6) {
                d6 = 0.101d;
            }
            boolean A02 = A02("use_simple_speed_controller", jSONObject);
            boolean A022 = A02("enable_immediate_live_buffer_trim", jSONObject);
            boolean A023 = A02("enable_latency_manager_rate_limiting", jSONObject);
            boolean A024 = A02("enable_live_buffer_meter", jSONObject);
            int A008 = A00("initial_buffer_trim_target_ms", jSONObject, 3500);
            int A009 = A00("initial_buffer_trim_period_ms", jSONObject, 5000);
            int A0010 = A00("initial_buffer_trim_threshold_ms", jSONObject, 1000);
            try {
                d7 = jSONObject.getDouble("stream_latency_max_speed_delta");
            } catch (JSONException unused7) {
                d7 = 0.2d;
            }
            try {
                d8 = jSONObject.getDouble("stream_latency_min_speed_delta");
            } catch (JSONException unused8) {
                d8 = 0.1d;
            }
            try {
                str2 = jSONObject.getString("client_latency_setting");
            } catch (JSONException unused9) {
                str2 = null;
            }
            String str3 = null;
            try {
                str3 = jSONObject.getString("fallback_level");
            } catch (JSONException unused10) {
            }
            EnumC440821q A0011 = C440521n.A00(str3);
            String str4 = null;
            try {
                str4 = jSONObject.getString("upgrade_level");
            } catch (JSONException unused11) {
            }
            EnumC440821q A0012 = C440521n.A00(str4);
            boolean A025 = A02("fallback_on_cell", jSONObject);
            int A0013 = A00("fallback_stalls_threshold_ms", jSONObject, 100000);
            int A0014 = A00("min_playback_duration_to_fallback_ms", jSONObject, 0);
            String str5 = "";
            try {
                str5 = jSONObject.getString("allowed_data_connection_qualities");
            } catch (JSONException unused12) {
            }
            if (str5 == null) {
                str5 = "";
            }
            int A0015 = A00("min_time_between_latency_level_change_ms", jSONObject, 0);
            int A0016 = A00("fallback_bitrate_threshold", jSONObject, -1);
            int A0017 = A00("fallup_bitrate_threshold", jSONObject, -1);
            int A0018 = A00("request_chunking_duration_ms", jSONObject, 0);
            boolean A026 = A02("should_fallback_if_not_quic", jSONObject);
            int A0019 = A00("fallback_bandwidth_threshold", jSONObject, -1);
            int A0020 = A00("fallup_bandwidth_threshold", jSONObject, -1);
            int A0021 = A00("fallback_bandwidth_confidence", jSONObject, 50);
            int A0022 = A00("fallup_bandwidth_confidence", jSONObject, 50);
            A00("fallback_abr_index", jSONObject, -1);
            A00("fallup_abr_index", jSONObject, -1);
            return new C441321v(A0011, A0012, str5, str2, str, d, d2, d3, d7, d8, d6, d4, d5, A005, A004, A00, A006, A0021, A0019, A0016, A0013, A00("fallback_ttfb_ms_confidence", jSONObject, 50), A00("fallback_ttfb_ms_threshold", jSONObject, -1), A0022, A0020, A0017, A00("fallup_ttfb_ms_confidence", jSONObject, 50), A00("fallup_ttfb_ms_threshold", jSONObject, -1), A009, A008, A0010, A003, A0014, A0015, A002, A007, A0018, A022, A023, A024, A025, A026, A02("start_playback_with_regular_latency", jSONObject), A02("use_end_of_transfer_buffer_size", jSONObject), A02);
        } catch (JSONException unused13) {
            return null;
        }
    }

    public static boolean A02(String str, JSONObject jSONObject) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getBoolean(str);
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public C441321v(C440521n c440521n) {
        this.A0a = "";
        this.A0A = c440521n.A07;
        this.A00 = c440521n.A00;
        this.A0U = c440521n.A0I;
        this.A01 = c440521n.A01;
        this.A02 = c440521n.A02;
        this.A06 = c440521n.A05;
        this.A07 = c440521n.A06;
        this.A05 = 0.0d;
        this.A0Q = c440521n.A0E;
        this.A0T = c440521n.A0H;
        this.A0i = c440521n.A0Q;
        this.A0b = c440521n.A0M;
        this.A0c = false;
        this.A0d = c440521n.A0N;
        this.A0O = c440521n.A0C;
        this.A0N = c440521n.A0B;
        this.A0P = c440521n.A0D;
        this.A03 = c440521n.A03;
        this.A04 = c440521n.A04;
        this.A08 = 0;
        this.A09 = 0;
        this.A0B = 0;
        this.A0Z = c440521n.A0L;
        this.A0W = c440521n.A0J;
        this.A0X = c440521n.A0K;
        this.A0e = c440521n.A0O;
        this.A0F = c440521n.A08;
        this.A0R = c440521n.A0F;
        this.A0S = c440521n.A0G;
        this.A0Y = "";
        this.A0E = -1;
        this.A0K = c440521n.A09;
        this.A0V = 0;
        this.A0f = false;
        this.A0D = -1;
        this.A0J = -1;
        this.A0C = 50;
        this.A0I = 50;
        this.A0h = false;
        this.A0H = -1;
        this.A0M = c440521n.A0A;
        this.A0G = 50;
        this.A0L = 50;
        this.A0g = c440521n.A0P;
    }

    public static int A00(String str, JSONObject jSONObject, int i) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getInt(str);
            }
            return i;
        } catch (JSONException unused) {
            return i;
        }
    }

    public C441321v() {
        this.A0a = "";
        this.A0A = 6000;
        this.A00 = 6.0E-6d;
        this.A01 = 8.0E-6d;
        this.A0U = 10000;
        this.A02 = 2.0d;
        this.A06 = 0.03d;
        this.A07 = 0.04d;
        this.A05 = 0.101d;
        this.A0Q = 10000;
        this.A0T = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.A0i = false;
        this.A0b = false;
        this.A0c = false;
        this.A0d = false;
        this.A0O = 3500;
        this.A0N = 5000;
        this.A0P = 1000;
        this.A03 = 0.2d;
        this.A04 = 0.1d;
        this.A09 = 700;
        this.A08 = PsiphonTunnel.VPN_INTERFACE_MTU;
        this.A0B = 200;
        this.A0Z = "normal:production";
        this.A0W = EnumC440821q.A02;
        this.A0X = EnumC440821q.A06;
        this.A0e = false;
        this.A0F = 100000;
        this.A0R = 0;
        this.A0S = 0;
        this.A0Y = "";
        this.A0E = 0;
        this.A0K = 0;
        this.A0V = 0;
        this.A0f = false;
        this.A0J = -1;
        this.A0D = -1;
        this.A0I = 50;
        this.A0C = 50;
        this.A0h = false;
        this.A0H = -1;
        this.A0M = -1;
        this.A0G = 50;
        this.A0L = 50;
        this.A0g = false;
    }
}
