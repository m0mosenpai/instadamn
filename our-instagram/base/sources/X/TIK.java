package X;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes10.dex */
public final class TIK implements Serializable, Cloneable {
    public final int A00;
    public final List A01;

    public TIK(List list, int i) {
        C14360o3.A0B(list, 1);
        this.A00 = i;
        this.A01 = AbstractC166987dD.A1E();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = this.A01;
            Object obj = list.get(i2);
            C14360o3.A0A(obj);
            TIT tit = (TIT) obj;
            list2.add(new TIT(tit.A00, tit.A03, tit.A01, tit.A02));
        }
    }

    public final TIT A00(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                return (TIT) list.get(i);
            }
            return null;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new TIK(this.A01, this.A00);
    }
}
