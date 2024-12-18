package X;

import android.app.Application;
import android.os.Looper;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15310pl extends AbstractC004301i {
    public final int A00;
    public final Object A01;

    public C15310pl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, X.0N7] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0yk, java.lang.Object] */
    @Override // X.AbstractC004301i
    public final Object A00() {
        int i;
        Object c0mv;
        int i2;
        C04480Lp c04480Lp;
        InterfaceC024309r interfaceC024309r;
        switch (this.A00) {
            case 0:
                return this.A01;
            case 1:
                return ((InterfaceC08830cm) this.A01).get();
            case 2:
                return new Object();
            case 3:
                C0NK c0nk = (C0NK) this.A01;
                InterfaceC08830cm interfaceC08830cm = c0nk.A0A;
                if (interfaceC08830cm == null) {
                    interfaceC08830cm = new C15310pl(c0nk, 2);
                    c0nk.A0A = interfaceC08830cm;
                }
                C05110Pb c05110Pb = (C05110Pb) interfaceC08830cm.get();
                String str = C0Np.A00;
                List list = C0MK.A03;
                android.net.Uri A03 = AbstractC08820cl.A03(C0NK.A0l);
                if (str != null) {
                    A03 = A03.buildUpon().authority(C0Np.A00).build();
                    interfaceC024309r = new Object();
                } else {
                    long j = c0nk.A0H;
                    ?? obj = new Object();
                    obj.A00 = j;
                    interfaceC024309r = obj;
                }
                return new C0MK(A03, interfaceC024309r, c05110Pb);
            case 4:
                return new C10710hf(this);
            case 5:
                C003801d c003801d = ((C0NK) this.A01).A05().A03;
                C02R.A03(c003801d, "Did you call SessionManager.init()?");
                return new C0AK(c003801d.A01.A01);
            case 6:
                C0NK c0nk2 = (C0NK) this.A01;
                return new C04480Lp(new File(c0nk2.A05().A06, "reports"), c0nk2.A0G, c0nk2.A0I, c0nk2.A0c);
            case 7:
                C0NK c0nk3 = (C0NK) this.A01;
                C0NK c0nk4 = C0NK.A0k;
                return new C0NN(c0nk3.A0J);
            case 8:
                AbstractC09780fb.A01("ReportSender", -502419827);
                try {
                    C0NK c0nk5 = (C0NK) this.A01;
                    if (c0nk5.A09 == null && c0nk5.A0I > 0 && c0nk5.A0A()) {
                        c0nk5.A09 = new C15310pl(c0nk5, 6);
                    }
                    InterfaceC08830cm interfaceC08830cm2 = c0nk5.A09;
                    Application application = c0nk5.A0J;
                    InterfaceC08830cm interfaceC08830cm3 = c0nk5.A0a;
                    InterfaceC08830cm interfaceC08830cm4 = c0nk5.A0P;
                    InterfaceC08830cm interfaceC08830cm5 = c0nk5.A0O;
                    InterfaceC08830cm interfaceC08830cm6 = c0nk5.A0Y;
                    InterfaceC08830cm interfaceC08830cm7 = c0nk5.A05;
                    if (interfaceC08830cm7 == null) {
                        interfaceC08830cm7 = new C15310pl(c0nk5, 3);
                        c0nk5.A05 = interfaceC08830cm7;
                    }
                    InterfaceC08830cm A06 = c0nk5.A06();
                    InterfaceC08830cm interfaceC08830cm8 = c0nk5.A04;
                    if (interfaceC08830cm8 == null) {
                        interfaceC08830cm8 = new C15310pl(c0nk5, 12);
                        c0nk5.A04 = interfaceC08830cm8;
                    }
                    C0MV c0mv2 = (C0MV) interfaceC08830cm8.get();
                    Executor executor = (Executor) c0nk5.A0V.get();
                    if (interfaceC08830cm2 == null) {
                        c04480Lp = null;
                    } else {
                        c04480Lp = (C04480Lp) interfaceC08830cm2.get();
                    }
                    c0mv = new C0PR(application, c0mv2, c04480Lp, new Runnable() { // from class: X.0NJ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0K8.A0D("lacrima", "Deleting report, reached max attempt count");
                        }
                    }, executor, interfaceC08830cm3, interfaceC08830cm4, interfaceC08830cm5, interfaceC08830cm6, interfaceC08830cm7, A06, c0nk5.A0c, c0nk5.A0e);
                    i2 = 799808675;
                    AbstractC09780fb.A00(i2);
                    return c0mv;
                } catch (Throwable th) {
                    th = th;
                    i = 1393289732;
                    AbstractC09780fb.A00(i);
                    throw th;
                }
            case 9:
                C0NK c0nk6 = (C0NK) this.A01;
                C0NK c0nk7 = C0NK.A0k;
                Application application2 = c0nk6.A0J;
                c0nk6.A0S.get();
                return new RunnableC05150Ph(application2);
            case 10:
                C0NK c0nk8 = (C0NK) this.A01;
                InterfaceC08830cm interfaceC08830cm9 = c0nk8.A06;
                if (interfaceC08830cm9 == null) {
                    interfaceC08830cm9 = new C10650hZ(c0nk8);
                    c0nk8.A06 = interfaceC08830cm9;
                }
                return new C10760hk((InterfaceC04650Mh) interfaceC08830cm9.get());
            case 11:
                AbstractC09780fb.A01("ReportAssembler", 758138135);
                try {
                    C0NK c0nk9 = (C0NK) this.A01;
                    C0Pe A05 = c0nk9.A05();
                    InterfaceC08830cm interfaceC08830cm10 = c0nk9.A08;
                    if (interfaceC08830cm10 == null) {
                        interfaceC08830cm10 = new C15310pl(c0nk9, 10);
                        c0nk9.A08 = interfaceC08830cm10;
                    }
                    c0mv = new C0PI((C10760hk) interfaceC08830cm10.get(), A05);
                    i2 = 888590823;
                    AbstractC09780fb.A00(i2);
                    return c0mv;
                } catch (Throwable th2) {
                    th = th2;
                    i = -1976627921;
                    AbstractC09780fb.A00(i);
                    throw th;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC09780fb.A01("GlobalCleanup", -2105190483);
                try {
                    List list2 = C0MV.A05;
                    C0NK c0nk10 = (C0NK) this.A01;
                    C0NK c0nk11 = C0NK.A0k;
                    Application application3 = c0nk10.A0J;
                    c0mv = new C0MV(application3, new Object(), application3.getDir("errorreporting", 0));
                    i2 = -1214118721;
                    AbstractC09780fb.A00(i2);
                    return c0mv;
                } catch (Throwable th3) {
                    th = th3;
                    i = -414201066;
                    AbstractC09780fb.A00(i);
                    throw th;
                }
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C0MF.A00(C0Pe.A0A, C20150ym.A07(AbstractC20100yh.A00(36312483905143944L)));
            default:
                if (C20150ym.A07(AbstractC20100yh.A00(36325450410112076L))) {
                    return new C0AM(Looper.getMainLooper().getQueue());
                }
                return new C0AM();
        }
    }
}
