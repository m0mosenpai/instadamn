package X;

import android.content.Context;
import android.util.Base64;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93864Jw extends RealtimeEventHandler {
    public final Context A00;
    public final UserSession A01;
    public final C1WO A02;
    public final C19L A03;

    public C93864Jw(Context context, UserSession userSession, C1WO c1wo) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1wo, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c1wo;
        this.A03 = AnonymousClass194.A01();
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        C14360o3.A0B(str, 0);
        if ((RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str) && "4".equals(str2)) || RealtimeConstants.MQTT_TOPIC_RTC_MULTI.equals(str)) {
            return true;
        }
        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.VIDEO_CALL_IN_CALL_ALERT_QUERY_ID.equals(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
        ?? r2;
        C19L c19l;
        InterfaceC16620sF jqe;
        C14360o3.A0B(c5ez, 0);
        String str = c5ez.A00;
        String A00 = AbstractC58317Pt9.A00(31);
        if (realtimePayload != null) {
            C14360o3.A07(str);
            if (canHandleRealtimeEvent(str, realtimePayload.subTopic)) {
                UserSession userSession = this.A01;
                if (C18U.A06(C06090Tz.A05, userSession, 36317470361261248L)) {
                    String str2 = realtimePayload.subTopic;
                    if (RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str) && "4".equals(str2)) {
                        String str3 = realtimePayload.stringPayload;
                        C14360o3.A06(str3);
                        try {
                            C41054IFx parseFromJson = IAM.parseFromJson(C16V.A00(str3));
                            C14360o3.A07(parseFromJson);
                            String str4 = parseFromJson.A01;
                            if (str4 != null) {
                                byte[] decode = Base64.decode(str4, 0);
                                C1WO c1wo = this.A02;
                                C14360o3.A0A(decode);
                                int length = decode.length;
                                C14360o3.A0B(userSession, 0);
                                c1wo.A00.A05.A0F(userSession, decode, 4, length);
                            }
                        } catch (IOException unused) {
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("handleRealtimeEvent(topic=");
                        sb.append(str);
                        sb.append(", subTopic=");
                        sb.append(realtimePayload.subTopic);
                        sb.append(A00);
                        sb.append(realtimePayload);
                        sb.append(") unable to extract base64 payload");
                        C0K8.A0C("RtcRealtimeEventHandler", sb.toString());
                    } else if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.VIDEO_CALL_IN_CALL_ALERT_QUERY_ID.equals(str2)) {
                        C1WO c1wo2 = this.A02;
                        String str5 = realtimePayload.stringPayload;
                        C14360o3.A06(str5);
                        c1wo2.A00(userSession, str5);
                    }
                    return true;
                }
                String str6 = realtimePayload.subTopic;
                String str7 = realtimePayload.stringPayload;
                C14360o3.A06(str7);
                c19l = this.A03;
                jqe = new RtcRealtimeEventHandler$onRealtimeEventPayload$1(this, str, str6, str7, null);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, jqe, c19l);
                return true;
            }
        }
        C14360o3.A07(str);
        if (!RealtimeConstants.MQTT_TOPIC_RTC_MULTI.equals(str)) {
            return false;
        }
        boolean z = false;
        if (realtimePayload != null) {
            Context context = this.A00;
            String str8 = realtimePayload.stringPayload;
            C14360o3.A06(str8);
            C55144Od3 A01 = C55189Odv.A01(context, str8);
            if (A01 != null && A01.A0A.getValue() != EnumC53137Neq.A03) {
                z = true;
            }
        }
        byte[] bArr = c5ez.A01;
        C14360o3.A07(bArr);
        int length2 = bArr.length;
        int i = length2 - 1;
        if (i >= 0 && i != 0) {
            if (i >= length2) {
                r2 = AbstractC009903n.A0E(bArr);
            } else if (i == 1) {
                r2 = Collections.singletonList(Byte.valueOf(bArr[i]));
                C14360o3.A07(r2);
            } else {
                r2 = new ArrayList(i);
                for (int i2 = length2 - i; i2 < length2; i2++) {
                    r2.add(Byte.valueOf(bArr[i2]));
                }
            }
        } else {
            r2 = C16930sl.A00;
        }
        byte[] A0v = AbstractC001800i.A0v(r2);
        c19l = this.A03;
        jqe = new JQE(this, A0v, null, 6, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, jqe, c19l);
        return true;
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final List getMqttTopicsToHandle() {
        ArrayList A1N = AbstractC16960so.A1N(RealtimeConstants.MQTT_TOPIC_SKYWALKER, RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
        if (C18U.A06(C06090Tz.A05, this.A01, 36322319380326555L)) {
            A1N.add(RealtimeConstants.MQTT_TOPIC_RTC_MULTI);
        }
        return A1N;
    }
}
