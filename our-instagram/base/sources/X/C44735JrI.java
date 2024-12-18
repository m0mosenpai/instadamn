package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JrI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44735JrI extends C3OO {
    public final LinearLayout.LayoutParams A00;
    public final LinearLayout.LayoutParams A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;

    public C44735JrI(View view) {
        super(view);
        this.A03 = AbstractC167007dF.A0N(view, R.id.command_row_title);
        this.A02 = AbstractC167007dF.A0N(view, R.id.command_row_description);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.command_row_image_view);
        this.A04 = A0T;
        Resources resources = A0T.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize2;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize2;
        this.A00 = layoutParams;
        int A05 = AbstractC166997dE.A05(resources);
        int A0A = AbstractC166997dE.A0A(resources);
        int A08 = AbstractC166997dE.A08(resources);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(A05);
        layoutParams2.setMarginEnd(A0A);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = A08;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = A08;
        this.A01 = layoutParams2;
    }
}
