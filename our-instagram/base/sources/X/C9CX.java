package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsStickerOverlayViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.viewmodel.CameraPreviewViewModel$yOffsetAndScale$$inlined$filter$1$2;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.creation.drafts.model.datasource.clips.ClipsImportDraftDataSource;
import com.instagram.criticalpath.AppStartQueue$1$1$invokeSuspend$$inlined$filterNot$1$2;
import com.instagram.criticalpath.AppStartQueue$1$1$invokeSuspend$$inlined$map$1$2;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.mainactivity.camerabutton.CameraButtonDestinationFetcher$Companion;
import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$$inlined$filter$1$2;
import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$filterCombine$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filter$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filter$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$3$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$4$2;
import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import com.instagram.statemachine.ktx.StateMachineExtKt$asFlow$$inlined$map$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesEnteredFlow$$inlined$filter$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesEnteredFlow$$inlined$map$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$filter$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$map$1$2;
import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$map$2$2;
import com.instagram.unifiedfeedback.disclosure.UnifiedFeedbackDisclosureApi;
import com.instagram.uxlogging.navigation.NavigationObserver$start$1$invokeSuspend$$inlined$filter$1$2;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveHeartbeatApi;
import com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi;
import com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl;
import go.Seq;

/* renamed from: X.9CX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CX extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CX(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CX) && ((C9CX) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsStickerOverlayViewModel$special$$inlined$map$2$2) this.A01).emit(null, this);
            case 1:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((CameraPreviewViewModel$yOffsetAndScale$$inlined$filter$1$2) this.A01).emit(null, this);
            case 2:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A09(null, this);
            case 3:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A0N(this, 0L);
            case 4:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A0C(null, this);
            case 5:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A0F(null, this);
            case 6:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A0G(null, this);
            case 7:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A08(null, null, this);
            case 8:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2PV) this.A02).A0I(null, this, 0);
            case 9:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsDraftLocalDataSource) this.A02).A0A(this);
            case 10:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsDraftLocalDataSource) this.A02).A04(null, this);
            case 11:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsImportDraftDataSource) this.A02).A02(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AppStartQueue$1$1$invokeSuspend$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AppStartQueue$1$1$invokeSuspend$$inlined$map$1$2) this.A01).emit(null, this);
            case 14:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ContentFilterDictionaryRegistrar) this.A02).A03(null, null, this);
            case Process.SIGTERM /* 15 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ContentFilterDictionarySyncManager.A00(null, (ContentFilterDictionarySyncManager) this.A02, this);
            case 16:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FanClubApi) this.A02).A0B(null, this);
            case 17:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FanClubApi) this.A02).A02(null, null, this);
            case 18:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FanClubApi) this.A02).A0Q(this);
            case Process.SIGSTOP /* 19 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FanClubApi) this.A02).A06(null, null, this);
            case 20:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FBPayIGGraphQLQueryExecutor) this.A02).A00(null, this);
            case 21:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((FriendMapGraphQLImpl) this.A02).A08(this);
            case 22:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((CameraButtonDestinationFetcher$Companion) this.A02).A00(null, this);
            case 23:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((InMemoryBadgingRepository$getBadges$$inlined$filter$1$2) this.A01).emit(null, this);
            case 24:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((InMemoryBadgingRepository$getBadges$$inlined$map$1$2) this.A01).emit(null, this);
            case 25:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$filterCombine$$inlined$map$1$2) this.A01).emit(null, this);
            case 26:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$filter$1$2) this.A01).emit(null, this);
            case 27:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$filter$2$2) this.A01).emit(null, this);
            case 28:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$filterCombine$1$2) this.A01).emit(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$filterCombine$2$2) this.A01).emit(null, this);
            case 30:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$map$1$2) this.A01).emit(null, this);
            case 31:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$map$2$2) this.A01).emit(null, this);
            case 32:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$map$3$2) this.A01).emit(null, this);
            case 33:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((BaseBadgeViewModel$special$$inlined$map$4$2) this.A01).emit(null, this);
            case 34:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2) this.A01).emit(null, this);
            case 35:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return StoryHighlightsTrayManager$Instance.A00((StoryHighlightsTrayManager$Instance) this.A02, this);
            case 36:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StateMachineExtKt$asFlow$$inlined$map$1$2) this.A01).emit(null, this);
            case 37:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StateMachineExtKt$asStatesEnteredFlow$$inlined$filter$1$2) this.A01).emit(null, this);
            case 38:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StateMachineExtKt$asStatesEnteredFlow$$inlined$map$1$2) this.A01).emit(null, this);
            case 39:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StateMachineExtKt$asStatesExitedFlow$$inlined$filter$1$2) this.A01).emit(null, this);
            case 40:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StateMachineExtKt$asStatesExitedFlow$$inlined$map$1$2) this.A01).emit(null, this);
            case Seq.NULL_REFNUM /* 41 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StateMachineExtKt$asStatesExitedFlow$$inlined$map$2$2) this.A01).emit(null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((UnifiedFeedbackDisclosureApi) this.A02).A00(this);
            case 43:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((NavigationObserver$start$1$invokeSuspend$$inlined$filter$1$2) this.A01).emit(null, this);
            case 44:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgLiveHeartbeatApi) this.A02).A00(null, null, this);
            case 45:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RespectfulNudgeApi) this.A02).A02(null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RespectfulNudgePluginImpl) this.A02).A02(null, null, null, this);
            case 47:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C49642Px) this.A02).A00(this, false);
            case 48:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C71W) this.A01).emit(null, this);
            default:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C2Q2) this.A02).A01(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CX(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }
}
