package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;

/* renamed from: X.Dvk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31679Dvk implements C2n2 {
    public static final C31679Dvk A00 = new C31679Dvk();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1) {
            return ((PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0)).getId();
        }
        return null;
    }
}
