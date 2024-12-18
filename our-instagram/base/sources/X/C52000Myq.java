package X;

import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.calltag.gen.CallTagApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.crypto.gen.CryptoApi;
import com.facebook.rsys.crypto.gen.CryptoProxy;
import com.facebook.rsys.devicestats.gen.DeviceStatsApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.groupexpansion.msys.gen.GroupExpansionMsysProxy;
import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficApi;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProvider;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import java.util.Map;

/* renamed from: X.Myq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52000Myq extends CallClient {
    public final C51996Myi A00;
    public final C54996OUf A01;
    public final C51998Myn A02;
    public final C45344K4y A03;
    public final C52019MzX A04;
    public final C52024Mzm A05;
    public final N04 A06;
    public final C26672Bq7 A07;
    public final C52010MzA A08;
    public final C55074OaU A09;
    public final String A0A;
    public final InterfaceC09390do A0B;
    public final Context A0C;
    public final Mailbox A0D;
    public final AudioModule A0E;
    public final DevXAgentCallConfig A0F;
    public final UserSession A0G;
    public final OId A0H;
    public final C52021Mzb A0I;
    public final C52022Mzd A0J;
    public final C52025Mzo A0K;
    public final C54453O4h A0L;
    public final AbstractC52007Mz4 A0M;
    public final O5J A0N;
    public final IGRTCFeatureProvider A0O;
    public final IGRTCSyncedClockHolder A0P;
    public final InterfaceC16660sJ A0Q;
    public final InterfaceC16620sF A0R;
    public final boolean A0S;

    public C52000Myq(Context context, Mailbox mailbox, C52020MzZ c52020MzZ, AudioModule audioModule, DevXAgentCallConfig devXAgentCallConfig, C23324AVj c23324AVj, UserSession userSession, OId oId, C54156Nws c54156Nws, C54453O4h c54453O4h, AbstractC52007Mz4 abstractC52007Mz4, O5J o5j, IGRTCSyncedClockHolder iGRTCSyncedClockHolder, Integer num, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1G(c23324AVj, 2, abstractC52007Mz4);
        AbstractC25229BEm.A1J(interfaceC16660sJ, 8, c54453O4h);
        C14360o3.A0B(num, 13);
        this.A0A = str;
        this.A0C = context;
        this.A0G = userSession;
        this.A0M = abstractC52007Mz4;
        this.A0P = iGRTCSyncedClockHolder;
        this.A0R = interfaceC16620sF;
        this.A0Q = interfaceC16660sJ;
        this.A0N = o5j;
        this.A0L = c54453O4h;
        this.A0D = mailbox;
        this.A0S = z;
        this.A0H = oId;
        this.A0E = audioModule;
        this.A0F = devXAgentCallConfig;
        C54996OUf c54996OUf = new C54996OUf(context, c52020MzZ, audioModule, devXAgentCallConfig, c23324AVj, userSession, oId, c54156Nws, c54453O4h, abstractC52007Mz4, o5j, iGRTCSyncedClockHolder, num, str, interfaceC16660sJ2, interfaceC16660sJ, interfaceC16620sF, z2, z3);
        this.A01 = c54996OUf;
        this.A0B = C57548PgM.A00(this, 24);
        this.A00 = c54996OUf.A09;
        this.A08 = c54996OUf.A0Z;
        this.A0I = c54996OUf.A0I;
        this.A04 = c54996OUf.A0M;
        this.A03 = c54996OUf.A0K;
        this.A0J = c54996OUf.A0N;
        this.A06 = c54996OUf.A0S;
        this.A05 = c54996OUf.A0Q;
        this.A02 = c54996OUf.A0J;
        this.A09 = c54996OUf.A0c;
        this.A0K = c54996OUf.A0R;
        this.A07 = c54996OUf.A0U;
        IGRTCFeatureProvider createFeatureProvider = IGRTCFeatureProvider.CProxy.createFeatureProvider(new NUC(context, userSession, c54996OUf));
        C14360o3.A07(createFeatureProvider);
        this.A0O = createFeatureProvider;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final void onCallEnded(Map map, CallEndedApi callEndedApi) {
        C14360o3.A0B(callEndedApi, 1);
        C54996OUf c54996OUf = this.A01;
        C52018MzU c52018MzU = c54996OUf.A0L;
        MediaStatsApi mediaStatsApi = c52018MzU.A00;
        if (mediaStatsApi != null) {
            mediaStatsApi.unregisterListener(c52018MzU.A01);
        }
        c54996OUf.A01 = callEndedApi;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final void setApi(CallApi callApi) {
        C14360o3.A0B(callApi, 0);
        C54996OUf c54996OUf = this.A01;
        c54996OUf.A02 = callApi;
        OId oId = c54996OUf.A0F;
        String str = c54996OUf.A0f;
        Long l = oId.A00;
        if (l != null) {
            long longValue = l.longValue();
            if (C14360o3.A0K(oId.A01, str)) {
                oId.A02.flowMarkPoint(longValue, "client_api_set");
            }
        }
        c54996OUf.A0j.invoke(callApi, new NU8(c54996OUf));
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final void setCall(Call call) {
        C14360o3.A0B(call, 0);
        C54996OUf c54996OUf = this.A01;
        C54758OHn c54758OHn = new C54758OHn(call.getApis().getApis());
        C52010MzA c52010MzA = c54996OUf.A0Z;
        C14360o3.A0B(c52010MzA, 1);
        DeviceStatsApi deviceStatsApi = (DeviceStatsApi) c54758OHn.A00(DeviceStatsApi.CONVERTER);
        if (deviceStatsApi != null) {
            deviceStatsApi.setBatteryStatsReader(c52010MzA);
        }
        c54996OUf.A03 = (CallTagApi) c54758OHn.A00(CallTagApi.CONVERTER);
        c54996OUf.A00 = (AppstateApi) c54758OHn.A00(AppstateApi.CONVERTER);
        c54996OUf.A04 = (HdVideoApi) c54758OHn.A00(HdVideoApi.CONVERTER);
        c54996OUf.A0P.A00 = (NetworkTrafficApi) c54758OHn.A00(NetworkTrafficApi.CONVERTER);
        TslogApi tslogApi = (TslogApi) c54758OHn.A00(TslogApi.CONVERTER);
        if (tslogApi != null) {
            c54996OUf.A0d.setApi(tslogApi);
        }
    }

    public static AbstractC52007Mz4 A00(C52000Myq c52000Myq) {
        return (AbstractC52007Mz4) c52000Myq.A0B.getValue();
    }

    public final void A01(boolean z) {
        CryptoApi cryptoApi = this.A01.A0H.A00;
        if (cryptoApi != null) {
            int i = 1;
            if (z) {
                i = 2;
            }
            cryptoApi.setE2eeMode(i);
            return;
        }
        throw AbstractC166987dD.A12("Crypto api is used before proxy is ready");
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final McfReference getAppCallClient() {
        McfReference rawFeatureProvider = this.A0O.getRawFeatureProvider();
        C14360o3.A07(rawFeatureProvider);
        return rawFeatureProvider;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final AudioProxy getAudio() {
        AudioProxy audioProxy;
        DevXAgentCallConfig devXAgentCallConfig = this.A0F;
        if (devXAgentCallConfig == null || (audioProxy = devXAgentCallConfig.audioProxy) == null) {
            return this.A01.A09;
        }
        return audioProxy;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final /* bridge */ /* synthetic */ CameraProxy getCamera() {
        return (CameraProxy) this.A01.A0h.getValue();
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final CryptoProxy getCrypto() {
        return this.A01.A0H;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final GroupExpansionProxy getGroupExpansion() {
        Mailbox mailbox;
        if (this.A0S && (mailbox = this.A0D) != null) {
            if (C18U.A06(C06090Tz.A05, this.A0G, 36315597755125175L)) {
                GroupExpansionProxy create = GroupExpansionMsysProxy.CProxy.create(mailbox);
                C14360o3.A07(create);
                return new C52015MzK(create);
            }
            return null;
        }
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final MediaStatsProxy getMediaStats() {
        return this.A01.A0L;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final /* bridge */ /* synthetic */ TslogProxy getTslog() {
        return this.A01.A0d;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final /* bridge */ /* synthetic */ VideoRenderProxy getVideoRenderer() {
        return this.A01.A0D;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallClient
    public final /* bridge */ /* synthetic */ VideoSubscriptionsProxy getVideoSubscriptions() {
        return this.A01.A0T;
    }
}
