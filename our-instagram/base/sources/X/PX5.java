package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository$fetchProductEligibility$$inlined$map$1$2;
import com.instagram.music.profile.editprofile.viewmodel.EditMusicOnProfileViewModel$special$$inlined$map$1$2;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource;
import com.instagram.nido.impl.explore.api.NidoRequests;
import com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1;
import com.instagram.nux.aymh.loginhandlers.CredentialsLoginHandler;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.ndx.api.NDXIGStepsAPI;
import com.instagram.nux.ndx.util.NdxStepsFetcher;
import com.instagram.payout.api.PayoutApi;
import com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper;
import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getBoolean$$inlined$map$1$2;
import com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2;
import com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getLong$$inlined$map$1$2;
import com.instagram.preferences.common.datastore.IgDatastoreEditor;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes9.dex */
public final class PX5 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX5(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static void A00(Object obj, PX5 px5) {
        px5.A01 = obj;
        px5.A00 |= Integer.MIN_VALUE;
    }

    public static void A01(Object obj, PX5 px5) {
        px5.A02 = obj;
        px5.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof PX5) && ((PX5) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A00(obj, this);
                return ((MonetizationApi) this.A02).A05(null, this);
            case 1:
                A00(obj, this);
                return ((OnboardingRepository) this.A02).A01(null, this);
            case 2:
                A00(obj, this);
                return ((OnboardingRepository) this.A02).A03(null, this);
            case 3:
                A00(obj, this);
                return ((OnboardingRepository) this.A02).A04(null, this);
            case 4:
                A00(obj, this);
                return ((OnboardingRepository) this.A02).A05(null, this);
            case 5:
                A01(obj, this);
                return ((MonetizationRepository$fetchProductEligibility$$inlined$map$1$2) this.A01).emit(null, this);
            case 6:
                A01(obj, this);
                return ((EditMusicOnProfileViewModel$special$$inlined$map$1$2) this.A01).emit(null, this);
            case 7:
                A00(obj, this);
                return ((MusicOnProfileRepository) this.A02).A01(this);
            case 8:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 27:
            case 28:
            case 31:
            case 32:
            case 37:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 45:
            case 48:
                A01(obj, this);
                return ((C31185DnU) this.A01).emit(null, this);
            case 9:
                A01(obj, this);
                return ((MY6) this.A01).emit(null, this);
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return ((MV6) this.A01).emit(null, this);
            case 11:
                A00(obj, this);
                return ((SpamFollowRequestsNetworkDataSource) this.A02).AOb(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
            case 18:
            case 22:
            case 36:
            case 43:
                A01(obj, this);
                return ((C31202Dnl) this.A01).emit(null, this);
            case 14:
                A00(obj, this);
                return ((NidoRequests) this.A02).A01(null, this);
            case Process.SIGTERM /* 15 */:
                A00(obj, this);
                return ((NidoRequests) this.A02).A00(null, null, this);
            case 16:
                A00(obj, this);
                return ((ContextualPromoHelper$Companion$getDefaultImageFetcher$1) this.A02).A00(null, this);
            case 21:
                A00(obj, this);
                return ((CredentialsLoginHandler) this.A02).A00(null, null, null, null, this);
            case 23:
                A00(obj, this);
                return AymhViewModel.A00(null, (AymhViewModel) this.A02, null, this);
            case 24:
                A00(obj, this);
                return ((NDXIGStepsAPI) this.A02).A00(null, null, this, 0);
            case 25:
                A00(obj, this);
                return ((NdxStepsFetcher) this.A02).A00(0, this);
            case 26:
                A01(obj, this);
                return ((C31319Dpf) this.A01).emit(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A00(obj, this);
                return ((PayoutApi) this.A02).A00(null, this);
            case 30:
                A00(obj, this);
                return ((ConfigureAsyncHelper) this.A02).A01(null, null, this);
            case 33:
                A01(obj, this);
                return ((AsyncKeyValueStoreWrapper$getBoolean$$inlined$map$1$2) this.A01).emit(null, this);
            case 34:
            case 47:
                A01(obj, this);
                return ((PVP) this.A01).emit(null, this);
            case 35:
            case Seq.NULL_REFNUM /* 41 */:
                A01(obj, this);
                return ((M9Z) this.A01).emit(null, this);
            case 38:
                A01(obj, this);
                return ((NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2) this.A01).emit(null, this);
            case 39:
                A01(obj, this);
                return ((C37007GRz) this.A01).emit(null, this);
            case 40:
                A01(obj, this);
                return ((NuxDisabledAsyncKeyValueStore$getLong$$inlined$map$1$2) this.A01).emit(null, this);
            case 44:
                A01(obj, this);
                return ((PVX) this.A01).emit(null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A01(obj, this);
                return ((C43598JQe) this.A01).emit(null, this);
            default:
                A00(obj, this);
                return ((IgDatastoreEditor) this.A02).ABt(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX5(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
