package instagram.features.clips.ar.features.effectspage.ui;

/* loaded from: classes7.dex */
public final class EffectsPageFragmentLifecycleUtil {
    public static void cleanupReferences(EffectsPageFragment effectsPageFragment) {
        effectsPageFragment.mContainer = null;
        effectsPageFragment.mClipsRecyclerView = null;
        effectsPageFragment.mClipsGridShimmerContainer = null;
        effectsPageFragment.mVideoCountView = null;
        effectsPageFragment.mReelsEmptyMessageView = null;
        effectsPageFragment.mEffectThumbnail = null;
        effectsPageFragment.mUseInCameraButton = null;
        effectsPageFragment.mSaveButton = null;
    }
}
