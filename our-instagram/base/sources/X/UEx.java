package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class UEx extends Fragment {
    public View A00;
    public View A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public CalendarConstraints A04;
    public C69410Vmu A05;
    public DateSelector A06;
    public Month A07;
    public Integer A08;
    public int A09;
    public final LinkedHashSet A0A = new LinkedHashSet();
    public static final Object A0B = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0D = "NAVIGATION_PREV_TAG";
    public static final Object A0C = "NAVIGATION_NEXT_TAG";
    public static final Object A0E = "SELECTOR_TOGGLE_TAG";

    public final void A00(Month month) {
        RecyclerView recyclerView = this.A02;
        UGn uGn = (UGn) recyclerView.A0A;
        int A00 = uGn.A00(month);
        int A002 = A00 - uGn.A00(this.A07);
        boolean z = true;
        boolean A1S = AbstractC25230BEn.A1S(Math.abs(A002), 3);
        if (A002 <= 0) {
            z = false;
        }
        this.A07 = month;
        if (A1S) {
            int i = A00 + 3;
            if (z) {
                i = A00 - 3;
            }
            recyclerView.A0n(i);
        }
        this.A02.post(new RunnableC71464WuQ(this, A00));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A09);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.A06);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A04);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1119060977);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        this.A09 = bundle.getInt("THEME_RES_ID_KEY");
        this.A06 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A04 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.A07 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        C0f9.A09(505573587, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-299430201);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.A09);
        this.A05 = new C69410Vmu(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.A04.A05;
        boolean A01 = AbstractC66384UEs.A01(contextThemeWrapper);
        int i = R.layout.mtrl_calendar_horizontal;
        int i2 = 0;
        if (A01) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        AbstractC010103p.A0B(gridView, new UEP(this, 4));
        gridView.setAdapter((ListAdapter) new UB8());
        gridView.setNumColumns(month.A02);
        gridView.setEnabled(false);
        this.A02 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.A02.setLayoutManager(new UGP(getContext(), this, i2, i2));
        this.A02.setTag("MONTHS_VIEW_GROUP_TAG");
        UGn uGn = new UGn(contextThemeWrapper, this.A04, this.A06, new WcR(this));
        this.A02.setAdapter(uGn);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mk_title_max_lines);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0S = true;
            recyclerView.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.A03.setAdapter(new UGV(this));
            this.A03.A10(new UH7(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            textView.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC010103p.A0B(textView, new UEP(this, 5));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A01 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.A00 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            this.A08 = C05F.A00;
            this.A01.setVisibility(8);
            this.A00.setVisibility(0);
            A00(this.A07);
            textView.setText(this.A07.A01(inflate.getContext()));
            this.A02.A14(new UHO(0, textView, this, uGn));
            WNN.A00(textView, 49, this);
            WNV.A00(findViewById2, 28, this, uGn);
            WNV.A00(findViewById, 29, this, uGn);
        }
        if (!AbstractC66384UEs.A01(contextThemeWrapper)) {
            new C61792rg().A07(this.A02);
        }
        this.A02.A0n(uGn.A00(this.A07));
        C0f9.A09(1761182305, A02);
        return inflate;
    }
}
