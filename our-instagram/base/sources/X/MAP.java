package X;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.paging.PageFetcherSnapshot;
import androidx.work.CoroutineWorker;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.avatar.expresso.odr.assetdownloader.ig.IgODRAssetDownloader;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureAnimatedMediaMessageMutationFactory;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import com.instagram.leadads.repository.LeadFormQuestionsRepository;
import com.instagram.ml.hashtag.IgContextualHashtagsProcessor;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.zero.headers.IGZeroHeadersStorage;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;

/* loaded from: classes8.dex */
public final class MAP extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A07) {
            case 0:
                this.A06 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DragGestureDetectorKt.A03(null, this, null, 0L);
            case 1:
                this.A06 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DragGestureDetectorKt.A04(null, this, null, 0L);
            case 2:
                A01(obj, this);
                return PageFetcherSnapshot.A05((PageFetcherSnapshot) this.A06, this);
            case 3:
                A01(obj, this);
                return ODRController.A03((ODRController) this.A06, null, null, null, null, this);
            case 4:
                A01(obj, this);
                return ODRAssetManager.A00(null, (ODRAssetManager) this.A06, null, this, null, null);
            case 5:
                A01(obj, this);
                return ((IgODRAssetDownloader) this.A06).A00(null, null, null, this, null);
            case 6:
                A01(obj, this);
                return GoogleAuthController.A02(null, null, (GoogleAuthController) this.A06, this);
            case 7:
                A01(obj, this);
                return GoogleAuthController.A07((GoogleAuthController) this.A06, this);
            case 8:
                A01(obj, this);
                return GoogleAuthController.A03(null, null, null, (GoogleAuthController) this.A06, this);
            case 9:
                A01(obj, this);
                return GoogleAuthController.A04(null, null, null, (GoogleAuthController) this.A06, this);
            case 10:
                A01(obj, this);
                return ECPRepositoryImpl.A01((ECPRepositoryImpl) this.A06, null, null, null, null, null, null, null, this);
            case 11:
                A01(obj, this);
                return EffectsByIdMetadataService.A01((EffectsByIdMetadataService) this.A06, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return ((StoriesTemplateParticipationViewModel) this.A06).A00(null, null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ClipsDraftRepository.A04((ClipsDraftRepository) this.A06, null, null, this);
            case 14:
                A01(obj, this);
                return ((AbstractC46518KiH) this.A06).A00(null, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return DirectConfigureAnimatedMediaMessageMutationProcessor.A00((DirectConfigureAnimatedMediaMessageMutationProcessor) this.A06, null, this);
            case 16:
                A01(obj, this);
                return ArmadilloExpressNoteReplySender.A01(null, (ArmadilloExpressNoteReplySender) this.A06, null, this);
            case 17:
                A01(obj, this);
                return ((DirectConfigureAnimatedMediaMessageMutationFactory) this.A06).A00(null, null, null, this);
            case 18:
                A01(obj, this);
                return DirectConfigureMediaMessageMutationFactory.A01(null, (DirectConfigureMediaMessageMutationFactory) this.A06, null, null, this, false);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return FlashMediaCacheImpl.A02((FlashMediaCacheImpl) this.A06, null, null, this);
            case 20:
                A01(obj, this);
                return FlashMediaCacheImpl.A01((FlashMediaCacheImpl) this.A06, null, null, null, this);
            case 21:
                A01(obj, this);
                return ((FriendMapRepository) this.A06).A05(null, null, this);
            case 22:
                A01(obj, this);
                return ((SuggestionsDBHelper) this.A06).A01(null, null, null, this);
            case 23:
                A01(obj, this);
                return LeadFormQuestionsRepository.A02((LeadFormQuestionsRepository) this.A06, null, null, null, null, this);
            case 24:
                A01(obj, this);
                return ((IgContextualHashtagsProcessor) this.A06).A01(null, null, this, 0L);
            case 25:
                A01(obj, this);
                return OpalAudienceSelectorRepository.A01((OpalAudienceSelectorRepository) this.A06, this);
            case 26:
                A01(obj, this);
                return ((CoroutineWorker) this.A06).A03(this);
            case 27:
                A01(obj, this);
                return IGQuickPromotionFetcherHelper.A00(null, null, (IGQuickPromotionFetcherHelper) this.A06, null, null, this);
            case 28:
                A01(obj, this);
                return ((AbstractC55145Od4) this.A06).A07(null, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A01(obj, this);
                return ((AbstractC55145Od4) this.A06).A07(null, null, this);
            case 30:
                A01(obj, this);
                return SUPMediaStreamControllerDownloader.A00(null, null, (SUPMediaStreamControllerDownloader) this.A06, this);
            case 31:
                A01(obj, this);
                return UpcomingEventReminderRepository.A01(null, null, null, (UpcomingEventReminderRepository) this.A06, this);
            case 32:
                A01(obj, this);
                return ((IgLiveViewerJoinFlowRepository) this.A06).A01(null, null, null, this);
            case 33:
                A01(obj, this);
                return IGZeroHeadersStorage.A00((IGZeroHeadersStorage) this.A06, null, this);
            case 34:
                A01(obj, this);
                return ((IGZeroHeadersStorage) this.A06).A03(null, null, this, null);
            case 35:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A06).A02(null, null, null, this);
            case 36:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A06).A03(null, null, null, this);
            case 37:
                A01(obj, this);
                return ((WriteSuggestionsRepository) this.A06).A05(this);
            case 38:
                A01(obj, this);
                return WEc.A00(null, this, (WEc) this.A06);
            case 39:
                A01(obj, this);
                return C55204OeF.A00(null, this, null, (C55204OeF) this.A06, null);
            case 40:
                A01(obj, this);
                return C55204OeF.A01(null, this, null, (C55204OeF) this.A06, null);
            default:
                A01(obj, this);
                return C55204OeF.A03(null, this, (C55204OeF) this.A06);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAP(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = i;
    }

    public static void A00(Object obj, Object obj2, Object obj3, MAP map, int i) {
        map.A02 = obj;
        map.A03 = obj2;
        map.A04 = obj3;
        map.A00 = i;
    }

    public static void A01(Object obj, MAP map) {
        map.A05 = obj;
        map.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof MAP) && ((MAP) obj).A07 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAP(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A07 = i;
        this.A06 = obj;
    }
}
