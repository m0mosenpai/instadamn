package X;

import com.instagram.api.schemas.UserTagInfoDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HwX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40442HwX {
    public static C84513px A00(List list) {
        C1DY A0b = AbstractC25235BEs.A0b(AbstractC37301Gc2.A08());
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((UserTagInfoDictIntf) it.next()).F3g(A0b));
        }
        return new C84513px(A0q);
    }
}
