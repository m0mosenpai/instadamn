package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository.ClipsTemplateSuggestionRepository;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.genai.aistickers.data.AIStickersGhostPromptsRepository;
import com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAM extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAM(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static void A00(Object obj, MAM mam) {
        mam.A02 = obj;
        mam.A00 |= Integer.MIN_VALUE;
    }

    public static void A01(Object obj, MAM mam) {
        mam.A01 = obj;
        mam.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof MAM) && ((MAM) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case 4:
            case 45:
                A00(obj, this);
                return ((C9GJ) this.A01).emit(null, this);
            case 1:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 36:
            case 37:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A00(obj, this);
                return JWH.A00(this.A01, this);
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
                A00(obj, this);
                return ((C9GT) this.A01).emit(null, this);
            case 6:
            case 21:
            case 22:
            case 23:
                A00(obj, this);
                return ((C57113PVc) this.A01).emit(null, this);
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 26:
            case 27:
            case 38:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
                A00(obj, this);
                return ((JRY) this.A01).emit(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((SfxNetworkSource) this.A02).A01(null, null, null, this);
            case 14:
                A00(obj, this);
                return ((ClipsAudioStore$special$$inlined$map$1$2) this.A01).emit(null, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return ((ClipsTemplateSuggestionRepository) this.A02).A00(null, this);
            case 24:
            case 25:
                A00(obj, this);
                return ((MY6) this.A01).emit(null, this);
            case 30:
                A01(obj, this);
                return ((C2PV) this.A02).A0A(null, this);
            case 31:
                A01(obj, this);
                return ((C2PV) this.A02).A0K(null, this);
            case 32:
                A01(obj, this);
                return ((C2PV) this.A02).A0E(null, this);
            case 33:
                A01(obj, this);
                return ((C2PV) this.A02).A07(null, null, this);
            case 34:
                A01(obj, this);
                return ((C2PV) this.A02).A0J(null, this, false);
            case 35:
                A01(obj, this);
                return ((C2PV) this.A02).A0L(null, this);
            case 39:
                A01(obj, this);
                return JWH.A00(this.A02, this);
            case 43:
                A01(obj, this);
                return AlbumEditFragment.A04((AlbumEditFragment) this.A02, this);
            case 44:
                A01(obj, this);
                return ((AIStickersGhostPromptsRepository) this.A02).A00(this);
            case 47:
                A01(obj, this);
                return ((MagicModConsentGraphQLApi) this.A02).A00(null, null, this);
            case 48:
                A01(obj, this);
                return ((MagicModConsentGraphQLApi) this.A02).A01(null, null, this, false);
            default:
                A01(obj, this);
                return ((MagicModImageGenerationDataSource) this.A02).A01(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAM(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
