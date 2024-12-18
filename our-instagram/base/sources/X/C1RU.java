package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1RU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RU extends C1RW {
    public C1Rm A00;
    public final Context A01;
    public final C19490xZ A02;
    public final C10040gH A03;
    public final C1RT A04;
    public final C09970fz A08;
    public final Executor A09;
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final Map A05 = new HashMap();
    public final boolean A07 = true;

    public C1RU(Context context, C19490xZ c19490xZ, C09970fz c09970fz, C10040gH c10040gH, C1RT c1rt, Executor executor) {
        this.A01 = context;
        this.A09 = executor;
        this.A02 = c19490xZ;
        this.A04 = c1rt;
        this.A08 = c09970fz;
        this.A03 = c10040gH;
        Throwable th = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (((ConnectivityManager) context.getSystemService("connectivity")) == null) {
            if (th != null) {
                C0K8.A0J("FacebookVoltronDownloader", "Failed to get ConnectivityManager", th);
            } else {
                C0K8.A0E("FacebookVoltronDownloader", "Failed to get ConnectivityManager");
            }
        }
    }

    @Override // X.C1RW
    public final void AOU(C58621Pyp c58621Pyp) {
    }

    @Override // X.C1RW
    public final String getName() {
        return "Facebook";
    }

    @Override // X.C1RW
    public final C58428Pv7 A03(C58621Pyp c58621Pyp) {
        Integer num;
        C1RT c1rt = this.A04;
        ArrayList arrayList = new ArrayList();
        java.util.Set<String> set = c58621Pyp.A02;
        for (String str : set) {
            C0g3 A00 = C0g3.A00();
            int A002 = AbstractC10100gN.A00(str);
            Integer A01 = A00.A01(A002);
            Integer num2 = C05F.A00;
            if (A01 == num2) {
                String A02 = C0g3.A00().A02(str);
                if (A02 == null) {
                    continue;
                } else {
                    if (this.A08.A02(this.A01, str, A02).exists()) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A0N;
                    }
                    C0g3 A003 = C0g3.A00();
                    synchronized (A003) {
                        try {
                            if (A003.A01(A002) == num2) {
                                A003.A03(A002, num);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (C0g3.A00().A01(A002) == C05F.A0N) {
                arrayList.add(str);
            }
        }
        R8D r8d = new R8D();
        C58427Pv6 c58427Pv6 = new C58427Pv6();
        C63210SfF c63210SfF = new C63210SfF(c58621Pyp, new R8F[]{r8d, new R8E(c58427Pv6)}, c58621Pyp.A00);
        if (set.size() == 0) {
            C0K8.A0E("FacebookVoltronDownloader", "startDownload called with no modules!");
            c58427Pv6.A01(new C62674SLm(null, null, 3));
        } else {
            C1UP c1up = (C1UP) C1U4.A00(c1rt.A00).A00("AppModules::PrevDownload");
            C1UP.A03(c1up);
            C1ZT c1zt = new C1ZT(c1up);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c1zt.A0A((String) it.next(), true);
            }
            c1zt.A03();
            Executor executor = this.A09;
            executor.execute(new RunnableC64694TPz(c58621Pyp, c63210SfF, this));
            if (!arrayList.isEmpty()) {
                executor.execute(new TQ0(c58621Pyp, this, arrayList));
            }
        }
        return c58427Pv6.A00;
    }

    @Override // X.C1RW
    public final boolean Cc3(C58428Pv7 c58428Pv7) {
        if (c58428Pv7.A04() == null || ((C62674SLm) c58428Pv7.A04()).A00 != 3) {
            return true;
        }
        return false;
    }
}
