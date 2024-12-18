package X;

import android.os.Bundle;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.EdX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32890EdX extends VKF {
    public final /* synthetic */ C36684GFe A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C32890EdX(C36684GFe c36684GFe, String str, String str2) {
        this.A00 = c36684GFe;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.VKF
    public final void A03() {
        DirectSearchInboxFragment directSearchInboxFragment = this.A00.A0S;
        Integer num = C05F.A00;
        String str = this.A02;
        String str2 = this.A01;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str);
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID", str2);
        directSearchInboxFragment.A04(A0b, num);
    }
}
