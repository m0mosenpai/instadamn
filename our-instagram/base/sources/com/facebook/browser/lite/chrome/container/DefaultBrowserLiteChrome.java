package com.facebook.browser.lite.chrome.container;

import X.AbstractC111324zv;
import X.AbstractC151266rU;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC53242c7;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC61711RsS;
import X.AnonymousClass189;
import X.BCL;
import X.C06090Tz;
import X.C0fQ;
import X.C14360o3;
import X.C18U;
import X.C38321qM;
import X.C58877QEn;
import X.C64834TVz;
import X.C7JA;
import X.InterfaceC172717mh;
import X.InterfaceC172727mi;
import X.InterfaceC38371qR;
import X.InterfaceC65199Tfh;
import X.InterfaceC71996XEk;
import X.Q5I;
import X.QF6;
import X.RunnableC71407WtV;
import X.SVS;
import X.ViewOnClickListenerC63498SoD;
import X.ViewOnClickListenerC63501SoU;
import X.ViewOnClickListenerC63502SoV;
import X.ViewOnClickListenerC63509Soc;
import X.X23;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class DefaultBrowserLiteChrome extends RelativeLayout implements InterfaceC71996XEk {
    public Intent A00;
    public Bundle A01;
    public ImageView A02;
    public TextView A03;
    public Q5I A04;
    public InterfaceC172717mh A05;
    public InterfaceC172727mi A06;
    public UserSession A07;
    public C38321qM A08;
    public User A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public ImageView A0G;
    public TextView A0H;
    public BrowserLiteProgressBar A0I;
    public boolean A0J;
    public boolean A0K;

    @Override // X.InterfaceC71996XEk
    public final /* synthetic */ void AJL(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC71996XEk
    public final /* synthetic */ void Coq() {
    }

    @Override // X.InterfaceC71996XEk
    public final void Ekr(int i) {
        Resources resources;
        int i2;
        if (i != -8 && i != -1) {
            resources = getResources();
            i2 = 2131964524;
        } else {
            resources = getResources();
            i2 = 2131964525;
        }
        String string = resources.getString(i2);
        this.A0B = string;
        this.A03.setText(string);
        this.A0E.setVisibility(8);
    }

    @Override // X.InterfaceC71996XEk
    public final boolean Ell() {
        return false;
    }

    public void setHeaderLeftStaticAction(InterfaceC65199Tfh interfaceC65199Tfh) {
    }

    public void setHeaderRightStaticAction(InterfaceC65199Tfh interfaceC65199Tfh) {
    }

    public void setLogger(BCL bcl) {
    }

    public /* synthetic */ void setMenuButtonVisibility(int i) {
    }

    public void setSecureConnectionStaticActions(List list) {
    }

    private void setChromeSubsection(String str) {
        String str2;
        QF6 C9a = this.A06.C9a();
        if (C9a != null && C9a.A0b && !TextUtils.isEmpty(C9a.A0M)) {
            if (C9a.A0b) {
                str2 = C9a.A0M;
            } else {
                str2 = null;
            }
            this.A0E.setVisibility(0);
            TextView textView = this.A0H;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(AbstractC61711RsS.A00(str2));
            this.A0G.setVisibility(0);
            this.A0G.setImageResource(R.drawable.instagram_warning_pano_filled_24);
            this.A0G.setColorFilter(getContext().getColor(R.color.igds_error_or_destructive));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.A0E.setVisibility(0);
            if (!str.equals(this.A0C)) {
                Uri A09 = AbstractC58319PtB.A09(str);
                if (A09 != null) {
                    this.A0H.setText(AbstractC61711RsS.A00(A09.toString()));
                }
                this.A0C = str;
            }
            if (this.A0D) {
                this.A0H.setTextSize(12.0f);
                this.A0H.setEllipsize(TextUtils.TruncateAt.END);
            }
            boolean z = false;
            if (this.A06.C9a() != null && ((SystemWebView) this.A06.C9a()).A04.getCertificate() != null) {
                z = true;
            }
            this.A0G.setVisibility(0);
            ImageView imageView = this.A0G;
            int i = R.drawable.instagram_error_pano_outline_24;
            if (z) {
                i = R.drawable.instagram_lock_pano_filled_24;
            }
            imageView.setImageResource(i);
            this.A0E.setOnClickListener(new ViewOnClickListenerC63502SoV(0, this, z));
            if (this.A0G.getDrawable() == null) {
                return;
            }
            this.A0G.getDrawable().clearColorFilter();
            return;
        }
        this.A0E.setVisibility(8);
    }

    @Override // X.InterfaceC71996XEk
    public final void DxY(String str) {
        TextView textView;
        int i;
        if (this.A05.C9a().A0b) {
            textView = this.A03;
            i = 2131976201;
        } else {
            String str2 = ((BrowserLiteFragment) this.A06).A0l;
            if (this.A0D) {
                String string = getResources().getString(2131963710);
                this.A03.setText(string);
                this.A03.setTextSize(12.0f);
                this.A0B = string;
            } else if (!TextUtils.isEmpty(str2)) {
                if (!str2.equals(this.A0B)) {
                    this.A03.setText(str2);
                    this.A0B = str2;
                }
            } else {
                textView = this.A03;
                i = 2131963711;
            }
            setChromeSubsection(str);
        }
        textView.setText(i);
        setChromeSubsection(str);
    }

    @Override // X.InterfaceC71996XEk
    public void setControllers(InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        this.A05 = interfaceC172717mh;
        this.A06 = interfaceC172727mi;
    }

    @Override // X.InterfaceC71996XEk
    public void setIntent(Intent intent) {
        String A00;
        this.A00 = intent;
        Bundle bundleExtra = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        this.A01 = bundleExtra;
        if (bundleExtra == null) {
            A00 = "";
        } else {
            A00 = SVS.A00(new C58877QEn(bundleExtra));
        }
        this.A0A = A00;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.A07 = AbstractC31171DnF.A0G(extras);
        }
        UserSession userSession = this.A07;
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            this.A0D = C18U.A06(c06090Tz, userSession, 36316826115773107L);
            UserSession userSession2 = this.A07;
            C14360o3.A0B(userSession2, 0);
            this.A0J = C18U.A06(c06090Tz, userSession2, 36324054546198384L);
        }
    }

    @Override // X.InterfaceC71996XEk
    public void setProgress(int i) {
        this.A0I.setProgress(i);
        BrowserLiteProgressBar browserLiteProgressBar = this.A0I;
        int i2 = 0;
        if (i == 100) {
            i2 = 8;
        }
        browserLiteProgressBar.setVisibility(i2);
    }

    @Override // X.InterfaceC71996XEk
    public void setProgressBarVisibility(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A0I;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setVisibility(i);
        }
    }

    private void setupTooltip(String str) {
        this.A02.postDelayed(new RunnableC71407WtV(this, getResources().getString(2131966352, str)), 500L);
    }

    @Override // X.InterfaceC71996XEk
    public final void CNz() {
        View view;
        ArrayList parcelableArrayListExtra;
        Bundle bundle;
        C38321qM c38321qM;
        String B8y;
        User user;
        UserSession userSession;
        Bundle bundle2;
        InterfaceC38371qR A00;
        FragmentActivity activity;
        UserSession userSession2;
        Context context = getContext();
        AbstractC31172DnG.A1B(context, this, AbstractC53242c7.A0H(context, R.attr.iabChromeBackgroundColor));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Resources resources = getResources();
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        boolean z = this.A0J;
        LayoutInflater from = LayoutInflater.from(context);
        int i = R.layout.ig_browser_chrome;
        if (z) {
            i = R.layout.ig_browser_chrome_nav_optimization_prominent_lock;
        }
        from.inflate(i, this);
        this.A0F = findViewById(R.id.ig_browser_text);
        this.A03 = AbstractC166987dD.A0e(this, R.id.ig_browser_text_title);
        this.A0H = AbstractC166987dD.A0e(this, R.id.ig_browser_text_subtitle);
        this.A0G = AbstractC31171DnF.A08(this, R.id.ig_secure_connection_icon);
        this.A0E = findViewById(R.id.ig_chrome_subsection);
        ImageView A0I = AbstractC31173DnH.A0I(this, R.id.ig_browser_close_button);
        AbstractC31172DnG.A1E(resources, A0I, R.string.res_0x7f13000b_name_removed);
        A0I.setClickable(true);
        AbstractC58318PtA.A1D(context.getResources(), A0I, R.drawable.browser_close_button);
        A0I.setOnClickListener(new ViewOnClickListenerC63498SoD(this));
        Intent intent = this.A00;
        Bundle bundle3 = this.A01;
        if (intent != null && bundle3 != null && intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_LINK_HISTORY_HEADER_ICON_ENABLED", false) && bundle3.getBoolean("Tracking.ENABLED")) {
            ImageView A0I2 = AbstractC31173DnH.A0I(this, R.id.ig_browser_link_history_button);
            Bundle bundle4 = this.A01;
            C14360o3.A0B(A0I2, 0);
            A0I2.setVisibility(0);
            AbstractC166997dE.A19(context, A0I2, R.drawable.instagram_clock_dotted_pano_outline_24);
            C0fQ.A00(new ViewOnClickListenerC63501SoU(bundle4, 1), A0I2);
        }
        Intent intent2 = this.A00;
        if (intent2 != null && (parcelableArrayListExtra = intent2.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS")) != null && !parcelableArrayListExtra.isEmpty()) {
            ImageView A0I3 = AbstractC31173DnH.A0I(this, R.id.ig_browser_menu_button);
            this.A02 = A0I3;
            A0I3.setVisibility(0);
            this.A02.setContentDescription(context.getString(R.string.res_0x7f130064_name_removed));
            AbstractC58318PtA.A1D(context.getResources(), this.A02, R.drawable.browser_more_button);
            this.A02.setOnClickListener(new ViewOnClickListenerC63509Soc(2, parcelableArrayListExtra, this));
            InterfaceC172717mh interfaceC172717mh = this.A05;
            if (interfaceC172717mh != null && (activity = interfaceC172717mh.getActivity()) != null && (userSession2 = this.A07) != null) {
                C7JA.A00(activity, this.A02, userSession2, "IAB MCs", new X23(this), new C64834TVz(0));
            }
            if (this.A00.getBooleanExtra("BrowserLiteIntent.InstagramExtras.ORGANIC_IAB_MESSAGE_EXT_IS_ENABLED", false) && this.A07 != null && (bundle = this.A01) != null) {
                User A02 = AnonymousClass189.A00(this.A07).A02(bundle.getString("TrackingInfo.ARG_USER_ID", ""));
                String str = this.A0A;
                if (str != null && (userSession = this.A07) != null && (bundle2 = this.A01) != null && (A00 = AbstractC151266rU.A00(userSession, bundle2.getString(AbstractC111324zv.A00(4478)), str)) != null) {
                    C38321qM BQN = A00.BQN();
                    this.A08 = BQN;
                    this.A09 = BQN.A2E(this.A07);
                }
                C38321qM c38321qM2 = this.A08;
                if (c38321qM2 != null && !c38321qM2.CdW() && !this.A08.A5D() && (user = this.A09) != null) {
                    B8y = user.B8y();
                } else if (A02 != null && (((c38321qM = this.A08) == null || (!c38321qM.CdW() && !this.A08.A5D())) && A02.getId() != this.A07.userId)) {
                    B8y = A02.B8y();
                }
                if (B8y != "") {
                    setupTooltip(B8y);
                }
            }
        }
        if (this.A0D && (view = this.A0F) != null) {
            view.setPaddingRelative(0, 0, (int) resources.getDimension(R.dimen.account_discovery_bottom_gap), 0);
        }
        View findViewById = getRootView().findViewById(android.R.id.statusBarBackground);
        View findViewById2 = getRootView().findViewById(R.id.browser_container);
        View findViewById3 = getRootView().findViewById(R.id.layout_container_right);
        if (findViewById != null && findViewById2 != null && findViewById3 != null && findViewById3.getTop() < findViewById.getBottom()) {
            findViewById2.setPadding(0, findViewById.getHeight(), 0, 0);
            AbstractC31174DnI.A1C(findViewById2, -1);
        }
    }

    @Override // X.InterfaceC71996XEk
    public final void CO4() {
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) requireViewById(R.id.ig_browser_chrome_progress_bar);
        this.A0I = browserLiteProgressBar;
        browserLiteProgressBar.setVisibility(0);
        this.A0I.setProgress(0);
    }

    @Override // X.InterfaceC71996XEk
    public int getHeightPx() {
        int height = getHeight();
        if (height <= 0) {
            return (int) getResources().getDimension(R.dimen.abc_alert_dialog_button_dimen);
        }
        return height;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0K;
    }

    public void setShouldInterceptTouchEvents(boolean z) {
        this.A0K = z;
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DefaultBrowserLiteChrome(Context context) {
        super(context, null);
    }
}
