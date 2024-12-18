package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Ltx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49484Ltx implements GZB {
    public final /* synthetic */ C105824pt A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ C3KX A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    @Override // X.GZB
    public final void D3J(Context context) {
        Integer num;
        C14360o3.A0B(context, 0);
        C3KX c3kx = this.A03;
        String str = this.A00.A0e;
        str.getClass();
        Reel reel = this.A01;
        String A0i = AbstractC37301Gc2.A0i(reel);
        User user = this.A02;
        C3KX.A06(c3kx, str, A0i, user.getId());
        String str2 = this.A04;
        InterfaceC147726kx interfaceC147726kx = c3kx.A02;
        if (interfaceC147726kx != null) {
            num = interfaceC147726kx.BeW(str2);
        } else {
            num = null;
        }
        if (num == C05F.A0N) {
            String str3 = this.A06;
            String str4 = this.A05;
            FragmentActivity A00 = C3KW.A00();
            if (A00 != null) {
                C193328hC A0H = AbstractC31171DnF.A0H(A00);
                A0H.A05 = AbstractC31178DnM.A0c(context, user, 2131965632);
                A0H.A09(2131965630);
                A0H.A0o(user.Bhu(), C3KX.A08);
                A0H.A0J(new LMK(context, reel, c3kx, str3, str4, 2), 2131965629);
                A0H.A0I(new LMJ(reel, c3kx, str4, str3, 2), 2131965631);
                A0H.A0s(true);
                AbstractC166987dD.A1W(A0H);
                return;
            }
            return;
        }
        C3KX.A02(reel, C3G2.A1E, c3kx, this.A06, this.A05);
    }

    public C49484Ltx(C105824pt c105824pt, Reel reel, User user, C3KX c3kx, String str, String str2, String str3) {
        this.A03 = c3kx;
        this.A00 = c105824pt;
        this.A01 = reel;
        this.A02 = user;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
    }

    @Override // X.GZB
    public final void onDismiss() {
        C3KX.A04(this.A01, this.A03, this.A05);
    }
}
