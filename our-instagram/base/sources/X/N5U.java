package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5U extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BrowserSettingsMenuFragment";
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RecyclerView A07;
    public final List A08 = AbstractC166987dD.A1E();
    public final List A09 = AbstractC166987dD.A1E();
    public final List A0E = AbstractC166987dD.A1E();
    public final List A0F = AbstractC166987dD.A1E();
    public final List A0G = AbstractC166987dD.A1E();
    public final InterfaceC09390do A0D = C57551PgP.A01(this, 37);
    public final InterfaceC09390do A0B = C57551PgP.A01(this, 36);
    public final InterfaceC09390do A0A = C57551PgP.A01(this, 34);
    public final InterfaceC09390do A0H = C57551PgP.A01(this, 35);
    public boolean A06 = true;
    public String A00 = "account_settings";
    public String A01 = "";
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131964376);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        this.A07 = A08;
        if (A08 != null) {
            AbstractC37304Gc5.A10(A08, this.A0A);
            RecyclerView recyclerView = this.A07;
            if (recyclerView != null) {
                AbstractC31174DnI.A16(getContext(), recyclerView, 1, false);
                A03(this);
                if (this.A03) {
                    C55170OdY A00 = OPL.A00(AbstractC166987dD.A0r(this.A0C));
                    if (A00.A03.contains("browser_link_history_opt_in_key")) {
                        z = AbstractC31177DnL.A1b(A00.A04());
                    } else {
                        z = false;
                    }
                    A07(this, z);
                    AbstractC62279S4y.A00((SZ2) this.A0B.getValue(), new C57561PgZ(this, 43), C57641Phr.A00, false);
                }
                if (getContext() != null) {
                    InterfaceC09390do interfaceC09390do = this.A0C;
                    int A002 = AbstractC61730Rsl.A00(new C43031yW(AbstractC166987dD.A0r(interfaceC09390do)));
                    int i = AbstractC25226BEj.A10(this.A0D).A01.getInt(AbstractC58317Pt9.A00(698), 0);
                    AbstractC63317ShP.A03(AbstractC166987dD.A0r(interfaceC09390do), new P46(this, A002));
                    if (getContext() != null) {
                        A06(this, AbstractC167007dF.A1Q(i, A002));
                    }
                }
                if (this.A04) {
                    SpinnerImageView spinnerImageView = (SpinnerImageView) AbstractC166997dE.A0R(view, R.id.loading_spinner);
                    C2GP c2gp = new C2GP(requireActivity(), null);
                    Context context = c2gp.A04;
                    if (C2GP.A01(context, c2gp, "org.chromium.intent.action.IS_READY_TO_PAY") != null) {
                        AbstractC31171DnF.A1M(spinnerImageView);
                        this.A02 = true;
                        OHy oHy = new OHy(this, spinnerImageView);
                        Intent A01 = C2GP.A01(context, c2gp, "org.chromium.intent.action.IS_READY_TO_PAY");
                        ServiceConnectionC63443SkM serviceConnectionC63443SkM = new ServiceConnectionC63443SkM(1, c2gp, oHy);
                        if (A01 == null || !C0b3.A00().A07().A04(context, A01, serviceConnectionC63443SkM, 1)) {
                            oHy.A00(false);
                        }
                    } else if (getContext() != null) {
                        A08(this, false);
                    }
                }
                A04(this);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    public static final C54796OJo A00(N5U n5u) {
        return (C54796OJo) n5u.A0H.getValue();
    }

    private final void A02() {
        String A0f;
        long A0L = AbstractC166987dD.A0L(OPL.A00(AbstractC166987dD.A0r(this.A0C)).A03.getLong("browser_last_clear_date_key", 0L));
        if (A0L > 0 && (A0f = AbstractC167007dF.A0f(requireContext(), C23831Eq.A03(requireContext(), A0L), 2131954319)) != null && A0f.length() != 0) {
            C35246Fgf c35246Fgf = new C35246Fgf(A0f);
            c35246Fgf.A01 = R.style.PrivacyTextStyle;
            c35246Fgf.A02 = R.dimen.action_bar_item_spacing_right;
            this.A08.add(c35246Fgf);
        }
    }

    public static final void A03(N5U n5u) {
        List list = n5u.A08;
        list.clear();
        if (n5u.A03) {
            MSY.A0w(2131954318, list);
            Context requireContext = n5u.requireContext();
            String A0p = AbstractC166997dE.A0p(requireContext, 2131954313);
            C35246Fgf A01 = A01(requireContext, AbstractC25225BEi.A0H(A0p), A0p, AbstractC53242c7.A0C(requireContext));
            A01.A02 = R.dimen.action_bar_item_spacing_right;
            A01.A04 = ViewOnClickListenerC55455Ok9.A00(n5u, 49);
            list.add(A01);
            n5u.A02();
            C35246Fgf c35246Fgf = new C35246Fgf(2131954321);
            c35246Fgf.A01 = R.style.PrivacyTextStyle;
            c35246Fgf.A02 = R.dimen.action_bar_item_spacing_right;
            list.add(c35246Fgf);
            return;
        }
        C31335Dq0 c31335Dq0 = new C31335Dq0(2131954318);
        c31335Dq0.A0G = n5u.requireContext().getString(2131955185);
        c31335Dq0.A0I = false;
        list.add(c31335Dq0);
        C35246Fgf c35246Fgf2 = new C35246Fgf(2131954320);
        c35246Fgf2.A01 = R.style.PrivacyTextStyle;
        c35246Fgf2.A02 = R.dimen.action_bar_item_spacing_right;
        list.add(c35246Fgf2);
        n5u.A02();
    }

    public static final void A04(N5U n5u) {
        List list = n5u.A0G;
        list.clear();
        C31335Dq0 c31335Dq0 = new C31335Dq0(2131954345);
        c31335Dq0.A0I = true;
        list.add(c31335Dq0);
        C23031Ai A10 = AbstractC25226BEj.A10(n5u.A0D);
        list.add(C55519OlD.A00(n5u, 15, 2131954341, AbstractC167017dG.A1b(A10, A10.A7E, C23031Ai.A8c, 168)));
        Context requireContext = n5u.requireContext();
        String A0p = AbstractC166997dE.A0p(requireContext, 2131965052);
        String A102 = AbstractC43592JPx.A10(requireContext.getString(2131954340), A0p);
        NY0 ny0 = new NY0(n5u, AbstractC31174DnI.A02(requireContext), 11);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A102);
        AnonymousClass773.A04(A0H, ny0, A0p);
        C35246Fgf c35246Fgf = new C35246Fgf(A0H);
        c35246Fgf.A01 = R.style.PrivacyTextStyle;
        list.add(c35246Fgf);
    }

    public static final void A06(N5U n5u, boolean z) {
        Collection collection;
        List list = n5u.A0E;
        list.clear();
        C36731GHa A00 = C55519OlD.A00(n5u, 13, 2131954310, z);
        list.add(A00);
        if (A00.A0D) {
            boolean z2 = true;
            n5u.requireContext();
            n5u.A0C.getValue();
            ArrayList A1N = AbstractC16960so.A1N(C20J.A02());
            if (!AbstractC25226BEj.A1b(A1N) || (collection = (Collection) A1N.get(0)) == null || collection.isEmpty()) {
                z2 = false;
            }
            Context requireContext = n5u.requireContext();
            int i = 2131954322;
            if (z2) {
                i = 2131954323;
            }
            String A0u = AbstractC25227BEk.A0u(requireContext, i);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0u);
            Context requireContext2 = n5u.requireContext();
            Context context = n5u.getContext();
            int i2 = R.attr.igds_color_primary_button;
            if (z2) {
                i2 = R.attr.igds_color_primary_text;
            }
            C35246Fgf A01 = A01(requireContext2, A0H, A0u, AbstractC53242c7.A0H(context, i2));
            A01.A02 = R.dimen.action_bar_item_spacing_right;
            A01.A04 = ViewOnClickListenerC55455Ok9.A00(n5u, 50);
            list.add(A01);
        }
    }

    public static final void A07(N5U n5u, boolean z) {
        String A0f;
        List list = n5u.A09;
        list.clear();
        C31335Dq0 c31335Dq0 = new C31335Dq0(2131954331);
        c31335Dq0.A0I = true;
        list.add(c31335Dq0);
        list.add(C55519OlD.A00(n5u, 14, 2131954334, z));
        Context requireContext = n5u.requireContext();
        String A0p = AbstractC166997dE.A0p(requireContext, 2131954332);
        C35246Fgf A01 = A01(requireContext, AbstractC25225BEi.A0H(A0p), A0p, AbstractC53242c7.A0C(requireContext));
        A01.A02 = R.dimen.action_bar_item_spacing_right;
        A01.A04 = ViewOnClickListenerC55455Ok9.A00(n5u, 51);
        list.add(A01);
        if (z) {
            long A0L = AbstractC166987dD.A0L(OPL.A00(AbstractC166987dD.A0r(n5u.A0C)).A03.getLong("browser_last_clear_link_history_date_key", 0L));
            if (A0L > 0 && (A0f = AbstractC167007dF.A0f(n5u.requireContext(), C23831Eq.A03(n5u.requireContext(), A0L), 2131954333)) != null && A0f.length() != 0) {
                C35246Fgf c35246Fgf = new C35246Fgf(A0f);
                c35246Fgf.A01 = R.style.PrivacyTextStyle;
                c35246Fgf.A02 = R.dimen.action_bar_item_spacing_right;
                list.add(c35246Fgf);
            }
        }
        String A0p2 = AbstractC166997dE.A0p(requireContext, 2131954335);
        String A10 = AbstractC43592JPx.A10(requireContext.getString(2131954324), A0p2);
        NY0 ny0 = new NY0(n5u, AbstractC31174DnI.A02(requireContext), 10);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A10);
        AnonymousClass773.A04(A0H, ny0, A0p2);
        C35246Fgf c35246Fgf2 = new C35246Fgf(A0H);
        c35246Fgf2.A01 = R.style.PrivacyTextStyle;
        list.add(c35246Fgf2);
    }

    public static final void A08(N5U n5u, boolean z) {
        int A01 = AbstractC31172DnG.A01(AbstractC25226BEj.A10(n5u.A0D).A01, "browser_autofill_payment_decline_count");
        InterfaceC09390do interfaceC09390do = n5u.A0C;
        boolean A1Q = AbstractC167007dF.A1Q(A01, AbstractC25225BEi.A07(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36591901593960501L));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        AbstractC63317ShP.A00(new C58530Pwy(5, new P48(n5u, z, A1Q), A0r), A0r);
        if (n5u.getContext() != null) {
            A09(n5u, z, A1Q);
        }
    }

    public static final void A09(N5U n5u, boolean z, boolean z2) {
        List list = n5u.A0F;
        list.clear();
        C36731GHa c36731GHa = new C36731GHa(new C35729FqC(0, n5u, z), 2131954311, z2);
        list.add(c36731GHa);
        if (c36731GHa.A0D) {
            Context requireContext = n5u.requireContext();
            int i = 2131954337;
            if (z) {
                i = 2131954338;
            }
            String A0p = AbstractC166997dE.A0p(requireContext, i);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0p);
            Context requireContext2 = n5u.requireContext();
            Context context = n5u.getContext();
            int i2 = R.attr.igds_color_primary_button;
            if (z) {
                i2 = R.attr.igds_color_primary_text;
            }
            C35246Fgf A01 = A01(requireContext2, A0H, A0p, AbstractC53242c7.A0H(context, i2));
            A01.A02 = R.dimen.action_bar_item_spacing_right;
            A01.A04 = ViewOnClickListenerC55455Ok9.A00(n5u, 52);
            list.add(A01);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public static C35246Fgf A01(Context context, SpannableStringBuilder spannableStringBuilder, String str, int i) {
        AnonymousClass773.A04(spannableStringBuilder, new AnonymousClass522(Integer.valueOf(context.getColor(i))), str);
        C35246Fgf c35246Fgf = new C35246Fgf(spannableStringBuilder);
        c35246Fgf.A01 = R.style.control_option_title_text;
        return c35246Fgf;
    }

    public static final void A05(N5U n5u) {
        InterfaceC65642y0 interfaceC65642y0;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(n5u.A08);
        A1E.addAll(n5u.A09);
        C31335Dq0 c31335Dq0 = new C31335Dq0(2131954312);
        c31335Dq0.A0I = true;
        A1E.add(c31335Dq0);
        A1E.addAll(n5u.A0E);
        A1E.addAll(n5u.A0F);
        Context requireContext = n5u.requireContext();
        String A0p = AbstractC166997dE.A0p(requireContext, 2131965052);
        int i = 2131954344;
        if (n5u.A04) {
            i = 2131954339;
        }
        StringBuilder sb = new StringBuilder(requireContext.getString(i));
        sb.append(" ");
        if (n5u.A05) {
            AbstractC31172DnG.A1D(requireContext, sb, 2131954309);
            sb.append(" ");
        }
        sb.append(A0p);
        sb.append(" ");
        NY0 ny0 = new NY0(n5u, AbstractC31174DnI.A02(requireContext), 9);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(sb.toString());
        AnonymousClass773.A04(A0H, ny0, A0p);
        C35246Fgf c35246Fgf = new C35246Fgf(A0H);
        c35246Fgf.A01 = R.style.PrivacyTextStyle;
        c35246Fgf.A02 = R.dimen.action_bar_item_spacing_right;
        A1E.add(c35246Fgf);
        A1E.addAll(n5u.A0G);
        C52197N8m c52197N8m = (C52197N8m) n5u.A0A.getValue();
        List list = c52197N8m.A09;
        list.clear();
        list.addAll(A1E);
        c52197N8m.clear();
        for (Object obj : list) {
            if (obj instanceof C36731GHa) {
                interfaceC65642y0 = c52197N8m.A05;
            } else if (obj instanceof C35246Fgf) {
                interfaceC65642y0 = c52197N8m.A06;
            } else if (obj instanceof C54737OFo) {
                interfaceC65642y0 = c52197N8m.A04;
            } else if (obj instanceof C50676MYu) {
                if (((C50676MYu) obj).A02 == 2131954332) {
                    interfaceC65642y0 = c52197N8m.A01;
                } else {
                    interfaceC65642y0 = c52197N8m.A00;
                }
            } else if (obj instanceof C31335Dq0) {
                if (!c52197N8m.A0A && ((C31335Dq0) obj).A0G == null) {
                    c52197N8m.addModel(obj, c52197N8m.A02, c52197N8m.A03);
                } else {
                    int i2 = ((C31335Dq0) obj).A05;
                    if (i2 != -1 && i2 == 2131954331) {
                        interfaceC65642y0 = c52197N8m.A08;
                    } else {
                        interfaceC65642y0 = c52197N8m.A07;
                    }
                }
            } else {
                throw AbstractC166987dD.A14("unsupported bindergroup added");
            }
            c52197N8m.addModel(obj, interfaceC65642y0);
        }
        c52197N8m.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1966130950);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0C;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = C18U.A06(c06090Tz, A0o, 2342153435828846654L);
        this.A04 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 2342153435828256826L);
        this.A03 = AbstractC62280S4z.A00(AbstractC166987dD.A0r(interfaceC09390do));
        Bundle bundleExtra = requireActivity().getIntent().getBundleExtra(AbstractC111324zv.A00(213));
        if (bundleExtra != null && !bundleExtra.isEmpty()) {
            C58877QEn c58877QEn = new C58877QEn(bundleExtra);
            this.A06 = AbstractC31172DnG.A1X(c58877QEn.A00, "TrackingInfo.ARG_ENABLE_SAFE_BROWSING_SETTING_LOGGING");
            String string = c58877QEn.A00.getString(AbstractC58317Pt9.A00(72));
            String str = "";
            if (string == null) {
                string = "";
            }
            this.A00 = string;
            String string2 = c58877QEn.A00.getString(AbstractC58317Pt9.A00(203));
            if (string2 != null) {
                str = string2;
            }
            this.A01 = str;
        }
        C0f9.A09(-1954493664, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-372959178);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_browser_settings_recyclerview, false);
        C0f9.A09(230131400, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-985867124);
        super.onResume();
        if (!this.A02) {
            A05(this);
        }
        C0f9.A09(335220103, A02);
    }
}
