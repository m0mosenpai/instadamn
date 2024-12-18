package X;

import android.os.IBinder;
import androidx.work.multiprocess.RemoteCallback;

/* renamed from: X.Skh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63462Skh implements IBinder.DeathRecipient {
    public final RemoteCallback A00;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.A00.DG4("Binder died");
    }

    public C63462Skh(RemoteCallback remoteCallback) {
        this.A00 = remoteCallback;
    }
}
