package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q4x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58721Q4x extends ArrayAdapter {
    public final InterfaceC65291ThO A00;
    public final ArrayList A01;
    public final DirectThreadWidgetItem A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58721Q4x(Context context, DirectThreadWidgetItem directThreadWidgetItem, InterfaceC65291ThO interfaceC65291ThO, List list) {
        super(context, R.layout.direct_recipient_search_row, list);
        C14360o3.A0B(list, 1);
        this.A00 = interfaceC65291ThO;
        this.A02 = directThreadWidgetItem;
        this.A01 = AbstractC166987dD.A1F(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.SJ6, java.lang.Object] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        SJ6 sj6;
        AbstractRunnableC14200nk rcQ;
        C14360o3.A0B(viewGroup, 2);
        int i2 = 0;
        if (view == null) {
            ?? obj = new Object();
            LayoutInflater from = LayoutInflater.from(getContext());
            C14360o3.A07(from);
            View inflate = from.inflate(R.layout.direct_recipient_search_row, viewGroup, false);
            obj.A05 = AbstractC166987dD.A0e(inflate, R.id.fullname);
            obj.A06 = AbstractC166987dD.A0e(inflate, R.id.username);
            obj.A04 = AbstractC31171DnF.A08(inflate, R.id.select_chat_indicator);
            obj.A03 = AbstractC31171DnF.A08(inflate, R.id.profile_picture);
            obj.A00 = (ViewGroup) inflate.findViewById(R.id.group_picture);
            obj.A01 = AbstractC31171DnF.A08(inflate, R.id.back_picture);
            obj.A02 = AbstractC31171DnF.A08(inflate, R.id.front_picture);
            inflate.setTag(obj);
            sj6 = obj;
            view2 = inflate;
        } else {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.appwidget.RecipientSearchRowAdapter.ViewHolder");
            sj6 = (SJ6) tag;
            view2 = view;
        }
        DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) getItem(i);
        if (directThreadWidgetItem != null) {
            TextView textView = sj6.A05;
            if (textView != null) {
                textView.setText(directThreadWidgetItem.A04);
            }
            TextView textView2 = sj6.A06;
            if (textView2 != null) {
                textView2.setText(directThreadWidgetItem.A05);
            }
            if (directThreadWidgetItem.A01 == null) {
                ViewGroup viewGroup2 = sj6.A00;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                ImageView imageView = sj6.A03;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                rcQ = new RcP(directThreadWidgetItem, sj6, this);
            } else {
                ImageView imageView2 = sj6.A03;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                ViewGroup viewGroup3 = sj6.A00;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                rcQ = new RcQ(directThreadWidgetItem, sj6, this);
            }
            C14120nc.A00().ATO(rcQ);
            ImageView imageView3 = sj6.A04;
            if (imageView3 != null) {
                imageView3.setColorFilter(getContext().getColor(R.color.badge_color), PorterDuff.Mode.SRC_ATOP);
            }
            ImageView imageView4 = sj6.A04;
            if (imageView4 != null) {
                if (!C14360o3.A0K(this.A02, directThreadWidgetItem)) {
                    i2 = 4;
                }
                imageView4.setVisibility(i2);
            }
            ViewOnClickListenerC63509Soc.A00(view2, 27, this, directThreadWidgetItem);
        }
        return view2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new Q54(this);
    }
}
