package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94104Kw extends RealtimeEventHandler {
    public static final Charset A03 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public final Map A00;
    public final UserSession A01;
    public final Map A02;

    public C94104Kw(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = AbstractC06930Yk.A06(new C09530e4(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC, Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36315846866636418L))), new C09530e4(RealtimeConstants.MQTT_TOPIC_MESSAGE_STREAMING, true));
        this.A00 = AbstractC06930Yk.A06(new C09530e4(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC, new C94114Kx(userSession)), new C09530e4(RealtimeConstants.MQTT_TOPIC_MESSAGE_STREAMING, new AbstractC94124Ky(userSession)));
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        C14360o3.A0B(str, 0);
        Boolean bool = (Boolean) this.A02.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
        C14360o3.A0B(c5ez, 0);
        String str = c5ez.A00;
        C14360o3.A07(str);
        byte[] bArr = c5ez.A01;
        C14360o3.A07(bArr);
        Charset charset = A03;
        C14360o3.A08(charset);
        String str2 = new String(bArr, charset);
        AbstractC94124Ky abstractC94124Ky = (AbstractC94124Ky) this.A00.get(str);
        if (abstractC94124Ky != null) {
            try {
                abstractC94124Ky.A02.obtainMessage(1, AbstractC125175lN.A00(str2)).sendToTarget();
                return true;
            } catch (IOException e) {
                C2Ql.A00(e);
                return true;
            }
        }
        return true;
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final List getMqttTopicsToHandle() {
        ArrayList arrayList = new ArrayList();
        if (C18U.A06(C06090Tz.A05, this.A01, 36315846866636418L)) {
            arrayList.add(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC);
        }
        arrayList.add(RealtimeConstants.MQTT_TOPIC_MESSAGE_STREAMING);
        return arrayList;
    }
}
