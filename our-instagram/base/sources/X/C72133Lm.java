package X;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.Window;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72133Lm {
    public static boolean A01;
    public static boolean A02;
    public static final C72133Lm A03 = new Object();
    public static final AtomicInteger A06 = new AtomicInteger(0);
    public static final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public static WeakReference A00 = new WeakReference(null);
    public static final WeakHashMap A04 = new WeakHashMap();
    public static final boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36321451796276690L));

    public final void A02(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        A00 = new WeakReference(activity);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321451796211153L) && ((Boolean) C62921SXd.A01.getValue()).booleanValue()) {
            return;
        }
        AtomicInteger atomicInteger = A06;
        if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        A02 = false;
        if (!C18U.A06(c06090Tz, userSession, 36321451796014543L)) {
            return;
        }
        A00((Activity) A00.get(), false);
    }

    public final void A03(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        A00 = new WeakReference(activity);
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36321451796211153L) && ((Boolean) C62921SXd.A01.getValue()).booleanValue()) || A06.incrementAndGet() != 1) {
            return;
        }
        A02 = true;
        if (!C18U.A06(c06090Tz, userSession, 36321451796014543L)) {
            return;
        }
        A00((Activity) A00.get(), true);
    }

    public static final void A00(Activity activity, boolean z) {
        if (A01 != z && Build.VERSION.SDK_INT >= 34 && activity != null && activity.getWindow() != null) {
            int i = 0;
            Display display = activity.getDisplay();
            if (display != null && display.isHdrSdrRatioAvailable()) {
                C0K8.A0C("FragmentHdrModeSwitch", AnonymousClass001.A1D("change HDR mode: ", z));
                A01 = z;
                Boolean valueOf = Boolean.valueOf(z);
                ConcurrentLinkedQueue concurrentLinkedQueue = A05;
                concurrentLinkedQueue.add(valueOf);
                if (concurrentLinkedQueue.size() > 3) {
                    concurrentLinkedQueue.poll();
                }
                Window window = activity.getWindow();
                if (window != null) {
                    if (z) {
                        i = 2;
                    }
                    window.setColorMode(i);
                }
            }
        }
    }

    public static final boolean A01() {
        if (A01) {
            return true;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = A05;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                Boolean bool = (Boolean) it.next();
                C14360o3.A0A(bool);
                if (bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if ((!r2.isEmpty()) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L45
            boolean r0 = X.C72133Lm.A02
            if (r0 == 0) goto L45
            boolean r0 = X.C72133Lm.A07
            if (r0 == 0) goto L45
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L23
            boolean r0 = r4.hasGainmap()
            if (r0 == 0) goto L23
            java.util.WeakHashMap r1 = X.C72133Lm.A04
            int r0 = r4.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r4, r0)
        L23:
            boolean r0 = X.C72133Lm.A01
            java.lang.String r1 = "FragmentHdrModeSwitch"
            java.util.WeakHashMap r2 = X.C72133Lm.A04
            if (r0 == 0) goto L46
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L42
            java.lang.String r0 = "no hdr images, turn off HDR"
            X.C0K8.A0C(r1, r0)
            r1 = 0
        L37:
            java.lang.ref.WeakReference r0 = X.C72133Lm.A00
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            A00(r0, r1)
        L42:
            r2.size()
        L45:
            return
        L46:
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L42
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72133Lm.A04(android.graphics.Bitmap):void");
    }
}
