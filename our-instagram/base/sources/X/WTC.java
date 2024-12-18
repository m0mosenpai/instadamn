package X;

/* loaded from: classes11.dex */
public final class WTC implements InterfaceC021908q {
    public float A00;
    public int A01 = -1;
    public final InterfaceC021908q A02;
    public final /* synthetic */ UKI A03;

    public WTC(InterfaceC021908q interfaceC021908q, UKI uki) {
        this.A03 = uki;
        this.A02 = interfaceC021908q;
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
        if (!this.A03.A01) {
            this.A02.onPageScrollStateChanged(i);
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        UKI uki = this.A03;
        if (!uki.A01) {
            if (f != 0.0f || i2 != 0) {
                i++;
            }
            AbstractC021208i adapter = uki.getAdapter();
            if (adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            if (f < 0.0f && this.A00 > 0.0f && (i3 = this.A01) == i) {
                i = i3 + 1;
                this.A01 = i;
                this.A00 = 0.0f;
                f = 0.0f;
            } else {
                this.A01 = i;
                this.A00 = f;
            }
            InterfaceC021908q interfaceC021908q = this.A02;
            if (f > 0.0f) {
                f = 1.0f - f;
            }
            interfaceC021908q.onPageScrolled(i, f, i2);
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        UKI uki = this.A03;
        if (!uki.A01) {
            InterfaceC021908q interfaceC021908q = this.A02;
            AbstractC021208i adapter = uki.getAdapter();
            if (adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            interfaceC021908q.onPageSelected(i);
        }
    }
}
