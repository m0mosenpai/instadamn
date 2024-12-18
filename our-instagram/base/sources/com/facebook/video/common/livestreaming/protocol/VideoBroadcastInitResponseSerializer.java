package com.facebook.video.common.livestreaming.protocol;

import X.AbstractC121565f4;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class VideoBroadcastInitResponseSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(VideoBroadcastInitResponse.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        VideoBroadcastInitResponse videoBroadcastInitResponse = (VideoBroadcastInitResponse) obj;
        if (videoBroadcastInitResponse == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        AbstractC121565f4.A04(anonymousClass182, "rtmpPublishUrl", videoBroadcastInitResponse.rtmpPublishUrl);
        AbstractC121565f4.A04(anonymousClass182, "videoId", videoBroadcastInitResponse.videoId);
        AbstractC121565f4.A04(anonymousClass182, "broadcastId", videoBroadcastInitResponse.broadcastId);
        long j = videoBroadcastInitResponse.minBroadcastDurationSeconds;
        anonymousClass182.A0r("minBroadcastDurationSeconds");
        anonymousClass182.A0i(j);
        long j2 = videoBroadcastInitResponse.maxBroadcastDurationSeconds;
        anonymousClass182.A0r("maxBroadcastDurationSeconds");
        anonymousClass182.A0i(j2);
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = videoBroadcastInitResponse.videoStreamingConfig;
        if (videoBroadcastVideoStreamingConfig != null) {
            anonymousClass182.A0r("videoStreamingConfig");
            AbstractC121565f4.A00(anonymousClass182, abstractC913345m, videoBroadcastVideoStreamingConfig);
        }
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig2 = videoBroadcastInitResponse.audioOnlyVideoStreamingConfig;
        if (videoBroadcastVideoStreamingConfig2 != null) {
            anonymousClass182.A0r("audioOnlyVideoStreamingConfig");
            AbstractC121565f4.A00(anonymousClass182, abstractC913345m, videoBroadcastVideoStreamingConfig2);
        }
        VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = videoBroadcastInitResponse.audioStreamingConfig;
        if (videoBroadcastAudioStreamingConfig != null) {
            anonymousClass182.A0r("audioStreamingConfig");
            AbstractC121565f4.A00(anonymousClass182, abstractC913345m, videoBroadcastAudioStreamingConfig);
        }
        AbstractC121565f4.A04(anonymousClass182, "rawJsonConfig", videoBroadcastInitResponse.rawJsonConfig);
        int i = videoBroadcastInitResponse.broadcastInterruptionLimitInSeconds;
        anonymousClass182.A0r("broadcastInterruptionLimitInSeconds");
        anonymousClass182.A0h(i);
        int i2 = videoBroadcastInitResponse.audioOnlyFormatBitRate;
        anonymousClass182.A0r("audioOnlyFormatBitRate");
        anonymousClass182.A0h(i2);
        boolean z = videoBroadcastInitResponse.passThroughEnabled;
        anonymousClass182.A0r("passThroughEnabled");
        anonymousClass182.A0y(z);
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = videoBroadcastInitResponse.liveTraceConfig;
        if (videoBroadcastLiveTraceConfig != null) {
            anonymousClass182.A0r("liveTraceConfig");
            AbstractC121565f4.A00(anonymousClass182, abstractC913345m, videoBroadcastLiveTraceConfig);
        }
        boolean z2 = videoBroadcastInitResponse.allowBFrame;
        anonymousClass182.A0r("allowBFrame");
        anonymousClass182.A0y(z2);
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkQueueCapacityInBytes, "streamNetworkQueueCapacityInBytes");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkQueueVideoCapacityInSeconds, "streamNetworkQueueVideoCapacityInSeconds");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkQueuePercentageOfCapacityToDrop, "streamNetworkQueuePercentageOfCapacityToDrop");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkSendCheckTimeoutMs, "streamNetworkSendCheckTimeoutMs");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkConnectionRetryCount, "streamNetworkConnectionRetryCount");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkConnectionRetryDelayInSeconds, "streamNetworkConnectionRetryDelayInSeconds");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkMeasurementsIntervalInMs, "streamNetworkMeasurementsIntervalInMs");
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.streamNetworkShouldProbeRttWithPings, "streamNetworkShouldProbeRttWithPings");
        Double d = videoBroadcastInitResponse.streamThroughputDecayConstant;
        if (d != null) {
            anonymousClass182.A0r("streamThroughputDecayConstant");
            anonymousClass182.A0f(d.doubleValue());
        }
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkSpeedTestPayloadChunkSizeInBytes, "streamNetworkSpeedTestPayloadChunkSizeInBytes");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkSpeedTestPayloadSizeInBytes, "streamNetworkSpeedTestPayloadSizeInBytes");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.streamNetworkSpeedTestPayloadTimeoutInSeconds, "streamNetworkSpeedTestPayloadTimeoutInSeconds");
        Double d2 = videoBroadcastInitResponse.speedTestMinimumBandwidthThreshold;
        if (d2 != null) {
            anonymousClass182.A0r("speedTestMinimumBandwidthThreshold");
            anonymousClass182.A0f(d2.doubleValue());
        }
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.disableSpeedTest, "disableSpeedTest");
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.use1RTTConnectionSetup, "use1RTTConnectionSetup");
        Double d3 = videoBroadcastInitResponse.networkLagStopThreshold;
        if (d3 != null) {
            anonymousClass182.A0r("networkLagStopThreshold");
            anonymousClass182.A0f(d3.doubleValue());
        }
        Double d4 = videoBroadcastInitResponse.networkLagResumeThreshold;
        if (d4 != null) {
            anonymousClass182.A0r("networkLagResumeThreshold");
            anonymousClass182.A0f(d4.doubleValue());
        }
        AbstractC121565f4.A04(anonymousClass182, "streamVideoAdaptiveBitrateConfig", videoBroadcastInitResponse.streamVideoAdaptiveBitrateConfig);
        AbstractC121565f4.A04(anonymousClass182, "fbLivePublishUrl", videoBroadcastInitResponse.fbLivePublishUrl);
        AbstractC121565f4.A04(anonymousClass182, "fbLiveQuicPublishUrl", videoBroadcastInitResponse.fbLiveQuicPublishUrl);
        AbstractC121565f4.A04(anonymousClass182, "fbLiveFallbackPublishUrl", videoBroadcastInitResponse.fbLiveFallbackPublishUrl);
        AbstractC121565f4.A04(anonymousClass182, "rtmpPublishHeaderBase64", videoBroadcastInitResponse.rtmpPublishHeaderBase64);
        AbstractC121565f4.A04(anonymousClass182, "fbLiveTransportHeaderBase64", videoBroadcastInitResponse.fbLiveTransportHeaderBase64);
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.streamNetworkUseSslFactory, "streamNetworkUseSslFactory");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.broadcasterUpdateLogIntervalInSeconds, "broadcasterUpdateLogIntervalInSeconds");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.llDesiredLatencyMs, "llDesiredLatencyMs");
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.isReceivingStarsEnabled, "isReceivingStarsEnabled");
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.isARGiftingEnabled, "isARGiftingEnabled");
        AbstractC121565f4.A04(anonymousClass182, "starsCreatorARSettingsID", videoBroadcastInitResponse.starsCreatorARSettingsID);
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.isEligibleMonetizationOnboardingInLive, "isEligibleMonetizationOnboardingInLive");
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.audienceRestrictionsEnabled, "audienceRestrictionsEnabled");
        List<Integer> list = videoBroadcastInitResponse.minimumAgeAudienceRestrictions;
        if (list != null) {
            anonymousClass182.A0r("minimumAgeAudienceRestrictions");
            AbstractC121565f4.A01(anonymousClass182, abstractC913345m, list);
        }
        AbstractC121565f4.A02(anonymousClass182, videoBroadcastInitResponse.latencySensitive, "latencySensitive");
        AbstractC121565f4.A03(anonymousClass182, videoBroadcastInitResponse.savedFeaturedLinksCount, "savedFeaturedLinksCount");
        Map<String, Double> map = videoBroadcastInitResponse.initialBitratePrediction;
        if (map != null) {
            anonymousClass182.A0r("initialBitratePrediction");
            AbstractC121565f4.A00(anonymousClass182, abstractC913345m, map);
        }
        int i3 = videoBroadcastInitResponse.liveWithMaxParticipants;
        anonymousClass182.A0r("liveWithMaxParticipants");
        anonymousClass182.A0h(i3);
        AbstractC121565f4.A04(anonymousClass182, "actorId", videoBroadcastInitResponse.actorId);
        boolean z3 = videoBroadcastInitResponse.canViewerAdminister;
        anonymousClass182.A0r("canViewerAdminister");
        anonymousClass182.A0y(z3);
        boolean z4 = videoBroadcastInitResponse.hasProfessionalFeaturesForWatch;
        anonymousClass182.A0r("hasProfessionalFeaturesForWatch");
        anonymousClass182.A0y(z4);
        boolean z5 = videoBroadcastInitResponse.canViewerSeeCommunityModerationTools;
        anonymousClass182.A0r("canViewerSeeCommunityModerationTools");
        anonymousClass182.A0y(z5);
        AbstractC121565f4.A04(anonymousClass182, "videoQualityModel", videoBroadcastInitResponse.videoQualityModel);
        List<String> list2 = videoBroadcastInitResponse.defaultShareToGroupIds;
        if (list2 != null) {
            anonymousClass182.A0r("defaultShareToGroupIds");
            AbstractC121565f4.A01(anonymousClass182, abstractC913345m, list2);
        }
        AbstractC121565f4.A04(anonymousClass182, "resolutionMappingString", videoBroadcastInitResponse.resolutionMappingString);
        boolean z6 = videoBroadcastInitResponse.isGamingVideo;
        anonymousClass182.A0r("isGamingVideo");
        anonymousClass182.A0y(z6);
        boolean z7 = videoBroadcastInitResponse.isViewerClippingEnabled;
        anonymousClass182.A0r("isViewerClippingEnabled");
        anonymousClass182.A0y(z7);
        boolean z8 = videoBroadcastInitResponse.canHostInviteGuestAudioOnly;
        anonymousClass182.A0r("canHostInviteGuestAudioOnly");
        anonymousClass182.A0y(z8);
        boolean z9 = videoBroadcastInitResponse.canHostInviteGuestsWhileLive;
        anonymousClass182.A0r("canHostInviteGuestsWhileLive");
        anonymousClass182.A0y(z9);
        List<LiveWithSocialTab> list3 = videoBroadcastInitResponse.availableTabs;
        if (list3 != null) {
            anonymousClass182.A0r("availableTabs");
            AbstractC121565f4.A01(anonymousClass182, abstractC913345m, list3);
        }
        AbstractC121565f4.A04(anonymousClass182, "iBPHybridModelConfig", videoBroadcastInitResponse.iBPHybridModelConfig);
        AbstractC121565f4.A04(anonymousClass182, "rtcActorId", videoBroadcastInitResponse.rtcActorId);
        AbstractC121565f4.A04(anonymousClass182, "riskModel", videoBroadcastInitResponse.riskModel);
        AbstractC121565f4.A04(anonymousClass182, "latencySetting", videoBroadcastInitResponse.latencySetting);
        AbstractC121565f4.A04(anonymousClass182, "latencyTargetType", videoBroadcastInitResponse.latencyTargetType);
        AbstractC121565f4.A04(anonymousClass182, "roiType", videoBroadcastInitResponse.roiType);
        AbstractC121565f4.A04(anonymousClass182, "profileIdIfViewerCanSeeStarsDefaultOnUpsell", videoBroadcastInitResponse.profileIdIfViewerCanSeeStarsDefaultOnUpsell);
        boolean z10 = videoBroadcastInitResponse.shouldShowNotifySubscriberPlugin;
        anonymousClass182.A0r("shouldShowNotifySubscriberPlugin");
        anonymousClass182.A0y(z10);
        AbstractC121565f4.A04(anonymousClass182, "boostedLiveAdsStatus", videoBroadcastInitResponse.boostedLiveAdsStatus);
        int i4 = videoBroadcastInitResponse.boostedLiveStartTime;
        anonymousClass182.A0r("boostedLiveStartTime");
        anonymousClass182.A0h(i4);
        anonymousClass182.A0a();
    }
}
