package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class INA {
    public String A00;
    public C41043IFm A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final C57112jm A08;
    public final InterfaceC16820sZ A09;

    public INA(FragmentActivity fragmentActivity, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 6);
        this.A02 = fragmentActivity;
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A08 = c57112jm;
        this.A09 = interfaceC16820sZ;
        this.A05 = str;
        this.A00 = str2;
        this.A01 = new C41043IFm(userSession, c57112jm);
        this.A06 = BQP.A00(this, 28);
        this.A07 = BQP.A00(this, 29);
    }

    public final void A00(C38321qM c38321qM, C75113Zb c75113Zb, User user) {
        C14360o3.A0B(user, 0);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        String str = this.A00;
        String str2 = this.A05;
        String A0W = AbstractC37303Gc4.A0W(user);
        String A0U = AbstractC37300Gc1.A0U(user);
        C14360o3.A0A(A0U);
        C41749IeN A0N = c1xj.A0N(fragmentActivity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, str2, "shopping_reels_cta", A0W, A0U);
        A0N.A03 = c38321qM;
        A0N.A0I = IBN.A00.A03(c38321qM, user, c75113Zb.A03);
        A0N.A05();
    }

    public final void A01(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        ClipsShoppingInfoIntf Buh;
        String str2;
        ProductDetailsProductItemDictIntf Bgw;
        User BSW;
        C1XJ.A00.A0t(this.A02, this.A03, c38321qM, this.A04, c75113Zb, (C56772PHp) this.A07.getValue(), this.A00, this.A05, str);
        IFM ifm = (IFM) this.A06.getValue();
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null && (Buh = A0u.Buh()) != null) {
            ProductCollection Ap9 = Buh.Ap9();
            List BhR = Buh.BhR();
            if (BhR != null) {
                C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(ifm.A01), AbstractC111324zv.A00(4700)), 325);
                String id = c38321qM.getId();
                String str3 = "";
                if (id == null) {
                    id = "";
                }
                c25531Mh.A0l(id);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = BhR.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1T(A1E, it);
                }
                ((AbstractC02600Aj) c25531Mh).A00.A9M("product_merchant_ids", C128205qp.A0D(A1E));
                boolean z = false;
                ProductWrapperIntf productWrapperIntf = (ProductWrapperIntf) AbstractC001800i.A0O(BhR, 0);
                C0Zx c0Zx = null;
                String str4 = null;
                if (productWrapperIntf != null && (Bgw = productWrapperIntf.Bgw()) != null && (BSW = Bgw.BSW()) != null) {
                    str2 = AbstractC76433bn.A00(BSW);
                } else {
                    str2 = null;
                }
                c25531Mh.A0d(C4SX.A00(str2));
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it2 = BhR.iterator();
                while (it2.hasNext()) {
                    ProductDetailsProductItemDictIntf Bgw2 = ((ProductWrapperIntf) it2.next()).Bgw();
                    if (Bgw2 != null) {
                        A1E2.add(Bgw2);
                    }
                }
                if (!(A1E2 instanceof Collection) || !A1E2.isEmpty()) {
                    Iterator it3 = A1E2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (AbstractC38048Gob.A01((ProductDetailsProductItemDictIntf) it3.next()).A04()) {
                            z = true;
                            break;
                        }
                    }
                }
                c25531Mh.A0O("is_checkout_enabled", Boolean.valueOf(z));
                c25531Mh.A0R("shopping_session_id", ifm.A00);
                if (Ap9 != null) {
                    C0Zx c0Zx2 = new C0Zx();
                    String Ap3 = Ap9.Ap3();
                    if (Ap3 != null) {
                        str3 = Ap3;
                    }
                    c0Zx2.A06("product_collection_id", str3);
                    ProductCollectionV2Type ApF = Ap9.ApF();
                    if (ApF != null) {
                        str4 = ApF.toString();
                    }
                    c0Zx2.A06("product_collection_type", str4);
                    c0Zx = c0Zx2;
                }
                c25531Mh.A0N(c0Zx, "collections_logging_info");
                c25531Mh.Cht();
            }
        }
    }
}
