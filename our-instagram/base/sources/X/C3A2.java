package X;

import android.os.Handler;

/* renamed from: X.3A2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A2 implements C3A3 {
    public static final C3A2 A00 = new Object();
    public static final Handler A01 = new Handler(C1CG.A00());

    @Override // X.C3A3
    public final void AGQ() {
        A01.removeCallbacksAndMessages(null);
    }

    @Override // X.C3A3
    public final void ATR(final InterfaceC16820sZ interfaceC16820sZ) {
        A01.post(new Runnable() { // from class: X.9Gb
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC16820sZ.this.invoke();
            }
        });
    }
}
