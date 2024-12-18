package X;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class B0N implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C2BS.A00(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
    }
}
