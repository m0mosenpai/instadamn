package X;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class V27 extends AbstractC68956Veu {
    public V27() {
        int i;
        String str;
        this.A00 = 2131966078;
        HashMap hashMap = new HashMap();
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                i = 2131966078;
            } else {
                i = 2131966079;
            }
            Integer valueOf = Integer.valueOf(i);
            if (1 - num.intValue() != 0) {
                str = "ELIGIBLE";
            } else {
                str = "NOT_ELIGIBLE";
            }
            hashMap.put(valueOf, str);
        }
        this.A01 = hashMap;
    }
}
