package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes11.dex */
public final class UB5 extends ArrayAdapter {
    public Integer A00;
    public Integer A01;
    public final LayoutInflater A02;

    public UB5(Context context, List list) {
        super(context, 0, list);
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC05810Sj.A00(systemService);
        this.A02 = (LayoutInflater) systemService;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return A00(view, viewGroup, i, true);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return A00(view, viewGroup, i, false);
    }

    private TextView A00(View view, ViewGroup viewGroup, int i, boolean z) {
        Integer num;
        C68900Vdx c68900Vdx = (C68900Vdx) getItem(i);
        boolean z2 = false;
        if (view == null) {
            int i2 = R.layout.simple_spinner_item;
            if (z) {
                i2 = R.layout.simple_spinner_dropdown_item;
            }
            view = this.A02.inflate(i2, viewGroup, false);
            view.setTag(((TextView) view).getTextColors());
            z2 = true;
        }
        TextView textView = (TextView) view;
        textView.setText(c68900Vdx.A01);
        if ((!z && (num = this.A01) != null) || (num = c68900Vdx.A00) != null) {
            textView.setTextColor(num.intValue());
        } else if (textView.getTag() != null && !z2) {
            textView.setTextColor((ColorStateList) textView.getTag());
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            textView.setBackgroundColor(num2.intValue());
        }
        return textView;
    }
}
