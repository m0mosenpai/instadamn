package X;

import androidx.paging.PagingSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.mediakit.api.MediaKitApi;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.mediakit.repository.upload.MediaKitUploadApi;
import com.instagram.moments.data.StandaloneMomentsDataSource;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;
import com.instagram.newsfeed.data.ActivityPagedData;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import com.instagram.nme.contextualpromo.ContextualPromoApi;
import com.instagram.nux.ndx.util.NdxStepsFilterer;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.opal.impl.data.OpalEditRepository;
import com.instagram.opal.impl.data.OpalRepoUtil;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import com.instagram.pendingmedia.service.impl.PendingMediaWorker;
import com.instagram.pendingmedia.service.impl.ShareAudioHelper;
import com.instagram.pendingmedia.service.impl.SharePhotoHelper;
import com.instagram.pendingmedia.service.impl.ShareTextPostHelper;
import com.instagram.pendingmedia.service.upload.ArmadilloUploadCoverImageStep;
import com.instagram.pendingmedia.service.upload.FbUploaderUtil;
import com.instagram.pendingmedia.service.upload.UploadAudioStep;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.release.buildinfo.BuildInfoStore;
import com.instagram.release.lockout.DogfoodingEligibilityApi;
import com.instagram.schools.channels.data.SchoolChannelsDataSource;
import com.instagram.schools.management.data.SchoolSettingsDataSource;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import com.instagram.schools.tab.data.SchoolTabDataSource;
import go.Seq;

/* renamed from: X.PWx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57145PWx extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57145PWx(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    public static C57145PWx A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new C57145PWx(obj, interfaceC23621Ds, i);
    }

    public static void A01(Object obj, C57145PWx c57145PWx) {
        c57145PWx.A02 = obj;
        c57145PWx.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C57145PWx) && ((C57145PWx) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        A01(obj, this);
        switch (i) {
            case 0:
                return ((MediaKitApi) this.A04).A08(this);
            case 1:
                return ((MediaKitApi) this.A04).A07(null, null, this);
            case 2:
                return ((MediaKitRepository) this.A04).A09(this);
            case 3:
                return ((MV6) this.A04).A01(null, this);
            case 4:
                return ((MediaKitRepository) this.A04).A06(null, this);
            case 5:
                return ((MediaKitUploadApi) this.A04).A02(null, null, this);
            case 6:
                return StandaloneMomentsDataSource.A00((StandaloneMomentsDataSource) this.A04, this);
            case 7:
                return ((MusicOnProfileProvider) this.A04).A02(this);
            case 8:
                return ((MusicOnProfileProvider) this.A04).A01(null, this);
            case 9:
                return ((MusicOnProfileRepository) this.A04).A00(null, this);
            case 10:
                return MusicSearchQueryViewModel.A00((MusicSearchQueryViewModel) this.A04, this);
            case 11:
                return MusicSearchQueryViewModel.A01((MusicSearchQueryViewModel) this.A04, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((FollowRequestsRepository) this.A04).A03(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((SpamFollowRequestsNetworkDataSource) this.A04).AV6(this, false);
            case 14:
                return NidoExploreViewModel.A00((NidoExploreViewModel) this.A04, this);
            case Process.SIGTERM /* 15 */:
                return ((ContextualPromoApi) this.A04).A01(null, null, null, this);
            case 16:
                return ((NdxStepsFilterer) this.A04).A01(this);
            case 17:
                return OpalAudienceSelectorRepository.A00((OpalAudienceSelectorRepository) this.A04, null, this);
            case 18:
                return OpalAudienceSelectorRepository.A02((OpalAudienceSelectorRepository) this.A04, this);
            case Process.SIGSTOP /* 19 */:
                return OpalAudienceSelectorRepository.A03((OpalAudienceSelectorRepository) this.A04, this);
            case 20:
                return OpalAudienceSelectorRepository.A04((OpalAudienceSelectorRepository) this.A04, this);
            case 21:
                return ((OpalEditRepository) this.A04).A04(this);
            case 22:
                return ((OpalEditRepository) this.A04).A03(null, this);
            case 23:
                return OpalRepoUtil.A00(null, null, (OpalRepoUtil) this.A04, null, this);
            case 24:
                return ((OpalRepository) this.A04).A05(null, this, false);
            case 25:
                return ConfigureMediaStep.A02(null, (ConfigureMediaStep) this.A04, this);
            case 26:
                return PendingMediaWorker.A02((PendingMediaWorker) this.A04, this, false);
            case 27:
                return ((ShareAudioHelper) this.A04).A00(null, this);
            case 28:
                return ((SharePhotoHelper) this.A04).A00(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((ShareTextPostHelper) this.A04).A00(null, this);
            case 30:
                return ((ArmadilloUploadCoverImageStep) this.A04).F8t(null, this);
            case 31:
                return ((FbUploaderUtil) this.A04).A04(null, null, null, null, null, null, this, 0);
            case 32:
                return ((UploadAudioStep) this.A04).F8t(null, this);
            case 33:
                return ProfileCardViewModel.A01((ProfileCardViewModel) this.A04, this);
            case 34:
                return ((QuickSnapApi) this.A04).A05(this);
            case 35:
                return ((QuickSnapApi) this.A04).A02(null, this);
            case 36:
                return ((QuickSnapApi) this.A04).A04(null, this);
            case 37:
                return ((QuickSnapArchiveRepository) this.A04).A00(this);
            case 38:
                return ((QuickSnapRepository) this.A04).A03(null, this);
            case 39:
                return QuickSnapMediaSaver.A00(null, (QuickSnapMediaSaver) this.A04, this, 0);
            case 40:
                return ((QuickSnapRecapVideoGenerator) this.A04).A00(null, this);
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((PagingSource) this.A04).A04(null, this);
            case 43:
                return ((BuildInfoStore) this.A04).A00(this);
            case 44:
                return ((DogfoodingEligibilityApi) this.A04).A00(this);
            case 45:
                return ActivityPagedData.A00((ActivityPagedData) this.A04, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return SchoolChannelsDataSource.A00(null, (SchoolChannelsDataSource) this.A04, null, this);
            case 47:
                return SchoolSettingsDataSource.A00((SchoolSettingsDataSource) this.A04, this);
            case 48:
                return ((SchoolSettingsRepository) this.A04).A03(this);
            default:
                return SchoolTabDataSource.A00((SchoolTabDataSource) this.A04, null, null, this, 0);
        }
    }
}
