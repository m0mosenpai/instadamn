package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Iyn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42935Iyn implements InterfaceC64872wl {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final C64892wn A04;
    public final String A05;

    public C42935Iyn(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, C64892wn c64892wn, String str) {
        C14360o3.A0B(c64892wn, 6);
        this.A02 = interfaceC686136y;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A00 = fragment;
        this.A05 = str;
        this.A04 = c64892wn;
    }

    @Override // X.InterfaceC64872wl
    public final void E0q(EnumC39622HeW enumC39622HeW, InterfaceC99144cb interfaceC99144cb, int i) {
    }

    @Override // X.InterfaceC64872wl
    public final void E0z(InterfaceC99144cb interfaceC99144cb) {
    }

    @Override // X.InterfaceC64872wl
    public final void E10(InterfaceC99144cb interfaceC99144cb) {
    }

    @Override // X.InterfaceC64872wl
    public final void EDe(View view, InterfaceC99144cb interfaceC99144cb) {
        C14360o3.A0B(interfaceC99144cb, 1);
        C64892wn c64892wn = this.A04;
        String id = interfaceC99144cb.getId();
        C14360o3.A07(id);
        c64892wn.A01(view, interfaceC99144cb, id);
    }

    @Override // X.InterfaceC64872wl
    public final void AA0(InterfaceC99144cb interfaceC99144cb, int i) {
        C64892wn c64892wn = this.A04;
        String id = interfaceC99144cb.getId();
        C14360o3.A07(id);
        c64892wn.A03(interfaceC99144cb, id, i);
    }

    @Override // X.InterfaceC64882wm
    public final JPn Bh2() {
        return this.A02.Bh2();
    }

    @Override // X.InterfaceC64872wl
    public final void E0v(InterfaceC99144cb interfaceC99144cb, User user) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC31174DnI.A13(interfaceC99144cb.Bgy().A03);
            while (A13.hasNext()) {
                Product A02 = ((ProductFeedItem) A13.next()).A02();
                if (A02 != null) {
                    A1E.add(A02.A0H);
                }
            }
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            String str = this.A05;
            String A01 = ((C99134ca) interfaceC99144cb).A01();
            String A00 = AbstractC76433bn.A00(user);
            if (A00 != null) {
                C41749IeN A0N = c1xj.A0N(activity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, null, A01, A00, AbstractC37300Gc1.A0U(user));
                A0N.A0H = A1E;
                A0N.A05();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC64872wl
    public final void F9g(View view) {
        this.A04.A00.A04(view);
    }
}
