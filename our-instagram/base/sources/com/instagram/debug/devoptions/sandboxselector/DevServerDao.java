package com.instagram.debug.devoptions.sandboxselector;

import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class DevServerDao {
    public abstract Object deleteAll(InterfaceC23621Ds interfaceC23621Ds);

    public abstract InterfaceC19390xP getAll(long j);

    public abstract Object insertAll(List list, InterfaceC23621Ds interfaceC23621Ds);

    public abstract Object replaceAll(List list, InterfaceC23621Ds interfaceC23621Ds);

    public static /* synthetic */ InterfaceC19390xP getAll$default(DevServerDao devServerDao, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return devServerDao.getAll(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object replaceAll$suspendImpl(com.instagram.debug.devoptions.sandboxselector.DevServerDao r6, java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            boolean r0 = r8 instanceof com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1
            if (r0 == 0) goto L4f
            r5 = r8
            com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1 r5 = (com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.1JX r3 = X.C1JX.A02
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L26
            if (r2 == r0) goto L36
            if (r2 != r1) goto L55
            X.AbstractC09560e7.A00(r4)
        L23:
            X.0eB r3 = X.C0eB.A00
            return r3
        L26:
            X.AbstractC09560e7.A00(r4)
            r5.L$0 = r6
            r5.L$1 = r7
            r5.label = r0
            java.lang.Object r0 = r6.deleteAll(r5)
            if (r0 != r3) goto L41
            return r3
        L36:
            java.lang.Object r7 = r5.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r5.L$0
            com.instagram.debug.devoptions.sandboxselector.DevServerDao r6 = (com.instagram.debug.devoptions.sandboxselector.DevServerDao) r6
            X.AbstractC09560e7.A00(r4)
        L41:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r1
            java.lang.Object r0 = r6.insertAll(r7, r5)
            if (r0 != r3) goto L23
            return r3
        L4f:
            com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1 r5 = new com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1
            r5.<init>(r6, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.DevServerDao.replaceAll$suspendImpl(com.instagram.debug.devoptions.sandboxselector.DevServerDao, java.util.List, X.1Ds):java.lang.Object");
    }
}
