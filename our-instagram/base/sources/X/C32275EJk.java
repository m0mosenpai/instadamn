package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.Serializable;

/* renamed from: X.EJk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32275EJk extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ConnectContactsFragment";
    public TextView A00;
    public TextView A01;
    public C31823Dyh A02;
    public InterfaceC37264GbH A03;
    public FJT A04;
    public ProgressButton A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A0A) {
            interfaceC56362iU.EkS(true);
            AbstractC31176DnK.A1C(new ViewOnClickListenerC35667Fp2(this, 54), AbstractC31176DnK.A0I(), interfaceC56362iU);
            return;
        }
        interfaceC56362iU.EkF(false);
    }

    private final void A00(View view, TextView textView, TextView textView2) {
        if (!C14360o3.A0K(this.A06, "A")) {
            if (C14360o3.A0K(this.A06, "B")) {
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), textView, 2131956602);
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), textView2, 2131956601);
            } else if (C14360o3.A0K(this.A06, "C")) {
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), textView, 2131956608);
                textView2.setVisibility(8);
            }
            View A0R = AbstractC166997dE.A0R(view, R.id.bullet_one);
            IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AbstractC166997dE.A0R(view, R.id.bullet_two);
            A0R.setVisibility(8);
            IgdsBulletCell.A00(igdsBulletCell, null, AbstractC166997dE.A0N(this).getString(2131956603));
            AbstractC31177DnL.A0x(igdsBulletCell, igdsBulletCell.getPaddingLeft(), AbstractC167017dG.A03(requireContext()));
        }
    }

    public static final void A01(C32275EJk c32275EJk) {
        C31823Dyh c31823Dyh = c32275EJk.A02;
        if (c31823Dyh != null) {
            if (AbstractC31176DnK.A1b(c31823Dyh.A01)) {
                InterfaceC09390do interfaceC09390do = c32275EJk.A0B;
                C229419w A02 = C18U.A02(AbstractC166987dD.A0o(interfaceC09390do), 36323032343718771L);
                if (A02 != null && A02.AhE(C06090Tz.A04, 36323032343718771L)) {
                    C31823Dyh c31823Dyh2 = c32275EJk.A02;
                    if (c31823Dyh2 != null) {
                        c31823Dyh2.A00(AbstractC166987dD.A0r(interfaceC09390do), null);
                    }
                }
            }
            FJT fjt = c32275EJk.A04;
            InterfaceC09390do interfaceC09390do2 = c32275EJk.A0B;
            if (fjt != null) {
                new C147036jf(c32275EJk, AbstractC31175DnJ.A0K(interfaceC09390do2, 1)).A03(null, fjt.A01.A00, false);
                if (c32275EJk.A04 != null) {
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    C14360o3.A0B(A0r, 1);
                    if (c32275EJk.getActivity() != null) {
                        AbstractC31175DnJ.A0C(c32275EJk, A0r).A06();
                        return;
                    }
                    return;
                }
                return;
            }
            C35111FeD.A00(AbstractC166987dD.A0o(interfaceC09390do2), null, c32275EJk.getModuleName());
            AbstractC25230BEn.A0l(interfaceC09390do2).A1N(true);
            InterfaceC37264GbH interfaceC37264GbH = c32275EJk.A03;
            if (interfaceC37264GbH == null) {
                return;
            }
            interfaceC37264GbH.CnE(0);
            return;
        }
        C14360o3.A0F("suggestionsViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        FJT fjt = this.A04;
        if (fjt == null || (str = fjt.A01.A00) == null) {
            return "find_friends_addressbook";
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33386EpJ enumC33386EpJ;
        FJT fjt;
        int A02 = C0f9.A02(732374856);
        Bundle requireArguments = requireArguments();
        this.A07 = AbstractC31175DnJ.A0Y(requireArguments, "NUX_FLOW_TYPE");
        this.A08 = requireArguments.getBoolean("should_remove_nux_ci_skip_button", false);
        this.A09 = requireArguments.getBoolean("should_redesign_nux_contact_import", false);
        this.A06 = requireArguments.getString("redesign_ci_variant", null);
        this.A0A = requireArguments.getBoolean("should_show_close_button", false);
        this.A03 = AbstractC34275F9v.A00(this);
        Serializable serializable = requireArguments.getSerializable("extra_delegate_source");
        if (!(serializable instanceof EnumC33386EpJ) || (enumC33386EpJ = (EnumC33386EpJ) serializable) == null) {
            enumC33386EpJ = EnumC33386EpJ.A03;
        }
        int ordinal = enumC33386EpJ.ordinal();
        if (ordinal != 1 && ordinal != 0) {
            fjt = null;
        } else {
            fjt = new FJT(enumC33386EpJ);
        }
        this.A04 = fjt;
        if (fjt != null) {
            new C147036jf(this, AbstractC31175DnJ.A0K(this.A0B, 0)).A01(false, null, fjt.A01.A00);
        }
        this.A02 = (C31823Dyh) AbstractC31175DnJ.A0A(this).A00(C31823Dyh.class);
        super.onCreate(bundle);
        C0f9.A09(1406625270, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1592144017);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = this.A09;
        int i = R.layout.connect_contacts_fragment;
        if (z) {
            i = R.layout.connect_contacts_redesign_fragment;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.skip_button);
        View A0R = AbstractC166997dE.A0R(inflate, R.id.connect_contacts_title_igds);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.connect_contacts_subtitle);
        this.A05 = (ProgressButton) inflate.requireViewById(R.id.connect_contacts_sync_button);
        boolean z2 = !AbstractC23451Ch.A07(requireContext(), "android.permission.READ_CONTACTS");
        int i2 = 2131956596;
        if (this.A09) {
            i2 = 2131956606;
            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55502Okv(8, A0R, inflate));
        }
        if (this.A08 && z2) {
            AbstractC167007dF.A0x(this.A01);
            ProgressButton progressButton = this.A05;
            if (progressButton != null) {
                int i3 = 2131956794;
                if (this.A09) {
                    i3 = 2131968535;
                }
                progressButton.setText(i3);
            }
            ViewGroup.LayoutParams A0B = AbstractC31176DnK.A0B(this.A05);
            C14360o3.A0C(A0B, AbstractC111324zv.A00(0));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0B;
            if (!this.A09) {
                ((IgdsHeadline) A0R).setHeadline(2131956614);
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A0N, 2131956612);
                i2 = 2131956597;
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC167007dF.A0N(inflate, R.id.connect_contacts_footer), 2131956597);
            } else if (A0R instanceof TextView) {
                this.A00 = AbstractC166997dE.A0T(inflate, R.id.connect_contacts_redesign_footer);
                A00(inflate, (TextView) A0R, A0N);
                if (!C14360o3.A0K(this.A06, "A")) {
                    TextView textView = this.A00;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    marginLayoutParams.bottomMargin = 0;
                }
            }
            marginLayoutParams.bottomMargin = AbstractC167017dG.A03(requireContext());
        } else {
            if (this.A09 && (A0R instanceof TextView)) {
                A00(inflate, (TextView) A0R, A0N);
            }
            TextView textView2 = this.A01;
            if (textView2 != null) {
                ViewOnClickListenerC35667Fp2.A00(textView2, 55, this);
            }
        }
        ProgressButton progressButton2 = this.A05;
        if (progressButton2 != null) {
            ViewOnClickListenerC35667Fp2.A00(progressButton2, 56, this);
        }
        if (this.A03 != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0B);
            String moduleName = getModuleName();
            String str = this.A06;
            if (str == null) {
                if (this.A08) {
                    str = "no_skip";
                } else {
                    str = "legacy";
                }
            }
            C35203Ffv.A00(A0o, null, null, null, moduleName, str);
        }
        String A0v = AbstractC25227BEk.A0v(this, 2131965061);
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0v, i2);
        AnonymousClass773.A05(A08, new C31745Dwy(this, 3), A0v);
        if (this.A09) {
            IgdsBulletCell igdsBulletCell = (IgdsBulletCell) AbstractC166997dE.A0R(inflate, R.id.bullet_three);
            igdsBulletCell.setMovementMethod(null, LinkMovementMethod.getInstance());
            IgdsBulletCell.A00(igdsBulletCell, null, A08);
        } else {
            TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.connect_contacts_footer);
            AbstractC25227BEk.A11(A0N2);
            A0N2.setText(A08);
        }
        C0f9.A09(-1991745452, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(836556409);
        super.onDestroyView();
        this.A01 = null;
        this.A05 = null;
        this.A00 = null;
        C0f9.A09(1475530073, A02);
    }
}
