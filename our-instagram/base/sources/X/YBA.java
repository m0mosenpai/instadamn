package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class YBA implements YPb {
    public int A00;
    public boolean A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final YPb[] A03;

    @Override // X.YPb
    public final void A92(InterfaceC73603YNf interfaceC73603YNf) {
        List list = this.A02;
        if (!list.contains(interfaceC73603YNf)) {
            list.add(interfaceC73603YNf);
        }
    }

    @Override // X.YPb
    public final void cancel() {
        if (this.A01) {
            this.A01 = false;
            YPb yPb = this.A03[this.A00];
            if (yPb.isActive()) {
                yPb.cancel();
            }
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((InterfaceC73603YNf) it.next()).DH5(true);
            }
            this.A01 = false;
            this.A00 = 0;
        }
    }

    @Override // X.YPb
    public final void start() {
        if (!this.A01) {
            YPb[] yPbArr = this.A03;
            this.A01 = true;
            yPbArr[this.A00].start();
            return;
        }
        throw AbstractC166987dD.A14("start() called more than once");
    }

    public YBA(YPb[] yPbArr) {
        this.A03 = yPbArr;
        int i = 0;
        do {
            yPbArr[i].A92(new YBB(this, 1));
            i++;
        } while (i < 2);
    }

    @Override // X.YPb
    public final boolean isActive() {
        return this.A01;
    }
}
