package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.SkD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63434SkD implements ServiceConnection {
    public final /* synthetic */ C63185Sek A00;

    public /* synthetic */ ServiceConnectionC63434SkD(C63185Sek c63185Sek) {
        this.A00 = c63185Sek;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C63185Sek c63185Sek = this.A00;
        c63185Sek.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c63185Sek.A01().post(new C60737ROz(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C63185Sek c63185Sek = this.A00;
        c63185Sek.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c63185Sek.A01().post(new C60735ROx(this));
    }
}
