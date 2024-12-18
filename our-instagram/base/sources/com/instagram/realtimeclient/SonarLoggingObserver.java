package com.instagram.realtimeclient;

import X.C5EZ;
import X.C95094Pu;
import com.facebook.flipper.plugins.mqtt.MqttEvent;
import com.facebook.flipper.plugins.mqtt.MqttFlipperPlugin;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public class SonarLoggingObserver implements RealtimeClientManager.Observer {
    public static final Charset CHARSET_UTF8 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public MqttFlipperPlugin mPlugin;

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onConnectionChanged(C95094Pu c95094Pu) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        this.mPlugin.reportEvent(MqttEvent.subscribe(str, str2));
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onSendPayload(String str, byte[] bArr, String str2, Long l) {
        this.mPlugin.reportEvent(MqttEvent.payload(str));
    }

    public SonarLoggingObserver(MqttFlipperPlugin mqttFlipperPlugin) {
        this.mPlugin = mqttFlipperPlugin;
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onMessage(C5EZ c5ez) {
        String str;
        RealtimePayload parse = RealtimePayloadParser.parse(c5ez);
        MqttFlipperPlugin mqttFlipperPlugin = this.mPlugin;
        String str2 = c5ez.A00;
        if (parse != null) {
            str = parse.stringPayload;
        } else {
            str = new String(c5ez.A01, CHARSET_UTF8);
        }
        mqttFlipperPlugin.reportEvent(MqttEvent.message(str2, str));
    }
}
