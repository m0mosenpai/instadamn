package X;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.util.Pair;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15110pR implements Comparator {
    public final int A00;

    public C15110pR(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        File file;
        File file2;
        String name;
        String name2;
        switch (this.A00) {
            case 0:
                C0WB c0wb = (C0WB) ((Pair) obj).second;
                double d = c0wb.A03 + c0wb.A02;
                C0WB c0wb2 = (C0WB) ((Pair) obj2).second;
                return Double.compare(d, c0wb2.A03 + c0wb2.A02);
            case 1:
                name = ((Field) obj).getName();
                name2 = ((Field) obj2).getName();
                return name.compareTo(name2);
            case 2:
                file = (File) obj;
                file2 = (File) obj2;
                List list = C0MV.A05;
                break;
            case 3:
                file = (File) obj;
                file2 = (File) obj2;
                break;
            case 4:
                File file3 = (File) obj;
                File file4 = (File) obj2;
                int i = (!file3.getName().startsWith("session_") ? 1 : 0) - (!file4.getName().startsWith("session_") ? 1 : 0);
                if (i != 0) {
                    return i;
                }
                name = file3.getName();
                name2 = file4.getName();
                return name.compareTo(name2);
            default:
                ActivityInfo activityInfo = ((ResolveInfo) obj).activityInfo;
                activityInfo.getClass();
                name = ((PackageItemInfo) activityInfo).packageName;
                ActivityInfo activityInfo2 = ((ResolveInfo) obj2).activityInfo;
                activityInfo2.getClass();
                name2 = ((PackageItemInfo) activityInfo2).packageName;
                return name.compareTo(name2);
        }
        return (int) (file.lastModified() - file2.lastModified());
    }
}
