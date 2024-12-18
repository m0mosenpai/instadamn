package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes6.dex */
public final class EJZ extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ActivityCenterDatePickerFragment";
    public GregorianCalendar A00;
    public TextView A01;
    public String A03;
    public final Calendar A06 = Calendar.getInstance();
    public final DateFormat A05 = DateFormat.getDateInstance(1, C1Q2.A02());
    public UserSession A02;
    public final AbstractC18680vv A04 = this.A02;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35682FpH.A00(this, 53), AbstractC31176DnK.A0I(), interfaceC56362iU);
        ?? obj = new Object();
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F(DialogModule.KEY_TITLE);
            throw C00O.createAndThrow();
        }
        obj.A02 = str;
        C31722DwR.A01(ViewOnClickListenerC35682FpH.A00(this, 54), interfaceC56362iU, obj);
    }

    public static final void A00(EJZ ejz) {
        TextView textView = ejz.A01;
        String str = "dateTextView";
        if (textView != null) {
            DateFormat dateFormat = ejz.A05;
            GregorianCalendar gregorianCalendar = ejz.A00;
            if (gregorianCalendar == null) {
                str = "selectedDate";
            } else {
                textView.setText(dateFormat.format(Long.valueOf(gregorianCalendar.getTimeInMillis())));
                Context requireContext = ejz.requireContext();
                TextView textView2 = ejz.A01;
                if (textView2 != null) {
                    AbstractC31177DnL.A0z(textView2, requireContext);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "select_date";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Resources A0N;
        int i;
        int A02 = C0f9.A02(1310106775);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        String string = requireArguments.getString(AbstractC111324zv.A00(368));
        if (string != null) {
            if (string.equals("start_title")) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131974375;
            } else if (string.equals("end_title")) {
                A0N = AbstractC166997dE.A0N(this);
                i = 2131961851;
            }
            this.A03 = A0N.getString(i);
            int i2 = requireArguments.getInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            this.A00 = gregorianCalendar;
            gregorianCalendar.setTimeInMillis(i2 * 1000);
            C0f9.A09(-1290924667, A02);
        }
        A0N = AbstractC166997dE.A0N(this);
        i = 2131973232;
        this.A03 = A0N.getString(i);
        int i22 = requireArguments.getInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS");
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        this.A00 = gregorianCalendar2;
        gregorianCalendar2.setTimeInMillis(i22 * 1000);
        C0f9.A09(-1290924667, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(722879113);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_select_date, viewGroup, false);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.select_date_text_view);
        A00(this);
        DatePicker datePicker = (DatePicker) AbstractC166997dE.A0R(inflate, R.id.select_date_picker);
        datePicker.setMaxDate(this.A06.getTimeInMillis());
        GregorianCalendar gregorianCalendar = this.A00;
        if (gregorianCalendar != null) {
            int i = gregorianCalendar.get(1);
            GregorianCalendar gregorianCalendar2 = this.A00;
            if (gregorianCalendar2 != null) {
                int i2 = gregorianCalendar2.get(2);
                GregorianCalendar gregorianCalendar3 = this.A00;
                if (gregorianCalendar3 != null) {
                    datePicker.init(i, i2, AbstractC31173DnH.A05(gregorianCalendar3), new C35746Fqe(this, 2));
                    C0f9.A09(1864753333, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F("selectedDate");
        throw C00O.createAndThrow();
    }
}
