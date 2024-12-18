package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.facebook.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UGn extends C2UU {
    public final int A00;
    public final Context A01;
    public final CalendarConstraints A02;
    public final DateSelector A03;
    public final X83 A04;

    public final int A00(Month month) {
        Month month2 = this.A02.A05;
        if (month2.A05 instanceof GregorianCalendar) {
            return ((month.A04 - month2.A04) * 12) + (month.A03 - month2.A03);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final Month A01(int i) {
        Calendar A01 = W8R.A01(this.A02.A05.A05);
        A01.add(2, i);
        return new Month(A01);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        UIR uir = (UIR) c3oo;
        CalendarConstraints calendarConstraints = this.A02;
        Calendar A01 = W8R.A01(calendarConstraints.A05.A05);
        A01.add(2, i);
        Month month = new Month(A01);
        uir.A00.setText(month.A01(uir.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uir.A01.findViewById(R.id.month_grid);
        if (materialCalendarGridView.A00() != null && month.equals(materialCalendarGridView.A00().A04)) {
            materialCalendarGridView.invalidate();
            UBE A00 = materialCalendarGridView.A00();
            Iterator it = A00.A01.iterator();
            while (it.hasNext()) {
                UBE.A01(materialCalendarGridView, A00, MSY.A07(it));
            }
            DateSelector dateSelector = A00.A03;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.BsY().iterator();
                while (it2.hasNext()) {
                    UBE.A01(materialCalendarGridView, A00, MSY.A07(it2));
                }
                A00.A01 = dateSelector.BsY();
            }
        } else {
            UBE ube = new UBE(calendarConstraints, this.A03, month);
            materialCalendarGridView.setNumColumns(month.A02);
            materialCalendarGridView.setAdapter((ListAdapter) ube);
        }
        materialCalendarGridView.setOnItemClickListener(new C70258WOd(2, this, materialCalendarGridView));
    }

    public UGn(Context context, CalendarConstraints calendarConstraints, DateSelector dateSelector, X83 x83) {
        int i;
        Month month = calendarConstraints.A05;
        Month month2 = calendarConstraints.A04;
        Month month3 = calendarConstraints.A00;
        Calendar calendar = month.A05;
        Calendar calendar2 = month3.A05;
        if (calendar.compareTo(calendar2) <= 0) {
            if (calendar2.compareTo(month2.A05) <= 0) {
                int dimensionPixelSize = UBE.A05 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                if (AbstractC66384UEs.A01(context)) {
                    i = AbstractC166997dE.A04(context, R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.A01 = context;
                this.A00 = dimensionPixelSize + i;
                this.A02 = calendarConstraints;
                this.A03 = dateSelector;
                this.A04 = x83;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1635892790);
        int i = this.A02.A01;
        C0f9.A0A(1134934352, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-342805615);
        Calendar A01 = W8R.A01(this.A02.A05.A05);
        A01.add(2, i);
        long timeInMillis = new Month(A01).A05.getTimeInMillis();
        C0f9.A0A(-1180910222, A03);
        return timeInMillis;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        boolean z = false;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (AbstractC66384UEs.A01(context)) {
            linearLayout.setLayoutParams(new C3OP(-1, this.A00));
            z = true;
        }
        return new UIR(linearLayout, z);
    }
}
