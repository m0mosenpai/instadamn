package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.7zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180567zk extends C5RN {
    public final int A00;
    public final int A01;
    public final Resources A02;
    public final Drawable A03;
    public final C6RB A04;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A04.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC001800i.A0U(AbstractC001800i.A0X(AbstractC16960so.A1N(this.A03, this.A04)));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A04.A06;
        int i2 = this.A00;
        if (i < i2) {
            return i2;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public /* synthetic */ C180567zk(Context context, Integer num) {
        Drawable drawable;
        int i;
        Resources resources = context.getResources();
        this.A02 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.achievements_list_container_height);
        int color = context.getColor(R.color.igds_pill_active_text);
        if (num != null) {
            drawable = context.getDrawable(num.intValue());
            if (drawable != null) {
                drawable.setColorFilter(C3DY.A00(color));
                drawable.setCallback(this);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            drawable = null;
        }
        this.A03 = drawable;
        if (num != null) {
            i = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        } else {
            i = 0;
        }
        this.A00 = i;
        int dimensionPixelSize2 = num != null ? resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material) : 0;
        C6RB c6rb = new C6RB(context, dimensionPixelSize);
        AbstractC180577zl.A00(context, AbstractC15960qq.A00(context).A02(EnumC15950qp.A0u), c6rb, C05F.A0C);
        c6rb.A0A(resources.getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size_smaller));
        c6rb.A0F(color);
        c6rb.A0M(context.getString(2131971064));
        c6rb.A0B(0.0f, 1.33f);
        c6rb.setCallback(this);
        this.A04 = c6rb;
        this.A01 = c6rb.A0A + i + dimensionPixelSize2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float f3 = this.A01 / 2;
        int A01 = C1H4.A01(f - f3);
        int A012 = C1H4.A01(f + f3);
        Drawable drawable = this.A03;
        if (drawable != null) {
            int i5 = this.A00;
            float f4 = i5 / 2;
            drawable.setBounds(A01, C1H4.A01(f2 - f4), i5 + A01, C1H4.A01(f4 + f2));
        }
        C6RB c6rb = this.A04;
        int i6 = A012 - c6rb.A0A;
        float f5 = c6rb.A06 / 2;
        c6rb.setBounds(i6, C1H4.A01(f2 - f5), A012, C1H4.A01(f2 + f5));
    }
}
