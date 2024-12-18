package X;

import android.content.res.Resources;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.List;

/* renamed from: X.EdV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32888EdV extends VKF {
    public final /* synthetic */ C36684GFe A00;
    public final /* synthetic */ List A01;

    public C32888EdV(C36684GFe c36684GFe, List list) {
        this.A00 = c36684GFe;
        this.A01 = list;
    }

    @Override // X.VKF
    public final void A03() {
        C36684GFe c36684GFe = this.A00;
        DirectSearchInboxFragment directSearchInboxFragment = c36684GFe.A0S;
        Integer num = C05F.A0K;
        C28511Zm c28511Zm = C28531Zo.A04.A01;
        Resources resources = c36684GFe.A0M.getResources();
        AbstractC31265Don.A00();
        directSearchInboxFragment.A04(c28511Zm.A03(resources.getString(2131960402), "", c36684GFe.A08, null, null, null, null, null, AbstractC166987dD.A1F(this.A01), 36, -1), num);
    }
}
