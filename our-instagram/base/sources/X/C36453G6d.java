package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G6d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36453G6d implements MR6 {
    public final int A00;
    public final Object A01;

    @Override // X.MR6
    public final /* synthetic */ void onStart() {
    }

    public C36453G6d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MR6
    public final void onFailure() {
        if (this.A00 != 0) {
            C1346766r c1346766r = (C1346766r) this.A01;
            c1346766r.A02(new C48496Lcn("failed to fetch DirectThreadData."));
            c1346766r.A00();
        }
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        if (this.A00 != 0) {
            if (c2ec != null) {
                ((C1346766r) this.A01).A02(new C132955zK(c2ec));
            }
            ((C1346766r) this.A01).A00();
            return;
        }
        C34519FJf c34519FJf = (C34519FJf) this.A01;
        if (c2ec != null) {
            List BSH = c2ec.BSH();
            C14360o3.A0A(BSH);
            ArrayList A0q = AbstractC167017dG.A0q(BSH);
            Iterator it = BSH.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                ImageUrl imageUrl = PendingRecipient.A0g;
                C14360o3.A0A(A15);
                A0q.add(new PendingRecipient(A15));
            }
            List A0a = AbstractC001800i.A0a(A0q);
            c34519FJf.A01.invoke(new DirectShareTarget(AbstractC31232DoF.A00(c34519FJf.A00, A0a), null, A0a, true));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MR6
    public final /* synthetic */ void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
    }

    @Override // X.MR6
    public final /* synthetic */ void onSuccessInBackground(C2EC c2ec) {
    }
}
