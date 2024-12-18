package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EE3 extends AnonymousClass935 {
    public final /* synthetic */ G3S A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE3(UserSession userSession, G3S g3s) {
        super(userSession);
        this.A00 = g3s;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        ImageUrl imageUrl;
        int A03 = C0f9.A03(-2114746246);
        EBU ebu = (EBU) obj;
        int A032 = C0f9.A03(683553759);
        AbstractC167017dG.A1N(userSession, ebu);
        HashMap A1G = AbstractC166987dD.A1G();
        G3S g3s = this.A00;
        Iterator it = g3s.A02.iterator();
        while (it.hasNext()) {
            PendingRecipient A0p = AbstractC31172DnG.A0p(it);
            A1G.put(A0p.getId(), A0p);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A0i = AbstractC31177DnL.A0i(ebu.A00);
        while (A0i.hasNext()) {
            C45110Jxf c45110Jxf = (C45110Jxf) A0i.next();
            long j = c45110Jxf.A00;
            String str = c45110Jxf.A02;
            EnumC101664hb enumC101664hb = (EnumC101664hb) c45110Jxf.A01;
            User A0k = AbstractC31174DnI.A0k(userSession, str);
            String str2 = null;
            if (A0k != null) {
                str2 = A0k.getUsername();
                imageUrl = A0k.Bhu();
            } else {
                PendingRecipient pendingRecipient = (PendingRecipient) A1G.get(str);
                if (pendingRecipient != null) {
                    str2 = pendingRecipient.A0C;
                    imageUrl = pendingRecipient.A03;
                } else {
                    imageUrl = null;
                }
            }
            A1E.add(new C34590FLz(g3s.A01, imageUrl, enumC101664hb, str2, j));
        }
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = g3s.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            directVisualMessageActionLogPriorityFragment.A00(A1E);
            C0f9.A0A(-1694484912, A032);
            C0f9.A0A(-1466986236, A03);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(1501929736, A032);
            throw A0g;
        }
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        int A03 = C0f9.A03(925857910);
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = this.A00.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            SpinnerImageView spinnerImageView = directVisualMessageActionLogPriorityFragment.spinner;
            if (spinnerImageView != null) {
                AbstractC31171DnF.A1M(spinnerImageView);
                C0f9.A0A(-145596468, A03);
                return;
            } else {
                C14360o3.A0F("spinner");
                throw C00O.createAndThrow();
            }
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1496553912, A03);
        throw A0g;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(545225825);
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = this.A00.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            SpinnerImageView spinnerImageView = directVisualMessageActionLogPriorityFragment.spinner;
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C3T1.FAILED);
                SpinnerImageView spinnerImageView2 = directVisualMessageActionLogPriorityFragment.spinner;
                if (spinnerImageView2 != null) {
                    C0fQ.A00((View.OnClickListener) directVisualMessageActionLogPriorityFragment.A03.getValue(), spinnerImageView2);
                    C0f9.A0A(-1168485525, A03);
                    return;
                }
            }
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(687436490, A03);
        throw A0g;
    }
}
