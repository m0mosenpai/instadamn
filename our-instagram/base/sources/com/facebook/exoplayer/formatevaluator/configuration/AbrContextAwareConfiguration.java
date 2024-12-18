package com.facebook.exoplayer.formatevaluator.configuration;

import X.AnonymousClass267;
import X.C14360o3;
import X.C2A4;
import X.C2B2;
import X.C42081wy;
import X.C4BV;
import X.EnumC440821q;
import android.net.ConnectivityManager;
import java.util.Locale;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes.dex */
public final class AbrContextAwareConfiguration {
    public final C42081wy abrSetting;
    public final C2A4 connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGClips;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final C2B2 playbackPreferences;

    public AbrContextAwareConfiguration(C42081wy c42081wy, C2A4 c2a4, C2B2 c2b2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        C14360o3.A0B(c42081wy, 1);
        C14360o3.A0B(c2b2, 3);
        this.abrSetting = c42081wy;
        this.connectivityManagerHolder = c2a4;
        this.playbackPreferences = c2b2;
        this.isLive = z;
        String A01 = c2b2.A01();
        synchronized (c2b2) {
        }
        boolean z5 = false;
        this.isStory = "fb_stories".equalsIgnoreCase(A01);
        this.isIGStory = "reel_feed_timeline".equalsIgnoreCase(A01);
        if (A01 != null) {
            String lowerCase = A01.toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            z5 = lowerCase.startsWith("clips_viewer_");
        }
        this.isIGClips = z5;
        this.isThumbnail = c2b2.A07();
        synchronized (c2b2) {
            z3 = c2b2.A04;
        }
        this.isSponsored = z3;
        synchronized (c2b2) {
            z4 = c2b2.A02;
        }
        this.isBackgroundPrefetch = z4;
        this.enableForegroundPrefetchQualityExperimentation = c2b2.A01;
        this.isPrefetch = z2;
    }

    private final boolean getEnableInitialBitrateBoosterByNetworkQuality() {
        return false;
    }

    public final boolean enableAndroidAPIBitrate() {
        return false;
    }

    public final boolean enableConfRiskBwCache() {
        return false;
    }

    public final boolean enableMosOverride() {
        return false;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMos() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMosForPrefetch() {
        return false;
    }

    public final boolean enableXPlatBweParity() {
        return false;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return -1;
    }

    public final boolean getBypassWidthLimitsStories() {
        return false;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        return false;
    }

    public final boolean getForceCurrentNoWatchableFormatFrameDrop() {
        return true;
    }

    public final boolean getHashUrlForUnique() {
        return false;
    }

    public final int getHighBwRiskConfPct(EnumC440821q enumC440821q) {
        int i;
        int i2;
        int i3;
        C14360o3.A0B(enumC440821q, 0);
        if (this.isLive) {
            return 75;
        }
        if (this.isBackgroundPrefetch && (i3 = this.abrSetting.A0F) > 0) {
            return i3;
        }
        if (this.isSponsored) {
            C42081wy c42081wy = this.abrSetting;
            int i4 = c42081wy.A0C;
            if (i4 > 0) {
                return i4;
            }
            if (this.isPrefetch) {
                i2 = c42081wy.A0E;
            } else {
                i2 = c42081wy.A0D;
            }
            if (i2 > 0) {
                return i2;
            }
        }
        if (this.isPrefetch && this.enableForegroundPrefetchQualityExperimentation && (i = this.abrSetting.A0G) > 0) {
            return i;
        }
        return this.abrSetting.A0H;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return false;
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, EnumC440821q enumC440821q) {
        C14360o3.A0B(enumC440821q, 1);
        return i - 1;
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return 0;
    }

    public final int getMaxWidthSphericalVideo() {
        return 0;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        return 0;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return 0;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return 0;
    }

    public final int getMinMosConstraintLimit() {
        return 0;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return 0.0f;
    }

    public final int getModWatchableMos() {
        return 0;
    }

    public final int getMosDiffPctForCachedQuality() {
        return 0;
    }

    public final double getRiskAdjFactor(boolean z, EnumC440821q enumC440821q) {
        C14360o3.A0B(enumC440821q, 1);
        boolean z2 = this.isLive;
        if (!z && z2 && enumC440821q != EnumC440821q.A02) {
            EnumC440821q enumC440821q2 = EnumC440821q.A05;
            C42081wy c42081wy = this.abrSetting;
            if (enumC440821q != enumC440821q2) {
                return c42081wy.A00;
            }
            return 0.0d;
        }
        return 0.0d;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return false;
    }

    public final boolean getShouldEnableBwOnlyEstimationForLongPoll() {
        return false;
    }

    public final boolean getShouldEnableTtfbOnlyEstimation() {
        return false;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return false;
    }

    public final boolean getShouldUseServerSideGoodput() {
        return false;
    }

    public final double getSystemicRiskFactor(boolean z, EnumC440821q enumC440821q) {
        C14360o3.A0B(enumC440821q, 1);
        boolean z2 = this.isLive;
        if (z) {
            C42081wy c42081wy = this.abrSetting;
            if (z2) {
                return 4.0d;
            }
            return c42081wy.A07;
        }
        if (z2) {
            if (enumC440821q != EnumC440821q.A02) {
                EnumC440821q enumC440821q2 = EnumC440821q.A05;
                C42081wy c42081wy2 = this.abrSetting;
                if (enumC440821q != enumC440821q2) {
                    return c42081wy2.A01;
                }
                return 0.0d;
            }
            return 0.0d;
        }
        isOnWifi();
        return this.abrSetting.A09;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        return false;
    }

    public final int getTtfbMsecWithServerSideGoodput() {
        return -1;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return false;
    }

    public final double getVirtualBufferPercent(EnumC440821q enumC440821q) {
        C14360o3.A0B(enumC440821q, 0);
        if (enumC440821q != EnumC440821q.A02 && enumC440821q != EnumC440821q.A05) {
            boolean z = this.isLive;
            C42081wy c42081wy = this.abrSetting;
            if (z) {
                return c42081wy.A03;
            }
            return 0.0d;
        }
        return 0.0d;
    }

    public final boolean isSystemicRiskIBR(boolean z, C4BV c4bv) {
        if (z) {
            boolean z2 = this.isLive;
            C42081wy c42081wy = this.abrSetting;
            if (z2 || !c42081wy.A0X || c4bv == null || !c4bv.A02) {
                return true;
            }
        }
        return false;
    }

    public final boolean overrideCacheWhenHighMos() {
        return false;
    }

    public final boolean overrideCacheWhenHighMosForPrefetch() {
        return false;
    }

    public final boolean shouldAlwaysPlayCachedData() {
        return false;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return false;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return false;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        return false;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        return false;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        return false;
    }

    public final boolean updateFormatsWithIntentionChange() {
        return false;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        return false;
    }

    public final boolean usePersonalizedBWRiskConfPcts() {
        return false;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        return false;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        return false;
    }

    private final float getInitialBitrateBoosterByNetworkQuality() {
        return 1.0f;
    }

    public final boolean enableQoERationalGamblerAbr(boolean z) {
        if (this.isLive) {
            return false;
        }
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0V;
        }
        return c42081wy.A0U;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        return false;
    }

    public final boolean enableWifiBasedRewardSidnee() {
        if (this.abrSetting.A0W && isOnWifi()) {
            return true;
        }
        return false;
    }

    public final long getAbrDurationForIntentional() {
        return 0L;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        return 0L;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        return 0L;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return 800.0f;
    }

    public final double getBadVisualQualityRationalGamblerReward() {
        return 0.25d;
    }

    public final double getBadVisualQualityRationalGamblerThreshold() {
        return 40.0d;
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (!this.isLive) {
            return true;
        }
        return false;
    }

    public final ConnectivityManager getConnectivityManager() {
        C2A4 c2a4 = this.connectivityManagerHolder;
        if (c2a4 != null) {
            if (c2a4.A00 == null) {
                try {
                    c2a4.A00 = (ConnectivityManager) c2a4.A02.getSystemService("connectivity");
                } catch (NullPointerException unused) {
                }
            }
            return c2a4.A00;
        }
        return null;
    }

    public final String getDataConnectionQuality() {
        return "UNKNOWN";
    }

    public final int getDefaultBwRiskConfPct() {
        return 50;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return 1.0f;
    }

    public final boolean getEnableDeviceHealthPenalty() {
        return this.abrSetting.A0S;
    }

    public final boolean getEnableOverallMOSRewardSidnee() {
        return this.abrSetting.A0T;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A0w;
    }

    public final float getFrameDropFactor() {
        return 1.0f;
    }

    public final double getHighOrBetterMosThreshold() {
        return 0.0d;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.A0f;
    }

    public final boolean getIsPrefetch() {
        return this.isPrefetch;
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0h;
        }
        return c42081wy.A0g;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        return 0.0d;
    }

    public final float getMaxBandwidthMultiplier() {
        return 2.0f;
    }

    public final int getMaxInitialBitrate() {
        int i;
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            i = 50000;
        } else {
            i = c42081wy.A0m;
        }
        return (int) (i * 1.0d);
    }

    public final long getMaxRationalGamblerABREvaluationDurationMs() {
        return 30000L;
    }

    public final double getMaxRationalGamblerMultiplier() {
        return 2.0d;
    }

    public final float getMaxTTFBMultiplier() {
        return 3.0f;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0i;
        }
        return c42081wy.A0n;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0j;
        }
        return c42081wy.A0o;
    }

    public final int getMaxWidthToPrefetch() {
        boolean z;
        C2B2 c2b2 = this.playbackPreferences;
        synchronized (c2b2) {
            z = c2b2.A03;
        }
        if (z) {
            return 0;
        }
        boolean z2 = this.isLive;
        boolean isOnWifi = isOnWifi();
        if (z2) {
            C42081wy c42081wy = this.abrSetting;
            if (isOnWifi) {
                return c42081wy.A0l;
            }
            return c42081wy.A0k;
        }
        C42081wy c42081wy2 = this.abrSetting;
        if (isOnWifi) {
            return c42081wy2.A0p;
        }
        return c42081wy2.A0q;
    }

    public final long getMinBufferDurationMsRationalGambler() {
        return this.abrSetting.A0O;
    }

    public final int getMinMosForCachedQuality() {
        if (!this.isLive) {
            boolean z = this.isStory;
            C42081wy c42081wy = this.abrSetting;
            if (!z) {
                return c42081wy.A0K;
            }
            return 0;
        }
        return 0;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.A04;
    }

    public final float getMinPartiallyCachedSpan() {
        return 1.0f;
    }

    public final double getMinRationalGamblerMultiplier() {
        return 0.5d;
    }

    public final float getMinTTFBMultiplier() {
        return 0.5f;
    }

    public final int getMinWatchableMos() {
        return this.abrSetting.A0L;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.A0M;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.A05;
    }

    public final int getPersonalizedBWRiskConfPctAggressive() {
        return 70;
    }

    public final int getPersonalizedBWRiskConfPctConservative() {
        return 80;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        return 75;
    }

    public final int getPersonalizedBWRiskConfPctVeryAggressive() {
        return 65;
    }

    public final int getPersonalizedBWRiskConfPctVeryConservative() {
        return 85;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return 30000L;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        return 1.0d;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        return 1.0d;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        return 1.0d;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        return 1.0d;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        return 0.0d;
    }

    public final C2B2 getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final AnonymousClass267 getRationalGamblerConfig() {
        return this.abrSetting.A0P;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return 0.0f;
        }
        return this.abrSetting.A0e;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0c;
        }
        return 1.2f;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0d;
        }
        return 1.2f;
    }

    public final boolean getShouldAvoidOnCellular() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return false;
        }
        return c42081wy.A0u;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return false;
        }
        return c42081wy.A0s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r9.getBoolean("enable_battery_penalty") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r9.getBoolean("enable_memory_penalty") == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: ExceptionInInitializerError | RuntimeException | JSONException -> 0x009c, TryCatch #0 {ExceptionInInitializerError | RuntimeException | JSONException -> 0x009c, blocks: (B:3:0x0004, B:5:0x0012, B:6:0x0016, B:8:0x001f, B:9:0x0023, B:11:0x002b, B:12:0x002f, B:14:0x0038, B:15:0x003c, B:17:0x0044, B:18:0x0048, B:20:0x0051, B:23:0x0064, B:25:0x006d, B:27:0x0075, B:29:0x007e, B:31:0x0086), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: ExceptionInInitializerError | RuntimeException | JSONException -> 0x009c, TryCatch #0 {ExceptionInInitializerError | RuntimeException | JSONException -> 0x009c, blocks: (B:3:0x0004, B:5:0x0012, B:6:0x0016, B:8:0x001f, B:9:0x0023, B:11:0x002b, B:12:0x002f, B:14:0x0038, B:15:0x003c, B:17:0x0044, B:18:0x0048, B:20:0x0051, B:23:0x0064, B:25:0x006d, B:27:0x0075, B:29:0x007e, B:31:0x0086), top: B:2:0x0004 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2BT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.2BT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2BT getSidneeDeviceAwareAbrManagerConfig() {
        /*
            r10 = this;
            X.1wy r0 = r10.abrSetting
            java.lang.String r0 = r0.A0Q
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9c
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = "max_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L61
            int r8 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L9c
        L16:
            java.lang.String r1 = "thermal_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L5f
            int r7 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L9c
        L23:
            java.lang.String r1 = "battery_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L5d
            int r6 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L9c
        L2f:
            java.lang.String r1 = "memory_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L5b
            int r5 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L9c
        L3c:
            java.lang.String r1 = "battery_threshold"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L59
            int r4 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L9c
        L48:
            java.lang.String r1 = "enable_thermal_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L63
            boolean r0 = r9.getBoolean(r1)     // Catch: java.lang.Throwable -> L9c
            r3 = 1
            if (r0 != 0) goto L64
            goto L63
        L59:
            r4 = 0
            goto L48
        L5b:
            r5 = 0
            goto L3c
        L5d:
            r6 = 0
            goto L2f
        L5f:
            r7 = 0
            goto L23
        L61:
            r8 = 0
            goto L16
        L63:
            r3 = 0
        L64:
            java.lang.String r1 = "enable_battery_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L74
            boolean r0 = r9.getBoolean(r1)     // Catch: java.lang.Throwable -> L9c
            r2 = 1
            if (r0 != 0) goto L75
        L74:
            r2 = 0
        L75:
            java.lang.String r1 = "enable_memory_penalty"
            boolean r0 = r9.has(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L85
            boolean r1 = r9.getBoolean(r1)     // Catch: java.lang.Throwable -> L9c
            r0 = 1
            if (r1 != 0) goto L86
        L85:
            r0 = 0
        L86:
            X.2BT r1 = new X.2BT     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            r1.A02 = r8     // Catch: java.lang.Throwable -> L9c
            r1.A04 = r7     // Catch: java.lang.Throwable -> L9c
            r1.A00 = r6     // Catch: java.lang.Throwable -> L9c
            r1.A03 = r5     // Catch: java.lang.Throwable -> L9c
            r1.A01 = r4     // Catch: java.lang.Throwable -> L9c
            r1.A07 = r3     // Catch: java.lang.Throwable -> L9c
            r1.A05 = r2     // Catch: java.lang.Throwable -> L9c
            r1.A06 = r0     // Catch: java.lang.Throwable -> L9c
            return r1
        L9c:
            r0 = 0
            X.2BT r1 = new X.2BT
            r1.<init>()
            r1.A02 = r0
            r1.A04 = r0
            r1.A00 = r0
            r1.A03 = r0
            r1.A01 = r0
            r1.A07 = r0
            r1.A05 = r0
            r1.A06 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getSidneeDeviceAwareAbrManagerConfig():X.2BT");
    }

    public final boolean getSkipCachedAsCurrent() {
        return this.abrSetting.A10;
    }

    public final double getSmartCacheOverrideThreshold() {
        return 0.0d;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return 0.0d;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return 30000;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return 10000;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0I;
        }
        return CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (z) {
            boolean z2 = this.isLive;
            C42081wy c42081wy = this.abrSetting;
            if (z2) {
                return 6.0d;
            }
            return c42081wy.A06;
        }
        return 1.0d;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (z) {
            boolean z2 = this.isLive;
            C42081wy c42081wy = this.abrSetting;
            if (z2) {
                return true;
            }
            return c42081wy.A0Y;
        }
        return false;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            C42081wy c42081wy = this.abrSetting;
            if (z2) {
                return 1.2d;
            }
            return c42081wy.A08;
        }
        if (z2) {
            return this.abrSetting.A02;
        }
        isOnWifi();
        return this.abrSetting.A0A;
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        boolean z = this.isLive;
        C42081wy c42081wy = this.abrSetting;
        if (z) {
            return c42081wy.A0J;
        }
        return 0;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.A0B;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (z) {
            boolean z2 = this.isLive;
            C42081wy c42081wy = this.abrSetting;
            if (!z2) {
                return c42081wy.A0N;
            }
            return 0;
        }
        return 0;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return 300.0f;
    }

    public final boolean getUsePlaybackCsvqm() {
        return this.abrSetting.A0a;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.A0b;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnWifi() {
        C2A4 c2a4 = this.connectivityManagerHolder;
        if (c2a4 != null) {
            return c2a4.A01();
        }
        return false;
    }

    public final boolean shouldAvoidOnABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A0y;
    }

    public final boolean shouldExcludeCDNResponseTimeForLongPoll() {
        return this.abrSetting.A0x;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.A11;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A12;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (!z) {
            boolean z2 = this.isLive;
            C42081wy c42081wy = this.abrSetting;
            if (!z2) {
                return c42081wy.A13;
            }
            return false;
        }
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A0Z;
    }

    public final float getMinBandwidthMultiplier() {
        return 0.3f;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return 120000L;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return 300000L;
    }

    public final double getGoodVisualQualityRationalGamblerReward() {
        return 0.6d;
    }

    public final double getGoodVisualQualityRationalGamblerThreshold() {
        return 75.0d;
    }

    public final double getGreatVisualQualityRationalGamblerReward() {
        return 0.9d;
    }

    public final double getGreatVisualQualityRationalGamblerThreshold() {
        return 95.0d;
    }
}
