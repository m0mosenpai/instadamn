package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.android.webview.chromium.membrane.HeliumWebViewExtensions;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABIPAMatchKeyEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class QF6 extends AbstractC61598RqN implements InterfaceC25155BAz {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public Intent A0A;
    public A4R A0B;
    public C62413SAn A0C;
    public C62603SIh A0D;
    public BrowserLiteWebChromeClient A0E;
    public SDP A0F;
    public SIC A0G;
    public SHJ A0H;
    public InterfaceC25155BAz A0I;
    public Boolean A0J;
    public Boolean A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public AbstractC62758SPp A0d;

    public final BrowserLiteWebChromeClient A03() {
        BrowserLiteWebChromeClient browserLiteWebChromeClient;
        C58712Q4d c58712Q4d = ((SystemWebView) this).A02;
        if (c58712Q4d != null && (browserLiteWebChromeClient = c58712Q4d.A00) != null) {
            return browserLiteWebChromeClient;
        }
        return null;
    }

    public final Q4Z A04() {
        SystemWebView systemWebView = (SystemWebView) this;
        Q4Z q4z = new Q4Z();
        boolean z = systemWebView.A0N;
        R7V r7v = systemWebView.A04;
        if (z) {
            R7V.A01(q4z, r7v);
            return q4z;
        }
        r7v.onProvideAutofillVirtualStructure(q4z, 0);
        return q4z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Q4v, android.webkit.WebViewClient] */
    public final void A0E(AbstractC62758SPp abstractC62758SPp) {
        SystemWebView systemWebView = (SystemWebView) this;
        ?? webViewClient = new WebViewClient();
        webViewClient.A00 = abstractC62758SPp;
        systemWebView.A03 = webViewClient;
        systemWebView.A04.setWebViewClient(webViewClient);
        HeliumWebViewExtensions heliumWebViewExtensions = systemWebView.A01;
        if (heliumWebViewExtensions != null) {
            heliumWebViewExtensions.setShareDelegate(systemWebView.A03);
        }
        this.A0d = abstractC62758SPp;
    }

    public final void A0G(String str) {
        A0F(null, str, true);
    }

    public final boolean A0H() {
        if (((SystemWebView) this).A04.canGoBack()) {
            TIK A01 = A01();
            if (A01.A01.size() >= 2 && A01.A00 == 1) {
                String str = A01.A00(0).A03;
                String str2 = A01.A00(1).A03;
                if (ReactWebViewManager.BLANK_URL.equals(str) || TextUtils.equals(str, str2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void A00(QF6 qf6) {
        InputStreamReader A0j;
        String A00;
        SIC sic = qf6.A0G;
        if (sic.A04 && sic.A03 && !sic.A02) {
            if (sic.A00 != Integer.MIN_VALUE || sic.A01 != Integer.MIN_VALUE) {
                Context context = ((SystemWebView) qf6).A04.getContext();
                C14360o3.A0B(context, 1);
                WeakReference weakReference = AbstractC61531RpB.A00;
                try {
                    if (weakReference != null) {
                        A00 = (String) weakReference.get();
                        if (A00 == null) {
                            AbstractC61531RpB.A00 = null;
                        }
                        qf6.A0G(A00);
                        sic.A02 = true;
                        return;
                    }
                    A00 = AbstractC38581qm.A00(A0j);
                    A0j.close();
                    if (A00.length() < 2048) {
                        AbstractC61531RpB.A00 = AbstractC25225BEi.A16(A00);
                    }
                    qf6.A0G(A00);
                    sic.A02 = true;
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(A0j, th);
                        throw th2;
                    }
                }
                A0j = AbstractC58320PtC.A0j(context.getResources(), R.raw.iabjs_override_outer_height_and_screen_top);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A05() {
        /*
            r4 = this;
            X.SAn r0 = r4.A0C
            if (r0 == 0) goto L29
            com.facebook.browser.lite.BrowserLiteFragment r0 = r0.A00
            java.util.List r0 = r0.A0p
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            X.Tq2 r0 = (X.InterfaceC65639Tq2) r0
            java.lang.String r1 = r0.getUrl()
            if (r1 == 0) goto Lc
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc
        L24:
            if (r1 == 0) goto L29
        L26:
            return r1
        L27:
            r1 = 0
            goto L24
        L29:
            r1 = 0
            X.TIK r3 = r4.A01()     // Catch: java.lang.Throwable -> L51
            java.util.List r2 = r3.A01     // Catch: java.lang.Throwable -> L51
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L37
            goto L3e
        L37:
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L51
            X.TIT r0 = r3.A00(r0)     // Catch: java.lang.Throwable -> L51
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L51
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L49
            r0 = 0
            goto L4f
        L49:
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L51
            X.TIT r0 = r3.A00(r0)     // Catch: java.lang.Throwable -> L51
        L4f:
            java.lang.String r1 = r0.A03     // Catch: java.lang.Throwable -> L51
        L51:
            if (r1 == 0) goto L59
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L26
        L59:
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.R7V r0 = r0.A04
            java.lang.String r1 = r0.getUrl()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QF6.A05():java.lang.String");
    }

    public final String A06() {
        if (this.A0J.booleanValue()) {
            return "";
        }
        String str = this.A0L;
        if (str != null) {
            return str;
        }
        String A07 = A07(0);
        this.A0L = A07;
        return A07;
    }

    public final void A08() {
        C62413SAn c62413SAn = this.A0C;
        if (c62413SAn != null) {
            c62413SAn.A00.AIE(3, A05());
        }
    }

    public final void A09() {
        R7V r7v = ((SystemWebView) this).A04;
        r7v.loadUrl(ReactWebViewManager.BLANK_URL);
        r7v.setTag(null);
        r7v.clearHistory();
        r7v.removeAllViews();
        try {
            r7v.onPause();
        } catch (Exception unused) {
        }
        A02();
        this.A0Y = true;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void A0A(long j) {
        final C62603SIh c62603SIh;
        C62603SIh c62603SIh2;
        IABEvent iABLandingPageInteractiveEvent;
        long j2;
        String stringExtra;
        Bundle extras;
        if (!A0I() && this.A04 < j) {
            this.A04 = j;
            Intent intent = this.A0A;
            if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS", false)) {
                A0G("var f = function () {  var preview = document.body.getElementsByTagName('div')[0];  var width = window.innerWidth    || window.outerWidth     || document.documentElement.clientWidth     || document.body.clientWidth     || document.body.offsetWidth     || screen.width;  var ratio = width / 320.0 || 1;  var scale = 'scale(' + ratio + ',' + ratio + ')';  preview.style.transform = scale;  preview.style.webkitTransform = scale;  preview.style.position = 'relative';  preview.style.transformOrigin = 'top left';  preview.style.webkitTransformOrigin = 'top left';};f();");
                extras.putBoolean("BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS", false);
            }
            long j3 = this.A06;
            if (j3 != -1) {
                AbstractC63254SgB.A01("BrowserLiteWebView", "==DomContentLoaded: %d ms==", AbstractC58319PtB.A1Y(j - j3));
            }
        }
        if (!this.A0S && (c62603SIh2 = this.A0D) != null) {
            BrowserLiteFragment browserLiteFragment = c62603SIh2.A04;
            ACQ acq = browserLiteFragment.A1L;
            acq.A01("BLWV.onDOMContentLoaded", AbstractC61713RsU.A00(j));
            if (!browserLiteFragment.A0y) {
                browserLiteFragment.A0y = true;
                browserLiteFragment.A0j = Long.valueOf(j);
                BrowserLiteFragment.A0F(browserLiteFragment, this, j);
                C23016ACq c23016ACq = browserLiteFragment.A0e;
                String str = (String) browserLiteFragment.A0W.BHf().A02();
                if (!c23016ACq.A0p) {
                    iABLandingPageInteractiveEvent = IABEvent.A04;
                } else {
                    Parcelable.Creator creator = IABEvent.CREATOR;
                    iABLandingPageInteractiveEvent = new IABLandingPageInteractiveEvent(c23016ACq.A0Q, c23016ACq.A0Z, str, c23016ACq.A0W, c23016ACq.A07, c23016ACq.A06, c23016ACq.A0B, c23016ACq.A0m.now(), c23016ACq.A0L, c23016ACq.A0g);
                }
                browserLiteFragment.Ckl(browserLiteFragment.A09, iABLandingPageInteractiveEvent, browserLiteFragment.A0f);
                browserLiteFragment.A0Z.A01 = SystemClock.elapsedRealtime();
                C63217SfN c63217SfN = browserLiteFragment.A0K;
                long j4 = 0;
                if (c63217SfN != null && c63217SfN.A03()) {
                    if (browserLiteFragment.A0T() != null) {
                        j2 = Long.parseLong(browserLiteFragment.A0T());
                    } else {
                        j2 = 0;
                    }
                    String A0S = browserLiteFragment.A0S();
                    Intent intent2 = browserLiteFragment.A07;
                    if (intent2 == null) {
                        stringExtra = null;
                    } else {
                        stringExtra = intent2.getStringExtra("BWP_MEDIA_ID");
                    }
                    HashMap A12 = AbstractC31174DnI.A12("pageLoadSource", "NEWS_FEED");
                    A12.put("tokenSource", AbstractC61709RsQ.A00(browserLiteFragment.A0K.A03.A01));
                    A12.put("is_organic", String.valueOf(browserLiteFragment.A0K.A02));
                    A12.put("media_id", stringExtra);
                    C63305ShB.A00().A04(j2, "PAGE_LOADED", A0S, A12);
                }
                C62965SZi c62965SZi = browserLiteFragment.A0J;
                if (c62965SZi != null && c62965SZi.A01()) {
                    if (browserLiteFragment.A0T() != null) {
                        j4 = Long.parseLong(browserLiteFragment.A0T());
                    }
                    String A0S2 = browserLiteFragment.A0S();
                    HashMap A122 = AbstractC31174DnI.A12("pageLoadSource", "NEWS_FEED");
                    A122.put("tokenSource", AbstractC61706RsN.A00(browserLiteFragment.A0J.A02.A01));
                    C63305ShB.A00().A03(j4, "PAGE_LOADED", A0S2, A122);
                }
            }
            List list = browserLiteFragment.A0p;
            if (list != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("BLF.plugins.");
                A1C.append("onDomLoaded");
                A1C.append(".Start");
                acq.A00(AnonymousClass001.A0g("BLF.plugins.", "onDomLoaded", ".Start"));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC65639Tq2) it.next()).DBE(this);
                }
                acq.A00(AbstractC166997dE.A0x(".End", A1C));
            }
            this.A0S = true;
        }
        if (!this.A0U && (c62603SIh = this.A0D) != null) {
            long j5 = c62603SIh.A03;
            if (j5 > 0) {
                ACQ acq2 = c62603SIh.A04.A1L;
                acq2.A01("BLWV.onPageInteractive", AbstractC61713RsU.A00(j));
                acq2.A01("web_view_interactive_ts", AbstractC61713RsU.A00(j) - j5);
            }
            BrowserLiteFragment browserLiteFragment2 = c62603SIh.A04;
            BrowserLiteFragment.A0H(browserLiteFragment2, "BLWV.onPageInteractive");
            browserLiteFragment2.A1N.add(A05());
            if (!c62603SIh.A02) {
                c62603SIh.A02 = true;
                browserLiteFragment2.A0s = true;
            }
            if (browserLiteFragment2.A0x && browserLiteFragment2.A0d != null) {
                ((SystemWebView) this).A04.setBackgroundColor(-1);
            }
            List list2 = browserLiteFragment2.A0p;
            if (list2 != null) {
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                ACQ A0Q = AbstractC58321PtD.A0Q(browserLiteFragment2, "onPageInteractive", A1C2);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC65639Tq2) it2.next()).DXW(this, j);
                }
                A0Q.A00(AbstractC166997dE.A0x(".End", A1C2));
            }
            Bundle bundleExtra = browserLiteFragment2.A07.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
            String stringExtra2 = browserLiteFragment2.A07.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY");
            boolean booleanExtra = browserLiteFragment2.A07.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", true);
            if (!TextUtils.isEmpty(stringExtra2)) {
                if (bundleExtra == null) {
                    bundleExtra = AbstractC166987dD.A0b();
                }
                bundleExtra.putString("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY", stringExtra2);
                bundleExtra.putBoolean("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", booleanExtra);
            }
            C63305ShB c63305ShB = browserLiteFragment2.A0M;
            C63305ShB.A02(new QDg(bundleExtra, c63305ShB, A05(), browserLiteFragment2.A0P(), j), c63305ShB, false);
            C62974SZu c62974SZu = browserLiteFragment2.A0X;
            if (c62974SZu != null) {
                if (c62974SZu.A00 == -1) {
                    c62974SZu.A00 = Instant.now().getEpochSecond();
                }
                ?? obj = new Object();
                c62974SZu.A09.execute(new TNM(c62974SZu, obj));
                obj.addListener(new Runnable() { // from class: X.TJf
                    @Override // java.lang.Runnable
                    public final void run() {
                        IABEvent iABEvent;
                        String str2;
                        long longValue;
                        BrowserLiteFragment browserLiteFragment3 = C62603SIh.this.A04;
                        C63305ShB c63305ShB2 = browserLiteFragment3.A0M;
                        C23016ACq c23016ACq2 = browserLiteFragment3.A0e;
                        long A01 = browserLiteFragment3.A0X.A01();
                        C62974SZu c62974SZu2 = browserLiteFragment3.A0X;
                        long j6 = c62974SZu2.A04;
                        String str3 = c62974SZu2.A08;
                        C51u A02 = c62974SZu2.A02(C05F.A00);
                        C62974SZu c62974SZu3 = browserLiteFragment3.A0X;
                        long j7 = c62974SZu3.A00;
                        if (j7 == -1) {
                            j7 = Instant.now().getEpochSecond();
                            c62974SZu3.A00 = j7;
                        }
                        Long valueOf = Long.valueOf(j7);
                        if (c23016ACq2.A0p && (str2 = c23016ACq2.A0Z) != null) {
                            if (valueOf == null) {
                                longValue = c23016ACq2.A0m.now();
                            } else {
                                longValue = valueOf.longValue();
                            }
                            iABEvent = new IABIPAMatchKeyEvent(str2, str3, A02, longValue, longValue, A01, j6);
                        } else {
                            iABEvent = IABEvent.A04;
                        }
                        c63305ShB2.A06(browserLiteFragment3.A09, iABEvent, browserLiteFragment3.A0f);
                    }
                }, browserLiteFragment2.A0r);
            }
            this.A0U = true;
        }
    }

    public final void A0D(Intent intent) {
        this.A0A = intent;
        SHJ shj = this.A0H;
        shj.A02 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_NAVIGATION_TIMING_LOGGER_ENABLED", true);
        shj.A03 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_INTERACTION_TO_NEXT_PAINT_LOGGING_ENABLED", false);
        this.A0O = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_ENABLED", false);
        this.A0N = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_FRAMEWORK_FORM_DETECTION_LOGGING", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        if (r6 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001c, code lost:
    
        if (r6 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        ((com.facebook.browser.lite.webview.SystemWebView) r3).A04.loadUrl(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        r4.onFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.InterfaceC65483Tl0 r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "javascript: "
            java.lang.String r2 = X.AnonymousClass001.A0R(r0, r5)
            boolean r0 = r3.A0P
            if (r0 == 0) goto L1c
            r0 = 2
            X.Sor r1 = new X.Sor     // Catch: java.lang.IllegalStateException -> L19
            r1.<init>(r4, r0)     // Catch: java.lang.IllegalStateException -> L19
            r0 = r3
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0     // Catch: java.lang.IllegalStateException -> L19
            X.R7V r0 = r0.A04     // Catch: java.lang.IllegalStateException -> L19
            r0.evaluateJavascript(r5, r1)     // Catch: java.lang.IllegalStateException -> L19
            return
        L19:
            if (r6 == 0) goto L26
            goto L1e
        L1c:
            if (r6 == 0) goto L26
        L1e:
            r0 = r3
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.R7V r0 = r0.A04
            r0.loadUrl(r2)
        L26:
            if (r4 == 0) goto L2b
            r4.onFailure()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QF6.A0F(X.Tl0, java.lang.String, boolean):void");
    }

    public final String A07(int i) {
        TIK A01 = A01();
        if (A01.A01.size() > i) {
            return A01.A00(i).A03;
        }
        return A05();
    }

    public final void A0B(long j) {
        IABEvent iABLandingPageFinishedEvent;
        if (!A0I()) {
            long j2 = this.A05;
            if (j2 < j && j2 == -1 && j != -1) {
                this.A05 = j;
                C62603SIh c62603SIh = this.A0D;
                if (c62603SIh != null) {
                    BrowserLiteFragment browserLiteFragment = c62603SIh.A04;
                    Intent intent = browserLiteFragment.A07;
                    if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_TRANSPARENT_IAB_ENABLED", false)) {
                        FrameLayout frameLayout = browserLiteFragment.A0D;
                        if (frameLayout != null) {
                            frameLayout.setBackgroundColor(-1);
                        }
                        ((SystemWebView) this).A04.setBackgroundColor(-1);
                    }
                    browserLiteFragment.A1L.A01("BLWV.onLoadEvent", AbstractC61713RsU.A00(j));
                    if (!browserLiteFragment.A0z) {
                        String A06 = A06();
                        browserLiteFragment.A0z = true;
                        C23016ACq c23016ACq = browserLiteFragment.A0e;
                        if (c23016ACq.A0p) {
                            c23016ACq.A0F = j;
                        }
                        browserLiteFragment.A0W.BHf().A0B(A06);
                        BrowserLiteFragment.A0B(browserLiteFragment.A07, browserLiteFragment);
                        C23016ACq c23016ACq2 = browserLiteFragment.A0e;
                        if (!c23016ACq2.A0p) {
                            iABLandingPageFinishedEvent = IABEvent.A04;
                        } else {
                            Parcelable.Creator creator = IABEvent.CREATOR;
                            iABLandingPageFinishedEvent = new IABLandingPageFinishedEvent(c23016ACq2.A0Q, c23016ACq2.A0Z, A06, c23016ACq2.A0c, c23016ACq2.A0F, c23016ACq2.A0m.now());
                        }
                        browserLiteFragment.Ckl(browserLiteFragment.A09, iABLandingPageFinishedEvent, browserLiteFragment.A0f);
                    }
                }
                AbstractC63254SgB.A01("BrowserLiteWebView", "==onLoadEventEnd: %d ms==", AbstractC58319PtB.A1Y(this.A05 - this.A06));
            }
        }
    }

    public final void A0C(long j) {
        if (!A0I()) {
            long j2 = this.A07;
            if (j2 < j && j2 == -1) {
                this.A07 = j;
                long j3 = this.A06;
                if (j3 != -1) {
                    AbstractC63254SgB.A01("BrowserLiteWebView", "onResponseEnd: %d ms", AbstractC58319PtB.A1Y(j - j3));
                }
            }
        }
    }

    public final boolean A0I() {
        if (!A0H() && !((SystemWebView) this).A04.canGoForward()) {
            return false;
        }
        return true;
    }
}
