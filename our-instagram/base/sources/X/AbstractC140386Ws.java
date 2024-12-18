package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140386Ws {
    public static final DirectShareTarget A00(User user, boolean z) {
        InterfaceC83713oG c122145g6;
        PendingRecipient pendingRecipient = new PendingRecipient(user);
        List singletonList = Collections.singletonList(pendingRecipient);
        C14360o3.A07(singletonList);
        String str = pendingRecipient.A0C;
        if (z) {
            c122145g6 = new C23974Ak9(EnumC92794Ds.A04, AbstractC34821FVx.A01(singletonList));
        } else {
            c122145g6 = new C122145g6(singletonList);
        }
        InterfaceC83713oG interfaceC83713oG = c122145g6;
        C14360o3.A0B(interfaceC83713oG, 2);
        return new DirectShareTarget(interfaceC83713oG, str, singletonList, true);
    }
}
