package X;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.SrE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63648SrE implements InterfaceC65568Tn1 {
    public static final String[] A00 = new String[0];

    @Override // X.InterfaceC65568Tn1
    public final WebViewProviderBoundaryInterface ANX(WebView webView) {
        throw AbstractC166987dD.A1D("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // X.InterfaceC65568Tn1
    public final ProfileStoreBoundaryInterface Bi8() {
        throw AbstractC166987dD.A1D("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // X.InterfaceC65568Tn1
    public final StaticsBoundaryInterface C0E() {
        throw AbstractC166987dD.A1D("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // X.InterfaceC65568Tn1
    public final String[] CHO() {
        return A00;
    }

    @Override // X.InterfaceC65568Tn1
    public final WebkitToCompatConverterBoundaryInterface CHP() {
        throw AbstractC166987dD.A1D("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
