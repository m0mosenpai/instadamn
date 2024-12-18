package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.Execution;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94084Ku extends RealtimeEventHandler {
    public InterfaceC16660sJ A00;

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        C14360o3.A0B(str, 0);
        return RealtimeConstants.MQTT_TOPIC_LS_RESPONSE.equals(str);
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
        C14360o3.A0B(c5ez, 0);
        Execution.executeAsync(new K4Z(MqttNetworkSessionPlugin.get(), c5ez.A00, c5ez.A01), null, 3);
        return true;
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final void onMqttChannelStateChanged(C95094Pu c95094Pu) {
        C14360o3.A0B(c95094Pu, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c95094Pu);
        }
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean shouldNotifyMqttChannelStateChanged() {
        return true;
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final List getMqttTopicsToHandle() {
        List singletonList = Collections.singletonList(RealtimeConstants.MQTT_TOPIC_LS_RESPONSE);
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
