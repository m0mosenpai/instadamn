package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;

/* renamed from: X.EdY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32891EdY extends VKF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C36684GFe A02;

    public C32891EdY(C36684GFe c36684GFe, int i, int i2) {
        this.A02 = c36684GFe;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.VKF
    public final void A03() {
        C36684GFe c36684GFe = this.A02;
        DirectSearchInboxFragment directSearchInboxFragment = c36684GFe.A0S;
        Integer num = C05F.A01;
        String string = c36684GFe.A0M.getResources().getString(2131964456);
        String str = c36684GFe.A08;
        int i = this.A01;
        int i2 = this.A00;
        ArrayList<? extends Parcelable> A1E = AbstractC166987dD.A1E();
        Bundle A0C = AbstractC31177DnL.A0C(string);
        A0C.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE", string);
        A0C.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        A0C.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID", str);
        A0C.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION", 29);
        A0C.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i);
        A0C.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SECTION_POSITION", i2);
        A0C.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_RESHARED_CONTENT", A1E);
        A0C.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", "");
        directSearchInboxFragment.A04(A0C, num);
    }
}
