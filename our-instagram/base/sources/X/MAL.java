package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.paging.FlattenedPageController;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PagingSource;
import androidx.paging.SingleRunner;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler;
import com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.commonavatarliveediting.PrefetchQueue;
import com.facebook.forker.Process;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.videolite.instagram.VideoIngestionStep;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository;
import com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService;
import com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource;
import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.direct.emojipong.data.EmojiPongRepository;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation;
import com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor;
import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAL extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                A00(obj, this);
                return ((LazyGridState) this.A05).EMA(null, this, null);
            case 1:
                A00(obj, this);
                return ((LazyStaggeredGridState) this.A05).EMA(null, this, null);
            case 2:
                A00(obj, this);
                return BVY.A01(null, (BVY) this.A05, this, null);
            case 3:
                A00(obj, this);
                return SingleProcessDataStore.A00(null, (SingleProcessDataStore) this.A05, this);
            case 4:
                A00(obj, this);
                return SingleProcessDataStore.A04((SingleProcessDataStore) this.A05, this);
            case 5:
                A00(obj, this);
                return SingleProcessDataStore.A06((SingleProcessDataStore) this.A05, this, null, null);
            case 6:
                A00(obj, this);
                return ((FlattenedPageController) this.A05).A00(null, this);
            case 7:
                A00(obj, this);
                return ((PageFetcherSnapshot) this.A05).A08(this);
            case 8:
                A00(obj, this);
                return ((SingleRunner.Holder) this.A05).A00(this, null);
            case 9:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return RememberLottieCompositionKt.A01(null, null, null, null, null, null, this);
            case 10:
                A00(obj, this);
                return ODRController.A05((ODRController) this.A05, null, null, null, this, 0);
            case 11:
                A00(obj, this);
                return ODRAvatarHandler.A00((ODRAvatarHandler) this.A05, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00(obj, this);
                return ODRCDLHandler.A00((ODRCDLHandler) this.A05, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00(obj, this);
                return PrefetchQueue.A01((PrefetchQueue) this.A05, null, this);
            case 14:
                A00(obj, this);
                return PrefetchQueue.A00((PrefetchQueue) this.A05, null, this);
            case Process.SIGTERM /* 15 */:
                A00(obj, this);
                return GoogleAuthController.A05(null, null, (GoogleAuthController) this.A05, this, false);
            case 16:
                A00(obj, this);
                return ((GoogleAuthController) this.A05).A08(null, this, false);
            case 17:
                A00(obj, this);
                return ((MetaAiRsysSdk) this.A05).A00(null, this);
            case 18:
                A00(obj, this);
                return VideoIngestionStep.A00((VideoIngestionStep) this.A05, null, this);
            case Process.SIGSTOP /* 19 */:
                A00(obj, this);
                return ((EffectCollectionService) this.A05).A0C(null, null, this);
            case 20:
                A00(obj, this);
                return C142456c7.A03((C142456c7) this.A05, null, null, this, 0L);
            case 21:
                A00(obj, this);
                return C142456c7.A02((C142456c7) this.A05, null, this, false);
            case 22:
                A00(obj, this);
                return C142456c7.A00(null, (C142456c7) this.A05, null, this);
            case 23:
                A00(obj, this);
                return ((AvatarStickerSuggestionRepository) this.A05).A02(null, this);
            case 24:
                A00(obj, this);
                return BrandedContentFeedDisclosureController.A00((BrandedContentFeedDisclosureController) this.A05, null, this);
            case 25:
                A00(obj, this);
                return BugReportComposerFragment.A02((BugReportComposerFragment) this.A05, null, this, 0);
            case 26:
                A00(obj, this);
                return ((IgSignalsCasper) this.A05).A02(this, null);
            case 27:
                A00(obj, this);
                return ImmersiveReplyControlMenuViewBinder.A00(null, (ImmersiveReplyControlMenuViewBinder) this.A05, this);
            case 28:
                A00(obj, this);
                return ImmersiveReplyControlMenuViewBinder.A01(null, (ImmersiveReplyControlMenuViewBinder) this.A05, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A00(obj, this);
                Object A00 = ((CutoutStickerUploadService) this.A05).A00(null, null, null, null, this);
                if (A00 == C1JX.A02) {
                    return A00;
                }
                return new C09550e6(A00);
            case 30:
                A00(obj, this);
                return ClipsACRBrowserPagingSource.A00(null, null, (ClipsACRBrowserPagingSource) this.A05, this);
            case 31:
                A00(obj, this);
                return ((SavedMediaMetadataService) this.A05).A02(null, this);
            case 32:
                A00(obj, this);
                return ((ClipsRemixOriginalMediaRepository) this.A05).A00(null, null, this);
            case 33:
                A00(obj, this);
                return ((SfxAudioRepository) this.A05).A00(null, this);
            case 34:
                A00(obj, this);
                return ((FactsRepository) this.A05).A00(null, null, null, null, null, this);
            case 35:
                A00(obj, this);
                return ((AbstractC26895Btw) this.A05).A05(null, null, this);
            case 36:
                A00(obj, this);
                return ((AbstractC26895Btw) this.A05).A05(null, null, this);
            case 37:
                A00(obj, this);
                return ((PagingSource) this.A05).A04(null, this);
            case 38:
                A00(obj, this);
                return ((EmojiPongRepository) this.A05).A01(null, null, this, null);
            case 39:
                A00(obj, this);
                return ((DirectShareSheetFragmentViewModel) this.A05).A0C(null, null, this);
            case 40:
                A00(obj, this);
                return ((GraphqlOptimisticPostOperation) this.A05).A02(null, null, this);
            case Seq.NULL_REFNUM /* 41 */:
                A00(obj, this);
                return ((MsysMessageEditor) this.A05).A00(null, null, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A00(obj, this);
                return ((DirectTabbedEmojiReactionRepository) this.A05).A01(null, null, null, null, this);
            case 43:
                A00(obj, this);
                return ArmadilloExpressNoteReplySender.A02(null, (ArmadilloExpressNoteReplySender) this.A05, null, this);
            case 44:
                A00(obj, this);
                return ArmadilloExpressStorySender.A00(null, (ArmadilloExpressStorySender) this.A05, null, this);
            case 45:
                A00(obj, this);
                return C2043992v.A02((C2043992v) this.A05, null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A00(obj, this);
                return C164447Xj.A01((C164447Xj) this.A05, null, this);
            case 47:
                A00(obj, this);
                return ((FanClubConsiderationRepository) this.A05).A00(null, null, null, this);
            case 48:
                A00(obj, this);
                return FlashMediaCacheImpl.A03((FlashMediaCacheImpl) this.A05, null, null, this);
            default:
                A00(obj, this);
                return FlashMediaCacheImpl.A05((FlashMediaCacheImpl) this.A05, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAL(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = 9;
    }

    public static void A00(Object obj, MAL mal) {
        mal.A04 = obj;
        mal.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAL) && ((MAL) obj).A06 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAL(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
    }
}
