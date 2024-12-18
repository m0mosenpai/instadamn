package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes10.dex */
public final /* synthetic */ class TSM implements Comparator {
    public static final /* synthetic */ TSM A00 = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
