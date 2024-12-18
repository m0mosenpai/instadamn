package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.SrD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63647SrD implements InterfaceC65568Tn1 {
    public final WebViewProviderFactoryBoundaryInterface A00;

    @Override // X.InterfaceC65568Tn1
    public final WebViewProviderBoundaryInterface ANX(WebView webView) {
        return (WebViewProviderBoundaryInterface) C63081Sc3.A00(WebViewProviderBoundaryInterface.class, this.A00.createWebView(webView));
    }

    @Override // X.InterfaceC65568Tn1
    public final ProfileStoreBoundaryInterface Bi8() {
        return (ProfileStoreBoundaryInterface) C63081Sc3.A00(ProfileStoreBoundaryInterface.class, this.A00.getProfileStore());
    }

    @Override // X.InterfaceC65568Tn1
    public final StaticsBoundaryInterface C0E() {
        return (StaticsBoundaryInterface) C63081Sc3.A00(StaticsBoundaryInterface.class, this.A00.getStatics());
    }

    @Override // X.InterfaceC65568Tn1
    public final String[] CHO() {
        return this.A00.getSupportedFeatures();
    }

    @Override // X.InterfaceC65568Tn1
    public final WebkitToCompatConverterBoundaryInterface CHP() {
        return (WebkitToCompatConverterBoundaryInterface) C63081Sc3.A00(WebkitToCompatConverterBoundaryInterface.class, this.A00.getWebkitToCompatConverter());
    }

    public C63647SrD(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.A00 = webViewProviderFactoryBoundaryInterface;
    }
}
