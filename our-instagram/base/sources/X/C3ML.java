package X;

import android.os.Build;
import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: X.3ML, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3ML {
    public static final C3MN[] A00(C3MJ c3mj) {
        if (Build.VERSION.SDK_INT >= 29) {
            C3MN c3mn = new C3MN(c3mj, new File(C3MM.A01));
            C3MN c3mn2 = new C3MN(c3mj, new File(C3MM.A02));
            File file = C3MM.A00;
            if (file != null) {
                return new C3MN[]{c3mn, c3mn2, new C3MN(c3mj, file)};
            }
            throw new IllegalStateException("Required value was null.");
        }
        return new C3MN[]{new C3MN(c3mj, C3MM.A01), new C3MN(c3mj, C3MM.A02)};
    }

    public static final File[] A01(File[] fileArr, int i) {
        final C9QI c9qi = C9QI.A00;
        TreeSet treeSet = new TreeSet(new Comparator(c9qi) { // from class: X.9QJ
            public final /* synthetic */ InterfaceC16620sF A00;

            {
                C14360o3.A0B(c9qi, 1);
                this.A00 = c9qi;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Number) this.A00.invoke(obj, obj2)).intValue();
            }
        });
        for (File file : fileArr) {
            if (treeSet.size() > i) {
                File file2 = (File) treeSet.first();
                C14360o3.A0A(file2);
                long lastModified = file2.lastModified();
                C14360o3.A0A(file);
                if (lastModified < file.lastModified()) {
                    treeSet.pollFirst();
                }
            }
            treeSet.add(file);
        }
        Object[] array = treeSet.toArray(new File[treeSet.size()]);
        C14360o3.A07(array);
        return (File[]) array;
    }
}
