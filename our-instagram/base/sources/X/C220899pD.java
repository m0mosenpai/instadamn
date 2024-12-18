package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220899pD extends AbstractC130945vi implements C5RR {
    public final int A00;
    public final C24015Akt A01;
    public final int A02;
    public final int A03;
    public final C210179Rg A04;
    public final MUE A05;
    public final C210199Ri A06;
    public final boolean A07;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        draw(canvas);
        draw(canvas);
        if (this.A07) {
            this.A05.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A04, this.A06, this.A05);
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.9Ri, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.9Rg, android.graphics.drawable.Drawable] */
    public C220899pD(final Context context, C24015Akt c24015Akt, boolean z, final boolean z2) {
        String str;
        this.A01 = c24015Akt;
        this.A07 = z;
        this.A00 = context.getResources().getDimensionPixelSize(z2 ? R.dimen.action_bar_plus_shadow_height : R.dimen.avatar_size_ridiculously_xxlarge);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(z2 ? R.dimen.add_account_icon_circle_radius : R.dimen.asset_picker_redesign_sticker_height);
        this.A03 = context.getResources().getDimensionPixelSize(z2 ? R.dimen.audition_flow_footer_button_horizontal_padding : R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        this.A02 = AbstractC167017dG.A04(context);
        ?? r0 = new Drawable() { // from class: X.9Rg
            public final Paint A00;
            public final Path A01;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                Path path = this.A01;
                path.addCircle(AbstractC166997dE.A0H(this) / 2.0f, AbstractC166997dE.A0G(this) / 2.0f, AbstractC166997dE.A0H(this) / 2.0f, Path.Direction.CW);
                canvas.save();
                AbstractC167017dG.A12(canvas, this);
                canvas.drawPath(path, this.A00);
                canvas.restore();
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            {
                Paint A0Q = AbstractC166997dE.A0Q();
                A0Q.setColor(-1);
                AbstractC166987dD.A1R(A0Q);
                this.A00 = A0Q;
                this.A01 = AbstractC166987dD.A0T();
            }
        };
        r0.setCallback(this);
        this.A04 = r0;
        MUE mue = new MUE(dimensionPixelSize);
        mue.A00((c24015Akt == null || (str = c24015Akt.A00.A00) == null) ? "😍" : str);
        mue.setCallback(this);
        this.A05 = mue;
        ?? r02 = new Drawable(context, z2) { // from class: X.9Ri
            public final float A00;
            public final Paint A01;
            public final Path A02;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                Path path = this.A02;
                RectF A0Y = AbstractC166987dD.A0Y(AbstractC166997dE.A0H(this), AbstractC166997dE.A0G(this));
                float f = this.A00;
                path.addRoundRect(A0Y, f, f, Path.Direction.CW);
                canvas.save();
                AbstractC167017dG.A12(canvas, this);
                canvas.drawPath(path, this.A01);
                canvas.restore();
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            {
                this.A00 = AbstractC166987dD.A04(context.getResources(), z2 ? R.dimen.abc_action_bar_elevation_material : R.dimen.abc_button_inset_vertical_material);
                Paint A0Q = AbstractC166997dE.A0Q();
                AbstractC166987dD.A1N(context, A0Q, R.color.grey_2);
                AbstractC166987dD.A1R(A0Q);
                this.A01 = A0Q;
                this.A02 = AbstractC166987dD.A0T();
            }
        };
        r02.setCallback(this);
        this.A06 = r02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A00 / 2.0f;
        float f3 = f - f2;
        float f4 = A03 - f2;
        float f5 = f2 + f;
        float f6 = f2 + A03;
        AbstractC166997dE.A1E(this.A04, f3, f4, f5, f6);
        MUE mue = this.A05;
        mue.setBounds((int) AbstractC167007dF.A03(mue, f), (int) AbstractC167007dF.A01(mue, A03), (int) AbstractC167007dF.A02(mue, f), (int) (A03 + AbstractC166987dD.A05(mue)));
        C210199Ri c210199Ri = this.A06;
        float f7 = this.A03;
        float f8 = this.A02;
        c210199Ri.setBounds((int) ((f5 - f7) - f8), (int) ((f6 - f7) - f8), (int) (f5 - f8), (int) (f6 - f8));
    }
}
