package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.91D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91D extends C91E {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        int i;
        int A01 = C0f9.A01(-99682050);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        if (intent.getAction() == null) {
            AnonymousClass919 anonymousClass919 = AnonymousClass918.A00;
            anonymousClass919.A02(intent, "intent_action_empty");
            anonymousClass919.A01(intent, "intent action was empty");
            i = -234269544;
        } else {
            AnonymousClass919 anonymousClass9192 = AnonymousClass918.A00;
            anonymousClass9192.A02(intent, "wakefull_push_executor");
            anonymousClass9192.A02(intent, "no_wakefull_push_executor");
            C09Y c09y = C023409i.A0A;
            final C91F c91f = new C91F(context, c09y.A05(this));
            AbstractC18680vv A05 = c09y.A05(this);
            C14360o3.A0B(A05, 3);
            Object systemService = context.getSystemService("power");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            final PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WakefulPushExecutor");
            C0BX.A02(newWakeLock, "WakefulPushExecutor");
            AbstractC09820fg.A02(newWakeLock);
            newWakeLock.acquire(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            C0BX.A01(newWakeLock, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            C06090Tz c06090Tz = C06090Tz.A05;
            final boolean A06 = C18U.A06(c06090Tz, A05, 36321292882486574L);
            final int i2 = 3;
            if (C18U.A06(c06090Tz, A05, 36321292882552111L)) {
                i2 = 2;
            }
            C14120nc.A00().ATO(new AbstractRunnableC14200nk(i2, A06) { // from class: X.91G
                /* JADX WARN: Code restructure failed: missing block: B:26:0x013f, code lost:
                
                    r0 = "sender_not_preload_fbns";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
                
                    if (r16 != false) goto L95;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 757
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C91G.run():void");
                }
            });
            C226218q.A01(AbstractC12960li.A00).A0L(intent, C05F.A0N);
            i = 280916435;
        }
        C0f9.A0E(i, A01, intent);
    }
}
