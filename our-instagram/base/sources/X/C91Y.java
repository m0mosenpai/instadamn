package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.91Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91Y {
    public static C91Y A09;
    public static final C91Z A0A = new Object();
    public long A00;
    public long A01;
    public C49593Lvm A02;
    public String A03;
    public final ConcurrentLinkedQueue A07 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public java.util.Set A04 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C91Y r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91Y.A00(X.91Y):void");
    }

    public static final synchronized boolean A02(C91Y c91y, String str, String str2, ConcurrentLinkedQueue concurrentLinkedQueue) {
        synchronized (c91y) {
            boolean z = true;
            if (!concurrentLinkedQueue.isEmpty()) {
                Iterator it = concurrentLinkedQueue.iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    C91a c91a = (C91a) it.next();
                    if (C14360o3.A0K(str, c91a.A02)) {
                        if (str2 != null) {
                            if (!C14360o3.A0K(c91a.A04, str2)) {
                                z = false;
                            }
                        }
                        return z;
                    }
                }
            }
            return false;
        }
    }

    public final void A03(MailboxCallback mailboxCallback, C132515ya c132515ya, String str, HashMap hashMap) {
        boolean z;
        String str2;
        C14360o3.A0B(str, 0);
        C49593Lvm c49593Lvm = this.A02;
        if (c49593Lvm != null) {
            z = c49593Lvm.A0Q.get();
        } else {
            z = false;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A06;
        if (!A02(this, str, null, concurrentLinkedQueue)) {
            C49593Lvm c49593Lvm2 = this.A02;
            if (c49593Lvm2 != null) {
                UserSession userSession = c49593Lvm2.A03;
                if (userSession != null) {
                    str2 = userSession.userId;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (!C14360o3.A0K(str2, str) || z) {
                if (!A02(this, str, null, this.A05)) {
                    C132525yb c132525yb = c132515ya.A02;
                    if (c132525yb.A06 && c132525yb.A03) {
                        UserFlowLogger userFlowLogger = c132525yb.A05;
                        long j = c132525yb.A04;
                        C9C9 c9c9 = C132525yb.A0C;
                        userFlowLogger.flowMarkPoint(j, c9c9.A01);
                        userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
                    }
                    String obj = UUID.randomUUID().toString();
                    C14360o3.A07(obj);
                    concurrentLinkedQueue.add(new C91a(mailboxCallback, c132515ya, str, obj, AbstractC111324zv.A00(1199), hashMap));
                } else {
                    c132515ya.A05("exists_notification_in_pending_foreground_teardown_queue");
                }
                ConcurrentLinkedQueue concurrentLinkedQueue2 = this.A07;
                if (A02(this, str, null, concurrentLinkedQueue2)) {
                    Iterator it = concurrentLinkedQueue2.iterator();
                    C14360o3.A07(it);
                    while (it.hasNext()) {
                        C91a c91a = (C91a) it.next();
                        if (str.equals(c91a.A02)) {
                            concurrentLinkedQueue2.remove(c91a);
                        }
                    }
                }
                if (this.A02 != null || this.A08.getAndSet(true)) {
                    return;
                }
                A00(this);
                return;
            }
        }
        c132515ya.A05("exists_notification_in_queue");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r8.hasEnded() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014f, code lost:
    
        if (r7.hasEnded() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0168, code lost:
    
        if (r7.hasEnded() == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.0Jk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91Y.A04(java.lang.String):void");
    }

    public static final void A01(String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        Iterator it = concurrentLinkedQueue.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C91a c91a = (C91a) it.next();
            if (str.equals(c91a.A02)) {
                concurrentLinkedQueue.remove(c91a);
                C132515ya c132515ya = c91a.A01;
                if (c132515ya != null) {
                    C132525yb c132525yb = c132515ya.A02;
                    if (c132525yb.A06 && c132525yb.A03) {
                        UserFlowLogger userFlowLogger = c132525yb.A05;
                        long j = c132525yb.A04;
                        C9C9 c9c9 = C132525yb.A0D;
                        userFlowLogger.flowMarkPoint(j, c9c9.A01);
                        userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
                    }
                }
            }
        }
    }
}
