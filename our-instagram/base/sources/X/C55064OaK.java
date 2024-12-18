package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OaK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55064OaK {
    public AnonymousClass195 A00;
    public final Context A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final EnumC142806cg A05;
    public final InterfaceC09390do A06;

    public C55064OaK(AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 2);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = enumC142806cg;
        C57555PgT c57555PgT = new C57555PgT(this, 29);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(abstractC59962oe, 26), EnumC09460dv.A02, 27);
        this.A06 = AbstractC25225BEi.A0a(new C57555PgT(A01, 28), c57555PgT, C57530Pg4.A00(null, A01, 22), AbstractC25225BEi.A1D(IgLiveOptionsDialogViewModel.class));
        this.A01 = abstractC59962oe.requireContext();
        this.A03 = abstractC59962oe;
    }

    public static IgLiveOptionsDialogViewModel A00(Object obj) {
        return (IgLiveOptionsDialogViewModel) ((C55064OaK) obj).A06.getValue();
    }

    public static final void A01(User user, InterfaceC58171Pqb interfaceC58171Pqb, C55064OaK c55064OaK, boolean z) {
        String str;
        String str2;
        String str3;
        InterfaceC02590Ai A0f;
        long j;
        long j2;
        long j3;
        Long A0k;
        Long A0k2;
        User user2;
        String str4;
        String str5;
        long j4;
        long j5;
        String str6;
        Long A0k3;
        Long A0k4;
        User user3;
        String str7 = null;
        AbstractC35271Fh6.A03(c55064OaK.A02.requireActivity(), c55064OaK.A04, user, "ig_live_options_dialog_click_point");
        IgLiveOptionsDialogViewModel igLiveOptionsDialogViewModel = (IgLiveOptionsDialogViewModel) c55064OaK.A06.getValue();
        OBA oba = igLiveOptionsDialogViewModel.A00;
        if (z) {
            if (oba != null) {
                String str8 = igLiveOptionsDialogViewModel.A06.A00;
                C0UO c0uo = igLiveOptionsDialogViewModel.A0C.A06;
                C51709Mse A0u = MSW.A0u(c0uo);
                if (A0u != null) {
                    str4 = A0u.A08;
                } else {
                    str4 = null;
                }
                C51709Mse A0u2 = MSW.A0u(c0uo);
                if (A0u2 != null && (user3 = A0u2.A05) != null) {
                    str5 = user3.getId();
                } else {
                    str5 = null;
                }
                C51709Mse A0u3 = MSW.A0u(c0uo);
                if (A0u3 != null) {
                    str7 = A0u3.A09;
                }
                Iterable A00 = IgLiveOptionsDialogViewModel.A00(igLiveOptionsDialogViewModel);
                ArrayList A0i = AbstractC167007dF.A0i(A00);
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A0i, it);
                }
                String id = user.getId();
                C14360o3.A0B(str8, 0);
                A0f = AbstractC166987dD.A0f(oba.A01, "live_unfollow_generated");
                j = 0;
                if (str5 != null && (A0k4 = AbstractC003100w.A0k(10, str5)) != null) {
                    j4 = A0k4.longValue();
                } else {
                    j4 = 0;
                }
                AbstractC50522MSa.A18(A0f, j4);
                if (str4 != null && (A0k3 = AbstractC003100w.A0k(10, str4)) != null) {
                    j5 = A0k3.longValue();
                } else {
                    j5 = 0;
                }
                MSY.A12(A0f, j5);
                if (str7 == null) {
                    str7 = "0";
                }
                AbstractC37300Gc1.A0l(A0f, str7);
                AbstractC37301Gc2.A15(A0f, oba.A00);
                if (interfaceC58171Pqb != null) {
                    str6 = "comment_action_sheet";
                } else {
                    str6 = "header";
                }
                A0f.AAP("method", str6);
                AbstractC31178DnM.A18(A0f, id);
                MSW.A1T(A0f, str8);
                A0f.AAk("current_guest_ids", A0i);
            } else {
                return;
            }
        } else if (oba != null) {
            String str9 = igLiveOptionsDialogViewModel.A06.A00;
            C0UO c0uo2 = igLiveOptionsDialogViewModel.A0C.A06;
            C51709Mse A0u4 = MSW.A0u(c0uo2);
            if (A0u4 != null) {
                str = A0u4.A08;
            } else {
                str = null;
            }
            C51709Mse A0u5 = MSW.A0u(c0uo2);
            if (A0u5 != null && (user2 = A0u5.A05) != null) {
                str2 = user2.getId();
            } else {
                str2 = null;
            }
            C51709Mse A0u6 = MSW.A0u(c0uo2);
            if (A0u6 != null) {
                str7 = A0u6.A09;
            }
            Iterable A002 = IgLiveOptionsDialogViewModel.A00(igLiveOptionsDialogViewModel);
            ArrayList A0i2 = AbstractC167007dF.A0i(A002);
            Iterator it2 = A002.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1V(A0i2, it2);
            }
            String id2 = user.getId();
            C14360o3.A0B(str9, 0);
            if (interfaceC58171Pqb != null) {
                str3 = "comment_action_sheet";
            } else if (str9.equals("viewer")) {
                str3 = "header_action_sheet";
            } else {
                str3 = "header";
            }
            A0f = AbstractC166987dD.A0f(oba.A01, AbstractC111324zv.A00(4836));
            j = 0;
            if (str2 != null && (A0k2 = AbstractC003100w.A0k(10, str2)) != null) {
                j2 = A0k2.longValue();
            } else {
                j2 = 0;
            }
            AbstractC50522MSa.A18(A0f, j2);
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j3 = A0k.longValue();
            } else {
                j3 = 0;
            }
            MSY.A12(A0f, j3);
            if (str7 == null) {
                str7 = "0";
            }
            AbstractC37300Gc1.A0l(A0f, str7);
            AbstractC37301Gc2.A15(A0f, oba.A00);
            A0f.AAP("method", str3);
            MSW.A1T(A0f, str9);
            A0f.AAk("current_guest_ids", A0i2);
            A0f.A9K(AbstractC111324zv.A00(4473), AbstractC003100w.A0k(10, id2));
        } else {
            return;
        }
        if (interfaceC58171Pqb != null) {
            String pk = interfaceC58171Pqb.getPk();
            if (pk != null) {
                j = MSZ.A0D(pk);
            }
            A0f.A9K("c_pk", Long.valueOf(j));
        }
        A0f.Cht();
    }

    public final void A02() {
        if (this.A00 == null) {
            this.A00 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A02), C57167PZl.A02(this, ((IgLiveOptionsDialogViewModel) this.A06.getValue()).A0I, 22));
        }
    }
}
