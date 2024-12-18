package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.TFz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64489TFz implements InterfaceC13000lm {
    public int A00;
    public Application A01;
    public C63343Shy A02;
    public AbstractC18680vv A03;
    public final InterfaceC65674Tr4 A04;
    public final BroadcastReceiver A05;
    public final InterfaceC65354Tii A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final T0E A09;

    /* JADX WARN: Type inference failed for: r14v0, types: [X.SJl, java.lang.Object] */
    public static synchronized C63343Shy A00(Application application, C64489TFz c64489TFz) {
        C63343Shy c63343Shy;
        final InterfaceC03200Dd interfaceC03200Dd;
        synchronized (c64489TFz) {
            c63343Shy = c64489TFz.A02;
            if (c63343Shy == null) {
                InterfaceC65674Tr4 interfaceC65674Tr4 = c64489TFz.A04;
                C64500TGm c64500TGm = (C64500TGm) interfaceC65674Tr4;
                synchronized (c64500TGm) {
                    try {
                        int A00 = C64500TGm.A00(c64500TGm, c64500TGm.A08);
                        if (A00 != 0) {
                            C006802i.A0p.markerPoint(A00, "BRIDGE_STARTUP_WILL_START");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                ?? obj = new Object();
                AbstractC18680vv abstractC18680vv = c64489TFz.A03;
                A1E.add(new IgReactPackage(abstractC18680vv));
                Integer num = C05F.A01;
                IgReactExceptionManager A002 = C62815SSm.A00(abstractC18680vv);
                synchronized (S5B.class) {
                    try {
                        interfaceC03200Dd = AbstractC62353S8a.A00;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AbstractC05810Sj.A01(application, "context must be specified");
                R3D r3d = new R3D(MSW.A0w(MSW.A0w(application.getFilesDir(), "optimized-bundle"), "bundle.bytecode").getPath());
                File AXd = C23161Av.A00(application).AXd(null, 969927237);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Executor executor = C03220Df.A07;
                A1E2.add(new AbstractC03210De(AnonymousClass001.A0R("Ig4aBundle.js.hbc", ".sha256"), "bytecode.sha256"));
                final String A0R = AnonymousClass001.A0R("Ig4aBundle.js.hbc", ".spk.xz");
                A1E2.add(new C0QJ(interfaceC03200Dd, A0R) { // from class: X.0iA
                    public final InterfaceC03200Dd A00;

                    {
                        super(A0R, "bundle.bytecode");
                        this.A00 = interfaceC03200Dd;
                    }

                    @Override // X.AbstractC03210De
                    public final InputStream A00(Context context) {
                        return this.A00.AOL(super.A00(context));
                    }
                });
                AbstractC05810Sj.A00(AXd);
                for (int i = 0; i < A1E2.size(); i++) {
                    AbstractC03210De abstractC03210De = (AbstractC03210De) A1E2.get(i);
                    abstractC03210De.A00 = MSW.A0w(AXd, abstractC03210De.A01);
                }
                R3E r3e = new R3E(new C03220Df(application, AXd, "CommonFBRNBundle", A1E2, executor), r3d);
                application.getPackageName();
                C62793SRn.A00();
                c63343Shy = new C63343Shy(application, obj, r3e, A002, num, A1E);
                c63343Shy.A06.toString();
                if (C63255SgD.A02()) {
                    c63343Shy.A05();
                } else {
                    C63255SgD.A01(new TP6(c63343Shy, c64489TFz));
                }
                c64489TFz.A02 = c63343Shy;
                ComponentCallbacks2C63414Sjs componentCallbacks2C63414Sjs = c63343Shy.A07;
                InterfaceC65354Tii interfaceC65354Tii = c64489TFz.A06;
                CopyOnWriteArrayList copyOnWriteArrayList = componentCallbacks2C63414Sjs.A00;
                if (!copyOnWriteArrayList.contains(interfaceC65354Tii)) {
                    copyOnWriteArrayList.add(interfaceC65354Tii);
                }
                C41451vu.A01.A02(c64489TFz.A08, C57432kI.class);
                C0DJ.A00(c64489TFz.A05, application, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
                c64489TFz.A09.A00.add(interfaceC65674Tr4);
            }
        }
        return c63343Shy;
    }

    public static C63343Shy A01(IgReactDelegate igReactDelegate) {
        C64489TFz c64489TFz = igReactDelegate.A06;
        return A00(c64489TFz.A01, c64489TFz);
    }

    public static void A02(C64489TFz c64489TFz) {
        ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget;
        C63343Shy c63343Shy = c64489TFz.A02;
        if (c63343Shy != null) {
            c63343Shy.A07.A00.remove(c64489TFz.A06);
            C41451vu c41451vu = C41451vu.A01;
            c41451vu.A03(c64489TFz.A08, C57432kI.class);
            c64489TFz.A01.unregisterReceiver(c64489TFz.A05);
            C63343Shy c63343Shy2 = c64489TFz.A02;
            c63343Shy2.A0L = true;
            if (c63343Shy2.A0H.booleanValue()) {
                C0I2.A03("ReactNative", "ReactInstanceManager.destroy called: bail out, already destroying");
            } else {
                c63343Shy2.A0H = true;
                C63343Shy.A01(c63343Shy2);
                c63343Shy2.A05.getApplicationContext().unregisterComponentCallbacks(c63343Shy2.A07);
                ReactCxxErrorHandler.setHandleErrorFunc(null, null);
                c63343Shy2.A0J = null;
                java.util.Set<InterfaceC65543TmI> set = c63343Shy2.A0F;
                synchronized (set) {
                    synchronized (c63343Shy2.A0B) {
                        if (c63343Shy2.A0G != null) {
                            for (InterfaceC65543TmI interfaceC65543TmI : set) {
                                if (((Q59) interfaceC65543TmI).A02 == 2) {
                                    C63343Shy.A03(c63343Shy2.A0G, interfaceC65543TmI);
                                }
                            }
                            c63343Shy2.A0G.A06();
                            c63343Shy2.A0G = null;
                        }
                    }
                }
                if (c63343Shy2.A0L && (reactInstanceManagerInspectorTarget = c63343Shy2.A02) != null) {
                    reactInstanceManagerInspectorTarget.close();
                    c63343Shy2.A02 = null;
                }
                c63343Shy2.A0K = false;
                c63343Shy2.A00 = null;
                SXn sXn = SXn.A01;
                synchronized (sXn) {
                    sXn.A00.clear();
                }
                c63343Shy2.A0H = false;
                synchronized (c63343Shy2.A0H) {
                    c63343Shy2.A0H.notifyAll();
                }
                synchronized (c63343Shy2.A0E) {
                }
            }
            c64489TFz.A02 = null;
            c64489TFz.A09.A00.remove(c64489TFz.A04);
            c41451vu.A03(c64489TFz.A07, C2W4.class);
        }
    }

    public C64489TFz(Application application, AbstractC18680vv abstractC18680vv) {
        C64473TFj c64473TFj = new C64473TFj(this, 5);
        this.A07 = c64473TFj;
        this.A06 = new T09(this);
        this.A08 = new C64473TFj(this, 6);
        this.A05 = new Q1k(this, 14);
        this.A01 = application;
        this.A03 = abstractC18680vv;
        this.A04 = AbstractC27401Ut.getInstance().getPerformanceLogger(this.A03);
        T0E t0e = T0E.A01;
        if (t0e == null) {
            t0e = new T0E();
            T0E.A01 = t0e;
        }
        this.A09 = t0e;
        C41451vu.A01.A02(c64473TFj, C2W4.class);
        ReactMarker.addListener(t0e);
    }

    public final void A03() {
        if (C63255SgD.A02()) {
            A02(this);
        } else {
            C63255SgD.A01(new RunnableC64600TLl(this));
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A03();
    }
}
