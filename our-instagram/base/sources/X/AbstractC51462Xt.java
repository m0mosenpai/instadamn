package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51462Xt extends AbstractC51432Xq {
    public final ArrayList A00 = new ArrayList();

    public abstract AbstractC107474ss A03(List list);

    /* JADX WARN: Multi-variable type inference failed */
    private void A02(AbstractC51432Xq abstractC51432Xq) {
        ArrayList arrayList;
        AbstractC51432Xq abstractC51432Xq2;
        if (abstractC51432Xq instanceof AbstractC89823zO) {
            AbstractC89823zO abstractC89823zO = (AbstractC89823zO) abstractC51432Xq;
            abstractC89823zO.A00();
            ArrayList arrayList2 = abstractC89823zO.A06;
            int size = arrayList2.size();
            arrayList = this.A00;
            if (size > 1) {
                arrayList.add(new C51472Xu(arrayList2));
                return;
            }
            abstractC51432Xq2 = arrayList2.get(0);
        } else {
            if (abstractC51432Xq == null) {
                return;
            }
            arrayList = this.A00;
            abstractC51432Xq2 = abstractC51432Xq;
        }
        arrayList.add(abstractC51432Xq2);
    }

    public AbstractC51462Xt(List list) {
        for (int i = 0; i < list.size(); i++) {
            A02((AbstractC51432Xq) list.get(i));
        }
    }

    public AbstractC51462Xt(AbstractC51432Xq... abstractC51432XqArr) {
        for (AbstractC51432Xq abstractC51432Xq : abstractC51432XqArr) {
            A02(abstractC51432Xq);
        }
    }
}
