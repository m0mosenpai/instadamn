package X;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* renamed from: X.TWs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64849TWs implements WebMessageListenerBoundaryInterface {
    public InterfaceC65304Thc A00;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.SAG] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, android.net.Uri uri, boolean z, InvocationHandler invocationHandler2) {
        String data;
        C62941SYj c62941SYj;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) C63081Sc3.A00(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        int length = ports.length;
        SAG[] sagArr = new SAG[length];
        for (int i = 0; i < length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            ?? obj = new Object();
            obj.A00 = (WebMessagePortBoundaryInterface) C63081Sc3.A00(WebMessagePortBoundaryInterface.class, invocationHandler3);
            sagArr[i] = obj;
        }
        if (SVN.A0Z.A01()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C63081Sc3.A00(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type == 1) {
                    c62941SYj = new C62941SYj(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), sagArr);
                    IsomorphicObjectBoundaryInterface isomorphicObjectBoundaryInterface = (IsomorphicObjectBoundaryInterface) C63081Sc3.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                    this.A00.Da0(uri, webView, c62941SYj, (SAF) isomorphicObjectBoundaryInterface.getOrCreatePeer(new CallableC58499PwS(isomorphicObjectBoundaryInterface, 1)), z);
                }
                return;
            }
            data = webMessagePayloadBoundaryInterface.getAsString();
        } else {
            data = webMessageBoundaryInterface.getData();
        }
        c62941SYj = new C62941SYj(data, sagArr);
        IsomorphicObjectBoundaryInterface isomorphicObjectBoundaryInterface2 = (IsomorphicObjectBoundaryInterface) C63081Sc3.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
        this.A00.Da0(uri, webView, c62941SYj, (SAF) isomorphicObjectBoundaryInterface2.getOrCreatePeer(new CallableC58499PwS(isomorphicObjectBoundaryInterface2, 1)), z);
    }
}
