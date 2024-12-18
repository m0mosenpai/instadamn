package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes10.dex */
public final class TQL implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C62659SKt A01;
    public final /* synthetic */ InterfaceC65293ThR A02;

    public TQL(C62659SKt c62659SKt, InterfaceC65293ThR interfaceC65293ThR, float f) {
        this.A01 = c62659SKt;
        this.A00 = f;
        this.A02 = interfaceC65293ThR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62659SKt c62659SKt = this.A01;
        float f = this.A00;
        InterfaceC65293ThR interfaceC65293ThR = this.A02;
        Matrix A0Q = AbstractC166987dD.A0Q();
        float f2 = 1.0f / f;
        A0Q.setScale(f2, f2);
        Path A00 = c62659SKt.A00();
        A00.transform(A0Q);
        ((C9LJ) interfaceC65293ThR).A0A = A00;
    }
}
