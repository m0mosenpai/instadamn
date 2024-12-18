package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.4SU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SU extends C30P {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final UserSession A0G;
    public final C145776ha A0H;
    public final String A0I;
    public final String A0J;
    public final Context A0K;
    public final RealtimeClientManager A0L;
    public final C145826hf A0M;
    public final C1M1 A0N;
    public final InterfaceC08830cm A0O;
    public final InterfaceC08830cm A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4SU(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, RealtimeClientManager realtimeClientManager, C145826hf c145826hf, C145776ha c145776ha, C1M1 c1m1, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        super(interfaceC60442pS, c1m1.getSessionId());
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c145826hf, 5);
        this.A0K = context;
        this.A0G = userSession;
        this.A0O = interfaceC08830cm;
        this.A0P = interfaceC08830cm2;
        this.A0M = c145826hf;
        this.A0L = realtimeClientManager;
        this.A0H = c145776ha;
        this.A0I = str;
        this.A0N = c1m1;
        this.A0J = c1m1.getSessionId();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C14360o3.A0B(c19280xC, 0);
        A0C();
        A00();
        ?? obj = new Object();
        Integer num = this.A07;
        obj.A0A = num;
        if (num != null) {
            c19280xC.A08(num, "session_reel_counter");
        }
        String str = this.A0I;
        obj.A0a = str;
        if (str != null) {
            c19280xC.A0C("tray_session_id", str);
        }
        Integer num2 = this.A0B;
        obj.A0N = num2;
        if (num2 != null) {
            c19280xC.A08(num2, "tray_position");
        }
        Integer num3 = this.A06;
        obj.A0K = num3;
        if (num3 != null) {
            c19280xC.A08(num3, "reel_position");
        }
        Integer num4 = this.A09;
        obj.A0L = num4;
        if (num4 != null) {
            c19280xC.A08(num4, "reel_size");
        }
        Boolean bool = this.A02;
        if (bool != null) {
            Integer valueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            obj.A0H = valueOf;
            c19280xC.A08(valueOf, "mqtt_connection_status");
        }
        Integer num5 = this.A05;
        obj.A06 = num5;
        if (num5 != null) {
            c19280xC.A08(num5, "battery_level");
        }
        String str2 = this.A0C;
        obj.A0Q = str2;
        if (str2 != null) {
            c19280xC.A0C("battery_status", str2);
        }
        String str3 = c19280xC.A04;
        if ("video_paused".equals(str3) || "video_buffering_started".equals(str3)) {
            Integer num6 = this.A0A;
            obj.A0M = num6;
            if (num6 != null) {
                c19280xC.A08(num6, "stale_mpd_count");
            }
        }
        Boolean bool2 = this.A03;
        if (bool2 != null) {
            Integer valueOf2 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
            obj.A0E = valueOf2;
            c19280xC.A08(valueOf2, "live_donation");
        }
        Integer num7 = this.A08;
        obj.A0J = num7;
        if (num7 != null) {
            c19280xC.A08(num7, "number_of_qualities");
        }
        if ("video_should_start".equals(c19280xC.A04)) {
            String str4 = this.A0F;
            obj.A0b = str4;
            if (str4 != null) {
                c19280xC.A0C("trigger", str4);
            }
        }
        Boolean bool3 = this.A04;
        if (bool3 != null) {
            Integer valueOf3 = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
            obj.A0F = valueOf3;
            c19280xC.A08(valueOf3, "is_live_streaming");
        }
        String str5 = this.A0D;
        String str6 = this.A0E;
        if (str6 != null || str5 != null) {
            obj.A0Y = str6;
            if (str6 != null) {
                C19260xA c19260xA = obj.A01;
                if (c19260xA == null) {
                    c19260xA = new C19260xA();
                    obj.A01 = c19260xA;
                }
                if (str6.length() != 0) {
                    C19260xA.A00(c19260xA, str6, "story_preview_media_owner_id");
                }
                obj.A01 = c19260xA;
            }
            obj.A0X = str5;
            if (str5 != null) {
                C19260xA c19260xA2 = obj.A01;
                if (c19260xA2 == null) {
                    c19260xA2 = new C19260xA();
                    obj.A01 = c19260xA2;
                }
                if (str5.length() != 0) {
                    C19260xA.A00(c19260xA2, str5, "story_preview_media_id");
                }
                obj.A01 = c19260xA2;
            }
            C19260xA c19260xA3 = obj.A01;
            if (c19260xA3 != null) {
                c19280xC.A05(c19260xA3, "adhoc_data");
            }
        }
        Boolean bool4 = this.A00;
        if (bool4 != null) {
            boolean booleanValue = bool4.booleanValue();
            Integer valueOf4 = Integer.valueOf(booleanValue ? 1 : 0);
            obj.A0C = valueOf4;
            if (valueOf4 != null && booleanValue) {
                c19280xC.A0C("has_igtv_video", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
        }
        Boolean bool5 = this.A01;
        if (bool5 != null) {
            boolean booleanValue2 = bool5.booleanValue();
            Integer valueOf5 = Integer.valueOf(booleanValue2 ? 1 : 0);
            obj.A0D = valueOf5;
            if (valueOf5 != null && booleanValue2) {
                c19280xC.A0C("has_reshared_clips_video", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
        }
        if (c4sw != null) {
            c4sw.A07 = obj;
        }
    }

    public final void A0C() {
        this.A07 = null;
        this.A0B = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A0C = null;
        this.A0A = null;
        this.A03 = null;
        this.A08 = null;
        this.A0F = null;
        this.A04 = null;
        this.A0E = null;
        this.A0D = null;
        this.A00 = null;
        this.A01 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r1 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SU.A00():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0106, code lost:
    
        if (r0.booleanValue() == false) goto L58;
     */
    @Override // X.C30P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C4T2 A06(X.C4T2 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SU.A06(X.4T2, java.lang.Object):X.4T2");
    }
}
