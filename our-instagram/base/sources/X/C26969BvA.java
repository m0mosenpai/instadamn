package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import com.facebook.R;
import java.util.Calendar;

/* renamed from: X.BvA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26969BvA extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        C14360o3.A0B(context, 0);
        return AbstractC25226BEj.A0R(LayoutInflater.from(context), null, R.layout.date_picker_spinner, false);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        Calendar calendar = Calendar.getInstance();
        ((DatePicker) view).init(calendar.get(1), calendar.get(2), calendar.get(5), null);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        boolean A1a = AbstractC167017dG.A1a(view, c6fg);
        C14360o3.A0B(c102884kP, 2);
        DatePicker datePicker = (DatePicker) view;
        InterfaceC103384lE A0A = c102884kP.A0A();
        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(A1a ? 1 : 0), calendar.get(2), calendar.get(5), new C28695Cln(c6fg, c102884kP, A0A, A1a ? 1 : 0));
        datePicker.setMaxDate(Calendar.getInstance().getTimeInMillis());
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }

    public C26969BvA(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
