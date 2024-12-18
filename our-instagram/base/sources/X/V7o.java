package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.discovery.related.model.RelatedItem;
import java.util.List;

/* loaded from: classes11.dex */
public final class V7o extends UGU {
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.related_item_item_view, viewGroup, false);
                if (!(inflate instanceof TextView) || (textView = (TextView) inflate) == null) {
                    throw new IllegalStateException("itemView should be a TextView");
                }
            } else {
                throw new IllegalArgumentException("Unsupported view type!");
            }
        } else {
            Context context = viewGroup.getContext();
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.related_item_label_view, viewGroup, false);
            if ((inflate2 instanceof TextView) && (textView = (TextView) inflate2) != null) {
                AbstractC31173DnH.A19(context.getResources(), textView, 2131972119);
            } else {
                throw new IllegalStateException("Label view should be a TextView");
            }
        }
        return new UI6(textView);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        RelatedItem relatedItem;
        UI6 ui6 = (UI6) c3oo;
        C14360o3.A0B(ui6, 0);
        if (getItemViewType(i) != 0 && (relatedItem = (RelatedItem) AbstractC001800i.A0O(this.A04, i - 1)) != null) {
            TextView textView = ui6.A00;
            textView.setText(relatedItem.A01());
            WNP.A00(textView, 44, relatedItem, this);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(-155193120);
        List list = this.A04;
        if (list.isEmpty()) {
            size = 0;
        } else {
            size = list.size() + 1;
        }
        C0f9.A0A(-2048745702, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(269912115);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        C0f9.A0A(720299112, A03);
        return i2;
    }
}
