package X;

import java.util.Locale;

/* loaded from: classes9.dex */
public final class MX7 implements InterfaceC65452xh {
    public final /* synthetic */ MX3 A00;

    public MX7(MX3 mx3) {
        this.A00 = mx3;
    }

    @Override // X.InterfaceC65452xh
    public final void D2j(int i, int i2, Object obj) {
        String.format(Locale.US, "onChanged(%d, %d)", AbstractC25228BEl.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.D2j(i, i2, obj);
    }

    @Override // X.InterfaceC65452xh
    public final void DMJ(int i, int i2) {
        String.format(Locale.US, "onInserted(%d, %d)", AbstractC25228BEl.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.DMJ(i, i2);
    }

    @Override // X.InterfaceC65452xh
    public final void DTy(int i, int i2) {
        String.format(Locale.US, "onMoved(%d, %d)", AbstractC25228BEl.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.DTy(i, i2);
    }

    @Override // X.InterfaceC65452xh
    public final void DfC(int i, int i2) {
        String.format(Locale.US, "onRemoved(%d, %d)", AbstractC25228BEl.A1Z(Integer.valueOf(i), i2));
        this.A00.A00.DfC(i, i2);
    }
}
