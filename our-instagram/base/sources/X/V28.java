package X;

import java.util.HashMap;

/* loaded from: classes11.dex */
public final class V28 extends AbstractC68956Veu {
    public V28() {
        int i;
        String str;
        this.A00 = 2131975609;
        HashMap hashMap = new HashMap();
        for (Integer num : C05F.A00(7)) {
            switch (num.intValue()) {
                case 1:
                    i = 2131975604;
                    break;
                case 2:
                    i = 2131975605;
                    break;
                case 3:
                    i = 2131975606;
                    break;
                case 4:
                    i = 2131975601;
                    break;
                case 5:
                    i = 2131975603;
                    break;
                case 6:
                    i = 2131975609;
                    break;
                default:
                    i = 2131975608;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            switch (num.intValue()) {
                case 1:
                    str = "ONE_MONTH";
                    break;
                case 2:
                    str = "THREE_MONTHS";
                    break;
                case 3:
                    str = "SIX_MONTHS";
                    break;
                case 4:
                    str = "ONE_YEAR";
                    break;
                case 5:
                    str = "TWO_YEARS";
                    break;
                case 6:
                    str = "LIFETIME";
                    break;
                default:
                    str = "ONE_WEEK";
                    break;
            }
            hashMap.put(valueOf, str);
        }
        this.A01 = hashMap;
    }
}
