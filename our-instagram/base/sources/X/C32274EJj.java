package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.EJj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32274EJj extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditBirthdayFragment";
    public UserSession A00;
    public String A01;
    public GregorianCalendar A02;
    public boolean A03;
    public TextView A04;
    public ActionButton A05;
    public final Calendar A08 = Calendar.getInstance();
    public final SimpleDateFormat A07 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public final DateFormat A06 = DateFormat.getDateInstance(1, C1Q2.A02());

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_birthday";
    }

    public static void A00(InterfaceC56362iU interfaceC56362iU, C32274EJj c32274EJj) {
        UserSession userSession = c32274EJj.A00;
        int i = c32274EJj.A02.get(1);
        int i2 = c32274EJj.A02.get(2) + 1;
        int A05 = AbstractC31173DnH.A05(c32274EJj.A02);
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        C1ON A0K = AbstractC31178DnM.A0K(A0C, "day", AbstractC31181DnP.A0G(A0C, "accounts/set_birthday/", i, i2, A05));
        C31456Ds0.A00(A0K, c32274EJj, interfaceC56362iU, 40);
        c32274EJj.schedule(A0K);
    }

    public static void A01(C32274EJj c32274EJj) {
        TextView textView = c32274EJj.A04;
        textView.getClass();
        textView.setText(c32274EJj.A06.format(Long.valueOf(c32274EJj.A02.getTimeInMillis())));
        Context requireContext = c32274EJj.requireContext();
        boolean A1S = AbstractC31175DnJ.A1S((c32274EJj.A02.getTimeInMillis() > AbstractC34826FWh.A00(5) ? 1 : (c32274EJj.A02.getTimeInMillis() == AbstractC34826FWh.A00(5) ? 0 : -1)));
        TextView textView2 = c32274EJj.A04;
        int i = R.attr.igds_color_secondary_text;
        if (A1S) {
            i = R.attr.igds_color_primary_text;
        }
        AbstractC31177DnL.A0q(requireContext, textView2, i);
        ActionButton actionButton = c32274EJj.A05;
        if (actionButton != null) {
            actionButton.setEnabled(A1S);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C62862tP A0N = AbstractC31172DnG.A0N(this, this.A00);
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 17), AbstractC31176DnK.A0I(), interfaceC56362iU);
        ?? obj = new Object();
        C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131953820);
        ActionButton A00 = C31722DwR.A00(new ViewOnClickListenerC35684FpJ(43, this, A0N, interfaceC56362iU), interfaceC56362iU, obj);
        this.A05 = A00;
        A00.setEnabled(AbstractC31175DnJ.A1S((this.A02.getTimeInMillis() > AbstractC34826FWh.A00(5) ? 1 : (this.A02.getTimeInMillis() == AbstractC34826FWh.A00(5) ? 0 : -1))));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1487368457);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A03 = requireArguments.containsKey("EditBirthdayFragment.ARG_BIRTHDAY_YEAR");
        Calendar calendar = this.A08;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(requireArguments.getInt("EditBirthdayFragment.ARG_BIRTHDAY_YEAR", calendar.get(1) - 1), requireArguments.getInt("EditBirthdayFragment.ARG_BIRTHDAY_MONTH", calendar.get(2)), requireArguments.getInt("EditBirthdayFragment.ARG_BIRTHDAY_DAY", AbstractC31173DnH.A05(calendar)));
        this.A02 = gregorianCalendar;
        this.A01 = this.A07.format(gregorianCalendar.getTime());
        C0f9.A09(314973781, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-854757902);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_birthday, viewGroup, false);
        this.A04 = AbstractC166997dE.A0T(inflate, R.id.birthday_text_view);
        A01(this);
        DatePicker datePicker = (DatePicker) inflate.requireViewById(R.id.birthday_date_picker);
        datePicker.setMaxDate(this.A08.getTimeInMillis());
        datePicker.init(this.A02.get(1), this.A02.get(2), AbstractC31173DnH.A05(this.A02), new C35746Fqe(this, 1));
        UserSession userSession = this.A00;
        String str = this.A01;
        InterfaceC02590Ai A0E = AbstractC31178DnM.A0E(userSession);
        if (A0E.isSampled()) {
            AbstractC31178DnM.A1D(A0E, "date_picker_impression", str);
        }
        C0f9.A09(76186420, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1914590707);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        C0f9.A09(-955745319, A02);
    }
}
