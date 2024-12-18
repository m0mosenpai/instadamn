package com.instagram.fbpay.w3c.ipc;

import X.AbstractServiceC09080dF;
import X.C023409i;
import X.C0f9;
import X.C14360o3;
import X.C48092Iw;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.fbpay.w3c.ipc.BaseIsReadyToPayServiceImpl$handler$1;

/* loaded from: classes.dex */
public final class IsReadyToPayServiceImpl extends AbstractServiceC09080dF {
    public final Handler A00 = new Handler();
    public final BaseIsReadyToPayServiceImpl$handler$1 A01 = new BaseIsReadyToPayServiceImpl$handler$1(this);

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final IBinder onBind(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onBind(intent);
        return this.A01;
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-371617077);
        super.onCreate();
        C48092Iw.A06.A00(C023409i.A0A.A08(this));
        C0f9.A0B(-1967329663, A04);
    }
}
