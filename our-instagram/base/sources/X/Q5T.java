package X;

import com.facebook.secure.securewebview.SecureWebView;

/* loaded from: classes10.dex */
public final class Q5T extends C00H {
    public SecureWebView A00;

    public Q5T() {
        super(false);
    }

    @Override // X.C00H
    public final void A01() {
        boolean z;
        SecureWebView secureWebView = this.A00;
        if (secureWebView != null && secureWebView.canGoBack()) {
            this.A00.goBack();
            z = this.A00.canGoBack();
        } else {
            z = false;
        }
        A04(z);
    }
}
