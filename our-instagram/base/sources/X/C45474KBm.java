package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education.NudityReceiverEducationSafetyTipsViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.Map;

/* renamed from: X.KBm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45474KBm extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NudityReceiverEducationSafetyTipsFragment";
    public int A00;
    public View A01;
    public ViewStub A02;
    public DirectThreadAnalyticsParams A05;
    public IgdsBottomButtonLayout A06;
    public boolean A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public EnumC46278KeA A04 = EnumC46278KeA.RECEIVER;
    public EnumC46297KeT A03 = EnumC46297KeT.IN_THREAD;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131961680);
        AbstractC31176DnK.A1C(ViewOnClickListenerC48074LPz.A00(this, 10), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "safety_tips";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String A0p;
        String A0p2;
        String A0p3;
        String A0p4;
        String A0p5;
        String str;
        C14360o3.A0B(view, 0);
        this.A02 = AbstractC31173DnH.A0G(view, R.id.main_container_stub);
        FragmentActivity activity = getActivity();
        C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) activity).A0a();
        int i2 = this.A00;
        FragmentActivity requireActivity = requireActivity();
        if (i2 == 0) {
            i = R.drawable.ig_illustrations_illo_sharing_media_refresh;
            A0p = AbstractC166997dE.A0p(requireActivity, 2131961679);
            A0p2 = AbstractC166997dE.A0p(requireActivity, 2131961676);
            A0p3 = AbstractC166997dE.A0p(requireActivity, 2131961677);
            A0p4 = AbstractC166997dE.A0p(requireActivity, 2131961678);
            A0p5 = "";
        } else {
            i = R.drawable.ig_illustrations_illo_conversations_refresh;
            A0p = AbstractC166997dE.A0p(requireActivity, 2131961674);
            A0p2 = AbstractC166997dE.A0p(requireActivity, 2131961670);
            A0p3 = AbstractC166997dE.A0p(requireActivity, 2131961671);
            A0p4 = AbstractC166997dE.A0p(requireActivity, 2131961672);
            A0p5 = AbstractC166997dE.A0p(requireActivity, 2131961673);
        }
        NudityReceiverEducationSafetyTipsViewModel nudityReceiverEducationSafetyTipsViewModel = new NudityReceiverEducationSafetyTipsViewModel(A0p, A0p2, A0p3, A0p4, A0p5, i);
        ViewStub viewStub = this.A02;
        if (viewStub == null) {
            str = "mainContainerStub";
        } else {
            View inflate = viewStub.inflate();
            this.A01 = inflate;
            str = "mainContainer";
            if (inflate != null) {
                IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) AbstractC166997dE.A0R(inflate, R.id.stepper_header);
                View view2 = this.A01;
                if (view2 != null) {
                    ImageView A0D = AbstractC31176DnK.A0D(view2, R.id.nudity_receiver_safety_tips_image);
                    AbstractC166997dE.A19(A0D.getContext(), A0D, nudityReceiverEducationSafetyTipsViewModel.A00);
                    View view3 = this.A01;
                    if (view3 != null) {
                        AbstractC167007dF.A0N(view3, R.id.nudity_receiver_safety_tips_headline).setText(nudityReceiverEducationSafetyTipsViewModel.A01);
                        View view4 = this.A01;
                        if (view4 != null) {
                            TextView A0N = AbstractC167007dF.A0N(view4, R.id.nudity_receiver_safety_tips_sensitive_content_bullet1);
                            A0N.setText(new C31742Dwv(AbstractC166997dE.A0L(A0N), AbstractC166987dD.A1J(nudityReceiverEducationSafetyTipsViewModel.A02), 4, 10, 1));
                            View view5 = this.A01;
                            if (view5 != null) {
                                TextView A0N2 = AbstractC167007dF.A0N(view5, R.id.nudity_receiver_safety_tips_sensitive_content_bullet2);
                                A0N2.setText(new C31742Dwv(AbstractC166997dE.A0L(A0N2), AbstractC166987dD.A1J(nudityReceiverEducationSafetyTipsViewModel.A03), 4, 10, 1));
                                View view6 = this.A01;
                                if (view6 != null) {
                                    TextView A0N3 = AbstractC167007dF.A0N(view6, R.id.nudity_receiver_safety_tips_sensitive_content_bullet3);
                                    CharSequence c31742Dwv = new C31742Dwv(requireContext(), AbstractC166987dD.A1J(nudityReceiverEducationSafetyTipsViewModel.A04), 4, 10, 1);
                                    String str2 = nudityReceiverEducationSafetyTipsViewModel.A05;
                                    if (str2.length() != 0) {
                                        C33265Elz c33265Elz = new C33265Elz(this, str2, requireContext().getColor(AbstractC53242c7.A06(requireContext())));
                                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0D(str2, ' '));
                                        AnonymousClass773.A04(A0H, c33265Elz, str2);
                                        c31742Dwv = TextUtils.concat(c31742Dwv, A0H);
                                    }
                                    AbstractC31176DnK.A1G(A0N3, c31742Dwv);
                                    igdsStepperHeader.A03(this.A00, 3, true, false);
                                    igdsStepperHeader.A01();
                                    IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.action_bottom_button);
                                    this.A06 = A0j;
                                    String str3 = null;
                                    if (A0j != null) {
                                        Context context = getContext();
                                        if (context != null) {
                                            str3 = context.getString(2131961675);
                                        }
                                        A0j.setPrimaryActionText(str3);
                                        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
                                        if (igdsBottomButtonLayout != null) {
                                            igdsBottomButtonLayout.setPrimaryActionIsLoading(false);
                                            ViewOnClickListenerC48074LPz A00 = ViewOnClickListenerC48074LPz.A00(this, 11);
                                            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A06;
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
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable.Creator creator;
        int A02 = C0f9.A02(-778479569);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("current_step");
        String string = requireArguments().getString("ODNC_USER_ROLE_KEY");
        if (string == null) {
            string = "RECEIVER";
        }
        this.A04 = EnumC46278KeA.valueOf(string);
        String string2 = requireArguments().getString("ODNC_ENTRY_POINT_KEY");
        if (string2 == null) {
            string2 = "IN_THREAD";
        }
        this.A03 = EnumC46297KeT.valueOf(string2);
        this.A07 = requireArguments().getBoolean("IS_ELIGIBLE_FOR_LOGGING_KEY");
        Bundle requireArguments = requireArguments();
        Object obj = DirectThreadAnalyticsParams.class.getDeclaredField("CREATOR").get(null);
        if ((obj instanceof Parcelable.Creator) && (creator = (Parcelable.Creator) obj) != null) {
            this.A05 = (DirectThreadAnalyticsParams) ((Parcelable) C0B1.A01(creator, requireArguments.getParcelable("DIRECT_THREAD_ANALYTICS_PARAMS_KEY"), DirectThreadAnalyticsParams.class));
            C0f9.A09(-59268044, A02);
        } else {
            Map map = C0YZ.A03;
            IllegalArgumentException A0c = AbstractC167007dF.A0c("Could not access CREATOR field in class ", AbstractC13230m9.A01(DirectThreadAnalyticsParams.class));
            C0f9.A09(-902881272, A02);
            throw A0c;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1491204438);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudity_receiver_education_safety_tips_view, viewGroup, false);
        C0f9.A09(-887162207, A02);
        return inflate;
    }
}
