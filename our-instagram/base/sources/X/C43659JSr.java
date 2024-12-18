package X;

import com.google.common.collect.ImmutableCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.JSr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43659JSr extends C1LT {
    public List A00;

    public C43659JSr(ImmutableCollection futures, boolean allMustSucceed) {
        super(futures, allMustSucceed, true);
        List A17;
        if (futures.isEmpty()) {
            A17 = Collections.emptyList();
        } else {
            int size = futures.size();
            AbstractC24841Jd.A00(size, "initialArraySize");
            A17 = AbstractC25225BEi.A17(size);
        }
        for (int i = 0; i < futures.size(); i++) {
            A17.add(null);
        }
        this.A00 = A17;
        A0C();
    }

    @Override // X.C1LT
    public final void A0D() {
        Object obj;
        List<C44233Jgd> list = this.A00;
        if (list != null) {
            int size = list.size();
            AbstractC24841Jd.A00(size, "initialArraySize");
            ArrayList A17 = AbstractC25225BEi.A17(size);
            for (C44233Jgd c44233Jgd : list) {
                if (c44233Jgd != null) {
                    obj = c44233Jgd.A00;
                } else {
                    obj = null;
                }
                A17.add(obj);
            }
            set(Collections.unmodifiableList(A17));
        }
    }

    @Override // X.C1LT
    public final void A0E(int index, Object returnValue) {
        List list = this.A00;
        if (list != null) {
            list.set(index, new C44233Jgd(returnValue));
        }
    }

    @Override // X.C1LT
    public final void A0F(Integer reason) {
        super.A0F(reason);
        this.A00 = null;
    }
}
