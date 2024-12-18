package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class J0M implements InterfaceC125355lh {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC125355lh A01;
    public final /* synthetic */ AbstractC125325le A02;

    public J0M(View view, InterfaceC125355lh interfaceC125355lh, AbstractC125325le abstractC125325le) {
        this.A02 = abstractC125325le;
        this.A00 = view;
        this.A01 = interfaceC125355lh;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        this.A02.A05 = null;
        AbstractC80603ip.A04(this.A00, this.A01);
    }
}
