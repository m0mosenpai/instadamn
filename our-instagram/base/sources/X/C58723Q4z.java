package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Q4z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58723Q4z extends BaseAdapter implements Filterable {
    public List A00;
    public final Context A01;
    public final LayoutInflater A02;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        C14360o3.A0B(viewGroup, 2);
        SBi sBi = (SBi) this.A00.get(i);
        Context context = this.A01;
        LayoutInflater layoutInflater = this.A02;
        if (sBi instanceof R8V) {
            R8V r8v = (R8V) sBi;
            AbstractC167007dF.A1K(context, layoutInflater);
            View view2 = view;
            if (view == null) {
                View inflate = layoutInflater.inflate(R.layout.fbpay_auto_complete_item, viewGroup, false);
                C14360o3.A0A(inflate);
                AbstractC70177WFc.A02(inflate, 4, 11, 11, 4);
                TextView A0N = AbstractC167007dF.A0N(inflate, R.id.auto_complete_title);
                TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.auto_complete_subtitle);
                View A0S = AbstractC166997dE.A0S(inflate, R.id.auto_complete_divider);
                WF7.A02(A0N, VEP.A05);
                WF7.A02(A0N2, VEP.A06);
                C2FP.A0A();
                AbstractC31174DnI.A1C(A0S, context.getColor(R.color.igds_separator));
                view2 = inflate;
            }
            ViewOnClickListenerC63508Sob.A01(view2, 28, r8v);
            TextView A0N3 = AbstractC167007dF.A0N(view2, R.id.auto_complete_title);
            TextView A0N4 = AbstractC167007dF.A0N(view2, R.id.auto_complete_subtitle);
            View A0S2 = AbstractC166997dE.A0S(view2, R.id.auto_complete_divider);
            List list = r8v.A04;
            String str2 = r8v.A02;
            CharSequence charSequence = str2;
            if (list != null) {
                charSequence = R8V.A00(str2, list);
            }
            A0N3.setText(charSequence);
            String str3 = r8v.A01;
            int i2 = 0;
            if (str3 != null) {
                A0N4.setVisibility(0);
                List list2 = r8v.A03;
                CharSequence charSequence2 = str3;
                if (list2 != null) {
                    charSequence2 = R8V.A00(str3, list2);
                }
                A0N4.setText(charSequence2);
            } else {
                A0N4.setVisibility(8);
            }
            if (i <= 0) {
                i2 = 8;
            }
            A0S2.setVisibility(i2);
            return view2;
        }
        if (sBi instanceof R8U) {
            R8U r8u = (R8U) sBi;
            int i3 = 0;
            AbstractC167007dF.A1K(context, layoutInflater);
            View view3 = view;
            if (view == null) {
                View inflate2 = layoutInflater.inflate(R.layout.fbpay_auto_complete_user_action_item, viewGroup, false);
                TextView A0N5 = AbstractC167007dF.A0N(inflate2, R.id.auto_complete_user_action);
                View A0S3 = AbstractC166997dE.A0S(inflate2, R.id.auto_complete_divider);
                WF7.A02(A0N5, VEP.A1G);
                C2FP.A0A();
                AbstractC31174DnI.A1C(A0S3, context.getColor(R.color.igds_separator));
                view3 = inflate2;
            }
            ViewOnClickListenerC63508Sob.A01(view3, 27, r8u);
            TextView A0N6 = AbstractC167007dF.A0N(view3, R.id.auto_complete_user_action);
            AbstractC166987dD.A1P(context, A0N6, 2131961316);
            ImageView imageView = (ImageView) AbstractC166997dE.A0R(view3, R.id.auto_complete_icon);
            C0fQ.A00(ViewOnClickListenerC63506SoZ.A00, imageView);
            C2FP.A0A();
            if (AbstractC72723Nt.A00(context)) {
                str = r8u.A01;
            } else {
                str = r8u.A02;
            }
            if (str != null) {
                imageView.setVisibility(0);
                C2FP.A0G().A00(str, "AttributionLabel").A02(imageView);
            } else {
                imageView.setVisibility(8);
                i3 = context.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right);
            }
            A0N6.setPadding(A0N6.getPaddingLeft(), A0N6.getPaddingTop(), A0N6.getPaddingRight(), i3);
            return view3;
        }
        AbstractC167017dG.A1N(context, layoutInflater);
        View view4 = view;
        if (view == null) {
            View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fbpay_auto_complete_prompt);
            C14360o3.A0C(A0A, AbstractC111324zv.A00(3));
            TextView textView = (TextView) A0A;
            WF7.A02(textView, VEP.A06);
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setEnabled(false);
            view4 = textView;
        }
        C14360o3.A0C(view4, AbstractC111324zv.A00(3));
        TextView textView2 = (TextView) view4;
        AbstractC166987dD.A1P(context, textView2, 2131961322);
        return textView2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return C05F.A00(3).length;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new Q53(this);
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Integer num;
        SBi sBi = (SBi) this.A00.get(i);
        if (sBi instanceof R8V) {
            num = ((R8V) sBi).A00;
        } else if (sBi instanceof R8U) {
            num = ((R8U) sBi).A00;
        } else {
            num = ((R8T) sBi).A00;
        }
        return AbstractC50522MSa.A03(num.intValue());
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        SBi sBi = (SBi) this.A00.get(i);
        if (!(sBi instanceof R8V) && !(sBi instanceof R8U)) {
            return false;
        }
        return true;
    }

    public C58723Q4z(Context context, List list) {
        this.A01 = context;
        this.A00 = list == null ? C16930sl.A00 : list;
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        this.A02 = from;
    }
}
