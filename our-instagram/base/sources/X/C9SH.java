package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9SH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SH extends Drawable implements Drawable.Callback, C1NJ {
    public int A00;
    public long A01;
    public Paint A02;
    public C9Rz A03;
    public boolean A04;
    public float A05;
    public float A06;
    public final float A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Drawable A0D;
    public final ImageUrl A0E;
    public final C6RB A0F;
    public final C6RB A0G;
    public final boolean A0H;
    public final long A0I;
    public final Context A0J;
    public final Drawable A0K;
    public final Integer A0L;

    public C9SH(Context context, UserSession userSession, ImageUrl imageUrl, Integer num, String str, String str2, float f, int i, boolean z, boolean z2) {
        int i2;
        Drawable drawable;
        Bitmap bitmap;
        C3PR c3pr;
        C3PR c3pr2;
        C14360o3.A0B(context, 1);
        AbstractC167007dF.A1E(imageUrl, 2, str);
        C14360o3.A0B(userSession, 7);
        this.A0J = context;
        this.A0E = imageUrl;
        this.A04 = z2;
        this.A07 = f;
        this.A0L = num;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36325132583449364L);
        this.A0H = A06;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vinyl_sticker_size);
        this.A0B = dimensionPixelSize;
        if (A06) {
            i2 = AbstractC167017dG.A04(context);
        } else {
            i2 = 0;
        }
        this.A0C = i2;
        this.A08 = context.getResources().getDimensionPixelSize(A06 ? R.dimen.ad_tag_max_width : R.dimen.vinyl_sticker_album_art_size);
        this.A09 = AbstractC167017dG.A08(context);
        this.A0A = AbstractC166997dE.A0D(context.getResources());
        this.A0I = TimeUnit.SECONDS.toMillis((long) C18U.A00(c06090Tz, userSession, 37169557512847866L));
        Drawable A00 = AbstractC56412ia.A00(context.getResources(), A06 ? R.drawable.vinyl_music_sticker_vinyl_music_sticker_shine : R.drawable.vinyl_music_sticker_vinyl_music_dark_placeholder);
        A00.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.A0D = A00;
        if (A06) {
            drawable = AbstractC56412ia.A00(context.getResources(), R.drawable.vinyl_music_sticker_vinyl_texture_full_opacity);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            drawable = null;
        }
        this.A0K = drawable;
        this.A06 = 1.0f;
        this.A00 = -1;
        this.A01 = -1L;
        if ((A00 instanceof C3PR) && (c3pr2 = (C3PR) A00) != null) {
            c3pr2.A01(new C23697AeW(this, 4));
        }
        if ((drawable instanceof C3PR) && (c3pr = (C3PR) drawable) != null) {
            c3pr.A01(new C23697AeW(this, 5));
        }
        C6RB A0z = AbstractC166987dD.A0z(context, dimensionPixelSize);
        this.A0G = A0z;
        A0z.setCallback(this);
        A0z.A0M(str);
        AbstractC166997dE.A1B(context.getResources(), A0z, R.dimen.action_bar_item_spacing_right);
        A0z.A0F(i);
        Typeface typeface = Typeface.SANS_SERIF;
        A0z.A0J(typeface, 1);
        A0z.A0G(2, "…");
        C6RB A0z2 = AbstractC166987dD.A0z(context, dimensionPixelSize);
        this.A0F = A0z2;
        A0z2.setCallback(this);
        A0z2.A0M(str2);
        AbstractC166997dE.A1B(context.getResources(), A0z2, R.dimen.action_bar_item_spacing_right);
        A0z2.A0F(i);
        A0z2.A0J(typeface, 0);
        A0z2.A0G(2, "…");
        if (z && !C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            C73033Pe A0K = C25821No.A00().A0K(userSession, new SimpleImageUrl(imageUrl), "javaClass");
            if (A0K != null && (bitmap = A0K.A01) != null) {
                int i3 = this.A08;
                this.A03 = A23.A00(bitmap, null, i3, i3, i3);
                invalidateSelf();
                return;
            }
            A01();
            return;
        }
        AbstractC167017dG.A1K(this, C25821No.A00(), imageUrl, null);
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

    private final float A00() {
        long j;
        if (!this.A04) {
            return this.A05;
        }
        int i = this.A00;
        if (i == -1) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = i;
        }
        long j2 = j - this.A01;
        this.A01 = j;
        float f = this.A05 + ((((float) j2) / ((float) this.A0I)) * 360.0f);
        this.A05 = f;
        return f;
    }

    private final void A01() {
        Drawable drawable = this.A0J.getDrawable(R.drawable.default_album_art_icon);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        C14360o3.A07(bitmap);
        int i = this.A08;
        this.A03 = A23.A00(bitmap, null, i, i, i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        float f;
        AbstractC167007dF.A0r(canvas);
        float f2 = this.A06;
        canvas.scale(f2, f2);
        if (this.A0H) {
            this.A0D.draw(canvas);
            canvas.save();
            float A00 = A00();
            i = this.A0B;
            float f3 = i;
            f = f3 / 2.0f;
            canvas.rotate(A00, f, f);
            Paint paint = this.A02;
            if (paint != null) {
                int i2 = this.A0C;
                float f4 = i2;
                float f5 = i - i2;
                float f6 = (f3 - (f4 * 2.0f)) / 2.0f;
                canvas.drawRoundRect(f4, f4, f5, f5, f6, f6, paint);
            }
        } else {
            canvas.save();
            float A002 = A00() + this.A07;
            i = this.A0B;
            f = i / 2.0f;
            canvas.rotate(A002, f, f);
            this.A0D.draw(canvas);
        }
        canvas.restore();
        if (this.A03 != null) {
            canvas.save();
            canvas.rotate(A00(), f, f);
            float f7 = f - (this.A08 / 2.0f);
            canvas.translate(f7, f7);
            C9Rz c9Rz = this.A03;
            if (c9Rz == null) {
                C14360o3.A0F("albumArtDrawable");
                throw C00O.createAndThrow();
            }
            c9Rz.draw(canvas);
            canvas.restore();
        }
        if (this.A0L != C05F.A01) {
            canvas.save();
            AbstractC167007dF.A0u(canvas, this.A0G, (i - r4.A0A) / 2.0f, i + this.A09);
            canvas.save();
            AbstractC167007dF.A0u(canvas, this.A0F, (i - r2.A0A) / 2.0f, r3 + r4.A06 + this.A0A);
        }
        canvas.restore();
        if (this.A04) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Integer num = this.A0L;
        Integer num2 = C05F.A01;
        int i = this.A0B;
        if (num != num2) {
            return i + this.A0G.A06 + this.A0F.A06 + this.A0A + this.A09;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
        if (A0O != null) {
            int i = this.A08;
            this.A03 = A23.A00(A0O, null, i, i, i);
            invalidateSelf();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A06 = Math.min((i3 - i) / this.A0B, (i4 - i2) / AbstractC166987dD.A06(this));
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        A01();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
