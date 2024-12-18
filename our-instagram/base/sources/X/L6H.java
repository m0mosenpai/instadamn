package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class L6H {
    public final /* synthetic */ LJc A00;

    public L6H(LJc lJc) {
        this.A00 = lJc;
    }

    public final void A00(C45204Jzk c45204Jzk) {
        LJc lJc = this.A00;
        List list = lJc.A0B;
        if (list.size() > 1 && list.indexOf(c45204Jzk) != AbstractC31172DnG.A03(list, 1)) {
            list.remove(c45204Jzk);
            LJc.A01(lJc);
            LJc.A00(lJc);
        }
    }
}
