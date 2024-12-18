package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Eda, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32893Eda extends VKF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C36684GFe A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ ArrayList A04;

    public C32893Eda(C36684GFe c36684GFe, Object obj, String str, ArrayList arrayList, int i) {
        this.A01 = c36684GFe;
        this.A04 = arrayList;
        this.A03 = str;
        this.A02 = obj;
        this.A00 = i;
    }

    @Override // X.VKF
    public final void A03() {
        int i;
        ArrayList<? extends Parcelable> arrayList = this.A04;
        Iterator<? extends Parcelable> it = arrayList.iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
                DirectSearchResult A0M = AbstractC31171DnF.A0M(it);
                if ((A0M instanceof DirectMessageSearchMessage) && ((DirectMessageSearchMessage) A0M).A00()) {
                    break;
                }
            } else {
                C36684GFe c36684GFe = this.A01;
                C36294Fzo.A00(c36684GFe.A0Q).A05(c36684GFe.A0R.A06, "thread_list", "universal_search_cta", false);
                break;
            }
        }
        C36684GFe c36684GFe2 = this.A01;
        DirectSearchInboxFragment directSearchInboxFragment = c36684GFe2.A0S;
        Integer num = C05F.A06;
        Resources resources = c36684GFe2.A0M.getResources();
        String str = this.A03;
        String A0r = AbstractC166997dE.A0r(resources, str, 2131964444);
        Object obj = this.A02;
        if (obj instanceof Integer) {
            i = AbstractC166987dD.A0H(obj);
        }
        int i2 = this.A00;
        Bundle A0C = AbstractC31177DnL.A0C(A0r);
        A0C.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE", A0r);
        A0C.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str);
        A0C.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGES", arrayList);
        A0C.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i2);
        A0C.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", i);
        directSearchInboxFragment.A04(A0C, num);
    }
}
