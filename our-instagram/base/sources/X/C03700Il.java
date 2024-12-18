package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebViewFactory;
import android.webkit.WebViewFactoryProvider;
import com.facebook.common.build.BuildConstants;
import com.facebook.vmasaver.VmaSaver;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

/* renamed from: X.0Il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03700Il extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03700Il(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.14l
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "HeliumInitializer";
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [X.4ql, java.lang.Object] */
            @Override // X.AbstractC211911v
            public final void A07() {
                String str;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A08, 36321361601242465L)) {
                    if (!BuildConstants.A02() && C18U.A06(c06090Tz, A08, 2342164370815591785L)) {
                        return;
                    }
                    final Context context2 = this.A00;
                    C14360o3.A0B(context2, 0);
                    if (!AbstractC10000gD.A01(context2, "heliumiab")) {
                        return;
                    }
                    final C106234qd c106234qd = new C106234qd(context2, A08);
                    try {
                        C18950wb c18950wb = C18950wb.A01;
                        C14360o3.A0B(c18950wb, 0);
                        AbstractC106244qe.A00 = c18950wb;
                        if (!C18U.A06(c06090Tz, c106234qd.A01, 36321361601242465L)) {
                            C0K8.A0C("HeliumWebViewFactoryProvider", "Unable to initialize, user did not pass the use_helium GK");
                            return;
                        }
                        if (AbstractC106254qf.A02) {
                            str = "Unable to initialize, Helium lazy provider already installed";
                        } else {
                            final C106264qg A00 = C106264qg.A00();
                            Field field = A00.A00;
                            if (field.get(null) != null) {
                                str = "Unable to initialize, non-Helium provider already installed";
                            } else {
                                AbstractC106254qf.A01 = new C106274qh(c106234qd);
                                final Callable callable = new Callable() { // from class: X.4qi
                                    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.RqV] */
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        String A04;
                                        short s;
                                        File filesDir;
                                        File parentFile;
                                        File canonicalFile;
                                        C61606RqV c61606RqV;
                                        String str2;
                                        C106234qd c106234qd2 = c106234qd;
                                        C0w9 c0w9 = C0w9.A01;
                                        c0w9.EmN("helium:lazy_webview_activated", "WebViewProvider accessed lazily");
                                        C006802i c006802i = C006802i.A0p;
                                        C14360o3.A07(c006802i);
                                        c006802i.markerStart(47655768);
                                        try {
                                            c006802i.markerPoint(47655768, "device_eligibility_start");
                                            Integer A01 = AbstractC106254qf.A01();
                                            boolean z = false;
                                            if (A01 == C05F.A00) {
                                                z = true;
                                            }
                                            boolean z2 = false;
                                            Object obj = null;
                                            if (!z) {
                                                switch (A01.intValue()) {
                                                    case 1:
                                                        str2 = "FAIL_WOULD_DOWNGRADE_USER_PROFILE";
                                                        break;
                                                    case 2:
                                                        str2 = "FAIL_PRELOADS_TRAMPOLINE_NOT_OPERATIONAL";
                                                        break;
                                                    case 3:
                                                        str2 = "FAIL_LIBRARY_ON_ASEC";
                                                        break;
                                                    default:
                                                        str2 = "PASS";
                                                        break;
                                                }
                                                C0K8.A0P("HeliumWebViewFactoryProvider", "Device ineligible for Helium: %s", str2);
                                                c006802i.markerPoint(47655768, "device_eligibility_fail", str2);
                                                s = 4;
                                            } else {
                                                c006802i.markerPoint(47655768, "device_eligibility_end");
                                                if (!BuildConstants.A02()) {
                                                    c006802i.markerPoint(47655768, "reclaim_address_space_start");
                                                    VmaSaver.freeWebviewReservedMemory();
                                                    c006802i.markerPoint(47655768, "reclaim_address_space_end");
                                                }
                                                Context context3 = context2;
                                                SVR svr = new SVR(context3);
                                                c006802i.markerAnnotate(47655768, "split_apk_exists", AbstractC10000gD.A01(context3, "heliumiab"));
                                                if (AbstractC106254qf.A00 != null) {
                                                    z2 = true;
                                                }
                                                c006802i.markerAnnotate(47655768, "voltron_preloaded", z2);
                                                if (AbstractC106254qf.A00 == null) {
                                                    c006802i.markerPoint(47655768, "voltron_load_start");
                                                    try {
                                                        Context context4 = c106234qd2.A00;
                                                        C10050gI A002 = C10050gI.A00(context4, C19490xZ.A00(context4), C09860fm.A00(context4));
                                                        synchronized (S6D.class) {
                                                            C61606RqV c61606RqV2 = S6D.A00;
                                                            c61606RqV = c61606RqV2;
                                                            if (c61606RqV2 == null) {
                                                                ?? obj2 = new Object();
                                                                A002.A03("heliumiab");
                                                                S6D.A00 = obj2;
                                                                c61606RqV = obj2;
                                                            }
                                                        }
                                                        AbstractC106254qf.A00 = c61606RqV;
                                                        c006802i.markerPoint(47655768, MSV.A00(1715));
                                                    } catch (FileNotFoundException e) {
                                                        c006802i.markerPoint(47655768, "voltron_load_fail");
                                                        C0f6 c0f6 = AbstractC106244qe.A00;
                                                        if (c0f6 != null) {
                                                            C0f5 AEp = c0f6.AEp(AbstractC111324zv.A00(2470), 19791876);
                                                            AEp.ERI(e);
                                                            AEp.report();
                                                        }
                                                        c0w9.EmT("helium:voltron_load_error", "Failed to load Helium Voltron module", 1, e);
                                                        return null;
                                                    }
                                                }
                                                boolean z3 = false;
                                                try {
                                                    File A003 = SVR.A00(svr, "d.libhelium.so");
                                                    if (A003.exists() && (filesDir = svr.A00.getFilesDir()) != null && (parentFile = filesDir.getParentFile()) != null && (canonicalFile = parentFile.getCanonicalFile()) != null) {
                                                        File canonicalFile2 = A003.getCanonicalFile();
                                                        C14360o3.A07(canonicalFile2);
                                                        z3 = MT6.A05(canonicalFile2, canonicalFile);
                                                    }
                                                } catch (IOException e2) {
                                                    C0K8.A05(SVR.class, "There was an error determining whether the split APK was installed.", e2);
                                                }
                                                if (!z3) {
                                                    C61606RqV c61606RqV3 = AbstractC106254qf.A00;
                                                    C27101Tj A012 = C11X.A00().A01();
                                                    AbstractC12990ll abstractC12990ll = c106234qd2.A01;
                                                    C06090Tz c06090Tz2 = C06090Tz.A05;
                                                    boolean A06 = C18U.A06(c06090Tz2, abstractC12990ll, 36321361602618737L);
                                                    boolean A062 = C18U.A06(c06090Tz2, abstractC12990ll, 2342164370815198564L);
                                                    if (!C18U.A06(c06090Tz2, abstractC12990ll, 36321361602028906L)) {
                                                        A04 = "";
                                                    } else {
                                                        A04 = C18U.A04(c06090Tz2, abstractC12990ll, 36884311555375681L);
                                                    }
                                                    C14360o3.A0A(A04);
                                                    long A013 = C18U.A01(c06090Tz2, abstractC12990ll, 36602836578800465L);
                                                    String A042 = C18U.A04(c06090Tz2, abstractC12990ll, 36884311555768898L);
                                                    boolean z4 = false;
                                                    if (C106434qx.A00.A01(c106234qd2.A00, C18U.A06(c06090Tz2, abstractC12990ll, 2342164370815460711L), C18U.A06(c06090Tz2, abstractC12990ll, 36321361602225516L)) == C05F.A0Y) {
                                                        z4 = true;
                                                    }
                                                    SJ8 sj8 = new SJ8(A04, A042, A013, A06, A062, z4, C18U.A06(C06090Tz.A06, abstractC12990ll, 36330879248778300L), C18U.A06(c06090Tz2, abstractC12990ll, 36330879248909374L));
                                                    C18920wW A02 = AbstractC12220kQ.A02(abstractC12990ll);
                                                    C14360o3.A0C(A02, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.base.Logger<kotlin.Any>");
                                                    obj = c61606RqV3.A01(context3, A012, A02, svr, sj8, c006802i, AnonymousClass194.A02(C12L.A00.AOT(860110062, 3)));
                                                    if (obj != null) {
                                                        AbstractC106254qf.A03 = true;
                                                        s = 2;
                                                    } else {
                                                        c006802i.markerPoint(47655768, "voltron_load_fail");
                                                        throw new IllegalStateException("Helium loading failed");
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Goofy linking required, but unsupported");
                                                }
                                            }
                                            c006802i.markerEnd(47655768, s);
                                            return obj;
                                        } catch (Throwable th) {
                                            c0w9.EmT("helium:provider_load_error", "Failed to load Helium WebViewFactoryProvider", 1, th);
                                            c006802i.markerEnd(47655768, (short) 3);
                                            throw th;
                                        }
                                    }
                                };
                                final Callable callable2 = new Callable() { // from class: X.4qj
                                    @Override // java.util.concurrent.Callable
                                    public final /* bridge */ /* synthetic */ Object call() {
                                        Context context3 = context2;
                                        PackageManager packageManager = context3.getPackageManager();
                                        packageManager.getClass();
                                        return packageManager.getPackageInfo(context3.getPackageName(), 0);
                                    }
                                };
                                final Object obj = new Object();
                                Object newProxyInstance = Proxy.newProxyInstance(WebViewFactory.class.getClassLoader(), new Class[]{WebViewFactoryProvider.class}, new InvocationHandler() { // from class: X.4qk
                                    @Override // java.lang.reflect.InvocationHandler
                                    public final Object invoke(Object obj2, Method method, Object[] objArr) {
                                        Object obj3;
                                        if (method.getDeclaringClass() == Object.class && method.getName().equals("toString")) {
                                            return "java.lang.Proxy (lazy WebViewFactoryProvider)";
                                        }
                                        synchronized (obj) {
                                            C106264qg c106264qg = C106264qg.this;
                                            Field field2 = c106264qg.A00;
                                            obj3 = field2.get(null);
                                            if (obj3 == obj2) {
                                                try {
                                                    PackageInfo packageInfo = (PackageInfo) callable2.call();
                                                    Field field3 = c106264qg.A01;
                                                    field3.set(null, packageInfo);
                                                    obj3 = callable.call();
                                                    if (obj3 != null) {
                                                        field2.get(null);
                                                        field2.set(null, obj3);
                                                    } else {
                                                        try {
                                                            field3.set(null, null);
                                                            field2.get(null);
                                                            field2.set(null, null);
                                                            obj3 = c106264qg.A02.invoke(null, new Object[0]);
                                                            obj3.getClass();
                                                        } catch (Throwable th) {
                                                            C0K8.A0F("WebViewFactoryBridge", "Failed to fallback to system WebViewFactoryProvider", th);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    C0K8.A0F("WebViewFactoryBridge", "Failed to get PackageInfo", th2);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        if (obj3 != null) {
                                            return method.invoke(obj3, objArr);
                                        }
                                        throw new RuntimeException("Expected non-null provider");
                                    }
                                });
                                if (field.get(null) != null) {
                                    throw new IllegalStateException("WebViewFactoryProvider already set");
                                }
                                field.set(null, newProxyInstance);
                                AbstractC83633o6.A00 = new Object();
                                AbstractC106254qf.A02 = true;
                                return;
                            }
                        }
                        C0K8.A0D("HeliumWebViewFactoryProvider", str);
                    } catch (ReflectiveOperationException e) {
                        C0K8.A0F("HeliumInitializer", "Failed to access WebViewFactory", e);
                    }
                }
            }
        };
    }
}
