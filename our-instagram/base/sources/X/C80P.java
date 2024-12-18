package X;

import android.content.Context;
import com.facebook.react.views.textinput.ReactTextInputManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.80P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80P implements C80Q {
    public APK A00;
    public Thread A01;
    public final Context A02;
    public final boolean A06;
    public final boolean A07;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A04 = new AtomicBoolean(false);

    @Override // X.C80Q
    public final synchronized APK B3e() {
        return this.A00;
    }

    @Override // X.C80Q
    public final synchronized void Enz() {
        if (this.A06 && this.A01 == null) {
            this.A01 = new Thread(new RunnableC24427As8(this), AbstractC111324zv.A00(ReactTextInputManager.IME_ACTION_ID));
            this.A05.set(false);
            this.A04.set(false);
            Thread thread = this.A01;
            if (thread != null) {
                thread.start();
            }
        }
    }

    @Override // X.C80Q
    public final synchronized void Eoh() {
        A00();
    }

    @Override // X.C80Q
    public final synchronized void cleanup() {
        if (!this.A06) {
            A01(this);
        } else {
            A00();
        }
    }

    private final void A00() {
        if (this.A06 && this.A01 != null) {
            AtomicBoolean atomicBoolean = this.A05;
            atomicBoolean.set(true);
            while (true) {
                AtomicBoolean atomicBoolean2 = this.A04;
                if (!atomicBoolean2.get()) {
                    Thread.sleep(10L);
                } else {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    this.A01 = null;
                    return;
                }
            }
        }
    }

    public static final void A01(C80P c80p) {
        APK apk = c80p.A00;
        if (apk != null) {
            apk.A03();
        }
        c80p.A00 = null;
        c80p.A03.set(false);
    }

    public final void finalize() {
        if (this.A07 && this.A03.get()) {
            A01(this);
        }
    }

    public C80P(Context context, boolean z, boolean z2) {
        this.A02 = context;
        this.A06 = z;
        this.A07 = z2;
        if (!z) {
            this.A00 = new APK(this.A02, this.A06);
            this.A03.set(true);
            APK apk = this.A00;
            if (apk != null) {
                apk.onSurfaceCreated(null, null);
            }
        }
    }
}
