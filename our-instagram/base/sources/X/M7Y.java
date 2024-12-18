package X;

import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public final class M7Y implements Comparator {
    public final List A00;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Folder folder = (Folder) obj;
        Folder folder2 = (Folder) obj2;
        AbstractC167017dG.A1N(folder, folder2);
        List list = this.A00;
        int indexOf = list.indexOf(Integer.valueOf(folder.A02));
        if (indexOf == -1) {
            indexOf = list.size();
        }
        int i = indexOf + 1;
        int indexOf2 = list.indexOf(Integer.valueOf(folder2.A02));
        if (indexOf2 == -1) {
            indexOf2 = list.size();
        }
        int i2 = i - (indexOf2 + 1);
        if (i2 != 0) {
            i2 /= Math.abs(i2);
        }
        int compareTo = AbstractC37303Gc4.A0X(folder.getName()).compareTo(AbstractC37303Gc4.A0X(folder2.getName()));
        if (i2 == 0) {
            return compareTo;
        }
        return i2;
    }

    public M7Y(List list) {
        this.A00 = list;
    }
}
