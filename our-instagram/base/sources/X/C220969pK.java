package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9pK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220969pK extends AbstractC130945vi implements C5RR, InterfaceC202998yH {
    public final C217829kF A00;
    public final C6RB A01;
    public final Context A02;
    public final UserSession A03;
    public final C6RL A04;
    public final List A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A05;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A00;
    }

    @Override // X.InterfaceC202998yH
    public final void DtF(int i, int i2) {
        C217829kF c217829kF = this.A00;
        c217829kF.A01 = i;
        c217829kF.A00 = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.A0A;
    }

    public C220969pK(Context context, UserSession userSession, C217829kF c217829kF) {
        this.A00 = c217829kF;
        this.A02 = context;
        this.A03 = userSession;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(2131968862));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        AMr.A0B(spannableStringBuilder, AbstractC166997dE.A07(resources), dimensionPixelSize, dimensionPixelSize2, AbstractC166997dE.A03(context), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_blue));
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_blue);
        Paint paint = C3LQ.A00;
        Drawable A05 = C3LQ.A05(context, R.drawable.instagram_alert_pano_filled_24, context.getColor(A0H));
        C4GL.A01(resources, A05, R.dimen.abc_dialog_padding_material);
        C4GL.A03(A05, spannableStringBuilder, C05F.A00, 0, 0, resources.getDimensionPixelSize(R.dimen.accent_edge_thickness));
        Spannable spannable = C6RB.A0d;
        C6RB A0Y = AbstractC167007dF.A0Y(context, resources, R.dimen.clips_grid_page_thumbnail_height_vertical);
        A0Y.A0L(spannableStringBuilder);
        AMr.A08(context, A0Y, AbstractC166987dD.A04(resources, R.dimen.mk_title_font_size), dimensionPixelSize, dimensionPixelSize2);
        this.A01 = A0Y;
        C6RL A0H2 = AbstractC167027dH.A0H(context, this);
        this.A04 = A0H2;
        this.A05 = AbstractC16960so.A1Q(A0Y, A0H2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = r4.A0A / 2.0f;
        float f3 = r4.A06 / 2.0f;
        AbstractC166997dE.A1E(this.A01, f - f2, A03 - f3, f + f2, A03 + f3);
    }
}
