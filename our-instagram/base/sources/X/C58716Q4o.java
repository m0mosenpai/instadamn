package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Q4o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58716Q4o extends WebViewClient {
    public final /* synthetic */ DialogC58694Q0x A00;

    public C58716Q4o(DialogC58694Q0x dialogC58694Q0x) {
        this.A00 = dialogC58694Q0x;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int parseInt;
        if (str.startsWith("fbconnect://success")) {
            DialogC58694Q0x dialogC58694Q0x = this.A00;
            Bundle A01 = AbstractC63349Si6.A01(str);
            String string = A01.getString("error");
            if (string == null) {
                string = A01.getString("error_type");
            }
            String string2 = A01.getString("error_msg");
            if (string2 == null && (string2 = A01.getString("error_message")) == null) {
                string2 = A01.getString(TraceFieldType.Error);
            }
            String string3 = A01.getString(TraceFieldType.ErrorCode);
            if (!AbstractC63349Si6.A05(string3)) {
                if (string3 != null) {
                    parseInt = Integer.parseInt(string3);
                    if (!AbstractC63349Si6.A05(string) && AbstractC63349Si6.A05(string2) && parseInt == -1) {
                        InterfaceC65342TiP interfaceC65342TiP = dialogC58694Q0x.A04;
                        if (interfaceC65342TiP != null && !dialogC58694Q0x.A07) {
                            dialogC58694Q0x.A07 = true;
                            interfaceC65342TiP.D6R(A01, null);
                            dialogC58694Q0x.dismiss();
                        }
                        return true;
                    }
                    if ((string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || parseInt == 4201) {
                        dialogC58694Q0x.cancel();
                        return true;
                    }
                    dialogC58694Q0x.A02(new C62406SAf(C05F.A0N));
                    return true;
                }
                throw new NumberFormatException("errorCodeString is null");
            }
            parseInt = -1;
            if (!AbstractC63349Si6.A05(string)) {
            }
            if (string == null) {
            }
            dialogC58694Q0x.A02(new C62406SAf(C05F.A0N));
            return true;
        }
        if (str.startsWith("fbconnect://cancel")) {
            this.A00.cancel();
            return true;
        }
        if (str.contains("touch")) {
            return false;
        }
        C12260kU.A0G(this.A00.getContext(), AbstractC08820cl.A03(str));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        DialogC58694Q0x dialogC58694Q0x = this.A00;
        if (!dialogC58694Q0x.A06) {
            dialogC58694Q0x.A00.dismiss();
        }
        dialogC58694Q0x.A02.setBackgroundColor(0);
        dialogC58694Q0x.A01.setVisibility(0);
        dialogC58694Q0x.A03.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        DialogC58694Q0x dialogC58694Q0x = this.A00;
        if (!dialogC58694Q0x.A06) {
            C0fJ.A00(dialogC58694Q0x.A00);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.A00.A02(new C62406SAf(C05F.A0C));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslErrorHandler.cancel();
        this.A00.A02(new C62406SAf(C05F.A0C));
    }
}
