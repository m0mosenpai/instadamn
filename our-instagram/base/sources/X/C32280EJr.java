package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EJr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32280EJr extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MultipleAccountRecoveryFragment";
    public C07270a1 A00;
    public G9Q A01;
    public C32406EPh A02;
    public String A03;
    public String A04;
    public List A05;
    public C35161Ff3 A06;
    public ProgressButton A07;
    public String A08;
    public List A09;

    public static void A00(DialogInterface.OnDismissListener onDismissListener, UserSession userSession, C32280EJr c32280EJr, String str, String str2, boolean z) {
        FragmentActivity activity = c32280EJr.getActivity();
        if (activity != null) {
            Integer num = C05F.A05;
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            A0H.A0A(2131972135);
            Resources resources = activity.getResources();
            int i = 2131972134;
            if (z) {
                i = 2131972127;
            }
            A0H.A0r(AbstractC31173DnH.A0B(resources, str, i).toString());
            A0H.A0J(new DialogInterfaceOnClickListenerC35370Fil(activity, c32280EJr, userSession, num, str2, 0, z), 2131972122);
            A0H.A0I(null, 2131968687);
            A0H.A0g(onDismissListener);
            A0H.A08(R.drawable.instagram_lock_outline_96);
            AbstractC166987dD.A1W(A0H);
        }
    }

    public final void A03(User user) {
        Context requireContext = requireContext();
        C07270a1 c07270a1 = this.A00;
        String str = this.A03;
        String id = user.getId();
        String str2 = this.A04;
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/account_recovery_nonce_login/");
        AbstractC31173DnH.A1O(A0M, C16030qx.A00(requireContext));
        A0M.A9s("login_nonce", str);
        AbstractC31171DnF.A1J(A0M, id);
        A0M.A9s("recovery_handle_type", str2);
        C1ON A0H = AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
        A0H.A00 = new EfX(this, this, this.A00, this.A01, this, EnumC31713DwI.A0v);
        schedule(A0H);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "multiple_account_recovery";
    }

    public static void A01(C32280EJr c32280EJr) {
        int i;
        String[] strArr;
        String num;
        ProgressButton progressButton;
        int i2;
        C32406EPh c32406EPh = c32280EJr.A02;
        c32406EPh.getClass();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : c32406EPh.A07) {
            if (c32406EPh.A03.contains(obj)) {
                A1E.add(obj);
            }
        }
        int A02 = AbstractC31172DnG.A02(ImmutableList.copyOf((Collection) c32280EJr.A02.A06), A1E.size());
        ProgressButton progressButton2 = c32280EJr.A07;
        progressButton2.getClass();
        progressButton2.setEnabled(AbstractC167007dF.A1M(A02));
        if (A02 == 0) {
            progressButton = c32280EJr.A07;
            i2 = 2131965708;
        } else if (A1E.isEmpty()) {
            progressButton = c32280EJr.A07;
            i2 = 2131968535;
        } else {
            ProgressButton progressButton3 = c32280EJr.A07;
            Resources A0N = AbstractC166997dE.A0N(c32280EJr);
            if (A02 == 1) {
                i = 2131965709;
                strArr = new String[1];
                num = ((User) A1E.get(0)).getUsername();
            } else {
                i = 2131965707;
                strArr = new String[1];
                num = Integer.toString(A02);
            }
            strArr[0] = num;
            progressButton3.setText(AbstractC07900bA.A01(A0N, strArr, i));
            return;
        }
        progressButton.setText(i2);
    }

    private boolean A02() {
        int floor;
        C52592ay c52592ay = C52592ay.A00;
        InterfaceC16130rD interfaceC16130rD = C52592ay.A01;
        C0YR[] c0yrArr = C52592ay.A03;
        if (!AbstractC166987dD.A1a(C52342aZ.A00((C52342aZ) interfaceC16130rD.CES(c52592ay, c0yrArr[0])))) {
            return false;
        }
        if (AbstractC166987dD.A1a(((C52342aZ) C52592ay.A02.CES(c52592ay, c0yrArr[1])).A01(this.A00))) {
            boolean A06 = C1AD.A06(C06090Tz.A06, 2324143366645812010L);
            EnumC33317EoC enumC33317EoC = EnumC33317EoC.A04;
            String[] strArr = enumC33317EoC.A02;
            Date date = enumC33317EoC.A01;
            Date date2 = enumC33317EoC.A00;
            Context requireContext = requireContext();
            C07270a1 c07270a1 = this.A00;
            C14360o3.A0B(c07270a1, 2);
            C45325K4d c45325K4d = new C45325K4d(requireContext, c07270a1);
            C1UM A00 = new C1U5(requireContext).A00().A00("fdid_oe_exposure_time");
            C1UI A002 = new C1U5(requireContext).A00();
            C95F c95f = AK1.A00;
            Date time = Calendar.getInstance().getTime();
            C14360o3.A07(time);
            C1UM A003 = A002.A00("fdid_oe");
            String A004 = c45325K4d.A00();
            if (time.before(date) || time.after(date2) || A06 || A004 == null) {
                return false;
            }
            int i = A003.getInt(AK1.A01("ig4a_multiple_ar_fdid_backtest"), -1);
            if (i == -1) {
                i = AbstractC31179DnN.A02(A003, AnonymousClass001.A0R(A004, "ig4a_multiple_ar_fdid_backtest"), "ig4a_multiple_ar_fdid_backtest");
            }
            if (i < 0 || (floor = (int) Math.floor(i / 5000)) >= 2 || floor < 0) {
                return false;
            }
            C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(new C12210kP(c07270a1).A00(), "fdid_offline_experiment_exposure"), 155);
            C14360o3.A0A(A0A);
            if (!strArr[floor].equals("not_in_experiment") && A00 != null) {
                if (System.currentTimeMillis() - A00.getLong(AK1.A00("ig4a_multiple_ar_fdid_backtest"), -1L) >= AbstractC32113E9l.A00 && AbstractC25226BEj.A1Z(A0A)) {
                    A0A.A0R("exp_name", "ig4a_multiple_ar_fdid_backtest");
                    A0A.A0R("exp_group", strArr[floor]);
                    A0A.A0R("family_device_id", A004);
                    A0A.Cht();
                    C1ZT AR9 = A00.AR9();
                    AR9.A08(AK1.A00("ig4a_multiple_ar_fdid_backtest"), System.currentTimeMillis());
                    AR9.A0B();
                }
            }
            if (floor != 1) {
                return false;
            }
            return true;
        }
        return AbstractC166987dD.A1a(((C52342aZ) C2b3.A01.CES(C2b3.A00, C2b3.A02[0])).A01(this.A00));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i = 2131967905;
        if (A02()) {
            i = 2131967906;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1213763255);
        super.onCreate(bundle);
        this.A00 = AbstractC31180DnO.A0L(this);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("lookup_users");
        if (parcelableArrayList == null) {
            parcelableArrayList = AbstractC166987dD.A1E();
        }
        this.A09 = parcelableArrayList;
        this.A03 = requireArguments().getString("login_nonce", "");
        this.A04 = requireArguments().getString("recovery_handle_type", "");
        this.A08 = requireArguments().getString("recovery_handle", "");
        this.A01 = new G9Q(getActivity());
        C07270a1 c07270a1 = this.A00;
        AbstractC167017dG.A1N(c07270a1, "multiple_users_recover");
        C35203Ffv.A01(c07270a1, "multiple_users_recover");
        this.A06 = C35161Ff3.A00(this.mArguments);
        C0f9.A09(-1609641360, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A02 = C0f9.A02(1931520013);
        if (A02()) {
            inflate = layoutInflater.inflate(R.layout.fragment_multiple_account_recovery_legacy, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.fragment_multiple_account_recovery, viewGroup, false);
            TextView A0T = AbstractC166997dE.A0T(inflate, R.id.choose_accounts_text);
            Resources A0N = AbstractC166997dE.A0N(this);
            int i = 2131955159;
            if (AbstractC31189DnY.A00().equals(this.A04)) {
                i = 2131955160;
            }
            AbstractC31180DnO.A14(A0N, A0T, this.A08, i);
        }
        TextView A0T2 = AbstractC166997dE.A0T(inflate, R.id.help_center);
        String string = getString(2131963479);
        AnonymousClass773.A07(new AnonymousClass772(Integer.valueOf(A0T2.getCurrentTextColor())), A0T2, string, AbstractC31174DnI.A0w(this, string, 2131963478));
        ViewOnClickListenerC31724DwT.A00(A0T2, 9, this);
        if (A02()) {
            EPX epx = new EPX(this, this);
            List list = this.A09;
            List list2 = epx.A01;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
                epx.A06();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    epx.A08(epx.A00, it.next());
                }
                epx.A07();
            }
            ((AbsListView) inflate.requireViewById(android.R.id.list)).setAdapter((ListAdapter) epx);
        } else {
            C32406EPh c32406EPh = new C32406EPh(requireContext(), this, this.A00, this);
            this.A02 = c32406EPh;
            List list3 = this.A09;
            List list4 = c32406EPh.A07;
            list4.clear();
            List list5 = c32406EPh.A06;
            list5.clear();
            if (list3 != null) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    User A15 = AbstractC25226BEj.A15(it2);
                    if (!c32406EPh.A02.CPH(A15.getId())) {
                        C84613qA c84613qA = c32406EPh.A01;
                        String id = A15.getId();
                        if (!c84613qA.A02.containsKey(id) && !c84613qA.A01.containsKey(id)) {
                            list4.add(A15);
                        }
                    }
                    list5.add(A15);
                }
                c32406EPh.A03 = AbstractC166987dD.A1H();
                if (!list4.isEmpty()) {
                    c32406EPh.A03.add(list4.get(0));
                }
                C32406EPh.A00(c32406EPh);
            }
            ((AbsListView) inflate.requireViewById(android.R.id.list)).setAdapter((ListAdapter) this.A02);
            this.A07 = AbstractC31180DnO.A0U(inflate);
            A01(this);
            ViewOnClickListenerC31724DwT.A00(this.A07, 10, this);
        }
        C0f9.A09(-700889618, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C006802i.A0p.markerEnd(725095506, (short) 2);
    }
}
