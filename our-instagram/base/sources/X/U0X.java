package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U0X implements Comparator {
    public static final U0X A00 = new U0X();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((U0r) ((Map.Entry) obj).getValue()).A00 - ((U0r) ((Map.Entry) obj2).getValue()).A00;
    }
}
