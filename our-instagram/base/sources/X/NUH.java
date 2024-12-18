package X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.rtc.rsys.models.HttpRequest;
import com.instagram.rtc.rsys.models.HttpRequestFile;
import com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback;
import com.instagram.rtc.rsys.proxies.SignalingSenderProxy;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NUH extends SignalingSenderProxy {
    public final /* synthetic */ C55207OeK A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1Mq, java.lang.Object] */
    @Override // com.instagram.rtc.rsys.proxies.SignalingSenderProxy
    public final void sendHttpSignalingMessage(HttpRequest httpRequest, SignalingHttpSenderCallback signalingHttpSenderCallback, boolean z) {
        Integer num;
        HttpRequestFile httpRequestFile;
        int A1R = AbstractC167007dF.A1R(0, httpRequest, signalingHttpSenderCallback);
        C55207OeK c55207OeK = this.A00;
        if (C18U.A06(C06090Tz.A05, c55207OeK.A0C, 36322319380326555L) && z) {
            Map map = httpRequest.files;
            if (map != null && (httpRequestFile = (HttpRequestFile) map.get("rtc_message")) != null) {
                RealtimeClientManager realtimeClientManager = c55207OeK.A0D;
                byte[] bArr = httpRequestFile.data;
                C14360o3.A06(bArr);
                byte[] bArr2 = new byte[A1R];
                bArr2[0] = 0;
                realtimeClientManager.publish(RealtimeConstants.MQTT_TOPIC_RTC_MULTI, AbstractC06960Yn.A0Y(bArr2, bArr), C4Q5.ACKNOWLEDGED_DELIVERY, new T1Q(signalingHttpSenderCallback, A1R));
                return;
            }
            return;
        }
        OHP ohp = c55207OeK.A0N;
        C30189DRu c30189DRu = new C30189DRu(signalingHttpSenderCallback, 34);
        C25621Ms A0q = AbstractC25228BEl.A0q(ohp.A00);
        if (httpRequest.requestMethod == A1R) {
            num = C05F.A0N;
        } else {
            num = C05F.A01;
        }
        A0q.A09(num);
        A0q.A0Q(new Object());
        String str = httpRequest.path;
        C14360o3.A06(str);
        A0q.A0E = str;
        ((AbstractC23721Ec) A0q).A06 = EnumC23341Bw.VideoCall;
        Map map2 = httpRequest.payload;
        C14360o3.A06(map2);
        Iterator A15 = AbstractC166997dE.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            String str2 = (String) A1K.getValue();
            C14360o3.A0A(A17);
            A0q.A0H(A17, str2);
        }
        Map map3 = httpRequest.files;
        C14360o3.A06(map3);
        Iterator A152 = AbstractC166997dE.A15(map3);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            String A172 = AbstractC31172DnG.A17(A1K2);
            HttpRequestFile httpRequestFile2 = (HttpRequestFile) A1K2.getValue();
            C14360o3.A0A(A172);
            byte[] bArr3 = httpRequestFile2.data;
            C14360o3.A06(bArr3);
            A0q.A0K(A172, bArr3);
        }
        C1ON A0N = A0q.A0N();
        A0N.A00 = new N9T(c30189DRu);
        C1GJ.A03(A0N);
    }

    public NUH(C55207OeK c55207OeK) {
        this.A00 = c55207OeK;
    }
}
