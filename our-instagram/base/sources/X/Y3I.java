package X;

import java.util.List;

/* loaded from: classes12.dex */
public abstract class Y3I {
    public static final ThreadLocal A00 = new YKI();

    public static void A01() {
        try {
            List list = ((C72720Xls) A00.get()).A01;
            C18C.A0F(AbstractC166987dD.A1b(list));
            list.remove(AbstractC25226BEj.A05(list));
        } catch (IllegalStateException e) {
            C0f7.A00();
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A00(int r5) {
        /*
            android.content.Context r0 = X.YB7.A00()
            r4 = 0
            if (r0 != 0) goto L25
            java.lang.ThreadLocal r0 = X.Y3I.A00
            java.lang.Object r0 = r0.get()
            X.Xls r0 = (X.C72720Xls) r0
            if (r0 == 0) goto L21
            java.util.List r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L21
            java.lang.Object r1 = X.AbstractC58320PtC.A0u(r1)
            X.YRI r1 = (X.YRI) r1
            if (r1 != 0) goto L29
        L21:
            android.content.Context r0 = X.YB7.A00()
        L25:
            X.YB7 r1 = X.YB7.get(r0)
        L29:
            X.YRI r1 = (X.YRI) r1
            r3 = 0
            java.lang.ThreadLocal r0 = X.Y3I.A00
            java.lang.Object r0 = r0.get()
            X.Xls r0 = (X.C72720Xls) r0
            X.YRI r2 = r1.Bqf()
            java.util.List r0 = r0.A01
            r0.add(r2)
            X.Xls r3 = r1.ASq()     // Catch: java.lang.Throwable -> L55
            r0 = r1
            X.XVJ r0 = (X.XVJ) r0     // Catch: java.lang.Throwable -> L55
            X.YB7 r0 = r0.A00     // Catch: java.lang.Throwable -> L55
            X.XVK r0 = r0.Bqh()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = com.facebook.ultralight.UL.factorymap.get(r5, r0, r4)     // Catch: java.lang.Throwable -> L55
            A01()
            r1.ATk(r3)
            return r0
        L55:
            r0 = move-exception
            A01()
            r1.ATk(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y3I.A00(int):java.lang.Object");
    }
}
