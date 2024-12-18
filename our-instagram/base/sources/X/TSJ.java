package X;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class TSJ implements Comparator {
    public static final TSJ A00 = new TSJ();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((SHU) obj).A00 - ((SHU) obj2).A00);
    }
}
