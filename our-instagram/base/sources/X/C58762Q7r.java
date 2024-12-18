package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.facebookpay.widget.button.FBPayButton;

/* renamed from: X.Q7r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58762Q7r extends Fragment {
    public ContextThemeWrapper A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public LoggingContext A05;
    public PaypalConsentLaunchParams A06;
    public FBPayButton A07;
    public FBPayButton A08;
    public final C58252li A09 = AbstractC58318PtA.A0I();

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        CharSequence charSequence;
        C14360o3.A0B(view, 0);
        Parcelable parcelable = requireArguments().getParcelable("logging_context");
        if (parcelable != null) {
            this.A05 = (LoggingContext) parcelable;
            if (getActivity() != null) {
                view.requireViewById(R.id.text_container);
                TextView A0T = AbstractC166997dE.A0T(view, R.id.header);
                C14360o3.A0A(A0T);
                WF7.A02(A0T, VEP.A0v);
                SpannableStringBuilder spannableStringBuilder = null;
                AbstractC70177WFc.A05(A0T, R.style.FBPayUITerms_Header, false);
                this.A03 = A0T;
                TextView A0T2 = AbstractC166997dE.A0T(view, R.id.subheader);
                C14360o3.A0A(A0T2);
                WF7.A02(A0T2, VEP.A0o);
                AbstractC70177WFc.A05(A0T2, R.style.FBPayUITerms_Header, false);
                this.A04 = A0T2;
                TextView A0T3 = AbstractC166997dE.A0T(view, R.id.description);
                C14360o3.A0A(A0T3);
                WF7.A02(A0T3, VEP.A0F);
                AbstractC70177WFc.A05(A0T3, R.style.FBPayUITerms, false);
                this.A02 = A0T3;
                FBPayButton fBPayButton = (FBPayButton) view.requireViewById(R.id.consent_button);
                C14360o3.A0A(fBPayButton);
                AbstractC70177WFc.A05(fBPayButton, R.style.FBPayButtonPair_Primary, false);
                this.A07 = fBPayButton;
                ProgressBar progressBar = (ProgressBar) view.requireViewById(R.id.progress_icon);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                if (indeterminateDrawable != null) {
                    C2FP.A0A();
                    indeterminateDrawable.setColorFilter(AbstractC166997dE.A0L(progressBar).getColor(R.color.audio_bar_action_color_enabled), PorterDuff.Mode.MULTIPLY);
                }
                this.A01 = progressBar;
                FBPayButton fBPayButton2 = (FBPayButton) view.requireViewById(R.id.cancel_button);
                fBPayButton2.setButtonStyle(VEX.A0A);
                AbstractC70177WFc.A05(fBPayButton2, R.style.FBPayButtonPair_Secondary, false);
                this.A08 = fBPayButton2;
                TextView textView = this.A03;
                if (textView == null) {
                    str = "headerTextView";
                } else {
                    PaypalConsentLaunchParams paypalConsentLaunchParams = this.A06;
                    if (paypalConsentLaunchParams != null) {
                        textView.setText(paypalConsentLaunchParams.A03);
                        TextView textView2 = this.A04;
                        if (textView2 == null) {
                            str = "subheaderTextView";
                        } else {
                            PaypalConsentLaunchParams paypalConsentLaunchParams2 = this.A06;
                            if (paypalConsentLaunchParams2 != null) {
                                textView2.setText(paypalConsentLaunchParams2.A0A);
                                TextView textView3 = this.A02;
                                String str2 = "descriptionTextView";
                                if (textView3 != null) {
                                    PaypalConsentLaunchParams paypalConsentLaunchParams3 = this.A06;
                                    if (paypalConsentLaunchParams3 != null) {
                                        String str3 = paypalConsentLaunchParams3.A02;
                                        if (str3 != null) {
                                            LinkableTextParams linkableTextParams = paypalConsentLaunchParams3.A01;
                                            if (linkableTextParams != null) {
                                                SLH slh = new SLH(linkableTextParams.A02, AbstractC166987dD.A1J(new C62901SWh(linkableTextParams.A00, linkableTextParams.A01, linkableTextParams.A03)));
                                                T36 t36 = new T36(this, 0);
                                                C14360o3.A0B(t36, 0);
                                                charSequence = slh.A00(t36, false);
                                            } else {
                                                charSequence = "";
                                            }
                                            spannableStringBuilder = new SpannableStringBuilder(charSequence).insert(0, (CharSequence) str3);
                                        }
                                        textView3.setText(spannableStringBuilder);
                                        TextView textView4 = this.A02;
                                        if (textView4 != null) {
                                            AbstractC25227BEk.A11(textView4);
                                            FBPayButton fBPayButton3 = this.A07;
                                            str2 = "primaryButton";
                                            if (fBPayButton3 != null) {
                                                PaypalConsentLaunchParams paypalConsentLaunchParams4 = this.A06;
                                                if (paypalConsentLaunchParams4 != null) {
                                                    fBPayButton3.setText(paypalConsentLaunchParams4.A06);
                                                    FBPayButton fBPayButton4 = this.A07;
                                                    if (fBPayButton4 != null) {
                                                        ViewOnClickListenerC63508Sob.A01(fBPayButton4, 30, this);
                                                        FBPayButton fBPayButton5 = this.A08;
                                                        str2 = "secondaryButton";
                                                        if (fBPayButton5 != null) {
                                                            PaypalConsentLaunchParams paypalConsentLaunchParams5 = this.A06;
                                                            if (paypalConsentLaunchParams5 != null) {
                                                                fBPayButton5.setText(paypalConsentLaunchParams5.A08);
                                                                FBPayButton fBPayButton6 = this.A08;
                                                                if (fBPayButton6 != null) {
                                                                    ViewOnClickListenerC63508Sob.A01(fBPayButton6, 29, this);
                                                                    Wap A0H = AbstractC43592JPx.A0H();
                                                                    LoggingContext loggingContext = this.A05;
                                                                    if (loggingContext == null) {
                                                                        str = "loggingContext";
                                                                    } else {
                                                                        PaypalConsentLaunchParams paypalConsentLaunchParams6 = this.A06;
                                                                        if (paypalConsentLaunchParams6 != null) {
                                                                            Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "client_load_ecppaypalconversion_display"), 72), loggingContext, new C65023Tc9(loggingContext, "paypal_consent", 1, Long.parseLong(paypalConsentLaunchParams6.A05)));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F(str2);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    C14360o3.A0F("launchParams");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            DialogInterfaceOnDismissListenerC63426Sk5 dialogInterfaceOnDismissListenerC63426Sk5 = new DialogInterfaceOnDismissListenerC63426Sk5(this, 4);
            Fragment fragment = this.mParentFragment;
            C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            Dialog dialog = ((C0SG) fragment).A01;
            if (dialog != null) {
                dialog.setOnDismissListener(dialogInterfaceOnDismissListenerC63426Sk5);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1610865588);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("PAYPAL_CONSENT_LAUNCH_PARAMS");
        C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.paypal.model.PaypalConsentLaunchParams");
        this.A06 = (PaypalConsentLaunchParams) parcelable;
        C0f9.A09(-230617194, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1391283712);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        C2FP.A0A();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext, R.style.FBPayUIWidget);
        this.A00 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.ecp_paypal_consent_content_fragment, viewGroup, false);
        C0f9.A09(-1682387365, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-1676276426);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            str = "viewContext";
        } else {
            VEY vey = VEY.A0G;
            PaypalConsentLaunchParams paypalConsentLaunchParams = this.A06;
            if (paypalConsentLaunchParams == null) {
                str = "launchParams";
            } else {
                AbstractC68346VNg.A00(contextThemeWrapper, this, vey, paypalConsentLaunchParams.A04, null, X4D.A00, X4E.A00, false, false);
                C0f9.A09(-1001200404, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
