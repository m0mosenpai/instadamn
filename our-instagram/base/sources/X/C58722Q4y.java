package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import com.facebook.R;
import com.fbpay.w3c.CardDetails;

/* renamed from: X.Q4y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58722Q4y extends ArrayAdapter {
    public final Q8C A00;
    public final LayoutInflater A01;

    public C58722Q4y(Context context, Q8C q8c) {
        super(context, 0, q8c.A0A);
        this.A00 = q8c;
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        this.A01 = from;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC31172DnG.A0A(this.A01, viewGroup, R.layout.layout_iab_autofill_dropdown_list_item);
            C14360o3.A07(view);
        }
        Q8C q8c = this.A00;
        CardDetails cardDetails = (CardDetails) q8c.A0A.get(i);
        SXX.A00.A00(getContext(), view, cardDetails);
        ((CompoundButton) view.findViewById(R.id.radio_button)).setChecked(C14360o3.A0K(cardDetails, q8c.A05.A02()));
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC31172DnG.A0A(this.A01, viewGroup, R.layout.layout_iab_autofill_dropdown_list);
            C14360o3.A07(view);
        }
        SXX.A00.A00(getContext(), view, (CardDetails) this.A00.A0A.get(i));
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.A00.A0A.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.A0A.get(i);
    }
}
