package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;

/* renamed from: X.Ekc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33190Ekc extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "FullscreenBannerFragment";
    public FullscreenBannerViewModel A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        FullscreenBannerViewModel fullscreenBannerViewModel = this.A00;
        if (fullscreenBannerViewModel == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        bundle.putParcelable("BANNER_VIEW_MODEL", fullscreenBannerViewModel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r2 <= 0) goto L33;
     */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33190Ekc.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final Drawable A00(String str) {
        String queryParameter;
        int i;
        if (str != null) {
            android.net.Uri A0B = AbstractC25227BEk.A0B(str);
            if (!"ls".equals(A0B.getScheme()) || (queryParameter = A0B.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) == null) {
                return null;
            }
            switch (queryParameter.hashCode()) {
                case -2062403837:
                    if (!queryParameter.equals("warning-pano")) {
                        return null;
                    }
                    i = R.drawable.instagram_warning_pano_outline_24;
                    break;
                case -1168125356:
                    if (!queryParameter.equals("delete-pano")) {
                        return null;
                    }
                    i = R.drawable.instagram_delete_pano_outline_24;
                    break;
                case -353460394:
                    if (!queryParameter.equals("shield-pano")) {
                        return null;
                    }
                    i = R.drawable.instagram_shield_pano_outline_24;
                    break;
                case 1176723660:
                    if (!queryParameter.equals("illo-heart-circle-refresh")) {
                        return null;
                    }
                    i = R.drawable.ig_illustrations_illo_heart_circle_refresh;
                    break;
                case 1185340721:
                    if (!queryParameter.equals("info-pano")) {
                        return null;
                    }
                    i = R.drawable.instagram_info_pano_outline_24;
                    break;
                case 1884213401:
                    if (!queryParameter.equals("heart-pano")) {
                        return null;
                    }
                    i = R.drawable.instagram_heart_pano_outline_24;
                    break;
                case 2071845985:
                    if (!queryParameter.equals("illo-messages-refresh")) {
                        return null;
                    }
                    i = R.drawable.ig_illustrations_illo_messages_refresh;
                    break;
                default:
                    return null;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf == null) {
                return null;
            }
            return AbstractC56412ia.A00(AbstractC166997dE.A0N(this), valueOf.intValue());
        }
        return null;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1041735554);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A00 = (FullscreenBannerViewModel) AbstractC153636vY.A00(bundle, FullscreenBannerViewModel.class, "BANNER_VIEW_MODEL");
        C0f9.A09(-670486298, A02);
    }
}
