package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = VideoBroadcastInitResponseDeserializer.class)
/* loaded from: classes12.dex */
public class VideoBroadcastInitResponse {

    @JsonProperty("audioStreamingConfig")
    public final VideoBroadcastAudioStreamingConfig audioStreamingConfig;

    @JsonProperty("availableTabs")
    public final List<LiveWithSocialTab> availableTabs;

    @JsonProperty("broadcastId")
    public final String broadcastId;

    @JsonProperty("fbLiveFallbackPublishUrl")
    public final String fbLiveFallbackPublishUrl;

    @JsonProperty("fbLivePublishUrl")
    public final String fbLivePublishUrl;

    @JsonProperty("fbLiveQuicPublishUrl")
    public final String fbLiveQuicPublishUrl;

    @JsonProperty("initialBitratePrediction")
    public Map<String, Double> initialBitratePrediction;

    @JsonProperty("liveTraceConfig")
    public final VideoBroadcastLiveTraceConfig liveTraceConfig;

    @JsonProperty("passThroughEnabled")
    public final boolean passThroughEnabled;

    @JsonProperty("rtmpPublishUrl")
    public final String rtmpPublishUrl;

    @JsonProperty("videoId")
    public final String videoId;

    @JsonProperty("videoQualityModel")
    public final String videoQualityModel;

    @JsonProperty("videoStreamingConfig")
    public final VideoBroadcastVideoStreamingConfig videoStreamingConfig;

    @JsonProperty("minBroadcastDurationSeconds")
    public final long minBroadcastDurationSeconds = 0;

    @JsonProperty("maxBroadcastDurationSeconds")
    public final long maxBroadcastDurationSeconds = 0;

    @JsonProperty("audioOnlyVideoStreamingConfig")
    public final VideoBroadcastVideoStreamingConfig audioOnlyVideoStreamingConfig = null;

    @JsonProperty("liveOnlineEventConfig")
    public final VideoBroadcastLiveOnlineEventConfig liveOnlineEventConfig = null;

    @JsonProperty("rawJsonConfig")
    public final String rawJsonConfig = null;

    @JsonProperty("broadcastInterruptionLimitInSeconds")
    public final int broadcastInterruptionLimitInSeconds = 0;

    @JsonProperty("audioOnlyFormatBitRate")
    public final int audioOnlyFormatBitRate = 0;

    @JsonProperty("allowBFrame")
    public final boolean allowBFrame = false;

    @JsonProperty("streamNetworkQueueCapacityInBytes")
    public final Integer streamNetworkQueueCapacityInBytes = null;

    @JsonProperty("streamNetworkQueueVideoCapacityInSeconds")
    public final Integer streamNetworkQueueVideoCapacityInSeconds = null;

    @JsonProperty("streamNetworkQueuePercentageOfCapacityToDrop")
    public final Integer streamNetworkQueuePercentageOfCapacityToDrop = null;

    @JsonProperty("streamNetworkSendCheckTimeoutMs")
    public final Integer streamNetworkSendCheckTimeoutMs = null;

    @JsonProperty("streamNetworkConnectionRetryCount")
    public final Integer streamNetworkConnectionRetryCount = null;

    @JsonProperty("streamNetworkConnectionRetryDelayInSeconds")
    public final Integer streamNetworkConnectionRetryDelayInSeconds = null;

    @JsonProperty("streamNetworkMeasurementsIntervalInMs")
    public final Integer streamNetworkMeasurementsIntervalInMs = null;

    @JsonProperty("streamNetworkShouldProbeRttWithPings")
    public final Boolean streamNetworkShouldProbeRttWithPings = null;

    @JsonProperty("streamThroughputDecayConstant")
    public final Double streamThroughputDecayConstant = null;

    @JsonProperty("streamNetworkSpeedTestPayloadChunkSizeInBytes")
    public final Integer streamNetworkSpeedTestPayloadChunkSizeInBytes = null;

    @JsonProperty("streamNetworkSpeedTestPayloadSizeInBytes")
    public final Integer streamNetworkSpeedTestPayloadSizeInBytes = null;

    @JsonProperty("streamNetworkSpeedTestPayloadTimeoutInSeconds")
    public final Integer streamNetworkSpeedTestPayloadTimeoutInSeconds = null;

    @JsonProperty("speedTestMinimumBandwidthThreshold")
    public final Double speedTestMinimumBandwidthThreshold = null;

    @JsonProperty("disableSpeedTest")
    public final Boolean disableSpeedTest = null;

    @JsonProperty("use1RTTConnectionSetup")
    public final Boolean use1RTTConnectionSetup = null;

    @JsonProperty("networkLagStopThreshold")
    public final Double networkLagStopThreshold = null;

    @JsonProperty("networkLagResumeThreshold")
    public final Double networkLagResumeThreshold = null;

    @JsonProperty("streamVideoAdaptiveBitrateConfig")
    public final String streamVideoAdaptiveBitrateConfig = null;

    @JsonProperty("rtmpPublishHeaderBase64")
    public final String rtmpPublishHeaderBase64 = null;

    @JsonProperty("fbLiveTransportHeaderBase64")
    public final String fbLiveTransportHeaderBase64 = null;

    @JsonProperty("streamNetworkUseSslFactory")
    public final Boolean streamNetworkUseSslFactory = null;

    @JsonProperty("broadcasterUpdateLogIntervalInSeconds")
    public final Integer broadcasterUpdateLogIntervalInSeconds = null;

    @JsonProperty("llDesiredLatencyMs")
    public final Integer llDesiredLatencyMs = null;

    @JsonProperty("isReceivingStarsEnabled")
    public final Boolean isReceivingStarsEnabled = null;

    @JsonProperty("isARGiftingEnabled")
    public final Boolean isARGiftingEnabled = null;

    @JsonProperty("starsCreatorARSettingsID")
    public final String starsCreatorARSettingsID = null;

    @JsonProperty("isEligibleMonetizationOnboardingInLive")
    public final Boolean isEligibleMonetizationOnboardingInLive = null;

    @JsonProperty("audienceRestrictionsEnabled")
    public final Boolean audienceRestrictionsEnabled = null;

    @JsonProperty("minimumAgeAudienceRestrictions")
    public final List<Integer> minimumAgeAudienceRestrictions = null;

    @JsonProperty("latencySensitive")
    public final Boolean latencySensitive = null;

    @JsonProperty("videoBroadcastEndscreenConfig")
    public final VideoBroadcastEndscreenConfig videoBroadcastEndscreenConfig = null;

    @JsonProperty("savedFeaturedLinksCount")
    public final Integer savedFeaturedLinksCount = null;

    @JsonProperty("liveWithMaxParticipants")
    public final int liveWithMaxParticipants = 2;

    @JsonProperty("actorId")
    public final String actorId = null;

    @JsonProperty("canViewerAdminister")
    public final boolean canViewerAdminister = false;

    @JsonProperty("hasProfessionalFeaturesForWatch")
    public final boolean hasProfessionalFeaturesForWatch = false;

    @JsonProperty("canViewerSeeCommunityModerationTools")
    public final boolean canViewerSeeCommunityModerationTools = false;

    @JsonProperty("defaultShareToGroupIds")
    public final List<String> defaultShareToGroupIds = null;

    @JsonProperty("resolutionMappingString")
    public final String resolutionMappingString = null;

    @JsonProperty("isGamingVideo")
    public final boolean isGamingVideo = false;

    @JsonProperty("isViewerClippingEnabled")
    public final boolean isViewerClippingEnabled = false;

    @JsonProperty("canHostInviteGuestAudioOnly")
    public final boolean canHostInviteGuestAudioOnly = false;

    @JsonProperty("canHostInviteGuestsWhileLive")
    public final boolean canHostInviteGuestsWhileLive = false;

    @JsonProperty("iBPHybridModelConfig")
    public final String iBPHybridModelConfig = null;

    @JsonProperty("rtcActorId")
    public final String rtcActorId = null;

    @JsonProperty("riskModel")
    public final String riskModel = null;

    @JsonProperty("latencySetting")
    public final String latencySetting = null;

    @JsonProperty("videoBroadcastLiveWithConfig")
    public final VideoBroadcastLiveWithConfig videoBroadcastLiveWithConfig = null;

    @JsonProperty("latencyTargetType")
    public final String latencyTargetType = null;

    @JsonProperty("roiType")
    public final String roiType = null;

    @JsonProperty("profileIdIfViewerCanSeeStarsDefaultOnUpsell")
    public final String profileIdIfViewerCanSeeStarsDefaultOnUpsell = null;

    @JsonProperty("shouldShowNotifySubscriberPlugin")
    public final boolean shouldShowNotifySubscriberPlugin = false;

    @JsonProperty("boostedLiveAdsStatus")
    public final String boostedLiveAdsStatus = null;

    @JsonProperty("boostedLiveStartTime")
    public final int boostedLiveStartTime = 0;

    public VideoBroadcastInitResponse(VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig, VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig, VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Map map, boolean z) {
        this.rtmpPublishUrl = str5;
        this.videoId = str6;
        this.broadcastId = str;
        this.videoStreamingConfig = videoBroadcastVideoStreamingConfig;
        this.audioStreamingConfig = videoBroadcastAudioStreamingConfig;
        this.passThroughEnabled = z;
        this.liveTraceConfig = videoBroadcastLiveTraceConfig;
        this.fbLivePublishUrl = str3;
        this.fbLiveQuicPublishUrl = str4;
        this.fbLiveFallbackPublishUrl = str2;
        this.initialBitratePrediction = map;
        this.videoQualityModel = str7;
        this.availableTabs = list;
    }
}
