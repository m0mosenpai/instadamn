package X;

import android.content.Context;
import android.os.HandlerThread;
import com.facebook.react.views.textinput.ReactTextInputManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.WiS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70862WiS implements C80Q {
    public HandlerThread A00;
    public C69560VrP A01;
    public APK A02;
    public final Context A03;
    public final boolean A07;
    public final boolean A08;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicBoolean A06 = new AtomicBoolean(false);

    @Override // X.C80Q
    public final synchronized void Eoh() {
        if (this.A07) {
            this.A04.set(false);
            HandlerThread handlerThread = this.A00;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        }
    }

    public static final void A00(C70862WiS c70862WiS) {
        APK apk = c70862WiS.A02;
        if (apk != null) {
            apk.A03();
        }
        c70862WiS.A02 = null;
        c70862WiS.A05.set(false);
    }

    @Override // X.C80Q
    public final APK B3e() {
        return this.A02;
    }

    @Override // X.C80Q
    public final void Enz() {
        HandlerThread handlerThread;
        if (this.A07) {
            HandlerThread handlerThread2 = this.A00;
            if (handlerThread2 == null) {
                handlerThread2 = MSY.A0A(AbstractC111324zv.A00(ReactTextInputManager.IME_ACTION_ID));
                this.A00 = handlerThread2;
            }
            if (!handlerThread2.isAlive() && (handlerThread = this.A00) != null) {
                handlerThread.start();
            }
            HandlerThread handlerThread3 = this.A00;
            if (handlerThread3 != null) {
                this.A04.set(true);
                MSY.A09(handlerThread3).post(new RunnableC71343WsB(this));
            }
        }
    }

    @Override // X.C80Q
    public final void cleanup() {
        if (!this.A07) {
            A00(this);
        } else {
            Eoh();
        }
    }

    public final void finalize() {
        if (this.A08 && this.A05.get()) {
            A00(this);
        }
    }

    public C70862WiS(Context context, boolean z, boolean z2) {
        this.A03 = context;
        this.A07 = z;
        this.A08 = z2;
        if (!z) {
            this.A05.set(true);
            APK apk = new APK(this.A03, this.A07);
            this.A02 = apk;
            apk.onSurfaceCreated(null, null);
        }
    }
}
