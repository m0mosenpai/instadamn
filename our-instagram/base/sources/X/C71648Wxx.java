package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.Wxx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71648Wxx implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        AbstractC167017dG.A1N(entry, entry2);
        return C14360o3.A01(((Number) entry2.getValue()).longValue(), ((Number) entry.getValue()).longValue());
    }
}
