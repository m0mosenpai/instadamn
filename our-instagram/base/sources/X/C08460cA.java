package X;

import android.os.Binder;
import android.os.Build;
import android.os.Process;

/* renamed from: X.0cA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08460cA {
    public final int A00;

    public C08460cA(int i) {
        this.A00 = i;
    }

    public static C08460cA A00() {
        int callingUid;
        if (Binder.getCallingPid() != Process.myPid()) {
            if (Build.VERSION.SDK_INT >= 29) {
                callingUid = Binder.getCallingUidOrThrow();
            } else {
                callingUid = Binder.getCallingUid();
            }
            Binder.getCallingPid();
            return new C08460cA(callingUid);
        }
        throw new SecurityException("This method must be called on behalf of an IPC transaction from binder thread.");
    }
}
