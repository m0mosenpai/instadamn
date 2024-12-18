package X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4pU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105574pU {
    public boolean A01;
    public String A04;
    public WeakReference A05;
    public final long A06;
    public final QuickPerformanceLogger A07;
    public final java.util.Set A08;
    public final boolean A09;
    public final long A0A;
    public final Handler A0B;
    public final AbstractC105554pS A0C;
    public final boolean A0D;
    public final boolean A0E;
    public int A03 = 21371299;
    public int A02 = 1;
    public int A00 = 0;

    public final synchronized void A02(String str, String str2) {
        this.A07.markerAnnotate(this.A03, this.A02, str, str2);
    }

    public static long A00(WeakReference weakReference) {
        long j;
        long A00;
        if (weakReference == null) {
            return 0L;
        }
        Object obj = weakReference.get();
        if (obj == null) {
            return 1L;
        }
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            j = 3 | ((fragment.isAdded() ? 1 : 0) << 4) | ((fragment.mDetached ? 1 : 0) << 5) | ((fragment.isHidden() ? 1 : 0) << 6) | ((fragment.mInLayout ? 1 : 0) << 7) | ((fragment.mRemoving ? 1 : 0) << 8) | ((fragment.isResumed() ? 1 : 0) << 9);
            try {
                A00 = (fragment.isVisible() ? 1 : 0) << 10;
            } catch (NullPointerException unused) {
                return j;
            }
        } else if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            j = 7 | ((activity.isTaskRoot() ? 1 : 0) << 4) | ((activity.isChild() ? 1 : 0) << 5) | ((activity.isFinishing() ? 1 : 0) << 6) | ((activity.isChangingConfigurations() ? 1 : 0) << 7) | ((activity.isDestroyed() ? 1 : 0) << 8);
            if (Build.VERSION.SDK_INT >= 31) {
                A00 = CCN.A00(activity) << 9;
            } else {
                return j;
            }
        } else {
            return 15L;
        }
        return j | A00;
    }

    public final synchronized void A01() {
        int i = this.A03;
        int i2 = this.A02;
        long A00 = A00(this.A05);
        QuickPerformanceLogger quickPerformanceLogger = this.A07;
        quickPerformanceLogger.markerAnnotate(i, this.A02, "surface_state_on_end", A00);
        quickPerformanceLogger.markerPoint(i, i2, "surface_exit", null, -1L, TimeUnit.NANOSECONDS, 1);
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((InterfaceC105444pF) it.next()).ATm(this.A02);
        }
        this.A01 = false;
        System.gc();
        this.A0B.postDelayed(new RunnableC58468Pvt(this, this.A04, this.A05, i, i2), this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r3.A02() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (X.AbstractC06440Vm.A01(21371299) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03(java.lang.String r22, java.lang.ref.WeakReference r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105574pU.A03(java.lang.String, java.lang.ref.WeakReference, boolean):void");
    }

    public C105574pU(Handler handler, AbstractC105554pS abstractC105554pS, QuickPerformanceLogger quickPerformanceLogger, java.util.Set set, long j, long j2, boolean z, boolean z2, boolean z3) {
        abstractC105554pS = abstractC105554pS == null ? new AbstractC105554pS() : abstractC105554pS;
        this.A07 = quickPerformanceLogger;
        this.A0B = handler;
        this.A0C = abstractC105554pS;
        this.A06 = j;
        this.A08 = set;
        this.A0A = j2;
        this.A0E = z;
        this.A0D = z2;
        this.A09 = z3;
    }
}
