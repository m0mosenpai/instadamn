package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9SQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SQ extends Drawable implements C5RP, Drawable.Callback, C1NJ {
    public static final CharSequence A0N = "…";
    public C9Rz A00;
    public boolean A01;
    public C74X A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C138586Po A09;
    public final C6RB A0A;
    public final C6RB A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0I;
    public final boolean A0M;
    public final RectF A0K = AbstractC166987dD.A0X();
    public final Paint A0J = AbstractC166987dD.A0S(1);
    public final long A0H = SystemClock.elapsedRealtime();
    public final CopyOnWriteArraySet A0L = new CopyOnWriteArraySet();
    public int A02 = -1;

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0L.add(interfaceC25177BCa);
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0L.remove(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private final void A00() {
        Context context = this.A0I;
        this.A02 = AbstractC166997dE.A02(context);
        Drawable drawable = context.getDrawable(R.drawable.default_album_art_icon);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap != null) {
            A01(bitmap);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A01(Bitmap bitmap) {
        int i;
        float f;
        Integer num;
        boolean z = this.A0M;
        if (z) {
            C65888Tvs A00 = new C65887Tvr(bitmap).A00();
            int A02 = AbstractC166997dE.A02(this.A0I);
            int A002 = A00.A00(A02);
            if (A002 == A02) {
                C65890Tvu c65890Tvu = A00.A01;
                if (c65890Tvu != null) {
                    A02 = c65890Tvu.A05;
                }
                A002 = A02;
            }
            this.A02 = A002;
            i = this.A0E;
        } else {
            i = this.A04;
        }
        if (z) {
            f = i;
            num = Integer.valueOf(this.A0D);
        } else {
            f = this.A0C;
            num = null;
        }
        C9Rz A003 = A23.A00(bitmap, num, f, i, i);
        this.A00 = A003;
        C14360o3.A0A(A003);
        A003.setCallback(this);
        Iterator A13 = AbstractC166997dE.A13(this.A0L);
        while (A13.hasNext()) {
            ((InterfaceC25177BCa) A13.next()).DQ0();
        }
        invalidateSelf();
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A0L.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A00 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable;
        C9Rz c9Rz = this.A00;
        if (c9Rz != null) {
            drawable = c9Rz.mutate();
        } else {
            drawable = null;
        }
        C14360o3.A0A(drawable);
        drawable.setAlpha(i);
        AbstractC167027dH.A0h(this.A0B, i);
        AbstractC167027dH.A0h(this.A0A, i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable;
        C9Rz c9Rz = this.A00;
        if (c9Rz != null) {
            drawable = c9Rz.mutate();
        } else {
            drawable = null;
        }
        C14360o3.A0A(drawable);
        drawable.setColorFilter(colorFilter);
        AbstractC167027dH.A0d(colorFilter, this.A0B);
        AbstractC167027dH.A0d(colorFilter, this.A0A);
        invalidateSelf();
    }

    public C9SQ(Context context, ImageUrl imageUrl, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        this.A0I = context;
        this.A01 = z3;
        this.A0M = z2;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        this.A04 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size);
        this.A0E = dimensionPixelSize2;
        this.A0D = dimensionPixelSize - dimensionPixelSize2;
        int A0D = AbstractC167017dG.A0D(context);
        this.A0C = A0D;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A0G = dimensionPixelSize3;
        int A0D2 = AbstractC166997dE.A0D(resources);
        this.A0F = A0D2;
        if (!AbstractC81033jX.A03(imageUrl)) {
            if (z) {
                this.A03 = null;
                Bitmap A0G = C25821No.A00().A0G(imageUrl);
                if (A0G != null) {
                    A01(A0G);
                }
            } else {
                C74X A00 = AbstractC226049yN.A00(context, 0.3f);
                this.A03 = A00;
                C14360o3.A0A(A00);
                A00.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                C74X c74x = this.A03;
                C14360o3.A0A(c74x);
                c74x.setCallback(this);
                AbstractC167017dG.A1K(this, C25821No.A00(), imageUrl, null);
            }
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            this.A07 = dimensionPixelSize4;
            this.A06 = AbstractC166997dE.A09(resources);
            C138586Po A002 = AbstractC138576Pn.A00(0.75f, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), false);
            this.A09 = A002;
            A002.setBounds(0, 0, dimensionPixelSize4, dimensionPixelSize4);
            int color = context.getColor(R.color.black_20_transparent);
            A002.A01 = A0D;
            A002.A09.setColor(color);
            A002.invalidateSelf();
            int dimensionPixelSize5 = resources.getDimensionPixelSize(i4);
            C6RB A0z = AbstractC166987dD.A0z(context, dimensionPixelSize5);
            this.A0B = A0z;
            A0z.setCallback(this);
            A0z.A0M(str2);
            AbstractC166997dE.A1B(resources, A0z, i5);
            A0z.A0F(i6);
            Typeface typeface = Typeface.SANS_SERIF;
            A0z.A0J(typeface, 1);
            A0z.A0G(i3, "…");
            C6RB A0z2 = AbstractC166987dD.A0z(context, dimensionPixelSize5);
            this.A0A = A0z2;
            A0z2.setCallback(this);
            A0z2.A0M(str);
            AbstractC166997dE.A1B(resources, A0z2, i5);
            A0z2.A0F(i2);
            A0z2.A0J(typeface, 0);
            A0z2.A0G(i3, "…");
            this.A08 = Math.max(dimensionPixelSize, dimensionPixelSize5);
            this.A05 = dimensionPixelSize + dimensionPixelSize3 + A0z.A06 + A0D2 + A0z2.A06 + dimensionPixelSize3;
        }
        this.A03 = null;
        A00();
        int dimensionPixelSize42 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A07 = dimensionPixelSize42;
        this.A06 = AbstractC166997dE.A09(resources);
        C138586Po A0022 = AbstractC138576Pn.A00(0.75f, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), false);
        this.A09 = A0022;
        A0022.setBounds(0, 0, dimensionPixelSize42, dimensionPixelSize42);
        int color2 = context.getColor(R.color.black_20_transparent);
        A0022.A01 = A0D;
        A0022.A09.setColor(color2);
        A0022.invalidateSelf();
        int dimensionPixelSize52 = resources.getDimensionPixelSize(i4);
        C6RB A0z3 = AbstractC166987dD.A0z(context, dimensionPixelSize52);
        this.A0B = A0z3;
        A0z3.setCallback(this);
        A0z3.A0M(str2);
        AbstractC166997dE.A1B(resources, A0z3, i5);
        A0z3.A0F(i6);
        Typeface typeface2 = Typeface.SANS_SERIF;
        A0z3.A0J(typeface2, 1);
        A0z3.A0G(i3, "…");
        C6RB A0z22 = AbstractC166987dD.A0z(context, dimensionPixelSize52);
        this.A0A = A0z22;
        A0z22.setCallback(this);
        A0z22.A0M(str);
        AbstractC166997dE.A1B(resources, A0z22, i5);
        A0z22.A0F(i2);
        A0z22.A0J(typeface2, 0);
        A0z22.A0G(i3, "…");
        this.A08 = Math.max(dimensionPixelSize, dimensionPixelSize52);
        this.A05 = dimensionPixelSize + dimensionPixelSize3 + A0z3.A06 + A0D2 + A0z22.A06 + dimensionPixelSize3;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
        if (A0O != null) {
            A01(A0O);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C9Rz c9Rz;
        AbstractC167007dF.A0r(canvas);
        Rect A0W = AbstractC166987dD.A0W(this);
        float f = A0W.left;
        int i = this.A08;
        int i2 = this.A04;
        canvas.translate(f + ((i - i2) / 2.0f), A0W.top);
        boolean z = false;
        if (this.A00 == null) {
            z = true;
        }
        if (z) {
            float min = Math.min(((float) (SystemClock.elapsedRealtime() - this.A0H)) / 1000.0f, 1.0f);
            C74X c74x = this.A03;
            if (c74x != 0) {
                c74x.A00(min);
                c9Rz = c74x;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            int i3 = this.A02;
            if (i3 != -1) {
                Paint paint = this.A0J;
                paint.setColor(i3);
                if (this.A0M) {
                    paint.setColorFilter(new PorterDuffColorFilter(AbstractC166997dE.A02(this.A0I), PorterDuff.Mode.DARKEN));
                }
                RectF rectF = this.A0K;
                float f2 = i2;
                rectF.set(0.0f, 0.0f, f2, f2);
                float f3 = this.A0C;
                canvas.drawRoundRect(rectF, f3, f3, paint);
            }
            C9Rz c9Rz2 = this.A00;
            c9Rz = c9Rz2;
            if (c9Rz2 == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        c9Rz.draw(canvas);
        if (this.A01) {
            canvas.save();
            canvas.translate(this.A06, (i2 - r0) - this.A07);
            this.A09.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        AbstractC167017dG.A11(canvas, A0W);
        canvas.save();
        canvas.translate(0.0f, i2 + this.A0G);
        canvas.save();
        AbstractC167007dF.A0u(canvas, this.A0B, (i - r1.A0A) / 2.0f, 0.0f);
        canvas.save();
        AbstractC167007dF.A0u(canvas, this.A0A, (i - r3.A0A) / 2.0f, r1.A06 + this.A0F);
        canvas.restore();
        canvas.restore();
        if (this.A01) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        A00();
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
