package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.activity.CalActivity;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Date;
import java.util.List;

/* loaded from: classes6.dex */
public final class ELk extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37221GaW, GY6, InterfaceC37201GaC {
    public static final String __redex_internal_original_name = "CreateUsernameFragment";
    public Handler A00;
    public ImageView A01;
    public C07270a1 A02;
    public FQG A04;
    public RegFlowExtras A05;
    public NotificationBar A06;
    public EVN A07;
    public FML A08;
    public InlineErrorMessageView A09;
    public ProgressButton A0A;
    public SearchEditText A0B;
    public Date A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public C34712FQx A0G;
    public EVA A0H;
    public ConnectContent A03 = null;
    public final Runnable A0J = new RunnableC36858GMf(this);
    public final TextWatcher A0I = new Em2(this, 17);

    /* JADX WARN: Type inference failed for: r0v15, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    public static synchronized void A03(ELk eLk) {
        synchronized (eLk) {
            if (eLk.A0D && eLk.A0F && eLk.getActivity() != null) {
                ConnectContent connectContent = eLk.A03;
                if (A05(connectContent)) {
                    if (connectContent != null) {
                        String obj = FxcalAccountType.A05.toString();
                        String str = eLk.A05.A0Z;
                        ?? obj2 = new Object();
                        obj2.A01 = obj;
                        obj2.A02 = str;
                        obj2.A00 = null;
                        obj2.A03 = obj;
                        connectContent.A02 = obj2;
                    }
                    UserSession A00 = A00(eLk);
                    A00.getClass();
                    EnumC33360Eot enumC33360Eot = EnumC33360Eot.A05;
                    String obj3 = enumC33360Eot.toString();
                    boolean A1a = AbstractC167017dG.A1a(A00, obj3);
                    C35191Ffj.A00(A00, "linking_flow_initiated", obj3);
                    eLk.A05.A0t = A1a;
                    FragmentActivity requireActivity = eLk.requireActivity();
                    ConnectContent connectContent2 = eLk.A03;
                    connectContent2.getClass();
                    UserSession A002 = A00(eLk);
                    A002.getClass();
                    AbstractC167007dF.A1G(connectContent2, 2, A002);
                    Intent intent = new Intent(requireActivity, (Class<?>) CalActivity.class);
                    FWK.A01(intent, connectContent2, C05F.A01, "", 20180130);
                    intent.putExtra("argument_entry_point", enumC33360Eot);
                    AbstractC31175DnJ.A0o(intent, A002);
                    Bundle A0b = AbstractC166987dD.A0b();
                    ConnectContent connectContent3 = eLk.A03;
                    connectContent3.getClass();
                    A0b.putParcelable("extra_cal_nux_content", connectContent3);
                    AbstractC31181DnP.A0K(requireActivity, intent, A0b, 20180130);
                } else {
                    eLk.A05.A0t = false;
                    A02(eLk);
                }
            }
        }
    }

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "sac_create_username";
    }

    public static void A01(ELk eLk) {
        String A0J = AbstractC13880nE.A0J(eLk.A0B);
        if (!TextUtils.isEmpty(A0J) && eLk.A0B.isFocused()) {
            java.util.Set set = eLk.A08.A02;
            if (set != null && set.contains(A0J)) {
                eLk.A06.A02();
                eLk.A09.A03();
                eLk.A0G.A01();
                return;
            }
            Handler handler = eLk.A00;
            Runnable runnable = eLk.A0J;
            handler.removeCallbacks(runnable);
            eLk.A00.postDelayed(runnable, 1000L);
            eLk.A0G.A00();
            AbstractC167007dF.A0x(eLk.A08.A00);
            eLk.A06.A02();
            eLk.A09.A03();
            eLk.A0A.setEnabled(true);
        }
    }

    private void A04(boolean z) {
        long length = this.A0B.length();
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A02), "username_check_success");
        AbstractC31179DnN.A16(A0f, A01, A00);
        AbstractC35274Fh9.A0D(A0f, "flow", "account_linking");
        A0f.A7v("is_username_available", Boolean.valueOf(z));
        AbstractC31177DnL.A1G(A0f, "release_channel", AbstractC35274Fh9.A01(), A00);
        AbstractC31171DnF.A1A(A0f, EnumC33523Erw.A0E.A00.A01);
        A0f.A9K("username_length", Long.valueOf(length));
        AbstractC31179DnN.A15(A0f);
        AbstractC35274Fh9.A0B(A0f, this.A02);
    }

    public static boolean A05(ConnectContent connectContent) {
        if (connectContent != null && connectContent.A09 != null && connectContent.A05 != null && connectContent.A06 != null && connectContent.A03 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A0B.setEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A0B.setEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC33523Erw.A0E.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        return !AbstractC31179DnN.A1a(this.A0B);
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        String A0J = AbstractC13880nE.A0J(this.A0B);
        C07270a1 c07270a1 = this.A02;
        Context requireContext = requireContext();
        C14360o3.A0B(c07270a1, 0);
        C1ON A00 = AbstractC152476ta.A00(requireContext, c07270a1, A0J);
        C31702Dw7.A01(A00, this, 37);
        if (!this.A0E) {
            if (A00(this) != null && !A05(this.A03)) {
                UserSession A002 = A00(this);
                A002.getClass();
                String obj = EnumC33360Eot.A05.toString();
                C25621Ms A0M = AbstractC31173DnH.A0M(A002);
                A0M.A0B("fb/nux_fb_content/");
                A0M.A9s("access_token", "");
                A0M.A0H("linking_entry_point", obj);
                C1ON A0H = AbstractC31180DnO.A0H(A0M, ConnectContent.class, FWL.class);
                A0H.A00 = new EUH(this);
                AbstractC31177DnL.A19(this, A0H);
            } else {
                this.A0D = true;
            }
        }
        AbstractC31177DnL.A19(this, A00);
        C35031Fc4 c35031Fc4 = C35031Fc4.A00;
        C07270a1 c07270a12 = this.A02;
        String str = EnumC33523Erw.A0E.A00.A01;
        EnumC33445EqI enumC33445EqI = EnumC33445EqI.A07;
        Integer A02 = this.A05.A02();
        C14360o3.A0B(c07270a12, 0);
        c35031Fc4.A01(c07270a12, enumC33445EqI, false, null, A02, str, null);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyG() {
        this.A0A.setShowProgressBar(false);
        this.A0G.A01();
        A04(true);
    }

    @Override // X.InterfaceC37201GaC
    public final void DyH(String str, Integer num) {
        this.A0A.setShowProgressBar(false);
        this.A0G.A00();
        Eks(str, num);
        int length = this.A0B.length();
        C35037FcA A06 = C1Q9.A1W.A02(this.A02).A06(EnumC33445EqI.A07, EnumC33523Erw.A0E.A00);
        synchronized (C35037FcA.A00(A06)) {
        }
        A06.A03("username_length", length);
        A06.A02();
    }

    @Override // X.InterfaceC37201GaC
    public final void DyI() {
        this.A0A.setShowProgressBar(true);
        this.A0G.A00();
    }

    @Override // X.InterfaceC37201GaC
    public final void DyK(String str, List list) {
        this.A0A.setEnabled(false);
        this.A0A.setShowProgressBar(false);
        this.A0G.A00();
        Eks(str, C05F.A01);
        if (list != null && !list.isEmpty()) {
            FML fml = this.A08;
            C07270a1 c07270a1 = this.A02;
            View view = fml.A00;
            view.getClass();
            view.setVisibility(0);
            java.util.Set set = fml.A02;
            set.getClass();
            set.addAll(list);
            RecyclerView recyclerView = fml.A01;
            recyclerView.getClass();
            E0L.A00(recyclerView, fml, 21);
            fml.A01.setAdapter(new C31876Dzi(1, c07270a1, fml, list));
        }
        C34712FQx c34712FQx = this.A0G;
        ViewOnClickListenerC35686FpL viewOnClickListenerC35686FpL = new ViewOnClickListenerC35686FpL(this, 34);
        ImageView imageView = c34712FQx.A01;
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.instagram_x_pano_outline_16);
        C35251Fgk.A01(imageView, AbstractC53242c7.A0B(c34712FQx.A00));
        C0fQ.A00(viewOnClickListenerC35686FpL, imageView);
        imageView.setFocusable(true);
        AbstractC31172DnG.A1E(imageView.getResources(), imageView, 2131976574);
        A04(false);
    }

    public static UserSession A00(ELk eLk) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31171DnF.A12(A0b, eLk.A05.A0G);
        return C023409i.A0A.A07(A0b);
    }

    public static void A02(ELk eLk) {
        if (eLk.getActivity() != null) {
            RegFlowExtras regFlowExtras = eLk.A05;
            regFlowExtras.A0g = AbstractC25229BEm.A1Z(eLk.A0C);
            regFlowExtras.A0n = false;
            regFlowExtras.A12 = true;
            C140966Yy A0r = AbstractC25225BEi.A0r(eLk.requireActivity(), eLk.A02);
            RegFlowExtras regFlowExtras2 = eLk.A05;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            AbstractC31176DnK.A1A(A0b, new AbstractC32319ELj(), A0r);
        }
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return EnumC33445EqI.A07;
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        if (isVisible()) {
            if (num == C05F.A01) {
                this.A09.A04(str);
                this.A06.A02();
            } else {
                AbstractC35259Fgt.A08(this.A06, str);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Bundle A0A = AbstractC31173DnH.A0A(requireActivity());
        if (A0A != null && A0A.containsKey("caa_registration_redirection_to_native")) {
            AbstractC25227BEk.A1B(this);
        }
        C35159Ff1.A00.A01(this.A02, EnumC33445EqI.A07, EnumC33523Erw.A0E.A00.A01);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1260901371);
        super.onCreate(bundle);
        this.A00 = AbstractC167007dF.A0J();
        Bundle bundle2 = this.mArguments;
        C0J8.A03(bundle2, "Fragment arguments cannot be null in SAC flow!");
        this.A02 = C023409i.A0A.A02(bundle2);
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A03(EnumC33445EqI.A07);
        regFlowExtras.A04 = bundle2.getString("last_accessed_user_id", null);
        regFlowExtras.A0T = bundle2.getString("intent", null);
        regFlowExtras.A0U = bundle2.getString("surface", null);
        this.A05 = regFlowExtras;
        List BOY = C0BQ.A00(this.A02).BOY();
        if (!AbstractC83893oY.A00(BOY)) {
            this.A05.A0J = AbstractC31171DnF.A0g(BOY.get(0));
            this.A05.A0M = AbstractC31176DnK.A0t(BOY, 0);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                this.A05.A0H = bundle3.getString(AbstractC111324zv.A00(773), null);
                this.A05.A0G = this.mArguments.getString("last_logged_in_ig_access_token", null);
            }
        }
        this.A0H = new EVA(this);
        C0f9.A09(-953058053, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1098876783);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.reg_secondary_account_create_username, AbstractC31180DnO.A05(A0A), true);
        this.A0B = (SearchEditText) A0A.requireViewById(R.id.username);
        this.A01 = AbstractC31173DnH.A0I(A0A, R.id.username_valid_icon);
        this.A09 = (InlineErrorMessageView) A0A.requireViewById(R.id.username_inline_error);
        this.A0B.addTextChangedListener(this.A0I);
        ViewOnFocusChangeListenerC35694FpU.A00(this.A0B, 22, this);
        this.A0B.setAllowTextSelection(true);
        this.A06 = (NotificationBar) A0A.requireViewById(R.id.notification_bar);
        ProgressButton A0U = AbstractC31180DnO.A0U(A0A);
        this.A0A = A0U;
        EVN evn = new EVN(this.A0B, this.A02, this, A0U);
        this.A07 = evn;
        registerLifecycleListener(evn);
        ViewGroup A0F = AbstractC31173DnH.A0F(A0A, R.id.username_input_container);
        TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
        FC5.A00(A0F);
        SearchEditText searchEditText = this.A0B;
        this.A04 = new FQG(requireContext(), AbstractC018607g.A00(this), this.A02, this, searchEditText);
        this.A0G = new C34712FQx(requireContext(), this.A01);
        this.A08 = new FML(A0A, this.A0B);
        C0f9.A09(-1704024731, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2010359433);
        super.onDestroyView();
        unregisterLifecycleListener(this.A07);
        this.A0B.removeTextChangedListener(this.A0I);
        this.A0B = null;
        this.A01 = null;
        this.A0A = null;
        this.A07 = null;
        this.A09 = null;
        this.A06 = null;
        FML fml = this.A08;
        fml.A00 = null;
        fml.A01 = null;
        fml.A02 = null;
        EVA eva = this.A0H;
        if (getActivity() != null && eva != null) {
            ((IgFragmentActivity) requireActivity()).unregisterOnActivityResultListener(eva);
        }
        C0f9.A09(-1769567139, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(874648580);
        super.onPause();
        AbstractC13880nE.A0O(this.A0B);
        this.A06.A03();
        this.A00.removeCallbacksAndMessages(null);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(0);
        }
        C0f9.A09(-1683002387, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-228974402);
        super.onResume();
        this.A0B.requestFocus();
        AbstractC13880nE.A0R(this.A0B);
        A01(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(16);
        }
        RegFlowExtras regFlowExtras = this.A05;
        regFlowExtras.A0y = false;
        regFlowExtras.A0t = false;
        this.A0D = false;
        this.A0F = false;
        C0f9.A09(1413951269, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C35203Ffv.A00.A02(this.A02, EnumC33445EqI.A07, EnumC33523Erw.A0E.A00.A01);
        if (A00(this) != null) {
            C1ON A06 = AbstractC152476ta.A06(A00(this));
            C31456Ds0.A00(A06, this, view, 51);
            schedule(A06);
        }
        EVA eva = this.A0H;
        if (getActivity() != null && eva != null) {
            ((IgFragmentActivity) requireActivity()).registerOnActivityResultListener(eva);
        }
    }
}
