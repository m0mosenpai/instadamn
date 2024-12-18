package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UC1 extends FrameLayout implements X9f {
    public UvE A00;

    @Override // X.X9f
    public void setViewModel(UvE uvE) {
        C14360o3.A0B(uvE, 0);
        this.A00 = uvE;
        Context context = getContext();
        View inflate = View.inflate(context, R.layout.hub_cell_header_card_icons, this);
        View requireViewById = inflate.requireViewById(R.id.card_icon_list);
        C14360o3.A0C(requireViewById, AbstractC111324zv.A00(4));
        LinearLayout linearLayout = (LinearLayout) requireViewById;
        linearLayout.setGravity(8388611);
        UvE uvE2 = this.A00;
        if (uvE2 == null) {
            C14360o3.A0F("supportedLogosViewModel");
            throw C00O.createAndThrow();
        }
        Iterator it = uvE2.A00.iterator();
        while (it.hasNext()) {
            Drawable drawable = context.getDrawable(AbstractC167007dF.A0B(it));
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.hub_cell_header_card_icon, (ViewGroup) linearLayout, false);
            View requireViewById2 = inflate2.requireViewById(R.id.card_icon);
            C14360o3.A0C(requireViewById2, AbstractC111324zv.A00(34));
            ((ImageView) requireViewById2).setImageDrawable(drawable);
            linearLayout.addView(inflate2);
        }
        C14360o3.A07(context);
        WFM.A02(inflate, null, null, Integer.valueOf(WFM.A00(context, R.attr.fbpay_card_form_card_logos_top_padding)), Integer.valueOf(WFM.A00(context, R.attr.fbpay_card_form_card_logos_bottom_padding)));
    }
}
