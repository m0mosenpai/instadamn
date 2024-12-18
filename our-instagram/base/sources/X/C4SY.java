package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4SY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SY {
    public C0x9 A0R;
    public C0x9 A0S;
    public C0x9 A0T;
    public C75363a3 A0U;
    public Boolean A0V;
    public Boolean A0W;
    public Boolean A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public Integer A0b;
    public Long A0c;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public ArrayList A1G;
    public ArrayList A1H;
    public ArrayList A1I;
    public List A1J;
    public boolean A1K;
    public boolean A1L;
    public final Context A1M;
    public final UserSession A1N;
    public final InterfaceC60442pS A1O;
    public final C4SW A1P;
    public final String A1Q;
    public int A0C = -1;
    public int A09 = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0A = -1;
    public int A0F = -1;
    public int A08 = -1;
    public int A0E = -1;
    public int A06 = -1;
    public int A0G = -1;
    public float A02 = Float.NaN;
    public float A03 = Float.NaN;
    public double A00 = Double.NaN;
    public long A0Q = -1;
    public String A1B = NetInfoModule.CONNECTION_TYPE_NONE;
    public int A0I = -1;
    public int A0B = -1;
    public int A0N = -1;
    public int A0P = -1;
    public int A0O = -1;
    public int A0J = -1;
    public int A0M = -1;
    public int A0H = -1;
    public float A05 = Float.NaN;
    public float A04 = Float.NaN;
    public String A0d = null;
    public float A01 = Float.NaN;
    public int A0D = -1;
    public int A07 = -1;

    public final void A00(C30P c30p) {
        String str;
        String str2;
        C4SX A00;
        String A0R;
        C19280xC A002 = C19280xC.A00(this.A1O, this.A1Q);
        C95684Sc c95684Sc = new C95684Sc();
        A002.A0C("app_startup_type", C1CC.A09.toString());
        A002.A08(Integer.valueOf(C1CC.A00()), "app_startup_time_bucket");
        String str3 = this.A1E;
        if (str3 != null) {
            c95684Sc.A1L = str3;
            A002.A0C("video_type", str3);
        }
        String str4 = this.A1C;
        if (str4 != null) {
            c95684Sc.A1J = str4;
            A002.A0C("upload_id", str4);
        }
        String str5 = this.A0w;
        if (str5 != null) {
            c95684Sc.A10 = str5;
            A002.A0C("m_pk", str5);
        }
        String str6 = this.A10;
        if (str6 != null) {
            c95684Sc.A15 = str6;
            A002.A0C("parent_m_pk", str6);
        }
        Boolean bool = this.A0X;
        if (bool != null) {
            A002.A09("author_is_private", bool);
        }
        String str7 = this.A0u;
        if (str7 != null) {
            c95684Sc.A0y = str7;
            A002.A0C("inventory_source", str7);
        }
        String str8 = this.A16;
        if (str8 != null) {
            c95684Sc.A1C = str8;
            A002.A0C("representation_id", str8);
        }
        String str9 = this.A0h;
        if (str9 != null) {
            c95684Sc.A0k = str9;
        }
        String str10 = this.A0j;
        if (str10 != null) {
            if (str10.length() == 0) {
                A0R = "AuthorId is empty.";
            } else if (AbstractC001900j.A0a(str10, "_", false)) {
                A0R = AnonymousClass001.A0R("AuthorId contains an underscore: ", str10);
            } else {
                A00 = C4SX.A00(str10);
                c95684Sc.A00 = A00;
                A002.A0C("a_pk", str10);
            }
            C0w9.A03("CoreExtrasAdapter", A0R);
            A00 = new C4SX(0L);
            c95684Sc.A00 = A00;
            A002.A0C("a_pk", str10);
        }
        Long l = this.A0c;
        if (l != null) {
            c95684Sc.A0f = l;
            A002.A0B("m_ts", l);
        }
        String str11 = this.A1A;
        if (str11 != null) {
            c95684Sc.A1H = str11;
            A002.A0C("tracking_token", str11);
        }
        String str12 = this.A0r;
        if (str12 != null) {
            c95684Sc.A0v = str12;
            A002.A0C("follow_status", str12);
        }
        int i = this.A0C;
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            c95684Sc.A0S = valueOf;
            A002.A08(valueOf, "m_ix");
        }
        int i2 = this.A09;
        if (i2 != -1) {
            Float valueOf2 = Float.valueOf(i2 / 1000.0f);
            c95684Sc.A0H = valueOf2;
            C19260xA.A00(A002.A06, valueOf2, "time");
        }
        int i3 = this.A0K;
        if (i3 != -1) {
            Float valueOf3 = Float.valueOf(i3 / 1000.0f);
            c95684Sc.A0N = valueOf3;
            C19260xA.A00(A002.A06, valueOf3, "from_time");
        }
        int i4 = this.A0L;
        if (i4 != -1) {
            Float valueOf4 = Float.valueOf(i4 / 1000.0f);
            c95684Sc.A0O = valueOf4;
            C19260xA.A00(A002.A06, valueOf4, "to_time");
        }
        String str13 = this.A18;
        if (str13 != null) {
            c95684Sc.A1F = str13;
            A002.A0C("seek_reason", str13);
        }
        int i5 = this.A08;
        if (i5 != -1) {
            C19260xA.A00(A002.A06, Float.valueOf(i5 / 1000.0f), "broadcast_time");
        }
        int i6 = this.A0A;
        if (i6 != -1) {
            Float valueOf5 = Float.valueOf(i6 / 1000.0f);
            c95684Sc.A0I = valueOf5;
            C19260xA.A00(A002.A06, valueOf5, "duration");
        }
        double d = this.A00;
        if (!Double.isNaN(d)) {
            Double valueOf6 = Double.valueOf(d);
            c95684Sc.A0D = valueOf6;
            A002.A0A("timeAsPercent", valueOf6);
        }
        Boolean bool2 = this.A0V;
        if (bool2 != null) {
            c95684Sc.A04 = bool2;
            if (bool2.equals(true)) {
                str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str2 = "0";
            }
            A002.A0C("playing_audio", str2);
        }
        Boolean bool3 = this.A0W;
        if (bool3 != null) {
            c95684Sc.A05 = bool3;
            if (bool3.equals(true)) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A002.A0C("audio_fetched", str);
        }
        String str14 = this.A0z;
        if (str14 != null) {
            c95684Sc.A14 = str14;
            A002.A0C("original_start_reason", str14);
        }
        String str15 = this.A15;
        if (str15 != null) {
            c95684Sc.A1B = str15;
            A002.A0C("reason", str15);
        }
        String str16 = this.A0q;
        if (str16 != null) {
            c95684Sc.A0u = str16;
            A002.A0C("error_message", str16);
        }
        long j = this.A0Q;
        if (j != -1) {
            Long valueOf7 = Long.valueOf(j);
            c95684Sc.A0e = valueOf7;
            A002.A0B("start_delay", valueOf7);
        }
        Boolean bool4 = this.A0Y;
        if (bool4 != null) {
            c95684Sc.A06 = bool4;
            A002.A09("cached", bool4);
        }
        Boolean bool5 = this.A0a;
        if (bool5 != null) {
            c95684Sc.A0A = bool5;
            A002.A09("warmed", bool5);
        }
        int i7 = this.A0F;
        if (i7 != -1) {
            Float valueOf8 = Float.valueOf(i7 / 1000.0f);
            c95684Sc.A0J = valueOf8;
            C19260xA.A00(A002.A06, valueOf8, "lsp");
        }
        int i8 = this.A0E;
        if (i8 != -1) {
            C19260xA.A00(A002.A06, Float.valueOf(i8 / 1000.0f), "broadcast_lsp");
        }
        int i9 = this.A06;
        if (i9 != -1) {
            Float valueOf9 = Float.valueOf(i9 / 1000.0f);
            c95684Sc.A0F = valueOf9;
            C19260xA.A00(A002.A06, valueOf9, AbstractC111324zv.A00(2010));
        }
        int i10 = this.A0G;
        if (i10 != -1) {
            Float valueOf10 = Float.valueOf(i10 / 1000.0f);
            c95684Sc.A0K = valueOf10;
            C19260xA.A00(A002.A06, valueOf10, AbstractC111324zv.A00(2673));
        }
        int i11 = this.A07;
        if (i11 != -1) {
            Float valueOf11 = Float.valueOf(i11 / 1000.0f);
            c95684Sc.A0G = valueOf11;
            C19260xA.A00(A002.A06, valueOf11, "buffering_duration");
        }
        float f = this.A02;
        if (!Float.isNaN(f)) {
            Float valueOf12 = Float.valueOf(f);
            c95684Sc.A0L = valueOf12;
            C19260xA.A00(A002.A06, valueOf12, "loop_count");
        }
        float f2 = this.A03;
        if (!Float.isNaN(f2)) {
            Float valueOf13 = Float.valueOf(f2);
            c95684Sc.A0M = valueOf13;
            C19260xA.A00(A002.A06, valueOf13, TraceFieldType.RetryCount);
        }
        Boolean bool6 = this.A0Z;
        if (bool6 != null) {
            c95684Sc.A08 = bool6;
            A002.A09("streaming", bool6);
        }
        int i12 = this.A0I;
        if (i12 != -1) {
            Integer valueOf14 = Integer.valueOf(i12);
            c95684Sc.A0V = valueOf14;
            A002.A08(valueOf14, "prefetch_size");
        }
        String str17 = this.A0i;
        if (str17 != null) {
            c95684Sc.A0l = str17;
            A002.A0C(CacheBehaviorLogger.SOURCE, str17);
        }
        int i13 = this.A0B;
        if (i13 != -1) {
            Integer valueOf15 = Integer.valueOf(i13);
            c95684Sc.A0R = valueOf15;
            A002.A08(valueOf15, "elapsed_time");
        }
        int i14 = this.A0N;
        if (i14 != -1) {
            Integer valueOf16 = Integer.valueOf(i14);
            c95684Sc.A0Z = valueOf16;
            A002.A08(valueOf16, MSV.A00(599));
        }
        String str18 = this.A1F;
        if (str18 != null) {
            c95684Sc.A1M = str18;
            A002.A0C("viewer_session_id", str18);
        }
        String str19 = this.A0m;
        if (str19 != null) {
            c95684Sc.A0p = str19;
            A002.A0C("chaining_session_id", str19);
        }
        int i15 = this.A0P;
        if (i15 != -1) {
            Integer valueOf17 = Integer.valueOf(i15);
            c95684Sc.A0c = valueOf17;
            A002.A08(valueOf17, "video_width");
        }
        int i16 = this.A0O;
        if (i16 != -1) {
            Integer valueOf18 = Integer.valueOf(i16);
            c95684Sc.A0a = valueOf18;
            A002.A08(valueOf18, "video_height");
        }
        float f3 = this.A01;
        if (!Float.isNaN(f3)) {
            Float valueOf19 = Float.valueOf(f3);
            c95684Sc.A0E = valueOf19;
            C19260xA.A00(A002.A06, valueOf19, TraceFieldType.Bitrate);
        }
        String str20 = this.A0y;
        if (str20 != null) {
            c95684Sc.A12 = str20;
            A002.A0C("mime_type", str20);
        }
        int i17 = this.A0J;
        if (i17 != -1) {
            Integer valueOf20 = Integer.valueOf(i17);
            c95684Sc.A0W = valueOf20;
            A002.A08(valueOf20, "recent_bandwidth");
        }
        String str21 = this.A0g;
        if (str21 != null) {
            c95684Sc.A0j = str21;
        }
        int i18 = this.A0D;
        if (i18 != -1) {
            Integer valueOf21 = Integer.valueOf(i18);
            c95684Sc.A0T = valueOf21;
            A002.A08(valueOf21, "is_dash_eligible");
        }
        String str22 = this.A1D;
        if (str22 != null) {
            c95684Sc.A1K = str22;
            A002.A0C("video_codec", str22);
        }
        String str23 = this.A11;
        if (str23 != null) {
            c95684Sc.A16 = str23;
            A002.A0C("playback_format", str23);
        }
        String str24 = this.A0e;
        if (str24 != null) {
            c95684Sc.A0h = str24;
            A002.A0C("audience", str24);
        }
        String str25 = this.A19;
        if (str25 != null) {
            c95684Sc.A1G = str25;
            A002.A0C("tracker_id", str25);
        }
        C0x9 c0x9 = this.A0S;
        if (c0x9 != null) {
            c95684Sc.A02 = c0x9;
            A002.A06(c0x9, "historical_requested_bytes");
            c95684Sc.A1O = this.A1H;
        }
        C0x9 c0x92 = this.A0R;
        if (c0x92 != null) {
            c95684Sc.A01 = c0x92;
            A002.A06(c0x92, "historical_avg_bitrate");
            c95684Sc.A1N = this.A1G;
        }
        C0x9 c0x93 = this.A0T;
        if (c0x93 != null) {
            c95684Sc.A03 = c0x93;
            A002.A06(c0x93, "historical_stream_type");
            c95684Sc.A1P = this.A1I;
        }
        int i19 = this.A0M;
        if (i19 != -1) {
            Integer valueOf22 = Integer.valueOf(i19);
            c95684Sc.A0Y = valueOf22;
            A002.A08(valueOf22, "seq_num");
        }
        int i20 = this.A0H;
        if (i20 != -1) {
            Integer valueOf23 = Integer.valueOf(i20);
            c95684Sc.A0U = valueOf23;
            A002.A08(valueOf23, "pip");
        }
        float f4 = this.A05;
        if (!Float.isNaN(f4)) {
            Float valueOf24 = Float.valueOf(f4);
            c95684Sc.A0Q = valueOf24;
            C19260xA.A00(A002.A06, valueOf24, "view_width");
        }
        float f5 = this.A04;
        if (!Float.isNaN(f5)) {
            Float valueOf25 = Float.valueOf(f5);
            c95684Sc.A0P = valueOf25;
            C19260xA.A00(A002.A06, valueOf25, "view_height");
        }
        String str26 = this.A0d;
        if (str26 != null) {
            c95684Sc.A0g = str26;
            A002.A0C("app_orientation", str26);
        }
        String str27 = this.A0p;
        if (str27 != null) {
            c95684Sc.A0t = str27;
            A002.A0C("effect_id", str27);
            String str28 = this.A0n;
            if (str28 == null) {
                str28 = "";
            }
            c95684Sc.A0r = str28;
            A002.A0C("channel_pk", str28);
        }
        String str29 = this.A14;
        if (str29 != null) {
            c95684Sc.A1A = str29;
            A002.A0C("ranking_info_token", str29);
        }
        String str30 = this.A0x;
        if (str30 != null) {
            c95684Sc.A11 = str30;
            A002.A0C("mezql_token", str30);
        }
        String str31 = this.A0o;
        if (str31 != null) {
            c95684Sc.A0s = str31;
            A002.A0C("discovery_session_id", str31);
        }
        String str32 = this.A0l;
        if (str32 != null) {
            c95684Sc.A0o = str32;
            A002.A0C("camera_session_id", str32);
        }
        Boolean valueOf26 = Boolean.valueOf(this.A1L);
        c95684Sc.A09 = valueOf26;
        A002.A09("is_video_to_carousel", valueOf26);
        List list = this.A1J;
        if (list != null) {
            c95684Sc.A1R = list;
            A002.A0D("video_to_carousel_cut_secs", list);
            Integer valueOf27 = Integer.valueOf(list.size());
            c95684Sc.A0b = valueOf27;
            A002.A08(valueOf27, "segment_count");
        }
        String str33 = this.A1B;
        c95684Sc.A1I = str33;
        A002.A0C("a_i", str33);
        UserSession userSession = this.A1N;
        java.util.Set set = C95694Sd.A0I;
        C95694Sd c95694Sd = (C95694Sd) userSession.A01(C95694Sd.class, new C9EK(userSession, 44));
        if (c95694Sd != null) {
            c95694Sd.A03(null, A002, c95684Sc, this.A0U, this.A0w);
        }
        String str34 = this.A0s;
        if (str34 != null) {
            c95684Sc.A0w = str34;
            A002.A0C("displayed_frames", str34);
        }
        Boolean valueOf28 = Boolean.valueOf(this.A1K);
        c95684Sc.A07 = valueOf28;
        A002.A09("is_secondary_channel_enabled", valueOf28);
        Integer num = this.A0b;
        if (num != null) {
            c95684Sc.A0d = num;
            A002.A08(num, "current_viewability_percentage");
        }
        String str35 = this.A0v;
        if (str35 != null) {
            c95684Sc.A0z = str35;
            A002.A0C("session_validation_token", str35);
        }
        String str36 = this.A0k;
        if (str36 != null) {
            c95684Sc.A0n = str36;
            A002.A0C("buffering_reason", str36);
        }
        String str37 = C1QM.A00.A02.A00;
        c95684Sc.A13 = str37;
        A002.A0C("nav_chain", str37);
        String str38 = this.A17;
        if (str38 != null) {
            c95684Sc.A1E = str38;
            A002.A0C("search_session_id", str38);
        }
        String str39 = this.A13;
        if (str39 != null) {
            c95684Sc.A19 = str39;
            A002.A0C("rank_token", str39);
        }
        String str40 = this.A12;
        if (str40 != null) {
            c95684Sc.A17 = str40;
            A002.A0C("query_text", str40);
        }
        String str41 = this.A0t;
        if (str41 != null) {
            c95684Sc.A0x = str41;
            A002.A0C("host_profile_id", str41);
        }
        String str42 = this.A0f;
        if (str42 != null) {
            c95684Sc.A0i = str42;
            A002.A0C("audio_derived_content_id", str42);
        }
        C4SW c4sw = this.A1P;
        c4sw.A06 = c95684Sc;
        c30p.A0A(A002, c4sw);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C4SH r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SY.A01(X.4SH):void");
    }

    public C4SY(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C4SW c4sw, String str) {
        this.A1Q = str;
        this.A1P = c4sw;
        this.A1O = interfaceC60442pS;
        this.A1N = userSession;
        this.A1M = context;
    }
}
