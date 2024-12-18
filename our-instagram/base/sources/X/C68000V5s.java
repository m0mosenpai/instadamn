package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.V5s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68000V5s extends C5RN {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final Interpolator A04;
    public final ViewOnTouchListenerC66316U8p A05;
    public final List A06;

    @Override // X.C5RN
    public final List A07() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p;
        float f;
        if (this.A00) {
            long currentTimeMillis = System.currentTimeMillis() % 4200;
            if (currentTimeMillis < 350) {
                f = this.A04.getInterpolation(AbstractC13600mm.A01((float) currentTimeMillis, 0.0f, 350.0f, 0.0f, 1.0f));
                viewOnTouchListenerC66316U8p = this.A05;
            } else if (currentTimeMillis < 2100) {
                this.A05.A01(0.5f);
            } else if (currentTimeMillis < 2450) {
                float interpolation = this.A04.getInterpolation(AbstractC13600mm.A01((float) currentTimeMillis, 2100.0f, 2450.0f, 0.0f, 1.0f));
                viewOnTouchListenerC66316U8p = this.A05;
                f = 1.0f - interpolation;
            } else {
                this.A05.A01(0.0f);
            }
            viewOnTouchListenerC66316U8p.A01(f * 0.5f);
        }
        this.A03.draw(canvas);
        this.A05.draw(canvas);
        if (this.A00) {
            invalidateSelf();
        }
    }

    public C68000V5s(UserSession userSession, Context context, boolean z) {
        Drawable drawable;
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        this.A04 = new DecelerateInterpolator(1.5f);
        Resources resources = context.getResources();
        double A00 = AbstractC172687md.A00(userSession);
        this.A01 = (int) (resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin) * A00 * A00);
        this.A02 = (int) (resources.getDimensionPixelSize(R.dimen.achievements_only_you_top_margin) * A00);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(context.getColor(R.color.audio_bar_action_color_enabled));
            gradientDrawable.setCornerRadius((float) (resources.getDimension(R.dimen.account_discovery_bottom_gap) * A00));
            drawable = gradientDrawable;
        } else {
            drawable = context.getDrawable(R.drawable.slider_sticker_tray_background);
        }
        this.A03 = drawable;
        drawable.setCallback(this);
        ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p = new ViewOnTouchListenerC66316U8p(context, userSession);
        this.A05 = viewOnTouchListenerC66316U8p;
        viewOnTouchListenerC66316U8p.setCallback(this);
        viewOnTouchListenerC66316U8p.A09 = true;
        viewOnTouchListenerC66316U8p.invalidateSelf();
        viewOnTouchListenerC66316U8p.A02((int) (resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material) * A00 * A00));
        viewOnTouchListenerC66316U8p.A04(C05F.A00);
        C68002V5u c68002V5u = viewOnTouchListenerC66316U8p.A0N;
        c68002V5u.A06.A0M("😍");
        c68002V5u.invalidateSelf();
        viewOnTouchListenerC66316U8p.A03((int) (resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) * A00));
        Collections.addAll(arrayList, this.A03, viewOnTouchListenerC66316U8p);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A03;
        int i5 = ((i4 - i2) / 2) + i2;
        int i6 = this.A01 / 2;
        drawable.setBounds(i, i5 - i6, i3, i5 + i6);
        ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p = this.A05;
        int i7 = this.A02;
        viewOnTouchListenerC66316U8p.setBounds(i + i7, i2, i3 - i7, i4);
    }
}
