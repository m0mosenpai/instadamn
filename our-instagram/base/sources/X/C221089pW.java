package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import com.facebook.R;
import com.instagram.user.model.Product;

/* renamed from: X.9pW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221089pW extends AbstractC202348xE implements Drawable.Callback, C1NJ {
    public static final CharSequence A0Q = "…";
    public int A01;
    public Bitmap A02;
    public Product A03;
    public String A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final C6RB A0I;
    public final C6RB A0J;
    public final boolean A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final Drawable A0P;
    public final Runnable A0K = new RunnableC24486At5(this);
    public final Paint A0C = AbstractC166987dD.A0S(1);
    public final Paint A0D = AbstractC166987dD.A0S(1);
    public final Path A0G = AbstractC166987dD.A0T();
    public final Paint A0E = AbstractC166997dE.A0Q();
    public final Path A0H = AbstractC166987dD.A0T();
    public final Paint A0F = AbstractC166987dD.A0S(1);
    public int A00 = -1;

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        Object obj = null;
        obj.getClass();
        throw C00O.createAndThrow();
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
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

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A09;
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, i);
            this.A02 = extractThumbnail;
            if (extractThumbnail != null) {
                Paint paint = this.A0E;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(extractThumbnail, tileMode, tileMode));
            }
            C11T.A02(this.A0K);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public C221089pW(Context context, boolean z) {
        this.A0B = context;
        this.A0L = z;
        int A0A = AbstractC13880nE.A0A(context);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        this.A06 = AbstractC167017dG.A0D(context);
        int A05 = AbstractC167017dG.A05(context);
        this.A0M = A05;
        int A0F = AbstractC167017dG.A0F(context);
        int A0E = AbstractC167017dG.A0E(context);
        this.A0N = A0E;
        this.A0O = AbstractC167017dG.A04(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A09 = dimensionPixelSize;
        int A04 = AbstractC167017dG.A04(context);
        this.A08 = A04;
        int A052 = AbstractC167017dG.A05(context);
        int i = A05 + dimensionPixelSize + (A0E * 2);
        this.A0A = i;
        int i2 = A0A - i;
        float f = A052;
        BUU A00 = BUU.A00(context, f, A04);
        this.A0P = A00;
        int round = Math.round(f);
        int i3 = -round;
        int i4 = round + dimensionPixelSize;
        A00.setBounds(i3, i3, i4, i4);
        C6RB A0z = AbstractC166987dD.A0z(context, i2);
        this.A0J = A0z;
        A0z.setCallback(this);
        float f2 = A0F;
        A0z.A0A(f2);
        A0z.A0J(Typeface.SANS_SERIF, 1);
        A0z.A0G(1, "…");
        C6RB A0z2 = AbstractC166987dD.A0z(context, i2);
        this.A0I = A0z2;
        A0z2.setCallback(this);
        A0z2.A0A(f2);
        A0z2.A0J(Typeface.SANS_SERIF, 0);
        A0z2.A0G(1, "…");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        AbstractC167017dG.A11(canvas, getBounds());
        canvas.drawPath(this.A0G, this.A0C);
        canvas.save();
        int i = this.A0M;
        float f = i;
        canvas.translate(f, f);
        this.A0P.draw(canvas);
        Bitmap bitmap = this.A02;
        Path path = this.A0H;
        if (bitmap != null) {
            canvas.drawPath(path, this.A0D);
            paint = this.A0E;
        } else {
            paint = this.A0F;
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f2 = i + this.A09 + this.A0N;
        int i2 = this.A07;
        C6RB c6rb = this.A0J;
        int i3 = c6rb.A06;
        int i4 = this.A0O;
        C6RB c6rb2 = this.A0I;
        canvas.translate(f2, AbstractC166987dD.A02(i2 - ((i3 + i4) + c6rb2.A06)));
        c6rb.draw(canvas);
        AbstractC167007dF.A0u(canvas, c6rb2, 0.0f, c6rb.A06 + i4);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
