package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes6.dex */
public final class ELZ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC62892tS, InterfaceC60122ou, InterfaceC37190Ga1 {
    public static final String __redex_internal_original_name = "OptInEmailFragment";
    public BusinessFlowAnalyticsLogger A00;
    public String A01;
    public boolean A02;
    public InterfaceC37222GaX A04;
    public EVM A05;
    public IgdsListCell A06;
    public String A07;
    public boolean A09;
    public boolean A03 = true;
    public boolean A08 = true;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "opt_in_email_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        InterfaceC37222GaX A01 = AbstractC35211Fg4.A01(this);
        if (A01 != null) {
            this.A04 = A01;
            return;
        }
        throw AbstractC166987dD.A14("controller must not be null");
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        String str;
        String str2;
        String str3;
        boolean z = this.A03;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        if (z != this.A02) {
            C32548EUy.A00(requireContext(), AbstractC018607g.A00(this), FXB.A01(AbstractC166987dD.A0r(this.A0A), "marketing_email", str), this, 18);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str3 = "logger";
        } else {
            String str4 = this.A01;
            if (this.A03) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            businessFlowAnalyticsLogger.CjL(new Y7A("opt_in_promotional_email", str4, null, null, null, null, AbstractC167017dG.A0r("opt_in_promotional_email_setting", str2), null));
            InterfaceC37222GaX interfaceC37222GaX = this.A04;
            if (interfaceC37222GaX == null) {
                str3 = "controller";
            } else {
                ((BusinessConversionActivity) interfaceC37222GaX).CnD(null);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC37222GaX interfaceC37222GaX = this.A04;
        if (interfaceC37222GaX == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        AbstractC31179DnN.A1T(interfaceC37222GaX);
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 31);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2051079325);
        super.onCreate(bundle);
        this.A07 = AbstractC31175DnJ.A0Y(requireArguments(), "user_email");
        this.A09 = requireArguments().getBoolean("is_creator");
        this.A01 = AbstractC31180DnO.A0b(this);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0A);
        InterfaceC37222GaX interfaceC37222GaX = this.A04;
        if (interfaceC37222GaX != null) {
            EnumC151596s5 B77 = interfaceC37222GaX.B77();
            InterfaceC37222GaX interfaceC37222GaX2 = this.A04;
            if (interfaceC37222GaX2 != null) {
                BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(B77, this, A0o, (String) AbstractC166987dD.A17(((BusinessConversionActivity) interfaceC37222GaX2).A0C));
                if (A00 != null) {
                    this.A00 = A00;
                    C0f9.A09(-649256929, A02);
                    return;
                } else {
                    IllegalStateException A14 = AbstractC166987dD.A14("received null flowType or unexpected value for flowType");
                    C0f9.A09(1283562733, A02);
                    throw A14;
                }
            }
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(853071034);
        C14360o3.A0B(layoutInflater, 0);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.Clo(new Y7A("opt_in_promotional_email", this.A01, null, null, null, null, null, null));
            View inflate = layoutInflater.inflate(R.layout.opt_in_email_fragment, viewGroup, false);
            boolean z = this.A09;
            IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.opt_in_email_headline);
            int i = 2131969225;
            if (z) {
                i = 2131969226;
            }
            A0Q.setHeadline(i);
            IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.opt_in_email_footer);
            Resources A0N = AbstractC166997dE.A0N(this);
            String str2 = this.A07;
            if (str2 == null) {
                str = "userEmail";
            } else {
                Spanned A0B = AbstractC31173DnH.A0B(A0N, str2, 2131969222);
                C14360o3.A07(A0B);
                igdsListCell.A0I(A0B);
                igdsListCell.A08(R.style.PrivacyTextStyle, AbstractC31173DnH.A04(this));
                IgdsListCell A0Y = AbstractC31173DnH.A0Y(inflate, R.id.promotional_emails_cell);
                this.A06 = A0Y;
                str = "promotionalEmailsCell";
                if (A0Y != null) {
                    A0Y.setTextCellType(EnumC53237Nga.A08);
                    IgdsListCell igdsListCell2 = this.A06;
                    if (igdsListCell2 != null) {
                        AbstractC31180DnO.A1D(this, igdsListCell2, 2131969224);
                        IgdsListCell igdsListCell3 = this.A06;
                        if (igdsListCell3 != null) {
                            igdsListCell3.A0H(AbstractC25227BEk.A0v(this, 2131969223));
                            IgdsListCell igdsListCell4 = this.A06;
                            if (igdsListCell4 != null) {
                                igdsListCell4.setChecked(this.A03);
                                IgdsListCell igdsListCell5 = this.A06;
                                if (igdsListCell5 != null) {
                                    G9H.A00(igdsListCell5, this, 3);
                                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.navigation_bar);
                                    C14360o3.A0B(igdsBottomButtonLayout, 3);
                                    EVM evm = new EVM(this, igdsBottomButtonLayout, 2131968535, -1);
                                    this.A05 = evm;
                                    registerLifecycleListener(evm);
                                    C0f9.A09(1001939426, A02);
                                    return inflate;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1726428495);
        super.onDestroyView();
        EVM evm = this.A05;
        if (evm == null) {
            C14360o3.A0F("businessNavBarHelper");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(evm);
        C0f9.A09(-1671237825, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1056664046);
        super.onStart();
        boolean z = this.A08;
        this.A03 = z;
        IgdsListCell igdsListCell = this.A06;
        if (igdsListCell == null) {
            C14360o3.A0F("promotionalEmailsCell");
            throw C00O.createAndThrow();
        }
        igdsListCell.setChecked(z);
        C0f9.A09(1529797724, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-259517626);
        this.A08 = this.A03;
        super.onStop();
        C0f9.A09(-1310423571, A02);
    }
}
