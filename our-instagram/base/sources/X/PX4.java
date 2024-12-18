package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveNotificationApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveWaveApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.wellbeing.upsells.fragment.directmessage.DirectMessageSettingsRepository;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.api.WallUserApi;
import go.Seq;

/* loaded from: classes9.dex */
public final class PX4 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX4(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static PX4 A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new PX4(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, PX4 px4) {
        px4.A01 = obj;
        px4.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof PX4) && ((PX4) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((IgLiveNotificationApi) this.A02).A00(this, false);
            case 1:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A02(null, this, 0L);
            case 2:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A03(null, this, 0L);
            case 3:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A01(null, this);
            case 4:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A04(null, this, 0L);
            case 5:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A05(null, this, 0L);
            case 6:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A00(null, null, this);
            case 7:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A07(null, this, false);
            case 8:
                A01(obj, this);
                return ((IgLiveQuestionsApi) this.A02).A06(null, this, 0L);
            case 9:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A01(null, null, null, this);
            case 10:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A02(null, this);
            case 11:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A00(null, null, null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return ((IgLiveSchedulingApi) this.A02).A03(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((IgLiveWaveApi) this.A02).A00(null, null, this);
            case 14:
            case 24:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((MY6) this.A01).emit(null, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsRepository) this.A02).A00(null, null, this);
            case 16:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsRepository) this.A02).A01(null, this, false);
            case 17:
                A01(obj, this);
                return ((IgLiveBroadcastSettingsRepository) this.A02).A02(null, this, false);
            case 18:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A05(null, this);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A00(null, this);
            case 20:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A04(null, null, this);
            case 21:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A01(null, this);
            case 22:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A02).A03(null, this, false, false);
            case 23:
                A01(obj, this);
                return ((IgLiveCommentsRepository) this.A02).A0F(null, null, this);
            case 25:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((MWC) this.A01).emit(null, this);
            case 26:
                A01(obj, this);
                return ((IgLiveModerationRepository) this.A02).A02(null, null, this);
            case 27:
                A01(obj, this);
                return ((IgLiveModerationRepository) this.A02).A03(null, this);
            case 28:
                A01(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A02(null, this, 0L);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A01(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A04(null, this, 0L);
            case 30:
                A01(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A00(null, null, this);
            case 31:
                A01(obj, this);
                return ((IgLiveQuestionsRepository) this.A02).A06(null, this, 0L);
            case 32:
                A01(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A01(null, null, null, this);
            case 33:
                A01(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A02(null, this);
            case 34:
                A01(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A00(null, null, null, null, this);
            case 35:
                A01(obj, this);
                return ((IgLiveSchedulingRepository) this.A02).A03(this);
            case 36:
                A01(obj, this);
                return ((IgLiveShareRepository) this.A02).A00(null, null, this);
            case 38:
            case 39:
            case 40:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((C50536MSp) this.A01).emit(null, this);
            case 43:
                A01(obj, this);
                return DirectMessageSettingsRepository.A00((DirectMessageSettingsRepository) this.A02, this);
            case 47:
                A01(obj, this);
                return ((WallApiGraphQLImpl) this.A02).A03(null, this);
            case 48:
                A01(obj, this);
                return ((WallApiGraphQLImpl) this.A02).A01(null, null, this);
            default:
                A01(obj, this);
                return ((WallUserApi) this.A02).A00(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX4(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
