package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.29X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29X implements C29Y {
    public C106744rW A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final UserSession A06;
    public final Map A07;
    public final CopyOnWriteArraySet A08;

    public C29X(UserSession userSession) {
        C14360o3.A0B(userSession, 4);
        this.A07 = new HashMap();
        this.A05 = new Handler(Looper.getMainLooper());
        this.A08 = new CopyOnWriteArraySet();
        this.A06 = userSession;
    }

    private final void A00() {
        this.A03 = AnonymousClass218.A00(this.A06).booleanValue();
        this.A04 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (r5 == 10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.EnumC53322cG r59, X.AbstractC53312cF r60, X.C29X r61) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29X.A01(X.2cG, X.2cF, X.29X):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    private final void A02(String str, final boolean z) {
        final ?? obj = new Object();
        Map map = this.A07;
        synchronized (map) {
            obj.A00 = map.remove(str);
        }
        if (obj.A00 != null) {
            if (!C11T.A08()) {
                this.A05.post(new Runnable() { // from class: X.4CE
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29X.A05((java.util.Set) obj.A00, z);
                    }
                });
            } else {
                A05((java.util.Set) obj.A00, z);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0481  */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.0ps, java.lang.Object] */
    @Override // X.C29Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATC(final X.AbstractC53312cF r28, int r29) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29X.ATC(X.2cF, int):void");
    }

    public static final void A03(java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4AF A00 = ((C4AD) it.next()).A00();
            if (A00 != null) {
                A00.DzR();
            }
        }
    }

    public static final void A04(java.util.Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4AF A00 = ((C4AD) it.next()).A00();
            if (A00 != null) {
                A00.DzS(z);
            }
        }
    }

    public static final void A05(java.util.Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4AF A00 = ((C4AD) it.next()).A00();
            if (A00 != null) {
                A00.DzT(z);
            }
        }
    }
}
