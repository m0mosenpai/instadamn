package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.model.mediatype.ProductType;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.V0q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67884V0q extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BoostPackageFragment";
    public View A00;
    public View A01;
    public KEF A02;
    public W65 A03;
    public FRW A04;
    public IgdsStepperHeader A05;
    public IgRadioGroup A06;
    public SpinnerImageView A07;
    public Exception A08;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0D = C1XM.A00(new X2y(this, 1));
    public final InterfaceC09390do A0C = C1XM.A00(new X2y(this, 0));
    public final InterfaceC09390do A0A = C1XM.A00(new C50163MDq(this, 48));
    public final InterfaceC09390do A0B = C1XM.A00(new C50163MDq(this, 49));
    public final InterfaceC09390do A0E = C1XM.A00(new X2y(this, 2));
    public final InterfaceC09390do A09 = C1XM.A00(new C50163MDq(this, 47));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131954046);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        Context context = getContext();
        if (context != null) {
            this.A04 = new FRW(context, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "boost_package_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        KEF kef;
        View view2;
        TextView textView;
        ViewStub viewStub;
        TextView textView2;
        TextView textView3;
        XCP xcp;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0G;
        ((UFQ) interfaceC09390do.getValue()).A02 = new C68942Veg(this);
        this.A01 = view.findViewById(R.id.main_container_view);
        C1UC activity = getActivity();
        if ((activity instanceof XCP) && (xcp = (XCP) activity) != null) {
            xcp.AUv();
        }
        this.A07 = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
        InterfaceC09390do interfaceC09390do2 = this.A09;
        String str = ((IGBoostPackagesFlowInfo) interfaceC09390do2.getValue()).A03;
        if (str != null && (textView3 = (TextView) view.findViewById(R.id.promote_header)) != null) {
            textView3.setText(str);
        }
        String str2 = ((IGBoostPackagesFlowInfo) interfaceC09390do2.getValue()).A02;
        if (str2 != null && (textView2 = (TextView) view.findViewById(R.id.promote_subheader)) != null) {
            textView2.setText(str2);
        }
        this.A05 = (IgdsStepperHeader) view.findViewById(R.id.stepper_header);
        if (this.A00 == null) {
            View view3 = this.A01;
            String str3 = null;
            if (view3 != null && (viewStub = (ViewStub) view3.findViewById(R.id.custom_ad_row)) != null) {
                view2 = viewStub.inflate();
            } else {
                view2 = null;
            }
            this.A00 = view2;
            if (view2 != null) {
                WNN.A00(view2, 63, this);
            }
            View view4 = this.A00;
            if (view4 != null && (textView = (TextView) view4.findViewById(R.id.row_section_title)) != null) {
                Context context = textView.getContext();
                if (context != null) {
                    str3 = context.getString(2131954044);
                }
                textView.setText(str3);
                textView.setVisibility(0);
            }
            View view5 = this.A00;
            if (view5 != null) {
                AbstractC31176DnK.A1E(view5, R.id.row_section_thumbnail, 8);
            }
            View view6 = this.A00;
            if (view6 != null) {
                AbstractC31176DnK.A1E(view6, R.id.row_section_subtitle, 8);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            kef = new KEF(context2, getParentFragmentManager(), (UserSession) this.A0F.getValue());
        } else {
            kef = null;
        }
        this.A02 = kef;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.summary_recycler_view);
        recyclerView.setAdapter(this.A02);
        AbstractC31174DnI.A15(recyclerView.getContext(), recyclerView);
        VG4 vg4 = VG4.A0P;
        W65 w65 = new W65(view, vg4);
        this.A03 = w65;
        w65.A01();
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            C70639WeK c70639WeK = new C70639WeK(this);
            UserSession userSession = (UserSession) this.A0F.getValue();
            XIGIGBoostDestination xIGIGBoostDestination = ((UFQ) interfaceC09390do.getValue()).A01;
            ProductType productType = ((UFQ) interfaceC09390do.getValue()).A09;
            interfaceC09390do.getValue();
            interfaceC09390do.getValue();
            AbstractC69913Vxe.A00(activity2, xIGIGBoostDestination, c70639WeK, w65, userSession, productType, false, false, false);
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC3(this, (InterfaceC23621Ds) null, 40), AbstractC25229BEm.A0a(this));
        if (this.A08 != null) {
            AbstractC43594JPz.A0N(this.A0F).A0Z(vg4.toString(), AbstractC43591JPw.A00(1370), this.A08);
            this.A08 = null;
            AbstractC167007dF.A0J().postDelayed(new RunnableC49843Lzo(this), 1000L);
        }
        AbstractC65702TsY.A1M(AbstractC43594JPz.A0N(this.A0F), vg4);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0F.getValue();
    }

    public C67884V0q() {
        X2y x2y = new X2y(this, 6);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2y(new X2y(this, 3), 4));
        this.A0G = new C60842q8(new X2y(A00, 5), x2y, new C57253Pbb(9, null, A00), new C0YZ(UFQ.class));
        this.A0F = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        XDE xde;
        int A02 = C0f9.A02(1635379555);
        C14360o3.A0B(layoutInflater, 0);
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnB(VG4.A0P.toString());
        }
        View inflate = layoutInflater.inflate(R.layout.boost_package_fragment, viewGroup, false);
        C0f9.A09(-973575140, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1827007624);
        super.onDestroy();
        this.A04 = null;
        C0f9.A09(-2014071649, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1804246287);
        super.onDestroyView();
        this.A01 = null;
        this.A05 = null;
        this.A06 = null;
        this.A00 = null;
        this.A03 = null;
        this.A07 = null;
        this.A02 = null;
        ((UFQ) this.A0G.getValue()).A02 = null;
        C0f9.A09(-796676363, A02);
    }
}
