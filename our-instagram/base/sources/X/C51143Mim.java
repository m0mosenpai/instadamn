package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.Mim, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51143Mim extends C2UU {
    public final List A00 = AbstractC166987dD.A1E();
    public final /* synthetic */ OWd A01;

    public C51143Mim(OWd oWd) {
        this.A01 = oWd;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        View view;
        View.OnClickListener okD;
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        int itemViewType = getItemViewType(i);
        TextView textView = c51314Mlb.A02;
        if (itemViewType == 2) {
            textView.setText(2131972993);
            c51314Mlb.A01.setImageResource(R.drawable.search_location_small);
            view = c51314Mlb.A00;
            okD = new ViewOnClickListenerC55462OkH(this.A01, 8);
        } else {
            textView.setText(((Venue) this.A00.get(i)).A00.getName());
            ImageView imageView = c51314Mlb.A01;
            int i2 = 0;
            if (itemViewType == 1) {
                i2 = R.drawable.suggested_event_icon;
            }
            imageView.setImageResource(i2);
            view = c51314Mlb.A00;
            okD = new OkD(i, 4, this.A01, this);
        }
        C0fQ.A00(okD, view);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(-1206644797);
        List list = this.A00;
        if (list.isEmpty()) {
            size = 0;
        } else {
            size = list.size() + 1;
        }
        C0f9.A0A(370385708, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(1638733005);
        if (i > 0 && i == this.A00.size()) {
            i2 = 2;
            i3 = 216911207;
        } else {
            i2 = 0;
            i3 = -1270588140;
            if ("facebook_events".equals(((Venue) this.A00.get(i)).A03())) {
                i2 = 1;
                i3 = -454760471;
            }
        }
        C0f9.A0A(i3, A03);
        return i2;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C51314Mlb A01 = OOz.A01(viewGroup);
        A01.A02.setMaxWidth(this.A01.A03);
        return A01;
    }
}
