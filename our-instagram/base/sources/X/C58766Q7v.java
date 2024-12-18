package X;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.views.AutofillTextInputLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Q7v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58766Q7v extends Fragment {
    public View A00;
    public Button A01;
    public EditText A02;
    public EditText A03;
    public LinearLayout A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public Q8E A08;
    public AutofillTextInputLayout A09;
    public AutofillTextInputLayout A0A;
    public BottomSheetBehavior A0B;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A01 = (Button) view.findViewById(R.id.confrm_button);
        this.A07 = AbstractC166987dD.A0e(view, R.id.title);
        this.A06 = AbstractC166987dD.A0e(view, R.id.description);
        this.A04 = (LinearLayout) view.findViewById(R.id.enter_card_details_layout);
        this.A09 = (AutofillTextInputLayout) view.findViewById(R.id.card_cvv_input_layout);
        this.A02 = (EditText) view.findViewById(R.id.card_cvv_input);
        this.A0A = (AutofillTextInputLayout) view.findViewById(R.id.card_pan_input_layout);
        this.A03 = (EditText) view.findViewById(R.id.card_pan_input);
        this.A00 = view.findViewById(R.id.progress_layout);
        this.A05 = (ScrollView) view.findViewById(R.id.bottom_sheet_scroll_view);
        Drawable background = view.findViewById(R.id.bottom_sheet_layout).getBackground();
        C14360o3.A0C(background, AbstractC111324zv.A00(27));
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        Context context = getContext();
        if (context != null) {
            gradientDrawable.setColor(W6b.A01(context, R.attr.w3c_bottom_sheet_color));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(C58766Q7v c58766Q7v, W39 w39, String str, String str2, String str3) {
        Button button = c58766Q7v.A01;
        if (button == null) {
            C14360o3.A0F("viewConfirmButton");
            throw C00O.createAndThrow();
        }
        button.setEnabled(false);
        new AlertDialog.Builder(c58766Q7v.getActivity()).setTitle(str).setMessage(str2).setPositiveButton(R.string.res_0x7f13004a_name_removed, new DialogInterfaceOnClickListenerC63422Sk0(w39, c58766Q7v, str3, 5)).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC09390do interfaceC09390do = AbstractC62325S6v.A00;
        if (i == 2021 && i2 == -1 && intent != null) {
            try {
                C2FP.A0I();
                throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", "add ig implementation"));
            } catch (GeneralSecurityException e) {
                C0K8.A0C("CreditCardScannerUtil", AbstractC166997dE.A0y("Couldn't decrypt credit card number due to ", e));
            }
        }
    }

    public static final Intent A00(CardDetails cardDetails, C58766Q7v c58766Q7v, W39 w39, Integer num, Long l, Long l2, Long l3, Long l4, String str) {
        int A06;
        String str2;
        Intent A04 = AbstractC31171DnF.A04();
        if (cardDetails != null) {
            A04.putExtra("keyResultCardDetails", cardDetails);
        }
        if (l != null) {
            A04.putExtra("timeElapsedInMs", l.longValue());
        }
        if (l2 != null) {
            A04.putExtra("additionalTimeElapsedInMs", l2.longValue());
        }
        Q8E q8e = c58766Q7v.A08;
        if (q8e != null) {
            A04.putExtra("numberOfCVVFailures", q8e.A06.size());
            Q8E q8e2 = c58766Q7v.A08;
            if (q8e2 != null) {
                if (q8e2.A06.size() > 0) {
                    Q8E q8e3 = c58766Q7v.A08;
                    if (q8e3 != null) {
                        List list = q8e3.A06;
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC63064Sbl.A02(A0q, it);
                        }
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append('(');
                        A04.putExtra("cvvFailures", AbstractC167017dG.A0o(A0q, A1C));
                    }
                }
                Q8E q8e4 = c58766Q7v.A08;
                if (q8e4 != null) {
                    Integer num2 = q8e4.A0E;
                    if (num2 != null) {
                        A04.putExtra("qplInstanceKey", num2);
                    }
                    if (l3 != null) {
                        A04.putExtra("timeInMsDemaskCardStart", l3.longValue());
                    }
                    if (l4 != null) {
                        A04.putExtra("timeInMsDemaskCardEnd", l4.longValue());
                    }
                    Q8E q8e5 = c58766Q7v.A08;
                    if (q8e5 != null) {
                        A04.putExtra("timeInMsDemaskFragmentActivityCreated", q8e5.A00);
                        Q8E q8e6 = c58766Q7v.A08;
                        if (q8e6 != null) {
                            EnumC61076Req enumC61076Req = (EnumC61076Req) q8e6.A0A.A02();
                            if (enumC61076Req == null) {
                                A06 = -1;
                            } else {
                                A06 = AbstractC58318PtA.A06(enumC61076Req, AbstractC62326S6w.A00);
                            }
                            int[] iArr = AbstractC62326S6w.A00;
                            int intValue = num.intValue();
                            if (A06 == 1) {
                                if (intValue != 0) {
                                    if (intValue != 1) {
                                        str2 = "CANCELED_CARD_VERIFICATION";
                                    } else {
                                        str2 = "FAILED_CARD_VERIFICATION";
                                    }
                                } else {
                                    str2 = "SUCCEEDED_CARD_VERIFICATION";
                                }
                            } else if (intValue != 0) {
                                if (intValue != 1) {
                                    str2 = "CANCELED_CVV_VERIFICATION";
                                } else {
                                    str2 = "FAILED_CVV_VERIFICATION";
                                }
                            } else {
                                str2 = "SUCCEEDED_CVV_VERIFICATION";
                            }
                            A04.putExtra("keyResultEventName", str2);
                            if (str == null) {
                                if (w39 != null) {
                                    InterfaceC09390do interfaceC09390do = w39.A02;
                                    if (interfaceC09390do.getValue() != null) {
                                        str = AbstractC25225BEi.A15(interfaceC09390do);
                                    }
                                }
                                return A04;
                            }
                            A04.putExtra("keyResultError", str);
                            return A04;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-209125254);
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            C14360o3.A07(application);
            this.A08 = (Q8E) new C52942bb(new C58776Q8j(application, this.mArguments), this).A00(Q8E.class);
            EditText editText = this.A03;
            if (editText == null) {
                str = "viewPanInput";
            } else {
                C63480Snt.A00(editText, new DRW(this, 0), 5);
                EditText editText2 = this.A02;
                if (editText2 != null) {
                    C63480Snt.A00(editText2, new DRW(this, 1), 5);
                    EditText editText3 = this.A02;
                    if (editText3 != null) {
                        editText3.setOnEditorActionListener(new C63536Sp3(this, 3));
                        Button button = this.A01;
                        if (button == null) {
                            str = "viewConfirmButton";
                        } else {
                            ViewOnClickListenerC63508Sob.A01(button, 60, this);
                            ScrollView scrollView = this.A05;
                            if (scrollView == null) {
                                str = "viewBottomSheetScrollView";
                            } else {
                                BottomSheetBehavior A01 = BottomSheetBehavior.A01(scrollView);
                                this.A0B = A01;
                                str = "bottomSheetBehavior";
                                if (A01 != null) {
                                    A01.A0W(3);
                                    BottomSheetBehavior bottomSheetBehavior = this.A0B;
                                    if (bottomSheetBehavior != null) {
                                        bottomSheetBehavior.A0a(new C60730ROp(this, 2));
                                        Q8E q8e = this.A08;
                                        str = "viewModel";
                                        if (q8e != null) {
                                            C63627SqZ.A00(this, q8e.A0A, 47);
                                            Q8E q8e2 = this.A08;
                                            if (q8e2 != null) {
                                                AbstractC31180DnO.A1F(this, q8e2.A09, new X58(this, 49), 35);
                                                Q8E q8e3 = this.A08;
                                                if (q8e3 != null) {
                                                    C63627SqZ.A00(this, q8e3.A08, 48);
                                                    activity.getOnBackPressedDispatcher().A06(new Q5U(activity, this), this);
                                                    C0f9.A09(-1504645293, A02);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("viewCvvInput");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        NullPointerException A15 = AbstractC166987dD.A15("Activity cannot be null");
        C0f9.A09(-2084781138, A02);
        throw A15;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(42755852);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.w3c_fbpay_autofill_demask_card_fragment, viewGroup, false);
        C0f9.A09(840128083, A02);
        return inflate;
    }
}
