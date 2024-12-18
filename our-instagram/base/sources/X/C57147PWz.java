package X;

import androidx.paging.PagingSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.repository.WallPostComposerRepository;
import com.instagram.wonderwall.repository.WallPostRepository;
import com.instagram.xme.threed.repository.Xme3dMediaRepository;
import com.instagram.zero.cma.CampaignAPITokenFetcher;
import com.instagram.zero.headers.IGZeroHeadersPing;
import com.meta.analytics.gnv.vista.core.VistaViewPoint;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.vault.service.base.DefaultVaultService;

/* renamed from: X.PWz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57147PWz extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        A01(obj, this);
        switch (i) {
            case 0:
                return ((IgLiveCommentsRepository) this.A05).A0D(null, null, this, 0L);
            case 1:
                return ((IgLiveCommentsRepository) this.A05).A0E(null, null, this, 0L);
            case 2:
                return IgLiveCommentsRepository.A01(null, (IgLiveCommentsRepository) this.A05, this);
            case 3:
                return ((IgLiveExploreRepository) this.A05).A02(this);
            case 4:
                return ((IgLiveJoinRequestsRepository) this.A05).A01(null, this);
            case 5:
                return ((IgLiveJoinRequestsRepository) this.A05).A02(null, this);
            case 6:
                return IgLiveLikesRepository.A00(null, (IgLiveLikesRepository) this.A05, this);
            case 7:
                return ((IgLiveLikesRepository) this.A05).A01(null, this);
            case 8:
                return ((IgLiveModerationRepository) this.A05).A01(null, null, this);
            case 9:
                return ((DiversityInfoRepository) this.A05).A04(null, this);
            case 10:
                return DiversityInfoRepository.A01((DiversityInfoRepository) this.A05, null, this);
            case 11:
                return ((DiversityInfoRepository) this.A05).A05(null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((WallApiGraphQLImpl) this.A05).A04(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((WallApiGraphQLImpl) this.A05).A05(null, this);
            case 14:
                return ((WallPostComposerRepository) this.A05).A00(null, this);
            case Process.SIGTERM /* 15 */:
                return ((WallPostRepository) this.A05).A02(null, this);
            case 16:
                return Xme3dMediaRepository.A00(null, null, (Xme3dMediaRepository) this.A05, null, this);
            case 17:
                return CampaignAPITokenFetcher.A01((CampaignAPITokenFetcher) this.A05, this);
            case 18:
                return ((IGZeroHeadersPing) this.A05).A00(this, null, false);
            case Process.SIGSTOP /* 19 */:
                return VistaViewPoint.A00((VistaViewPoint) this.A05, this);
            case 20:
                return ((BTR) this.A05).A00(null, this);
            case 21:
                return ImagineNetworkService.A02(null, (ImagineNetworkService) this.A05, null, this);
            case 22:
                return ImagineNetworkService.A04(null, (ImagineNetworkService) this.A05, null, this, 0);
            case 23:
                return ((DefaultVaultService) this.A05).A00(null, this);
            case 24:
                return ((PagingSource) this.A05).A04(null, this);
            case 25:
                return ((J6P) this.A05).A00(null, this);
            case 26:
                return ((J6Q) this.A05).emit(null, this);
            case 27:
                return C55209OeS.A01((C55209OeS) this.A05, null, null, this);
            case 28:
                return C29561D0n.A00(null, null, (C29561D0n) this.A05, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return C41738IeA.A00(null, (C41738IeA) this.A05, null, null, this);
            case 30:
                return C51062MhI.A00((C51062MhI) this.A05, null, this, null);
            case 31:
                return ((C55171Oda) this.A05).A04(null, null, this);
            case 32:
                return C55204OeF.A02(null, this, (C55204OeF) this.A05);
            default:
                return ((C55204OeF) this.A05).A06(null, this, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57147PWz(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    public static void A00(Object obj, Object obj2, C57147PWz c57147PWz, int i) {
        c57147PWz.A01 = obj;
        c57147PWz.A02 = obj2;
        c57147PWz.A00 = i;
    }

    public static void A01(Object obj, C57147PWz c57147PWz) {
        c57147PWz.A03 = obj;
        c57147PWz.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C57147PWz) && ((C57147PWz) obj).A04 == i) {
            return true;
        }
        return false;
    }
}
