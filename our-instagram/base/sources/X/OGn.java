package X;

/* loaded from: classes9.dex */
public final class OGn {
    public final C54653OCf A00 = new C54653OCf(this);

    public final InterfaceC06180Ui A00(EnumC53109NeM enumC53109NeM) {
        O9Y o9y;
        int A05 = AbstractC25227BEk.A05(enumC53109NeM, 0);
        if (A05 != 1) {
            if (A05 == 2) {
                o9y = this.A00.A01;
            } else {
                throw AbstractC166987dD.A12("invalid load type for hints");
            }
        } else {
            o9y = this.A00.A02;
        }
        return o9y.A01;
    }
}
