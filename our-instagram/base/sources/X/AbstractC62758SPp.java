package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.Iterator;

/* renamed from: X.SPp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62758SPp {
    public C62530SFh A04(String str) {
        return new C62530SFh(null, null, null);
    }

    public void A06(QF6 qf6, String str) {
        android.net.Uri A01;
        QF4 qf4 = (QF4) this;
        qf4.A0G.A00("BLWVC.onPageFinished");
        Bundle bundle = null;
        qf4.A07 = null;
        int i = 0;
        if (qf4.A0H != null && (A01 = AbstractC08820cl.A01(QF4.A0S, str)) != null) {
            A01.getScheme();
        }
        if (qf4.A09) {
            long currentTimeMillis = System.currentTimeMillis();
            if (qf6.A07 < 0) {
                qf6.A0C(currentTimeMillis);
            }
            if (qf6.A04 < 0) {
                qf6.A0A(currentTimeMillis);
            }
            if (qf6.A05 < 0) {
                qf6.A0B(currentTimeMillis);
            }
        }
        if (qf4.A09) {
            qf4.A09 = false;
            int i2 = qf4.A01;
            AbstractC63254SgB.A01("BrowserLiteFragment", "prefetched: %d, total resources: %d, prefetch rate: %.2f%%", Integer.valueOf(i2), Integer.valueOf(qf4.A02), Float.valueOf((i2 * 100.0f) / Math.max(1, r5)));
        } else {
            Object[] objArr = {str};
            if (AbstractC63254SgB.A00) {
                String.format(null, "onPageFinished %s", objArr);
            }
        }
        qf4.A0A(str);
        C63305ShB c63305ShB = qf4.A0F;
        BrowserLiteFragment browserLiteFragment = qf4.A0E;
        if (browserLiteFragment != null) {
            bundle = browserLiteFragment.A09;
            i = browserLiteFragment.A0P();
        }
        C63305ShB.A02(new C58863QDe(bundle, c63305ShB, str, i), c63305ShB, false);
        if (browserLiteFragment != null) {
            browserLiteFragment.A0s = true;
            if (browserLiteFragment.C9a() == qf6 && !qf4.A0A) {
                browserLiteFragment.A0c(((SystemWebView) qf6).A04.getTitle());
            }
        }
        Iterator it = qf4.A08.iterator();
        while (it.hasNext()) {
            ((InterfaceC65638Tq1) it.next()).DXT(qf6, str);
        }
        if (browserLiteFragment != null) {
            if (qf4.A0A) {
                BrowserLiteErrorScreen browserLiteErrorScreen = browserLiteFragment.A0b;
                if (browserLiteErrorScreen != null) {
                    C63950SwP c63950SwP = (C63950SwP) browserLiteErrorScreen.A02;
                    if (c63950SwP.A01 < 10) {
                        c63950SwP.A02.postDelayed(c63950SwP.A03, c63950SwP.A00);
                    }
                }
                BrowserLiteErrorScreen browserLiteErrorScreen2 = browserLiteFragment.A0c;
                if (browserLiteErrorScreen2 != null) {
                    C63950SwP c63950SwP2 = (C63950SwP) browserLiteErrorScreen2.A02;
                    if (c63950SwP2.A01 < 10) {
                        c63950SwP2.A02.postDelayed(c63950SwP2.A03, c63950SwP2.A00);
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC167007dF.A0x(browserLiteFragment.A0b);
            AbstractC167007dF.A0x(browserLiteFragment.A0c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.SwP, java.lang.Object, X.Tfi] */
    public boolean A07(RenderProcessGoneDetail renderProcessGoneDetail, QF6 qf6) {
        String str;
        boolean z;
        QF4 qf4 = (QF4) this;
        ACQ acq = qf4.A0G;
        acq.A00("BLWVC.onRenderProcessGone");
        C0f6 c0f6 = qf4.A0J;
        if (c0f6 != null) {
            C0f5 AEp = c0f6.AEp("iab_render_process_gone", 19805434);
            if (AbstractC83633o6.A00 != null) {
                z = AbstractC106254qf.A03;
            } else {
                z = false;
            }
            AEp.ABX("using_helium", z);
            AEp.report();
        }
        BrowserLiteFragment browserLiteFragment = qf4.A0E;
        if (browserLiteFragment != null) {
            EnumC223219t5 enumC223219t5 = EnumC223219t5.A1P;
            Integer num = C05F.A0C;
            if (renderProcessGoneDetail.didCrash()) {
                str = "crash";
            } else {
                str = "kill";
            }
            browserLiteFragment.A0b(enumC223219t5, num, str);
            Intent intent = qf4.A0D;
            if (intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_SHOW_RENDERER_CRASH_RECOVERY_SCREEN", false)) {
                acq.A00("BLWVC.onRenderProcessGone.showMessage");
                BrowserLiteErrorScreen browserLiteErrorScreen = browserLiteFragment.A0c;
                BrowserLiteErrorScreen browserLiteErrorScreen2 = null;
                if (browserLiteErrorScreen == null) {
                    View view = browserLiteFragment.mView;
                    if (view != null) {
                        view.findViewById(0);
                    }
                } else {
                    browserLiteErrorScreen2 = browserLiteErrorScreen;
                }
                browserLiteFragment.A0c = browserLiteErrorScreen2;
                if (browserLiteErrorScreen2 != null) {
                    InterfaceC65200Tfi interfaceC65200Tfi = browserLiteFragment.A0U;
                    InterfaceC65200Tfi interfaceC65200Tfi2 = interfaceC65200Tfi;
                    if (interfaceC65200Tfi == null) {
                        ?? obj = new Object();
                        obj.A01 = 0;
                        obj.A00 = 0;
                        obj.A02 = new Handler();
                        obj.A03 = new TNA(obj, qf6);
                        browserLiteFragment.A0U = obj;
                        interfaceC65200Tfi2 = obj;
                    }
                    browserLiteErrorScreen2.A02 = interfaceC65200Tfi2;
                    return true;
                }
                return true;
            }
            if (qf4.A00 < intent.getIntExtra("BrowserLiteIntent.EXTRA_RENDERER_CRASH_SILENT_RECOVERY_COUNT", 0)) {
                acq.A00("BLWVC.onRenderProcessGone.silentRecovery");
                STG.A00(new TJd(browserLiteFragment));
                qf4.A00++;
                return true;
            }
            BrowserLiteFragment.A0G(browserLiteFragment, "RENDER_PROCESS_GONE");
            browserLiteFragment.AIE(4, null);
            return true;
        }
        return false;
    }

    public final boolean A08(QF6 qf6, String str) {
        if (this instanceof QF4) {
            QF4 qf4 = (QF4) this;
            AbstractC63254SgB.A01("BrowserLiteFragment", "shouldOverrideUrlLoading %s", str);
            try {
                if ("intent".equalsIgnoreCase(AbstractC08820cl.A01(QF4.A0S, str).getScheme())) {
                    AbstractC63254SgB.A01("BrowserLiteFragment", "Using default BrowserLiteWebView URL handling for intent navigation for %s", str);
                    return false;
                }
            } catch (NullPointerException e) {
                if (AbstractC63254SgB.A00) {
                    android.util.Log.e("BrowserLiteFragment", "shouldOverrideUrlLoading error", e);
                }
            }
            boolean A02 = QF4.A02(qf4, qf6, null, null, str);
            if (!A02) {
                qf4.A07 = str;
                return A02;
            }
            return A02;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(android.webkit.WebResourceRequest r3, boolean r4) {
        /*
            java.util.Map r3 = r3.getRequestHeaders()
            r2 = 0
            if (r3 == 0) goto L28
            java.lang.String r0 = "Origin"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r3)
            if (r4 == 0) goto L17
            if (r1 != 0) goto L19
            java.lang.String r0 = "Referer"
            java.lang.String r1 = X.AbstractC58318PtA.A0i(r0, r3)
        L17:
            if (r1 == 0) goto L28
        L19:
            X.0NO r0 = new X.0NO
            r0.<init>()
            android.net.Uri r0 = X.AbstractC08820cl.A00(r0, r1)
            if (r0 == 0) goto L28
            java.lang.String r2 = r0.getHost()
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62758SPp.A03(android.webkit.WebResourceRequest, boolean):java.lang.String");
    }

    public void A05(WebResourceError webResourceError, WebResourceRequest webResourceRequest, QF6 qf6) {
        if (webResourceRequest.isForMainFrame()) {
            webResourceError.getErrorCode();
            webResourceError.getDescription().toString();
            webResourceRequest.getUrl().toString();
        }
    }
}
