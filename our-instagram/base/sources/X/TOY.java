package X;

import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes10.dex */
public final class TOY implements Runnable {
    public final /* synthetic */ zact A00;
    public final /* synthetic */ zak A01;

    public TOY(zact zactVar, zak zakVar) {
        this.A00 = zactVar;
        this.A01 = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor A00;
        zact zactVar = this.A00;
        zak zakVar = this.A01;
        ConnectionResult connectionResult = zakVar.A01;
        if (connectionResult.A01 == 0) {
            zav zavVar = zakVar.A02;
            C3U5.A02(zavVar);
            connectionResult = zavVar.A02;
            if (connectionResult.A01 == 0) {
                C64B c64b = zactVar.A00;
                IBinder iBinder = zavVar.A01;
                if (iBinder == null) {
                    A00 = null;
                } else {
                    A00 = AccountAccessor.A00(iBinder);
                }
                java.util.Set set = zactVar.A06;
                AnonymousClass649 anonymousClass649 = (AnonymousClass649) c64b;
                if (A00 != null && set != null) {
                    anonymousClass649.A00 = A00;
                    anonymousClass649.A01 = set;
                    if (anonymousClass649.A02) {
                        anonymousClass649.A03.BmV(A00, set);
                    }
                } else {
                    android.util.Log.wtf(AbstractC111324zv.A00(3634), "Received null response from onSignInSuccess", new Exception());
                    anonymousClass649.FF6(new ConnectionResult(4));
                }
                zactVar.A01.disconnect();
            }
            String valueOf = String.valueOf(String.valueOf(connectionResult));
            android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
        }
        zactVar.A00.FF6(connectionResult);
        zactVar.A01.disconnect();
    }
}
