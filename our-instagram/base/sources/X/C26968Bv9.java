package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import com.facebook.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Bv9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26968Bv9 extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        C14360o3.A0B(context, 0);
        return AbstractC25226BEj.A0R(LayoutInflater.from(context), null, R.layout.date_picker_spinner, false);
    }

    @Override // X.AbstractC65806TuP
    public final void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        DatePicker datePicker = (DatePicker) view;
        datePicker.init(0, 0, 0, null);
        datePicker.setMinDate(0L);
        datePicker.setMaxDate(Long.MAX_VALUE);
    }

    @Override // X.AbstractC65806TuP
    public final Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        long j;
        boolean A1R = AbstractC167007dF.A1R(0, view, c6fg);
        C14360o3.A0B(c102884kP, 2);
        DatePicker datePicker = (DatePicker) view;
        InterfaceC103384lE A0A = c102884kP.A0A();
        C102884kP A08 = c102884kP.A08(40);
        long j2 = 0;
        if (A08 != null) {
            j = A08.A04(44, 0L);
            j2 = A08.A04(48, 0L);
        } else {
            j = 0;
        }
        long j3 = 9223372036854775L;
        if (A08 != null) {
            j3 = A08.A04(49, 9223372036854775L);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j * 1000));
        datePicker.init(calendar.get(A1R ? 1 : 0), calendar.get(2), calendar.get(5), new C28695Cln(c6fg, c102884kP, A0A, 0));
        datePicker.setMinDate(j2 * 1000);
        datePicker.setMaxDate(j3 * 1000);
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }

    public C26968Bv9(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
