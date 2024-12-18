package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Map;

/* renamed from: X.KBr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45479KBr extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NudityReceiverEducationGetSupportFragment";
    public View A00;
    public ViewStub A01;
    public DirectThreadAnalyticsParams A04;
    public IgdsBottomButtonLayout A05;
    public boolean A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public EnumC46278KeA A03 = EnumC46278KeA.RECEIVER;
    public EnumC46297KeT A02 = EnumC46297KeT.IN_THREAD;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131961680);
        AbstractC31176DnK.A1C(ViewOnClickListenerC48074LPz.A00(this, 5), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "get_support";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        this.A01 = AbstractC31173DnH.A0G(view, R.id.main_container_stub);
        FragmentActivity activity = getActivity();
        C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) activity).A0a();
        ViewStub viewStub = this.A01;
        if (viewStub == null) {
            str = "mainContainerStub";
        } else {
            View inflate = viewStub.inflate();
            this.A00 = inflate;
            str = "mainContainer";
            if (inflate != null) {
                IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) AbstractC166997dE.A0R(inflate, R.id.stepper_header);
                View view2 = this.A00;
                if (view2 != null) {
                    ImageView A0D = AbstractC31176DnK.A0D(view2, R.id.nudity_receiver_safety_tips_image);
                    AbstractC166997dE.A19(A0D.getContext(), A0D, R.drawable.ig_illustrations_illo_support_refresh);
                    View view3 = this.A00;
                    if (view3 != null) {
                        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(view3, R.id.nudity_receiver_list_cell_report);
                        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A04;
                        igdsListCell.A0G(enumC53237Nga, true);
                        ViewOnClickListenerC48074LPz.A01(igdsListCell, 6, this);
                        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A07, 0), 36325824072791455L);
                        View view4 = this.A00;
                        if (view4 != null) {
                            IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0R(view4, R.id.nudity_receiver_list_cell_prevent);
                            igdsListCell2.A0G(enumC53237Nga, true);
                            C0fQ.A00(new LOy(3, this, A06), igdsListCell2);
                            View view5 = this.A00;
                            if (view5 != null) {
                                IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166997dE.A0R(view5, R.id.nudity_receiver_list_cell_find);
                                igdsListCell3.A0G(enumC53237Nga, true);
                                ViewOnClickListenerC48074LPz.A01(igdsListCell3, 7, this);
                                View view6 = this.A00;
                                if (view6 != null) {
                                    IgdsListCell igdsListCell4 = (IgdsListCell) AbstractC166997dE.A0R(view6, R.id.nudity_receiver_list_cell_learn);
                                    igdsListCell4.A0G(enumC53237Nga, true);
                                    ViewOnClickListenerC48074LPz.A01(igdsListCell4, 8, this);
                                    igdsStepperHeader.A03(2, 3, true, false);
                                    igdsStepperHeader.A01();
                                    IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.action_bottom_button);
                                    this.A05 = A0j;
                                    String str2 = null;
                                    if (A0j != null) {
                                        Context context = getContext();
                                        if (context != null) {
                                            str2 = context.getString(2131961662);
                                        }
                                        A0j.setPrimaryActionText(str2);
                                        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
                                        if (igdsBottomButtonLayout != null) {
                                            igdsBottomButtonLayout.setPrimaryActionIsLoading(false);
                                            ViewOnClickListenerC48074LPz A00 = ViewOnClickListenerC48074LPz.A00(this, 9);
                                            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A05;
                                            if (igdsBottomButtonLayout2 != null) {
                                                igdsBottomButtonLayout2.setPrimaryActionOnClickListener(A00);
                                                super.onViewCreated(view, bundle);
                                                return;
                                            }
                                        }
                                    }
                                    C14360o3.A0F("bottomButtonLayout");
                                    throw C00O.createAndThrow();
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public static final void A00(C45479KBr c45479KBr, String str) {
        AbstractC41776Ies.A09(c45479KBr.requireActivity(), AbstractC166987dD.A0r(c45479KBr.A07), C2Fb.A2f, str, "get_support");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable.Creator creator;
        int A02 = C0f9.A02(-1015325004);
        super.onCreate(bundle);
        String string = requireArguments().getString("ODNC_USER_ROLE_KEY");
        if (string == null) {
            string = "RECEIVER";
        }
        this.A03 = EnumC46278KeA.valueOf(string);
        String string2 = requireArguments().getString("ODNC_ENTRY_POINT_KEY");
        if (string2 == null) {
            string2 = "IN_THREAD";
        }
        this.A02 = EnumC46297KeT.valueOf(string2);
        this.A06 = requireArguments().getBoolean("IS_ELIGIBLE_FOR_LOGGING_KEY");
        Bundle requireArguments = requireArguments();
        Object obj = DirectThreadAnalyticsParams.class.getDeclaredField("CREATOR").get(null);
        if ((obj instanceof Parcelable.Creator) && (creator = (Parcelable.Creator) obj) != null) {
            this.A04 = (DirectThreadAnalyticsParams) ((Parcelable) C0B1.A01(creator, requireArguments.getParcelable("DIRECT_THREAD_ANALYTICS_PARAMS_KEY"), DirectThreadAnalyticsParams.class));
            C0f9.A09(1267811467, A02);
        } else {
            Map map = C0YZ.A03;
            IllegalArgumentException A0c = AbstractC167007dF.A0c("Could not access CREATOR field in class ", AbstractC13230m9.A01(DirectThreadAnalyticsParams.class));
            C0f9.A09(413920377, A02);
            throw A0c;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1106624046);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudity_receiver_education_get_support_view, viewGroup, false);
        C0f9.A09(-88796936, A02);
        return inflate;
    }
}
