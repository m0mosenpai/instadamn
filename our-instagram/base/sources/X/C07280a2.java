package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.StringTreeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07280a2 implements C0OO, C0L3 {
    public static C07280a2 A03;
    public final C0LW A00;
    public final C0Pe A01;
    public final List A02 = new ArrayList();

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    @Override // X.C0L3
    public final void Cwx() {
    }

    @Override // X.C0L3
    public final void Cx1() {
        A00(null, null, null);
    }

    public final void A00(final String str, final String str2, final WeakReference weakReference) {
        String str3 = "";
        if (str == null || str.equals("")) {
            str = "empty";
        }
        if (str2 == null || str2.equals("")) {
            str2 = "empty";
        }
        C003801d c003801d = this.A01.A03;
        C02R.A03(c003801d, "Did you call SessionManager.init()?");
        Object obj = c003801d.A02;
        synchronized (obj) {
            c003801d.A0D(str, 3, 80);
            C003801d.A02(c003801d);
        }
        synchronized (obj) {
            if (str2.length() < 80) {
                c003801d.A0D(str2, 85, 80);
            } else {
                String substring = str2.substring(0, 80);
                str3 = str2.substring(80);
                c003801d.A0D(substring, 85, 80);
            }
            c003801d.A0D(str3, 622, StringTreeSet.MAX_SYMBOL_COUNT);
            String str4 = c003801d.A00;
            if (str4 != null) {
                c003801d.A0D(str4, 1778, 207);
            }
            C003801d.A02(c003801d);
            c003801d.A00 = str2;
        }
        C04670Mj c04670Mj = C0L6.A04;
        if (c04670Mj != null) {
            c04670Mj.A03 = str;
            c04670Mj.A02 = str2;
            SystemClock.uptimeMillis();
        }
        synchronized (C0L6.class) {
            if (!str2.equals(C0L6.A05)) {
                C0L6.A05 = str2;
                final HashSet hashSet = new HashSet(C0L6.A01);
                C0L6.A03.execute(new Runnable() { // from class: X.0Kx
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet2 = hashSet;
                        String str5 = str;
                        String str6 = str2;
                        WeakReference weakReference2 = weakReference;
                        boolean z = C0L6.A06;
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            ((C0L2) it.next()).DDi(str5, str6, weakReference2);
                        }
                    }
                });
            }
        }
        C024209q c024209q = new C024209q(null);
        c024209q.A02(C0LK.A1w, Long.valueOf(SystemClock.uptimeMillis()));
        C0LW c0lw = this.A00;
        c0lw.A09(c024209q, C0M6.CRITICAL_REPORT, this);
        c0lw.A09(c024209q, C0M6.LARGE_REPORT, this);
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onEndpointChanged");
        }
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0P;
    }

    @Override // X.C0OO
    public final void start() {
        A03 = this;
    }

    public C07280a2(C0LW c0lw, C0Pe c0Pe) {
        this.A01 = c0Pe;
        this.A00 = c0lw;
        C0L6.A03(this, false);
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
