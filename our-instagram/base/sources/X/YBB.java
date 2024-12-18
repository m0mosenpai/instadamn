package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YBB implements InterfaceC73603YNf {
    public final int A00;
    public final Object A01;

    public YBB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC73603YNf
    public final void DH5(boolean z) {
        if (this.A00 != 0) {
            if (z) {
                YBA yba = (YBA) this.A01;
                if (yba.A01) {
                    yba.cancel();
                    return;
                }
            }
            YBA yba2 = (YBA) this.A01;
            if (!yba2.A01 || z) {
                return;
            }
            int i = yba2.A00 + 1;
            yba2.A00 = i;
            YPb[] yPbArr = yba2.A03;
            if (i == 2) {
                yba2.A01 = false;
                yba2.A00 = 0;
                Iterator it = yba2.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC73603YNf) it.next()).DH5(false);
                }
                return;
            }
            yPbArr[i].start();
            return;
        }
        if (z) {
            YB9 yb9 = (YB9) this.A01;
            if (yb9.A01) {
                yb9.cancel();
                return;
            }
        }
        YB9 yb92 = (YB9) this.A01;
        if (!yb92.A01 || z) {
            return;
        }
        int i2 = yb92.A00 + 1;
        yb92.A00 = i2;
        if (yb92.A03.length != i2) {
            return;
        }
        yb92.A01 = false;
        yb92.A00 = 0;
        Iterator it2 = yb92.A02.iterator();
        while (it2.hasNext()) {
            ((InterfaceC73603YNf) it2.next()).DH5(false);
        }
    }
}
