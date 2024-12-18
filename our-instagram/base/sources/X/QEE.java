package X;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.views.AutofillTextInputLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class QEE extends QE4 {
    public Intent A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public EditText A05;
    public EditText A06;
    public FrameLayout A07;
    public LinearLayout A08;
    public ScrollView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public Q8D A0D;
    public AutofillTextInputLayout A0E;
    public AutofillTextInputLayout A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public String A0J;

    public final Intent A0H(CardDetails cardDetails, W39 w39, Integer num, Long l, Long l2, Long l3, Long l4, String str) {
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
        A04.putExtra("numberOfCVVFailures", A0I().A05.size());
        if (A0I().A05.size() > 0) {
            List list = A0I().A05;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC63064Sbl.A02(A0q, it);
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append('(');
            A04.putExtra("cvvFailures", AbstractC167017dG.A0o(A0q, A1C));
        }
        if (A0I().A0F != null) {
            A04.putExtra("qplInstanceKey", A0I().A0F);
        }
        if (l3 != null) {
            A04.putExtra("timeInMsDemaskCardStart", l3.longValue());
        }
        if (l4 != null) {
            A04.putExtra("timeInMsDemaskCardEnd", l4.longValue());
        }
        A04.putExtra("timeInMsDemaskFragmentActivityCreated", A0I().A00);
        EnumC61075Rep enumC61075Rep = (EnumC61075Rep) A0I().A09.A02();
        if (enumC61075Rep == null) {
            A06 = -1;
        } else {
            A06 = AbstractC58318PtA.A06(enumC61075Rep, S6G.A00);
        }
        int[] iArr = S6G.A00;
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

    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C63380Siu c63380Siu;
        int i;
        C14360o3.A0B(dialogInterface, 0);
        WeakReference weakReference = ((QE4) this).A02;
        if (weakReference != null && (c63380Siu = (C63380Siu) weakReference.get()) != null) {
            Integer num = this.A0G;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Intent intent = this.A00;
            if (intent == null) {
                intent = A0H(null, null, C05F.A0C, null, null, null, null, null);
            }
            c63380Siu.A0E(i, intent);
        }
        dialogInterface.cancel();
    }

    public static final void A01(QEE qee, W39 w39, String str, String str2, String str3) {
        Button button = qee.A03;
        if (button != null) {
            button.setEnabled(false);
        }
        AlertDialog.Builder message = new AlertDialog.Builder(qee.getActivity()).setTitle(str).setMessage(str2);
        String str4 = qee.A0H;
        if (str4 != null) {
            message.setPositiveButton(str4, new DialogInterfaceOnClickListenerC63422Sk0(w39, qee, str3, 3)).show();
        } else {
            C14360o3.A0F("okButtonText");
            throw C00O.createAndThrow();
        }
    }

    public final Q8D A0I() {
        Q8D q8d = this.A0D;
        if (q8d != null) {
            return q8d;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        BottomSheetBehavior A01;
        int A02 = C0f9.A02(1839255390);
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            C14360o3.A07(application);
            Q8D q8d = (Q8D) new C52942bb(new C58775Q8i(application, this.mArguments), this).A00(Q8D.class);
            C14360o3.A0B(q8d, 0);
            this.A0D = q8d;
            View view = this.A01;
            if (view != null) {
                EditText editText = this.A06;
                if (editText != null) {
                    C63480Snt.A00(editText, new C65075Td4(this, 9), 2);
                }
                EditText editText2 = this.A05;
                if (editText2 != null) {
                    C63480Snt.A00(editText2, new C65075Td4(this, 10), 2);
                }
                EditText editText3 = this.A05;
                if (editText3 != null) {
                    editText3.setOnEditorActionListener(new C63536Sp3(this, 2));
                }
                Button button = this.A03;
                if (button != null) {
                    ViewOnClickListenerC63508Sob.A01(button, 6, this);
                }
                Button button2 = this.A04;
                if (button2 != null) {
                    ViewOnClickListenerC63508Sob.A01(button2, 7, this);
                }
                ScrollView scrollView = this.A09;
                if (scrollView != null && (A01 = BottomSheetBehavior.A01(scrollView)) != null) {
                    A01.A0W(3);
                    A01.A0a(new C60730ROp(this, 1));
                }
                C63628Sqa.A02(this, A0I().A09, 13);
                AbstractC31180DnO.A1F(this, A0I().A08, new C65076Td9(21, this, view), 2);
                C63628Sqa.A02(this, A0I().A07, 14);
                C0f9.A09(-242965947, A02);
                return;
            }
        }
        NullPointerException A15 = AbstractC166987dD.A15("Activity cannot be null");
        C0f9.A09(-1502448390, A02);
        throw A15;
    }

    @Override // X.Q7i, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1750966822);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View view = this.A01;
        C0f9.A09(1627103206, A02);
        return view;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1701097344);
        super.onDestroyView();
        this.A01 = null;
        this.A0C = null;
        this.A0A = null;
        this.A06 = null;
        this.A0F = null;
        this.A05 = null;
        this.A0E = null;
        this.A03 = null;
        this.A08 = null;
        this.A02 = null;
        this.A09 = null;
        this.A07 = null;
        this.A04 = null;
        this.A0B = null;
        C0f9.A09(-901989299, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
