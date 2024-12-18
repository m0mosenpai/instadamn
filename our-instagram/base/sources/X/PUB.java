package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PUB implements Comparator {
    public static final PUB A00 = new PUB();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C14360o3.A0A(entry);
        Object value = entry.getValue();
        C14360o3.A0A(entry2);
        return C55123Obk.A07.compare(value, entry2.getValue());
    }
}
