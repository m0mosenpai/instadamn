package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.instagram.common.session.UserSession;

/* renamed from: X.LTg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48157LTg implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final UserSession A00;
    public final C47882LDc A01;

    public C48157LTg(UserSession userSession, C47882LDc c47882LDc) {
        C14360o3.A0B(c47882LDc, 2);
        this.A00 = userSession;
        this.A01 = c47882LDc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r9 == null) goto L20;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage, java.lang.Object] */
    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getValueForKey(com.facebook.messenger.notification.engine.MSGNotificationEngineContext r15, java.lang.String r16, com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback r17) {
        /*
            r14 = this;
            r3 = 0
            r4 = r17
            X.AbstractC167007dF.A1D(r15, r3, r4)
            java.util.Map r1 = r15.getNotificationContextDict()
            java.lang.String r0 = "notification.thread_id"
            java.lang.Object r2 = r1.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb5
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lb5
            r10 = 0
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r2, r10)
            com.instagram.common.session.UserSession r0 = r14.A00
            X.2DS r0 = X.AbstractC28761aE.A00(r0)
            X.2DU r0 = (X.C2DU) r0
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            X.4GV r0 = r0.A0P(r1)
            if (r0 == 0) goto L39
            X.3kb r1 = r0.A0I
            java.util.List r0 = r0.A0N()
            r2.put(r1, r0)
        L39:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            X.C14360o3.A07(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L4c
            com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage[] r0 = new com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage[r3]
            r4.success(r15, r0)
            return
        L4c:
            java.util.Set r0 = r1.entrySet()
            java.lang.Object r0 = X.AbstractC001800i.A09(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = r0.iterator()
        L64:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb1
            X.3nh r6 = X.AbstractC43592JPx.A0e(r7)
            X.C14360o3.A0B(r6, r3)
            X.2EY r1 = r6.A10
            X.C14360o3.A07(r1)
            X.2EY r0 = X.C2EY.A1i
            java.lang.String r5 = ""
            if (r1 != r0) goto La4
            java.lang.String r9 = r6.A1q
        L7e:
            if (r9 != 0) goto L81
        L80:
            r9 = r5
        L81:
            X.LAZ r0 = com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage.Companion
            long r0 = r6.C8i()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r12 = r6.A0h()
            if (r12 != 0) goto L93
            java.lang.String r12 = "mesg_id"
        L93:
            com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage r1 = new com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage
            r1.<init>()
            r11 = r10
            r13 = r10
            com.facebook.simplejni.NativeHolder r0 = com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage.initNativeHolder(r8, r9, r10, r11, r12, r13)
            r1.mNativeHolder = r0
            r2.add(r1)
            goto L64
        La4:
            java.lang.Object r1 = r6.A1T
            boolean r0 = r1 instanceof X.C7QR
            if (r0 == 0) goto L80
            X.7QR r1 = (X.C7QR) r1
            if (r1 == 0) goto L80
            java.lang.String r9 = r1.A0A
            goto L7e
        Lb1:
            r4.success(r15, r2)
            return
        Lb5:
            java.lang.String r0 = "ThreadId not found, or isn't a String"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            r4.failure(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48157LTg.getValueForKey(com.facebook.messenger.notification.engine.MSGNotificationEngineContext, java.lang.String, com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback):void");
    }
}
