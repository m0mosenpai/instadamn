package X;

import android.widget.ImageView;

/* loaded from: classes9.dex */
public final class POR implements Runnable {
    public final /* synthetic */ OUL A00;

    public POR(OUL oul) {
        this.A00 = oul;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OUL oul = this.A00;
        ImageView imageView = oul.A03;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0A = AbstractC125325le.A00(imageView).A0E(OUL.A06).A0A();
        A0A.A0U(1.0f, 0.9f, -1.0f);
        A0A.A0V(1.0f, 0.9f, -1.0f);
        A0A.A0M(1.0f, 0.0f);
        PHM.A00(A0A, oul, 7);
    }
}
