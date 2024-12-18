package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;

/* renamed from: X.2CO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CO {
    public ACC A00;
    public final C006802i A01;
    public final C2CI A02;
    public final C2CJ A03;

    public static void A00(C2CO c2co, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        int intValue;
        int intValue2;
        int intValue3;
        String str8;
        String str9;
        if (c2co.A03.A00()) {
            int hashCode = str6.hashCode();
            C006802i c006802i = c2co.A01;
            c006802i.markerStart(28180483, hashCode);
            String A00 = C2CG.A00(str6);
            long j = i;
            if (num5 == null) {
                intValue = 0;
            } else {
                intValue = num5.intValue();
            }
            if (num == null) {
                intValue2 = 0;
            } else {
                intValue2 = num.intValue();
            }
            if (num2 == null) {
                intValue3 = 0;
            } else {
                intValue3 = num2.intValue();
            }
            C10T A002 = C10T.A00();
            synchronized (A002) {
                str8 = A002.A01;
                if (str8.equals("UNKNOWN_TRACEID")) {
                    str8 = "UNKNOWN_SESSIONID";
                }
            }
            if (!str8.equals("UNKNOWN_TRACEID") && !str8.equals("UNKNOWN_SESSIONID")) {
                int indexOf = str8.indexOf(45);
                if (indexOf >= 0) {
                    str8 = str8.substring(0, indexOf);
                }
            } else {
                str8 = null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("time_ms", Long.toString(System.currentTimeMillis()));
            hashMap.put("player_id", str2);
            hashMap.put("vp_session_id", str7);
            switch (num3.intValue()) {
                case 0:
                    str9 = "REQUEST_PLAYING";
                    break;
                case 1:
                    str9 = "START_PLAYING";
                    break;
                case 2:
                    str9 = "CANCEL_START";
                    break;
                case 3:
                    str9 = "PAUSE";
                    break;
                case 4:
                    str9 = "FINISHED";
                    break;
                case 5:
                    str9 = "REPRESENTATION_ENDED";
                    break;
                case 6:
                    str9 = "STALL_STARTED";
                    break;
                case 7:
                    str9 = "STALL_ENDED";
                    break;
                case 8:
                    str9 = "SURFACE_AVAILABLE";
                    break;
                case 9:
                    str9 = "SURFACE_UNAVAILABLE";
                    break;
                case 10:
                    str9 = "AUDIO_ENABLED";
                    break;
                default:
                    str9 = "AUDIO_DISABLED";
                    break;
            }
            hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str9);
            hashMap.put("video_position_ms", Integer.toString(i));
            hashMap.put("video_absolute_position_ms", Long.toString(j));
            String l = Long.toString(0L);
            hashMap.put("video_blackscreen_duration_ms", l);
            hashMap.put("video_buffered_position_ms", l);
            hashMap.put("live_head_position_ms", Long.toString(-1L));
            hashMap.put("video_id", A00);
            if (num4 != null) {
                hashMap.put("streaming_format", C5n6.A01(num4));
            }
            if (str5 != null) {
                hashMap.put("representation_id", str5);
            }
            if (intValue > 0) {
                hashMap.put("video_duration_ms", Integer.toString(intValue));
            }
            if (bool != null) {
                hashMap.put("is_live", bool.toString());
            }
            if (intValue2 > 0) {
                hashMap.put(TraceFieldType.Bitrate, Integer.toString(intValue2));
            }
            if (str4 != null) {
                hashMap.put("quality_label", str4);
            }
            if (intValue3 > 0) {
                hashMap.put("next_bitrate", Integer.toString(intValue3));
            }
            if (str != null) {
                hashMap.put("next_quality_label", str);
            }
            if (str3 != null) {
                hashMap.put("player_origin", str3);
            }
            if (str8 != null) {
                hashMap.put("ta_trace_id", str8);
            }
            if (bool2 != null) {
                hashMap.put("is_sponsored", Boolean.toString(bool2.booleanValue()));
            }
            hashMap.put("ig_video_id", str6);
            C2CF.A0D.A03(28180483, hashCode, hashMap);
            c006802i.markerEnd(28180483, hashCode, (short) 2);
        }
    }

    public C2CO(C006802i c006802i, C2CI c2ci, C2CJ c2cj) {
        this.A03 = c2cj;
        this.A01 = c006802i;
        this.A02 = c2ci;
    }
}
