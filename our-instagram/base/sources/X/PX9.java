package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.genai.imageservice.service.GenAIImageService;
import com.instagram.genai.imageservice.service.GenAIImagineService;
import com.instagram.genai.imageservice.upload.GenAIImageUploadService;
import com.instagram.hallpass.util.HallPassApiUtil;
import com.instagram.igtv.live.model.IGTVLiveChannelNetworkDataSource;
import com.instagram.igtv.live.model.IGTVLiveChannelRepository;
import com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.repository.user.UserNetworkDataSource;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.leadads.repository.LeadFormRepository;
import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes9.dex */
public final class PX9 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX9(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static Object A00(Object obj, PX9 px9) {
        px9.A02 = obj;
        px9.A00 |= Integer.MIN_VALUE;
        return px9.A01;
    }

    public static PX9 A01(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new PX9(obj, interfaceC23621Ds, i, 42);
    }

    public static void A02(Object obj, PX9 px9) {
        px9.A01 = obj;
        px9.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof PX9) && ((PX9) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A02(obj, this);
                return GenAIImageService.A03((GenAIImageService) this.A02, null, null, this);
            case 1:
                A02(obj, this);
                return ((GenAIImagineService) this.A02).A02(null, this);
            case 2:
                A02(obj, this);
                return ((GenAIImageUploadService) this.A02).A01(null, null, this);
            case 3:
                A02(obj, this);
                return GenAIImageUploadService.A00((GenAIImageUploadService) this.A02, null, this, 0);
            case 4:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A02(null, null, null, null, this);
            case 5:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A01(null, null, null, null, this);
            case 6:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A03(null, null, this);
            case 7:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A04(null, null, this);
            case 8:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A07(null, this);
            case 9:
                A02(obj, this);
                return ((HallPassApiUtil) this.A02).A05(null, null, this);
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 35:
            case 36:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
                return ((MY6) A00(obj, this)).emit(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A02(obj, this);
                return ((IGTVLiveChannelNetworkDataSource) this.A02).A00(null, null, null, this);
            case 14:
                A02(obj, this);
                return ((IGTVLiveChannelRepository) this.A02).A00(null, null, null, this);
            case Process.SIGTERM /* 15 */:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A02(null, null, null, this);
            case 16:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A04(null, this);
            case 17:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A05(null, this);
            case 18:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A00(null, null, null, null, null, this);
            case Process.SIGSTOP /* 19 */:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A01(null, null, null, this);
            case 20:
                A02(obj, this);
                return ((IGTVSeriesNetworkDataSource) this.A02).A03(null, null, null, this);
            case 21:
                A02(obj, this);
                return ((IGTVSeriesRepository) this.A02).A00(null, null, null, null, null, this);
            case 22:
                A02(obj, this);
                return ((IGTVSeriesRepository) this.A02).A01(null, null, null, this);
            case 23:
                A02(obj, this);
                return UserNetworkDataSource.A00((UserNetworkDataSource) this.A02, null, null, null, null, this);
            case 24:
                return ((JRY) A00(obj, this)).emit(null, this);
            case 25:
            case 30:
            case 44:
                return ((MV6) A00(obj, this)).emit(null, this);
            case 26:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A02(null, this);
            case 27:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A03(this, false, false);
            case 28:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A00(null, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return ((IncentivePlatformApi) this.A02).A01(null, null, this);
            case 31:
            case 37:
            case 38:
                return ((J6P) A00(obj, this)).emit(null, this);
            case 32:
                A02(obj, this);
                return ((MV6) this.A02).A02(null, this);
            case 33:
                A02(obj, this);
                return ((LeadFormRepository) this.A02).A01(null, null, null, this);
            case 34:
                A02(obj, this);
                return ((LeadFormRepository) this.A02).A00(null, null, null, null, null, null, this);
            case 39:
                return ((JRB) A00(obj, this)).emit(null, this);
            case 40:
                A02(obj, this);
                return ((SubspanMutableStateFlow) this.A02).collect(null, this);
            case Seq.NULL_REFNUM /* 41 */:
                A02(obj, this);
                return ((FeedCacheRoom) this.A02).A05(null, this);
            case 45:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A02(null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A07(this);
            case 47:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A06(null, this);
            case 48:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A03(null, this);
            default:
                A02(obj, this);
                return ((MonetizationApi) this.A02).A04(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX9(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
