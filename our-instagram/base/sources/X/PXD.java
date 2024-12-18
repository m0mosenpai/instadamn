package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapCaptureViewModel$special$$inlined$filter$1$2;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;
import com.instagram.reels.groupmention.api.GroupMentionStickerNetworkHelper;
import com.instagram.reels.internal.data.InternalStickerViewerRepository;
import com.instagram.reels.party.data.StoryPartyRepository;
import com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource;
import com.instagram.release.buildinfo.BuildInfoApi;
import com.instagram.release.lockout.DogfoodingEligibilityApi;
import com.instagram.remindme.common.data.MediaReminderApi;
import com.instagram.repository.common.IgBaseRepository;
import com.instagram.repository.user.UserNetworkDataSource;
import com.instagram.request.InviteContactApi;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import go.Seq;

/* loaded from: classes9.dex */
public final class PXD extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case 4:
            case 28:
                A01(obj, this);
                return ((MV6) this.A01).emit(null, this);
            case 1:
                A02(obj, this);
                return ((IGDevToolPersistentStateHandler) this.A02).CEN(null, null, this);
            case 2:
                A01(obj, this);
                return QuickSnapArchiveViewModel.A00(null, this);
            case 3:
                A01(obj, this);
                return ((QuickSnapCaptureViewModel$special$$inlined$filter$1$2) this.A01).emit(null, this);
            case 5:
                A02(obj, this);
                return ((QuickSnapApi) this.A02).A01(null, this);
            case 6:
                A02(obj, this);
                return ((QuickSnapApi) this.A02).A03(null, this);
            case 7:
                A02(obj, this);
                return ((QuickSnapApi) this.A02).A00(null, null, this);
            case 8:
                A02(obj, this);
                return ((QuickSnapRepository) this.A02).A02(null, this);
            case 9:
                A02(obj, this);
                return ((QuickSnapMediaSaver) this.A02).A01(null, this, 0);
            case 10:
                A02(obj, this);
                return ((StoryCommentsDashboardRepository) this.A02).A00(null, null, this);
            case 11:
                A02(obj, this);
                return ((StoryCommentsDashboardRepository) this.A02).A01(null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A02(obj, this);
                return ((GroupMentionStickerNetworkHelper) this.A02).A00(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A02(obj, this);
                return ((InternalStickerViewerRepository) this.A02).A00(this);
            case 14:
                A02(obj, this);
                return ((StoryPartyRepository) this.A02).A00(null, this);
            case Process.SIGTERM /* 15 */:
                A02(obj, this);
                return ((PromptStickerViewerRepository) this.A02).A02(null, null, null, null, this);
            case 16:
                A02(obj, this);
                return ((PromptStickerViewerRepository) this.A02).A00(null, null, this);
            case 17:
                A02(obj, this);
                return ((PromptStickerViewerRepository) this.A02).A01(null, null, this);
            case 18:
                A02(obj, this);
                return StoryTemplateDiscoverySurfaceSectionMediaPagingSource.A00(null, (StoryTemplateDiscoverySurfaceSectionMediaPagingSource) this.A02, null, this, 0);
            case Process.SIGSTOP /* 19 */:
                A02(obj, this);
                return StoryTemplateDiscoverySurfaceSectionPagingSource.A00((StoryTemplateDiscoverySurfaceSectionPagingSource) this.A02, this);
            case 20:
                A02(obj, this);
                return ((BuildInfoApi) this.A02).A00(this);
            case 21:
                A02(obj, this);
                return ((DogfoodingEligibilityApi) this.A02).A01(this);
            case 22:
                A02(obj, this);
                return MediaReminderApi.A00((MediaReminderApi) this.A02, null, null, this);
            case 23:
                A02(obj, this);
                return MediaReminderApi.A01((MediaReminderApi) this.A02, null, null, this);
            case 24:
                A02(obj, this);
                return ((IgBaseRepository) this.A02).A03(null, null, this);
            case 25:
                A01(obj, this);
                return IgBaseRepository.A02((IgBaseRepository) this.A01, this);
            case 26:
                A01(obj, this);
                return ((C57113PVc) this.A01).emit(null, this);
            case 27:
                A01(obj, this);
                return IgBaseRepository.A01((IgBaseRepository) this.A01, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return ((UserNetworkDataSource) this.A02).A01(null, null, null, null, this, 0, false);
            case 30:
            case 31:
            case 34:
            case 36:
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
            case 45:
                A01(obj, this);
                return ((MY6) this.A01).emit(null, this);
            case 32:
                A02(obj, this);
                return ((InviteContactApi) this.A02).A00(this, false);
            case 33:
                A02(obj, this);
                return RtcCallSurveyLogger.A00((RtcCallSurveyLogger) this.A02, null, this);
            case 35:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            default:
                A01(obj, this);
                return ((MWC) this.A01).emit(null, this);
            case 37:
                A02(obj, this);
                return ((MWC) this.A02).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXD(IgBaseRepository igBaseRepository, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        if (24 - i != 0) {
            this.A01 = igBaseRepository;
        } else {
            this.A02 = igBaseRepository;
        }
    }

    public static PXD A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new PXD(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, PXD pxd) {
        pxd.A02 = obj;
        pxd.A00 |= Integer.MIN_VALUE;
    }

    public static void A02(Object obj, PXD pxd) {
        pxd.A01 = obj;
        pxd.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof PXD) && ((PXD) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXD(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXD(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXD(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = 2;
    }
}
