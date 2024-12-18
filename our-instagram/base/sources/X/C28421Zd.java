package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28421Zd {
    public static C28421Zd A03;
    public final Context A00;
    public final C28431Ze A01;
    public final InterfaceC09390do A02;

    public C28421Zd(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context.getApplicationContext();
        C17050sx A01 = AbstractC09440dt.A01(new C9EY(this, 49));
        this.A02 = A01;
        this.A01 = (C28431Ze) A01.getValue();
    }

    public final void A00(Fragment fragment, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, final C1P1 c1p1, final C1P1 c1p12, UserSession userSession, final C38321qM c38321qM) {
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        boolean z;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(abstractC018607g, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        final C41138IJd c41138IJd = new C41138IJd(fragment, abstractC018607g, interfaceC11380iw, userSession);
        final Context requireContext = c41138IJd.A00.requireContext();
        final boolean A0K = C14360o3.A0K(c38321qM.A0C.Bcr(), true);
        int i = 2131969616;
        if (A0K) {
            i = 2131969613;
        }
        String string = requireContext.getString(i);
        UserSession userSession2 = c41138IJd.A03;
        C50674MYs c50674MYs = new C50674MYs(requireContext, userSession2);
        c50674MYs.A00(2131975139);
        ArrayList A05 = AbstractC82403m3.A05(c38321qM);
        if (!(A05 instanceof Collection) || !A05.isEmpty()) {
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                JLH BcS = ((InterfaceC43546JLg) it.next()).BcS();
                if (BcS != null) {
                    featuredProductPermissionStatus = BcS.C0K();
                } else {
                    featuredProductPermissionStatus = null;
                }
                if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.A04) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        C08730cb c08730cb = C17060sy.A01;
        Boolean CdA = c08730cb.A01(userSession2).A03.CdA();
        if ((CdA == null || !CdA.booleanValue()) && z) {
            ArrayList A06 = AbstractC82403m3.A06(c38321qM);
            if (!(A06 instanceof Collection) || !A06.isEmpty()) {
                Iterator it2 = A06.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (C14360o3.A0K(((PeopleTag) it2.next()).A07().getId(), userSession2.userId)) {
                        c50674MYs.A01(new View.OnClickListener() { // from class: X.Ihz
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str;
                                Object obj;
                                User user;
                                ProductDetailsProductItemDictIntf Bgl;
                                C41138IJd c41138IJd2 = c41138IJd;
                                C38321qM c38321qM2 = c38321qM;
                                AnonymousClass389 anonymousClass389 = new AnonymousClass389(c41138IJd2.A00, c41138IJd2.A02, c41138IJd2.A03);
                                Context requireContext2 = anonymousClass389.A00.requireContext();
                                FeaturedProductPermissionStatus featuredProductPermissionStatus2 = FeaturedProductPermissionStatus.A04;
                                C38321qM A01 = AbstractC82403m3.A01(c38321qM2, featuredProductPermissionStatus2);
                                if (A01 != null) {
                                    Iterator it3 = AbstractC82403m3.A05(A01).iterator();
                                    while (true) {
                                        str = null;
                                        if (it3.hasNext()) {
                                            obj = it3.next();
                                            JLH BcS2 = ((InterfaceC43546JLg) obj).BcS();
                                            if (BcS2 != null && BcS2.C0K() == featuredProductPermissionStatus2) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    InterfaceC43546JLg interfaceC43546JLg = (InterfaceC43546JLg) obj;
                                    if (interfaceC43546JLg != null && (Bgl = interfaceC43546JLg.Bgl()) != null) {
                                        user = Bgl.BSW();
                                    } else {
                                        user = null;
                                    }
                                    C193328hC A0I = AbstractC31171DnF.A0I(requireContext2);
                                    A0I.A0A(2131962388);
                                    int i2 = 2131962412;
                                    if (A01.BRp() == EnumC40111tc.A0Q) {
                                        i2 = 2131962386;
                                    }
                                    if (user != null) {
                                        str = AbstractC37300Gc1.A0U(user);
                                    }
                                    AbstractC31177DnL.A0v(requireContext2, A0I, str, i2);
                                    A0I.A0Q(new DialogInterfaceOnClickListenerC41805IfL(6, A01, c38321qM2, anonymousClass389), EnumC193348hE.A05, 2131972171);
                                    AbstractC166987dD.A1W(A0I);
                                }
                            }
                        }, 2131972221);
                        break;
                    }
                }
            }
        }
        if (c38321qM.A6l(c08730cb.A01(userSession2))) {
            c50674MYs.A01(new View.OnClickListener() { // from class: X.IiV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C41138IJd c41138IJd2 = c41138IJd;
                    C38321qM c38321qM2 = c38321qM;
                    C1P1 c1p13 = c1p1;
                    c41138IJd2.A04.A00(c41138IJd2.A02, c1p13, c38321qM2, C05F.A0C);
                }
            }, 2131969614);
        }
        if (I99.A00(c38321qM, c08730cb.A01(userSession2))) {
            c50674MYs.A01(new View.OnClickListener() { // from class: X.IiW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C41138IJd c41138IJd2 = c41138IJd;
                    C38321qM c38321qM2 = c38321qM;
                    C1P1 c1p13 = c1p1;
                    Context requireContext2 = c41138IJd2.A00.requireContext();
                    C193328hC A0I = AbstractC31171DnF.A0I(requireContext2);
                    A0I.A04();
                    A0I.A0A(2131972181);
                    A0I.A09(2131972179);
                    A0I.A0J(new DialogInterfaceOnClickListenerC41837Ifr(4, c41138IJd2, requireContext2, c1p13, c38321qM2), 2131972180);
                    AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC41836Ifq.A00(c41138IJd2, 22), A0I);
                }
            }, 2131969615);
        }
        if (c38321qM.A6m(c08730cb.A01(userSession2))) {
            c50674MYs.A03(new View.OnClickListener() { // from class: X.IiX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C41138IJd c41138IJd2 = c41138IJd;
                    Context context = requireContext;
                    C38321qM c38321qM2 = c38321qM;
                    c38321qM2.A3M().getClass();
                    UserSession userSession3 = c41138IJd2.A03;
                    String id = c38321qM2.getId();
                    String moduleName = c41138IJd2.A02.getModuleName();
                    C14360o3.A0B(moduleName, 2);
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession3);
                    A0c.A0B("usertags/remove_category/");
                    A0c.A9s("media_to_untag", id);
                    AbstractC31173DnH.A1N(A0c);
                    C1ON A0T = AbstractC31172DnG.A0T(A0c, "container_module", moduleName);
                    C37484Gf2.A00(A0T, c41138IJd2, c38321qM2, 10);
                    C1GJ.A00(context, c41138IJd2.A01, A0T);
                }
            }, 2131957297);
        }
        c50674MYs.A0B(string, new View.OnClickListener() { // from class: X.Ij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C41138IJd c41138IJd2 = c41138IJd;
                boolean z2 = A0K;
                C38321qM c38321qM2 = c38321qM;
                C1P1 c1p13 = c1p12;
                if (z2) {
                    c41138IJd2.A04.A00(c41138IJd2.A02, c1p13, c38321qM2, C05F.A01);
                    return;
                }
                c41138IJd2.A05.incrementAndGet();
                UserSession userSession3 = c41138IJd2.A03;
                String id = c38321qM2.getId();
                String moduleName = c41138IJd2.A02.getModuleName();
                C14360o3.A0B(moduleName, 3);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession3);
                A0c.A0B("usertags/review/");
                A0c.A9s("approve", id);
                AbstractC31173DnH.A1N(A0c);
                AbstractC37300Gc1.A0y(A0c, moduleName);
                C1ON A0P = AbstractC31176DnK.A0P(A0c);
                A0P.A00 = new HGQ(c1p13, c38321qM2, c41138IJd2);
                C1GJ.A00(c41138IJd2.A00.requireContext(), c41138IJd2.A01, A0P);
            }
        });
        c50674MYs.A03(new View.OnClickListener() { // from class: X.IhQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context requireContext2 = C41138IJd.this.A00.requireContext();
                C12260kU.A0G(requireContext2, AbstractC08820cl.A03(AbstractC63260SgI.A01(requireContext2, "http://help.instagram.com/433611883398929")));
            }
        }, 2131965052);
        new C31727DwY(c50674MYs).A07(requireContext);
    }

    public final void A01(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1119153d interfaceC1119153d, User user, String str) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        String id = user.getId();
        if (str == null) {
            str = "user_profile_header";
        }
        C52169N6y A00 = AbstractC54113NwB.A00(userSession, id, str);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        c189448aO.A0d = fragmentActivity.getString(2131962727);
        c189448aO.A0T = A00;
        c189448aO.A0U = interfaceC1119153d;
        C189478aR A002 = c189448aO.A00();
        A00.A01 = new P6n(fragmentActivity, userSession, A002, user);
        A00.A00 = new OC5(fragmentActivity, userSession, A002, user);
        A002.A02(fragmentActivity, A00);
    }

    public final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A08();
        AbstractC31364DqT.A03();
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        bundle.putString("entrypoint", str);
        C32315ELe c32315ELe = new C32315ELe();
        c32315ELe.setArguments(bundle);
        c140966Yy.A0D(c32315ELe);
        c140966Yy.A04();
    }

    public C28421Zd() {
    }
}
