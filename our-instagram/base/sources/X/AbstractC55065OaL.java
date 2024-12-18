package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.facebook.assistant.stella.ipc.common.request.IpcRequest;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.OaL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55065OaL {
    public static final ScheduledExecutorService A08 = Executors.newSingleThreadScheduledExecutor();
    public boolean A02;
    public int A03;
    public final Context A04;
    public final Object A06 = new Object();
    public Handler A00 = AbstractC167007dF.A0J();
    public final Runnable A07 = new RunnableC56843PKn(this);
    public SettableFuture A01 = new Object();
    public final ServiceConnection A05 = new WIJ(this, 0);

    public static final void A00(IpcRequest ipcRequest, AbstractC55065OaL abstractC55065OaL) {
        synchronized (abstractC55065OaL.A06) {
            abstractC55065OaL.A03--;
            C52028N0a c52028N0a = ipcRequest.A00;
            c52028N0a.A04("execution_end");
            if (abstractC55065OaL.A03 > 0) {
                c52028N0a.A06(((AbstractC55094Ob5) c52028N0a).A00);
            } else {
                Handler handler = abstractC55065OaL.A00;
                Runnable runnable = abstractC55065OaL.A07;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                abstractC55065OaL.A03 = 0;
                c52028N0a.A06(((AbstractC55094Ob5) c52028N0a).A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.7O2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.pm.PackageInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.facebook.assistant.stella.ipc.common.request.IpcRequest r10) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55065OaL.A01(com.facebook.assistant.stella.ipc.common.request.IpcRequest):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public AbstractC55065OaL(Context context) {
        this.A04 = context;
    }
}
