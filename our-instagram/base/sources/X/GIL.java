package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIL implements C7K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GIL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (4 - this.A00 == 0) {
            ((InterfaceC23621Ds) this.A02).resumeWith(null);
        }
    }

    @Override // X.C7K9
    public final void onSuccess(User user) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(user, 0);
                FQ4 fq4 = (FQ4) this.A02;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                EIC eic = new EIC();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(AbstractC31581Du9.A01(), user.getUsername());
                eic.setArguments(A0b);
                eic.A00 = new FL8(fragmentActivity, fq4, user);
                AbstractC31173DnH.A0w(fragmentActivity, eic, AbstractC25225BEi.A0y(fq4.A00));
                return;
            case 1:
            case 2:
                C14360o3.A0B(user, 0);
                C36881nl A01 = C36881nl.A01((DirectThreadInternalUrlHandlerActivity) this.A02, AbstractC31171DnF.A0D("DirectMessageInternalUrlHandler"), (UserSession) this.A01, "direct_thread");
                AbstractC31179DnN.A1Q(A01, user);
                A01.A0k = true;
                A01.A06();
                return;
            case 3:
                C14360o3.A0B(user, 0);
                C32259EIt c32259EIt = (C32259EIt) this.A02;
                c32259EIt.A00 = user;
                C32259EIt.A00((View) this.A01, c32259EIt);
                return;
            case 4:
                C14360o3.A0B(user, 0);
                ((BrandedContentTag) this.A01).A00 = user;
                ((InterfaceC23621Ds) this.A02).resumeWith(null);
                return;
            default:
                return;
        }
    }
}
