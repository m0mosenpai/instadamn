package X;

import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.comments.mvvm.data.network.CarouselChildThumbnailRequestsKt;
import com.instagram.comments.mvvm.data.network.DeleteCommentUpsellRequestsKt;
import com.instagram.comments.mvvm.data.network.HideActionNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.LikeActionNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.MediaCommentDeletionNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.MediaCommentPinUnpinNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt;
import com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt;
import com.instagram.comments.mvvm.data.network.UnhideActionNetworkRequestsKt;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxStitchingHelper;
import com.instagram.creation.genai.imagine.integrity.ImagineNativeIntegrityUtilKt;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt;
import com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt;
import com.meta.compose.material.bottomsheet.AnchoredDraggableKt;
import com.meta.metaai.imagine.service.ImagineNetworkServiceKt;

/* loaded from: classes5.dex */
public final class D3k extends C1Dq {
    public int A00;
    public Object A01;
    public final int A02;

    public static Object A00(C25621Ms c25621Ms, String str, D3k d3k, Object[] objArr) {
        c25621Ms.A0L(str, objArr);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        d3k.A00 = 1;
        return A0N.A01(d3k);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3k(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A02 = i;
    }

    public static void A01(Object obj, D3k d3k) {
        d3k.A01 = obj;
        d3k.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof D3k) && ((D3k) obj).A02 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                A01(obj, this);
                PlatformTextInputModifierNodeKt.A01(null, this, null);
                break;
            case 1:
                A01(obj, this);
                PlatformTextInputModifierNodeKt.A00(null, this, null);
                break;
            case 2:
                A01(obj, this);
                return CarouselChildThumbnailRequestsKt.A00(null, null, this);
            case 3:
                A01(obj, this);
                return DeleteCommentUpsellRequestsKt.A00(null, this);
            case 4:
                A01(obj, this);
                return HideActionNetworkRequestsKt.A00(null, null, null, this);
            case 5:
                A01(obj, this);
                return LikeActionNetworkRequestsKt.A00(null, null, null, null, null, this);
            case 6:
                A01(obj, this);
                return MediaCommentDeletionNetworkRequestsKt.A00(null, null, null, null, this);
            case 7:
                A01(obj, this);
                return MediaCommentPinUnpinNetworkRequestsKt.A00(null, null, null, this);
            case 8:
                A01(obj, this);
                return MediaCommentPinUnpinNetworkRequestsKt.A01(null, null, null, this);
            case 9:
                A01(obj, this);
                return MediaParentCommentNetworkFetcherKt.A02(null, null, this);
            case 10:
                A01(obj, this);
                return RestrictedCommentNetworkRequestsKt.A01(null, null, null, this);
            case 11:
                A01(obj, this);
                return RestrictedCommentNetworkRequestsKt.A00(null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return UnhideActionNetworkRequestsKt.A00(null, null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return UnhideActionNetworkRequestsKt.A01(null, null, null, this);
            case 14:
                A01(obj, this);
                return SfxStitchingHelper.A00(null, null, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return ImagineNativeIntegrityUtilKt.A00(null, null, null, null, null, null, this);
            case 16:
                A01(obj, this);
                return MutedWordsApiUtil.A02(null, this);
            case 17:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A01(null, null, null, null, null, null, this);
            case 18:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A04(null, null, null, null, this);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A00(null, null, null, null, null, null, null, null, this);
            case 20:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A07(null, null, this);
            case 21:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A08(null, null, this);
            case 22:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A05(null, null, null, this);
            case 23:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A06(null, null, null, this);
            case 24:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A02(null, null, null, null, this);
            case 25:
                A01(obj, this);
                return SettingsSessionResolveExtensionsKt.A03(null, null, null, null, this);
            case 26:
                A01(obj, this);
                return DerivedValueProviderKt.A00(null, this);
            case 27:
                A01(obj, this);
                return DerivedValueProviderKt.A01(null, this);
            case 28:
                A01(obj, this);
                return DerivedValueProviderKt.A02(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A01(obj, this);
                return DerivedValueProviderKt.A03(null, this);
            case 30:
                A01(obj, this);
                return AnchoredDraggableKt.A01(this, null, null);
            case 31:
                A01(obj, this);
                return ImagineNetworkServiceKt.A03(this, null, 0L);
            default:
                A01(obj, this);
                return AbstractC54920OQv.A01(null, this);
        }
        throw C00O.createAndThrow();
    }
}
