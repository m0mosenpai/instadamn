package com.instagram.settings2.core.session;

import X.MSZ;
import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.data.SettingsRepository;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public final class AbstractValueResolverImpl {
    public final SettingsRepository A00;
    public final String A01;
    public final UserSession A02;
    public final Map A03;
    public final ReentrantReadWriteLock A04;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C51757Mtg r9, X.InterfaceC23621Ds r10, X.InterfaceC16510rw r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.AbstractValueResolverImpl.A00(X.Mtg, X.1Ds, X.0rw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.AbstractC55145Od4 r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 35
            boolean r0 = X.PXA.A03(r7, r3)
            if (r0 == 0) goto L6c
            r4 = r7
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L4b
            if (r0 != r1) goto L71
            java.lang.Object r2 = r4.A02
            com.instagram.settings2.core.session.AbstractValueResolverImpl r2 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r2
            java.lang.Object r6 = r4.A01
            X.Od4 r6 = (X.AbstractC55145Od4) r6
            X.AbstractC09560e7.A00(r3)
        L2c:
            if (r3 != 0) goto L30
            X.OST r3 = X.OST.A00
        L30:
            X.GWu r1 = r6.A06()
            X.PFs r0 = X.C56724PFs.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L41
            java.util.Map r0 = r2.A03
            r0.put(r6, r3)
        L41:
            X.OST r0 = X.OST.A00
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L4a
            r3 = 0
        L4a:
            return r3
        L4b:
            X.AbstractC09560e7.A00(r3)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A04
            boolean r0 = r0.isWriteLocked()
            if (r0 == 0) goto L76
            java.util.Map r0 = r5.A03
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L41
            com.instagram.common.session.UserSession r0 = r5.A02
            X.PXA.A01(r6, r5, r4, r1)
            java.lang.Object r3 = r6.A07(r0, r5, r4)
            if (r3 != r2) goto L6a
            return r2
        L6a:
            r2 = r5
            goto L2c
        L6c:
            X.PXA r4 = X.PXA.A00(r5, r7, r3)
            goto L16
        L71:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L76:
            java.lang.String r0 = "This method must be called within a write lock"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.AbstractValueResolverImpl.A01(X.Od4, X.1Ds):java.lang.Object");
    }

    public AbstractValueResolverImpl(UserSession userSession, SettingsRepository settingsRepository, String str, Map map, ReentrantReadWriteLock reentrantReadWriteLock) {
        MSZ.A1O(map, settingsRepository);
        this.A03 = map;
        this.A04 = reentrantReadWriteLock;
        this.A02 = userSession;
        this.A00 = settingsRepository;
        this.A01 = str;
    }
}
