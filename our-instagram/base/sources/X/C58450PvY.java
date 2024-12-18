package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

/* renamed from: X.PvY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58450PvY {
    public final InterfaceC02550Ad A00;

    public static final void A00(C58450PvY c58450PvY, PushInfraMetaData pushInfraMetaData, String str, String str2, Map map) {
        String str3 = pushInfraMetaData.A06;
        if (str3 != null && !str3.equals("0")) {
            C25531Mh A0K = C25531Mh.A0K(c58450PvY.A00);
            if (AbstractC25226BEj.A1Z(A0K)) {
                boolean z = true;
                boolean A1W = AbstractC167007dF.A1W(pushInfraMetaData.A03);
                if (pushInfraMetaData.A02 == null) {
                    z = false;
                }
                map.put("isHPKEEncrypted", String.valueOf(A1W));
                map.put("isZSTDCompressed", String.valueOf(z));
                map.put("push_lite_logger", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                Long l = pushInfraMetaData.A01;
                if (l != null) {
                    A0K.A0Q("push_usecase_id", l);
                }
                String str4 = pushInfraMetaData.A08;
                if (str4 != null) {
                    A0K.A0R("pi_nid", str4);
                }
                String str5 = pushInfraMetaData.A07;
                if (str5 != null) {
                    A0K.A0R("notif_id", str5);
                }
                C73773Sh c73773Sh = AbstractC73763Sg.A03;
                C3RD c3rd = C3RD.A01;
                String A02 = c73773Sh.A02(map, new C3RL(c3rd, c3rd));
                A0K.A0R("notif_event", str);
                A0K.A0R("channel", str2);
                A0K.A0R("notif_event_log_flag", str3);
                A0K.A0R("extra_info", A02);
                A0K.Cht();
            }
        }
    }

    public C58450PvY(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }
}
