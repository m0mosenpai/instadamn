package X;

import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class PR5 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ViewGroup A01;

    public PR5(ViewGroup viewGroup, float f) {
        this.A01 = viewGroup;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A01;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0o = AbstractC43592JPx.A0o(viewGroup, 0);
        A0o.A0T(this.A00, viewGroup.getTranslationY());
        A0o.A04 = 0;
        A0o.A0H();
    }
}
