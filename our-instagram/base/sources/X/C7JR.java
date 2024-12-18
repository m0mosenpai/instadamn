package X;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7JR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7JR implements C3MR {
    public C3MJ A00;
    public C3MT A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final C41761wQ A05 = new C41761wQ(AbstractC142856cl.A01);
    public final UserSession A06;
    public final C7U0 A07;
    public final List A08;
    public final C9BW A09;
    public final C9BW A0A;
    public final C9BW A0B;
    public final InterfaceC08830cm A0C;

    private final boolean A01(C9BW c9bw) {
        InterfaceC164227Wl interfaceC164227Wl = (InterfaceC164227Wl) c9bw.A01;
        boolean CYr = interfaceC164227Wl.CYr();
        if (!CYr && !interfaceC164227Wl.CYs()) {
            return false;
        }
        ((C7JN) c9bw.A00).CnC((InterfaceC83733oI) this.A0C.get(), CYr);
        return true;
    }

    public static final boolean A02(C7JR c7jr) {
        List list = c7jr.A08;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC164227Wl) ((C9BW) it.next()).A01).CeO()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C3MR
    public final void Dih(long j) {
        if (!A01(this.A0A) && !A01(this.A0B)) {
            A01(this.A09);
        }
    }

    public C7JR(Activity activity, Context context, C9BW c9bw, C9BW c9bw2, C9BW c9bw3, UserSession userSession, C7U0 c7u0, InterfaceC08830cm interfaceC08830cm) {
        this.A03 = activity;
        this.A06 = userSession;
        this.A0A = c9bw;
        this.A0B = c9bw2;
        this.A09 = c9bw3;
        this.A0C = interfaceC08830cm;
        this.A04 = context;
        this.A07 = c7u0;
        this.A08 = AbstractC16960so.A1R(c9bw, c9bw2, c9bw3);
    }

    public static final void A00(Window window, C7JR c7jr) {
        if (A02(c7jr) && !AbstractC93174Ft.A03(c7jr.A04)) {
            List list = c7jr.A08;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC164227Wl) ((C9BW) it.next()).A01).CYr()) {
                        break;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC164227Wl) ((C9BW) it2.next()).A01).CYs()) {
                        C162317Ot A00 = C162317Ot.A02.A00();
                        if (window != null) {
                            A00.A01(window, "ScreenshotNotificationManager");
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        } else if (c7jr.A02) {
            return;
        } else {
            c7jr.A02 = true;
        }
        C162317Ot A002 = C162317Ot.A02.A00();
        if (window != null) {
            A002.A02(window, "ScreenshotNotificationManager");
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
