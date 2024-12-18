package X;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import androidx.work.CoroutineWorker;
import com.facebook.analytics.dsp.point.IgPointContextProvider;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.ar.core.effectcollection.EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.status.AvatarStatusRepository;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.api.result.ResultFlowKt$mapError$$inlined$map$1$2;
import com.instagram.common.api.result.ResultFlowKt$mapSuccess$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource;
import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.criticalpath.AppStartQueue$1$2;
import com.instagram.direct.inbox.birthdays.BirthdayPogsApi;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.mainactivity.camerabutton.CameraButtonDestinationUtil$Companion;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.notifications.badging.impl.BadgingApiImpl;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.comments.repository.StoryCommentsRepository;
import com.instagram.share.facebook.api.ReelsXARApiUtil;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import go.Seq;

/* renamed from: X.9CY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CY extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return DragGestureNode.A02((DragGestureNode) this.A04, this);
            case 1:
                return ((ScrollingLogic) this.A04).A04(this, 0L);
            case 2:
                return SnapFlingBehavior.A00(null, (SnapFlingBehavior) this.A04, this, null, 0.0f);
            case 3:
                return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) this.A04).FEC(this, null, 0L);
            case 4:
                return ((IgPointContextProvider) this.A04).A01(this, 0.0f, 0.0f);
            case 5:
                return QPSdkOnDemandSurfaceController.A00((QPSdkOnDemandSurfaceController) this.A04, null, null, null, null, null, this);
            case 6:
                return ((EffectCollectionService) this.A04).A0E(null, this);
            case 7:
                return ((EffectCollectionService) this.A04).A08(this);
            case 8:
                return EffectCollectionService.A01((EffectCollectionService) this.A04, null, this);
            case 9:
                return ((EffectCollectionService$getPaginatedCollectionFromServer$$inlined$map$1$2) this.A04).emit(null, this);
            case 10:
                return ((RoomEffectCollectionRepository) this.A04).A02(null, null, this, 0L);
            case 11:
                return ((AvatarPrivacySettingsRepository) this.A04).A01(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((AvatarStatusRepository) this.A04).A00(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return BanyanCoordinator.A02((BanyanCoordinator) this.A04, this);
            case 14:
                return ((EffectTrayService) this.A04).A05(null, this);
            case Process.SIGTERM /* 15 */:
                return ((ResultFlowKt$mapError$$inlined$map$1$2) this.A04).emit(null, this);
            case 16:
                return ((ResultFlowKt$mapSuccess$$inlined$map$1$2) this.A04).emit(null, this);
            case 17:
                return ((InspirationHubNetworkDataSource) this.A04).A00(null, this);
            case 18:
                return ((StoryDraftsStore) this.A04).A04(this);
            case Process.SIGSTOP /* 19 */:
                return ((ClipsDraftRepository) this.A04).A0E(null, this);
            case 20:
                return ((ClipsDraftRepository) this.A04).A0J(null, this);
            case 21:
                return ClipsDraftRepository.A06((ClipsDraftRepository) this.A04, this);
            case 22:
                return ((C2PV) this.A04).A0B(null, this);
            case 23:
                return ((C2PV) this.A04).A0M(this);
            case 24:
                return ((C2PV) this.A04).A0D(null, this);
            case 25:
                return ((C2PV) this.A04).A02(null, this);
            case 26:
                return ((C2PV) this.A04).A03(null, this);
            case 27:
                return ((C2PV) this.A04).A05(null, this);
            case 28:
                return ((C2PV) this.A04).A06(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((C2PV) this.A04).A0H(null, this);
            case 30:
                return ((ClipsDraftLocalDataSource) this.A04).A09(null, this);
            case 31:
                return ((AppStartQueue$1$2) this.A04).emit(null, this);
            case 32:
                return ((BirthdayPogsApi) this.A04).A01(this);
            case 33:
                return ContentFilterDictionaryRegistrar.A00((ContentFilterDictionaryRegistrar) this.A04, null, this);
            case 34:
                return ((ContentFilterDictionaryListLoader) this.A04).A00(null, null, null, this);
            case 35:
                return ((ContentFilterDictionaryPatternsLoader) this.A04).A00(null, null, null, this, 0);
            case 36:
                return ((ContentFilterDictionarySyncManager) this.A04).A01(null, null, null, this);
            case 37:
                return ((FriendMapGraphQLImpl) this.A04).A09(this);
            case 38:
                return ((CameraButtonDestinationUtil$Companion) this.A04).A01(null, this);
            case 39:
                return ((MonetizationRepository) this.A04).A00(null, this);
            case 40:
                return ((ActivityFeedRepository) this.A04).A02(null, null, this, false);
            case Seq.NULL_REFNUM /* 41 */:
                return ((BadgingApiImpl) this.A04).A00(this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return IGSlotFetcher.A00((IGSlotFetcher) this.A04, null, this, false);
            case 43:
                return ((QuickSnapApi) this.A04).A06(this);
            case 44:
                return ((QuickSnapRepository) this.A04).A04(this, false);
            case 45:
                return ((StoryCommentsRepository) this.A04).A00(null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((CoroutineWorker) this.A04).A03(this);
            case 47:
                return ((ReelsXARApiUtil) this.A04).A00(null, this, null);
            case 48:
                return ((CXPNoticeStateRepository) this.A04).A01(null, this);
            default:
                return ((CXPNoticeStateRepository) this.A04).A02(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CY(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CY) && ((C9CY) obj).A03 == i) {
            return true;
        }
        return false;
    }
}
