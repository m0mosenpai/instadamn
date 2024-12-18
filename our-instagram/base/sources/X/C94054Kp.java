package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.PresenceSubscriptionIDStore;

/* renamed from: X.4Kp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94054Kp extends GraphQLSubscriptionHandler implements InterfaceC13000lm {
    public long A00 = 0;
    public final Context A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final C42311xL A04;
    public final C41981wo A05;
    public final PresenceSubscriptionIDStore A06;

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r5.isEmpty() != false) goto L14;
     */
    @Override // com.instagram.realtimeclient.GraphQLSubscriptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRealtimeEventPayload(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 685(0x2ad, float:9.6E-43)
            java.lang.String r3 = X.AbstractC43591JPw.A00(r0)
            X.16L r0 = X.C16V.A00(r11)     // Catch: java.io.IOException -> L5f
            X.A67 r6 = X.A1Y.parseFromJson(r0)     // Catch: java.io.IOException -> L5f
            X.5vK r0 = r6.A00     // Catch: java.io.IOException -> L5f
            if (r0 == 0) goto L76
            com.instagram.common.session.UserSession r7 = r8.A03     // Catch: java.io.IOException -> L5f
            boolean r0 = X.C4MG.A01(r7)     // Catch: java.io.IOException -> L5f
            if (r0 != 0) goto L27
            X.5vK r0 = r6.A00     // Catch: java.io.IOException -> L5f
            if (r0 == 0) goto L55
            X.1xM r1 = X.AbstractC22730A1a.A00(r0)     // Catch: java.io.IOException -> L5f
            X.1wo r0 = r8.A05     // Catch: java.io.IOException -> L5f
            r0.A02(r1)     // Catch: java.io.IOException -> L5f
        L27:
            X.5vK r0 = r6.A00     // Catch: java.io.IOException -> L5f
            java.util.List r5 = r0.A06     // Catch: java.io.IOException -> L5f
            java.util.List r4 = r0.A05     // Catch: java.io.IOException -> L5f
            r2 = 1
            if (r5 == 0) goto L37
            boolean r0 = r5.isEmpty()     // Catch: java.io.IOException -> L5f
            r1 = 1
            if (r0 == 0) goto L38
        L37:
            r1 = 0
        L38:
            if (r4 == 0) goto L41
            boolean r0 = r4.isEmpty()     // Catch: java.io.IOException -> L5f
            if (r0 != 0) goto L41
            goto L42
        L41:
            r2 = 0
        L42:
            if (r1 != 0) goto L46
            if (r2 == 0) goto L76
        L46:
            android.content.Context r0 = r8.A01     // Catch: java.io.IOException -> L5f
            X.AEE.A01(r0, r7, r5, r4)     // Catch: java.io.IOException -> L5f
            X.1xL r1 = r8.A04     // Catch: java.io.IOException -> L5f
            X.5vK r0 = r6.A00     // Catch: java.io.IOException -> L5f
            boolean r0 = r0.A07     // Catch: java.io.IOException -> L5f
            r1.A00(r5, r4, r0)     // Catch: java.io.IOException -> L5f
            return
        L55:
            java.lang.String r0 = "presenceState"
            X.C14360o3.A0F(r0)     // Catch: java.io.IOException -> L5f
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.io.IOException -> L5f
            throw r0     // Catch: java.io.IOException -> L5f
        L5f:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r11}
            java.lang.String r0 = "onRealtimeEventPayload exception"
            X.C0K8.A0L(r3, r0, r2, r1)
            boolean r0 = r2 instanceof X.C90173zy
            if (r0 == 0) goto L76
            r0 = 1564(0x61c, float:2.192E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C0w9.A06(r3, r0, r2)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94054Kp.onRealtimeEventPayload(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (C4MG.A01(this.A03)) {
            this.A02.A01();
        }
    }

    public C94054Kp(Context context, C41761wQ c41761wQ, UserSession userSession, C42311xL c42311xL, C41981wo c41981wo, PresenceSubscriptionIDStore presenceSubscriptionIDStore) {
        this.A05 = c41981wo;
        this.A04 = c42311xL;
        this.A06 = presenceSubscriptionIDStore;
        this.A02 = c41761wQ;
        this.A03 = userSession;
        this.A01 = context;
    }
}
