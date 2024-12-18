package X;

import java.util.List;

/* renamed from: X.Oqm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55836Oqm implements XA4 {
    public int A00 = -1;
    public int A01 = -1;
    public final Runnable A02;

    public C55836Oqm(Runnable runnable) {
        this.A02 = runnable;
    }

    @Override // X.XA4
    public final void Dx1(List list) {
        if (!list.isEmpty()) {
            int i = ((O75) list.get(0)).A00;
            int i2 = ((O75) list.get(AbstractC25226BEj.A05(list))).A00;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (((O75) list.get(i3)).A01 >= 300 && (i != this.A00 || i2 != this.A01)) {
                    this.A02.run();
                    this.A00 = i;
                    this.A01 = i2;
                    return;
                }
            }
        }
    }
}
