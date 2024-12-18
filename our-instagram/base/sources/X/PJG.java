package X;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import ca.psiphon.PsiphonTunnel;
import com.facebook.mediastreaming.bundledservices.BundledLiveStreamServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClientImpl;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.client.livestreaming.livetrace.LiveTraceServiceProviderHolder;
import com.facebook.mediastreaming.opt.sessionlog.SessionLogger;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import com.facebook.mediastreaming.opt.source.event.AndroidEventMessageInputSource;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import com.facebook.mediastreaming.opt.videoqualityquery.VideoQualityDeviceModelServiceProviderHolder;
import com.facebook.mediastreaming.opt.xanalytics.XAnalyticsEventLogWriterProviderHolder;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastAudioStreamingConfig;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
public final class PJG implements InterfaceC58192Pqy {
    public AbstractC53633Nne A00;
    public AbstractC70118W4q A01;
    public AbstractC70118W4q A02;
    public C53616NnN A03;
    public File A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Handler A0B;
    public final VideoBroadcastInitResponse A0C;
    public final UserSession A0D;
    public final C56805PIw A0E;
    public final C55085Oah A0F;
    public final InterfaceC58089PpE A0G;
    public final C55692OoJ A0H;
    public final OJX A0I;
    public final Integer A0J;
    public final C1EL A0K;
    public final O6D A0L;

    /* JADX WARN: Type inference failed for: r8v5, types: [X.0JO, java.lang.Object, X.1EL] */
    public PJG(Context context, UserSession userSession, N3J n3j, C56805PIw c56805PIw, C55085Oah c55085Oah, C54732OFj c54732OFj, InterfaceC58089PpE interfaceC58089PpE, Integer num, int i, int i2) {
        C14360o3.A0B(n3j, 3);
        AbstractC25233BEq.A0y(4, c54732OFj, c55085Oah, interfaceC58089PpE);
        C14360o3.A0B(num, 10);
        this.A0A = context;
        this.A0D = userSession;
        this.A09 = i;
        this.A08 = i2;
        this.A0E = c56805PIw;
        this.A0F = c55085Oah;
        this.A0G = interfaceC58089PpE;
        Handler handler = new Handler();
        this.A0B = handler;
        Integer num2 = C05F.A00;
        this.A07 = num2;
        int i3 = n3j.A0A;
        float f = (i * 1.0f) / i2;
        if (AbstractC54956OSg.A00()) {
            int i4 = Integer.MAX_VALUE;
            int[] iArr = AbstractC54956OSg.A01;
            int i5 = 0;
            int i6 = i3;
            do {
                int i7 = iArr[i5];
                int i8 = i3 - i7;
                if (Math.abs(i8) < i4) {
                    i4 = Math.abs(i8);
                    i6 = i7;
                }
                i5++;
            } while (i5 < 3);
            i3 = i6;
        }
        int round = Math.round(i3 / 16.0f) * 16;
        Pair A0D = MSY.A0D(Integer.valueOf(round), Math.round((round / f) / 16.0f) * 16);
        Number number = (Number) A0D.first;
        Number number2 = (Number) A0D.second;
        C16930sl c16930sl = C16930sl.A00;
        String str = n3j.A0H;
        String str2 = n3j.A0F;
        String str3 = n3j.A0E;
        String str4 = n3j.A0D;
        String valueOf = String.valueOf(System.currentTimeMillis());
        valueOf = valueOf == null ? "" : valueOf;
        String str5 = n3j.A0C;
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = new VideoBroadcastVideoStreamingConfig("baseline", 1.0f, n3j.A08, n3j.A09, MSX.A05(number2), MSX.A05(number));
        C51697MsS c51697MsS = new C51697MsS(0);
        c51697MsS.A00 = n3j.A04;
        c51697MsS.A01 = n3j.A05;
        c51697MsS.A02 = n3j.A06;
        c51697MsS.A03 = n3j.A07;
        VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = new VideoBroadcastAudioStreamingConfig(c51697MsS);
        boolean z = n3j.A0L;
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = new VideoBroadcastLiveTraceConfig(n3j.A01, n3j.A02, n3j.A0K);
        HashMap hashMap = n3j.A0I.isEmpty() ^ true ? n3j.A0I : null;
        String str6 = n3j.A0G;
        this.A0C = new VideoBroadcastInitResponse(videoBroadcastAudioStreamingConfig, videoBroadcastLiveTraceConfig, videoBroadcastVideoStreamingConfig, str5, str4, str2, str3, str, valueOf, str6.length() > 0 ? str6 : null, c16930sl, hashMap, z);
        this.A06 = num2;
        ?? obj = new Object();
        this.A0K = obj;
        this.A05 = num2;
        this.A0J = num2;
        this.A0I = new OJX(this);
        O6D o6d = new O6D(this);
        this.A0L = o6d;
        O9G o9g = new O9G(userSession, num);
        C57530Pg4 A00 = C57530Pg4.A00(o9g, this, 47);
        O6C o6c = new O6C(o9g);
        C55690OoG c55690OoG = C55690OoG.A00;
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder2 = new XAnalyticsAdapterHolder(new T2D(userSession));
        UserSession userSession2 = o9g.A00;
        boolean A002 = AbstractC54272Nys.A00(userSession2);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0H = new C55692OoJ(context, handler, obj, c55690OoG, xAnalyticsAdapterHolder2, o6c, o6d, A00, AbstractC25225BEi.A07(c06090Tz, userSession2, 36593069822509993L), AbstractC25225BEi.A07(c06090Tz, userSession2, 36593069823034283L), A002, C18U.A06(c06090Tz, userSession2, 36311594846257795L), C18U.A06(c06090Tz, userSession2, 36315146783558712L));
        EQ2(AbstractC166987dD.A0y().A0R());
    }

    @Override // X.InterfaceC58192Pqy
    public final boolean CTr() {
        return true;
    }

    public static final void A00(PJG pjg) {
        YBF ybf = pjg.A0H.A0A;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(ybf.A01.values());
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            A1E2.add(new YFi((YQG) it.next()));
        }
        AbstractC70118W4q.A02(pjg.A02, A1E2);
        pjg.A02 = null;
    }

    @Override // X.InterfaceC58192Pqy
    public final BroadcastType AiO() {
        return BroadcastType.A04;
    }

    @Override // X.InterfaceC58192Pqy
    public final long C9p() {
        ODU odu = this.A0H.A0D;
        boolean z = odu.A02;
        long j = odu.A00;
        if (z) {
            return j + (odu.A03.now() - odu.A01);
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.facebook.mediastreaming.opt.transport.SSLFactoryHolder, java.lang.Object] */
    @Override // X.InterfaceC58192Pqy
    public final void CNo(AbstractC53633Nne abstractC53633Nne) {
        EnumC53218NgG enumC53218NgG;
        EnumC53209Ng7 enumC53209Ng7;
        EnumC53196Nfs enumC53196Nfs;
        long j;
        long j2;
        int i;
        ?? obj;
        String str;
        EnumC53196Nfs enumC53196Nfs2;
        EnumC53218NgG enumC53218NgG2;
        if (this.A07 != C05F.A00) {
            C0K8.A02(PJG.class, "init() on a broadcast that was already initialized");
            return;
        }
        this.A00 = new C52242NAg(1, abstractC53633Nne, this);
        C55692OoJ c55692OoJ = this.A0H;
        VideoBroadcastInitResponse videoBroadcastInitResponse = this.A0C;
        C14360o3.A0B(videoBroadcastInitResponse, 0);
        if (c55692OoJ.A01 != null) {
            C0K8.A02(C55692OoJ.class, "Live streaming client already created!");
        } else if (c55692OoJ.A02 != C05F.A0j) {
            O9G o9g = c55692OoJ.A0C.A00;
            C14360o3.A0B(o9g, 2);
            LiveStreamingConfig.Builder builder = LiveStreamingConfig.Builder.$redex_init_class;
            LiveStreamingConfig.Builder builder2 = new LiveStreamingConfig.Builder(Long.parseLong(videoBroadcastInitResponse.broadcastId));
            VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = videoBroadcastInitResponse.videoStreamingConfig;
            if (videoBroadcastVideoStreamingConfig != null) {
                String str2 = videoBroadcastVideoStreamingConfig.videoProfile;
                if (str2 != null) {
                    if (str2.equalsIgnoreCase("high31")) {
                        enumC53218NgG2 = EnumC53218NgG.A05;
                    } else if (str2.equalsIgnoreCase("high")) {
                        enumC53218NgG2 = EnumC53218NgG.A04;
                    }
                    builder2.setVideoWidth(videoBroadcastVideoStreamingConfig.width);
                    builder2.setVideoHeight(videoBroadcastVideoStreamingConfig.height);
                    builder2.setVideoBitrate(videoBroadcastVideoStreamingConfig.bitRate);
                    builder2.setVideoFps(videoBroadcastVideoStreamingConfig.frameRate);
                    builder2.setVideoEncoderProfile(enumC53218NgG2.A00);
                }
                enumC53218NgG2 = EnumC53218NgG.A03;
                builder2.setVideoWidth(videoBroadcastVideoStreamingConfig.width);
                builder2.setVideoHeight(videoBroadcastVideoStreamingConfig.height);
                builder2.setVideoBitrate(videoBroadcastVideoStreamingConfig.bitRate);
                builder2.setVideoFps(videoBroadcastVideoStreamingConfig.frameRate);
                builder2.setVideoEncoderProfile(enumC53218NgG2.A00);
            }
            builder2.setVideoKeyframeIntervalSeconds(2.0f);
            VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = videoBroadcastInitResponse.audioStreamingConfig;
            if (videoBroadcastAudioStreamingConfig != null) {
                if (videoBroadcastAudioStreamingConfig.profile == 5) {
                    enumC53196Nfs2 = EnumC53196Nfs.A03;
                } else {
                    enumC53196Nfs2 = EnumC53196Nfs.A04;
                }
                builder2.setAudioBitRate(videoBroadcastAudioStreamingConfig.bitRate);
                builder2.setAudioSampleRate(videoBroadcastAudioStreamingConfig.sampleRate);
                builder2.setAudioChannels(videoBroadcastAudioStreamingConfig.channels);
                builder2.setAudioEncoderProfile(enumC53196Nfs2.A00);
            }
            VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = videoBroadcastInitResponse.liveTraceConfig;
            if (videoBroadcastLiveTraceConfig != null) {
                builder2.setLiveTraceEnabled(videoBroadcastLiveTraceConfig.enabled);
                builder2.setLiveTraceSampleIntervalInSeconds(videoBroadcastLiveTraceConfig.sampleIntervalInSeconds);
                builder2.setLiveTraceSamplingSource(videoBroadcastLiveTraceConfig.samplingSource);
            }
            String str3 = videoBroadcastInitResponse.fbLivePublishUrl;
            if (str3 != null) {
                builder2.setPublishURL(str3);
            }
            String str4 = videoBroadcastInitResponse.fbLiveQuicPublishUrl;
            if (str4 != null) {
                builder2.setPublishQuicURL(str4);
            }
            String str5 = videoBroadcastInitResponse.fbLiveFallbackPublishUrl;
            if (str5 != null) {
                builder2.setPublishFallbackURL(str5);
            }
            String str6 = videoBroadcastInitResponse.fbLiveTransportHeaderBase64;
            if (str6 != null) {
                builder2.setConnectionToken(str6);
            }
            builder2.setVideoAllowBFrames(videoBroadcastInitResponse.allowBFrame);
            Integer num = videoBroadcastInitResponse.streamNetworkSendCheckTimeoutMs;
            if (num != null) {
                builder2.setSendCheckTimeoutMsec(num.intValue());
            }
            Integer num2 = videoBroadcastInitResponse.streamNetworkQueueCapacityInBytes;
            if (num2 != null) {
                builder2.setQueueCapacityInBytes(num2.intValue());
            }
            Integer num3 = videoBroadcastInitResponse.streamNetworkQueueVideoCapacityInSeconds;
            if (num3 != null) {
                builder2.setQueueVideoCapacityInSeconds(num3.intValue());
            }
            Integer num4 = videoBroadcastInitResponse.streamNetworkQueuePercentageOfCapacityToDrop;
            if (num4 != null) {
                builder2.setPercentageOfCapacityToDrop(num4.intValue());
            }
            Integer num5 = videoBroadcastInitResponse.streamNetworkConnectionRetryCount;
            if (num5 != null) {
                builder2.setConnectionRetryCount(num5.intValue());
            }
            Integer num6 = videoBroadcastInitResponse.streamNetworkConnectionRetryDelayInSeconds;
            if (num6 != null) {
                builder2.setConnectionRetryDelayInSeconds(num6.intValue());
            }
            Integer num7 = videoBroadcastInitResponse.streamNetworkMeasurementsIntervalInMs;
            if (num7 != null) {
                builder2.setMeasurementsIntervalInMs(num7.intValue());
            }
            Boolean bool = videoBroadcastInitResponse.streamNetworkShouldProbeRttWithPings;
            if (bool != null) {
                builder2.setShouldProbeRTTWithPings(bool.booleanValue());
            }
            Boolean bool2 = videoBroadcastInitResponse.streamNetworkUseSslFactory;
            if (bool2 != null) {
                builder2.setUseSSLFactory(bool2.booleanValue());
            }
            Integer num8 = videoBroadcastInitResponse.streamNetworkSpeedTestPayloadSizeInBytes;
            if (num8 != null) {
                builder2.setSpeedTestPayloadSize(num8.intValue());
            }
            Integer num9 = videoBroadcastInitResponse.streamNetworkSpeedTestPayloadChunkSizeInBytes;
            if (num9 != null) {
                builder2.setSpeedTestPayloadChunkSize(num9.intValue());
            }
            Double d = videoBroadcastInitResponse.speedTestMinimumBandwidthThreshold;
            if (d != null) {
                builder2.setSpeedTestMinimumBandwidthThreshold(d.doubleValue());
            }
            Boolean bool3 = videoBroadcastInitResponse.use1RTTConnectionSetup;
            if (bool3 != null) {
                builder2.setUse1RTTConnectionSetup(bool3.booleanValue());
            }
            Boolean bool4 = videoBroadcastInitResponse.latencySensitive;
            if (bool4 != null) {
                builder2.setLatencySensitive(bool4.booleanValue());
            }
            Map<String, Double> map = videoBroadcastInitResponse.initialBitratePrediction;
            if (map != null && MSW.A1b(map)) {
                builder2.setInitialBitratePredictions(map);
            }
            UserSession userSession = o9g.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            String A04 = C18U.A04(c06090Tz, userSession, 36873801769943060L);
            if (A04.equalsIgnoreCase("high31")) {
                enumC53218NgG = EnumC53218NgG.A05;
            } else if (A04.equalsIgnoreCase("high")) {
                enumC53218NgG = EnumC53218NgG.A04;
            } else {
                enumC53218NgG = EnumC53218NgG.A03;
            }
            builder2.setVideoEncoderProfile(enumC53218NgG.A00);
            if (C18U.A06(c06090Tz, userSession, 36310851816259926L)) {
                enumC53209Ng7 = EnumC53209Ng7.A03;
            } else {
                enumC53209Ng7 = EnumC53209Ng7.A05;
            }
            builder2.setVideoEncoderBitrateMode(enumC53209Ng7.A00);
            builder2.setVideoKeyframeIntervalSeconds((float) C18U.A01(c06090Tz, userSession, 36592326793036217L));
            builder2.setVideoFps(AbstractC25225BEi.A07(c06090Tz, userSession, 36592326793167290L));
            builder2.setVideoEnforceKeyframeInterval(C18U.A06(c06090Tz, userSession, 2342153861030084951L));
            builder2.setVideoEnforceColorInfo(C18U.A06(c06090Tz, userSession, 36310851816587608L));
            int i2 = 1;
            if (AbstractC54272Nys.A00(userSession)) {
                i2 = 2;
            }
            if (C18U.A06(c06090Tz, userSession, 36311594845602433L)) {
                enumC53196Nfs = EnumC53196Nfs.A03;
            } else {
                enumC53196Nfs = EnumC53196Nfs.A04;
            }
            builder2.setAudioEncoderProfile(enumC53196Nfs.A00);
            builder2.setAudioChannels(i2);
            builder2.setAudioBitRate(i2 * AbstractC25225BEi.A07(c06090Tz, userSession, 36593069822575530L));
            builder2.setAudioSampleRate(AbstractC25225BEi.A07(c06090Tz, userSession, 36593069822509993L));
            builder2.setAllowSeparateThreads(C18U.A06(c06090Tz, userSession, 36310619888156876L));
            builder2.setSeparateLiveAudioEncoderThread(C18U.A06(c06090Tz, userSession, 36310619888025803L));
            builder2.setSeparateLiveVideoEncoderThread(C18U.A06(c06090Tz, userSession, 36310619888419023L));
            builder2.setABRUseAsyncMessage(C18U.A06(c06090Tz, userSession, 36310619888484560L));
            builder2.setMinInterruptionLimitInSeconds(AbstractC25225BEi.A07(c06090Tz, userSession, 36592163584278861L));
            builder2.setMaxInterruptionLimitInSeconds(AbstractC25225BEi.A07(c06090Tz, userSession, 36592163584213324L));
            builder2.setABRUpscaleDelayMs(30000);
            builder2.setABRMinDecreaseBitrateForLargeQueue(128000);
            builder2.setABRBitrateIncreaseFromLastGood(32000);
            builder2.setABRTimeSinceLastBitrateIncreaseThresholdMs(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            builder2.setABRResolutionMappingBpp(C18U.A00(c06090Tz, userSession, 37155143602536457L));
            builder2.setABRMaxBitrate(AbstractC25225BEi.A07(c06090Tz, userSession, 36592193649967460L));
            builder2.setVideoBitrate(AbstractC25225BEi.A07(c06090Tz, userSession, 36592193649639776L));
            int intValue = o9g.A01.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 0) {
                        j = 36592193649901923L;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    j = 36592193649770849L;
                }
            } else {
                j = 36592193649836386L;
            }
            builder2.setABRMaxBitrateOn4G(AbstractC25225BEi.A07(c06090Tz, userSession, j));
            if (intValue != 2) {
                if (intValue != 1) {
                    j2 = 36592193649181022L;
                } else {
                    j2 = 36592193649049949L;
                }
            } else {
                j2 = 36592193649312095L;
            }
            builder2.setABRMaxBitrateOnWifi(AbstractC25225BEi.A07(c06090Tz, userSession, j2));
            builder2.setResolutionMappingString(C18U.A04(c06090Tz, userSession, 36873668626939921L));
            ProxyServiceBroadcaster proxyServiceBroadcaster = ProxyServiceBroadcaster.instance;
            builder2.setProxyHostname(proxyServiceBroadcaster.getProxyAddress());
            synchronized (proxyServiceBroadcaster) {
                i = proxyServiceBroadcaster.httpProxyPort;
            }
            builder2.setProxyPort(i);
            builder2.setEnableQuic(true);
            builder2.setQuicCongestionControlType("copa");
            builder2.setCopaLatencyFactor(C18U.A00(c06090Tz, userSession, 37156135739850772L));
            builder2.setQuicSocketDrainTimeoutMs(AbstractC25225BEi.A07(c06090Tz, userSession, 36593185786561505L));
            builder2.setQuicTcpRacingEnabled(true);
            builder2.setTcpConnectDelayMs(PsiphonTunnel.VPN_INTERFACE_MTU);
            builder2.setConnectionRetryCount(AbstractC25225BEi.A07(c06090Tz, userSession, 36593185786627042L));
            builder2.setConnectionRetryDelayInSeconds(AbstractC25225BEi.A07(c06090Tz, userSession, 36593185786692579L));
            builder2.setConnectTimeoutMs(AbstractC25225BEi.A07(c06090Tz, userSession, 36593185786758116L));
            builder2.setNetworkLagStopThreshold(30.0d);
            builder2.setNetworkLagResumeThreshold(8.0d);
            builder2.setEnableRushGoAwayFrame(C18U.A06(c06090Tz, userSession, 36311710810112740L));
            builder2.setEnableRushClockSync(C18U.A06(c06090Tz, userSession, 36311710810178277L));
            builder2.setEnableEncoderMetadata(C18U.A06(c06090Tz, userSession, 36311710810243814L));
            builder2.setUseUnifiedRushClient(C18U.A06(c06090Tz, userSession, 36311710810440424L));
            String str7 = videoBroadcastInitResponse.fbLiveFallbackPublishUrl;
            if (str7 != null && str7.length() != 0) {
                builder2.setEnableUrlFallback(C18U.A06(c06090Tz, userSession, 36311710810309351L));
                builder2.setUrlSwapInterval(AbstractC25225BEi.A07(c06090Tz, userSession, 36593185787085797L));
                builder2.setEnableActiveUrlFallback(C18U.A06(c06090Tz, userSession, 36311710810505961L));
            }
            builder2.setEnableVideoSourceValidation(C18U.A06(c06090Tz, userSession, 2342155677801120978L));
            builder2.setVideoSourceTsIncreaseUpperBoundInSeconds(C18U.A00(c06090Tz, userSession, 37157093517885480L));
            builder2.setVideoSourceTsIncreaseLowerBoundInSeconds(C18U.A00(c06090Tz, userSession, 37157093517819943L));
            builder2.setVideoSourceLoggerEpochDurationInSeconds(C18U.A00(c06090Tz, userSession, 37157093517688870L));
            builder2.setVideoSourceLoggerSamplesPerEpoch(AbstractC25225BEi.A07(c06090Tz, userSession, 36594143564334681L));
            builder2.setEnableInitialBitratePredict(false);
            builder2.setInitialBitratePredictPolicy("speedtest");
            builder2.setInitialBitratePredictSelection("");
            builder2.setQualityFrameInterval(AbstractC25225BEi.A07(c06090Tz, userSession, 36596621760334404L));
            LiveStreamingConfig build = builder2.build();
            C14360o3.A07(build);
            BundledLiveStreamServiceProviderHolder bundledLiveStreamServiceProviderHolder = new BundledLiveStreamServiceProviderHolder(build, null, c55692OoJ.A07);
            c55692OoJ.A00 = bundledLiveStreamServiceProviderHolder.getSessionProbe();
            C55686OoB c55686OoB = new C55686OoB(c55692OoJ);
            Handler handler = c55692OoJ.A06;
            C14360o3.A0B(handler, 3);
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            ArrayList A1E3 = AbstractC166987dD.A1E();
            ArrayList A1E4 = AbstractC166987dD.A1E();
            YBF ybf = c55692OoJ.A0A;
            C14360o3.A0B(ybf, 0);
            A1E.add(ybf);
            A1E2.add(c55692OoJ.A08);
            AndroidEventMessageInputSource androidEventMessageInputSource = c55692OoJ.A09;
            C14360o3.A0B(androidEventMessageInputSource, 0);
            A1E3.add(androidEventMessageInputSource);
            A1E4.add(bundledLiveStreamServiceProviderHolder);
            A1E4.add(new SessionLogger(null));
            A1E4.add(new LiveTraceServiceProviderHolder());
            A1E4.add(new XAnalyticsEventLogWriterProviderHolder(c55692OoJ.A0B, false));
            if (c55692OoJ.A0G && (str = videoBroadcastInitResponse.videoQualityModel) != null) {
                A1E4.add(new VideoQualityDeviceModelServiceProviderHolder(str));
            }
            Iterator A1J = AbstractC25226BEj.A1J(c55692OoJ.A0F.invoke());
            while (A1J.hasNext()) {
                Object next = A1J.next();
                C14360o3.A0B(next, 0);
                A1E4.add(next);
            }
            Context context = c55692OoJ.A05;
            boolean z = true;
            C18C.A0J(!A1E2.isEmpty(), "Must specify at least one audio track", new Object[0]);
            if (A1E.size() != 1) {
                z = false;
            }
            C18C.A0J(z, "Only single video track supported!", new Object[0]);
            C62686SMa c62686SMa = C62686SMa.A05;
            if (c62686SMa == null) {
                c62686SMa = new C62686SMa(AbstractC166987dD.A0O(context));
                C62686SMa.A05 = c62686SMa;
            }
            synchronized (C53706Nov.class) {
                synchronized (C51962Mxy.A01) {
                    if (C51962Mxy.A00 == null) {
                        C51962Mxy.A00 = new C63162SeL();
                    }
                    obj = new Object();
                    obj.mHybridData = obj.initHybridData(AbstractC166987dD.A19(MSW.A0w(context.getFilesDir(), "fbtlsx_fbvp.store")), false, C55729Oov.A00);
                }
            }
            C53684NoZ c53684NoZ = LiveStreamingClientImpl.Companion;
            c55692OoJ.A01 = new LiveStreamingClientImpl(build, (AndroidVideoInput) A1E.get(0), A1E2, (AndroidEventMessageInputSource) AnonymousClass016.A13(A1E3), c55686OoB, handler, c55692OoJ, null, obj, A1E4, c62686SMa, null);
            c55692OoJ.A02 = C05F.A01;
            return;
        }
        C11T.A02(new RunnableC56975PPq(abstractC53633Nne, new C53404Njt(BroadcastFailureType.A03, "InitializeBroadcastSession", "Failed to initialize broadcast")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (X.C14360o3.A0K(r1, r3) == false) goto L15;
     */
    @Override // X.InterfaceC58192Pqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CsN(X.YQR r10) {
        /*
            r9 = this;
            java.lang.Class<X.YFi> r1 = X.YFi.class
            boolean r0 = r1.isInstance(r10)
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.cast(r10)
            X.YFi r0 = (X.YFi) r0
            if (r0 == 0) goto L8e
            X.OoJ r4 = r9.A0H
            X.YQG r8 = r0.A01
            android.os.Looper r3 = android.os.Looper.myLooper()
            r2 = r8
            X.YCI r2 = (X.YCI) r2
            r1 = 0
            if (r3 == 0) goto L35
            android.os.Handler r0 = r2.A04
            if (r0 == 0) goto L30
            android.os.Handler r0 = r2.A04
            if (r0 == 0) goto L2a
            android.os.Looper r1 = r0.getLooper()
        L2a:
            boolean r0 = X.C14360o3.A0K(r1, r3)
            if (r0 != 0) goto L37
        L30:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r3)
        L35:
            r2.A04 = r1
        L37:
            X.YBF r7 = r4.A0A
            java.util.concurrent.atomic.AtomicLong r0 = r2.A03
            long r2 = r0.get()
            java.util.Map r6 = r7.A01
            X.C14360o3.A06(r6)
            monitor-enter(r6)
            java.util.Iterator r5 = X.AbstractC166997dE.A15(r6)     // Catch: java.lang.Throwable -> L8a
            r4 = -1
        L4a:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L6b
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8a
            X.YCI r0 = (X.YCI) r0     // Catch: java.lang.Throwable -> L8a
            boolean r0 = X.C14360o3.A0K(r0, r8)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L4a
            int r4 = r1.intValue()     // Catch: java.lang.Throwable -> L8a
            goto L4a
        L6b:
            monitor-exit(r6)
            if (r4 < 0) goto L8e
            java.util.List r6 = r7.A00
            X.C14360o3.A06(r6)
            monitor-enter(r6)
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L8a
        L78:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L8a
            X.Pm8 r0 = (X.InterfaceC57904Pm8) r0     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L78
            r0.onVideoInputFrameAvailable(r4, r2)     // Catch: java.lang.Throwable -> L8a
            goto L78
        L8a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L8d:
            monitor-exit(r6)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJG.CsN(X.YQR):void");
    }

    @Override // X.InterfaceC58192Pqy
    public final void EE8(AbstractC70118W4q abstractC70118W4q, boolean z) {
        String str;
        C56805PIw c56805PIw = this.A0E;
        if (z) {
            str = "stopBroadcastAndSeal";
        } else {
            str = "stopBroadcastNoSeal";
        }
        c56805PIw.A0F(str);
        this.A0I.A00();
        C55692OoJ c55692OoJ = this.A0H;
        YBF ybf = c55692OoJ.A0A;
        ybf.stopRenderingToOutput();
        ybf.A01.clear();
        List list = ybf.A00;
        C14360o3.A06(list);
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            list.clear();
        }
        LiveStreamingClient liveStreamingClient = c55692OoJ.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.stop(z);
            c55692OoJ.A01 = null;
        }
        Integer num = C05F.A0j;
        c55692OoJ.A02 = num;
        if (this.A07 == num) {
            AbstractC70118W4q.A02(abstractC70118W4q, new O68(this.A04));
            abstractC70118W4q = null;
        }
        this.A01 = abstractC70118W4q;
    }

    @Override // X.InterfaceC58192Pqy
    public final void EQ2(boolean z) {
        this.A0H.A08.setMute(z);
    }

    @Override // X.InterfaceC58192Pqy
    public final void EnI(AbstractC70118W4q abstractC70118W4q) {
        this.A02 = abstractC70118W4q;
        C55692OoJ c55692OoJ = this.A0H;
        C55219Oei.A07("startLiveStream", new Object[0]);
        AndroidAudioRecorder androidAudioRecorder = c55692OoJ.A08;
        C55219Oei.A03("mss:AndroidAudioRecorder", "startAudioRecording", new Object[0]);
        androidAudioRecorder.executor.execute(new RunnableC56851PKv(androidAudioRecorder));
        LiveStreamingClient liveStreamingClient = c55692OoJ.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.start();
        }
        c55692OoJ.A02 = C05F.A0N;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.NnN, java.lang.Object] */
    @Override // X.InterfaceC58192Pqy
    public final void EoX(AbstractC53633Nne abstractC53633Nne, boolean z) {
        C53616NnN c53616NnN;
        this.A0I.A00();
        O6E o6e = new O6E(this);
        C55692OoJ c55692OoJ = this.A0H;
        C55219Oei.A07("stopLiveStream", new Object[0]);
        LiveStreamingClient liveStreamingClient = c55692OoJ.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.pause(z);
        }
        AndroidAudioRecorder androidAudioRecorder = c55692OoJ.A08;
        C55219Oei.A03("mss:AndroidAudioRecorder", "stopAudioRecording", new Object[0]);
        androidAudioRecorder.executor.execute(new PPR(androidAudioRecorder, o6e));
        c55692OoJ.A02 = C05F.A0Y;
        if (z) {
            if (abstractC53633Nne != null) {
                C11T.A02(new PLS(abstractC53633Nne));
            }
            c53616NnN = null;
        } else {
            C53616NnN c53616NnN2 = this.A03;
            if (c53616NnN2 != null) {
                c53616NnN2.A00 = abstractC53633Nne;
                return;
            }
            ?? obj = new Object();
            obj.A02 = false;
            obj.A01 = false;
            obj.A00 = abstractC53633Nne;
            c53616NnN = obj;
        }
        this.A03 = c53616NnN;
    }
}
