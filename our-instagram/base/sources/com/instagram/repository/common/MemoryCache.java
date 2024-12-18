package com.instagram.repository.common;

import X.C129835tn;
import X.C4DW;
import X.C4DY;
import android.util.LruCache;

/* loaded from: classes2.dex */
public abstract class MemoryCache {
    public final C4DY A00;
    public final long A01;

    public final Object A00(Object obj) {
        LruCache lruCache = ((C4DW) this).A00;
        C129835tn c129835tn = (C129835tn) lruCache.get(obj);
        if (c129835tn != null) {
            long j = c129835tn.A00;
            if (j != -1 && j <= System.currentTimeMillis()) {
                lruCache.remove(obj);
            } else {
                return c129835tn.A01;
            }
        }
        return null;
    }

    public final void A03(Object obj) {
        ((C4DW) this).A00.remove(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.Object r6, X.InterfaceC23621Ds r7, X.InterfaceC16660sJ r8) {
        /*
            r5 = this;
            r3 = 24
            boolean r0 = X.PXA.A03(r7, r3)
            if (r0 == 0) goto L46
            r4 = r7
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L4c
            java.lang.Object r6 = r4.A02
            java.lang.Object r0 = r4.A01
            com.instagram.repository.common.MemoryCache r0 = (com.instagram.repository.common.MemoryCache) r0
            X.AbstractC09560e7.A00(r3)
        L2a:
            r0.A01(r6, r3)
        L2d:
            return r3
        L2e:
            X.AbstractC09560e7.A00(r3)
            java.lang.Object r3 = r5.A00(r6)
            if (r3 != 0) goto L2d
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r0
            java.lang.Object r3 = r8.invoke(r4)
            if (r3 != r2) goto L44
            return r2
        L44:
            r0 = r5
            goto L2a
        L46:
            X.PXA r4 = new X.PXA
            r4.<init>(r5, r7, r3)
            goto L16
        L4c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.common.MemoryCache.A02(java.lang.Object, X.1Ds, X.0sJ):java.lang.Object");
    }

    public MemoryCache(C4DY c4dy, long j) {
        this.A01 = j;
        this.A00 = c4dy;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.5tn, java.lang.Object] */
    public Object A01(Object obj, Object obj2) {
        long currentTimeMillis = System.currentTimeMillis() + this.A01;
        ?? obj3 = new Object();
        obj3.A00 = currentTimeMillis;
        obj3.A01 = obj2;
        C129835tn c129835tn = (C129835tn) ((C4DW) this).A00.put(obj, obj3);
        if (c129835tn != null) {
            return c129835tn.A01;
        }
        return null;
    }
}
