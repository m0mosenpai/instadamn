package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductWithMediaImage;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64992wx implements InterfaceC65002wy {
    public boolean A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C65032x1 A04;
    public final C65042x2 A05;
    public final Integer A06;
    public final String A07;

    public C64992wx(Fragment fragment, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C5GU c5gu, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        C14360o3.A0B(userSession, 3);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        C65032x1 c65032x1 = new C65032x1(userSession, interfaceC60442pS, c5gu, str, str2, str3, str5, str6, str4);
        this.A04 = c65032x1;
        this.A05 = new C65042x2(userSession, c57112jm, c65032x1, new C64902wo(userSession, interfaceC60442pS, str3, null, str, str2, str5, str6, i));
        this.A07 = str3;
        this.A06 = num;
    }

    @Override // X.InterfaceC65012wz
    public final void A9P(User user, int i) {
        C14360o3.A0B(user, 0);
        C65042x2 c65042x2 = this.A05;
        C63622uj c63622uj = c65042x2.A01;
        String A00 = AbstractC76433bn.A00(user);
        Integer valueOf = Integer.valueOf(i);
        String A002 = AbstractC76433bn.A00(user);
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(user, valueOf, A002);
        c59072n8.A00(c65042x2.A02);
        c63622uj.A01(c59072n8.A01(), A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.InF, java.lang.Object, X.1vN] */
    @Override // X.InterfaceC65002wy
    public final void APi(C99134ca c99134ca, int i) {
        User BSW;
        C65032x1 c65032x1 = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        UserSession userSession = this.A02;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, AbstractC111324zv.A00(2573));
        JI4 Aiv = c99134ca.Aiv();
        C4SX c4sx = null;
        r1 = null;
        String str = null;
        c4sx = null;
        if (Aiv != null && Aiv.BSW() != null) {
            JI4 Aiv2 = c99134ca.Aiv();
            if (Aiv2 != null && (BSW = Aiv2.BSW()) != null) {
                str = AbstractC76433bn.A00(BSW);
            }
            c4sx = C4SX.A00(str);
        }
        A00.AAK(c4sx, "merchant_id");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("chaining_session_id", c65032x1.A01);
        c0Zx.A05("chaining_position", Long.valueOf(i));
        String str2 = c65032x1.A02;
        c0Zx.A06("m_pk", str2);
        c0Zx.A06("parent_m_pk", str2);
        c0Zx.A06("source_media_type", c99134ca.A08);
        A00.AAQ(c0Zx, "pivots_logging_info");
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A06("shopping_session_id", c65032x1.A03);
        c0Zx2.A06("submodule", c99134ca.A02.A00);
        A00.AAQ(c0Zx2, "navigation_info");
        A00.Cht();
        ILe A002 = I6L.A00(userSession);
        long j = A002.A00;
        if (j > 0) {
            A002.A01.flowMarkPoint(j, AbstractC111324zv.A00(1566));
            A002.A00();
        }
        this.A00 = false;
        C25671My A003 = AbstractC25651Mw.A00(userSession);
        ?? obj = new Object();
        obj.A00 = c99134ca;
        A003.E4s(obj);
    }

    @Override // X.InterfaceC65012wz
    public final void EDT(View view, User user) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(user, 1);
        C65042x2 c65042x2 = this.A05;
        c65042x2.A00.A05(view, c65042x2.A01.A00(AbstractC76433bn.A00(user)));
    }

    @Override // X.InterfaceC65002wy
    public final void F9d(View view) {
        I6L.A00(this.A02).A00();
        this.A00 = false;
        this.A05.A00.A04(view);
    }

    @Override // X.InterfaceC65002wy
    public final void A9Q(IDT idt, Integer num) {
        C65042x2 c65042x2 = this.A05;
        C63622uj c63622uj = c65042x2.A01;
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(idt, num, "merchant_hscroll_impression");
        c59072n8.A00(c65042x2.A03);
        c63622uj.A01(c59072n8.A01(), "merchant_hscroll_impression");
    }

    @Override // X.InterfaceC65022x0
    public final void DSs(ShoppingBrandWithProducts shoppingBrandWithProducts, String str, int i) {
        String str2;
        String str3 = str;
        C65032x1 c65032x1 = this.A04;
        User CDj = shoppingBrandWithProducts.CDj();
        C14360o3.A0B(CDj, 0);
        C18920wW c18920wW = c65032x1.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_merchant_hscroll_tile_tap");
        if (A00.isSampled()) {
            A00.AAK(C4SX.A00(AbstractC76433bn.A00(CDj)), "merchant_id");
            A00.A9K("position", Long.valueOf(i));
            A00.AAQ(C65032x1.A01(c65032x1), "navigation_info");
            A00.AAQ(C65032x1.A00(c65032x1, Integer.valueOf(i)), "collections_logging_info");
            A00.Cht();
        }
        UserSession userSession = this.A02;
        ILe A002 = I6L.A00(userSession);
        long j = A002.A00;
        if (j > 0) {
            C1QT c1qt = A002.A01;
            c1qt.flowMarkPoint(j, "VISIT_STOREFRONT");
            c1qt.flowEndSuccess(A002.A00);
            A002.A00 = 0L;
        }
        User CDj2 = shoppingBrandWithProducts.CDj();
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity requireActivity = this.A01.requireActivity();
        InterfaceC60442pS interfaceC60442pS = this.A03;
        String str4 = this.A07;
        if (str == null) {
            switch (this.A06.intValue()) {
                case 1:
                    str3 = "profile_pivot";
                    break;
                case 2:
                    str3 = "shopping_bag_merchant_hscroll";
                    break;
                default:
                    str3 = AbstractC111324zv.A00(5336);
                    break;
            }
        }
        if (CDj2 != null) {
            str2 = AbstractC76433bn.A00(CDj2);
        } else {
            str2 = null;
        }
        C14360o3.A0A(str2);
        String username = CDj2.A03.getUsername();
        C14360o3.A0A(username);
        C41749IeN A0N = c1xj.A0N(requireActivity, CDj2.A03.Bt7(), userSession, interfaceC60442pS, str4, null, str3, str2, username);
        A0N.A06(null, null, null, null, null);
        List unmodifiableList = Collections.unmodifiableList(shoppingBrandWithProducts.BhO());
        if (unmodifiableList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC38048Gob.A01(((ProductWithMediaImage) it.next()).BTe()).A0H);
            }
            A0N.A0H = arrayList;
        }
        A0N.A05();
    }

    @Override // X.InterfaceC65002wy
    public final void EDU(View view, String str) {
        if (str != null && !this.A00) {
            this.A00 = true;
            ILe A00 = I6L.A00(this.A02);
            C1QT c1qt = A00.A01;
            long flowStartForMarker = c1qt.flowStartForMarker(37371407, "explore_pivots", false);
            A00.A00 = flowStartForMarker;
            c1qt.flowAnnotate(flowStartForMarker, "pivot_type", str);
        }
        C65042x2 c65042x2 = this.A05;
        c65042x2.A00.A05(view, c65042x2.A01.A00("merchant_hscroll_impression"));
    }
}
