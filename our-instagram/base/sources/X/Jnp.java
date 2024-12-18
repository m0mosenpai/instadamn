package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jnp extends C2UU {
    public final Integer A00;
    public final Integer A01;
    public final List A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int applyDimension;
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        View inflate = LayoutInflater.from(A06).inflate(R.layout.primer_bottom_sheet_info_list_item, viewGroup, false);
        if (i == 0) {
            Resources A0M = AbstractC166997dE.A0M(A06);
            Integer num = this.A00;
            if (num != null) {
                applyDimension = A0M.getDimensionPixelSize(num.intValue());
            } else {
                applyDimension = (int) TypedValue.applyDimension(1, 24.0f, A0M.getDisplayMetrics());
            }
            inflate.setPadding(0, 0, 0, applyDimension);
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C44728JrB(inflate, this.A01);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44728JrB c44728JrB = (C44728JrB) c3oo;
        C14360o3.A0B(c44728JrB, 0);
        InfoItem infoItem = (InfoItem) this.A02.get(i);
        C14360o3.A0B(infoItem, 0);
        IconConfig iconConfig = infoItem.A00;
        if (iconConfig instanceof IconConfig.SimpleIconConfig) {
            View A0E = AbstractC31173DnH.A0E(c44728JrB.A00, R.layout.primer_bottom_sheet_info_list_simple_icon_layout);
            C14360o3.A0C(A0E, AbstractC111324zv.A00(69));
            ((ImageView) A0E).setImageResource(((IconConfig.SimpleIconConfig) iconConfig).A00);
        } else if (iconConfig instanceof IconConfig.IconWithTextConfig) {
            View A0E2 = AbstractC31173DnH.A0E(c44728JrB.A00, R.layout.primer_bottom_sheet_info_list_icon_with_text_layout);
            ViewGroup.LayoutParams layoutParams = A0E2.getLayoutParams();
            int dimensionPixelSize = AbstractC25228BEl.A0M(A0E2).getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            IconConfig.IconWithTextConfig iconWithTextConfig = (IconConfig.IconWithTextConfig) iconConfig;
            AbstractC31171DnF.A08(A0E2, R.id.icon_image).setImageResource(iconWithTextConfig.A00);
            AbstractC166987dD.A0e(A0E2, R.id.icon_text).setText(iconWithTextConfig.A01);
        }
        String str = infoItem.A02;
        String str2 = infoItem.A03;
        Integer num = infoItem.A01;
        Spanned fromHtml = Html.fromHtml(str, 0);
        C14360o3.A07(fromHtml);
        SpannableString valueOf = SpannableString.valueOf(fromHtml);
        TextView textView = c44728JrB.A01;
        AbstractC31176DnK.A1G(textView, Html.fromHtml(valueOf.toString(), 0));
        if (num != null) {
            AbstractC166987dD.A1O(textView.getContext(), textView, num.intValue());
        }
        Integer num2 = c44728JrB.A03;
        if (num2 != null) {
            textView.setTextAppearance(num2.intValue());
        }
        if (str2 != null && !AbstractC001900j.A0T(str2)) {
            TextView textView2 = c44728JrB.A02;
            textView2.setVisibility(0);
            textView2.setText(str2);
            return;
        }
        c44728JrB.A02.setVisibility(8);
    }

    public Jnp(Integer num, Integer num2, List list) {
        this.A02 = list;
        this.A00 = num;
        this.A01 = num2;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1812035177);
        int size = this.A02.size();
        C0f9.A0A(-985818905, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1699096627);
        int i2 = 1;
        if (i != this.A02.size() - 1) {
            i2 = 0;
        }
        C0f9.A0A(-381667709, A03);
        return i2;
    }
}
