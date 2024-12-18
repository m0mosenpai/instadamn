package com.facebook.browser.lite.ipc;

import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes10.dex */
public interface MoreInfoCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements MoreInfoCallback {
        public static void A00(IBinder iBinder) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.MoreInfoCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof MoreInfoCallback)) {
                    return;
                }
                C0f9.A0A(796634712, C0f9.A03(-265240033));
            }
        }
    }
}
