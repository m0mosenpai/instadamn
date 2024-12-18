package com.instagram.direct.disappearingmode.expiration;

import X.AbstractC23641Du;
import X.C14090nZ;
import X.InterfaceC23621Ds;
import X.MBo;
import android.content.Context;
import androidx.work.CoroutineWorker;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class OpenDisappearingMessagesExpirationWorker extends CoroutineWorker {
    public final long A00;
    public final Context A01;
    public final UserSession A02;
    public final C14090nZ A03;

    @Override // androidx.work.CoroutineWorker
    public final Object A03(InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC23641Du.A00(interfaceC23621Ds, this.A03, new MBo(this, null, 34));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (java.lang.Long.valueOf(r1) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OpenDisappearingMessagesExpirationWorker(android.content.Context r6, androidx.work.WorkerParameters r7) {
        /*
            r5 = this;
            X.AbstractC167017dG.A1P(r6, r7)
            r5.<init>(r6, r7)
            r5.A01 = r6
            X.2Kv r1 = r7.A02
            java.lang.String r0 = "session_token"
            java.lang.String r4 = r1.A03(r0)
            r3 = 0
            if (r4 == 0) goto L22
            X.09Y r2 = X.C023409i.A0A
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r4)
            com.instagram.common.session.UserSession r3 = r2.A07(r1)
        L22:
            r5.A02 = r3
            X.12L r1 = X.C12L.A00
            r0 = 1481080718(0x58477f8e, float:8.774026E14)
            X.0nZ r0 = X.AbstractC43592JPx.A0W(r1, r0)
            r5.A03 = r0
            if (r3 == 0) goto L45
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36607067121194529(0x820def00071621, double:3.213794880046627E-306)
            long r1 = X.C18U.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L45
        L42:
            r5.A00 = r1
            return
        L45:
            r1 = 15000(0x3a98, double:7.411E-320)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.disappearingmode.expiration.OpenDisappearingMessagesExpirationWorker.<init>(android.content.Context, androidx.work.WorkerParameters):void");
    }
}
