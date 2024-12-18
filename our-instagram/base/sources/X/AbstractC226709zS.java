package X;

import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9zS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226709zS {
    public static final IngestSessionShim A00(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((A5X) it.next()).A00);
        }
        return new IngestSessionShim(AbstractC001800i.A0U(A0q));
    }
}
