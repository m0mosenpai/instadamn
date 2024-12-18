package X;

import androidx.paging.PagingSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.channels.data.SchoolChannelsDataSource;
import com.instagram.schools.management.data.SchoolSettingsDataSource;
import com.instagram.schools.tab.data.SchoolTabDataSource;
import com.instagram.search.common.api.SerpApi;
import com.instagram.security.attestation.keystore.client.KeyAttestationClient;
import com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor;
import com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient;
import com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient;
import com.instagram.settings.common.birthday.repository.BirthdayCenterRepository;
import com.instagram.settings.language.ContentLanguageSettingsApi;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import com.instagram.settings2.core.data.SettingsNetworkInteractor;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler;
import com.instagram.share.facebook.api.ReelsXARApiUtil;
import com.instagram.sharetofriendsstory.v2.data.ShareToFriendsStoryRepository;
import com.instagram.sharetofriendsstory.v2.viewmodel.ShareToFriendsStoryEventProvider$special$$inlined$map$1$2;
import go.Seq;

/* loaded from: classes9.dex */
public final class PXC extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A01(obj, this);
                return ((PVT) this.A01).emit(null, this);
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return ((MWC) this.A01).emit(null, this);
            case 5:
                A02(obj, this);
                return ((PagingSource) this.A02).A04(null, this);
            case 6:
                A02(obj, this);
                return ((SchoolChannelsDataSource) this.A02).A01(null, null, this);
            case 7:
                A02(obj, this);
                return ((SchoolSettingsDataSource) this.A02).A01(this);
            case 8:
                A02(obj, this);
                return SchoolTabDataSource.A01((SchoolTabDataSource) this.A02, null, this, 0);
            case 9:
                A02(obj, this);
                return SchoolTabDataSource.A02((SchoolTabDataSource) this.A02, null, this, 0);
            case 10:
                A02(obj, this);
                return ((SerpApi) this.A02).A00(null, this);
            case 20:
                A02(obj, this);
                return KeyAttestationClient.A01(null, (KeyAttestationClient) this.A02, null, null, this);
            case 21:
                A02(obj, this);
                return KeyAttestationClient.A00(null, null, (KeyAttestationClient) this.A02, this);
            case 22:
                A02(obj, this);
                return ((IgGooglePlayIntegrityAttestor) this.A02).A00(null, null, this);
            case 23:
                A02(obj, this);
                return ((IgPlayIntegrityAttestationClient) this.A02).A00(null, null, null, this, null, 0, false);
            case 24:
                A02(obj, this);
                return PlayIntegrityAttestationClient.A01(null, (PlayIntegrityAttestationClient) this.A02, null, this);
            case 25:
                A02(obj, this);
                return PlayIntegrityAttestationClient.A00(null, null, (PlayIntegrityAttestationClient) this.A02, this);
            case 26:
                A02(obj, this);
                return ((BirthdayCenterRepository) this.A02).A00(null, this);
            case 27:
                A02(obj, this);
                return ((ContentLanguageSettingsApi) this.A02).A00(this);
            case 28:
                A02(obj, this);
                return ((ContentLanguageSettingsRepository) this.A02).A00(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A05(this);
            case 30:
                A02(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A01(null, this);
            case 31:
                A02(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A04(null, this);
            case 32:
                A02(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A02(null, this, false);
            case 33:
                A02(obj, this);
                return ((SettingsNetworkInteractor) this.A02).A03(null, null, this);
            case 34:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case 35:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case 36:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case 37:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case 38:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case 39:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case 40:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case Seq.NULL_REFNUM /* 41 */:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A02, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A02(obj, this);
                return ((SettingsSession) this.A02).A01(null, this);
            case 43:
                A01(obj, this);
                return UiStateKt.A02(null, null, this);
            case 44:
                A02(obj, this);
                return ((SaveStoryToGalleryCustomStorageHandler.NetworkInteractor) this.A02).A00(this, false);
            case 45:
                A02(obj, this);
                return ((ReelsXARApiUtil) this.A02).A01(null, this, false);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A02(obj, this);
                return ((ReelsXARApiUtil) this.A02).A02(null, this, false);
            case 47:
                A02(obj, this);
                return ((ShareToFriendsStoryRepository) this.A02).A00(this);
            case 48:
                A01(obj, this);
                return ((ShareToFriendsStoryEventProvider$special$$inlined$map$1$2) this.A01).emit(null, this);
            default:
                A01(obj, this);
                return ((MY6) this.A01).emit(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXC(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static PXC A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new PXC(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, PXC pxc) {
        pxc.A02 = obj;
        pxc.A00 |= Integer.MIN_VALUE;
    }

    public static void A02(Object obj, PXC pxc) {
        pxc.A01 = obj;
        pxc.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof PXC) && ((PXC) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXC(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = 43;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXC(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
