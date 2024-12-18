package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes10.dex */
public final class RaE<FieldDescriptorType> extends TZJ<FieldDescriptorType, Object> {
    @Override // X.TZJ, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put(null, obj2);
    }

    @Override // X.TZJ
    public final void A05() {
        Iterable entrySet;
        if (!this.A02) {
            if (0 < this.A00.size()) {
                ((Map.Entry) this.A00.get(0)).getKey();
                throw AbstractC166987dD.A15("isRepeated");
            }
            if (this.A01.isEmpty()) {
                entrySet = S9C.A00;
            } else {
                entrySet = this.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                AbstractC166987dD.A1K(it).getKey();
                throw AbstractC166987dD.A15("isRepeated");
            }
        }
        super.A05();
    }

    public RaE(int i) {
        super(i);
    }
}
