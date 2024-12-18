package X;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.direct.store.InboxNetworkSource;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;
import com.instagram.ml.remotepresence.RpModelDownloadManager;
import com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.screentime.IGScreenTimeApi;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.meta.analytics.gnv.vista.core.CoreVistaManager;

/* renamed from: X.9Cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206459Cc extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return DragGestureNode.A01(null, (DragGestureNode) this.A05, this);
            case 1:
                return ((AwaitFirstLayoutModifier) this.A05).A00(this);
            case 2:
                return ((PausableMonotonicFrameClock) this.A05).FE9(this, null);
            case 3:
                return ((AndroidContentCaptureManager) this.A05).A07(this);
            case 4:
                return ((QPSdkOnDemandSurfaceController) this.A05).A01(null, null, null, null, null, this);
            case 5:
                return MessageQueueTimelineInitializer.A00((MessageQueueTimelineInitializer) this.A05, this);
            case 6:
                return MiniGalleryService.A01(null, (MiniGalleryService) this.A05, null, this);
            case 7:
                return EffectCollectionService.A00((EffectCollectionService) this.A05, null, null, null, null, this, false);
            case 8:
                return ((DraftDirectoryDiskCleanupJob) this.A05).A01(null, this);
            case 9:
                return ((InspirationHubRepository) this.A05).A03(null, this);
            case 10:
                return ((SavedMediaMetadataService) this.A05).A01(null, this);
            case 11:
                return ((SavedMediaMetadataService) this.A05).A03(null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return StoryDraftsCreationViewModel.A00((StoryDraftsCreationViewModel) this.A05, null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((StoryDraftsStore) this.A05).A03(null, this);
            case 14:
                return ClipsCreationDraftViewModel.A06((ClipsCreationDraftViewModel) this.A05, null, this);
            case Process.SIGTERM /* 15 */:
                return ClipsDraftRepository.A00(null, (ClipsDraftRepository) this.A05, this);
            case 16:
                return ((ClipsDraftRepository) this.A05).A0C(null, this);
            case 17:
                return ClipsDraftRepository.A03(null, (ClipsDraftRepository) this.A05, this, null, false, false);
            case 18:
                return ClipsDraftRepository.A01(null, (ClipsDraftRepository) this.A05, this);
            case Process.SIGSTOP /* 19 */:
                return ((ClipsDraftLocalDataSource) this.A05).A06(null, this);
            case 20:
                return ((ClipsDraftLocalDataSource) this.A05).A07(null, this);
            case 21:
                return ((ClipsDraftLocalDataSource) this.A05).A03(null, this);
            case 22:
                return ((ClipsDraftLocalDataSource) this.A05).A05(null, null, this);
            case 23:
                return InboxNetworkSource.A00((InboxNetworkSource) this.A05, null, this);
            case 24:
                return ((ContentFilterDictionaryImpl) this.A05).A02(this);
            case 25:
                return ((ContentFilterDictionaryImpl) this.A05).A03(this);
            case 26:
                return ((ContentFilterDictionaryRegistrar) this.A05).A04(null, this, false);
            case 27:
                return MutedWordsFilterManager.A01((MutedWordsFilterManager) this.A05, null, this);
            case 28:
                return ((IgSignalsDcpPredictor) this.A05).A03(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((FeedCacheRoom) this.A05).A04(null, this);
            case 30:
                return ((RpModelDownloadManager) this.A05).A02(null, this);
            case 31:
                return SimCarrierInfoLogger.A00((SimCarrierInfoLogger) this.A05, this);
            case 32:
                return IGSlotFetcher.A01((IGSlotFetcher) this.A05, null, this, false);
            case 33:
                return ((IGScreenTimeApi) this.A05).A00(null, this);
            case 34:
                return AbstractC116095No.A00((C99044cR) this.A05, null, this);
            case 35:
                return ((CXPNoticeStateApi) this.A05).A03(null, this);
            case 36:
                return IgLiveHeartbeatManager.A00((IgLiveHeartbeatManager) this.A05, this);
            case 37:
                return ((CoreVistaManager) this.A05).A01(null, this);
            case 38:
                return C2Q3.A00((C2Q3) this.A05, this);
            default:
                return C2Q2.A00((C2Q2) this.A05, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206459Cc(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206459Cc) && ((C206459Cc) obj).A04 == i) {
            return true;
        }
        return false;
    }
}
