package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* renamed from: X.U8s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66319U8s extends Drawable implements XDC {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public WeakReference A06;
    public WeakReference A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final BadgeDrawable$SavedState A0B;
    public final C69710Vu5 A0C;
    public final C65O A0D;
    public final WeakReference A0E;
    public final Rect A0F;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private String A00() {
        BadgeDrawable$SavedState badgeDrawable$SavedState = this.A0B;
        int i = badgeDrawable$SavedState.A0A;
        int i2 = 0;
        if (i != -1) {
            i2 = i;
        }
        int i3 = this.A05;
        if (i2 <= i3) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            int i4 = badgeDrawable$SavedState.A0A;
            int i5 = 0;
            if (i4 != -1) {
                i5 = i4;
            }
            return numberFormat.format(i5);
        }
        Context context = (Context) this.A0E.get();
        if (context == null) {
            return "";
        }
        return AbstractC31174DnI.A0t(context, Integer.valueOf(i3), "+", 2131967843);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C66319U8s r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66319U8s.A01(X.U8s):void");
    }

    public final void A02(View view, FrameLayout frameLayout) {
        this.A06 = new WeakReference(view);
        this.A07 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        A01(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0B.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0F.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0F.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0B.A02 = i;
        this.A0C.A04.setAlpha(i);
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.material.badge.BadgeDrawable$SavedState, java.lang.Object] */
    public C66319U8s(Context context) {
        Context context2;
        this.A0E = new WeakReference(context);
        C65M.A03(context, AbstractC111324zv.A00(3782), C65M.A01);
        Resources resources = context.getResources();
        this.A0F = new Rect();
        this.A0D = new C65O();
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0A = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        C69710Vu5 c69710Vu5 = new C69710Vu5(this);
        this.A0C = c69710Vu5;
        c69710Vu5.A04.setTextAlign(Paint.Align.CENTER);
        ?? obj = new Object();
        obj.A02 = 255;
        obj.A0A = -1;
        obj.A05 = new C70154WDd(context, R.style.TextAppearance_MaterialComponents_Badge).A0A.getDefaultColor();
        obj.A0C = context.getString(2131967840);
        obj.A07 = R.plurals.mtrl_badge_content_description;
        obj.A06 = 2131967842;
        obj.A0D = true;
        this.A0B = obj;
        WeakReference weakReference = this.A0E;
        Context context3 = (Context) weakReference.get();
        if (context3 != null) {
            C70154WDd c70154WDd = new C70154WDd(context3, R.style.TextAppearance_MaterialComponents_Badge);
            C69710Vu5 c69710Vu52 = this.A0C;
            if (c69710Vu52.A00 != c70154WDd && (context2 = (Context) weakReference.get()) != null) {
                c69710Vu52.A01(context2, c70154WDd);
                A01(this);
            }
        }
    }

    @Override // X.XDC
    public final void Dsi() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            BadgeDrawable$SavedState badgeDrawable$SavedState = this.A0B;
            if (badgeDrawable$SavedState.A02 != 0 && isVisible()) {
                this.A0D.draw(canvas);
                if (badgeDrawable$SavedState.A0A != -1) {
                    Rect rect = new Rect();
                    String A00 = A00();
                    TextPaint textPaint = this.A0C.A04;
                    textPaint.getTextBounds(A00, 0, A00.length(), rect);
                    canvas.drawText(A00, this.A00, this.A01 + (rect.height() / 2), textPaint);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable, X.XDC
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
