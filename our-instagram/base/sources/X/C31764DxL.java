package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.facebook.R;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DxL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31764DxL extends ArrayAdapter {
    public final ArrayList A00;
    public final List A01;
    public final Context A02;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            Context context = this.A02;
            view = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.row_menu_item);
            view.setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.elevatedBackgroundDrawable));
            view.setPadding(0, 0, 0, 0);
        }
        AbstractC166997dE.A0T(view, R.id.row_simple_text_textview).setText(((CountryCodeData) getItem(i)).A01());
        return view;
    }

    public C31764DxL(Context context, List list) {
        super(context, R.layout.row_menu_item, list);
        this.A02 = context;
        this.A01 = list;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = A1E;
        A1E.addAll(list);
    }
}
