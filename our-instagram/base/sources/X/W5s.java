package X;

/* loaded from: classes11.dex */
public final class W5s {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final OMT A0A;
    public final U7W A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W5s) {
                W5s w5s = (W5s) obj;
                if (this.A1A != w5s.A1A || this.A1F != w5s.A1F || this.A1D != w5s.A1D || this.A1E != w5s.A1E || this.A00 != w5s.A00 || this.A0G != w5s.A0G || this.A0J != w5s.A0J || this.A0F != w5s.A0F || this.A0H != w5s.A0H || this.A0I != w5s.A0I || !C14360o3.A0K(this.A0C, w5s.A0C) || this.A0K != w5s.A0K || this.A19 != w5s.A19 || this.A1C != w5s.A1C || this.A0m != w5s.A0m || this.A0c != w5s.A0c || this.A0b != w5s.A0b || this.A15 != w5s.A15 || this.A0Q != w5s.A0Q || this.A0r != w5s.A0r || this.A0e != w5s.A0e || this.A0p != w5s.A0p || this.A0s != w5s.A0s || this.A0u != w5s.A0u || this.A0v != w5s.A0v || this.A0N != w5s.A0N || this.A0d != w5s.A0d || this.A11 != w5s.A11 || this.A14 != w5s.A14 || this.A13 != w5s.A13 || this.A0y != w5s.A0y || this.A03 != w5s.A03 || this.A0g != w5s.A0g || this.A0h != w5s.A0h || this.A0f != w5s.A0f || this.A0i != w5s.A0i || this.A0w != w5s.A0w || this.A0E != w5s.A0E || this.A0j != w5s.A0j || this.A0L != w5s.A0L || this.A10 != w5s.A10 || this.A05 != w5s.A05 || this.A04 != w5s.A04 || this.A0T != w5s.A0T || this.A02 != w5s.A02 || this.A01 != w5s.A01 || !C14360o3.A0K(this.A0D, w5s.A0D) || this.A0M != w5s.A0M || this.A0Z != w5s.A0Z || this.A0U != w5s.A0U || this.A0Y != w5s.A0Y || this.A0R != w5s.A0R || this.A0X != w5s.A0X || this.A0W != w5s.A0W || this.A06 != w5s.A06 || this.A0x != w5s.A0x || this.A09 != w5s.A09 || this.A08 != w5s.A08 || this.A0a != w5s.A0a || this.A0z != w5s.A0z || this.A0S != w5s.A0S || this.A0l != w5s.A0l || this.A0o != w5s.A0o || this.A0P != w5s.A0P || this.A18 != w5s.A18 || this.A0V != w5s.A0V || this.A0t != w5s.A0t || this.A16 != w5s.A16 || this.A0k != w5s.A0k || this.A0n != w5s.A0n || this.A0O != w5s.A0O || this.A17 != w5s.A17 || this.A1B != w5s.A1B || this.A07 != w5s.A07 || this.A0q != w5s.A0q || this.A12 != w5s.A12) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExperimentConfiguration(isRealTimeDisplayEncoderWarmUpDisabled=");
        sb.append(true);
        sb.append(", isSurfaceFrameTimeoutFixEnabled=");
        sb.append(true);
        sb.append(", shouldFetchTimeInPlayerThread=");
        sb.append(this.A1A);
        sb.append(", audioSinkBufferSizeMultiplier=");
        sb.append(1);
        sb.append(", useFbaAudioProcessor=");
        sb.append(this.A1F);
        sb.append(", useCTAudioProcessor=");
        sb.append(this.A1D);
        sb.append(", useCTVoiceEffectProcessor=");
        sb.append(this.A1E);
        sb.append(", audioEnhancementWarmupDurationSeconds=");
        sb.append(this.A00);
        sb.append(", audioEnhancementEnableWarmup=");
        sb.append(this.A0G);
        sb.append(", audioEnhancementNREnabled=");
        sb.append(this.A0J);
        sb.append(", audioEnhancementAutoEQEnabled=");
        sb.append(this.A0F);
        sb.append(", audioEnhancementLevelerEnabled=");
        sb.append(this.A0H);
        sb.append(", audioEnhancementMLNoiseRemoverEnabled=");
        sb.append(this.A0I);
        sb.append(", audioEnhancementModelPath=");
        sb.append(this.A0C);
        sb.append(", audioEnhancementVoltronLoaded=");
        sb.append(this.A0K);
        sb.append(", voiceLevelerOptimisationsEnabled=");
        sb.append(false);
        sb.append(", isHandleOutViewLifecycleEnabled=");
        sb.append(false);
        sb.append(", shouldEnableVideoTrackSegmentSplitForReverse=");
        sb.append(this.A19);
        sb.append(", shouldSeekOnceWhenUpdateMediaComposition=");
        sb.append(this.A1C);
        sb.append(", enablePQHdrTonemap=");
        sb.append(this.A0m);
        sb.append(", enableHLGHdrTonemap=");
        sb.append(this.A0c);
        sb.append(", enableHLGHdrTranscode=");
        sb.append(false);
        sb.append(", enableHdr10PlusTonemap=");
        sb.append(false);
        sb.append(", enableHdr10PlusTonemapToHlg=");
        sb.append(false);
        sb.append(", isHLGHdrTranscodeEnabledForEffects=");
        sb.append(false);
        sb.append(", isEglCaveatConfigEnabled=");
        sb.append(false);
        sb.append(", enableHdrPreview=");
        sb.append(false);
        sb.append(", enableHdrEffectCheck=");
        sb.append(true);
        sb.append(", enableFixForReleaseTimeOut=");
        sb.append(this.A0b);
        sb.append(", enableVerboseLogs=");
        sb.append(this.A15);
        sb.append(", enableCancelBeforeRelease=");
        sb.append(this.A0Q);
        sb.append(", enableReducedLookahead=");
        sb.append(this.A0r);
        sb.append(", enableLoopStylePreloading=");
        sb.append(this.A0e);
        sb.append(", enableProactiveReleasing=");
        sb.append(this.A0p);
        sb.append(", enableRefreshOnSeek=");
        sb.append(this.A0s);
        sb.append(", enableReleaseVideoInputResourcesOpt=");
        sb.append(this.A0u);
        sb.append(", enableRemoveOutputsOnRelease=");
        sb.append(this.A0v);
        sb.append(", enableAsyncSurfaceTexture=");
        sb.append(this.A0N);
        sb.append(", enableHandlerThreadInterruptOnRelease=");
        sb.append(this.A0d);
        sb.append(", enableUnsupportedMimeTypeForDemuxer=");
        sb.append(this.A11);
        sb.append(", enableUseSupportedVideoTrackIfAvailable=");
        sb.append(this.A14);
        sb.append(", enableUseSupportedAudioTrackIfAvailable=");
        sb.append(this.A13);
        sb.append(", enableReusePlayerSessionIdOnRetry=");
        sb.append(this.A0y);
        sb.append(", getReleaseBlockTimeMs=");
        sb.append(this.A03);
        sb.append(", enableMediaAccuracyCapture=");
        sb.append(this.A0g);
        sb.append(", enableMediaAccuracyDynamicSampling=");
        sb.append(this.A0h);
        sb.append(", enableMediaAccuracyAudioCapture=");
        sb.append(this.A0f);
        sb.append(", enableMediaAccuracyNonZeroTimestampSnapshot=");
        sb.append(this.A0i);
        sb.append(", enableRetryForDecoderStartFailure=");
        sb.append(this.A0w);
        sb.append(", addCodecToBlocklistOnDecoderStartRetry=");
        sb.append(this.A0E);
        sb.append(", enableNewPrepareDecoderWithRetry=");
        sb.append(this.A0j);
        sb.append(", checkSoftwareDecoding=");
        sb.append(this.A0L);
        sb.append(", enableSoftwareDecoder=");
        sb.append(this.A10);
        sb.append(", getSoftwareDecodingWidth=");
        sb.append(this.A05);
        sb.append(", getSoftwareDecodingFrameRate=");
        sb.append(this.A04);
        sb.append(", enableDecoderFallbackResolution=");
        sb.append(this.A0T);
        sb.append(", getFallbackWidth=");
        sb.append(this.A02);
        sb.append(", getFallbackHeight=");
        sb.append(this.A01);
        sb.append(", mediaAccuracyCaptureTimestampsCsv=");
        sb.append(this.A0D);
        sb.append(", doNotRetainByteBuffer=");
        sb.append(this.A0M);
        sb.append(", enableExoPlayerMedia3Extractor=");
        sb.append(this.A0Z);
        AbstractC25235BEs.A1M(sb, ", enableTraceLogs=");
        sb.append(", enableDecoderTargetResolution=");
        sb.append(this.A0U);
        sb.append(", enableExcludeLastPtsInTimeRange=");
        sb.append(this.A0Y);
        sb.append(", enableCancelDecoderExtractFuture=");
        sb.append(this.A0R);
        sb.append(", enableVideoTranscoderReuse=");
        sb.append(false);
        sb.append(", enableTextureAvailableRaceConditionFix=");
        sb.append(false);
        sb.append(", enableDemuxerThreadLockSync=");
        sb.append(this.A0X);
        sb.append(", enableDemuxerThreadCancel=");
        sb.append(this.A0W);
        sb.append(", getDemuxerThreadTimeoutMs=");
        sb.append(this.A06);
        sb.append(", enableRetryableMediaCompositionPlayer=");
        sb.append(this.A0x);
        sb.append(", retryableMediaCompositionPlayerMaxRetries=");
        sb.append(this.A09);
        sb.append(", retryableMediaCompositionPlayerErrorThresholdMs=");
        sb.append(this.A08);
        sb.append(", enableFirstFramePtsFix=");
        sb.append(this.A0a);
        AbstractC25235BEs.A1M(sb, ", enableRenderLockReleaseOnNoop=");
        sb.append(", enableSkipAudioTrack=");
        sb.append(this.A0z);
        sb.append(", enableFrameRendererSyncRelease=");
        sb.append(false);
        sb.append(", enableExceptionThrownOnMuxerOperationCancellation=");
        sb.append(false);
        sb.append(", enableExceptionThrownOnOperationCancellation=");
        sb.append(false);
        sb.append(", shouldSynchronizeZoomCrop=");
        sb.append(false);
        sb.append(", enableCancelRendering=");
        sb.append(this.A0S);
        sb.append(", enableOpenGlCleanup=");
        sb.append(this.A0l);
        sb.append(", enablePlayerFpsFix=");
        sb.append(this.A0o);
        sb.append(", enableAudioRawMimeTypeForBaseMediaDemuxer=");
        sb.append(this.A0P);
        sb.append(", shouldCacheLastPrepareSeekPositionNs=");
        sb.append(this.A18);
        AbstractC25235BEs.A1M(sb, ", enableBitmapSyncFix=");
        sb.append(", enableDeltaStuckTime=");
        sb.append(this.A0V);
        sb.append(", enableReleaseTimeoutCheckWarning=");
        sb.append(this.A0t);
        sb.append(", ignoreReleaseTimeoutError=");
        sb.append(this.A16);
        sb.append(", splitReverseChunkDurationMs=");
        sb.append(2500);
        sb.append(", enableOnTheFlyGlobalVolumeUpdate=");
        sb.append(this.A0k);
        sb.append(", enablePTVFrameIntervalFix=");
        sb.append(this.A0n);
        AbstractC25235BEs.A1M(sb, ", enableHdrWindowSurfaceAttributes=");
        sb.append(", enableAudioOnlyVVP=");
        sb.append(this.A0O);
        AbstractC25235BEs.A1M(sb, ", useSurfaceViewForVvp=");
        sb.append(", logFileContentsOnExtractorFailure=");
        sb.append(this.A17);
        AbstractC25235BEs.A1M(sb, ", isAsyncAudioDecoderEnabled=");
        sb.append(", shouldRetryMediaCodecStopRelease=");
        sb.append(this.A1B);
        sb.append(", getMediaCodecRetryTimeoutMs=");
        sb.append(this.A07);
        sb.append(", enableQPLLoggingVVP=");
        sb.append(this.A0q);
        sb.append(", enableUpdateMediaEffect=");
        return AbstractC25236BEt.A0a(sb, this.A12);
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0K, AbstractC166997dE.A0K(this.A0C, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0G, (AbstractC167007dF.A0D(this.A1E, AbstractC167007dF.A0D(this.A1D, AbstractC167007dF.A0D(this.A1F, (AbstractC167007dF.A0D(this.A1A, 1221152) + 1) * 31))) + this.A00) * 31)))))));
        int A00 = AbstractC53644Nnp.A00();
        int A0D2 = AbstractC167007dF.A0D(this.A0q, AbstractC167007dF.A07(this.A07, AbstractC167007dF.A0D(this.A1B, (AbstractC167007dF.A0D(this.A17, (AbstractC167007dF.A0D(this.A0O, (AbstractC167007dF.A0D(this.A0n, AbstractC167007dF.A0D(this.A0k, (AbstractC167007dF.A0D(this.A16, AbstractC167007dF.A0D(this.A0t, AbstractC167007dF.A0D(this.A0V, (AbstractC167007dF.A0D(this.A18, AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0o, AbstractC167007dF.A0D(this.A0l, AbstractC167007dF.A0D(this.A0S, (((((((AbstractC167007dF.A0D(this.A0z, (AbstractC167007dF.A0D(this.A0a, AbstractC167007dF.A07(this.A08, AbstractC167007dF.A07(this.A09, AbstractC167007dF.A0D(this.A0x, AbstractC167007dF.A07(this.A06, AbstractC167007dF.A0D(this.A0W, AbstractC167007dF.A0D(this.A0X, (((AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0U, (AbstractC167007dF.A0D(this.A0Z, AbstractC167007dF.A0D(this.A0M, AbstractC166997dE.A0K(this.A0D, (((AbstractC167007dF.A0D(this.A0T, (((AbstractC167007dF.A0D(this.A10, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0j, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0w, AbstractC167007dF.A0D(this.A0i, AbstractC167007dF.A0D(this.A0f, AbstractC167007dF.A0D(this.A0h, AbstractC167007dF.A0D(this.A0g, (AbstractC167007dF.A0D(this.A0y, AbstractC167007dF.A0D(this.A13, AbstractC167007dF.A0D(this.A14, AbstractC167007dF.A0D(this.A11, AbstractC167007dF.A0D(this.A0d, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0v, AbstractC167007dF.A0D(this.A0u, AbstractC167007dF.A0D(this.A0s, AbstractC167007dF.A0D(this.A0p, AbstractC167007dF.A0D(this.A0e, AbstractC167007dF.A0D(this.A0r, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A15, AbstractC167007dF.A0D(this.A0b, (((((((((((((AbstractC167007dF.A0D(this.A0c, AbstractC167007dF.A0D(this.A0m, AbstractC167007dF.A0D(this.A1C, AbstractC167007dF.A0D(this.A19, (((A0D + A00) * 31) + A00) * 31)))) + A00) * 31) + A00) * 31) + A00) * 31) + A00) * 31) + A00) * 31) + A00) * 31) + 1231) * 31))))))))))))))) + this.A03) * 31))))))))) + this.A05) * 31) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31))) + A00) * 31))) + A00) * 31) + A00) * 31))))))) + A00) * 31) + A00) * 31) + A00) * 31) + A00) * 31) + A00) * 31))))) + A00) * 31))) + 2500) * 31)) + A00) * 31) + A00) * 31) + A00) * 31)));
        int i = 1237;
        if (this.A12) {
            i = 1231;
        }
        return A0D2 + i;
    }

    public W5s(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, boolean z51, boolean z52, boolean z53, boolean z54, boolean z55, boolean z56, boolean z57, boolean z58, boolean z59, boolean z60, boolean z61, boolean z62, boolean z63, boolean z64) {
        this.A1A = z;
        this.A1F = z2;
        this.A1D = z3;
        this.A1E = z4;
        this.A00 = i;
        this.A0G = z5;
        this.A0J = z6;
        this.A0F = z7;
        this.A0H = z8;
        this.A0I = z9;
        this.A0C = str;
        this.A0K = z10;
        this.A19 = z11;
        this.A1C = z12;
        this.A0m = z13;
        this.A0c = z14;
        this.A0b = z15;
        this.A15 = z16;
        this.A0Q = z17;
        this.A0r = z18;
        this.A0e = z19;
        this.A0p = z20;
        this.A0s = z21;
        this.A0u = z22;
        this.A0v = z23;
        this.A0N = z24;
        this.A0d = z25;
        this.A11 = z26;
        this.A14 = z27;
        this.A13 = z28;
        this.A0y = z29;
        this.A03 = i2;
        this.A0g = z30;
        this.A0h = z31;
        this.A0f = z32;
        this.A0i = z33;
        this.A0w = z34;
        this.A0E = z35;
        this.A0j = z36;
        this.A0L = z37;
        this.A10 = z38;
        this.A05 = i3;
        this.A04 = i4;
        this.A0T = z39;
        this.A02 = i5;
        this.A01 = i6;
        this.A0D = str2;
        this.A0M = z40;
        this.A0Z = z41;
        this.A0U = z42;
        this.A0Y = z43;
        this.A0R = z44;
        this.A0X = z45;
        this.A0W = z46;
        this.A06 = j;
        this.A0x = z47;
        this.A09 = j2;
        this.A08 = j3;
        this.A0a = z48;
        this.A0z = z49;
        this.A0S = z50;
        this.A0l = z51;
        this.A0o = z52;
        this.A0P = z53;
        this.A18 = z54;
        this.A0V = z55;
        this.A0t = z56;
        this.A16 = z57;
        this.A0k = z58;
        this.A0n = z59;
        this.A0O = z60;
        this.A17 = z61;
        this.A1B = z62;
        this.A07 = j4;
        this.A0q = z63;
        this.A12 = z64;
        this.A0B = new C67639Utu(this, 1);
        this.A0A = new C51506Mor(this);
    }

    public W5s() {
        this("", "0", 5, 5000, -1, -1, -1, -1, -1L, 0L, 0L, 10L, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }
}