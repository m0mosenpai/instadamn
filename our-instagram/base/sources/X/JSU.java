package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes8.dex */
public final class JSU implements Runnable {
    public boolean A00;
    public final Object A01;
    public final /* synthetic */ C43951Jc0 A02;

    public JSU(C43951Jc0 c43951Jc0, Object obj) {
        this.A02 = c43951Jc0;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.0xq] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.0xo] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.0nS] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.0ng] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v34, types: [X.0xo] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [int] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    @Override // java.lang.Runnable
    public final void run() {
        C69613Av c69613Av;
        ?? A02;
        String str;
        ?? r13;
        ?? r0;
        String str2;
        JSC jsc;
        C69613Av c69613Av2;
        C43951Jc0 c43951Jc0 = this.A02;
        C43953Jc2 c43953Jc2 = c43951Jc0.A03;
        final List<C2EC> list = (List) this.A01;
        int i = 0;
        C14360o3.A0B(list, 0);
        JSM jsm = c43953Jc2.A00;
        final JS8 js8 = jsm.A0C;
        final AbstractC46972Dl abstractC46972Dl = jsm.A00;
        final boolean z = jsm.A03;
        final boolean z2 = jsm.A06;
        final boolean z3 = jsm.A04;
        final boolean z4 = jsm.A05;
        final C3o9 c3o9 = jsm.A01;
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadRowViewModelFactory.createList");
        try {
            int size = list.size();
            ArrayList A17 = AbstractC25225BEi.A17(size);
            C43950Jbz c43950Jbz = js8.A03;
            if (c43950Jbz != null && (c69613Av2 = c43950Jbz.A00) != null) {
                c69613Av2.A04();
            }
            UserSession userSession = js8.A05;
            ?? r1 = jsm;
            if (C6X6.A02(userSession)) {
                Context context = js8.A04;
                js8.A02 = new C44188Jfr(userSession, context);
                r1 = context;
            }
            ?? A002 = C14120nc.A00();
            JSB A003 = AbstractC43636JRu.A00(js8.A04, userSession);
            if (A003.A0C && (r1 = list.size()) <= A003.A05) {
                r1 = r1;
                if (!A003.A02) {
                    for (C2EC c2ec : list) {
                        String C7I = c2ec.C7I();
                        C23031Ai c23031Ai = A003.A0B;
                        if (C23031Ai.A02(c23031Ai, "inbox_reminder_thread_map").containsKey(C7I)) {
                            C83403nh A01 = C4GQ.A01(c2ec);
                            UserSession userSession2 = A003.A0A;
                            Context context2 = A003.A09;
                            C31233DoG c31233DoG = new C31233DoG(userSession2, A01, c2ec, AbstractC31273Dov.A00(context2, userSession2));
                            if (A01 == null) {
                                jsc = null;
                            } else {
                                jsc = new JSC(context2, userSession2, A01, c2ec, JSE.A00(userSession2, c2ec));
                            }
                            C51761Mtk c51761Mtk = new C51761Mtk(jsc, c31233DoG);
                            Double d = (Double) C23031Ai.A02(c23031Ai, "inbox_reminder_thread_map").get(C7I);
                            Integer num = null;
                            if (d != null) {
                                num = Integer.valueOf((int) d.doubleValue());
                            }
                            EnumC44047JdY[] values = EnumC44047JdY.values();
                            int length = values.length;
                            int i2 = 0;
                            r1 = c31233DoG;
                            while (true) {
                                if (i2 < length) {
                                    EnumC44047JdY enumC44047JdY = values[i2];
                                    r1 = enumC44047JdY.A00;
                                    if (num != null && r1 == num.intValue()) {
                                        A003.A01.put(enumC44047JdY, c51761Mtk);
                                        break;
                                    } else {
                                        i2++;
                                        r1 = r1;
                                    }
                                }
                            }
                        }
                    }
                    A003.A02 = true;
                    r1 = r1;
                }
                Map map = A003.A01;
                Iterator A12 = AbstractC43593JPy.A12(map);
                while (A12.hasNext()) {
                    EnumC44047JdY enumC44047JdY2 = (EnumC44047JdY) A12.next();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (C2EH c2eh : list) {
                            C51761Mtk c51761Mtk2 = (C51761Mtk) map.get(enumC44047JdY2);
                            String str3 = null;
                            if (c51761Mtk2 != null) {
                                MRV mrv = (MRV) c51761Mtk2.A00;
                                if (mrv != null) {
                                    str = mrv.getId();
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            C83403nh BLX = c2eh.BLX();
                            if (BLX != null) {
                                str3 = BLX.A0h();
                            }
                            if (C14360o3.A0K(str, str3)) {
                                break;
                            }
                        }
                    }
                    if (!JSB.A01(A003, enumC44047JdY2)) {
                        map.put(enumC44047JdY2, null);
                        JSB.A00(A003);
                        EnumC44047JdY enumC44047JdY3 = EnumC44047JdY.A04;
                        C23031Ai c23031Ai2 = A003.A0B;
                        if (enumC44047JdY2 == enumC44047JdY3) {
                            InterfaceC19610xo ARD = c23031Ai2.A01.ARD();
                            str2 = "inbox_sender_reminder_impression_count";
                            r1 = ARD;
                        } else {
                            InterfaceC19610xo ARD2 = c23031Ai2.A01.ARD();
                            str2 = "inbox_receiver_reminder_impression_count";
                            r1 = ARD2;
                        }
                        r1.E7D(str2, 0);
                        r1.apply();
                    } else {
                        Map map2 = A003.A00;
                        r1 = map2.get(enumC44047JdY2);
                        if (C14360o3.A0K(r1, false)) {
                            int ordinal = enumC44047JdY2.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    InterfaceC19630xq interfaceC19630xq = A003.A0B.A01;
                                    InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                                    r0 = interfaceC19630xq;
                                    r1 = "inbox_receiver_reminder_impression_count";
                                    r13 = ARD3;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                InterfaceC19630xq interfaceC19630xq2 = A003.A0B.A01;
                                InterfaceC19610xo ARD4 = interfaceC19630xq2.ARD();
                                r0 = interfaceC19630xq2;
                                r1 = "inbox_sender_reminder_impression_count";
                                r13 = ARD4;
                            }
                            r13.E7D(r1, r0.getInt(r1, 0) + 1);
                            r13.apply();
                            map2.put(enumC44047JdY2, true);
                        } else {
                            continue;
                        }
                    }
                }
            }
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327486224677482L);
            int i3 = 0;
            Throwable th = r1;
            while (i3 < size) {
                try {
                    final int i4 = i3;
                    Callable callable = new Callable() { // from class: X.JSL
                        /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
                        
                            if (r1.equals(r6.BKb()) == false) goto L7;
                         */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object call() {
                            /*
                                r14 = this;
                                X.JS8 r4 = X.JS8.this
                                java.util.List r3 = r4
                                int r8 = r5
                                X.2Dl r5 = r2
                                boolean r9 = r6
                                boolean r10 = r7
                                boolean r11 = r8
                                boolean r12 = r9
                                X.3o9 r1 = r3
                                java.lang.String r0 = "DirectThreadRowViewModelFactory.buildRowViewModelItem"
                                X.0lu r2 = X.AbstractC13090lv.A00(r0)
                                java.lang.Object r6 = r3.get(r8)     // Catch: java.lang.Throwable -> L3a
                                X.2EC r6 = (X.C2EC) r6     // Catch: java.lang.Throwable -> L3a
                                com.instagram.common.session.UserSession r0 = r4.A05     // Catch: java.lang.Throwable -> L3a
                                X.2DS r7 = X.AbstractC28761aE.A00(r0)     // Catch: java.lang.Throwable -> L3a
                                if (r1 == 0) goto L31
                                com.instagram.model.direct.DirectThreadKey r0 = r6.BKb()     // Catch: java.lang.Throwable -> L3a
                                boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L3a
                                r13 = 1
                                if (r0 != 0) goto L32
                            L31:
                                r13 = 0
                            L32:
                                X.JRL r0 = r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L3a
                                r2.close()
                                return r0
                            L3a:
                                r1 = move-exception
                                r2.close()     // Catch: java.lang.Throwable -> L3f
                                throw r1
                            L3f:
                                r0 = move-exception
                                X.AbstractC61625Rqp.A00(r1, r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.JSL.call():java.lang.Object");
                        }
                    };
                    if (A06) {
                        C13080lu A004 = AbstractC13090lv.A00("DirectThreadRowViewModelFactory.buildRowViewModelAsync");
                        try {
                            A02 = new C14160ng(callable, 671426005, 2, false, false);
                            A002.ATN(A02);
                            A004.close();
                        } catch (Throwable th2) {
                            A004.close();
                            throw th2;
                        }
                    } else {
                        try {
                            C13080lu A005 = AbstractC13090lv.A00("DirectThreadRowViewModelFactory.buildRowViewModelSync");
                            try {
                                A02 = C2OD.A02((JRL) callable.call());
                                A005.close();
                            } catch (Throwable th3) {
                                try {
                                    A005.close();
                                } catch (Throwable th4) {
                                }
                                throw th3;
                            }
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                    A17.add(A02);
                    i3++;
                    th = A02;
                } catch (Throwable th5) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th5);
                    throw th;
                }
            }
            C13080lu A006 = AbstractC13090lv.A00("DirectThreadRowViewModelFactory.collectRowViewModels");
            try {
                int size2 = A17.size();
                ArrayList A172 = AbstractC25225BEi.A17(size2);
                th = th;
                while (i < size2) {
                    try {
                        try {
                            C13080lu A007 = AbstractC13090lv.A00("DirectThreadRowViewModelFactory.collectRowViewModels: row");
                            try {
                                A172.add((JRL) ((Future) A17.get(i)).get());
                                A007.close();
                            } catch (Throwable th6) {
                                th = th6;
                                try {
                                    A007.close();
                                } catch (Throwable th7) {
                                }
                                throw th;
                                break;
                            }
                        } catch (ExecutionException e2) {
                            th = e2;
                            C0K8.A0F("DirectThreadRowViewModelFactory", "ExecutionException in thread row creation", th);
                        }
                    } catch (InterruptedException e3) {
                        th = e3;
                        C0K8.A0F("DirectThreadRowViewModelFactory", "InterruptedException in thread row creation", th);
                    }
                    i++;
                    th = th;
                }
                A006.close();
                C43950Jbz c43950Jbz2 = js8.A03;
                if (c43950Jbz2 != null && (c69613Av = c43950Jbz2.A00) != null) {
                    c69613Av.A05();
                }
                A00.close();
                Handler handler = c43951Jc0.A02;
                handler.removeCallbacksAndMessages(null);
                handler.post(new JSV(this, c43951Jc0, A172));
            } catch (Throwable th8) {
                A006.close();
            }
        } catch (Throwable th9) {
            try {
                A00.close();
                throw th9;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th);
            }
        }
    }
}
