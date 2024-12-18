package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.91F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91F {
    public Context A00;
    public C4N8 A01;
    public final C3VA A02;
    public final AbstractC12990ll A03;

    public C91F(Context context, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 2);
        this.A00 = context;
        this.A02 = new C3VA(context, null);
        this.A01 = ((C74123Uq) C3UY.A00).A02().A00(this.A00, AnonymousClass001.A0R("rti.mqtt.", "token_store"));
        this.A03 = abstractC12990ll;
    }

    public static final void A00(String str, String str2, Throwable th) {
        C0f5 AEp = C18950wb.A01.AEp("FbnsPushNotificationProcessor", 875300320);
        AEp.ABW("category", str);
        AEp.ABW(DialogModule.KEY_MESSAGE, str2);
        AEp.ERI(th);
        AEp.report();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:3:0x0009, B:5:0x000f, B:6:0x0011, B:8:0x0028, B:10:0x002e, B:13:0x0036, B:14:0x003a, B:16:0x0046, B:18:0x004c, B:20:0x005b, B:21:0x0072, B:23:0x0082, B:28:0x0063), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.content.Intent r9) {
        /*
            r8 = this;
            X.919 r4 = X.AnonymousClass918.A00
            java.lang.String r0 = "on_message"
            r4.A02(r9, r0)
            r5 = 0
            r7 = 0
            X.5Nu r0 = X.C116155Nu.A00(r9, r7, r5)     // Catch: java.io.IOException -> L11 java.lang.Exception -> L8e
            if (r0 == 0) goto L11
            java.lang.String r7 = r0.A0j     // Catch: java.lang.Exception -> L8e
        L11:
            X.MRU r3 = X.JQX.A00(r7)     // Catch: java.lang.Exception -> L8e
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Exception -> L8e
            long r1 = r3.Enf(r0)     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "FbnsPushNotificationProcessor"
            r3.EWo(r0, r1)     // Catch: java.lang.Exception -> L8e
            com.facebook.pushlite.model.PushInfraMetaData$Companion r0 = com.facebook.pushlite.model.PushInfraMetaData.Companion     // Catch: java.lang.Exception -> L8e
            com.facebook.pushlite.model.PushInfraMetaData r6 = r0.A01(r9)     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "FBNS"
            X.5Nu r5 = X.C116155Nu.A00(r9, r0, r5)     // Catch: java.io.IOException -> L32 java.lang.Exception -> L8e
            if (r5 == 0) goto L33
            X.AbstractC43602JQi.A00(r5, r1)     // Catch: java.lang.Exception -> L8e
            goto L33
        L32:
            r5 = 0
        L33:
            r3 = 0
            if (r7 == 0) goto L3a
            com.instagram.common.session.UserSession r3 = X.AbstractC117345St.A00(r7)     // Catch: java.lang.Exception -> L8e
        L3a:
            java.lang.String r0 = "received_logging"
            r4.A02(r9, r0)     // Catch: java.lang.Exception -> L8e
            com.instagram.common.notifications.push.intf.PushChannelType r7 = com.instagram.common.notifications.push.intf.PushChannelType.A05     // Catch: java.lang.Exception -> L8e
            X.AbstractC47872LCs.A00(r6, r5, r7, r3)     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto L63
            boolean r0 = X.AbstractC117345St.A01(r3)     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L63
            X.0do r0 = X.AbstractC43605JQl.A00     // Catch: java.lang.Exception -> L8e
            X.0Tz r0 = X.C06090Tz.A06     // Catch: java.lang.Exception -> L8e
            r5 = 36320326514385264(0x81092500042170, double:3.0324589656887E-306)
            boolean r0 = X.C18U.A06(r0, r3, r5)     // Catch: java.lang.Exception -> L8e
            if (r0 != 0) goto L63
            X.L9c r0 = X.S57.A00(r3)     // Catch: java.lang.Exception -> L8e
            r0.A00(r9, r7, r1)     // Catch: java.lang.Exception -> L8e
            goto L72
        L63:
            X.1WZ r5 = X.C3J1.A00()     // Catch: java.lang.Exception -> L8e
            java.lang.String r3 = X.C3JG.A00(r7)     // Catch: java.lang.Exception -> L8e
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L8e
            r5.A06(r9, r7, r0, r3)     // Catch: java.lang.Exception -> L8e
        L72:
            java.lang.String r0 = "ack_notification"
            r4.A02(r9, r0)     // Catch: java.lang.Exception -> L8e
            android.content.Context r0 = r8.A00     // Catch: java.lang.Exception -> L8e
            X.C3US.A00(r0, r9)     // Catch: java.lang.Exception -> L8e
            com.facebook.quicklog.QuickPerformanceLogger r3 = com.facebook.quicklog.QuickPerformanceLoggerProvider.getQPLInstance()     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto La9
            r2 = 875309620(0x342c2a34, float:1.6034102E-7)
            int r1 = r4.A00(r9)     // Catch: java.lang.Exception -> L8e
            r0 = 2
            r3.markerEnd(r2, r1, r0)     // Catch: java.lang.Exception -> L8e
            return
        L8e:
            r2 = move-exception
            java.lang.String r0 = "on_message_exception"
            r4.A02(r9, r0)
            java.lang.String r0 = r2.getMessage()
            r4.A01(r9, r0)
            java.lang.String r1 = "onMessage"
            java.lang.String r0 = "Unable to process notification"
            A00(r1, r0, r2)
            android.content.Context r1 = r8.A00
            java.lang.String r0 = "ON_MESSAGE_FAILED"
            X.C3US.A01(r1, r9, r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91F.A01(android.content.Intent):void");
    }
}
