package X;

import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.BUx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25635BUx implements InterfaceC30936Diq {
    public final /* synthetic */ C25634BUw A00;

    public C25635BUx(C25634BUw c25634BUw) {
        this.A00 = c25634BUw;
    }

    @Override // X.InterfaceC30936Diq
    public final void Dmq(int i, int i2) {
        C25634BUw c25634BUw = this.A00;
        C2XV.A00();
        C1LP A00 = ComponentsSystrace.A00("LithoViewPagerAdapter.setDimensions");
        A00.ACV("widthPx", i);
        A00.ACV("heightPx", i2);
        A00.flush();
        c25634BUw.A02 = i;
        c25634BUw.A01 = i2;
        C25634BUw.A00(c25634BUw);
        ComponentsSystrace.A01();
    }
}
