package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class YB9 implements YPb {
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
            for (YPb yPb : this.A03) {
                if (yPb.isActive()) {
                    yPb.cancel();
                }
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
            int length = yPbArr.length;
            if (length == 0) {
                throw AbstractC166987dD.A12("Empty animators collection");
            }
            this.A01 = true;
            int i = 0;
            do {
                yPbArr[i].start();
                i++;
            } while (i < length);
            return;
        }
        throw AbstractC166987dD.A14("start() called more than once");
    }

    public YB9(YPb[] yPbArr) {
        this.A03 = yPbArr;
        for (YPb yPb : yPbArr) {
            yPb.A92(new YBB(this, 0));
        }
    }

    @Override // X.YPb
    public final boolean isActive() {
        return this.A01;
    }
}
