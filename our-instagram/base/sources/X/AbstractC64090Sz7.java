package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: X.Sz7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64090Sz7 implements XD3 {
    @Override // X.XD3
    public final boolean ADo(Context context, Intent intent, ServiceConnection serviceConnection) {
        AbstractC167017dG.A1O(context, serviceConnection);
        return context.bindService(intent, serviceConnection, 513);
    }

    @Override // X.XD3
    public final void F94(Context context, ServiceConnection serviceConnection) {
        AbstractC167017dG.A1N(context, serviceConnection);
        context.unbindService(serviceConnection);
    }
}
