package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ijh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42012Ijh implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public ViewOnClickListenerC42012Ijh(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.A00 = i;
        this.A07 = obj8;
        this.A01 = obj;
        this.A05 = obj5;
        this.A08 = obj4;
        this.A02 = obj3;
        this.A04 = obj6;
        this.A06 = obj7;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Product product;
        C141796aw A00;
        InterfaceC16620sF c57166PZk;
        C38052Gof c38052Gof;
        int i;
        int A05;
        int i2;
        switch (this.A00) {
            case 0:
                C684336g c684336g = (C684336g) this.A01;
                UserSession userSession = (UserSession) this.A02;
                Product product2 = (Product) this.A03;
                View view2 = (View) this.A04;
                C41196ILk c41196ILk = (C41196ILk) this.A05;
                Fragment fragment = (Fragment) this.A06;
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A07;
                C102884kP c102884kP = (C102884kP) this.A08;
                c684336g.A00();
                boolean z = !AbstractC1563570f.A00(userSession).A03(product2);
                view2.setSelected(z);
                c41196ILk.A00(z);
                C41625IbF c41625IbF = new C41625IbF(C1DW.A00(userSession).A02(c102884kP.A0L(49)), AbstractC64962wu.A02(fragment.requireContext(), fragment.requireActivity(), userSession, interfaceC60442pS, c102884kP.A0J(), c102884kP.A0H(), c102884kP.A0K(), false), product2, AbstractC37300Gc1.A0T(product2));
                c41625IbF.A08 = c102884kP.A0L(44);
                c41625IbF.A00();
                return;
            case 1:
                A05 = C0f9.A05(-537651189);
                C69411Vmv c69411Vmv = (C69411Vmv) this.A03;
                InterfaceC103384lE interfaceC103384lE = c69411Vmv.A01;
                if (interfaceC103384lE != null) {
                    C6FP.A03((C6FG) this.A01, (C102884kP) this.A02, C6FW.A01, interfaceC103384lE);
                }
                UserSession userSession2 = (UserSession) this.A08;
                C6FG c6fg = (C6FG) this.A01;
                C38E c38e = new C38E(C6BQ.A07(c6fg), userSession2, AbstractC37301Gc2.A0L(C6BQ.A00(c6fg)));
                C66346UAn c66346UAn = (C66346UAn) this.A04;
                C42794IwW c42794IwW = new C42794IwW(c66346UAn);
                c38e.A05 = new C31559Dtj(C6BQ.A03(c6fg), c66346UAn.A03, new C70991Wm7(c69411Vmv, c66346UAn, c6fg, (C102884kP) this.A02, (User) this.A07));
                C14360o3.A0B(c6fg, 0);
                c38e.A0C = (String) c6fg.A00(R.id.bloks_reel_tray_session_id);
                Reel reel = (Reel) this.A05;
                List list = (List) this.A06;
                c38e.A06(reel, C3G2.A0J, c42794IwW, null, list, list);
                i2 = -293133081;
                C0f9.A0C(i2, A05);
                return;
            case 2:
                int A052 = C0f9.A05(-167040035);
                InterfaceC43386JFb interfaceC43386JFb = (InterfaceC43386JFb) this.A04;
                C14360o3.A0A(view);
                ProductGroup productGroup = ((IH7) this.A07).A00;
                if (productGroup != null) {
                    C41643IbZ c41643IbZ = (C41643IbZ) this.A06;
                    C42836IxC c42836IxC = (C42836IxC) interfaceC43386JFb;
                    switch (c42836IxC.A00) {
                        case 0:
                            HCL hcl = ((C38369Gu5) c42836IxC.A01).A02.A00;
                            IgdsInlineSearchBox igdsInlineSearchBox = hcl.A04;
                            if (igdsInlineSearchBox != null) {
                                igdsInlineSearchBox.A03();
                            }
                            FragmentActivity requireActivity = hcl.requireActivity();
                            UserSession A0r = AbstractC166987dD.A0r(hcl.A0N);
                            Product product3 = (Product) productGroup.A00().get(0);
                            List list2 = product3.A0O;
                            if (list2 != null) {
                                new C41742IeG(requireActivity, A0r, false);
                                HashMap A1G = AbstractC166987dD.A1G();
                                if (list2.isEmpty()) {
                                    throw AbstractC31172DnG.A0u();
                                }
                                if (list2.isEmpty()) {
                                    throw AbstractC31172DnG.A0u();
                                }
                                list2.size();
                                A1G.size();
                            }
                            hcl.A0M.A02.A00(c41643IbZ, product3);
                            AbstractC13880nE.A0O(hcl.mView);
                            break;
                        case 1:
                            C38327GtM A0P = AbstractC37301Gc2.A0P((HCO) c42836IxC.A01);
                            List A002 = productGroup.A00();
                            C14360o3.A07(A002);
                            Product product4 = (Product) AbstractC001800i.A0I(A002);
                            C14360o3.A0A(product4);
                            String str = A0P.A05;
                            if (str != null && !C14360o3.A0K(AbstractC37302Gc3.A0d(product4), str)) {
                                A00 = AbstractC141776au.A00(A0P);
                                c57166PZk = new C43172J6r(A0P, null, 28);
                            } else if (!C41643IbZ.A00(c41643IbZ, AbstractC37302Gc3.A0N(A0P.A01).A05)) {
                                A00 = AbstractC141776au.A00(A0P);
                                c57166PZk = new C57166PZk(c41643IbZ, A0P, productGroup, null, 24);
                            } else {
                                A0P.A01(c41643IbZ, product4);
                                break;
                            }
                            AbstractC166987dD.A1Z(c57166PZk, A00);
                            break;
                        case 2:
                            HCE hce = (HCE) c42836IxC.A01;
                            hce.requireActivity().setResult(1002);
                            ShopManagementAccessState Bue = AbstractC31176DnK.A0g(C17060sy.A01, hce.A0G).A03.Bue();
                            if (Bue == null) {
                                Bue = ShopManagementAccessState.A07;
                            }
                            ShopManagementAccessState shopManagementAccessState = ShopManagementAccessState.A06;
                            C38323GtI A0Q = AbstractC37301Gc2.A0Q(hce);
                            if (Bue == shopManagementAccessState) {
                                Object A16 = AbstractC166987dD.A16(productGroup.A00());
                                C14360o3.A07(A16);
                                product = (Product) A16;
                            } else if (!C41643IbZ.A00(c41643IbZ, A0Q.A00)) {
                                boolean z2 = !C41643IbZ.A00(c41643IbZ, AbstractC37302Gc3.A0N(A0Q.A01).A05);
                                List A003 = productGroup.A00();
                                C14360o3.A07(A003);
                                product = (Product) AbstractC001800i.A0I(A003);
                                if (z2) {
                                    C39324HYp c39324HYp = A0Q.A04;
                                    C14360o3.A0A(product);
                                    c39324HYp.A00(c41643IbZ, product);
                                    AbstractC166987dD.A1Z(new C57166PZk(c41643IbZ, A0Q, productGroup, null, 25), AbstractC141776au.A00(A0Q));
                                    break;
                                } else {
                                    C14360o3.A0A(product);
                                }
                            }
                            A0Q.A00(null, c41643IbZ, product);
                            break;
                        default:
                            HCF hcf = (HCF) c42836IxC.A01;
                            hcf.requireActivity().setResult(1002);
                            C38328GtN c38328GtN = (C38328GtN) hcf.A0A.getValue();
                            Object obj = productGroup.A00().get(0);
                            C14360o3.A07(obj);
                            c38328GtN.A01(c41643IbZ, (Product) obj, false);
                            break;
                    }
                    C38628GyV c38628GyV = (C38628GyV) this.A01;
                    if (c38628GyV != null && (c38052Gof = (C38052Gof) this.A02) != null) {
                        AutoWidthToggleButton autoWidthToggleButton = ((C38404Guf) this.A05).A06;
                        Context context = (Context) this.A03;
                        if (c38052Gof.A02) {
                            i = c38628GyV.A02;
                        } else {
                            i = c38628GyV.A01;
                        }
                        AbstractC56932jR.A07(autoWidthToggleButton, AbstractC167007dF.A0f(context, ((Product) this.A08).A0J, i));
                    }
                    C0f9.A0C(-1228817004, A052);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0C(492608633, A052);
                throw A0g;
            default:
                A05 = C0f9.A05(-613678532);
                User user = (User) this.A07;
                if (user.CQf()) {
                    AbstractC35271Fh6.A02((Activity) this.A01, (UserSession) this.A08, (FollowButtonBase) this.A05, (InterfaceC77483dY) this.A04, user, AbstractC37300Gc1.A0W(this.A02));
                } else {
                    ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = (ViewOnAttachStateChangeListenerC110564yT) this.A06;
                    UserSession userSession3 = (UserSession) this.A08;
                    if (ViewOnAttachStateChangeListenerC110564yT.A00(userSession3, user) == FollowStatus.A05) {
                        Activity activity = (Activity) this.A01;
                        if (activity != null) {
                            C36881nl A01 = C36881nl.A01(activity, (InterfaceC11380iw) this.A02, userSession3, AbstractC111324zv.A00(4912));
                            A01.A0B = new C122145g6(AbstractC166987dD.A1J(new PendingRecipient(user)));
                            A01.A06();
                            ((InterfaceC77483dY) this.A04).D4B(user);
                        }
                    } else {
                        viewOnAttachStateChangeListenerC110564yT.A05(null, userSession3, null, null, null, (InterfaceC77483dY) this.A04, user, null, null, null);
                    }
                }
                i2 = -1214963821;
                C0f9.A0C(i2, A05);
                return;
        }
    }
}
