package X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.3yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89373yd {
    public static C005001p A00(ArrayList arrayList, ArrayList arrayList2) {
        File file;
        int size = arrayList.size();
        if (size == arrayList2.size()) {
            C005001p c005001p = new C005001p(size);
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList2.get(i);
                Object obj = arrayList.get(i);
                if (str != null) {
                    file = new File(str);
                } else {
                    file = null;
                }
                c005001p.put(obj, file);
            }
            return c005001p;
        }
        throw new IllegalArgumentException(AnonymousClass001.A02(size, arrayList2.size(), "processes has ", "; newestFilesUploaded has "));
    }
}
