package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.7NM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NM {
    public final UserSession A01;
    public final C7NK A03;
    public List A00 = new LinkedList();
    public final InterfaceC14020nS A02 = C14120nc.A00();

    public final void A00(DirectShareTarget directShareTarget, boolean z) {
        this.A03.A00();
        boolean A0Q = directShareTarget.A0Q();
        List list = this.A00;
        if (A0Q) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DirectShareTarget directShareTarget2 = (DirectShareTarget) it.next();
                if (directShareTarget2.A0Q()) {
                    this.A00.remove(directShareTarget2);
                    break;
                }
            }
        } else {
            list.remove(directShareTarget);
        }
        if (z) {
            this.A02.ATO(new C60952RcC(this, directShareTarget));
        }
    }

    public C7NM(final UserSession userSession, C7NK c7nk) {
        this.A01 = userSession;
        this.A03 = c7nk;
        c7nk.A01.writeLock().lock();
        C7NL c7nl = c7nk.A00;
        try {
            this.A03.A00();
            this.A02.ATO(new AbstractRunnableC14200nk() { // from class: X.7NN
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(666);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
                
                    r0 = r9.getString(1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
                
                    if (r0 == null) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
                
                    r1.add(X.C7NS.parseFromJson(X.C16V.A00(r0)));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
                
                    if (r9.moveToNext() != false) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
                
                    r9.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
                
                    if (r9.moveToFirst() != false) goto L9;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r13 = this;
                        com.instagram.common.session.UserSession r0 = r2     // Catch: java.io.IOException -> L62
                        X.7NO r3 = X.C7NO.A00(r0)     // Catch: java.io.IOException -> L62
                        X.7NM r2 = r3     // Catch: java.io.IOException -> L62
                        java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.io.IOException -> L62
                        r1.<init>()     // Catch: java.io.IOException -> L62
                        X.7NQ r0 = X.C7NQ.A00()     // Catch: java.io.IOException -> L62
                        android.database.sqlite.SQLiteDatabase r5 = r0.A01()     // Catch: java.io.IOException -> L62
                        if (r5 == 0) goto L5f
                        r9 = 0
                        r0 = 129(0x81, float:1.81E-43)
                        java.lang.String r6 = X.AbstractC58317Pt9.A00(r0)     // Catch: java.lang.Throwable -> L55
                        java.lang.String[] r7 = X.C7NR.A00     // Catch: java.lang.Throwable -> L55
                        com.instagram.common.session.UserSession r0 = r3.A00     // Catch: java.lang.Throwable -> L55
                        java.lang.String r4 = r0.userId     // Catch: java.lang.Throwable -> L55
                        java.lang.String r3 = "user_id=='"
                        java.lang.String r0 = "'"
                        java.lang.String r8 = X.AnonymousClass001.A0g(r3, r4, r0)     // Catch: java.lang.Throwable -> L55
                        java.lang.String r12 = "last_picked_time_ms DESC"
                        r10 = r9
                        r11 = r9
                        android.database.Cursor r9 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L55
                        if (r9 == 0) goto L5f
                        boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L55
                        if (r0 == 0) goto L5c
                    L3c:
                        r0 = 1
                        java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L55
                        if (r0 == 0) goto L4e
                        X.16L r0 = X.C16V.A00(r0)     // Catch: java.lang.Throwable -> L55
                        com.instagram.model.direct.DirectShareTarget r0 = X.C7NS.parseFromJson(r0)     // Catch: java.lang.Throwable -> L55
                        r1.add(r0)     // Catch: java.lang.Throwable -> L55
                    L4e:
                        boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L55
                        if (r0 != 0) goto L3c
                        goto L5c
                    L55:
                        r0 = move-exception
                        if (r9 == 0) goto L5b
                        r9.close()     // Catch: java.io.IOException -> L62
                    L5b:
                        throw r0     // Catch: java.io.IOException -> L62
                    L5c:
                        r9.close()     // Catch: java.io.IOException -> L62
                    L5f:
                        r2.A00 = r1     // Catch: java.io.IOException -> L62
                        return
                    L62:
                        r2 = move-exception
                        java.lang.String r1 = "RecentSearchesCache"
                        java.lang.String r0 = "Error loading direct inbox recent searches from database"
                        X.C0K8.A0F(r1, r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C7NN.run():void");
                }
            });
            if (c7nl != null) {
                c7nl.close();
            }
        } catch (Throwable th) {
            if (c7nl != null) {
                try {
                    c7nl.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
