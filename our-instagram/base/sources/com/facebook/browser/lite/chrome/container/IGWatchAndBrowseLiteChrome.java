package com.facebook.browser.lite.chrome.container;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.AbstractC58318PtA;
import X.AbstractC61710RsR;
import X.BCL;
import X.C14360o3;
import X.C1H6;
import X.C23016ACq;
import X.C63193Sev;
import X.C63305ShB;
import X.C63937SwC;
import X.InterfaceC172717mh;
import X.InterfaceC172727mi;
import X.InterfaceC65199Tfh;
import X.InterfaceC71996XEk;
import X.Q5I;
import X.QF6;
import X.RunnableC64546TJi;
import X.TND;
import X.ViewOnClickListenerC63499SoE;
import X.ViewOnClickListenerC63500SoF;
import X.ViewOnClickListenerC63501SoU;
import X.ViewOnClickListenerC63502SoV;
import X.ViewOnClickListenerC63508Sob;
import X.ViewOnClickListenerC63509Soc;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.iabeventlogging.model.IABEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class IGWatchAndBrowseLiteChrome extends RelativeLayout implements InterfaceC71996XEk {
    public Intent A00;
    public Bundle A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public TextView A0A;
    public Q5I A0B;
    public Q5I A0C;
    public InterfaceC172717mh A0D;
    public InterfaceC172727mi A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public ImageView A0I;
    public ImageView A0J;
    public LinearLayout A0K;
    public LinearLayout A0L;
    public LinearLayout A0M;
    public TextView A0N;
    public BrowserLiteProgressBar A0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGWatchAndBrowseLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC166987dD.A0b();
    }

    @Override // X.InterfaceC71996XEk
    public final void AJL(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        if (z) {
            if (i != 0) {
                if (i == 8) {
                    getLayoutParams().height = 0;
                    LinearLayout linearLayout = this.A08;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                }
            } else {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                Resources resources = getResources();
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                if (A04() && (textView = this.A0A) != null) {
                    textView.setText(resources.getString(2131963710));
                }
            }
            LinearLayout linearLayout2 = this.A08;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.A0M;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(i);
            }
            A00(i, i, i3);
            return;
        }
        getLayoutParams().height = i != 8 ? getPartialSheetHeight() : 0;
        LinearLayout linearLayout4 = this.A0M;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
        LinearLayout linearLayout5 = this.A08;
        if (linearLayout5 != null) {
            linearLayout5.setVisibility(i);
        }
        A00(8, i2, i3);
    }

    @Override // X.InterfaceC71996XEk
    public final void Ekr(int i) {
        Resources resources;
        int i2;
        TextView textView;
        if (i != -8 && i != -1) {
            resources = getResources();
            i2 = 2131964524;
        } else {
            resources = getResources();
            i2 = 2131964525;
        }
        String string = resources.getString(i2);
        this.A0F = string;
        TextView textView2 = this.A0A;
        if (textView2 != null) {
            textView2.setText(string);
        }
        if (A05() && (textView = this.A09) != null) {
            textView.setText(this.A0F);
        }
        AbstractC167007dF.A0x(this.A0K);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r4.A01.getBoolean("Tracking.ENABLED") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(int r5, int r6, int r7) {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.A02
            if (r0 == 0) goto L7
            r0.setVisibility(r6)
        L7:
            android.widget.ImageView r0 = r4.A05
            if (r0 == 0) goto Le
            r0.setVisibility(r7)
        Le:
            android.widget.ImageView r0 = r4.A04
            if (r0 == 0) goto L15
            r0.setVisibility(r5)
        L15:
            android.widget.ImageView r3 = r4.A03
            if (r3 == 0) goto L38
            if (r5 != 0) goto L33
            android.content.Intent r2 = r4.A00
            r1 = 0
            if (r2 == 0) goto L33
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_LINK_HISTORY_HEADER_ICON_ENABLED"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L33
            android.os.Bundle r1 = r4.A01
            java.lang.String r0 = "Tracking.ENABLED"
            boolean r1 = r1.getBoolean(r0)
            r0 = 0
            if (r1 != 0) goto L35
        L33:
            r0 = 8
        L35:
            r3.setVisibility(r0)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.A00(int, int, int):void");
    }

    public static final void A02(IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        QF6 C9a;
        String A05;
        ArrayList subItems;
        String str;
        InterfaceC172727mi interfaceC172727mi = iGWatchAndBrowseLiteChrome.A0E;
        if (interfaceC172727mi != null && (C9a = interfaceC172727mi.C9a()) != null) {
            if (((!C9a.A0b || (str = C9a.A0M) == null || str.length() == 0) && ((A05 = C9a.A05()) == null || A05.length() == 0)) || (subItems = iGWatchAndBrowseLiteChrome.getSubItems()) == null || subItems.isEmpty()) {
                return;
            }
            Q5I A00 = Q5I.A00(iGWatchAndBrowseLiteChrome.getContext(), new C63937SwC(iGWatchAndBrowseLiteChrome), subItems, false);
            iGWatchAndBrowseLiteChrome.A0B = A00;
            iGWatchAndBrowseLiteChrome.A01(iGWatchAndBrowseLiteChrome.A06, A00);
        }
    }

    public static final void A03(IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        IABEvent iABEvent;
        QF6 C9a;
        String A05;
        ArrayList subItems;
        String str;
        InterfaceC172717mh interfaceC172717mh = iGWatchAndBrowseLiteChrome.A0D;
        if (interfaceC172717mh != null) {
            C63305ShB A00 = C63305ShB.A00();
            BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) interfaceC172717mh;
            C23016ACq c23016ACq = browserLiteFragment.A0e;
            if (c23016ACq != null) {
                iABEvent = c23016ACq.A00();
            } else {
                iABEvent = null;
            }
            A00.A06(iGWatchAndBrowseLiteChrome.A01, iABEvent, browserLiteFragment.A0f);
            InterfaceC172727mi interfaceC172727mi = iGWatchAndBrowseLiteChrome.A0E;
            if (interfaceC172727mi != null && (C9a = interfaceC172727mi.C9a()) != null) {
                if (((!C9a.A0b || (str = C9a.A0M) == null || str.length() == 0) && ((A05 = C9a.A05()) == null || A05.length() == 0)) || (subItems = iGWatchAndBrowseLiteChrome.getSubItems()) == null || subItems.isEmpty()) {
                    return;
                }
                Q5I A002 = Q5I.A00(iGWatchAndBrowseLiteChrome.getContext(), new C63937SwC(iGWatchAndBrowseLiteChrome), subItems, false);
                iGWatchAndBrowseLiteChrome.A0C = A002;
                iGWatchAndBrowseLiteChrome.A01(iGWatchAndBrowseLiteChrome.A04, A002);
            }
        }
    }

    private final boolean A04() {
        Intent intent = this.A00;
        if (intent == null) {
            return true;
        }
        return intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_SHOW_INSTAGRAM_AND_URL_ON_PARTIAL_SHEET", true);
    }

    private final boolean A05() {
        Intent intent = this.A00;
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_WEB_TITLE_ON_PARTIAL_SHEET_ENABLED", false);
    }

    private final ArrayList getSubItems() {
        ArrayList parcelableArrayListExtra;
        InterfaceC172717mh interfaceC172717mh;
        InterfaceC172727mi interfaceC172727mi;
        Intent intent = this.A00;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS")) == null || parcelableArrayListExtra.isEmpty() || (interfaceC172717mh = this.A0D) == null || (interfaceC172727mi = this.A0E) == null) {
            return null;
        }
        C63193Sev c63193Sev = new C63193Sev();
        AbstractC61710RsR.A00(getContext(), c63193Sev, interfaceC172717mh, interfaceC172727mi, parcelableArrayListExtra, AbstractC166987dD.A1H());
        return c63193Sev.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
    
        if (((com.facebook.browser.lite.webview.SystemWebView) r0).A04.getCertificate() == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setChromeSubsection(java.lang.String r4) {
        /*
            r3 = this;
            X.7mi r0 = r3.A0E
            if (r0 == 0) goto Le6
            X.QF6 r2 = r0.C9a()
        L8:
            r1 = 0
            if (r2 == 0) goto L54
            boolean r0 = r2.A0b
            if (r0 == 0) goto L54
            java.lang.String r2 = r2.A0M
            if (r2 == 0) goto L54
            int r0 = r2.length()
            if (r0 == 0) goto L54
            android.widget.LinearLayout r0 = r3.A0K
            if (r0 == 0) goto L20
            r0.setVisibility(r1)
        L20:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L2d
            android.widget.LinearLayout r0 = r3.A0L
            if (r0 == 0) goto L2d
            r0.setVisibility(r1)
        L2d:
            android.widget.TextView r1 = r3.A0N
            if (r1 == 0) goto L38
            java.lang.String r0 = X.AbstractC61711RsS.A00(r2)
            r1.setText(r0)
        L38:
            boolean r0 = r3.A05()
            if (r0 != 0) goto L49
            android.widget.TextView r1 = r3.A09
            if (r1 == 0) goto L49
            java.lang.String r0 = X.AbstractC61711RsS.A00(r2)
            r1.setText(r0)
        L49:
            android.widget.ImageView r0 = r3.A0J
            r3.setupUnsafeIcon(r0)
            android.widget.ImageView r0 = r3.A0I
            r3.setupUnsafeIcon(r0)
        L53:
            return
        L54:
            if (r4 == 0) goto Lcf
            int r0 = r4.length()
            if (r0 == 0) goto Lcf
            android.widget.LinearLayout r0 = r3.A0K
            if (r0 == 0) goto L63
            r0.setVisibility(r1)
        L63:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L70
            android.widget.LinearLayout r0 = r3.A0L
            if (r0 == 0) goto L70
            r0.setVisibility(r1)
        L70:
            java.lang.String r0 = r3.A0G
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La4
            android.net.Uri r2 = X.AbstractC58319PtB.A09(r4)
            if (r2 == 0) goto La2
            android.widget.TextView r1 = r3.A0N
            if (r1 == 0) goto L8d
            java.lang.String r0 = X.AbstractC166987dD.A19(r2)
            java.lang.String r0 = X.AbstractC61711RsS.A00(r0)
            r1.setText(r0)
        L8d:
            boolean r0 = r3.A05()
            if (r0 != 0) goto La2
            android.widget.TextView r1 = r3.A09
            if (r1 == 0) goto La2
            java.lang.String r0 = X.AbstractC166987dD.A19(r2)
            java.lang.String r0 = X.AbstractC61711RsS.A00(r0)
            r1.setText(r0)
        La2:
            r3.A0G = r4
        La4:
            X.7mi r0 = r3.A0E
            if (r0 == 0) goto Lb9
            X.QF6 r0 = r0.C9a()
            if (r0 == 0) goto Lb9
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.R7V r0 = r0.A04
            android.net.http.SslCertificate r0 = r0.getCertificate()
            r2 = 1
            if (r0 != 0) goto Lba
        Lb9:
            r2 = 0
        Lba:
            android.widget.ImageView r1 = r3.A0J
            android.widget.LinearLayout r0 = r3.A0K
            r3.setupSecureIcon(r1, r2, r0)
            boolean r0 = r3.A04()
            if (r0 == 0) goto L53
            android.widget.ImageView r1 = r3.A0I
            android.widget.LinearLayout r0 = r3.A0L
            r3.setupSecureIcon(r1, r2, r0)
            return
        Lcf:
            android.widget.LinearLayout r0 = r3.A0K
            r1 = 8
            if (r0 == 0) goto Ld8
            r0.setVisibility(r1)
        Ld8:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L53
            android.widget.LinearLayout r0 = r3.A0L
            if (r0 == 0) goto L53
            r0.setVisibility(r1)
            return
        Le6:
            r2 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome.setChromeSubsection(java.lang.String):void");
    }

    private final void setPrimaryIconColorTintList(ImageView imageView) {
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(getPrimaryIconColor())));
        }
    }

    private final void setSecondaryIconColorTintList(ImageView imageView) {
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(getSecondaryIconColor())));
        }
    }

    private final void setupSecureIcon(ImageView imageView, boolean z, View view) {
        Drawable drawable;
        if (imageView != null) {
            imageView.setVisibility(0);
            int i = R.drawable.instagram_error_pano_outline_24;
            if (z) {
                i = R.drawable.instagram_lock_pano_filled_24;
            }
            imageView.setImageResource(i);
        }
        setSecondaryIconColorTintList(imageView);
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.clearColorFilter();
        }
        if (view != null) {
            view.setOnClickListener(new ViewOnClickListenerC63502SoV(1, this, z));
        }
        if (imageView != null) {
            Resources resources = getResources();
            int i2 = 2131968696;
            if (z) {
                i2 = 2131973147;
            }
            AbstractC31172DnG.A1E(resources, imageView, i2);
        }
    }

    private final void setupUnsafeIcon(ImageView imageView) {
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.instagram_warning_pano_filled_24);
            imageView.setColorFilter(getContext().getColor(R.color.igds_error_or_destructive));
        }
    }

    @Override // X.InterfaceC71996XEk
    public final void Coq() {
        if (this.A0H) {
            A03(this);
            this.A0H = false;
        }
    }

    @Override // X.InterfaceC71996XEk
    public void setControllers(InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        this.A0D = interfaceC172717mh;
        this.A0E = interfaceC172727mi;
    }

    @Override // X.InterfaceC71996XEk
    public void setIntent(Intent intent) {
        if (intent != null) {
            this.A00 = intent;
            Bundle bundleExtra = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
            if (bundleExtra == null) {
                bundleExtra = this.A01;
            }
            this.A01 = bundleExtra;
        }
    }

    @Override // X.InterfaceC71996XEk
    public void setProgress(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A0O;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setProgress(i);
        }
        BrowserLiteProgressBar browserLiteProgressBar2 = this.A0O;
        if (browserLiteProgressBar2 != null) {
            int i2 = 0;
            if (i == 100) {
                i2 = 8;
            }
            browserLiteProgressBar2.setVisibility(i2);
        }
    }

    @Override // X.InterfaceC71996XEk
    public void setProgressBarVisibility(int i) {
        BrowserLiteProgressBar browserLiteProgressBar = this.A0O;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setVisibility(i);
        }
    }

    private final void A01(ImageView imageView, Q5I q5i) {
        q5i.A01(AbstractC53242c7.A0H(getContext(), R.attr.iabMenuBackgroundRes));
        q5i.setAnchorView(imageView);
        q5i.show();
        ListView listView = q5i.getListView();
        if (listView != null) {
            listView.setOverScrollMode(2);
            listView.setVerticalScrollBarEnabled(false);
            listView.setDivider(null);
        }
    }

    private final int getPartialSheetHeight() {
        Resources resources;
        int i;
        if (A05()) {
            resources = getResources();
            i = R.dimen.abc_star_medium;
        } else {
            boolean A04 = A04();
            resources = getResources();
            i = R.dimen.abc_dialog_padding_material;
            if (A04) {
                i = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
            }
        }
        return resources.getDimensionPixelSize(i);
    }

    private final int getPrimaryIconColor() {
        if (!C1H6.A03()) {
            return R.color.black;
        }
        return R.color.grey_0;
    }

    private final int getSecondaryIconColor() {
        if (!C1H6.A03()) {
            return R.color.grey_6;
        }
        return R.color.grey_4;
    }

    @Override // X.InterfaceC71996XEk
    public final void CNz() {
        InterfaceC172717mh interfaceC172717mh;
        ImageView imageView;
        View.OnClickListener viewOnClickListenerC63500SoF;
        Typeface typeface;
        ViewGroup.LayoutParams layoutParams;
        Context context = getContext();
        AbstractC31172DnG.A1B(context, this, AbstractC53242c7.A0H(context, R.attr.iabChromeBackgroundColor));
        getLayoutParams().height = getPartialSheetHeight();
        LayoutInflater.from(context).inflate(R.layout.ig_watch_and_browse_browser_chrome, this);
        this.A07 = (LinearLayout) findViewById(R.id.ig_browser_partial_header);
        this.A08 = (LinearLayout) findViewById(R.id.ig_browser_partial_text);
        this.A0L = (LinearLayout) findViewById(R.id.ig_browser_partial_subtitle);
        this.A09 = AbstractC166987dD.A0e(this, R.id.ig_browser_partial_text_title);
        this.A0I = AbstractC31171DnF.A08(this, R.id.ig_browser_partial_secure_connection_icon);
        this.A0M = (LinearLayout) findViewById(R.id.ig_browser_text);
        this.A0A = AbstractC166987dD.A0e(this, R.id.ig_browser_text_title);
        this.A0N = AbstractC166987dD.A0e(this, R.id.ig_browser_text_subtitle);
        this.A0J = AbstractC31171DnF.A08(this, R.id.ig_secure_connection_icon);
        this.A0K = (LinearLayout) findViewById(R.id.ig_chrome_subsection);
        this.A02 = AbstractC31171DnF.A08(this, R.id.ig_browser_close_button);
        this.A05 = AbstractC31171DnF.A08(this, R.id.ig_browser_minimize_button);
        this.A03 = AbstractC31171DnF.A08(this, R.id.ig_browser_link_history_button);
        this.A04 = AbstractC31171DnF.A08(this, R.id.ig_browser_menu_button);
        this.A06 = AbstractC31171DnF.A08(this, R.id.ig_partial_title_menu_button);
        ImageView imageView2 = this.A04;
        if (imageView2 != null) {
            AbstractC31172DnG.A1E(getResources(), imageView2, R.string.res_0x7f130064_name_removed);
        }
        ImageView imageView3 = this.A04;
        if (imageView3 != null) {
            imageView3.setOnClickListener(ViewOnClickListenerC63508Sob.A00(this, 3));
        }
        setPrimaryIconColorTintList(this.A04);
        Intent intent = this.A00;
        if ((intent == null || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOW_PARTIAL_MENU_ITEM", true)) && (interfaceC172717mh = this.A0D) != null) {
            if (A04() && (imageView = this.A06) != null) {
                AbstractC166997dE.A19(context, imageView, R.drawable.instagram_more_vertical_pano_outline_24);
                setPrimaryIconColorTintList(imageView);
            }
            ImageView imageView4 = this.A06;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.A06;
            if (imageView5 != null) {
                AbstractC31172DnG.A1E(getResources(), imageView5, R.string.res_0x7f130064_name_removed);
            }
            ImageView imageView6 = this.A06;
            if (imageView6 != null) {
                imageView6.setOnClickListener(new ViewOnClickListenerC63509Soc(3, this, interfaceC172717mh));
            }
            LinearLayout linearLayout = this.A07;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(ViewOnClickListenerC63508Sob.A00(interfaceC172717mh, 2));
            }
            ImageView imageView7 = this.A06;
            if (imageView7 != null) {
                imageView7.post(new RunnableC64546TJi(this));
            }
        }
        if (A05()) {
            AbstractC43592JPx.A1I(this, R.id.ig_browser_partial_text_dot_separator, 8);
            AbstractC43592JPx.A1I(this, R.id.ig_browser_partial_text_swipe_up, 8);
            LinearLayout linearLayout2 = this.A08;
            if (linearLayout2 != null && (layoutParams = linearLayout2.getLayoutParams()) != null) {
                layoutParams.height = getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
            }
            TextView textView = this.A09;
            if (textView != null) {
                TextView textView2 = this.A0A;
                if (textView2 != null) {
                    typeface = textView2.getTypeface();
                } else {
                    typeface = null;
                }
                textView.setTypeface(typeface);
                textView.setTextSize(0, getResources().getDimension(R.dimen.abc_text_size_menu_header_material));
                textView.setPadding(textView.getPaddingEnd(), 0, textView.getPaddingEnd(), 0);
                textView.setText(2131963711);
            }
            setPrimaryIconColorTintList(this.A06);
        } else if (A04()) {
            AbstractC43592JPx.A1I(this, R.id.ig_browser_partial_text_dot_separator, 8);
            AbstractC43592JPx.A1I(this, R.id.ig_browser_partial_text_swipe_up, 8);
            AbstractC43592JPx.A1I(this, R.id.ig_browser_partial_title_instagram_text, 0);
        }
        LinearLayout linearLayout3 = this.A08;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        LinearLayout linearLayout4 = this.A07;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(0);
        }
        ImageView imageView8 = this.A02;
        if (imageView8 != null) {
            AbstractC31172DnG.A1E(getResources(), imageView8, R.string.res_0x7f13000b_name_removed);
        }
        ImageView imageView9 = this.A02;
        if (imageView9 != null) {
            imageView9.setClickable(true);
        }
        ImageView imageView10 = this.A02;
        if (imageView10 != null) {
            AbstractC58318PtA.A1D(context.getResources(), imageView10, R.drawable.browser_close_button);
        }
        setPrimaryIconColorTintList(this.A02);
        Intent intent2 = this.A00;
        boolean z = false;
        if (intent2 != null) {
            z = intent2.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_KEEP_BROWSER_OPEN_ON_BACK_PRESSED", false);
        }
        ImageView imageView11 = this.A02;
        if (z) {
            if (imageView11 != null) {
                viewOnClickListenerC63500SoF = new ViewOnClickListenerC63499SoE(this);
                imageView11.setOnClickListener(viewOnClickListenerC63500SoF);
            }
        } else if (imageView11 != null) {
            viewOnClickListenerC63500SoF = new ViewOnClickListenerC63500SoF(this);
            imageView11.setOnClickListener(viewOnClickListenerC63500SoF);
        }
        ImageView imageView12 = this.A05;
        if (imageView12 != null) {
            AbstractC31172DnG.A1E(getResources(), imageView12, R.string.res_0x7f130011_name_removed);
        }
        ImageView imageView13 = this.A05;
        if (imageView13 != null) {
            imageView13.setClickable(true);
        }
        setPrimaryIconColorTintList(this.A05);
        ImageView imageView14 = this.A05;
        if (imageView14 != null) {
            imageView14.setOnClickListener(new ViewOnClickListenerC63499SoE(this));
        }
        ImageView imageView15 = this.A03;
        if (imageView15 != null) {
            AbstractC166997dE.A19(context, imageView15, R.drawable.instagram_clock_dotted_pano_outline_24);
        }
        setPrimaryIconColorTintList(this.A03);
        ImageView imageView16 = this.A03;
        if (imageView16 != null) {
            imageView16.setOnClickListener(new ViewOnClickListenerC63501SoU(this, 0));
        }
        Intent intent3 = this.A00;
        if (intent3 != null && intent3.getBooleanExtra("WATCH_AND_BROWSE_HIDE_BROWSER_HEADER", false)) {
            getLayoutParams().height = 0;
            AbstractC167007dF.A0x(this.A08);
        }
    }

    @Override // X.InterfaceC71996XEk
    public final void CO4() {
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) requireViewById(R.id.ig_browser_chrome_progress_bar);
        this.A0O = browserLiteProgressBar;
        if (browserLiteProgressBar != null) {
            browserLiteProgressBar.setVisibility(0);
        }
        BrowserLiteProgressBar browserLiteProgressBar2 = this.A0O;
        if (browserLiteProgressBar2 != null) {
            browserLiteProgressBar2.setProgress(0);
        }
    }

    @Override // X.InterfaceC71996XEk
    public final void DxY(String str) {
        TextView textView;
        int i;
        String str2;
        TextView textView2;
        QF6 C9a;
        if (!A04()) {
            InterfaceC172717mh interfaceC172717mh = this.A0D;
            if (interfaceC172717mh != null && (C9a = interfaceC172717mh.C9a()) != null && C9a.A0b) {
                TextView textView3 = this.A0A;
                if (textView3 != null) {
                    textView3.setText(2131976201);
                }
                if (A05() && (textView = this.A09) != null) {
                    i = 2131976201;
                    textView.setText(i);
                }
            } else {
                InterfaceC172727mi interfaceC172727mi = this.A0E;
                if (interfaceC172727mi != null && (str2 = ((BrowserLiteFragment) interfaceC172727mi).A0l) != null && str2.length() != 0) {
                    if (!str2.equals(this.A0F)) {
                        TextView textView4 = this.A0A;
                        if (textView4 != null) {
                            textView4.setText(str2);
                        }
                        this.A0F = str2;
                        if (A05() && (textView2 = this.A09) != null) {
                            textView2.setText(str2);
                        }
                    }
                } else {
                    TextView textView5 = this.A0A;
                    if (textView5 != null) {
                        textView5.setText(2131963711);
                    }
                    if (A05() && (textView = this.A09) != null) {
                        i = 2131963711;
                        textView.setText(i);
                    }
                }
            }
        }
        setChromeSubsection(str);
    }

    @Override // X.InterfaceC71996XEk
    public final boolean Ell() {
        ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById(R.id.title_text_switcher);
        if (viewSwitcher != null) {
            Context context = getContext();
            viewSwitcher.setInAnimation(context, R.anim.bottom_in);
            viewSwitcher.setOutAnimation(context, R.anim.top_out);
            viewSwitcher.showNext();
        }
        return AbstractC167007dF.A0J().postDelayed(new TND(viewSwitcher, this), 3000L);
    }

    @Override // X.InterfaceC71996XEk
    public int getHeightPx() {
        int height = getHeight();
        if (height <= 0) {
            return (int) getResources().getDimension(R.dimen.abc_alert_dialog_button_dimen);
        }
        return height;
    }
}
