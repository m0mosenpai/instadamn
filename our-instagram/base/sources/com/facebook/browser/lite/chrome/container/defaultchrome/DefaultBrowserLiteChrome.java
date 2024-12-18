package com.facebook.browser.lite.chrome.container.defaultchrome;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC210669Tj;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC63387Sj3;
import X.C0f9;
import X.C14360o3;
import X.C62720SNk;
import X.C63305ShB;
import X.InterfaceC172717mh;
import X.InterfaceC172727mi;
import X.Q5I;
import X.QF6;
import X.ViewOnClickListenerC63503SoW;
import X.ViewOnClickListenerC63508Sob;
import X.ViewOnClickListenerC63509Soc;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes10.dex */
public class DefaultBrowserLiteChrome extends AbstractC210669Tj {
    public Context A00;
    public Intent A01;
    public Bundle A02;
    public View.OnClickListener A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C63305ShB A0B;
    public Q5I A0C;
    public InterfaceC172717mh A0D;
    public InterfaceC172727mi A0E;
    public C62720SNk A0F;
    public QF6 A0G;
    public String A0H;
    public boolean A0I;
    public final HashMap A0J;

    private void setDomain(String str) {
        Uri A09;
        boolean equals;
        boolean z;
        Bundle bundleExtra;
        String string;
        String str2 = null;
        if (str == null) {
            A09 = null;
        } else {
            A09 = AbstractC58319PtB.A09(str);
        }
        boolean z2 = false;
        if (A09 != null && A09.getHost() != null && (bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON")) != null && (string = bundleExtra.getString("KEY_BLOCKLIST_DOMAIN")) != null && AbstractC63387Sj3.A07(A09.getHost(), string)) {
            z2 = true;
        }
        TextView textView = this.A08;
        int i = 0;
        if (z2) {
            i = 8;
        }
        textView.setVisibility(i);
        if (A09 == null) {
            equals = false;
        } else {
            str2 = A09.getHost();
            equals = A09.getScheme().equals("https");
        }
        A01(str2, equals);
        QF6 C9a = ((BrowserLiteFragment) this.A0E).C9a();
        if (C9a == null) {
            z = false;
        } else {
            z = C9a.A0b;
        }
        int i2 = 8;
        if (!z && AbstractC63387Sj3.A04(A09)) {
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    @Override // X.AbstractC210669Tj
    public final void A01(String str, boolean z) {
        TextView textView;
        if (str != null && this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_SUBTITLE", true)) {
            textView = this.A09;
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView = this.A09;
            textView.setVisibility(8);
        }
        if (z) {
            this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_SUBTITLE", true);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (this.A0I) {
            textView.setTextColor(this.A00.getResources().getColor(0, null));
        }
    }

    private void setCloseButtonVisibility(boolean z) {
        this.A05.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    private void setMenuButtonVisibility(boolean z) {
        this.A06.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    @Override // X.AbstractC210669Tj
    public HashMap getMenuItemActionLog() {
        return this.A0J;
    }

    @Override // X.AbstractC210669Tj
    public void setControllers(InterfaceC172727mi interfaceC172727mi, InterfaceC172717mh interfaceC172717mh) {
        this.A0E = interfaceC172727mi;
        this.A0D = interfaceC172717mh;
    }

    public void setTextZoom(int i) {
        WebSettings settings = ((SystemWebView) this.A0G).A04.getSettings();
        settings.setTextZoom(i);
        WebSettings.LayoutAlgorithm layoutAlgorithm = settings.getLayoutAlgorithm();
        WebSettings.LayoutAlgorithm layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NORMAL;
        if (layoutAlgorithm != layoutAlgorithm2) {
            settings.setLayoutAlgorithm(layoutAlgorithm2);
        }
    }

    @Override // X.AbstractC210669Tj
    public void setTitle(String str) {
        if ((this.A0I && this.A0H != null) || TextUtils.isEmpty(str) || !this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_TITLE", true)) {
            return;
        }
        TextView textView = this.A0A;
        textView.setVisibility(0);
        textView.setText(str);
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0J = AbstractC166987dD.A1G();
        this.A00 = context;
        Intent intent = ((Activity) context).getIntent();
        this.A01 = intent;
        this.A02 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        C62720SNk c62720SNk = C62720SNk.A02;
        if (c62720SNk == null) {
            c62720SNk = new C62720SNk();
            C62720SNk.A02 = c62720SNk;
        }
        this.A0F = c62720SNk;
        this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA", false);
        this.A0I = this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FBLITE_IAB_IN_FB4A_MODE", false);
        this.A0H = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_STATIC_TITLE_TEXT");
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.browser_lite_chrome, this);
        this.A0A = AbstractC166987dD.A0e(this, R.id.text_title);
        this.A09 = AbstractC166987dD.A0e(this, R.id.text_subtitle);
        this.A03 = ViewOnClickListenerC63508Sob.A00(this, 4);
        ImageView A08 = AbstractC31171DnF.A08(this, R.id.close_button);
        this.A05 = A08;
        A08.setClickable(true);
        this.A05.setBackground(getResources().getDrawable(R.drawable.clickable_item_bg));
        this.A05.setOnClickListener(this.A03);
        ImageView imageView = this.A05;
        Context context3 = this.A00;
        C14360o3.A0B(context3, 0);
        imageView.setContentDescription(AbstractC166997dE.A0p(context3, R.string.res_0x7f13000b_name_removed));
        this.A08 = AbstractC166987dD.A0e(this, R.id.browser_action_button);
        this.A06 = AbstractC31171DnF.A08(this, R.id.browser_menu_button);
        this.A04 = findViewById(R.id.layout_title_and_subtitle);
        this.A07 = (LinearLayout) findViewById(R.id.layout_title_container);
        if (this.A0I && this.A0H != null) {
            this.A0A.setVisibility(0);
            this.A0A.setText(this.A0H);
        }
        Bundle bundleExtra = this.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
        if (bundleExtra != null) {
            String string = bundleExtra.getString("KEY_LABEL");
            String string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string) && string2 != null) {
                this.A08.setText(string);
                this.A08.setVisibility(0);
                this.A08.setOnClickListener(new ViewOnClickListenerC63503SoW(string2, this, 0));
            }
        }
        ArrayList parcelableArrayListExtra = this.A01.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            ImageView imageView2 = this.A06;
            C14360o3.A0B(context2, 0);
            imageView2.setContentDescription(AbstractC166997dE.A0p(context2, R.string.res_0x7f130064_name_removed));
            int intExtra = this.A01.getIntExtra("extra_menu_button_icon", R.drawable.browser_more_button);
            AbstractC58318PtA.A1D(this.A00.getResources(), this.A06, intExtra);
            this.A06.setOnClickListener(new ViewOnClickListenerC63509Soc(4, parcelableArrayListExtra, this));
            setMenuButtonVisibility(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_MENU_ITEM", true));
        }
        if (this.A06.getVisibility() == 8 && this.A08.getVisibility() != 8) {
            TextView textView = this.A08;
            textView.setPadding(textView.getPaddingLeft(), this.A08.getPaddingTop(), this.A00.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), this.A08.getPaddingBottom());
        }
        setCloseButtonVisibility(this.A01.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_CLOSE_BUTTON", true));
        String stringExtra = this.A01.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME");
        if ("THEME_MESSENGER_IAB".equals(stringExtra)) {
            this.A01.getDoubleExtra("BrowserLiteIntent.DISPLAY_HEIGHT_RATIO", 1.0d);
            AbstractC58318PtA.A1D(this.A00.getResources(), this.A05, 0);
        } else {
            ImageView imageView3 = this.A05;
            Context context4 = this.A00;
            AbstractC58318PtA.A1D(context4.getResources(), imageView3, R.drawable.browser_close_button);
            if (!"THEME_MESSENGER_FB4A".equals(stringExtra) && !"THEME_WORK_CHAT".equals(stringExtra)) {
                if ("THEME_INSTAGRAM".equals(stringExtra)) {
                    this.A09.getLayoutParams().height = -1;
                    this.A09.setTextSize(0, this.A0A.getTextSize());
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A04.getLayoutParams();
                    marginLayoutParams.setMargins(context4.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right), marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                }
            } else {
                Context context5 = this.A00;
                AbstractC31174DnI.A1C(this, context5.getResources().getColor(0, null));
                this.A0A.setTextColor(context5.getResources().getColor(0, null));
                this.A05.setColorFilter(context5.getResources().getColor(0, null));
            }
        }
        this.A0B = C63305ShB.A00();
    }

    @Override // X.AbstractC210669Tj
    public final void A00(String str) {
        setDomain(str);
        TextUtils.isEmpty(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(126264480);
        super.onAttachedToWindow();
        C0f9.A0D(-2080620137, A06);
    }

    public DefaultBrowserLiteChrome(Context context) {
        this(context, null);
    }

    @Override // X.AbstractC210669Tj
    public /* bridge */ /* synthetic */ Map getMenuItemActionLog() {
        return this.A0J;
    }
}
