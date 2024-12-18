package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TwI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65911TwI {
    public static boolean A02;
    public static boolean A03;
    public static final C44060Jdl A04 = new Object();
    public final C66053Tyq A00;
    public final UserSession A01;

    public final synchronized DirectShareTarget A00() {
        return this.A00.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (X.AbstractC65702TsY.A1Y(r1) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A02(boolean r11, X.InterfaceC16820sZ r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.Tyq r4 = r10.A00     // Catch: java.lang.Throwable -> L9f
            X.VrE r3 = new X.VrE     // Catch: java.lang.Throwable -> L9f
            r3.<init>(r10, r12)     // Catch: java.lang.Throwable -> L9f
            if (r11 != 0) goto L18
            com.instagram.common.session.UserSession r1 = r4.A08     // Catch: java.lang.Throwable -> L9f
            boolean r0 = X.AbstractC31268Doq.A0B(r1)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L18
            boolean r0 = X.AbstractC65702TsY.A1Y(r1)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L9d
        L18:
            boolean r0 = r4.A05     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L93
            X.5e6 r1 = r4.A07     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            boolean r0 = r1.A01     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            if (r0 == 0) goto L33
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A00     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r0.readLock()     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
        L28:
            r0 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            boolean r0 = r9.tryLock(r0, r2)     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            if (r0 == 0) goto L7f
            goto L3a
        L33:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A00     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.writeLock()     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            goto L28
        L3a:
            X.Tyr r0 = r4.A03     // Catch: java.lang.Throwable -> L7d
            X.0xq r5 = r0.A01     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "last_sync_timestamp_sec"
            r0 = -1
            long r5 = r5.getLong(r2, r0)     // Catch: java.lang.Throwable -> L7d
            long r0 = X.AbstractC31177DnL.A06()     // Catch: java.lang.Throwable -> L7d
            long r0 = r0 - r5
            double r5 = (double) r0     // Catch: java.lang.Throwable -> L7d
            com.instagram.common.session.UserSession r8 = r4.A08     // Catch: java.lang.Throwable -> L7d
            X.0Tz r7 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L7d
            r0 = 37164236048236853(0x8408ad00010135, double:3.566150753047382E-306)
            double r1 = X.C18U.A00(r7, r8, r0)     // Catch: java.lang.Throwable -> L7d
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1O(r0)
            r9.unlock()     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            if (r0 == 0) goto L93
            r0 = 36324767511294408(0x810d2f000f31c8, double:3.0352674700165017E-306)
            boolean r0 = X.C18U.A06(r7, r8, r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L79
            X.0nS r1 = r4.A09     // Catch: java.lang.Throwable -> L9f
            X.V64 r0 = new X.V64     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L9f
            r1.ATO(r0)     // Catch: java.lang.Throwable -> L9f
        L79:
            X.C66053Tyq.A02(r3, r4)     // Catch: java.lang.Throwable -> L9f
            goto L9d
        L7d:
            r1 = move-exception
            goto L87
        L7f:
            java.lang.String r0 = "Failed to claim lock after 1 seconds"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
            goto L8a
        L87:
            r9.unlock()     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
        L8a:
            throw r1     // Catch: java.lang.InterruptedException -> L8b java.lang.Throwable -> L9f
        L8b:
            r2 = move-exception
            java.lang.String r1 = X.C66053Tyq.A0B     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "Unable to acquire lock for executing this block."
            X.C0K8.A0F(r1, r0, r2)     // Catch: java.lang.Throwable -> L9f
        L93:
            X.0nS r1 = r4.A09     // Catch: java.lang.Throwable -> L9f
            X.V6L r0 = new X.V6L     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9f
            r1.ATO(r0)     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r10)
            return
        L9f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65911TwI.A02(boolean, X.0sZ):void");
    }

    public final synchronized ArrayList A01() {
        ArrayList A0i;
        ArrayList A0i2;
        C66053Tyq c66053Tyq = this.A00;
        List<C121375ed> list = c66053Tyq.A00;
        if (list == null) {
            list = C16930sl.A00;
        }
        A0i = AbstractC167007dF.A0i(list);
        for (C121375ed c121375ed : list) {
            List unmodifiableList = Collections.unmodifiableList(c121375ed.A0B);
            C14360o3.A07(unmodifiableList);
            ArrayList A01 = C4GO.A01(unmodifiableList);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                ((PendingRecipient) it.next()).A0H = true;
            }
            InterfaceC83703oF A00 = AbstractC31232DoF.A00(c121375ed.A09, A01);
            List unmodifiableList2 = Collections.unmodifiableList(c121375ed.A0B);
            C14360o3.A07(unmodifiableList2);
            String A07 = AbstractC101904i3.A07((AnonymousClass179) unmodifiableList2.get(0));
            boolean z = c121375ed.A0C;
            DirectShareTarget directShareTarget = new DirectShareTarget(null, null, null, null, null, A00, null, null, null, null, Integer.valueOf(c121375ed.A01), null, A07, null, c121375ed.A06, null, null, A01, z, false);
            if (((PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0)).A0X) {
                c66053Tyq.A04 = directShareTarget;
            }
            A0i.add(directShareTarget);
        }
        List<User> list2 = c66053Tyq.A02;
        if (list2 == null) {
            list2 = C16930sl.A00;
        }
        A0i2 = AbstractC167007dF.A0i(list2);
        for (User user : list2) {
            C14360o3.A0A(user);
            A0i2.add(C66053Tyq.A00(user));
        }
        return AbstractC001800i.A0S(A0i2, A0i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    public C65911TwI(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C66053Tyq(userSession);
        A03 = true;
        A02 = false;
        A02(false, X4O.A00);
        if (A02) {
            AbstractC25651Mw.A00(userSession).E4s(new Object());
        }
    }
}
