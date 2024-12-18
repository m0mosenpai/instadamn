package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.1x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42171x7 extends BroadcastReceiver {
    public Handler A00;
    public final /* synthetic */ C40571uQ A01;

    public C42171x7(C40571uQ c40571uQ) {
        this.A01 = c40571uQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        if (r0.compareTo(r1) > 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r6, android.content.Intent r7, X.C42171x7 r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42171x7.A00(android.content.Context, android.content.Intent, X.1x7):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        int A01 = C0f9.A01(1051680740);
        C0fM.A01(this, context, intent);
        C40571uQ c40571uQ = this.A01;
        if (c40571uQ.A0E) {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            Executor executor = c40571uQ.A09;
            executor.getClass();
            executor.execute(new Runnable() { // from class: X.TQW
                @Override // java.lang.Runnable
                public final void run() {
                    C42171x7 c42171x7 = this;
                    Context context2 = context;
                    Intent intent2 = intent;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    C42171x7.A00(context2, intent2, c42171x7);
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            });
        } else {
            Handler handler = this.A00;
            if (handler != null) {
                handler.post(new Runnable() { // from class: X.3yc
                    @Override // java.lang.Runnable
                    public final void run() {
                        C42171x7.A00(context, intent, this);
                    }
                });
            } else {
                A00(context, intent, this);
            }
        }
        C0f9.A0E(-1671501320, A01, intent);
    }
}
