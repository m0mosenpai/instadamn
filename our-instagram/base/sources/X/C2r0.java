package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2r0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2r0 implements InterfaceC13000lm {
    public final java.util.Set A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final UserSession A05;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A00 = new ConcurrentHashMap();

    public final List A00(String str) {
        C14360o3.A0B(str, 0);
        java.util.Set set = this.A04;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (C14360o3.A0K(((C45035JwQ) obj).A02, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A01(C45035JwQ c45035JwQ) {
        C14360o3.A0B(c45035JwQ, 0);
        synchronized (this) {
            this.A04.remove(c45035JwQ);
        }
    }

    public final void A02(C45061Jwq c45061Jwq, String str) {
        C14360o3.A0B(str, 0);
        synchronized (this) {
            this.A01.put(str, c45061Jwq);
        }
    }

    public final void A03(String str) {
        synchronized (this) {
            java.util.Set set = this.A02;
            if (!set.contains(str)) {
                set.add(str);
            }
        }
    }

    public final void A04(String str) {
        synchronized (this) {
            Map map = this.A01;
            C45061Jwq c45061Jwq = (C45061Jwq) map.get(str);
            if (c45061Jwq != null) {
                this.A00.put(str, c45061Jwq);
                map.remove(str);
            }
        }
    }

    public final boolean A05(String str) {
        boolean contains;
        synchronized (this) {
            contains = this.A02.contains(str);
        }
        return contains;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r2.A00.containsKey(r3) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L16
            java.util.Map r0 = r2.A00     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            if (r1 == 0) goto L17
        L16:
            r0 = 1
        L17:
            monitor-exit(r2)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2r0.A06(java.lang.String):boolean");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            this.A01.clear();
            this.A03.clear();
            this.A04.clear();
            this.A00.clear();
        }
    }

    public C2r0(UserSession userSession) {
        this.A05 = userSession;
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        C14360o3.A07(newKeySet);
        this.A03 = newKeySet;
        ConcurrentHashMap.KeySetView newKeySet2 = ConcurrentHashMap.newKeySet();
        C14360o3.A07(newKeySet2);
        this.A02 = newKeySet2;
        ConcurrentHashMap.KeySetView newKeySet3 = ConcurrentHashMap.newKeySet();
        C14360o3.A07(newKeySet3);
        this.A04 = newKeySet3;
    }
}
