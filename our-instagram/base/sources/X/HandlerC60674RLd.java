package X;

import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.concurrent.locks.Lock;

/* renamed from: X.RLd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC60674RLd extends HandlerC1336161q {
    public final /* synthetic */ C64225T5a A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC60674RLd(Looper looper, C64225T5a c64225T5a) {
        super(looper);
        this.A00 = c64225T5a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        T5W t5w;
        ConnectionResult connectionResult;
        IAccountAccessor A00;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.w("GACStateManager", AnonymousClass001.A0O("Unknown message id: ", i));
                return;
            }
            throw ((Throwable) message.obj);
        }
        AbstractC62438SBr abstractC62438SBr = (AbstractC62438SBr) message.obj;
        C64225T5a c64225T5a = this.A00;
        Lock lock = c64225T5a.A0D;
        lock.lock();
        try {
            if (c64225T5a.A0E == abstractC62438SBr.A00) {
                if (abstractC62438SBr instanceof C60664RGs) {
                    C60664RGs c60664RGs = (C60664RGs) abstractC62438SBr;
                    t5w = c60664RGs.A00;
                    zak zakVar = c60664RGs.A01;
                    if (T5W.A07(t5w, 0)) {
                        connectionResult = zakVar.A01;
                        if (connectionResult.A01 == 0) {
                            zav zavVar = zakVar.A02;
                            C3U5.A02(zavVar);
                            connectionResult = zavVar.A02;
                            if (connectionResult.A01 == 0) {
                                t5w.A04 = true;
                                IBinder iBinder = zavVar.A01;
                                if (iBinder == null) {
                                    A00 = null;
                                } else {
                                    A00 = AccountAccessor.A00(iBinder);
                                }
                                C3U5.A02(A00);
                                t5w.A00 = A00;
                                t5w.A05 = zavVar.A03;
                                t5w.A06 = zavVar.A04;
                                T5W.A04(t5w);
                            } else {
                                String valueOf = String.valueOf(String.valueOf(connectionResult));
                                android.util.Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                                T5W.A02(connectionResult, t5w);
                            }
                        } else {
                            if (t5w.A02 && connectionResult.A02 == null) {
                                T5W.A03(t5w);
                                T5W.A04(t5w);
                            }
                            T5W.A02(connectionResult, t5w);
                        }
                    }
                } else if (abstractC62438SBr instanceof C60662RGq) {
                    ((C60662RGq) abstractC62438SBr).A00.Dff(new ConnectionResult(16, null));
                } else if (abstractC62438SBr instanceof C60663RGr) {
                    C60663RGr c60663RGr = (C60663RGr) abstractC62438SBr;
                    t5w = c60663RGr.A01.A01;
                    connectionResult = c60663RGr.A00;
                    T5W.A02(connectionResult, t5w);
                } else {
                    ((C60661RGp) abstractC62438SBr).A00.FFA(1);
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
