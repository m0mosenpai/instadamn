package androidx.work.impl.foreground;

import X.AbstractC167007dF;
import X.AbstractServiceC09080dF;
import X.C0f9;
import X.C48442Kl;
import X.C58569Pxl;
import X.InterfaceC65192Tfa;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

/* loaded from: classes10.dex */
public class SystemForegroundService extends AbstractServiceC09080dF implements InterfaceC65192Tfa {
    public static SystemForegroundService A04;
    public static final String A05 = C48442Kl.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public C58569Pxl A02;
    public boolean A03;

    private void A00() {
        this.A01 = AbstractC167007dF.A0J();
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C58569Pxl c58569Pxl = new C58569Pxl(getApplicationContext());
        this.A02 = c58569Pxl;
        if (c58569Pxl.A01 != null) {
            C48442Kl.A00();
            Log.e(C58569Pxl.A0A, "A callback already exists.");
        } else {
            c58569Pxl.A01 = this;
        }
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onCreate() {
        int A042 = C0f9.A04(542854367);
        super.onCreate();
        A04 = this;
        A00();
        C0f9.A0B(-633789508, A042);
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onDestroy() {
        int A042 = C0f9.A04(-566810271);
        super.onDestroy();
        this.A02.A00();
        C0f9.A0B(1202368101, A042);
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final int onStartCommand(Intent intent, int flags, int startId) {
        int A042 = C0f9.A04(657847458);
        super.onStartCommand(intent, flags, startId);
        if (this.A03) {
            C48442Kl.A00();
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent != null) {
            this.A02.A01(intent);
        }
        C0f9.A0B(-2096868043, A042);
        return 3;
    }
}
