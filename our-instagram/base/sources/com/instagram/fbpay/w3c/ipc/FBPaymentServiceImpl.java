package com.instagram.fbpay.w3c.ipc;

import X.AbstractServiceC09080dF;
import X.C023409i;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.C2J7;
import X.C2J8;
import X.C48092Iw;
import X.C62761SPt;
import X.C62968SZl;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1;

/* loaded from: classes.dex */
public final class FBPaymentServiceImpl extends AbstractServiceC09080dF {
    public C62968SZl A01;
    public C62761SPt A02;
    public Handler A00 = new Handler(Looper.getMainLooper());
    public final IBinder A03 = new BaseFBPaymentServiceImpl$handler$1(this);

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final IBinder onBind(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onBind(intent);
        return this.A03;
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1362990388);
        try {
            C48092Iw.A06.A00(C023409i.A0A.A08(this));
            int A042 = C0f9.A04(1408799784);
            super.onCreate();
            C2J7 c2j7 = C2J8.A04;
            this.A01 = (C62968SZl) C2J7.A00().A03.getValue();
            this.A02 = c2j7.A02();
            C0f9.A0B(1738770915, A042);
        } catch (IllegalStateException e) {
            C0K8.A0O("FBPaymentServiceImpl", "Failed to get user session during onCreate: %s", e.getMessage());
        }
        C0f9.A0B(-1804757592, A04);
    }
}
