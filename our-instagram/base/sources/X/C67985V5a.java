package X;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.V5a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67985V5a extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C66468UIs(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_body_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        URZ urz = (URZ) interfaceC66482zP;
        C66468UIs c66468UIs = (C66468UIs) c3oo;
        AbstractC167007dF.A1K(urz, c66468UIs);
        TextView textView = c66468UIs.A02;
        Context A0L = AbstractC166997dE.A0L(textView);
        C50627MWo c50627MWo = urz.A00;
        CharSequence A00 = BHX.A00(A0L, (C5QE) c50627MWo.A01);
        if (A00.length() == 0) {
            textView.setVisibility(8);
        } else {
            Html.escapeHtml(new String[]{""}[0]);
            String obj = A00.toString();
            if (obj == null) {
                obj = "";
            }
            textView.setText(Html.fromHtml(obj));
        }
        Number number = (Number) c50627MWo.A00;
        ImageView imageView = c66468UIs.A00;
        if (number == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(number.intValue());
        }
        if (textView.getVisibility() == 8 && imageView.getVisibility() == 8) {
            LinearLayout linearLayout = c66468UIs.A01;
            linearLayout.setVisibility(8);
            linearLayout.setPaddingRelative(0, 0, 0, 0);
        } else {
            LinearLayout linearLayout2 = c66468UIs.A01;
            linearLayout2.setVisibility(0);
            Context context = linearLayout2.getContext();
            linearLayout2.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A04(context, R.dimen.abc_dropdownitem_icon_width), AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return URZ.class;
    }
}
