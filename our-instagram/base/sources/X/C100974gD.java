package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.4gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100974gD {
    public C69114Vi4 A00;
    public final InterfaceC56392iX A01;
    public final Context A02;

    public final void A00(View view) {
        C14360o3.A0B(view, 0);
        C69114Vi4 c69114Vi4 = new C69114Vi4(view);
        this.A00 = c69114Vi4;
        c69114Vi4.A02.setVisibility(8);
        Context context = this.A02;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        View view2 = c69114Vi4.A00;
        float[] fArr = new float[8];
        Arrays.fill(fArr, dimensionPixelSize / 1.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A05(context))));
        view2.setBackground(shapeDrawable);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        view2.setPadding(context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), dimensionPixelSize2, context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness), dimensionPixelSize2);
        ImageView imageView = c69114Vi4.A01;
        AbstractC13880nE.A0g(imageView, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        AbstractC13880nE.A0W(imageView, dimensionPixelSize);
        imageView.setImageDrawable(context.getDrawable(R.drawable.buy_with_prime_bwp_badge));
    }

    public C100974gD(View view) {
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A02 = context;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.findViewById(R.id.row_feed_media_bwp_indicator_stub), false, false);
        this.A01 = A01;
        if (A01.CWW()) {
            A00(A01.getView());
        } else {
            A01.EZv(new InterfaceC69513Al() { // from class: X.4gE
                @Override // X.InterfaceC69513Al
                public final void DLu(View view2) {
                    C14360o3.A0B(view2, 0);
                    C100974gD.this.A00(view2);
                }
            });
        }
    }
}
