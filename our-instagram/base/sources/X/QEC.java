package X;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.fbpay.w3c.CardDetails;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class QEC extends QE4 {
    public Intent A00;
    public View A01;
    public View A02;
    public View A03;
    public Button A04;
    public EditText A05;
    public FrameLayout A06;
    public LinearLayout A07;
    public ScrollView A08;
    public Spinner A09;
    public TextView A0A;
    public TextView A0B;
    public Q8C A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public String A0G;

    public final Intent A0H(CardDetails cardDetails, W39 w39, Integer num, Long l, Long l2, Long l3, String str) {
        String str2;
        Intent A04 = AbstractC31171DnF.A04();
        if (cardDetails != null) {
            A04.putExtra("keyResultCardDetails", cardDetails);
        }
        if (l != null) {
            A04.putExtra("timeElapsedInMs", l.longValue());
        }
        A04.putExtra("numberOfCVVFailures", A0I().A02.size());
        if (A0I().A02.size() > 0) {
            List list = A0I().A02;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC63064Sbl.A02(A0q, it);
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append('(');
            A04.putExtra("cvvFailures", AbstractC167017dG.A0o(A0q, A1C));
        }
        if (A0I().A09 != null) {
            A04.putExtra("qplInstanceKey", A0I().A09);
        }
        if (l2 != null) {
            A04.putExtra("timeInMsDemaskCardStart", l2.longValue());
        }
        if (l3 != null) {
            A04.putExtra("timeInMsDemaskCardEnd", l3.longValue());
        }
        A04.putExtra("timeInMsDemaskFragmentActivityCreated", A0I().A00);
        int intValue = num.intValue();
        if (intValue != 0) {
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

    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C63380Siu c63380Siu;
        int i;
        C5G6 c5g6;
        C14360o3.A0B(dialogInterface, 0);
        Integer num = this.A0D;
        if (num != null && num.intValue() == -1 && (c5g6 = ((QE4) this).A01) != null) {
            c5g6.A01.A02(((QE4) this).A00, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 1023, false), C05F.A01, "ACCEPTED_AUTOFILL");
        }
        WeakReference weakReference = ((QE4) this).A02;
        if (weakReference != null && (c63380Siu = (C63380Siu) weakReference.get()) != null) {
            Integer num2 = this.A0D;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            Intent intent = this.A00;
            if (intent == null) {
                intent = A0H(null, null, C05F.A0C, null, null, null, null);
            }
            c63380Siu.A0E(i, intent);
        }
        dialogInterface.cancel();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String string;
        Resources resources;
        Resources resources2;
        C14360o3.A0B(view, 0);
        this.A0B = AbstractC166987dD.A0e(view, R.id.title);
        this.A05 = (EditText) view.findViewById(R.id.card_cvv_input);
        this.A04 = (Button) view.findViewById(R.id.confirm_button);
        this.A07 = (LinearLayout) view.findViewById(R.id.enter_card_details_layout);
        this.A03 = view.findViewById(R.id.progress_layout);
        this.A08 = (ScrollView) view.findViewById(R.id.bottom_sheet_scroll_view);
        this.A06 = (FrameLayout) view.findViewById(R.id.bottom_sheet_layout);
        this.A0A = AbstractC166987dD.A0e(view, R.id.inline_error_message);
        this.A09 = (Spinner) view.findViewById(R.id.card_selection_dropdown);
        this.A02 = view.findViewById(R.id.single_card_selection_preview);
        Context context = getContext();
        String str2 = null;
        if (context != null && (resources2 = context.getResources()) != null) {
            str2 = resources2.getString(R.string.res_0x7f13008b_name_removed);
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        this.A0G = str2;
        Context context2 = getContext();
        if (context2 == null || (resources = context2.getResources()) == null || (str = resources.getString(R.string.res_0x7f13008a_name_removed)) == null) {
            str = "";
        }
        this.A0F = str;
        Context context3 = getContext();
        if (context3 != null && (string = context3.getString(R.string.res_0x7f130049_name_removed)) != null) {
            str3 = string;
        }
        this.A0E = str3;
    }

    public static final void A01(QEC qec, W39 w39, String str, String str2, String str3) {
        Button button = qec.A04;
        if (button != null) {
            button.setEnabled(false);
        }
        AlertDialog.Builder message = new AlertDialog.Builder(qec.getActivity()).setTitle(str).setMessage(str2);
        String str4 = qec.A0E;
        if (str4 != null) {
            message.setPositiveButton(str4, new DialogInterfaceOnClickListenerC63422Sk0(w39, qec, str3, 2)).show();
        } else {
            C14360o3.A0F("okButtonText");
            throw C00O.createAndThrow();
        }
    }

    public final Q8C A0I() {
        Q8C q8c = this.A0C;
        if (q8c != null) {
            return q8c;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_iab_autofill_cvv_verification_bottomsheet, (ViewGroup) null);
        this.A01 = inflate;
        if (inflate != null) {
            ViewOnTouchListenerC63511Soe.A00(inflate, 2, this);
        }
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(this.A01).create();
        C14360o3.A07(create);
        return create;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        CardDetails cardDetails;
        SZO szo;
        BottomSheetBehavior A01;
        int A02 = C0f9.A02(993449700);
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            C14360o3.A07(application);
            Q8C q8c = (Q8C) new C52942bb(new C58774Q8h(application, this.mArguments), this).A00(Q8C.class);
            C14360o3.A0B(q8c, 0);
            this.A0C = q8c;
            View view = this.A01;
            if (view != null) {
                if (A0I().A0A.size() > 1) {
                    View view2 = this.A02;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    Spinner spinner = this.A09;
                    if (spinner != null) {
                        Context requireContext = requireContext();
                        Q8C A0I = A0I();
                        spinner.setOnItemSelectedListener(new C63531Soy(A0I));
                        spinner.setAdapter((SpinnerAdapter) new C58722Q4y(requireContext, A0I));
                    }
                } else {
                    Spinner spinner2 = this.A09;
                    if (spinner2 != null) {
                        spinner2.setVisibility(8);
                    }
                    View view3 = this.A02;
                    if (view3 != null && (cardDetails = (CardDetails) A0I().A05.A02()) != null) {
                        SXX.A00.A00(getContext(), view3, cardDetails);
                    }
                }
                FragmentActivity requireActivity = requireActivity();
                InterfaceC16660sJ interfaceC16660sJ = ((QE4) this).A03;
                if (interfaceC16660sJ != null) {
                    szo = (SZO) interfaceC16660sJ.invoke("CLICKED_LEARN_MORE");
                } else {
                    szo = null;
                }
                AbstractC63046SbQ.A00(requireActivity, ((QE4) this).A00, view, null, ((QE4) this).A01, szo, 2131966018, R.id.disclosure_stub, 2131953420, true);
                EditText editText = this.A05;
                if (editText != null) {
                    C63480Snt.A00(editText, new C65075Td4(this, 8), 1);
                }
                EditText editText2 = this.A05;
                if (editText2 != null) {
                    editText2.setOnEditorActionListener(new C63536Sp3(this, 1));
                }
                Button button = this.A04;
                if (button != null) {
                    ViewOnClickListenerC63508Sob.A01(button, 5, this);
                }
                AbstractC58321PtD.A1H(this);
                ScrollView scrollView = this.A08;
                if (scrollView != null && (A01 = BottomSheetBehavior.A01(scrollView)) != null) {
                    A01.A0W(3);
                    A01.A0a(new C60730ROp(this, 0));
                }
                AbstractC31180DnO.A1F(this, A0I().A04, new C65076Td9(20, this, view), 0);
                C63628Sqa.A02(this, A0I().A03, 10);
                AbstractC31180DnO.A1F(this, A0I().A05, new C65075Td4(this, 7), 0);
                C0f9.A09(2034739478, A02);
                return;
            }
        }
        NullPointerException A15 = AbstractC166987dD.A15("Activity cannot be null");
        C0f9.A09(-1402205123, A02);
        throw A15;
    }

    @Override // X.Q7i, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(756272796);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View view = this.A01;
        C0f9.A09(2079356840, A02);
        return view;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1994850746);
        super.onDestroyView();
        this.A01 = null;
        this.A0B = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A06 = null;
        this.A0A = null;
        Spinner spinner = this.A09;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(null);
        }
        Spinner spinner2 = this.A09;
        if (spinner2 != null) {
            spinner2.setAdapter((SpinnerAdapter) null);
        }
        this.A09 = null;
        this.A02 = null;
        C0f9.A09(1886998339, A02);
    }
}
