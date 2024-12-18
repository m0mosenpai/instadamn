package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class B0O implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C2BS.A00(Integer.valueOf(A1W.A00((Integer) ((C9BQ) ((Map.Entry) obj).getValue()).A03)), Integer.valueOf(A1W.A00((Integer) ((C9BQ) ((Map.Entry) obj2).getValue()).A03)));
    }
}
