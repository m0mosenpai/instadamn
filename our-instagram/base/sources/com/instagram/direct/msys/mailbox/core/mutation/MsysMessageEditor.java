package com.instagram.direct.msys.mailbox.core.mutation;

import X.C14360o3;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class MsysMessageEditor {
    public final UserSession A00;

    public MsysMessageEditor(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC2056098k r19, java.lang.String r20, java.lang.String r21, X.InterfaceC23621Ds r22) {
        /*
            r18 = this;
            r2 = r20
            r12 = r21
            r4 = 41
            r5 = r22
            boolean r0 = X.MAL.A01(r5, r4)
            r8 = r18
            if (r0 == 0) goto Lb7
            r6 = r5
            X.MAL r6 = (X.MAL) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lb7
            int r3 = r3 - r1
            r6.A00 = r3
        L1e:
            java.lang.Object r7 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 == r3) goto L38
            if (r0 != r4) goto Lc5
            X.AbstractC09560e7.A00(r7)
        L2f:
            boolean r0 = X.AbstractC166987dD.A1a(r7)
            if (r0 == 0) goto Lbe
            X.0eB r5 = X.C0eB.A00
        L37:
            return r5
        L38:
            java.lang.Object r12 = r6.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r6.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r6.A01
            com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor r0 = (com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor) r0
            X.AbstractC09560e7.A00(r7)
            goto L66
        L48:
            X.AbstractC09560e7.A00(r7)
            com.instagram.common.session.UserSession r1 = r8.A00
            X.66g r0 = X.LFD.A00(r1)
            r7 = r19
            com.google.common.util.concurrent.ListenableFuture r0 = X.LCI.A01(r0, r1, r7)
            r6.A01 = r8
            r6.A02 = r2
            r6.A03 = r12
            r6.A00 = r3
            java.lang.Object r7 = X.AbstractC47129KsO.A00(r0, r6)
            if (r7 == r5) goto L37
            r0 = r8
        L66:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r7
            com.instagram.common.session.UserSession r1 = r0.A00
            long r14 = r7.A00
            r3 = 0
            long r16 = java.lang.Long.parseLong(r2)
            r0 = 4
            X.C14360o3.A0B(r12, r0)
            X.66g r10 = X.LFD.A00(r1)
            X.6Cm r0 = r10.mMailboxApiHandleMetaProvider
            r2 = 0
            X.6Co r8 = r0.ASj(r2)
            com.facebook.msys.mca.MailboxFutureImpl r11 = X.AbstractC43592JPx.A0D(r8)
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "runInstagramEditMessageClientSend"
            int r13 = X.AbstractC1346866s.A00(r11)
            com.facebook.msys.mci.TraceInfo r7 = X.AbstractC1346866s.A01(r11, r1, r0)
            X.LUZ r9 = new X.LUZ
            r9.<init>(r10, r11, r12, r13, r14, r16)
            boolean r8 = r8.ELJ(r9)
            if (r8 != 0) goto La4
            r11.cancel(r2)
            X.AbstractC1346866s.A02(r13)
            X.AbstractC1346866s.A03(r7, r1, r0)
        La4:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            r6.A01 = r3
            r6.A02 = r3
            r6.A03 = r3
            r6.A00 = r4
            java.lang.Object r7 = X.AbstractC133285zv.A01(r11, r6)
            if (r7 != r5) goto L2f
            return r5
        Lb7:
            X.MAL r6 = new X.MAL
            r6.<init>(r8, r5, r4)
            goto L1e
        Lbe:
            java.lang.String r0 = "Send edit message returned false"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        Lc5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor.A00(X.98k, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
