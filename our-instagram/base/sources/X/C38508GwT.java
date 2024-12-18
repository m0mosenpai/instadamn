package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

/* renamed from: X.GwT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38508GwT extends C3OO {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final RoundedCornerImageView A06;
    public final RoundedCornerImageView A07;
    public final AutoWidthToggleButton A08;
    public final InterfaceC09390do A09;

    public C38508GwT(View view) {
        super(view);
        this.A02 = view;
        this.A00 = AbstractC166997dE.A0L(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.thumbnail_circle);
        this.A06 = roundedCornerImageView;
        RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.thumbnail_square);
        this.A07 = roundedCornerImageView2;
        this.A03 = AbstractC167007dF.A0N(view, R.id.primary_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A05 = AbstractC167007dF.A0N(view, R.id.tertiary_text);
        this.A01 = AbstractC166997dE.A0S(view, R.id.chevron);
        this.A08 = (AutoWidthToggleButton) AbstractC166997dE.A0R(view, R.id.add_button);
        this.A09 = J8X.A00(this, 9);
        C3OB c3ob = C3OB.A02;
        roundedCornerImageView.setBitmapShaderScaleType(c3ob);
        roundedCornerImageView2.setBitmapShaderScaleType(c3ob);
    }
}
