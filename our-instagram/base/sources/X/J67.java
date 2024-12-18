package X;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class J67 implements Comparator {
    public static final J67 A00 = new J67();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((String) obj2).length() - ((String) obj).length();
    }
}
