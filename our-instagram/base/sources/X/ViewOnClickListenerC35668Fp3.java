package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.user.model.User;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Fp3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35668Fp3 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public ViewOnClickListenerC35668Fp3(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static void A00(View view, Object obj, int i, int i2) {
        C0fQ.A00(new ViewOnClickListenerC35668Fp3(i, i2, obj), view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        InterfaceC83733oI interfaceC83733oI;
        EnumC33344Eod enumC33344Eod;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(952680077);
                C32276EJl c32276EJl = (C32276EJl) this.A02;
                int i2 = this.A01;
                int i3 = c32276EJl.A00;
                if (i3 != i2) {
                    List list = c32276EJl.A06;
                    ((View) list.get(i3)).findViewById(R.id.selected_color_item).setVisibility(8);
                    CircularImageView circularImageView = (CircularImageView) ((View) list.get(i2)).findViewById(R.id.selected_color_item);
                    Context requireContext = c32276EJl.requireContext();
                    c32276EJl.A09.getValue();
                    C14360o3.A0A(circularImageView);
                    AbstractC35050FcN.A01(requireContext, circularImageView, AbstractC31176DnK.A01(AbstractC31171DnF.A0n(c32276EJl.A08), i2));
                    c32276EJl.A00 = i2;
                }
                i = -1259664655;
                break;
            case 1:
                A05 = C0f9.A05(58316559);
                C31877Dzj c31877Dzj = (C31877Dzj) this.A02;
                UserSession userSession = c31877Dzj.A03;
                Context context = c31877Dzj.A02;
                C26055Bfi c26055Bfi = (C26055Bfi) AbstractC001800i.A0O(c31877Dzj.A00, this.A01);
                if (C26055Bfi.A00(c26055Bfi, 0)) {
                    HashMap A02 = C23031Ai.A02(AbstractC23021Ah.A00(userSession), "contacts_in_sharesheet_access_map");
                    String A0u = AbstractC166997dE.A0u(c26055Bfi);
                    Object obj = A02.get(A0u);
                    if (obj == null) {
                        obj = Double.valueOf(0.0d);
                        A02.put(A0u, obj);
                    }
                    AbstractC166997dE.A1T(A0u, A02, ((Number) obj).doubleValue() + 1.0d);
                    C23031Ai.A05(AbstractC23021Ah.A00(userSession), "contacts_in_sharesheet_access_map", A02);
                    AbstractC35101FdC.A02(context, c26055Bfi.A04, "");
                }
                i = -169930396;
                break;
            case 2:
                A05 = C0f9.A05(-400843709);
                C32314ELd c32314ELd = (C32314ELd) this.A02;
                UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
                FragmentActivity requireActivity = c32314ELd.requireActivity();
                E70 e70 = c32314ELd.A0Z;
                String str2 = null;
                if (e70 != null) {
                    interfaceC83733oI = e70.A0L;
                    str2 = e70.A0Q;
                } else {
                    interfaceC83733oI = null;
                }
                int i4 = this.A01;
                C14360o3.A0B(A0r, 0);
                String A0f = AbstractC31177DnL.A0f(interfaceC83733oI);
                C142846ck A00 = AbstractC147806l5.A00(A0r);
                C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A00);
                    AbstractC31174DnI.A1I(A0I, "render_best_practices_sheet");
                    A0I.A0o("best_practices_button");
                    AbstractC31177DnL.A1H(A0I, A00, AbstractC31179DnN.A0a(A0I, "thread_details", A0f, str2, i4));
                }
                if (C18U.A06(C06090Tz.A06, A0r, 36319377334607249L)) {
                    enumC33344Eod = EnumC33344Eod.A04;
                } else {
                    enumC33344Eod = EnumC33344Eod.A03;
                }
                AbstractC34776FTz.A01(requireActivity, A0r, enumC33344Eod, interfaceC83733oI, str2, "thread_details", C32314ELd.__redex_internal_original_name, i4);
                i = 550152024;
                break;
            case 3:
                A05 = C0f9.A05(1959712273);
                ((InterfaceC16660sJ) this.A02).invoke(Integer.valueOf(this.A01));
                i = 349034896;
                break;
            case 4:
                A05 = C0f9.A05(118065154);
                InterfaceC37126GXn interfaceC37126GXn = ((C31889Dzv) this.A02).A00;
                if (interfaceC37126GXn != null) {
                    int i5 = this.A01;
                    C14360o3.A0A(view);
                    interfaceC37126GXn.Dhi(view, i5);
                }
                i = -1147379620;
                break;
            case 5:
                A05 = C0f9.A05(1636743293);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A02;
                UserSession userSession2 = editProfileFieldsController.A0C;
                C19270xB c19270xB = editProfileFieldsController.A0B;
                EnumC1571773w enumC1571773w = EnumC1571773w.A05;
                User user = editProfileFieldsController.A06;
                if (user != null) {
                    str = AbstractC76433bn.A00(user);
                } else {
                    str = null;
                }
                C1571673v.A04(c19270xB, userSession2, enumC1571773w, AbstractC31171DnF.A0V(this.A01), "tap_edit_profile_banner", str, null, null, null, null);
                C140966Yy A0r2 = AbstractC25225BEi.A0r(editProfileFieldsController.A06(), userSession2);
                AbstractC31364DqT.A03();
                AbstractC31175DnJ.A0v(AbstractC166987dD.A0b(), new C32279EJq(), A0r2);
                i = -1927738836;
                break;
            case 6:
                A05 = C0f9.A05(-659550492);
                ViewPager viewPager = ((GI1) this.A02).A02;
                viewPager.getClass();
                viewPager.setCurrentItem(this.A01);
                i = 1999090366;
                break;
            case 7:
                A05 = C0f9.A05(367287049);
                C35166FfG c35166FfG = (C35166FfG) this.A02;
                DialogInterface.OnClickListener onClickListener = c35166FfG.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(c35166FfG.A0D, this.A01);
                }
                c35166FfG.A0D.dismiss();
                i = 1998154235;
                break;
            default:
                A05 = C0f9.A05(-131745);
                UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A02;
                unifiedFollowFragment.A0Q = true;
                ViewPager2 viewPager2 = unifiedFollowFragment.viewPager;
                if (viewPager2 != null) {
                    viewPager2.A03(this.A01, true);
                }
                i = 303896781;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
