package X;

import android.R;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.Collection;

/* renamed from: X.Q0x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogC58694Q0x extends Dialog {
    public ProgressDialog A00;
    public WebView A01;
    public FrameLayout A02;
    public ImageView A03;
    public InterfaceC65342TiP A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public static int A00(float f, int i, int i2, int i3) {
        int i4 = (int) (i / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + (((i3 - i4) / (i3 - i2)) * 0.5d);
        }
        return (int) (i * d);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.A06 = false;
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.A06 = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void A02(C62406SAf c62406SAf) {
        InterfaceC65342TiP interfaceC65342TiP = this.A04;
        if (interfaceC65342TiP != null && !this.A07) {
            this.A07 = true;
            interfaceC65342TiP.D6R(null, c62406SAf);
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.A04 != null && !this.A07) {
            A02(new C62406SAf(C05F.A01));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        WebView webView = this.A01;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.A06 && this.A00.isShowing()) {
            this.A00.dismiss();
        }
        super.dismiss();
    }

    public DialogC58694Q0x(Context context, Bundle bundle, InterfaceC65342TiP interfaceC65342TiP, String str) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.A07 = false;
        this.A06 = false;
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("display", "touch");
        Collection collection = AbstractC62356S8d.A01;
        this.A05 = AbstractC63349Si6.A00(bundle, String.format("m.%s", IGPixelRequestBuffer.URL_PREFIX), AnonymousClass001.A0u("v2.3", "/", "dialog/", str)).toString();
        this.A04 = interfaceC65342TiP;
    }

    public final void A01() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i >= i2) {
            i = i2;
        }
        if (i >= i2) {
            i2 = i;
        }
        float f = displayMetrics.density;
        int min = Math.min(A00(f, i, 480, 800), i);
        int min2 = Math.min(A00(f, i2, 800, 1280), i2);
        Window window = getWindow();
        window.getClass();
        window.setLayout(min, min2);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.A00 = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.A00.setMessage(getContext().getString(com.facebook.R.string.res_0x7f13002c_name_removed));
        this.A00.setOnCancelListener(new DialogInterfaceOnCancelListenerC63417Sjv(this, 1));
        requestWindowFeature(1);
        this.A02 = new FrameLayout(getContext());
        A01();
        Window window = getWindow();
        window.getClass();
        window.setGravity(17);
        Window window2 = getWindow();
        window2.getClass();
        window2.setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.A03 = imageView;
        ViewOnClickListenerC63508Sob.A01(imageView, 18, this);
        this.A03.setImageDrawable(getContext().getDrawable(com.facebook.R.drawable.com_facebook_close));
        this.A03.setVisibility(4);
        Drawable drawable = this.A03.getDrawable();
        drawable.getClass();
        int intrinsicWidth = (drawable.getIntrinsicWidth() / 2) + 1;
        LinearLayout linearLayout = new LinearLayout(getContext());
        C58714Q4j c58714Q4j = new C58714Q4j(getContext(), this);
        this.A01 = c58714Q4j;
        c58714Q4j.setVerticalScrollBarEnabled(false);
        this.A01.setHorizontalScrollBarEnabled(false);
        this.A01.setWebViewClient(new C58716Q4o(this));
        this.A01.getSettings().setJavaScriptEnabled(true);
        this.A01.loadUrl(this.A05);
        this.A01.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A01.setVisibility(4);
        this.A01.getSettings().setSavePassword(false);
        this.A01.getSettings().setSaveFormData(false);
        this.A01.setFocusable(true);
        this.A01.setFocusableInTouchMode(true);
        ViewOnTouchListenerC63511Soe.A00(this.A01, 6, this);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.A01);
        linearLayout.setBackgroundColor(-872415232);
        this.A02.addView(linearLayout);
        this.A02.addView(this.A03, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.A02);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        A01();
    }
}
