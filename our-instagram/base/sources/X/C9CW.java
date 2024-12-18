package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.avatars.graphql.UserAvatarInfoGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.viewmodel.CameraToolMenuViewModel$visibility$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.config.PreCaptureEffectTrayConfig$enteredEffectTrayState$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filter$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$doWhenInCapture$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$effectSelectionChanges$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$effectSelectionChanges$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$maybePrefetchMiniGallery$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$trayConfigurationChanged$$inlined$map$3$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$getEffectTrayResponse$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$initialize$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$initialize$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$initialize$$inlined$map$3$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.viewmodels.EffectSliderViewModel$isEffectTrayState$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.faceeffectui.viewmodels.EffectSliderViewModel$progress$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.CreationGalleryController$special$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryGridDraftController$init$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$filterNot$1$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsVideoStore$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsStickerOverlayViewModel$special$$inlined$map$1$2;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.9CW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CW extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((SnapFlingBehavior) this.A02).E4A(null, this, null, 0.0f);
            case 1:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return SnapFlingBehavior.A01(null, (SnapFlingBehavior) this.A02, this, null, 0.0f, 0.0f);
            case 2:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((NestedScrollDispatcher) this.A02).A02(this, 0L, 0L);
            case 3:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((NestedScrollDispatcher) this.A02).A01(this, 0L);
            case 4:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AndroidComposeView) this.A02).Eq2(this, null);
            case 5:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AndroidPlatformTextInputSession) this.A02).EnS(null, this);
            case 6:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((CoroutineLiveData) this.A01).A0F(this);
            case 7:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return MiniGalleryCategoriesService.A00((MiniGalleryCategoriesService) this.A02, null, this);
            case 8:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RoomEffectCollectionRepository) this.A02).A03(null, this, false);
            case 9:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RoomEffectCollectionRepository) this.A02).A04(null, this);
            case 10:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RoomEffectCollectionRepository) this.A02).A01(null, null, this, 0L);
            case 11:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((UserAvatarInfoGraphQLRepository) this.A02).A00(null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((AvatarStore) this.A02).A01(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return BanyanCoordinator.A01((BanyanCoordinator) this.A02, null, this);
            case 14:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return EffectTrayService.A00(null, (EffectTrayService) this.A02, null, null, null, this);
            case Process.SIGTERM /* 15 */:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return EffectTrayService.A03((EffectTrayService) this.A02, null, null, null, this);
            case 16:
                this.A01 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DraftDirectoryDiskCleanupJob.A00((DraftDirectoryDiskCleanupJob) this.A02, this);
            case 17:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((CameraToolMenuViewModel$visibility$$inlined$map$1$2) this.A01).emit(null, this);
            case 18:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((PreCaptureEffectTrayConfig$enteredEffectTrayState$$inlined$filter$1$2) this.A01).emit(null, this);
            case Process.SIGSTOP /* 19 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filter$1$2) this.A01).emit(null, this);
            case 20:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filter$2$2) this.A01).emit(null, this);
            case 21:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case 22:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$categorySelectionChanged$$inlined$filterNot$2$2) this.A01).emit(null, this);
            case 23:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$doWhenInCapture$$inlined$filter$1$2) this.A01).emit(null, this);
            case 24:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$effectSelectionChanges$$inlined$filter$1$2) this.A01).emit(null, this);
            case 25:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$effectSelectionChanges$$inlined$map$1$2) this.A01).emit(null, this);
            case 26:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$getTray$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case 27:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$maybePrefetchMiniGallery$$inlined$filter$1$2) this.A01).emit(null, this);
            case 28:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$filter$1$2) this.A01).emit(null, this);
            case 30:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case 31:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$map$1$2) this.A01).emit(null, this);
            case 32:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$map$2$2) this.A01).emit(null, this);
            case 33:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectTrayViewModel$trayConfigurationChanged$$inlined$map$3$2) this.A01).emit(null, this);
            case 34:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((PostCaptureEffectTrayViewModel$getEffectTrayResponse$$inlined$filter$1$2) this.A01).emit(null, this);
            case 35:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((PostCaptureEffectTrayViewModel$initialize$$inlined$map$1$2) this.A01).emit(null, this);
            case 36:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((PostCaptureEffectTrayViewModel$initialize$$inlined$map$2$2) this.A01).emit(null, this);
            case 37:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((PostCaptureEffectTrayViewModel$initialize$$inlined$map$3$2) this.A01).emit(null, this);
            case 38:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((PostCaptureEffectTrayViewModel$selectedEffect$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case 39:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectSliderViewModel$isEffectTrayState$$inlined$map$1$2) this.A01).emit(null, this);
            case 40:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((EffectSliderViewModel$progress$$inlined$filter$1$2) this.A01).emit(null, this);
            case Seq.NULL_REFNUM /* 41 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((CreationGalleryController$special$$inlined$filter$1$2) this.A01).emit(null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((GalleryGridDraftController$init$$inlined$filter$1$2) this.A01).emit(null, this);
            case 43:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((StoriesTemplateViewModel$special$$inlined$map$1$2) this.A01).emit(null, this);
            case 44:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsAudioStore$special$$inlined$filterNot$1$2) this.A01).emit(null, this);
            case 45:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsAudioStore$special$$inlined$map$2$2) this.A01).emit(null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsVideoStore$special$$inlined$map$1$2) this.A01).emit(null, this);
            case 47:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsCreationViewModel$special$$inlined$map$1$2) this.A01).emit(null, this);
            case 48:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsCreationViewModel$special$$inlined$map$2$2) this.A01).emit(null, this);
            default:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsStickerOverlayViewModel$special$$inlined$map$1$2) this.A01).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CW(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CW) && ((C9CW) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CW(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }
}
