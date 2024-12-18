package X;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.Html;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Q4d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58712Q4d extends WebChromeClient {
    public BrowserLiteWebChromeClient A00;

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (webView instanceof InterfaceC65201Tfj) {
            BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
            SystemWebView A00 = R7V.A00(webView);
            BrowserLiteFragment browserLiteFragment = browserLiteWebChromeClient.A0A;
            if (browserLiteFragment.C9a() == A00) {
                BrowserLiteFragment.A0D(browserLiteFragment);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a0, code lost:
    
        if (r3.equals(r0) != false) goto L77;
     */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage r15) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58712Q4d.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (webView instanceof InterfaceC65201Tfj) {
            BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
            SystemWebView A00 = R7V.A00(webView);
            BrowserLiteFragment browserLiteFragment = browserLiteWebChromeClient.A0A;
            if (browserLiteFragment.C9a() == A00 && z2) {
                C23016ACq c23016ACq = browserLiteFragment.A0e;
                if (c23016ACq.A0p) {
                    c23016ACq.A0T = true;
                }
                ((WebView.WebViewTransport) message.obj).setWebView(((SystemWebView) browserLiteFragment.A0R()).A04);
                message.sendToTarget();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String str2;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        FragmentActivity activity = browserLiteWebChromeClient.A0A.getActivity();
        if (activity != null && browserLiteWebChromeClient.A03 != null) {
            try {
                str2 = new java.net.URI(str).getHost();
            } catch (Exception unused) {
                str2 = str;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            String string = activity.getString(R.string.res_0x7f13000d_name_removed, Arrays.copyOf(new Object[]{str2}, 1));
            C14360o3.A07(string);
            builder.setMessage(string).setPositiveButton(AbstractC166997dE.A0p(activity, R.string.res_0x7f13000f_name_removed), new DialogInterfaceOnClickListenerC63422Sk0(browserLiteWebChromeClient, callback, str, 1)).setNegativeButton(AbstractC166997dE.A0p(activity, R.string.res_0x7f130010_name_removed), new DialogInterfaceOnClickListenerC63422Sk0(browserLiteWebChromeClient, callback, str, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC55250OfO(callback, browserLiteWebChromeClient, str, 0)).show();
            return;
        }
        callback.invoke(str, false, false);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        try {
            BrowserLiteWebChromeClient.A01(this.A00);
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (webView instanceof InterfaceC65201Tfj) {
            Iterator it = this.A00.A0F.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return false;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources;
        String str;
        Object[] objArr;
        String str2;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        if (permissionRequest != null && (resources = permissionRequest.getResources()) != null && resources.length == 1) {
            String str3 = resources[0];
            if ("android.webkit.resource.VIDEO_CAPTURE".equals(str3)) {
                FragmentActivity activity = browserLiteWebChromeClient.A0A.getActivity();
                if (activity != null) {
                    if (C02G.A00(activity, "android.permission.CAMERA") != 0) {
                        str = "BrowserLiteWebChromeClient";
                        objArr = new Object[0];
                        str2 = "Does not have camera permission";
                    } else {
                        if (activity.getPackageManager() != null && activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                            browserLiteWebChromeClient.A0G = true;
                            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                            String string = activity.getString(R.string.res_0x7f13000c_name_removed, Arrays.copyOf(new Object[]{permissionRequest.getOrigin().getHost()}, 1));
                            C14360o3.A07(string);
                            browserLiteWebChromeClient.A01 = builder.setMessage(string).setPositiveButton(AbstractC166997dE.A0p(activity, R.string.res_0x7f13000f_name_removed), new DialogInterfaceOnClickListenerC48022LMr(1, activity, permissionRequest, browserLiteWebChromeClient)).setNegativeButton(AbstractC166997dE.A0p(activity, R.string.res_0x7f130010_name_removed), new DialogInterfaceOnClickListenerC48022LMr(0, activity, permissionRequest, browserLiteWebChromeClient)).setOnCancelListener(new DialogInterfaceOnCancelListenerC35296FhV(2, activity, permissionRequest, browserLiteWebChromeClient)).show();
                            return;
                        }
                        str = "BrowserLiteWebChromeClient";
                        objArr = new Object[0];
                        str2 = "Does not have camera";
                    }
                    AbstractC63254SgB.A01(str, str2, objArr);
                    return;
                }
                return;
            }
            if (!"android.webkit.resource.PROTECTED_MEDIA_ID".equals(str3)) {
                return;
            }
            permissionRequest.grant(resources);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        browserLiteWebChromeClient.A0G = false;
        AlertDialog alertDialog = browserLiteWebChromeClient.A01;
        if (alertDialog != null && alertDialog.isShowing()) {
            browserLiteWebChromeClient.A01.dismiss();
            browserLiteWebChromeClient.A01 = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (webView instanceof InterfaceC65201Tfj) {
            this.A00.A07(R7V.A00(webView), i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        String str2;
        if (webView instanceof InterfaceC65201Tfj) {
            BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
            SystemWebView A00 = R7V.A00(webView);
            if (str != null && !ReactWebViewManager.BLANK_URL.equals(str)) {
                str2 = Html.fromHtml(str).toString();
            } else {
                str2 = null;
            }
            if (A00.A04.getVisibility() == 0) {
                browserLiteWebChromeClient.A0A.A0c(str2);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        String str;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        try {
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = browserLiteWebChromeClient.A08;
                frameLayout.addView(view);
                frameLayout.setVisibility(0);
                AbstractC43592JPx.A08(browserLiteWebChromeClient.A0A.requireActivity()).setSystemUiVisibility(4);
                browserLiteWebChromeClient.A07 = customViewCallback;
                View focusedChild = ((FrameLayout) view).getFocusedChild();
                if (focusedChild instanceof VideoView) {
                    VideoView videoView = (VideoView) focusedChild;
                    browserLiteWebChromeClient.A09 = videoView;
                    videoView.setOnCompletionListener(browserLiteWebChromeClient);
                    browserLiteWebChromeClient.A09.setOnErrorListener(browserLiteWebChromeClient);
                }
                Iterator it = browserLiteWebChromeClient.A0F.iterator();
                while (it.hasNext()) {
                    AbstractC63223SfY abstractC63223SfY = (AbstractC63223SfY) ((InterfaceC65637Tq0) it.next());
                    if (abstractC63223SfY instanceof C58886QEw) {
                        Context context = abstractC63223SfY.A00;
                        if (context != null) {
                            str = context.getString(R.string.res_0x7f13006a_name_removed);
                        } else {
                            str = null;
                        }
                        C9GR.A03(context, str, null, 1);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC63254SgB.A00("BrowserLiteWebChromeClient", "Failed enter fullscreen %s", th, AbstractC58319PtB.A1Z(th));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!(webView instanceof InterfaceC65201Tfj)) {
            return false;
        }
        return this.A00.onShowFileChooser(R7V.A00(webView), valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback valueCallback) {
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
    }
}
