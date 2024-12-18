package X;

import com.instagram.api.schemas.CameraTool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23038ADu {
    public static final boolean A00(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((OTK) it.next()).A00);
        }
        if (!(A0q instanceof Collection) || !A0q.isEmpty()) {
            for (Object obj : A0q) {
                if (obj == CameraTool.A1F || obj == CameraTool.A1K || obj == CameraTool.A1H || obj == CameraTool.A1G) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((OTK) it.next()).A00);
        }
        if (!(A0q instanceof Collection) || !A0q.isEmpty()) {
            for (Object obj : A0q) {
                if (obj == CameraTool.A1I || obj == CameraTool.A1J) {
                    return true;
                }
            }
        }
        return false;
    }
}
