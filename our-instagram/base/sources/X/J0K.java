package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class J0K implements InterfaceC125355lh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AbstractC125325le A02;

    public J0K(View view, AbstractC125325le abstractC125325le, int i) {
        this.A02 = abstractC125325le;
        this.A01 = view;
        this.A00 = i;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        this.A02.A05 = null;
        AbstractC80603ip.A03(this.A01, this.A00);
    }
}
