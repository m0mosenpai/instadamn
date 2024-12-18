package X;

import android.app.Activity;
import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;

/* renamed from: X.Q4i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58713Q4i extends WebChromeClient {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i;
        String str;
        Activity rootActivity;
        C60891Raz c60891Raz;
        switch (this.A00) {
            case 3:
                AbstractC167007dF.A1D(valueCallback, 1, fileChooserParams);
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                if (acceptTypes != null) {
                    i = 0;
                    if (acceptTypes.length == 1) {
                        str = acceptTypes[0];
                        C14360o3.A0A(str);
                        C60891Raz c60891Raz2 = (C60891Raz) this.A01;
                        c60891Raz2.A01 = valueCallback;
                        rootActivity = c60891Raz2.getRootActivity();
                        C14360o3.A0A(rootActivity);
                        c60891Raz = c60891Raz2;
                        if (AbstractC93174Ft.A03(rootActivity)) {
                            A00(this, str);
                            return true;
                        }
                    } else {
                        throw AbstractC166987dD.A12(AbstractC111324zv.A00(23));
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
                break;
            case 4:
                i = AbstractC167007dF.A06(1, valueCallback, fileChooserParams);
                String[] acceptTypes2 = fileChooserParams.getAcceptTypes();
                if (acceptTypes2 != null) {
                    if (acceptTypes2.length == 1) {
                        str = acceptTypes2[0];
                        C14360o3.A0A(str);
                        Rb0 rb0 = (Rb0) this.A01;
                        rb0.A01 = valueCallback;
                        rootActivity = rb0.getRootActivity();
                        C14360o3.A0A(rootActivity);
                        c60891Raz = rb0;
                        if (AbstractC93174Ft.A03(rootActivity)) {
                            A00(this, str);
                            return true;
                        }
                    } else {
                        throw AbstractC31172DnG.A0u();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
                break;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        AbstractC93174Ft.A01(rootActivity, new C64484TFu(rootActivity, this, c60891Raz, str, i));
        return true;
    }

    public C58713Q4i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C58713Q4i c58713Q4i, String str) {
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setTypeAndNormalize(str).setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        C14360o3.A07(putExtra);
        Fragment fragment = (Fragment) c58713Q4i.A01;
        C12260kU.A07(fragment, Intent.createChooser(putExtra, fragment.requireContext().getString(2131963050)), 101);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(webView, 0);
                super.onProgressChanged(webView, i);
                progressBar = ((C58761Q7q) this.A01).A01;
                if (progressBar == null) {
                    C14360o3.A0F("progressBar");
                    throw C00O.createAndThrow();
                }
                break;
            case 1:
                super.onProgressChanged(webView, i);
                progressBar = ((C58767Q7x) this.A01).A00.A01;
                break;
            default:
                super.onProgressChanged(webView, i);
                return;
        }
        progressBar.setProgress(i);
    }
}
