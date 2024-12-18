package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195328kY extends ConstraintLayout {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Drawable A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final InterfaceC195318kX A09;
    public final boolean A0A;
    public final ColorFilter A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C195328kY(Context context, InterfaceC195318kX interfaceC195318kX, boolean z) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A09 = interfaceC195318kX;
        this.A0A = z;
        Drawable drawable = context.getResources().getDrawable(R.drawable.dial_ar_effect_footer_background, context.getTheme());
        this.A04 = drawable;
        this.A0B = C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_icon)));
        View.inflate(context, R.layout.dial_ar_effect_footer, this);
        this.A06 = (IgTextView) findViewById(R.id.dial_ar_effect_title);
        this.A05 = (IgTextView) findViewById(R.id.dial_ar_effect_subtitle);
        this.A07 = (IgImageView) findViewById(R.id.dial_ar_effect_bookmark);
        this.A08 = (IgImageView) findViewById(R.id.dial_ar_effect_close);
        setBookmarkIcon(false);
        A00(this);
        IgImageView igImageView = this.A07;
        C3P9 c3p9 = new C3P9(igImageView);
        c3p9.A01(igImageView);
        c3p9.A04 = new C3PD() { // from class: X.8kc
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C195328kY c195328kY = C195328kY.this;
                if (c195328kY.A03) {
                    c195328kY.A09.Di8();
                    return true;
                }
                return true;
            }
        };
        c3p9.A00();
        if (!z && drawable != null) {
            drawable.setAlpha(150);
        }
        setBackground(drawable);
        setVisibility(8);
    }

    public void setComponentMaxWidth(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r1 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r4.length() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentTitle(X.C174587ps r8) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.setAlpha(r0)
            boolean r0 = r7.A02
            r5 = 8
            if (r0 != 0) goto L1a
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L1a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L1c
        L1a:
            r0 = 8
        L1c:
            r7.setVisibility(r0)
            boolean r0 = r8.A04
            r7.A00 = r0
            boolean r0 = r8.A05
            if (r0 == 0) goto L32
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L32
            int r1 = r0.length()
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            r7.A03 = r0
            com.instagram.common.ui.base.IgTextView r6 = r7.A06
            java.lang.String r4 = r8.A01
            if (r4 == 0) goto L42
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L44
        L42:
            r0 = 8
        L44:
            r6.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r7.A07
            boolean r1 = r7.A03
            r2 = 4
            r0 = 4
            if (r1 == 0) goto L50
            r0 = 0
        L50:
            r3.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A08
            boolean r0 = r7.A00
            if (r0 == 0) goto L5a
            r2 = 0
        L5a:
            r1.setVisibility(r2)
            r6.setText(r4)
            com.instagram.common.ui.base.IgTextView r2 = r7.A05
            if (r4 == 0) goto L75
            int r0 = r4.length()
            if (r0 == 0) goto L75
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L75
            int r0 = r0.length()
            if (r0 == 0) goto L75
            r5 = 0
        L75:
            r2.setVisibility(r5)
            java.lang.String r0 = r8.A00
            r2.setText(r0)
            boolean r1 = r8.A02
            boolean r0 = r8.A03
            if (r1 == 0) goto L8c
            r7.setBookmarkIconExpanded(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r0)
            return
        L8c:
            r7.setBookmarkIcon(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r0)
            android.graphics.drawable.Drawable r0 = r7.A04
            r7.setBackground(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195328kY.setCurrentTitle(X.7ps):void");
    }

    public final void A0D() {
        setAlpha(1.0f);
        setVisibility(0);
        this.A06.setVisibility(8);
        this.A07.setVisibility(4);
        this.A08.setVisibility(4);
        IgTextView igTextView = this.A05;
        igTextView.setVisibility(0);
        igTextView.setText((CharSequence) null);
    }

    public final void A0E() {
        this.A06.setTextSize(16.0f);
        this.A05.setTextSize(14.0f);
        setBackground(null);
        this.A01 = true;
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(R.drawable.instagram_effect_page_pano_outline_24);
        Context context = getContext();
        drawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_color))));
        IgImageView igImageView = this.A08;
        igImageView.setImageDrawable(drawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        igImageView.setOnClickListener(new AQK(this));
    }

    public void setGroupAlpha(float f) {
        if (this.A06.getVisibility() == 0) {
            int i = 0;
            if (f == 0.0f || this.A02) {
                i = 8;
            }
            setVisibility(i);
            setAlpha(f);
        }
    }

    public static final void A00(final C195328kY c195328kY) {
        Resources resources = c195328kY.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.instagram_circle_x_outline_16);
        drawable.mutate().setColorFilter(c195328kY.A0B);
        IgImageView igImageView = c195328kY.A08;
        igImageView.setImageDrawable(drawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        igImageView.setOnClickListener(new View.OnClickListener() { // from class: X.8kb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-549668392);
                C195328kY c195328kY2 = C195328kY.this;
                if (c195328kY2.A00) {
                    c195328kY2.A09.D5X();
                }
                C0f9.A0C(1838665177, A05);
            }
        });
    }

    public final void A0F() {
        A0D();
        this.A05.setText(getContext().getString(2131973227));
    }

    public void setBookmarkIcon(boolean z) {
        Resources resources = getResources();
        int i = R.drawable.instagram_save_pano_outline_16;
        if (z) {
            i = R.drawable.instagram_save_pano_filled_16;
        }
        Drawable drawable = resources.getDrawable(i);
        drawable.mutate().setColorFilter(this.A0B);
        IgImageView igImageView = this.A07;
        igImageView.setImageDrawable(drawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        Context context = getContext();
        int i2 = 2131952386;
        if (z) {
            i2 = 2131972229;
        }
        igImageView.setContentDescription(C02G.A01(context).getString(i2));
    }

    public void setBookmarkIconExpanded(boolean z) {
        Resources resources = getResources();
        int i = R.drawable.instagram_save_pano_outline_24;
        if (z) {
            i = R.drawable.instagram_save_pano_filled_24;
        }
        Drawable drawable = resources.getDrawable(i);
        Context context = getContext();
        drawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_color))));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        IgImageView igImageView = this.A07;
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        igImageView.setImageDrawable(drawable);
    }

    public void setHorizontalMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int dimension = (int) getContext().getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, dimension, i, dimension);
        }
        setLayoutParams(layoutParams);
    }

    public void setIsHidden(boolean z) {
        this.A02 = z;
    }
}
