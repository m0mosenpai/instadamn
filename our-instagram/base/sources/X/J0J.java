package X;

/* loaded from: classes7.dex */
public final class J0J implements InterfaceC125355lh {
    public final int A00;
    public final int A01;
    public final Object A02;

    public J0J(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        switch (this.A00) {
            case 0:
                ((InterfaceC16660sJ) this.A02).invoke(Integer.valueOf(this.A01));
                return;
            case 1:
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = (ViewOnTouchListenerC65896Tw0) this.A02;
                double d = ViewOnTouchListenerC65896Tw0.A0e;
                viewOnTouchListenerC65896Tw0.A0X.DON(this.A01);
                return;
            default:
                if (AbstractC40922IAu.A00((AbstractC12990ll) this.A02).booleanValue() && this.A01 == 0) {
                    C37548Gg4.A07 = true;
                    C41761Iec.A00();
                    return;
                }
                return;
        }
    }
}
