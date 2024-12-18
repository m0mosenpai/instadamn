package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9pC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220889pC extends AbstractC130945vi implements C5RR {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C24014Aks A03;
    public final C6RB A04;
    public final Drawable A05;
    public final Drawable A06;
    public final Drawable A07;

    public C220889pC(final Context context, C24014Aks c24014Aks) {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        C14360o3.A0B(c24014Aks, 2);
        this.A02 = context;
        this.A03 = c24014Aks;
        int A04 = AbstractC166997dE.A04(context, R.dimen.ad_tag_max_width);
        this.A00 = A04;
        int A042 = AbstractC166997dE.A04(this.A02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A01 = A042;
        this.A05 = context.getDrawable(R.drawable.pics_please_sticker_background);
        this.A06 = new Drawable(context) { // from class: X.9Ry
            public final Context A00;
            public final int A01;
            public final Drawable A02;
            public final Drawable A03;
            public final C6RB A04;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                Drawable drawable2 = this.A02;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = this.A03;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
                this.A04.draw(canvas);
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                return this.A01;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicWidth() {
                return this.A01;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                Drawable drawable2 = this.A02;
                if (drawable2 != null) {
                    drawable2.setAlpha(i);
                }
                Drawable drawable3 = this.A03;
                if (drawable3 != null) {
                    drawable3.setAlpha(i);
                }
                this.A04.setAlpha(i);
            }

            {
                this.A00 = context;
                this.A02 = context.getDrawable(R.drawable.pics_please_sticker_contribution_button_background);
                this.A03 = context.getDrawable(R.drawable.instagram_circle_add_pano_outline_24);
                int A043 = AbstractC166997dE.A04(this.A00, R.dimen.pics_please_editor_contribution_button_size);
                this.A01 = A043;
                C6RB A0z = AbstractC166987dD.A0z(context, A043);
                AbstractC166997dE.A1B(this.A00.getResources(), A0z, R.dimen.abc_text_size_menu_header_material);
                Context context2 = A0z.A0Z;
                AbstractC166997dE.A1A(context2, A0z, R.color.clips_remix_camera_outer_container_default_background);
                AbstractC166987dD.A1U(EnumC15950qp.A13, AbstractC15960qq.A00(context2), A0z);
                AbstractC166987dD.A1Q(context2, A0z, 2131969630);
                this.A04 = A0z;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i, int i2, int i3, int i4) {
                int i5;
                super.setBounds(i, i2, i3, i4);
                int i6 = this.A01 / 2;
                int i7 = (int) ((i + i3) / 2.0f);
                int A03 = (int) AbstractC166987dD.A03(i2, i4, 2.0f);
                int i8 = i7 - i6;
                int i9 = A03 - i6;
                int i10 = i7 + i6;
                int i11 = i6 + A03;
                Drawable drawable2 = this.A02;
                if (drawable2 != null) {
                    drawable2.setBounds(i8, i9, i10, i11);
                }
                Drawable drawable3 = this.A03;
                int i12 = 0;
                if (drawable3 != null) {
                    i5 = drawable3.getIntrinsicWidth();
                    i12 = drawable3.getIntrinsicHeight();
                } else {
                    i5 = 0;
                }
                int A043 = AbstractC166997dE.A04(this.A00, R.dimen.abc_button_padding_horizontal_material) / 2;
                if (drawable3 != null) {
                    int i13 = i5 / 2;
                    int i14 = A03 - A043;
                    drawable3.setBounds(i7 - i13, i14 - i12, i13 + i7, i14);
                }
                C6RB c6rb = this.A04;
                int i15 = (int) (c6rb.A0A / 2.0f);
                int i16 = A03 + A043;
                c6rb.setBounds(i7 - i15, i16, i7 + i15, c6rb.A06 + i16);
            }
        };
        AlD alD = c24014Aks.A00;
        String A05 = alD.A05();
        C6RB c6rb = null;
        if (A05 != null && !AbstractC001900j.A0T(A05)) {
            drawable = context.getDrawable(R.drawable.pics_please_sticker_title_background);
            if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                gradientDrawable.setColor(ColorStateList.valueOf(alD.A03(context)));
            }
        } else {
            drawable = null;
        }
        this.A07 = drawable;
        String A052 = alD.A05();
        if (A052 != null && !AbstractC001900j.A0T(A052)) {
            c6rb = AbstractC167007dF.A0X(context, A042, A04);
            AbstractC166997dE.A1B(this.A02.getResources(), c6rb, R.dimen.backup_codes_text_size);
            Context context2 = c6rb.A0Z;
            AbstractC166997dE.A1A(context2, c6rb, AbstractC53242c7.A0A(context2));
            AbstractC167017dG.A0z(context2, c6rb);
            c6rb.A09();
            c6rb.A0M(A052);
        }
        this.A04 = c6rb;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A06.draw(canvas);
        Drawable drawable2 = this.A07;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        C6RB c6rb = this.A04;
        if (c6rb != null) {
            c6rb.draw(canvas);
        }
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int A0F;
        int A04 = AbstractC166997dE.A04(this.A02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        String A05 = this.A03.A00.A05();
        if (A05 != null && A05.length() == 0) {
            A0F = this.A06.getIntrinsicHeight();
        } else {
            C6RB c6rb = this.A04;
            if (c6rb != null) {
                i = ((this.A01 * 2) + c6rb.A06) - c6rb.A08;
            } else {
                i = 0;
            }
            A0F = AbstractC166987dD.A0F(this.A06, i);
        }
        return A0F + (A04 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC166987dD.A1E();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (int) ((i + i3) / 2.0f);
        C6RB c6rb = this.A04;
        if (c6rb != null) {
            i5 = ((this.A01 * 2) + c6rb.A06) - c6rb.A08;
        } else {
            i5 = 0;
        }
        int A04 = AbstractC166997dE.A04(this.A02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        int i7 = i5 + i2;
        this.A06.setBounds(i, i7 + A04, i3, i4 - A04);
        Drawable drawable2 = this.A07;
        if (drawable2 != null) {
            drawable2.setBounds(i, i2, i3, i7);
        }
        if (c6rb != null) {
            int i8 = c6rb.A08;
            int i9 = (int) (c6rb.A0A / 2.0f);
            int i10 = this.A01 + i2;
            c6rb.setBounds(i6 - i9, i10 - i8, i6 + i9, i10 + c6rb.A06);
        }
    }
}
