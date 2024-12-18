package X;

import java.util.List;

/* renamed from: X.VtL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69676VtL {
    public final List A00;

    public C69676VtL(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final void A00(Object obj) {
        String str;
        String valueOf;
        String str2;
        String str3;
        if (obj instanceof C4SS) {
            C4SS c4ss = (C4SS) obj;
            str = "VideoPlayRequest";
            A01("VideoPlayRequest", "mClientPlayerType", c4ss.A06);
            A01("VideoPlayRequest", "mRenderMode", String.valueOf(c4ss.A00));
            String valueOf2 = String.valueOf(false);
            A01("VideoPlayRequest", "mIsApiBroadcast", valueOf2);
            A01("VideoPlayRequest", "mPlayLowestQuality", String.valueOf(c4ss.A0C));
            A01("VideoPlayRequest", "mPrepareExoplayerUponPrepare", String.valueOf(c4ss.A0D));
            A01("VideoPlayRequest", "mReadAheadBufferPolicy", "DEFAULT");
            A01("VideoPlayRequest", "mStartPositionMs", String.valueOf(c4ss.A01));
            A01("VideoPlayRequest", "mCanRaisePriority", valueOf2);
            A01("VideoPlayRequest", "mWatermarkInPauseMs", String.valueOf(c4ss.A02));
            A01("VideoPlayRequest", "mOverridingPlayerWatermarkBeforePlayedMs", String.valueOf(c4ss.A0H));
            A01("VideoPlayRequest", "mOverridingPlayerWarmUpWatermarkMs", String.valueOf(c4ss.A0G));
            A01("VideoPlayRequest", "mLoadDataBeforePlayed", String.valueOf(c4ss.A0T));
            A01("VideoPlayRequest", "mSeekToPreviousKeyFrame", valueOf2);
            A01("VideoPlayRequest", "mEnableLazyAudioLoading", String.valueOf(c4ss.A0R));
            A01("VideoPlayRequest", "mBufferForUnpausePlaybackFactor", String.valueOf(1.0f));
            A01("VideoPlayRequest", "mAudioFocusType", String.valueOf(1));
            A01("VideoPlayRequest", "mShouldCropToFit", String.valueOf(c4ss.A0V));
            valueOf = String.valueOf(c4ss.A0U);
            str2 = "mNeedCentering";
        } else if (obj instanceof C4AN) {
            C4AN c4an = (C4AN) obj;
            android.net.Uri uri = c4an.A05;
            String str4 = "";
            if (uri == null) {
                str3 = "";
            } else {
                str3 = String.valueOf(uri);
            }
            str = "VideoSource";
            A01("VideoSource", "mUri", str3);
            android.net.Uri uri2 = c4an.A04;
            if (uri2 != null) {
                str4 = String.valueOf(uri2);
            }
            A01("VideoSource", "mSubtitleUri", str4);
            A01("VideoSource", "mVideoId", c4an.A0G);
            A01("VideoSource", "mManifestContent", c4an.A09);
            A01("VideoSource", "mVideoCodec", c4an.A0F);
            A01("VideoSource", "mPlayOrigin", c4an.A0A);
            A01("VideoSource", "mPlaySubOrigin", c4an.A0B);
            A01("VideoSource", "mVideoType", c4an.A07.toString());
            A01("VideoSource", "mTrackerId", c4an.A0E);
            A01("VideoSource", "mIsSpherical", String.valueOf(c4an.A0M));
            A01("VideoSource", "mIsSponsored", String.valueOf(c4an.A0N));
            A01("VideoSource", "mIsLiveTraceEnabled", String.valueOf(c4an.A0L));
            A01("VideoSource", "mIsAudioDataListenerEnabled", String.valueOf(c4an.A0K));
            A01("VideoSource", "mRenderMode", c4an.A0D);
            A01("VideoSource", "mIsBroadcast", String.valueOf(false));
            A01("VideoSource", "mContentType", c4an.A06.toString());
            valueOf = c4an.A01().toString();
            str2 = "isValid()";
        } else if (obj instanceof C4RU) {
            C4RU c4ru = (C4RU) obj;
            str = "ServicePlayerState";
            A01("ServicePlayerState", "mTimeMs", String.valueOf(c4ru.A0H));
            A01("ServicePlayerState", "mIsPlaying", String.valueOf(c4ru.A0Q));
            A01("ServicePlayerState", "mIsVisuallyPlaying", String.valueOf(c4ru.A0R));
            A01("ServicePlayerState", "mIsBuffering", String.valueOf(c4ru.A0O));
            A01("ServicePlayerState", "mDuration", String.valueOf(c4ru.A0U));
            A01("ServicePlayerState", "mAudioDuration", String.valueOf(c4ru.A09));
            A01("ServicePlayerState", "mAbsoluteCurrentPosition", String.valueOf(c4ru.A08));
            A01("ServicePlayerState", "mRelativeCurrentPosition", String.valueOf(c4ru.A0D));
            A01("ServicePlayerState", "mBufferedPosition", String.valueOf(c4ru.A0B));
            A01("ServicePlayerState", "mStreamingFormat", c4ru.A0M);
            A01("ServicePlayerState", "mStallStart", String.valueOf(c4ru.A0E));
            A01("ServicePlayerState", "mStallStop", String.valueOf(c4ru.A0F));
            A01("ServicePlayerState", "mNumDashStreams", String.valueOf(c4ru.A05));
            A01("ServicePlayerState", "mNumDashAudioStreams", String.valueOf(c4ru.A04));
            A01("ServicePlayerState", "mExecutedSeekRequestSeqNum", String.valueOf(c4ru.A0C));
            A01("ServicePlayerState", "mIsMixedCodecManifest", String.valueOf(c4ru.A0P));
            A01("ServicePlayerState", "mVideoCodecSwitchedDuringPlayback", String.valueOf(c4ru.A0S));
            valueOf = c4ru.A0L;
            str2 = "mManifestFilteringLog";
        } else {
            if (!(obj instanceof C4RV)) {
                return;
            }
            C4RV c4rv = (C4RV) obj;
            str = "LiveState";
            A01("LiveState", "mTimeMs", String.valueOf(c4rv.A09));
            A01("LiveState", "mLiveManifestFirstAvTimeMs", String.valueOf(c4rv.A03));
            A01("LiveState", "mStaleManifestCount", String.valueOf(c4rv.A00));
            A01("LiveState", "mLiveManifestServerTimeMs", String.valueOf(c4rv.A07));
            A01("LiveState", "mLiveManifestLastVideoFrameTimeMs", String.valueOf(c4rv.A06));
            A01("LiveState", "mPublishFrameTime", String.valueOf(c4rv.A08));
            valueOf = String.valueOf(c4rv.A02);
            str2 = "mLiveEdgePositionMs";
        }
        A01(str, str2, valueOf);
    }

    public final void A01(String str, String str2, String str3) {
        this.A00.add(new C69567VrW(str, str2, str3));
    }
}
