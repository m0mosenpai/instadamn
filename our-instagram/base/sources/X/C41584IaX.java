package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.IaX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41584IaX {
    public long A00;
    public C75363a3 A01;
    public final List A03 = AbstractC166987dD.A1E();
    public boolean A02 = true;

    public static void A00(C41584IaX c41584IaX, int i, int i2) {
        Iterator it = c41584IaX.A03.iterator();
        while (it.hasNext()) {
            ((JHW) it.next()).Dsz(i, i2);
        }
    }

    public C41584IaX(C75363a3 c75363a3) {
        this.A01 = c75363a3;
    }
}
