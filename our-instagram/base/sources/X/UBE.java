package X;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class UBE extends BaseAdapter {
    public static final int A05 = AbstractC65702TsY.A0l().getMaximum(4);
    public C69410Vmu A00;
    public Collection A01;
    public final CalendarConstraints A02;
    public final DateSelector A03;
    public final Month A04;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    private void A00(TextView textView, long j) {
        W4X w4x;
        if (textView != null) {
            if (this.A02.A03.CfP(j)) {
                textView.setEnabled(true);
                Iterator it = this.A03.BsY().iterator();
                while (true) {
                    if (it.hasNext()) {
                        long A07 = MSY.A07(it);
                        Calendar A0l = AbstractC65702TsY.A0l();
                        A0l.setTimeInMillis(j);
                        long timeInMillis = W8R.A01(A0l).getTimeInMillis();
                        Calendar A0l2 = AbstractC65702TsY.A0l();
                        A0l2.setTimeInMillis(A07);
                        if (timeInMillis == W8R.A01(A0l2).getTimeInMillis()) {
                            w4x = this.A00.A03;
                            break;
                        }
                    } else {
                        long timeInMillis2 = W8R.A00().getTimeInMillis();
                        C69410Vmu c69410Vmu = this.A00;
                        if (timeInMillis2 == j) {
                            w4x = c69410Vmu.A05;
                        } else {
                            w4x = c69410Vmu.A01;
                        }
                    }
                }
            } else {
                textView.setEnabled(false);
                w4x = this.A00.A02;
            }
            w4x.A01(textView);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        Month month = this.A04;
        if (i >= month.A00() && i <= (month.A00() + month.A01) - 1) {
            int A00 = (i - month.A00()) + 1;
            Calendar A01 = W8R.A01(month.A05);
            A01.set(5, A00);
            return Long.valueOf(A01.getTimeInMillis());
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Month month = this.A04;
        return month.A01 + month.A00();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.A04.A02;
    }

    public UBE(CalendarConstraints calendarConstraints, DateSelector dateSelector, Month month) {
        this.A04 = month;
        this.A03 = dateSelector;
        this.A02 = calendarConstraints;
        this.A01 = dateSelector.BsY();
    }

    public static void A01(MaterialCalendarGridView materialCalendarGridView, UBE ube, long j) {
        Calendar A0l = AbstractC65702TsY.A0l();
        A0l.setTimeInMillis(j);
        Month month = new Month(A0l);
        Month month2 = ube.A04;
        if (month.equals(month2)) {
            W8R.A01(month2.A05).setTimeInMillis(j);
            ube.A00((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.A00().A04.A00() + (r1.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        Context context = viewGroup.getContext();
        if (this.A00 == null) {
            this.A00 = new C69410Vmu(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(context).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        Month month = this.A04;
        int A00 = i - month.A00();
        if (A00 >= 0 && A00 < month.A01) {
            int i2 = A00 + 1;
            textView.setTag(month);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", AbstractC25228BEl.A1Y(i2)));
            Calendar A01 = W8R.A01(month.A05);
            A01.set(5, i2);
            long timeInMillis = A01.getTimeInMillis();
            int i3 = month.A04;
            int i4 = new Month(W8R.A00()).A04;
            Locale locale = Locale.getDefault();
            if (i3 == i4) {
                str = "MMMEd";
            } else {
                str = "yMMMEd";
            }
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            textView.setVisibility(0);
            textView.setEnabled(true);
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item != null) {
            A00(textView, item.longValue());
        }
        return textView;
    }
}
