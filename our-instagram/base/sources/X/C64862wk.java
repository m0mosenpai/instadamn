package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.2wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64862wk implements InterfaceC64872wl {
    public boolean A00;
    public final int A01;
    public final Fragment A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C64952wt A05;
    public final C64972wv A06;
    public final EnumC64852wj A07;
    public final C64892wn A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final InterfaceC09390do A0D;

    public C64862wk(Fragment fragment, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, EnumC64852wj enumC64852wj, String str, String str2, String str3, String str4, int i) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c57112jm, 4);
        String str5 = null;
        C64892wn c64892wn = new C64892wn(userSession, c57112jm, interfaceC60442pS, str, str4, null, str2, null, str3, str4, i);
        this.A02 = fragment;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A08 = c64892wn;
        this.A0C = str;
        this.A0B = str2;
        this.A07 = enumC64852wj;
        this.A09 = str3;
        this.A0A = str4;
        this.A01 = i;
        this.A06 = AbstractC64962wu.A00(fragment.requireContext(), fragment.requireActivity(), null, userSession, interfaceC60442pS, null, null, null, null, null, null, str2, null, null, str, false, false);
        this.A05 = new C64952wt(interfaceC60442pS, userSession, str, str5, str5, str2, str5, str3, str4, str5, str5, str5, str5, i);
        this.A0D = AbstractC09440dt.A01(new C206839Do(this, 3));
    }

    @Override // X.InterfaceC64872wl
    public final void EDe(View view, InterfaceC99144cb interfaceC99144cb) {
        String str;
        C14360o3.A0B(interfaceC99144cb, 1);
        if (!this.A00) {
            this.A00 = true;
            if (interfaceC99144cb instanceof C99134ca) {
                str = ((C99134ca) interfaceC99144cb).A02.toString();
            } else {
                str = null;
            }
            ILe A00 = I6L.A00(this.A03);
            C1QT c1qt = A00.A01;
            long flowStartForMarker = c1qt.flowStartForMarker(37371407, "explore_pivots", false);
            A00.A00 = flowStartForMarker;
            if (str == null) {
                str = "";
            }
            c1qt.flowAnnotate(flowStartForMarker, "pivot_type", str);
        }
        this.A08.A01(view, interfaceC99144cb, A00(interfaceC99144cb));
    }

    @Override // X.InterfaceC64872wl
    public final void F9g(View view) {
        I6L.A00(this.A03).A00();
        this.A00 = false;
        this.A08.A00.A04(view);
    }

    private final String A00(InterfaceC99144cb interfaceC99144cb) {
        if (interfaceC99144cb instanceof MultiProductComponent) {
            String A00 = ((MultiProductComponent) interfaceC99144cb).A00();
            C14360o3.A07(A00);
            return A00;
        }
        return I7P.A00(this.A07.A00);
    }

    @Override // X.InterfaceC64872wl
    public final void AA0(InterfaceC99144cb interfaceC99144cb, int i) {
        this.A08.A03(interfaceC99144cb, A00(interfaceC99144cb), i);
    }

    @Override // X.InterfaceC64882wm
    public final JPn Bh2() {
        return (C42933Iyl) this.A0D.getValue();
    }

    @Override // X.InterfaceC64872wl
    public final void E0q(EnumC39622HeW enumC39622HeW, InterfaceC99144cb interfaceC99144cb, int i) {
        String title;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        String A00 = A00(interfaceC99144cb);
        String str = this.A0C;
        AbstractC41775Ier.A0C(userSession, interfaceC60442pS, interfaceC99144cb, A00, null, str);
        JI4 Aiv = interfaceC99144cb.Aiv();
        if (Aiv == null || (title = Aiv.Ax5()) == null) {
            title = interfaceC99144cb.getTitle();
        }
        INF A0J = C1XJ.A00.A0J(this.A02.requireActivity(), userSession, enumC39622HeW, str, interfaceC60442pS.getModuleName());
        A0J.A0D = title;
        A0J.A03 = null;
        A0J.A02 = interfaceC99144cb.Bgy();
        A0J.A00 = i;
        A0J.A00();
    }

    @Override // X.InterfaceC64872wl
    public final void E0v(InterfaceC99144cb interfaceC99144cb, User user) {
        String A00;
        UserSession userSession = this.A03;
        ILe A002 = I6L.A00(userSession);
        long j = A002.A00;
        if (j > 0) {
            C1QT c1qt = A002.A01;
            c1qt.flowMarkPoint(j, "VISIT_STOREFRONT");
            c1qt.flowEndSuccess(A002.A00);
            A002.A00 = 0L;
        }
        if (interfaceC99144cb instanceof C99134ca) {
            A00 = ((C99134ca) interfaceC99144cb).A01();
        } else {
            A00 = AbstractC111324zv.A00(523);
        }
        C14360o3.A0A(A00);
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableList(interfaceC99144cb.Bgy().A03).iterator();
        while (it.hasNext()) {
            Product A02 = ((ProductFeedItem) it.next()).A02();
            if (A02 != null) {
                arrayList.add(A02.A0H);
            }
        }
        String C3N = interfaceC99144cb.C3N();
        String A003 = AbstractC76433bn.A00(user);
        if (A003 != null) {
            C41749IeN A0N = C1XJ.A00.A0N(this.A02.requireActivity(), user.A03.Bt7(), userSession, this.A04, this.A0C, this.A0B, A00, A003, user.A03.getUsername());
            String str = this.A09;
            String str2 = this.A0A;
            A0N.A04 = str;
            A0N.A0B = str2;
            A0N.A0H = arrayList;
            if (C3N != null) {
                A0N.A0G = C3N;
            }
            A0N.A05();
        }
    }

    @Override // X.InterfaceC64872wl
    public final void E0z(InterfaceC99144cb interfaceC99144cb) {
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        String A00 = A00(interfaceC99144cb);
        String str = this.A0C;
        AbstractC41775Ier.A0C(userSession, interfaceC60442pS, interfaceC99144cb, A00, null, str);
        C1XJ.A00.A1A(this.A02.requireActivity(), userSession, str, interfaceC60442pS.getModuleName(), interfaceC99144cb.C3N());
    }

    @Override // X.InterfaceC64872wl
    public final void E10(InterfaceC99144cb interfaceC99144cb) {
        C1XJ.A00.A16(this.A02.requireActivity(), this.A03, false, null, this.A04.getModuleName(), interfaceC99144cb.C3N(), this.A0C, null, null, null, null, null, null, true, false, false);
    }
}
