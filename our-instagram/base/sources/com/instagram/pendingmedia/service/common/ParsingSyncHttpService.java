package com.instagram.pendingmedia.service.common;

import X.AbstractC167017dG;
import X.C23311Bt;
import X.C26461Qb;
import X.C3JY;
import X.C54600OAb;
import X.C56150OwG;
import X.InterfaceC40181tm;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class ParsingSyncHttpService {
    public static final ParsingSyncHttpService A00 = new Object();

    public static final C54600OAb A00(C56150OwG c56150OwG, C26461Qb c26461Qb) {
        C3JY c3jy;
        try {
            c3jy = C23311Bt.A00().A01(c26461Qb);
        } catch (IOException e) {
            e = e;
            c3jy = null;
        }
        try {
            return new C54600OAb(c3jy, c56150OwG.A00(c3jy), null);
        } catch (IOException e2) {
            e = e2;
            return new C54600OAb(c3jy, null, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[Catch: IOException -> 0x00b1, TryCatch #2 {IOException -> 0x00b1, blocks: (B:13:0x008b, B:14:0x008e, B:16:0x0094, B:19:0x009e, B:21:0x00a2, B:23:0x00ac, B:24:0x00b0), top: B:12:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: IOException -> 0x00b1, TryCatch #2 {IOException -> 0x00b1, blocks: (B:13:0x008b, B:14:0x008e, B:16:0x0094, B:19:0x009e, B:21:0x00a2, B:23:0x00ac, B:24:0x00b0), top: B:12:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C26461Qb r11, com.instagram.common.session.UserSession r12, X.InterfaceC40181tm r13, X.InterfaceC23621Ds r14) {
        /*
            r10 = this;
            r3 = 13
            boolean r0 = X.PX6.A02(r14, r3)
            if (r0 == 0) goto L32
            r7 = r14
            X.PX6 r7 = (X.PX6) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r2 = r7.A04
            X.1JX r1 = X.C1JX.A02
            int r0 = r7.A00
            r8 = 2
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r6) goto L3d
            if (r0 != r8) goto L38
            java.lang.Object r4 = r7.A03
            X.3JY r4 = (X.C3JY) r4
            java.lang.Object r13 = r7.A02
            X.1tm r13 = (X.InterfaceC40181tm) r13
            java.lang.Object r12 = r7.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            goto L8b
        L32:
            X.PX6 r7 = new X.PX6
            r7.<init>(r10, r14, r3)
            goto L16
        L38:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L3d:
            java.lang.Object r5 = r7.A03
            com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse r5 = (com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse) r5
            java.lang.Object r13 = r7.A02
            X.1tm r13 = (X.InterfaceC40181tm) r13
            java.lang.Object r12 = r7.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            goto L7b
        L4a:
            X.AbstractC09560e7.A00(r2)
            r0 = 0
            X.C14360o3.A0B(r11, r0)     // Catch: java.io.IOException -> Lb3
            X.1QW r9 = r11.A02     // Catch: java.io.IOException -> Lb3
            java.net.URI r0 = r9.A09     // Catch: java.io.IOException -> Lb3
            com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse r5 = new com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse     // Catch: java.io.IOException -> Lb3
            r5.<init>(r0)     // Catch: java.io.IOException -> Lb3
            X.1C6 r4 = X.C1C6.A00()     // Catch: java.io.IOException -> Lb3
            X.1QY r2 = r11.A03     // Catch: java.io.IOException -> Lb3
            X.Os6 r0 = r5.A02     // Catch: java.io.IOException -> Lb3
            X.1Tt r2 = r4.A02(r0, r9, r2)     // Catch: java.io.IOException -> Lb3
            X.C14360o3.A07(r2)     // Catch: java.io.IOException -> Lb3
            X.OsM r0 = new X.OsM     // Catch: java.io.IOException -> Lb3
            r0.<init>(r2)     // Catch: java.io.IOException -> Lb3
            r11.A01(r0)     // Catch: java.io.IOException -> Lb3
            X.PX6.A00(r12, r13, r5, r7, r6)     // Catch: java.io.IOException -> Lb3
            java.lang.Object r2 = r5.A00(r7)     // Catch: java.io.IOException -> Lb3
            if (r2 != r1) goto L7e
            return r1
        L7b:
            X.AbstractC09560e7.A00(r2)     // Catch: java.io.IOException -> Lb3
        L7e:
            r4 = r2
            X.3JY r4 = (X.C3JY) r4     // Catch: java.io.IOException -> Lb3
            X.PX6.A00(r12, r13, r4, r7, r8)     // Catch: java.io.IOException -> Lb6
            java.lang.Object r2 = r5.A01(r7)     // Catch: java.io.IOException -> Lb6
            if (r2 != r1) goto L8e
            return r1
        L8b:
            X.AbstractC09560e7.A00(r2)     // Catch: java.io.IOException -> Lb1
        L8e:
            X.NkU r2 = (X.AbstractC53441NkU) r2     // Catch: java.io.IOException -> Lb1
            boolean r0 = r2 instanceof X.NAO     // Catch: java.io.IOException -> Lb1
            if (r0 == 0) goto L9e
            X.N3A r0 = r13.E3U(r4, r12)     // Catch: java.io.IOException -> Lb1
            X.OAb r1 = new X.OAb     // Catch: java.io.IOException -> Lb1
            r1.<init>(r4, r0, r3)     // Catch: java.io.IOException -> Lb1
            return r1
        L9e:
            boolean r0 = r2 instanceof X.NAN     // Catch: java.io.IOException -> Lb1
            if (r0 == 0) goto Lac
            X.NAN r2 = (X.NAN) r2     // Catch: java.io.IOException -> Lb1
            java.io.IOException r0 = r2.A00     // Catch: java.io.IOException -> Lb1
            X.OAb r1 = new X.OAb     // Catch: java.io.IOException -> Lb1
            r1.<init>(r4, r3, r0)     // Catch: java.io.IOException -> Lb1
            return r1
        Lac:
            X.B4Z r0 = X.B4Z.A00()     // Catch: java.io.IOException -> Lb1
            throw r0     // Catch: java.io.IOException -> Lb1
        Lb1:
            r0 = move-exception
            goto Lb7
        Lb3:
            r0 = move-exception
            r4 = r3
            goto Lb7
        Lb6:
            r0 = move-exception
        Lb7:
            X.OAb r1 = new X.OAb
            r1.<init>(r4, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A02(X.1Qb, com.instagram.common.session.UserSession, X.1tm, X.1Ds):java.lang.Object");
    }

    public static final C54600OAb A01(C26461Qb c26461Qb, UserSession userSession, InterfaceC40181tm interfaceC40181tm) {
        C3JY c3jy;
        AbstractC167017dG.A1O(userSession, interfaceC40181tm);
        try {
            c3jy = C23311Bt.A00().A01(c26461Qb);
        } catch (IOException e) {
            e = e;
            c3jy = null;
        }
        try {
            return new C54600OAb(c3jy, interfaceC40181tm.E3U(c3jy, userSession), null);
        } catch (IOException e2) {
            e = e2;
            return new C54600OAb(c3jy, null, e);
        }
    }
}
