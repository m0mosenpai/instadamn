package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import java.util.Map;

/* renamed from: X.Myp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51999Myp extends CallClient {
    public O1V A00;
    public final C57782Pk9 A01;
    public final AbstractC51997Myj A02;
    public final CallContext A03;
    public final AbstractC52006Mz3 A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final CryptoProxy getCrypto() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final GroupExpansionProxy getGroupExpansion() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final MediaStatsProxy getMediaStats() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final TslogProxy getTslog() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final VideoRenderProxy getVideoRenderer() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final VideoSubscriptionsProxy getVideoSubscriptions() {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final void onCallEnded(Map map, CallEndedApi callEndedApi) {
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final void setApi(CallApi callApi) {
        C14360o3.A0B(callApi, 0);
        callApi.setAppModelListener(new C52003Myv(this));
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final void setCall(Call call) {
        C14360o3.A0B(call, 0);
        this.A00 = new O1V(call.getApis().getApis());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Mz3] */
    public /* synthetic */ C51999Myp(AbstractC51997Myj abstractC51997Myj, CallContext callContext, String str, InterfaceC16820sZ interfaceC16820sZ) {
        ?? obj = new Object();
        C57594Ph6 c57594Ph6 = C57594Ph6.A00;
        AbstractC25229BEm.A1I(str, 1, c57594Ph6);
        this.A05 = str;
        this.A03 = callContext;
        this.A02 = abstractC51997Myj;
        this.A04 = obj;
        this.A07 = interfaceC16820sZ;
        this.A08 = c57594Ph6;
        this.A01 = OZP.A00(str);
        this.A06 = C57549PgN.A00(this, EnumC09460dv.A04, 8);
    }

    public static Object A00(C51999Myp c51999Myp) {
        C2N9 c2n9 = AudioApi.CONVERTER;
        C14360o3.A08(c2n9);
        O1V o1v = c51999Myp.A00;
        if (o1v != null) {
            return o1v.A00.A00(c2n9);
        }
        return null;
    }

    public final CallApi A01() {
        O1V o1v = this.A00;
        if (o1v != null) {
            CallApi callApi = (CallApi) o1v.A00.A00(CallApi.CONVERTER);
            if (callApi != null) {
                return callApi;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final McfReference getAppCallClient() {
        return (McfReference) this.A06.getValue();
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final AudioProxy getAudio() {
        return this.A02;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final CameraProxy getCamera() {
        return this.A04;
    }
}
