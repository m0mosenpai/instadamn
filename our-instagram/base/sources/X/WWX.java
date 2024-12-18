package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WWX implements X99 {
    public final String A00;

    @Override // X.X99
    public final void ATJ(C69585Vro c69585Vro, Map map) {
        List list;
        List<AbstractC56612iu> list2;
        Number number = (Number) map.get("opacity_value_key");
        Float[] fArr = (Float[]) map.get("opacity_values_key");
        if (number == null) {
            if (fArr == null) {
                throw new IllegalArgumentException("No opacity values in extras");
            }
        } else {
            try {
                AbstractC56582ir abstractC56582ir = ((AnonymousClass693) c69585Vro.A00).A01;
                String str = this.A00;
                Map map2 = abstractC56582ir.A02;
                if (map2 != null && (list = (List) map2.get(str)) != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC56612iu) it.next()).A06 = number.floatValue();
                    }
                }
                if (fArr == null) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        AbstractC56582ir abstractC56582ir2 = ((AnonymousClass693) c69585Vro.A00).A01;
        String str2 = this.A00;
        Map map3 = abstractC56582ir2.A02;
        if (map3 != null && (list2 = (List) map3.get(str2)) != null) {
            for (AbstractC56612iu abstractC56612iu : list2) {
                int length = fArr.length;
                float[] fArr2 = new float[length];
                for (int i = 0; i < length; i++) {
                    fArr2[i] = fArr[i].floatValue();
                }
                C68i c68i = abstractC56612iu.A0j;
                if (c68i != null) {
                    c68i.A00 = fArr2;
                }
            }
        }
    }

    public WWX(String str) {
        this.A00 = str;
    }
}
