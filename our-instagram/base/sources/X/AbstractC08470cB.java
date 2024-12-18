package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Process;

/* renamed from: X.0cB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08470cB {
    public static C0LG A00(BroadcastReceiver broadcastReceiver, Context context) {
        String sentFromPackage;
        if (Build.VERSION.SDK_INT < 34 || (sentFromPackage = broadcastReceiver.getSentFromPackage()) == null) {
            return null;
        }
        return C0LG.A02(context, sentFromPackage, true);
    }

    public static C0LG A01(Context context, Intent intent, InterfaceC08100bW interfaceC08100bW, int i, long j) {
        C0LG A00;
        Activity activity;
        Intent intent2;
        String callingPackage;
        if (intent != null && (A00 = AbstractC08500cE.A00(context, intent, interfaceC08100bW, i)) != null) {
            if ((j & 32) == 0 && Binder.getCallingPid() != Process.myPid()) {
                int callingUid = Binder.getCallingUid();
                int i2 = A00.A00;
                if (callingUid != i2) {
                    String A0n = AnonymousClass001.A0n("Uid ", " from PI not equal to uid ", " from binder data", i2, Binder.getCallingUid());
                    if (interfaceC08100bW != null && !A0n.isEmpty()) {
                        interfaceC08100bW.EH9(A0n);
                    }
                }
            }
            return A00;
        }
        if (!(context instanceof Activity) || (((intent2 = (activity = (Activity) context).getIntent()) != null && intent2.hasExtra("CI_SKIP_CALLER_FROM_ACTIVITY")) || (callingPackage = activity.getCallingPackage()) == null)) {
            if (Binder.getCallingPid() == Process.myPid()) {
                if (interfaceC08100bW != null && !"This method must be called on behalf of an IPC transaction from binder thread.".isEmpty()) {
                    interfaceC08100bW.EH9("This method must be called on behalf of an IPC transaction from binder thread.");
                }
                A00 = null;
            } else {
                A00 = C0LG.A00(context, Binder.getCallingUid(), true);
            }
            if (A00 == null && interfaceC08100bW != null && !"AppIdentity not found for caller".isEmpty()) {
                interfaceC08100bW.EH9("AppIdentity not found for caller");
            }
            return A00;
        }
        return C0LG.A02(context, callingPackage, true);
    }
}
