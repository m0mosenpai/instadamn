package com.facebook.browser.lite;

import X.A4Q;
import X.A4S;
import X.A4T;
import X.A4U;
import X.A6U;
import X.A9E;
import X.ABS;
import X.ACQ;
import X.AG1;
import X.AKP;
import X.ATP;
import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AbstractC210669Tj;
import X.AbstractC23086AFs;
import X.AbstractC58317Pt9;
import X.AbstractC61598RqN;
import X.AbstractC62758SPp;
import X.AbstractC62862SUj;
import X.AbstractC63254SgB;
import X.AbstractC63387Sj3;
import X.AnonymousClass001;
import X.BBM;
import X.BCL;
import X.BCM;
import X.BEG;
import X.C00V;
import X.C00X;
import X.C04770Mv;
import X.C05F;
import X.C06090Tz;
import X.C0HM;
import X.C0K8;
import X.C0LK;
import X.C0M6;
import X.C0f9;
import X.C0s6;
import X.C14360o3;
import X.C172707mf;
import X.C18U;
import X.C1B4;
import X.C1MG;
import X.C20I;
import X.C211439Wr;
import X.C223619u4;
import X.C223629u5;
import X.C22898A7s;
import X.C22907A8c;
import X.C23016ACq;
import X.C23101AGn;
import X.C23306AUr;
import X.C23523Abd;
import X.C23650Adj;
import X.C2GS;
import X.C2JG;
import X.C3MJ;
import X.C3MT;
import X.C58720Q4v;
import X.C58859QDa;
import X.C58861QDc;
import X.C58867QDm;
import X.C58881QEr;
import X.C58883QEt;
import X.C62418SAs;
import X.C62569SGu;
import X.C62720SNk;
import X.C62965SZi;
import X.C62974SZu;
import X.C63217SfN;
import X.C63305ShB;
import X.C65705Tsd;
import X.EnumC223219t5;
import X.EnumC223299tM;
import X.EnumC39621HeV;
import X.InterfaceC172717mh;
import X.InterfaceC172727mi;
import X.InterfaceC25210BDi;
import X.InterfaceC65200Tfi;
import X.InterfaceC65594Tnc;
import X.InterfaceC65614To5;
import X.InterfaceC65626Tpm;
import X.InterfaceC65639Tq2;
import X.InterfaceViewOnTouchListenerC65624Tpk;
import X.Q5I;
import X.QDU;
import X.QDi;
import X.QDq;
import X.QF4;
import X.QF6;
import X.R7V;
import X.RiS;
import X.SH1;
import X.STG;
import X.SUV;
import X.TIK;
import X.TIT;
import X.TJd;
import X.TNC;
import X.VD2;
import X.VHa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabeventlogging.model.IABChangeViewModeEvent;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABNonViewableEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;
import com.facebook.iabeventlogging.model.IABViewableEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes4.dex */
public class BrowserLiteFragment extends Fragment implements InterfaceC172717mh, InterfaceC172727mi {
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public Context A06;
    public Intent A07;
    public Uri A08;
    public Bundle A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public FrameLayout A0D;
    public TextView A0E;
    public C211439Wr A0F;
    public C223629u5 A0G;

    @Deprecated
    public BrowserLiteJSBridgeProxy A0H;
    public SH1 A0I;
    public C62965SZi A0J;
    public C63217SfN A0K;
    public BBM A0L;
    public C63305ShB A0M;
    public BCL A0N;
    public ABS A0O;
    public A6U A0Q;
    public A4U A0R;
    public InterfaceViewOnTouchListenerC65624Tpk A0S;
    public InterfaceC65200Tfi A0T;
    public InterfaceC65200Tfi A0U;
    public InterfaceC65594Tnc A0V;
    public InterfaceC25210BDi A0W;
    public C62974SZu A0X;
    public InterfaceC65614To5 A0Y;
    public C22898A7s A0Z;
    public C22907A8c A0a;
    public BrowserLiteErrorScreen A0b;
    public BrowserLiteErrorScreen A0c;
    public BrowserLiteWrapperView A0d;
    public C23016ACq A0e;
    public C62569SGu A0g;
    public String A0l;
    public String A0m;
    public String A0n;
    public ExecutorService A0r;
    public boolean A0t;
    public boolean A0x;
    public boolean A12;
    public InterfaceC65626Tpm A17;
    public A4T A18;
    public C23650Adj A19;
    public String A1A;
    public String A1B;
    public boolean A1E;
    public boolean A1H;
    public boolean A1K;
    public volatile String A1S;
    public int A14 = -1;
    public final HashMap A1R = new HashMap();
    public String A0k = "BrowserLiteFragment";
    public final Set A1N = new HashSet();
    public final Stack A1O = new Stack();
    public int A02 = 0;
    public long A16 = -1;
    public boolean A1F = true;
    public boolean A0s = false;
    public boolean A0u = false;
    public boolean A1D = false;
    public int A00 = 0;
    public boolean A1G = false;
    public boolean A11 = false;
    public boolean A0y = false;
    public Long A0j = null;
    public boolean A0z = false;
    public boolean A10 = false;
    public boolean A13 = false;
    public C23101AGn A0P = new C23101AGn();
    public final ATP A1M = new Object();
    public List A0o = Collections.emptyList();
    public List A0p = Collections.emptyList();
    public List A1C = Collections.emptyList();
    public List A0q = Collections.emptyList();
    public boolean A0v = true;
    public boolean A0w = false;
    public ZonePolicy A0f = ZonePolicy.A05;
    public final C00X A1P = registerForActivityResult(new Object(), new C00V() { // from class: X.AU0
        @Override // X.C00V
        public final void Cv1(Object obj) {
            BrowserLiteFragment browserLiteFragment = BrowserLiteFragment.this;
            List list = browserLiteFragment.A0o;
            if (list != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("BLF.plugins.");
                A1C.append("onRequestPermissionResult");
                ACQ acq = browserLiteFragment.A1L;
                A1C.append(".Start");
                acq.A00(AnonymousClass001.A0g("BLF.plugins.", "onRequestPermissionResult", ".Start"));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                acq.A00(AbstractC166997dE.A0x(".End", A1C));
            }
        }
    });
    public boolean A1J = true;
    public boolean A1I = false;
    public final A4Q A1Q = new A4Q(this);
    public Boolean A0h = true;
    public Integer A0i = 0;
    public final ACQ A1L = new ACQ();
    public long A15 = 0;

    public static QF4 A05(QF6 qf6) {
        AbstractC62758SPp abstractC62758SPp;
        if (qf6 == null) {
            return null;
        }
        C58720Q4v c58720Q4v = ((SystemWebView) qf6).A03;
        if (c58720Q4v == null || (abstractC62758SPp = c58720Q4v.A00) == null) {
            abstractC62758SPp = null;
        }
        if (abstractC62758SPp instanceof QF4) {
            return (QF4) abstractC62758SPp;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r18 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01fa, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x017e, code lost:
    
        if (X.C18U.A06(r5, r36.A0R.A00, 36313566238214281L) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016e, code lost:
    
        if (java.lang.Integer.parseInt(r1.group(1)) >= 128) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.Q4d, android.webkit.WebChromeClient] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.facebook.browser.lite.BrowserLiteWebChromeClient, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.QF6 A06() {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A06():X.QF6");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        if (X.C58889QEz.A01(r7, r6.A07.getStringExtra(X.AbstractC58317Pt9.A00(469)), r6.A07.getStringExtra(X.AbstractC58317Pt9.A00(468)), r6.A07.getStringExtra(X.AbstractC58317Pt9.A00(470)), r1.getBooleanExtra(X.AbstractC58317Pt9.A00(164), false)) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:8:0x002e->B:10:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0f(final java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0f(java.lang.String):boolean");
    }

    @Override // X.InterfaceC172717mh
    public final boolean DJx(boolean z) {
        this.A02 = 2;
        List list = this.A0o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BEG) it.next()).DJw();
            }
        }
        QF6 C9a = C9a();
        if (C9a != null) {
            BrowserLiteWebChromeClient A03 = C9a.A03();
            if (A03 != null && A03.A08.getVisibility() == 0) {
                try {
                    BrowserLiteWebChromeClient.A01(A03);
                } catch (Throwable unused) {
                }
            } else if (C9a.A0H()) {
                ((SystemWebView) C9a).A04.goBack();
            } else if (this.A1O.size() > 1) {
                A0D(this);
            }
            if (!z) {
                return true;
            }
            this.A03++;
            return true;
        }
        return false;
    }

    public static Integer A07(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra(AbstractC58317Pt9.A00(494))) != null) {
            switch (stringExtra.hashCode()) {
                case -1130324112:
                    if (stringExtra.equals("instant_helium")) {
                        return C05F.A0Y;
                    }
                    break;
                case -934641255:
                    if (stringExtra.equals("reload")) {
                        return C05F.A01;
                    }
                    break;
                case 374351032:
                    if (stringExtra.equals("reload_helium")) {
                        return C05F.A0C;
                    }
                    break;
                case 1957570017:
                    if (stringExtra.equals("instant")) {
                        return C05F.A0N;
                    }
                    break;
            }
        }
        return C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r4.isEmpty() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A09():void");
    }

    private void A0A(int i) {
        Context context = this.A06;
        C14360o3.A0B(context, 0);
        String string = context.getString(i);
        C14360o3.A07(string);
        int i2 = 0;
        if (string.length() > 60) {
            i2 = 1;
        }
        Toast.makeText(this.A06.getApplicationContext(), string, i2).show();
    }

    public static void A0B(Intent intent, BrowserLiteFragment browserLiteFragment) {
        IabCommonTrait iabCommonTrait;
        IABAdsContext iABAdsContext;
        if (intent == null || (iabCommonTrait = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT")) == null) {
            iabCommonTrait = null;
        }
        if ((iabCommonTrait instanceof IABAdsContext) && (iABAdsContext = (IABAdsContext) iabCommonTrait) != null) {
            C23016ACq c23016ACq = browserLiteFragment.A0e;
            ImmutableList immutableList = iABAdsContext.A06;
            if (c23016ACq.A0p) {
                c23016ACq.A0c = immutableList;
                return;
            }
            return;
        }
        C23016ACq c23016ACq2 = browserLiteFragment.A0e;
        if (!c23016ACq2.A0p) {
            return;
        }
        c23016ACq2.A0c = Arrays.asList(EnumC39621HeV.A09);
    }

    public static void A0D(BrowserLiteFragment browserLiteFragment) {
        String str;
        Stack stack = browserLiteFragment.A1O;
        if (stack.isEmpty()) {
            str = "Pop Web View, Web View Stack Empty";
        } else {
            QF6 qf6 = (QF6) stack.pop();
            R7V r7v = ((SystemWebView) qf6).A04;
            r7v.setVisibility(8);
            browserLiteFragment.A0D.removeView(r7v);
            List list = browserLiteFragment.A0p;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("BLF.plugins.");
                sb.append("webViewPopped");
                ACQ acq = browserLiteFragment.A1L;
                sb.append(".Start");
                acq.A00(AnonymousClass001.A0g("BLF.plugins.", "webViewPopped", ".Start"));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC65639Tq2) it.next()).FE3(qf6);
                }
                sb.append(".End");
                acq.A00(sb.toString());
            }
            browserLiteFragment.A0J(qf6);
            QF6 C9a = browserLiteFragment.C9a();
            if (C9a == null) {
                str = "WEBVIEW_STACK_EMPTY";
            } else {
                R7V r7v2 = ((SystemWebView) C9a).A04;
                r7v2.setVisibility(0);
                r7v2.onResume();
                browserLiteFragment.A0K(C9a);
                BrowserLiteWebChromeClient A03 = C9a.A03();
                if (A03 == null) {
                    return;
                }
                A03.A07(C9a, r7v2.getProgress());
                return;
            }
        }
        A0G(browserLiteFragment, str);
        browserLiteFragment.AIE(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r9.isEmpty() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(com.facebook.browser.lite.BrowserLiteFragment r49, X.QF6 r50) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0E(com.facebook.browser.lite.BrowserLiteFragment, X.QF6):void");
    }

    public static void A0F(BrowserLiteFragment browserLiteFragment, QF6 qf6, long j) {
        C23016ACq c23016ACq = browserLiteFragment.A0e;
        if (c23016ACq.A0p) {
            c23016ACq.A0B = j;
        }
        int computeHorizontalScrollRange = ((SystemWebView) qf6).A04.computeHorizontalScrollRange();
        if (c23016ACq.A0p) {
            c23016ACq.A06 = computeHorizontalScrollRange;
        }
        int i = Resources.getSystem().getDisplayMetrics().widthPixels;
        C23016ACq c23016ACq2 = browserLiteFragment.A0e;
        if (c23016ACq2.A0p) {
            c23016ACq2.A07 = i;
        }
        browserLiteFragment.A0W.BHf().A0B(qf6.A06());
    }

    public static void A0G(BrowserLiteFragment browserLiteFragment, String str) {
        BCL bcl = browserLiteFragment.A0N;
        if (bcl != null) {
            boolean z = !str.equals("CREATING_WEBVIEW");
            long currentTimeMillis = System.currentTimeMillis();
            IABEmptyEvent iABEmptyEvent = IABEvent.A04;
            bcl.Chu(new IABUnifiedEvent(EnumC223219t5.A1g, C05F.A00, browserLiteFragment.A08(z), str, currentTimeMillis, currentTimeMillis));
        }
    }

    public static void A0H(BrowserLiteFragment browserLiteFragment, String str) {
        Bundle extras;
        String string;
        if (!browserLiteFragment.A1I) {
            if (str != null) {
                Intent intent = browserLiteFragment.A07;
                if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("BrowserLiteIntent.PERFORMANCE_LOGGER_MARKER_END_EVENT")) != null && !string.isEmpty()) {
                    Locale locale = Locale.US;
                    if (!str.toLowerCase(locale).contains(string.toLowerCase(locale))) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Stack stack = browserLiteFragment.A1O;
            if (stack.isEmpty()) {
                C0K8.A0Q(browserLiteFragment.A0k, "webViewStack is empty when trying to log timing event %s", str);
                return;
            }
            QF6 qf6 = (QF6) stack.firstElement();
            browserLiteFragment.A0a(qf6);
            browserLiteFragment.A1L.A00.markerEnd(19791876, 0, (short) 2, System.nanoTime(), TimeUnit.NANOSECONDS);
            C63305ShB c63305ShB = browserLiteFragment.A0M;
            Context applicationContext = browserLiteFragment.A06.getApplicationContext();
            String A06 = qf6.A06();
            long j = browserLiteFragment.A16;
            long j2 = qf6.A07;
            long j3 = qf6.A04;
            long j4 = qf6.A05;
            long j5 = qf6.A01;
            C63305ShB.A02(new QDq(applicationContext, browserLiteFragment.A09, c63305ShB, browserLiteFragment.A0f, A06, (String) browserLiteFragment.A0W.Aw7().A02(), browserLiteFragment.A01, j, j2, j3, j4, j5, browserLiteFragment.A0u, qf6.A0X, browserLiteFragment.A1G), c63305ShB, false);
            browserLiteFragment.A1I = true;
        }
    }

    public static void A0I(BrowserLiteFragment browserLiteFragment, boolean z) {
        Bundle bundle;
        Map map;
        Set set;
        HashSet hashSet;
        HashSet hashSet2;
        HashMap hashMap;
        Integer num;
        if (browserLiteFragment.A1S != null && !browserLiteFragment.A1S.equalsIgnoreCase(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            C23101AGn c23101AGn = browserLiteFragment.A0P;
            Set set2 = c23101AGn.A02;
            synchronized (set2) {
                bundle = new Bundle();
                map = c23101AGn.A00;
                bundle.putSerializable("resource_counts", new HashMap(map));
                bundle.putSerializable("resource_domains", new HashSet(set2));
                set = c23101AGn.A01;
                bundle.putSerializable("images_url", new HashSet(set));
            }
            List<C58881QEr> list = browserLiteFragment.A1C;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("BLF.plugins.");
                sb.append("logResources");
                ACQ acq = browserLiteFragment.A1L;
                sb.append(".Start");
                acq.A00(AnonymousClass001.A0g("BLF.plugins.", "logResources", ".Start"));
                for (C58881QEr c58881QEr : list) {
                    if (!c58881QEr.A02) {
                        C23101AGn c23101AGn2 = c58881QEr.A03;
                        C23101AGn c23101AGn3 = new C23101AGn(bundle);
                        Set set3 = c23101AGn2.A02;
                        synchronized (set3) {
                            Set set4 = c23101AGn3.A02;
                            synchronized (set4) {
                                try {
                                    hashSet = new HashSet(set4);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            set3.addAll(hashSet);
                            Set set5 = c23101AGn2.A01;
                            synchronized (set4) {
                                try {
                                    hashSet2 = new HashSet(c23101AGn3.A01);
                                } finally {
                                }
                            }
                            set5.addAll(hashSet2);
                            synchronized (set4) {
                                try {
                                    hashMap = new HashMap(c23101AGn3.A00);
                                } finally {
                                }
                            }
                            for (String str : hashMap.keySet()) {
                                Map map2 = c23101AGn2.A00;
                                if (map2.containsKey(str)) {
                                    num = Integer.valueOf(((Integer) hashMap.get(str)).intValue() + ((Integer) map2.get(str)).intValue());
                                } else {
                                    num = (Integer) hashMap.get(str);
                                }
                                map2.put(str, num);
                            }
                        }
                    }
                }
                sb.append(".End");
                acq.A00(sb.toString());
            }
            synchronized (set2) {
                map.clear();
                set2.clear();
                set.clear();
            }
            if (z) {
                browserLiteFragment.A1S = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            }
        }
    }

    private void A0J(QF6 qf6) {
        if (qf6 != null) {
            if (this.A1J) {
                qf6.A09();
                return;
            }
            R7V r7v = ((SystemWebView) qf6).A04;
            r7v.setTag(null);
            r7v.clearHistory();
            r7v.removeAllViews();
            try {
                r7v.onPause();
            } catch (Exception unused) {
            }
            qf6.A02();
            qf6.A0Y = true;
        }
    }

    private void A0K(QF6 qf6) {
        ABS abs;
        if (this.A0V == null && (abs = this.A0O) != null && qf6 != null) {
            BrowserLiteWebChromeClient A03 = qf6.A03();
            AbstractC210669Tj abstractC210669Tj = abs.A00;
            if (abstractC210669Tj != null) {
                DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) abstractC210669Tj;
                defaultBrowserLiteChrome.A0G = qf6;
                defaultBrowserLiteChrome.setTitle(((SystemWebView) qf6).A04.getTitle());
                if (A03 != null) {
                    BrowserLiteWebChromeClient.A02(A03, A03.A00);
                }
                defaultBrowserLiteChrome.A00(defaultBrowserLiteChrome.A0G.A05());
            }
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.A0H;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A08(qf6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r2.equals(r0) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0M(android.content.Intent r4) {
        /*
            X.A9E r3 = X.AbstractC23086AFs.A02
            if (r3 != 0) goto L5
            r3 = 0
        L5:
            java.lang.String r2 = "iab hot instance"
            r1 = 0
            if (r4 != 0) goto L10
            java.lang.String r0 = "willReuseHotInstance returned false because intent is null"
        Lc:
            X.C0K8.A0E(r2, r0)
        Lf:
            return r1
        L10:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_DISABLE_HOT_INSTANCE"
            boolean r0 = r4.getBooleanExtra(r0, r1)
            if (r0 != 0) goto Lf
            boolean r0 = A0L(r4)
            if (r0 == 0) goto L29
            if (r3 == 0) goto L26
            X.QF6 r0 = r3.A02
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L29
        L26:
            java.lang.String r0 = "eligibleForWebViewHotInstance find WebView is destroyed"
            goto Lc
        L29:
            boolean r0 = A0L(r4)
            if (r0 == 0) goto Lf
            java.lang.Integer r3 = A07(r4)
            android.net.Uri r2 = r4.getData()
            java.lang.Integer r0 = X.C05F.A00
            if (r3 == r0) goto Lf
            X.A9E r0 = X.AbstractC23086AFs.A02
            if (r0 == 0) goto L4c
            android.content.Intent r0 = r0.A01
            if (r0 == 0) goto L4c
            android.net.Uri r0 = r0.getData()
        L47:
            if (r2 != 0) goto L4e
            if (r0 == 0) goto L54
            return r1
        L4c:
            r0 = 0
            goto L47
        L4e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
        L54:
            X.A9E r0 = X.AbstractC23086AFs.A02
            if (r0 == 0) goto Lf
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0M(android.content.Intent):boolean");
    }

    private boolean A0N(Bundle bundle) {
        String str;
        Object[] objArr;
        String str2;
        boolean z = false;
        if (!bundle.containsKey("web_view_number")) {
            str = this.A0k;
            objArr = new Object[0];
            str2 = "The fragment is reconstructed but without webview state number info!";
        } else {
            int i = bundle.getInt("web_view_number");
            if (i == 0) {
                str = this.A0k;
                objArr = new Object[0];
                str2 = "0 webview saved!";
            } else {
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= i) {
                        break;
                    }
                    String A0O = AnonymousClass001.A0O("web_view_", i2);
                    if (!bundle.containsKey(A0O)) {
                        AbstractC63254SgB.A02(this.A0k, "Info for webview %d (total %d) not found!", Integer.valueOf(i2), Integer.valueOf(i));
                    } else {
                        Bundle bundle2 = bundle.getBundle(A0O);
                        QF6 A06 = A06();
                        ((SystemWebView) A06).A04.restoreState(bundle2);
                        this.A1O.push(A06);
                    }
                    i2++;
                }
                A0K((QF6) this.A1O.peek());
                List list = this.A0p;
                if (list != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("BLF.plugins.");
                    sb.append("restoreWebViewStack");
                    ACQ acq = this.A1L;
                    sb.append(".Start");
                    acq.A00(AnonymousClass001.A0g("BLF.plugins.", "restoreWebViewStack", ".Start"));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    sb.append(".End");
                    acq.A00(sb.toString());
                    return true;
                }
                return z;
            }
        }
        AbstractC63254SgB.A02(str, str2, objArr);
        return z;
    }

    public final int A0P() {
        Iterator it = this.A1O.iterator();
        int i = 0;
        while (it.hasNext()) {
            TIK A01 = ((AbstractC61598RqN) it.next()).A01();
            int i2 = A01.A00 + 1;
            List list = A01.A01;
            if (i2 > list.size()) {
                i2 = list.size();
            }
            if (i2 == 0) {
                i2 = 0;
            } else {
                TIT A00 = A01.A00(0);
                if (i2 == 1) {
                    i2 = !ReactWebViewManager.BLANK_URL.equals(A00.A03) ? 1 : 0;
                } else {
                    String str = A00.A03;
                    String str2 = A01.A00(1).A03;
                    if (ReactWebViewManager.BLANK_URL.equals(str) || str.equals(str2)) {
                        i2--;
                    }
                }
            }
            i += i2;
        }
        return i;
    }

    public final BrowserLiteErrorScreen A0Q(C62418SAs c62418SAs) {
        BrowserLiteErrorScreen browserLiteErrorScreen = this.A0b;
        if (browserLiteErrorScreen == null) {
            View view = this.mView;
            browserLiteErrorScreen = null;
            if (view != null) {
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.browser_lite_error_screen_stub);
                if (viewStub != null) {
                    viewStub.setLayoutResource(R.layout.browser_lite_error_screen);
                    browserLiteErrorScreen = (BrowserLiteErrorScreen) viewStub.inflate();
                } else if (c62418SAs != null) {
                    c62418SAs.A00.cancel();
                }
            }
        }
        this.A0b = browserLiteErrorScreen;
        return browserLiteErrorScreen;
    }

    public final String A0S() {
        if (C18U.A06(C06090Tz.A05, this.A0Q.A00, 36313566239328410L)) {
            return this.A0W.getSessionId();
        }
        return A08(true);
    }

    public final String A0T() {
        String str;
        IabCommonTrait iabCommonTrait;
        IABAdsContext iABAdsContext;
        Intent intent = this.A07;
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_TRACKING_CODES");
        Pattern pattern = SUV.A01;
        String str2 = null;
        if (stringExtra == null) {
            str = null;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i = 0; i < jSONArray.length() && str2 == null; i++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                    if (jSONObject.has("adid")) {
                        str2 = jSONObject.getString("adid");
                    }
                }
            } catch (JSONException unused) {
            }
            str = str2;
        }
        if (str2 == null) {
            Intent intent2 = this.A07;
            if (intent2 == null || (iabCommonTrait = (IabCommonTrait) intent2.getParcelableExtra("EXTRA_IAB_CONTEXT")) == null) {
                iabCommonTrait = null;
            }
            if (iabCommonTrait instanceof IABAdsContext) {
                iABAdsContext = (IABAdsContext) iabCommonTrait;
            } else {
                iABAdsContext = null;
            }
            if (iABAdsContext == null) {
                return null;
            }
            return iABAdsContext.A0A;
        }
        return str;
    }

    public final String A0U() {
        if (C18U.A06(C06090Tz.A05, this.A0Q.A00, 36313566239787169L)) {
            return (String) this.A0W.CDn().A02();
        }
        return this.A1B;
    }

    public final void A0V(int i) {
        if (this.A0d != null) {
            Iterator it = AKP.A01().A02(C58883QEt.class).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (A07(getIntent()) == C05F.A0Y) {
            Iterator it2 = AKP.A01().A02(C58883QEt.class).iterator();
            while (it2.hasNext()) {
                C58883QEt c58883QEt = (C58883QEt) it2.next();
                HashMap hashMap = this.A1R;
                Bundle bundle = new Bundle();
                bundle.putSerializable("mOptOutDomains", (ConcurrentHashMap) c58883QEt.A0f);
                bundle.putSerializable("mDomainAcceptedAutofill", (HashMap) c58883QEt.A0c);
                hashMap.put("autofill_controller", bundle);
            }
        }
        AKP A01 = AKP.A01();
        List list = A01.A08;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((BCM) it3.next()).destroy();
        }
        list.clear();
        WeakReference weakReference = A01.A05;
        if (weakReference != null) {
            weakReference.clear();
            A01.A05 = null;
        }
        WeakReference weakReference2 = A01.A06;
        if (weakReference2 != null) {
            weakReference2.clear();
            A01.A06 = null;
        }
        WeakReference weakReference3 = A01.A07;
        if (weakReference3 != null) {
            weakReference3.clear();
            A01.A07 = null;
        }
        A01.A04 = null;
        A01.A02 = null;
        A01.A03 = null;
        AKP.A09 = null;
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.A0H;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A08(null);
        }
        this.A02 = i;
        this.A0u = true;
        if (C18U.A06(C06090Tz.A05, this.A0Q.A00, 36313566239721632L)) {
            C23016ACq c23016ACq = this.A0e;
            if (c23016ACq.A0p) {
                c23016ACq.A0I = c23016ACq.A0m.now();
            }
            this.A0Z.A02 = SystemClock.elapsedRealtime();
            A09();
        }
    }

    public void A0X(View view, C223619u4 c223619u4, boolean z, boolean z2) {
        String str;
        C23306AUr c23306AUr;
        if (this.A0V != null && this.A0N != null && this.A07 != null) {
            C63305ShB.A00();
            if (z2) {
                if (this.A0G != null) {
                    Intent intent = getIntent();
                    if (intent != null) {
                        intent.getIntExtra("BrowserLiteIntent.EXTRA_BONDI_FOOTER_COLLAPSE_SPEED", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
                    }
                    getIntent();
                    c23306AUr = null;
                    this.A0S = c23306AUr;
                    return;
                }
                str = "BwPStaticActionHelper is null but session is BwP";
                C0K8.A0E("BrowserLiteFragment", str);
            }
            if (!z) {
                return;
            }
            if (c223619u4 != null) {
                Intent intent2 = getIntent();
                if (intent2 != null) {
                    intent2.getIntExtra("BrowserLiteIntent.EXTRA_BONDI_FOOTER_COLLAPSE_SPEED", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
                }
                getIntent();
                c23306AUr = new C23306AUr();
                this.A0S = c23306AUr;
                return;
            }
            str = "BondiStaticActionHelper is null but bondi is enabled";
            C0K8.A0E("BrowserLiteFragment", str);
        }
    }

    public void A0a(QF6 qf6) {
        String simpleName;
        AbstractC210669Tj abstractC210669Tj;
        HashMap hashMap;
        SslError sslError;
        if (this.A12) {
            HashMap hashMap2 = new HashMap();
            long j = qf6.A00;
            if (j != -1) {
                hashMap2.put("fbevents_ms", Long.toString(j));
                hashMap2.put("fbevents_prefetched", Boolean.toString(qf6.A0Z));
            }
            long j2 = qf6.A09;
            if (j2 != -1) {
                hashMap2.put("tr_ms", Long.toString(j2));
                hashMap2.put("tr_prefetched", Boolean.toString(qf6.A0a));
            }
            long j3 = qf6.A02;
            if (j3 != -1) {
                hashMap2.put("ga_collect_ms", Long.toString(j3));
                hashMap2.put("ga_collect_prefetched", Boolean.toString(qf6.A0Q));
            }
            long j4 = qf6.A03;
            if (j4 != -1) {
                hashMap2.put("ga_js_ms", Long.toString(j4));
                hashMap2.put("ga_js_prefetched", Boolean.toString(qf6.A0R));
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                this.A1L.A02((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (A0U() != null) {
            this.A1L.A02("user_agent", A0U());
        }
        QF4 A05 = A05(qf6);
        if (A05 != null && (sslError = A05.A04) != null) {
            ACQ acq = this.A1L;
            acq.A02("ssl_error_url", sslError.getUrl());
            acq.A02("ssl_primary_error", AnonymousClass001.A0O("", sslError.getPrimaryError()));
        }
        ABS abs = this.A0O;
        if (abs != null && (abstractC210669Tj = abs.A00) != null && (hashMap = ((DefaultBrowserLiteChrome) abstractC210669Tj).A0J) != null) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                this.A1L.A02((String) entry2.getKey(), Integer.toString(((Number) entry2.getValue()).intValue()));
            }
        }
        ACQ acq2 = this.A1L;
        acq2.A02("nav_bar_back_btn_press", Integer.toString(this.A03));
        if (this.A0u) {
            acq2.A02("close_browser_action", Integer.toString(this.A02));
        }
        acq2.A02("webview_provider_name", "com.facebook.browser.lite.webview.SystemWebView");
        FragmentActivity activity = getActivity();
        if (activity != null && (simpleName = activity.getClass().getSimpleName()) != null) {
            acq2.A02("component_container_name", simpleName);
        }
        boolean z = false;
        if (this.A0W.Aw7().A02() != null) {
            z = true;
        }
        acq2.A00.markerAnnotate(19791876, 0, "has_deep_link", z);
    }

    public final void A0b(EnumC223219t5 enumC223219t5, Integer num, String str) {
        BCL bcl = this.A0N;
        if (bcl != null) {
            long currentTimeMillis = System.currentTimeMillis();
            IABEmptyEvent iABEmptyEvent = IABEvent.A04;
            bcl.Chu(new IABUnifiedEvent(enumC223219t5, num, A0S(), str, currentTimeMillis, currentTimeMillis));
        }
    }

    public final void A0c(String str) {
        if (str == null) {
            str = "";
        }
        String str2 = this.A1A;
        if (str2 != null) {
            str = str2;
        }
        this.A0l = str;
        ABS abs = this.A0O;
        if (abs != null) {
            abs.A00(str);
        }
        List list = this.A0o;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("onSetChromeTitle");
            ACQ acq = this.A1L;
            sb.append(".Start");
            acq.A00(AnonymousClass001.A0g("BLF.plugins.", "onSetChromeTitle", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BEG) it.next()).Dkz(str);
            }
            sb.append(".End");
            acq.A00(sb.toString());
        }
    }

    public boolean A0d() {
        long j;
        Intent intent = this.A07;
        if (intent == null) {
            return false;
        }
        try {
            String A00 = AbstractC111324zv.A00(143);
            C22898A7s c22898A7s = this.A0Z;
            long j2 = c22898A7s.A01;
            if (j2 != -1) {
                j = (SystemClock.elapsedRealtime() - j2) - c22898A7s.A00;
            } else {
                j = 0;
            }
            intent.putExtra(A00, j);
            for (BEG beg : this.A0o) {
                if (!beg.DK1(this.A07, AbstractC58317Pt9.A00(448)) && !beg.DK1(this.A07, "ACTION_META_REWARD_PROMPT_PRE_EXIT_DIALOG_ON_EXIT_BROWSER")) {
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // X.InterfaceC172717mh
    public final void AIE(int i, String str) {
        long j;
        long j2;
        String str2;
        long j3;
        String stringExtra;
        this.A02 = i;
        if (!this.A1D && A0d()) {
            this.A1D = true;
            return;
        }
        BCL bcl = this.A0N;
        if (bcl != null && i == 2 && this.A0x) {
            bcl.Ci0(EnumC223219t5.A1e, C05F.A00);
        }
        C63217SfN c63217SfN = this.A0K;
        if (c63217SfN != null && c63217SfN.A03()) {
            if (A0T() != null) {
                j3 = Long.parseLong(A0T());
            } else {
                j3 = 0;
            }
            String A0S = A0S();
            String str3 = null;
            if (i == 1) {
                str3 = "IAB_CLOSE_BUTTON_CLICK";
            } else if (i == 2) {
                str3 = "IAB_CLOSE_SWIPE_EXIT";
            }
            Intent intent = this.A07;
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra("BWP_MEDIA_ID");
            }
            if (str3 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pageCloseReason", str3);
                hashMap.put("is_organic", String.valueOf(this.A0K.A02));
                hashMap.put("media_id", stringExtra);
                C63305ShB.A00().A04(j3, "PAGE_CLOSED", A0S, hashMap);
            }
        }
        C62965SZi c62965SZi = this.A0J;
        if (c62965SZi != null && c62965SZi.A01()) {
            if (A0T() != null) {
                j2 = Long.parseLong(A0T());
            } else {
                j2 = 0;
            }
            String A0S2 = A0S();
            if (i == 1) {
                str2 = "IAB_CLOSE_BUTTON_CLICK";
            } else if (i == 2) {
                str2 = "IAB_CLOSE_SWIPE_EXIT";
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("pageCloseReason", str2);
            C63305ShB.A00().A03(j2, "PAGE_CLOSED", A0S2, hashMap2);
        }
        BrowserLiteErrorScreen browserLiteErrorScreen = this.A0b;
        if (browserLiteErrorScreen != null) {
            browserLiteErrorScreen.A00();
        }
        BrowserLiteErrorScreen browserLiteErrorScreen2 = this.A0c;
        if (browserLiteErrorScreen2 != null) {
            browserLiteErrorScreen2.A00();
        }
        List list = this.A0o;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("onBrowserClose");
            ACQ acq = this.A1L;
            sb.append(".Start");
            acq.A00(AnonymousClass001.A0g("BLF.plugins.", "onBrowserClose", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BEG) it.next()).D0T();
            }
            sb.append(".End");
            acq.A00(sb.toString());
        }
        if (this.A0L != null) {
            Bundle bundle = new Bundle();
            C22898A7s c22898A7s = this.A0Z;
            long j4 = c22898A7s.A01;
            if (j4 != -1) {
                j = (SystemClock.elapsedRealtime() - j4) - c22898A7s.A00;
            } else {
                j = 0;
            }
            bundle.putLong(AbstractC111324zv.A00(143), j);
            this.A0L.D0U(this.A02, str, bundle);
        }
        C04770Mv.A00.A02(C0LK.A5y, C0M6.CRITICAL_REPORT, "");
    }

    public void AIO(int i, String str) {
        Intent intent = this.A07;
        if (intent != null && intent.getBooleanExtra(AbstractC58317Pt9.A00(528), false)) {
            this.A02 = 11;
        }
    }

    @Override // X.InterfaceC172717mh
    public final /* synthetic */ String B59(String str) {
        if (this instanceof C172707mf) {
            C172707mf c172707mf = (C172707mf) this;
            C2JG A01 = C2JG.A01((UserSession) c172707mf.A08.getValue());
            C14360o3.A07(A01);
            String A02 = A01.A02(new C23523Abd(c172707mf), str);
            C14360o3.A07(A02);
            return A02;
        }
        return str;
    }

    @Override // X.InterfaceC172717mh, X.InterfaceC172727mi
    public final QF6 C9a() {
        Stack stack = this.A1O;
        if (stack.isEmpty()) {
            return null;
        }
        return (QF6) stack.peek();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3.A0H() != false) goto L8;
     */
    @Override // X.InterfaceC172727mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CWX() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.A07
            java.lang.String r4 = r0.getDataString()
            X.QF6 r3 = r5.C9a()
            r2 = 0
            if (r3 == 0) goto L2b
            java.util.Stack r0 = r5.A1O
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L1d
            boolean r0 = r3.A0H()
            r1 = 1
            if (r0 == 0) goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.String r0 = r3.A05()
            if (r1 != 0) goto L2a
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2b
        L2a:
            r2 = 1
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.CWX():boolean");
    }

    @Override // X.InterfaceC172717mh
    public final void Ckl(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
        if (this instanceof C172707mf) {
            C14360o3.A0B(zonePolicy, 2);
        }
        A0W(bundle, iABEvent, zonePolicy, false);
    }

    @Override // X.InterfaceC172717mh
    public final void FD0(VD2 vd2, Integer num) {
        String str;
        String str2;
        VHa vHa;
        VHa vHa2;
        EnumC223299tM enumC223299tM;
        C22907A8c c22907A8c = this.A0a;
        if (c22907A8c != null) {
            C14360o3.A0B(num, 1);
            C2GS c2gs = c22907A8c.A00;
            if (c2gs.A02() != vd2 && !C05F.A04.equals(num) && !C05F.A00.equals(num)) {
                C23016ACq c23016ACq = c22907A8c.A02;
                String name = vd2.name();
                c23016ACq.A02(name);
                C63305ShB A00 = C63305ShB.A00();
                VD2 vd22 = (VD2) c2gs.A02();
                if (vd22 != null) {
                    str = vd22.name();
                } else {
                    str = null;
                }
                switch (num.intValue()) {
                    case 0:
                        str2 = "AUTO";
                        break;
                    case 1:
                        str2 = "AUTO_FULLY_LOADED";
                        break;
                    case 2:
                        str2 = "AUTO_INTERACTIVE";
                        break;
                    case 3:
                        str2 = "MINIMIZE_PEEK_TAP";
                        break;
                    case 4:
                        str2 = "CTA_TAP";
                        break;
                    case 5:
                        str2 = "HEADER_SWIPE";
                        break;
                    case 6:
                        str2 = "HEADER_TAP";
                        break;
                    case 7:
                        str2 = "WEBVIEW_SWIPE";
                        break;
                    case 8:
                        str2 = "WEBVIEW_TAP";
                        break;
                    case 9:
                        str2 = "SURFACE_SWIPE";
                        break;
                    case 10:
                        str2 = "SURFACE_TAP";
                        break;
                    case 11:
                        str2 = "SYSTEM_BACK_PRESS";
                        break;
                    default:
                        str2 = "UNKNOWN";
                        break;
                }
                try {
                    vHa = VHa.valueOf(str);
                } catch (IllegalArgumentException e) {
                    C0K8.A0J("IABEventLogger", "Server and client implementations of IABViewMode are out of sync", e);
                    vHa = VHa.FULL_SCREEN;
                }
                try {
                    vHa2 = VHa.valueOf(name);
                } catch (IllegalArgumentException e2) {
                    C0K8.A0J("IABEventLogger", "Server and client implementations of IABViewMode are out of sync", e2);
                    vHa2 = VHa.FULL_SCREEN;
                }
                try {
                    enumC223299tM = EnumC223299tM.valueOf(str2);
                } catch (IllegalArgumentException e3) {
                    C0K8.A0J("IABEventLogger", "Server and client implementations of IABChangeViewModeReason are out of sync", e3);
                    enumC223299tM = EnumC223299tM.AUTO;
                }
                long now = c23016ACq.A0m.now();
                A00.A06(c22907A8c.A01, new IABChangeViewModeEvent(enumC223299tM, vHa, vHa2, c23016ACq.A0Z, c23016ACq.A0W, now, now), c22907A8c.A03);
                c2gs.A0A(vd2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((requireActivity() instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if ((requireActivity() instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity) != false) goto L14;
     */
    @Override // X.InterfaceC172717mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent getIntent() {
        /*
            r2 = this;
            android.content.Intent r0 = r2.A07
            if (r0 != 0) goto L33
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L34
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L34
            r0 = 467(0x1d3, float:6.54E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 != 0) goto L33
            boolean r0 = r2 instanceof X.C172707mf
            if (r0 == 0) goto L49
            r2.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            boolean r0 = r0 instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity
            if (r0 == 0) goto L4c
        L2b:
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            android.content.Intent r0 = r0.getIntent()
        L33:
            return r0
        L34:
            boolean r0 = r2 instanceof X.C172707mf
            if (r0 == 0) goto L44
            r2.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            boolean r0 = r0 instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity
            if (r0 == 0) goto L47
            goto L2b
        L44:
            r2.requireActivity()
        L47:
            r0 = 1
            goto L4d
        L49:
            r2.requireActivity()
        L4c:
            r0 = 2
        L4d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0i = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.getIntent():android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
    
        if (r8 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0bW, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0151, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r22.A0Q.A00, 36313566239983779L) == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, X.SAg] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.BCL] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onAttach(android.content.Context):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        List list = this.A0o;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("onAttachFragment");
            ACQ acq = this.A1L;
            sb.append(".Start");
            acq.A00(AnonymousClass001.A0g("BLF.plugins.", "onAttachFragment", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BEG) it.next()).Cxb(fragment);
            }
            sb.append(".End");
            acq.A00(sb.toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Stack stack;
        BCL bcl = this.A0N;
        if (bcl != null && !this.A0u) {
            bcl.Ci0(EnumC223219t5.A0U, C05F.A0C);
        }
        if (this.A18 != null) {
            int i = 0;
            while (true) {
                stack = this.A1O;
                if (i >= stack.size()) {
                    break;
                }
                Bundle bundle2 = new Bundle();
                ((SystemWebView) ((AbstractC61598RqN) stack.get(i))).A04.saveState(bundle2);
                bundle.putBundle(AnonymousClass001.A0O("web_view_", i), bundle2);
                i++;
            }
            bundle.putInt("web_view_number", stack.size());
            A4T a4t = this.A18;
            Context context = getContext();
            if (context != null) {
                A4S a4s = a4t.A00;
                Parcel obtain = Parcel.obtain();
                C14360o3.A07(obtain);
                try {
                    try {
                        bundle.writeToParcel(obtain, 0);
                        if (obtain.dataSize() > 10000) {
                            byte[] marshall = obtain.marshall();
                            C1B4 c1b4 = a4s.A00;
                            HashMap hashMap = new HashMap();
                            hashMap.put("__subdir__", "iab_fragment");
                            File AXd = c1b4.AXd(new C1MG(null, context.getDir(AnonymousClass001.A0R("bigbundle_", "iab_fragment"), 0), hashMap, null), 216637974);
                            AXd.mkdir();
                            File[] listFiles = AXd.listFiles();
                            if (listFiles != null) {
                                C0s6 c0s6 = new C0s6(listFiles);
                                while (c0s6.hasNext()) {
                                    File file = (File) c0s6.next();
                                    if (file.lastModified() < System.currentTimeMillis() - TimeUnit.HOURS.toMillis(12L)) {
                                        file.delete();
                                    }
                                }
                            }
                            File createTempFile = File.createTempFile("bundle", "", AXd);
                            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                            try {
                                fileOutputStream.write(marshall);
                                fileOutputStream.close();
                                bundle.clear();
                                bundle.putInt("_bigbundle_length_", marshall.length);
                                bundle.putString("_bigbundle_path_", createTempFile.getPath());
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C20I.A00(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        }
                    } catch (IOException e) {
                        C0K8.A0H("BigBundle", "Could not save to file", e);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
        if (this.A18 == null) {
            C0K8.A0E(this.A0k, "big bundle save/restore enabled but big bundle is null");
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0bW, java.lang.Object] */
    private int A03(int i) {
        QF6 C9a = C9a();
        int i2 = 0;
        if (C9a == null) {
            return 0;
        }
        int i3 = 1;
        if (C9a.A0H()) {
            TIK A01 = C9a.A01();
            int i4 = A01.A00;
            for (int i5 = i4 - 1; i5 > -1; i5--) {
                if (AbstractC63387Sj3.A04(AbstractC08820cl.A01(new Object(), A01.A00(i5).A03)) && (i2 = i2 + 1) == i) {
                    return i5 - i4;
                }
            }
            i3 = A01.A01.size();
        }
        return i - i3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bW, java.lang.Object] */
    public static int A04(BrowserLiteFragment browserLiteFragment) {
        QF6 C9a = browserLiteFragment.C9a();
        if (C9a != null) {
            TIK A01 = C9a.A01();
            int i = A01.A00;
            for (int i2 = i + 1; i2 < A01.A01.size(); i2++) {
                if (AbstractC63387Sj3.A04(AbstractC08820cl.A01(new Object(), A01.A00(i2).A03))) {
                    return i2 - i;
                }
            }
        }
        return 0;
    }

    private String A08(boolean z) {
        A9E a9e;
        Intent intent;
        Intent intent2 = getIntent();
        String A00 = AbstractC58317Pt9.A00(65);
        String stringExtra = intent2.getStringExtra(A00);
        if (A0M(getIntent()) && (a9e = AbstractC23086AFs.A02) != null && (intent = a9e.A01) != null) {
            stringExtra = intent.getStringExtra(A00);
            getIntent().putExtra(A00, stringExtra);
        }
        if (stringExtra == null) {
            if (z) {
                stringExtra = C0HM.A00().toString();
            } else {
                stringExtra = "";
            }
            getIntent().putExtra(A00, stringExtra);
        }
        return stringExtra;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010b, code lost:
    
        if ("dialtone".equals(r1) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        if (android.webkit.URLUtil.isHttpsUrl(r2.toString()) != false) goto L40;
     */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.9vX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X.9vY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C(android.os.Bundle r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0C(android.os.Bundle, boolean):void");
    }

    public static boolean A0L(Intent intent) {
        if (A07(intent) == C05F.A00) {
            return false;
        }
        return true;
    }

    public static final boolean A0O(QF6 qf6, String str) {
        if (!qf6.A0I()) {
            String A05 = qf6.A05();
            if (A05 == null || ReactWebViewManager.BLANK_URL.equals(A05) || A05.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final QF6 A0R() {
        QF6 C9a = C9a();
        if (C9a != null) {
            try {
                ((SystemWebView) C9a).A04.onPause();
            } catch (Exception unused) {
            }
            R7V r7v = ((SystemWebView) C9a).A04;
            r7v.setVisibility(8);
            if (!C18U.A06(C06090Tz.A05, this.A0R.A00, 36313566239262873L)) {
                r7v.stopLoading();
            }
        }
        QF6 A06 = A06();
        List list = this.A0p;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("pushNewWebView");
            ACQ acq = this.A1L;
            sb.append(".Start");
            acq.A00(AnonymousClass001.A0g("BLF.plugins.", "pushNewWebView", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            sb.append(".End");
            acq.A00(sb.toString());
        }
        Stack stack = this.A1O;
        stack.push(A06);
        C23016ACq c23016ACq = this.A0e;
        int size = stack.size();
        if (c23016ACq.A0p) {
            c23016ACq.A05 = Math.max(c23016ACq.A05, size);
        }
        A0K(A06);
        Intent intent = getIntent();
        String A00 = AbstractC58317Pt9.A00(515);
        RiS riS = (RiS) intent.getSerializableExtra(A00);
        if (riS != null) {
            A0Y(riS);
            getIntent().removeExtra(A00);
        }
        Intent intent2 = this.A07;
        if (intent2 != null) {
            if (!AbstractC58317Pt9.A00(627).equals(intent2.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME"))) {
                Intent intent3 = new Intent();
                intent3.setAction(AbstractC111324zv.A00(598));
                this.A06.sendBroadcast(intent3);
            }
        }
        return A06;
    }

    public void A0W(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy, boolean z) {
        C63305ShB A00 = C63305ShB.A00();
        C63305ShB.A02(new C58859QDa(bundle, A00, iABEvent, zonePolicy), A00, z);
    }

    public final void A0Y(RiS riS) {
        QF6 C9a = C9a();
        if (C9a != null && this.A0w) {
            if (C18U.A06(C06090Tz.A05, this.A0Q.A00, 36313566239918242L)) {
                C23016ACq c23016ACq = this.A0e;
                long now = c23016ACq.A0m.now();
                Ckl(this.A09, new IABNonViewableEvent(riS, c23016ACq.A0Q, c23016ACq.A0Z, now, now, c23016ACq.A0L), this.A0f);
                WebSettings settings = ((SystemWebView) C9a).A04.getSettings();
                String A0U = A0U();
                StringBuilder sb = new StringBuilder();
                sb.append(" NV/");
                sb.append(Long.valueOf(riS.A00));
                settings.setUserAgentString(AnonymousClass001.A0R(A0U, sb.toString()));
            }
        }
    }

    public final void A0Z(RiS riS) {
        QF6 C9a = C9a();
        if (C9a != null && this.A0w) {
            if (C18U.A06(C06090Tz.A05, this.A0Q.A00, 36313566239918242L)) {
                C23016ACq c23016ACq = this.A0e;
                long now = c23016ACq.A0m.now();
                Ckl(this.A09, new IABViewableEvent(riS, c23016ACq.A0Q, c23016ACq.A0Z, null, now, now, c23016ACq.A0L), this.A0f);
                ((SystemWebView) C9a).A04.getSettings().setUserAgentString(A0U());
            }
        }
    }

    public final boolean A0e(int i) {
        QF6 C9a = C9a();
        if (C9a == null) {
            return false;
        }
        BrowserLiteWebChromeClient A03 = C9a.A03();
        if (A03 != null && A03.A08.getVisibility() == 0) {
            try {
                BrowserLiteWebChromeClient.A01(A03);
                return true;
            } catch (Throwable unused) {
            }
        } else {
            int A032 = A03(i);
            if (A032 < 0) {
                ((SystemWebView) C9a).A04.goBackOrForward(A032);
            } else {
                if (this.A1O.size() <= 1) {
                    return false;
                }
                A0D(this);
                if (A032 != 0 && !A0e(A032)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC172727mi
    public final void ChS(Uri uri, QF6 qf6, String str, Map map) {
        IABEvent iABEvent;
        if (A0L(getIntent()) && ((A07(getIntent()) == C05F.A0N || A07(getIntent()) == C05F.A0Y) && qf6.A0W)) {
            return;
        }
        if (this.A16 < 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.A16 = currentTimeMillis;
            C23016ACq c23016ACq = this.A0e;
            if (c23016ACq.A0p) {
                c23016ACq.A0M = currentTimeMillis;
                IABEmptyEvent iABEmptyEvent = IABEvent.A04;
                iABEvent = new IABLandingPageStartedEvent(c23016ACq.A0Q, c23016ACq.A0Z, currentTimeMillis, c23016ACq.A0m.now(), c23016ACq.A0g);
            } else {
                iABEvent = IABEvent.A04;
            }
            Ckl(this.A09, iABEvent, this.A0f);
            qf6.A06 = this.A16;
        }
        String obj = uri.toString();
        if (!TextUtils.isEmpty(str)) {
            try {
                ((SystemWebView) qf6).A04.postUrl(obj, str.getBytes(ReactWebViewManager.HTML_ENCODING));
                return;
            } catch (UnsupportedEncodingException e) {
                String str2 = this.A0k;
                if (!AbstractC63254SgB.A00) {
                    return;
                }
                Log.e(str2, "Failed postUrl", e);
                return;
            }
        }
        if (uri == this.A08) {
            PrefetchCacheEntry prefetchCacheEntry = this.A0I.A00;
            String str3 = null;
            if (prefetchCacheEntry != null) {
                str3 = prefetchCacheEntry.A03;
            }
            if (!TextUtils.isEmpty(str3)) {
                if (!obj.equals(str3)) {
                    AbstractC63254SgB.A01(this.A0k, "Prefetch resolved final url %s -> %s", obj, str3);
                }
                obj = str3;
            }
        }
        List list = this.A0p;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("onLoadExternalUrl");
            ACQ acq = this.A1L;
            sb.append(".Start");
            acq.A00(AnonymousClass001.A0g("BLF.plugins.", "onLoadExternalUrl", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC65639Tq2) it.next()).DPh(qf6, obj);
                } catch (Exception e2) {
                    C0K8.A0J("BrowserLiteFragment", "Plugin crashed when handling onLoadExternalUrl", e2);
                    throw e2;
                }
            }
            sb.append(".End");
            acq.A00(sb.toString());
        }
        ACQ acq2 = this.A1L;
        acq2.A00("BLF.loadExternalUrl.Start");
        if (A0L(getIntent()) && ((A07(getIntent()) == C05F.A01 || A07(getIntent()) == C05F.A0C) && qf6.A0W)) {
            ((SystemWebView) qf6).A04.reload();
            return;
        }
        AbstractC63254SgB.A01(this.A0k, "Loading Url-> %s with no delay", obj);
        Iterator it2 = this.A0p.iterator();
        while (it2.hasNext()) {
            if (((InterfaceC65639Tq2) it2.next()).Eir(qf6, obj)) {
                return;
            }
        }
        String str4 = this.A0n;
        if (str4 != null && !str4.isEmpty()) {
            map.put("Referer", str4);
        }
        ((SystemWebView) qf6).A04.loadUrl(obj, map);
        acq2.A00("BLF.loadExternalUrl.End");
    }

    @Override // X.InterfaceC172717mh
    public final void Eg2(int i) {
        QF6 C9a;
        BrowserLiteWebChromeClient A03;
        if (C9a() != null && (C9a = C9a()) != null && (A03 = C9a.A03()) != null) {
            InterfaceC65594Tnc interfaceC65594Tnc = A03.A0D;
            if (interfaceC65594Tnc != null) {
                interfaceC65594Tnc.setProgressBarVisibility(i);
            } else {
                A03.A0B.setVisibility(i);
            }
        }
    }

    @Override // X.InterfaceC172727mi
    public final boolean canGoBack() {
        QF6 C9a = C9a();
        if (C9a == null) {
            return false;
        }
        if (this.A13) {
            if (A03(1) >= 0) {
                return false;
            }
            return true;
        }
        return C9a.A0H();
    }

    @Override // X.InterfaceC172727mi
    public final boolean canGoForward() {
        QF6 C9a = C9a();
        if (C9a == null) {
            return false;
        }
        if (this.A13) {
            if (A04(this) == 0) {
                return false;
            }
            return true;
        }
        return ((SystemWebView) C9a).A04.canGoForward();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r39.A07.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ALLOW_CHROME_URLS", false) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0570, code lost:
    
        if (r2.isEnabled() == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x08c6, code lost:
    
        if (r4 != null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x099e, code lost:
    
        if (r1.getBooleanExtra("BrowserLiteIntent.EXTRA_BONDI_ENABLED", false) == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0b67, code lost:
    
        if (X.AbstractC61546RpQ.A01 != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (r39.A0J.A02() != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0315 A[LOOP:3: B:125:0x030f->B:127:0x0315, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x08de A[LOOP:4: B:130:0x08d8->B:132:0x08de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0cc9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0ce7  */
    /* JADX WARN: Type inference failed for: r0v272, types: [java.lang.Object, X.9u5] */
    /* JADX WARN: Type inference failed for: r1v140 */
    /* JADX WARN: Type inference failed for: r1v141 */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, X.Adj] */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Object, X.WUF] */
    /* JADX WARN: Type inference failed for: r1v99, types: [X.Tnc] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r40) {
        /*
            Method dump skipped, instructions count: 3830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC210669Tj abstractC210669Tj;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome;
        Q5I q5i;
        super.onConfigurationChanged(configuration);
        BCL bcl = this.A0N;
        if (bcl != null && !this.A0u) {
            bcl.Ci0(EnumC223219t5.A0S, C05F.A0C);
        }
        BrowserLiteWrapperView browserLiteWrapperView = this.A0d;
        if (browserLiteWrapperView != null) {
            browserLiteWrapperView.A02();
        }
        ABS abs = this.A0O;
        if (abs != null && (abstractC210669Tj = abs.A00) != null && (q5i = (defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) abstractC210669Tj).A0C) != null && q5i.isShowing()) {
            defaultBrowserLiteChrome.A0C.dismiss();
            defaultBrowserLiteChrome.A0C = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Context context;
        int A02 = C0f9.A02(854155533);
        if (this.A18 == null) {
            this.A18 = new A4T();
        }
        if (bundle != null && (context = getContext()) != null && bundle.get("_bigbundle_length_") != null && bundle.get("_bigbundle_path_") != null) {
            int i = bundle.getInt("_bigbundle_length_");
            String string = bundle.getString("_bigbundle_path_");
            try {
                if (string == null) {
                    C0K8.A0D("BigBundle", "BigBundle file path is null");
                } else {
                    File file = new File(string);
                    if (!file.exists()) {
                        C0K8.A0D("BigBundle", "BigBundle file missing");
                    } else {
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
                                DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
                                try {
                                    byte[] bArr = new byte[i];
                                    dataInputStream.readFully(bArr);
                                    Parcel obtain = Parcel.obtain();
                                    C14360o3.A07(obtain);
                                    try {
                                        obtain.unmarshall(bArr, 0, i);
                                        obtain.setDataPosition(0);
                                        Bundle bundle2 = new Bundle(context.getClass().getClassLoader());
                                        bundle2.readFromParcel(obtain);
                                        bundle.remove("_bigbundle_length_");
                                        bundle.remove("_bigbundle_path_");
                                        bundle.putAll(bundle2);
                                        dataInputStream.close();
                                        bufferedInputStream.close();
                                        file.delete();
                                    } finally {
                                        obtain.recycle();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            file.delete();
                            throw th;
                        }
                    }
                }
                bundle = null;
            } catch (IOException e) {
                C0K8.A0H("BigBundle", "Could not restore", e);
                bundle = null;
            }
        }
        super.onCreate(bundle);
        C0f9.A09(-1374976343, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-578117275);
        this.A1L.A00("BLF.onCreateView");
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.browser_lite_fragment, viewGroup, false);
        C14360o3.A07(inflate);
        this.A0C = inflate;
        C0f9.A09(411889245, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.SPp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, X.AXN] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X.9vU] */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        int A02 = C0f9.A02(302275037);
        InterfaceC65626Tpm interfaceC65626Tpm = this.A17;
        if (interfaceC65626Tpm != null) {
            C65705Tsd.A08.getLifecycle().A0A(interfaceC65626Tpm);
        }
        C63305ShB c63305ShB = this.A0M;
        Context applicationContext = this.A06.getApplicationContext();
        if (c63305ShB.A01 != null) {
            c63305ShB.A02.post(new TNC(applicationContext, c63305ShB));
        }
        AG1 A00 = AG1.A00();
        synchronized (A00) {
            Iterator it = A00.A00.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || weakReference.get() == this) {
                    it.remove();
                }
            }
        }
        ExecutorService executorService = this.A0r;
        if (executorService != null) {
            executorService.shutdownNow();
            this.A0r = null;
        }
        while (true) {
            Stack stack = this.A1O;
            if (!stack.isEmpty()) {
                QF6 qf6 = (QF6) stack.pop();
                qf6.A0B = null;
                if (A0L(getIntent())) {
                    if (stack.isEmpty()) {
                        A9E a9e = new A9E(getIntent(), qf6, this.A0l);
                        a9e.A00 = this.A0j;
                        HashMap hashMap = this.A1R;
                        for (Object obj : hashMap.keySet()) {
                            Object obj2 = hashMap.get(obj);
                            if (obj2 != null) {
                                a9e.A04.put(obj, obj2);
                            }
                        }
                        Intent intent = this.A07;
                        Integer A07 = A07(getIntent());
                        boolean booleanExtra = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_WEBVIEW_HOT_INSTANCE_MEMORY_PRESSURE_ENABLED", false);
                        long longExtra = intent.getLongExtra("BrowserLiteIntent.EXTRA_WEBVIEW_HOT_INSTANCE_CACHE_TTL", LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        AbstractC23086AFs.A02 = a9e;
                        QF6 qf62 = a9e.A02;
                        R7V r7v = ((SystemWebView) qf62).A04;
                        Context context = r7v.getContext();
                        Handler handler = AbstractC23086AFs.A00;
                        Handler handler2 = handler;
                        if (handler == null) {
                            Handler handler3 = new Handler(context.getApplicationContext().getMainLooper());
                            AbstractC23086AFs.A00 = handler3;
                            handler2 = handler3;
                        }
                        handler2.postDelayed(new Object(), longExtra);
                        qf62.A0C = null;
                        r7v.setDownloadListener(null);
                        qf62.A0E(new Object());
                        r7v.setWebChromeClient(null);
                        qf62.A0E = null;
                        qf62.A0D = null;
                        r7v.setOnTouchListener(null);
                        qf62.A0I = null;
                        qf62.A0W = true;
                        WebSettings settings = r7v.getSettings();
                        String userAgentString = settings.getUserAgentString();
                        if (A07 == C05F.A0Y) {
                            str = " FBNV/5";
                        } else {
                            str = " FBNV/1";
                        }
                        if (!userAgentString.endsWith(str)) {
                            settings.setUserAgentString(AnonymousClass001.A0R(userAgentString, str));
                        }
                        if (booleanExtra) {
                            if (AbstractC23086AFs.A03 == null) {
                                AbstractC23086AFs.A03 = new Object();
                            }
                            if (AbstractC23086AFs.A01 == null) {
                                AbstractC23086AFs.A01 = new Object();
                            }
                        }
                    } else {
                        A0J(qf6);
                    }
                } else {
                    A0J(qf6);
                }
            } else {
                super.onDestroy();
                C0f9.A09(1453376115, A02);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(962977713);
        FrameLayout frameLayout = this.A0D;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.A0D = null;
        }
        this.A0C = null;
        ABS abs = this.A0O;
        if (abs != null) {
            abs.A00 = null;
        }
        super.onDestroyView();
        C0f9.A09(-585307556, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(1519663965);
        super.onDetach();
        C0f9.A09(679101474, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        int A02 = C0f9.A02(-1482343754);
        super.onPause();
        QF6 C9a = C9a();
        String str2 = null;
        if (C9a != null) {
            str = C9a.A05();
            str2 = ((SystemWebView) C9a).A04.getTitle();
        } else {
            str = null;
        }
        C63305ShB c63305ShB = this.A0M;
        boolean z = this.A0u;
        Bundle bundle = this.A09;
        C62720SNk c62720SNk = C62720SNk.A02;
        if (c62720SNk == null) {
            c62720SNk = new C62720SNk();
            C62720SNk.A02 = c62720SNk;
        }
        C63305ShB.A02(new C58867QDm(bundle, c63305ShB, this.A0f, str, c62720SNk.A01(), z), c63305ShB, false);
        C23016ACq c23016ACq = this.A0e;
        if (c23016ACq.A0p) {
            c23016ACq.A0I = c23016ACq.A0m.now();
        }
        this.A0Z.A02 = SystemClock.elapsedRealtime();
        List list = this.A0o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((BEG) it.next()).DXq(this.A0u);
            }
        }
        if (this.A0u) {
            C23016ACq c23016ACq2 = this.A0e;
            if (c23016ACq2.A0p) {
                c23016ACq2.A0N = 0L;
            }
            A0E(this, C9a);
            if (!C18U.A06(C06090Tz.A05, this.A0Q.A00, 36313566239721632L)) {
                A09();
            }
            A0I(this, true);
            C63305ShB c63305ShB2 = this.A0M;
            HashMap hashMap = new HashMap();
            Intent intent = getIntent();
            hashMap.put("tap_point", Integer.valueOf(this.A02));
            hashMap.put("total_navigation_number", Integer.valueOf(this.A05));
            hashMap.put("same_domain_navigation_number", Integer.valueOf(this.A04));
            hashMap.put("number_scrolls", Integer.valueOf(this.A1M.A00));
            hashMap.put("EXTRA_HOT_INSTANCE_WILL_BE_USED", Boolean.valueOf(A0L(getIntent())));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                hashMap.put("EXTRA_REFERENCE_ID", extras.getString("EXTRA_REFERENCE_ID"));
            }
            C63305ShB.A02(new QDi(this.A09, c63305ShB2, this.A0f, str, str2, hashMap), c63305ShB2, false);
        }
        C63305ShB c63305ShB3 = this.A0M;
        C63305ShB.A02(new QDU(this.A06.getApplicationContext(), c63305ShB3), c63305ShB3, false);
        C23650Adj c23650Adj = this.A19;
        if (c23650Adj != null) {
            C3MJ c3mj = c23650Adj.A01;
            if (c3mj != null) {
                c3mj.A06(c23650Adj.A02);
                c3mj.A04();
            }
            c23650Adj.A02 = null;
        }
        C0f9.A09(1501722259, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C3MJ c3mj;
        int A02 = C0f9.A02(858974070);
        super.onResume();
        BrowserLiteWrapperView browserLiteWrapperView = this.A0d;
        if (browserLiteWrapperView != null) {
            browserLiteWrapperView.A03();
        }
        Intent intent = this.A07;
        if (intent == null) {
            intent = new Intent();
        }
        this.A0K = C63217SfN.A08.A00(intent);
        Intent intent2 = this.A07;
        if (intent2 == null) {
            intent2 = new Intent();
        }
        this.A0J = C62965SZi.A00(intent2);
        if (this.A07 == null) {
            new Intent();
        }
        C63305ShB c63305ShB = this.A0M;
        C63305ShB.A02(new C58861QDc(this.A07.getBundleExtra(AbstractC58317Pt9.A00(169)), c63305ShB, this.A0f, this.A0m), c63305ShB, false);
        C23016ACq c23016ACq = this.A0e;
        if (c23016ACq.A0p) {
            long j = c23016ACq.A0I;
            if (j != -1) {
                c23016ACq.A0o.add(new ArrayList(Arrays.asList(Long.valueOf(j), Long.valueOf(c23016ACq.A0m.now()))));
            }
        }
        C22898A7s c22898A7s = this.A0Z;
        long j2 = c22898A7s.A02;
        if (j2 != -1) {
            c22898A7s.A00 += SystemClock.elapsedRealtime() - j2;
            c22898A7s.A02 = -1L;
        }
        QF6 C9a = C9a();
        if (C9a != null) {
            R7V r7v = ((SystemWebView) C9a).A04;
            r7v.onResume();
            r7v.resumeTimers();
        }
        if (this.A1K) {
            STG.A00(new TJd(this));
            this.A1K = false;
        }
        List list = this.A0o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        C23650Adj c23650Adj = this.A19;
        if (c23650Adj != null && (c3mj = c23650Adj.A01) != null) {
            c3mj.A03();
            C3MT A00 = C3MJ.A00(c23650Adj);
            c23650Adj.A02 = A00;
            c3mj.A05(A00);
        }
        C0f9.A09(-1537495745, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        int A02 = C0f9.A02(-745114919);
        super.onAttach(activity);
        this.A06 = activity;
        this.A15 = activity.getIntent().getLongExtra(AbstractC58317Pt9.A00(AbstractC62862SUj.MAX_FACTORIAL), 0L);
        C0f9.A09(787829324, A02);
    }
}
