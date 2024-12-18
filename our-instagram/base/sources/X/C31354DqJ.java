package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.DqJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31354DqJ implements C2n2 {
    public final int A00;

    public C31354DqJ(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.47L] */
    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        switch (this.A00) {
            case 2:
                return ((User) obj).getId();
            case 3:
                PendingRecipient pendingRecipient = (PendingRecipient) obj;
                pendingRecipient.getClass();
                str = pendingRecipient.getId();
                break;
            case 4:
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                if (directShareTarget != null && AbstractC31176DnK.A00(directShareTarget) == 1) {
                    boolean A0T = directShareTarget.A0T();
                    PendingRecipient pendingRecipient2 = (PendingRecipient) AbstractC166987dD.A16(AbstractC31172DnG.A18(directShareTarget));
                    C14360o3.A0B(pendingRecipient2, 1);
                    pendingRecipient2.A0L = A0T;
                    return pendingRecipient2.getId();
                }
                return null;
            case 5:
                str = (String) obj;
                break;
            case 6:
                ?? obj2 = new Object();
                obj2.A08 = ((C47O) obj).A0F;
                obj2.A01();
                return obj2;
            default:
                C34710FQv c34710FQv = (C34710FQv) obj;
                if (c34710FQv != null) {
                    return c34710FQv.A01;
                }
                return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }
}
