package com.facebook.browser.lite;

import X.AbstractC114515Ew;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.C02G;
import X.C0b3;
import X.C58331PtP;
import X.C58884QEu;
import X.C62914SWv;
import X.InterfaceC65594Tnc;
import X.InterfaceC65637Tq0;
import X.InterfaceViewOnTouchListenerC65624Tpk;
import X.MSV;
import X.N0P;
import X.QF6;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public class BrowserLiteWebChromeClient implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public int A00;
    public AlertDialog A01;
    public ContentResolver A02;
    public Intent A03;
    public Uri A04;
    public ValueCallback A05;
    public ValueCallback A06;
    public WebChromeClient.CustomViewCallback A07;
    public FrameLayout A08;
    public VideoView A09;
    public BrowserLiteFragment A0A;
    public BrowserLiteProgressBar A0B;
    public InterfaceViewOnTouchListenerC65624Tpk A0C;
    public InterfaceC65594Tnc A0D;
    public QF6 A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public ValueCallback A0K;
    public WebChromeClient.FileChooserParams A0L;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0bW, java.lang.Object] */
    private void A00(ValueCallback valueCallback) {
        Uri A04;
        Uri[] uriArr;
        String str;
        Uri uri;
        if (valueCallback != null) {
            ValueCallback valueCallback2 = this.A05;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
                this.A05 = null;
            }
            this.A05 = valueCallback;
            Intent A0E = AbstractC58318PtA.A0E("android.media.action.IMAGE_CAPTURE");
            try {
                N0P n0p = new N0P();
                FragmentActivity requireActivity = this.A0A.requireActivity();
                File A03 = n0p.A03(requireActivity, "webview_tmp_file", ".jpg");
                HashMap hashMap = C58331PtP.A06;
                A04 = C58331PtP.A01(requireActivity, null, new Object()).A04(A03);
                uriArr = new Uri[]{A04};
                String action = A0E.getAction();
                if (!"android.media.action.IMAGE_CAPTURE".equals(action) && !"android.media.action.VIDEO_CAPTURE".equals(action)) {
                    str = MSV.A00(19);
                } else {
                    str = "output";
                }
                uri = uriArr[0];
            } catch (IOException unused) {
                this.A05 = null;
                this.A04 = null;
            }
            if (uri != null && "file".equals(uri.getScheme())) {
                throw new SecurityException("Attempted to bypass content providers with file:// URI");
            }
            A0E.addFlags(1);
            A0E.addFlags(2);
            A0E.setClipData(new ClipData(new ClipDescription(str, new String[]{"text/uri-list"}), new ClipData.Item(uriArr[0])));
            A0E.putExtra(str, uriArr[0]);
            this.A04 = A04;
            A0E.putExtra("output", A04);
            try {
                C0b3.A00().A03().A0F(this.A0A.requireActivity(), A0E, 4);
            } catch (ActivityNotFoundException unused2) {
                this.A05 = null;
                this.A04 = null;
            }
        }
    }

    private boolean A05(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z = false;
        if (valueCallback != null && fileChooserParams != null) {
            ValueCallback valueCallback2 = this.A05;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
                this.A05 = null;
            }
            this.A05 = valueCallback;
            try {
                this.A0A.startActivityForResult(fileChooserParams.createIntent(), 2);
                z = true;
                return true;
            } catch (ActivityNotFoundException unused) {
                this.A05 = null;
            }
        }
        return z;
    }

    public static void A01(BrowserLiteWebChromeClient browserLiteWebChromeClient) {
        FrameLayout frameLayout = browserLiteWebChromeClient.A08;
        if (frameLayout.getVisibility() == 8) {
            return;
        }
        VideoView videoView = browserLiteWebChromeClient.A09;
        if (videoView != null) {
            videoView.stopPlayback();
            browserLiteWebChromeClient.A09 = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = browserLiteWebChromeClient.A07;
        if (customViewCallback != null) {
            try {
                customViewCallback.onCustomViewHidden();
            } catch (Exception unused) {
            }
            browserLiteWebChromeClient.A07 = null;
        }
        frameLayout.setVisibility(8);
        AbstractC43592JPx.A08(browserLiteWebChromeClient.A0A.requireActivity()).setSystemUiVisibility(8192);
        try {
            try {
                frameLayout.removeAllViews();
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            frameLayout.removeAllViews();
        }
    }

    public static void A02(BrowserLiteWebChromeClient browserLiteWebChromeClient, int i) {
        InterfaceC65594Tnc interfaceC65594Tnc = browserLiteWebChromeClient.A0D;
        if (interfaceC65594Tnc != null) {
            interfaceC65594Tnc.setProgress(i);
        } else {
            browserLiteWebChromeClient.A0B.setProgress(i);
        }
        for (InterfaceC65637Tq0 interfaceC65637Tq0 : browserLiteWebChromeClient.A0F) {
            if (interfaceC65637Tq0 instanceof C58884QEu) {
                C58884QEu c58884QEu = (C58884QEu) interfaceC65637Tq0;
                if (i == 100) {
                    C62914SWv c62914SWv = c58884QEu.A00;
                    if (c62914SWv != null) {
                        c62914SWv.A00 = AbstractC31173DnH.A0g();
                    }
                    C58884QEu.A00(c58884QEu);
                }
            }
        }
    }

    public static boolean A03(Activity activity) {
        return AbstractC167007dF.A1N(C02G.A00(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"));
    }

    public static boolean A04(Activity activity) {
        boolean A1N = AbstractC167007dF.A1N(C02G.A00(activity, "android.permission.READ_MEDIA_IMAGES"));
        boolean A1N2 = AbstractC167007dF.A1N(C02G.A00(activity, "android.permission.READ_MEDIA_VIDEO"));
        if (A1N && A1N2) {
            return true;
        }
        return false;
    }

    public final void A06(int i, int[] iArr) {
        BrowserLiteFragment browserLiteFragment = this.A0A;
        FragmentActivity activity = browserLiteFragment.getActivity();
        if (i != 3) {
            if (i == 4 && this.A0H && iArr.length > 0 && iArr[0] == 0) {
                A00(this.A0K);
            } else {
                return;
            }
        } else {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    if (Build.VERSION.SDK_INT < 34 || activity == null || !A03(activity)) {
                        return;
                    }
                    Toast.makeText(browserLiteFragment.A06, R.string.res_0x7f13000e_name_removed, 0).show();
                    return;
                }
            }
            A05(this.A0K, this.A0L);
        }
        this.A0K = null;
        this.A0L = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.QF6 r7, int r8) {
        /*
            r6 = this;
            r6.A00 = r8
            X.QF4 r1 = com.facebook.browser.lite.BrowserLiteFragment.A05(r7)
            if (r1 == 0) goto L25
            java.lang.String r0 = r7.A05()
            r1.A0A(r0)
            boolean r0 = r1.A09
            if (r0 == 0) goto L25
            r0 = 100
            if (r8 != r0) goto L25
            com.facebook.browser.lite.BrowserLiteFragment r0 = r1.A0E
            X.ACq r3 = r0.A0e
            long r1 = java.lang.System.currentTimeMillis()
            boolean r0 = r3.A0p
            if (r0 == 0) goto L25
            r3.A0C = r1
        L25:
            com.facebook.browser.lite.webview.SystemWebView r7 = (com.facebook.browser.lite.webview.SystemWebView) r7
            X.R7V r0 = r7.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb2
            A02(r6, r8)
            X.QF6 r1 = r6.A0E
            boolean r0 = r1.A0V
            if (r0 == 0) goto Lb2
            X.SHJ r1 = r1.A0H
            boolean r0 = r1.A02
            if (r0 == 0) goto Lb2
            X.QF6 r4 = r1.A01
            android.content.Context r5 = r1.A00
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            java.lang.ref.WeakReference r1 = X.AbstractC61530RpA.A00
            if (r1 == 0) goto L55
            r0 = 0
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L75
            X.AbstractC61530RpA.A00 = r0
        L55:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131886133(0x7f120035, float:1.9406836E38)
            java.io.InputStreamReader r3 = X.AbstractC58320PtC.A0j(r1, r0)
            java.lang.String r2 = X.AbstractC38581qm.A00(r3)     // Catch: java.lang.Throwable -> L97
            r3.close()
            int r1 = r2.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto L75
            java.lang.ref.WeakReference r0 = X.AbstractC25225BEi.A16(r2)
            X.AbstractC61530RpA.A00 = r0
        L75:
            r4.A0G(r2)
            java.lang.ref.WeakReference r1 = X.Rp8.A00
            if (r1 == 0) goto L87
            r0 = 0
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Laf
            X.Rp8.A00 = r0
        L87:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131886130(0x7f120032, float:1.940683E38)
            java.io.InputStreamReader r3 = X.AbstractC58320PtC.A0j(r1, r0)
            java.lang.String r2 = X.AbstractC38581qm.A00(r3)     // Catch: java.lang.Throwable -> L97
            goto L9e
        L97:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            X.C20I.A00(r3, r1)
            throw r0
        L9e:
            r3.close()
            int r1 = r2.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto Laf
            java.lang.ref.WeakReference r0 = X.AbstractC25225BEi.A16(r2)
            X.Rp8.A00 = r0
        Laf:
            r4.A0G(r2)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.A07(X.QF6, int):void");
    }

    public boolean onShowFileChooser(QF6 qf6, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] strArr;
        int i;
        if (!this.A0J) {
            return A05(valueCallback, fileChooserParams);
        }
        FragmentActivity activity = this.A0A.getActivity();
        if (activity == null) {
            return false;
        }
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        boolean z = this.A0I;
        if (z && isCaptureEnabled && C02G.A00(activity, "android.permission.CAMERA") == 0) {
            A00(valueCallback);
            return true;
        }
        if (this.A0H && z && isCaptureEnabled && C02G.A00(activity, "android.permission.CAMERA") != 0) {
            strArr = new String[]{"android.permission.CAMERA"};
            i = 4;
        } else {
            if (Build.VERSION.SDK_INT < 33 || this.A0A.A06.getApplicationInfo().targetSdkVersion < 33 ? C02G.A00(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0 : A04(activity)) {
                A05(valueCallback, fileChooserParams);
                return true;
            }
            if (Build.VERSION.SDK_INT >= 33 && this.A0A.A06.getApplicationInfo().targetSdkVersion >= 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            }
            i = 3;
        }
        AbstractC114515Ew.A05(activity, strArr, i);
        this.A0K = valueCallback;
        this.A0L = fileChooserParams;
        return true;
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        openFileChooser(valueCallback, str, "");
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            A01(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            A01(this);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void openFileChooser(ValueCallback valueCallback, String str, String str2) {
        this.A06 = valueCallback;
        Intent A0E = AbstractC58318PtA.A0E("android.intent.action.GET_CONTENT");
        A0E.addCategory("android.intent.category.OPENABLE");
        A0E.setType(str);
        try {
            this.A0A.startActivityForResult(A0E, 1);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
