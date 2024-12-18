package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Deprecated;

/* renamed from: X.0dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC09080dF extends Service implements C07X {
    public final C65832Tup A00 = new C65832Tup(this);

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A00.A01();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.A00.A02();
        return null;
    }

    @Override // android.app.Service
    @Deprecated(message = "Deprecated in Java")
    public final void onStart(Intent intent, int i) {
        this.A00.A05();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public void onCreate() {
        int A04 = C0f9.A04(786295562);
        this.A00.A03();
        super.onCreate();
        C0f9.A0B(619807071, A04);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = C0f9.A04(1661363161);
        this.A00.A04();
        super.onDestroy();
        C0f9.A0B(-1692196149, A04);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-1616539017);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C0f9.A0B(2113204911, A04);
        return onStartCommand;
    }
}
