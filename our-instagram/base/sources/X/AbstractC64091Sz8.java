package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;

/* renamed from: X.Sz8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64091Sz8 implements XD3 {
    public final Handler A00 = AbstractC167007dF.A0J();

    @Override // X.XD3
    public final boolean ADo(Context context, Intent intent, ServiceConnection serviceConnection) {
        C14360o3.A0B(serviceConnection, 2);
        this.A00.postDelayed(new TKM(serviceConnection), 500L);
        return true;
    }

    @Override // X.XD3
    public final void F94(Context context, ServiceConnection serviceConnection) {
    }
}
