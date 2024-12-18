package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NtG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53943NtG {
    public static final Integer A00(List list) {
        if (list != null) {
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((PendingRecipient) it.next()).A0Q) {
                        return C05F.A01;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((PendingRecipient) it2.next()).A0Y) {
                        return C05F.A0C;
                    }
                }
            }
        }
        return C05F.A00;
    }
}
