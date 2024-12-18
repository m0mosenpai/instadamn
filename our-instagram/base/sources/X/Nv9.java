package X;

import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class Nv9 {
    public static C51850Mvs A00(InterfaceC58256Ps0 interfaceC58256Ps0, MediaKitSectionType mediaKitSectionType, String str, String str2, String str3, List list, List list2) {
        ArrayList arrayList;
        AbstractC167017dG.A0x();
        if (list2 != null) {
            arrayList = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = null;
        }
        return new C51850Mvs(interfaceC58256Ps0 != null ? (C51849Mvr) interfaceC58256Ps0 : null, mediaKitSectionType, str, str2, str3, list, arrayList);
    }
}
