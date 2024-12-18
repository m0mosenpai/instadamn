package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202728xq extends Drawable implements C5RP, C74Q, Drawable.Callback, C1NJ, C5RR {
    public float A00;
    public Bitmap A01;
    public Path A02;
    public Path A03;
    public C9Rz A04;
    public boolean A05;
    public boolean A06;
    public ColorFilter A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final C6RL A0F;
    public final String A0G;
    public final float A0H;
    public final long A0I;
    public final Resources A0J;
    public final Bitmap A0K;
    public final Paint A0L;
    public final RectF A0M;
    public final Medium A0N;
    public final C74X A0O;
    public final C8OK A0P;
    public final CopyOnWriteArraySet A0Q;
    public final boolean A0R;
    public final boolean A0S;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r11.Cff() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202728xq(android.content.Context r9, android.graphics.Bitmap r10, com.instagram.common.gallery.Medium r11, final com.instagram.common.typedurl.ImageUrl r12, X.C8OK r13, java.lang.Integer r14, int r15, int r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202728xq.<init>(android.content.Context, android.graphics.Bitmap, com.instagram.common.gallery.Medium, com.instagram.common.typedurl.ImageUrl, X.8OK, java.lang.Integer, int, int, boolean, boolean, boolean, boolean):void");
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0Q.add(interfaceC25177BCa);
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            A01(bitmap, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0Q.remove(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        if (this.A01 == null) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.A0I)) / 500.0f;
            if (elapsedRealtime > 1.0f) {
                elapsedRealtime = 1.0f;
            }
            C74X c74x = this.A0O;
            c74x.A00(elapsedRealtime);
            c74x.draw(canvas);
        } else {
            canvas.save();
            float f = this.A00;
            canvas.scale(f, f);
            C9Rz c9Rz = this.A04;
            if (this.A06 && c9Rz != null) {
                int i3 = c9Rz.A01;
                float f2 = this.A08;
                int i4 = ((int) f2) * 2;
                int i5 = i3 + i4;
                int i6 = c9Rz.A00 + i4;
                int i7 = i5 - i6;
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i7 / 2;
                int i9 = i6 - i5;
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = i9 / 2;
                Path path = this.A02;
                canvas.save();
                float f3 = -f2;
                canvas.translate(f3, f3);
                if (path != null) {
                    if (i5 > i6) {
                        canvas.translate(i8, 0.0f);
                    } else if (i6 > i5) {
                        canvas.translate(0.0f, i10);
                    }
                    canvas.clipPath(path);
                    canvas.drawColor(this.A0C);
                } else {
                    float f4 = this.A09;
                    canvas.drawRoundRect(0.0f, 0.0f, i5, i6, f4, f4, this.A0E);
                }
                canvas.restore();
            }
            Path path2 = this.A03;
            if (path2 != null) {
                if (this.A05) {
                    C9Rz c9Rz2 = this.A04;
                    if (c9Rz2 != null) {
                        i = c9Rz2.A01;
                        i2 = c9Rz2.A00;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    int i11 = (i - i2) / 2;
                    int i12 = 0;
                    if (0 < i11) {
                        i12 = i11;
                    }
                    int i13 = (i2 - i) / 2;
                    int i14 = 0;
                    if (0 < i13) {
                        i14 = i13;
                    }
                    if (i > i2) {
                        canvas.translate(i12, 0.0f);
                    } else if (i2 > i) {
                        canvas.translate(0.0f, i14);
                    }
                }
                canvas.clipPath(path2);
            }
            C9Rz c9Rz3 = this.A04;
            if (c9Rz3 != null) {
                c9Rz3.draw(canvas);
            }
            canvas.restore();
            if (this.A0S) {
                RectF rectF = this.A0M;
                float f5 = this.A0H / 2.0f;
                rectF.set((getBounds().width() / 2.0f) - f5, (getBounds().height() / 2.0f) - f5, (getBounds().width() / 2.0f) + f5, (getBounds().height() / 2.0f) + f5);
                Bitmap bitmap = this.A0K;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0L);
                }
            }
        }
        canvas.restore();
        this.A0F.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A0O.setBounds(0, 0, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    private final void A01(Bitmap bitmap, boolean z) {
        Integer num;
        int i;
        C9Rz c9Rz;
        float f;
        int i2;
        Integer valueOf;
        Integer valueOf2;
        Float valueOf3;
        int height;
        this.A01 = bitmap;
        C8OK c8ok = this.A0P;
        if (c8ok.ordinal() == 8) {
            num = C05F.A1F;
        } else {
            num = C05F.A1I;
        }
        if (8 - num.intValue() != 0) {
            i = 15;
        } else {
            i = 12;
        }
        if (this.A0R) {
            int i3 = this.A0B;
            int i4 = this.A0A;
            float f2 = this.A09;
            float f3 = i3;
            float f4 = i4;
            float f5 = f3 / f4;
            if (f5 > 1.0f) {
                valueOf = Integer.valueOf((int) (f4 * f5));
                valueOf2 = Integer.valueOf(i4);
            } else {
                valueOf = Integer.valueOf(i3);
                valueOf2 = Integer.valueOf((int) (f3 / f5));
            }
            int intValue = valueOf.intValue();
            int intValue2 = valueOf2.intValue();
            Matrix matrix = new Matrix();
            int i5 = this.A0D;
            matrix.setRotate(i5);
            if (i5 != 0 && i5 != 180) {
                valueOf3 = Float.valueOf(bitmap.getHeight());
                height = bitmap.getWidth();
            } else {
                valueOf3 = Float.valueOf(bitmap.getWidth());
                height = bitmap.getHeight();
            }
            float max = Math.max(intValue / valueOf3.floatValue(), intValue2 / height);
            matrix.postScale(max, max);
            int width = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            C0fK.A03(bitmap);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height2, matrix, true);
            C14360o3.A07(createBitmap);
            matrix.setTranslate(-Math.max(0, (createBitmap.getWidth() - i3) / 2), -Math.max(0, (createBitmap.getHeight() - i4) / 2));
            c9Rz = new C9Rz(createBitmap, matrix, f2, i);
            c9Rz.setBounds(0, 0, i3, i4);
            this.A00 = Math.max(f4 / c9Rz.A00, f3 / c9Rz.A01);
        } else {
            if (z) {
                int i6 = 0;
                C09530e4 A00 = A00(bitmap);
                int intValue3 = ((Number) A00.A00).intValue();
                int intValue4 = ((Number) A00.A01).intValue();
                Bitmap bitmap2 = this.A01;
                if (bitmap2 != null) {
                    i2 = bitmap2.getWidth();
                } else {
                    i2 = 0;
                }
                Bitmap bitmap3 = this.A01;
                if (bitmap3 != null) {
                    i6 = bitmap3.getHeight();
                }
                int i7 = this.A0D;
                boolean z2 = C1NC.A02;
                Matrix matrix2 = new Matrix();
                C1NC.A0J(matrix2, i2, i6, intValue3, intValue4, i7, false);
                c9Rz = new C9Rz(bitmap, matrix2, this.A09, i);
            } else {
                c9Rz = new C9Rz(bitmap, null, this.A09, i);
            }
            int i8 = c9Rz.A01;
            int i9 = c9Rz.A00;
            int i10 = i9;
            c9Rz.setBounds(0, 0, i8, i9);
            if (i8 > i9) {
                f = this.A0B;
                i10 = i8;
            } else {
                f = this.A0A;
            }
            this.A00 = f / i10;
            this.A03 = AMF.A02(c8ok, i8, i9);
            int i11 = ((int) this.A08) * 2;
            this.A02 = AMF.A02(c8ok, i8 + i11, i9 + i11);
        }
        c9Rz.mutate().setAlpha(c9Rz.getAlpha());
        c9Rz.mutate().setColorFilter(c9Rz.getColorFilter());
        this.A04 = c9Rz;
        Iterator it = this.A0Q.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            ((InterfaceC25177BCa) it.next()).DQ0();
        }
        invalidateSelf();
    }

    public static final void A02(ImageUrl imageUrl, C202728xq c202728xq, boolean z) {
        String str;
        int i;
        int i2;
        Bitmap bitmap;
        Medium medium = c202728xq.A0N;
        if (medium.A05()) {
            str = medium.A0X;
        } else {
            str = medium.A0a;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = c202728xq.A0D;
        if (i3 != 90 && i3 != 270) {
            i = options.outWidth;
            i2 = options.outHeight;
        } else {
            i = options.outHeight;
            i2 = options.outWidth;
        }
        int i4 = 1;
        while (true) {
            int i5 = i4 * 2;
            if (i / i5 <= c202728xq.A0B && i2 / i5 <= c202728xq.A0A) {
                break;
            } else {
                i4 = i5;
            }
        }
        if (str != null) {
            imageUrl = AbstractC81033jX.A02(new File(str), -1, -1);
        } else if (imageUrl == null) {
            return;
        }
        if (z) {
            C4GT c4gt = new C4GT();
            C1OG A0J = C25821No.A00().A0J(imageUrl, null);
            A0J.A02(c4gt);
            A0J.A01 = i4;
            A0J.A01();
            try {
                c4gt.A01.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            C73033Pe c73033Pe = c4gt.A00;
            if (c73033Pe != null && (bitmap = c73033Pe.A01) != null) {
                c202728xq.A01(bitmap, true);
                return;
            }
            return;
        }
        C1OG A0J2 = C25821No.A00().A0J(imageUrl, null);
        A0J2.A02(c202728xq);
        A0J2.A01 = i4;
        A0J2.A01();
    }

    public final Path A03() {
        C09530e4 c09530e4;
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            c09530e4 = A00(bitmap);
        } else {
            c09530e4 = new C09530e4(0, 0);
        }
        return AbstractC225989yH.A00(this.A09, 0.0f, 0.0f, ((Number) c09530e4.A00).intValue(), ((Number) c09530e4.A01).intValue(), 15);
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A0Q.clear();
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return new C217899kM(this.A0N, this.A0B, this.A0A);
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A0F;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A06 = z;
        C6RL c6rl = this.A0F;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        if (this.A01 == null) {
            return this.A0O.A03;
        }
        C9Rz c9Rz = this.A04;
        if (c9Rz != null) {
            i = c9Rz.A00;
        } else {
            i = 0;
        }
        return C1H4.A01(i * this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i;
        if (this.A01 == null) {
            return this.A0O.A04;
        }
        C9Rz c9Rz = this.A04;
        if (c9Rz != null) {
            i = c9Rz.A01;
        } else {
            i = 0;
        }
        return C1H4.A01(i * this.A00);
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable mutate;
        C9Rz c9Rz = this.A04;
        if (c9Rz != null && (mutate = c9Rz.mutate()) != null) {
            mutate.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        this.A07 = colorFilter;
        C9Rz c9Rz = this.A04;
        if (c9Rz != null && (mutate = c9Rz.mutate()) != null) {
            mutate.setColorFilter(this.A07);
        }
        invalidateSelf();
    }

    private final C09530e4 A00(Bitmap bitmap) {
        int i;
        float f;
        int i2;
        float f2;
        float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
        int i3 = this.A0D;
        if (i3 != 0 && i3 != 180) {
            if (bitmap.getHeight() > bitmap.getWidth()) {
                i = this.A0B;
                f = i * width;
                i2 = (int) f;
            } else {
                i2 = this.A0A;
                f2 = i2 / width;
                i = (int) f2;
            }
        } else if (bitmap.getHeight() > bitmap.getWidth()) {
            i2 = this.A0A;
            f2 = i2 * width;
            i = (int) f2;
        } else {
            i = this.A0B;
            f = i / width;
            i2 = (int) f;
        }
        return new C09530e4(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean CaH(UserSession userSession) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
