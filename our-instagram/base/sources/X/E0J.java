package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class E0J extends C1I4 {
    public boolean A00;
    public final UserSession A01;
    public final C31885Dzr A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final String A05;

    public E0J(UserSession userSession, C31885Dzr c31885Dzr, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        C14360o3.A0B(str, 4);
        this.A01 = userSession;
        this.A02 = c31885Dzr;
        this.A03 = interfaceC60442pS;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(-511013107);
        if (i == 0) {
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            String str = this.A04;
            String str2 = this.A05;
            AbstractC167027dH.A12(userSession, interfaceC60442pS, str);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "external_share_app_tray_scroll");
            if (A0f.isSampled()) {
                A0f.AAP("media_id", str);
                A0f.A9K("media_owner_id", AbstractC25233BEq.A0n(str2));
                AbstractC31175DnJ.A14(A0f, interfaceC60442pS);
                AbstractC25233BEq.A17(A0f, "share_location", "direct_share_sheet");
                A0f.Cht();
            }
        }
        C0f9.A0A(437484067, A03);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A0N = AbstractC167017dG.A0N(recyclerView, -1612564738);
        super.onScrolled(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        if (linearLayoutManager != null) {
            int A1a = linearLayoutManager.A1a();
            int A1b = linearLayoutManager.A1b();
            if (A1a > -1 && A1b > -1 && A1a <= A1b) {
                while (true) {
                    View A0d = linearLayoutManager.A0d(A1a);
                    Rect rect = new Rect();
                    if (A0d != null) {
                        A0d.getLocalVisibleRect(rect);
                        i3 = A0d.getWidth();
                    } else {
                        i3 = 0;
                    }
                    if (rect.right >= i3) {
                        C31885Dzr c31885Dzr = this.A02;
                        String str = ((AbstractC35044FcH) c31885Dzr.A00.get(A1a)).A08;
                        if (str.hashCode() == -2133928234 && str.equals("add_content_note") && !this.A00) {
                            if (C14360o3.A0K(((AbstractC35044FcH) c31885Dzr.A00.get(A1a)).A08, "add_content_note") && c31885Dzr.A06 && A0d != null) {
                                A0d.postDelayed(new RunnableC36886GNh(A0d, c31885Dzr), 500L);
                            }
                            this.A00 = true;
                        }
                    }
                    if (A1a == A1b) {
                        break;
                    } else {
                        A1a++;
                    }
                }
            }
        }
        C0f9.A0A(1329176071, A0N);
    }
}
