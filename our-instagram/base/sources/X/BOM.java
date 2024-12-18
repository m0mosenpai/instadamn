package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class BOM extends Drawable {
    public Bitmap A00;
    public Bitmap A01;
    public JFY A02;
    public List A03;
    public Bitmap A04;
    public Paint A05;
    public Picture A06;
    public RectF A07;
    public Drawable A08;
    public final int A09;
    public final Context A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final RectF A0P;
    public final RectF A0Q;
    public final C1NJ A0R;
    public final C1NJ A0S;
    public final BP0 A0T;
    public final boolean A0U;

    public BOM(Context context, BP0 bp0, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        Paint paint;
        Drawable drawable;
        Drawable mutate;
        Drawable A01;
        Drawable mutate2;
        Bitmap createBitmap;
        C14360o3.A0B(context, 1);
        this.A0A = context;
        this.A0K = i2;
        this.A0I = i3;
        this.A0L = i5;
        this.A0T = bp0;
        this.A0U = z;
        this.A0R = new C25346BJp(this, 1);
        this.A0S = new C25346BJp(this, 2);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0O = A0S;
        this.A0M = AbstractC166987dD.A0S(1);
        this.A0P = AbstractC166987dD.A0X();
        this.A0Q = AbstractC166987dD.A0X();
        float f = i3;
        float f2 = f / 2.0f;
        this.A0G = f2;
        float f3 = i5;
        float f4 = f3 + f2;
        this.A0F = f4;
        int i7 = i - i3;
        this.A0H = i7;
        float f5 = i2 - i3;
        this.A0E = f5;
        this.A0C = AbstractC09440dt.A01(new C57526Pg0(this, 44));
        this.A09 = (i3 * 2) + i7 + (i5 * 2);
        this.A0B = AbstractC09440dt.A01(new C57526Pg0(this, 43));
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0N = A0S2;
        C17050sx A012 = AbstractC09440dt.A01(new C57526Pg0(this, 45));
        this.A0D = A012;
        int A0H = (i7 - AbstractC166987dD.A0H(A012.getValue())) / 2;
        this.A0J = A0H;
        if (i3 > 0) {
            this.A07 = AbstractC166987dD.A0X();
            paint = AbstractC166987dD.A0S(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f);
            paint.setColor(i4);
        } else {
            paint = null;
            this.A07 = null;
        }
        this.A05 = paint;
        if (bp0 != null) {
            int ordinal = bp0.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    AbstractC166987dD.A1R(A0S2);
                    AbstractC166987dD.A1N(context, A0S2, R.color.black_40_transparent);
                    Map map = AbstractC25485BOz.A02;
                    int A013 = AbstractC167027dH.A01(this.A0D);
                    float f6 = A0H;
                    boolean A1X = AbstractC167007dF.A1X(bp0, BP0.A05);
                    if (AbstractC25485BOz.A00 == null && (A01 = AbstractC85953sP.A01(context, R.drawable.instagram_music_pano_filled_24, R.color.audio_bar_action_color_enabled)) != null && (mutate2 = A01.mutate()) != null) {
                        mutate2.setBounds(0, 0, A013, A013);
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        if (A1X) {
                            createBitmap = Bitmap.createBitmap(i7, i7, config);
                            Canvas canvas = new Canvas(createBitmap);
                            float f7 = i7;
                            canvas.drawRoundRect(new RectF(0.0f, 0.0f, f7, f7), f5, f5, A0S2);
                            canvas.save();
                            canvas.translate(f6, f6);
                            mutate2.draw(canvas);
                            canvas.restore();
                        } else {
                            createBitmap = Bitmap.createBitmap(A013, A013, config);
                            mutate2.draw(new Canvas(createBitmap));
                        }
                        AbstractC25485BOz.A00 = createBitmap;
                    }
                    this.A04 = AbstractC25485BOz.A00;
                }
            } else {
                float f8 = i7 / 2.0f;
                int i8 = (int) f4;
                Map map2 = AbstractC25485BOz.A02;
                if (map2.get(bp0) == null) {
                    Picture picture = new Picture();
                    float f9 = f8 + f;
                    int i9 = (int) f9;
                    Canvas beginRecording = picture.beginRecording(i9, i9);
                    C14360o3.A07(beginRecording);
                    beginRecording.drawCircle(f8, f8, f8, AbstractC25485BOz.A01);
                    if (paint != null) {
                        float f10 = 2.0f * f8;
                        Paint paint2 = paint;
                        beginRecording.drawArc(new RectF(f2, f2, f10, f10), 180.0f, 90.0f, false, paint2);
                        float f11 = ((-2.0f) * f) + f2;
                        beginRecording.drawArc(new RectF(f8 - f, f11, f9, f2), 0.0f, 90.0f, false, paint2);
                        beginRecording.drawArc(new RectF(f11, f9 - (2.0f * f), f2, f9), 0.0f, 90.0f, false, paint2);
                    }
                    int i10 = i8 + ((int) f2);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                    Drawable drawable2 = context.getDrawable(R.drawable.instagram_music_pano_filled_24);
                    if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                        int i11 = dimensionPixelSize + i10;
                        mutate.setBounds(i10, i10, i11, i11);
                        mutate.setColorFilter(i4, PorterDuff.Mode.SRC_OVER);
                        mutate.draw(beginRecording);
                    }
                    picture.endRecording();
                    map2.put(bp0, picture);
                }
                this.A06 = (Picture) map2.get(bp0);
            }
        }
        AbstractC166987dD.A1N(context, A0S, R.color.cds_white_a20);
        if (i5 > 0 && i6 != -1) {
            if (i6 != 0) {
                drawable = BUU.A00(context, f3, i2);
            } else {
                int alpha = Color.alpha(637534208);
                drawable = new BUQ(AbstractC167017dG.A02(637534208, Math.min(alpha, Math.round((f3 / AbstractC13880nE.A04(context, 10)) * alpha))), f3, i2);
            }
        } else {
            drawable = null;
        }
        this.A08 = drawable;
        A01();
    }

    public static final void A02(Bitmap bitmap, BOM bom) {
        bom.A01 = null;
        bom.A00 = bitmap;
        bom.A01();
        bom.invalidateSelf();
    }

    public final void A04(ImageUrl imageUrl, JFY jfy) {
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = jfy;
        if (AbstractC81033jX.A03(imageUrl)) {
            A02((Bitmap) AbstractC166987dD.A17(this.A0C), this);
        } else {
            A02(null, this);
            if (imageUrl != null) {
                C1OG A0J = C25821No.A00().A0J(imageUrl, "AlbumArtDrawable");
                A0J.A02(this.A0R);
                A0J.A01();
            }
        }
        invalidateSelf();
    }

    public final void A05(List list) {
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
        if (AbstractC81033jX.A05(list)) {
            A02((Bitmap) AbstractC166987dD.A17(this.A0C), this);
            invalidateSelf();
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            A04((ImageUrl) list.get(0), null);
            return;
        }
        List subList = list.subList(0, Math.min(list.size(), 4));
        ArrayList A0q = AbstractC25230BEn.A0q(subList);
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            it.next();
            A0q.add(null);
        }
        this.A03 = A0q;
        for (Object obj : subList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            ImageUrl imageUrl = (ImageUrl) obj;
            if (imageUrl != null) {
                C1OG A0J = C25821No.A00().A0J(imageUrl, "AlbumArtDrawable");
                A0J.A08 = Integer.valueOf(i);
                A0J.A02(this.A0S);
                A0J.A01();
            }
            i = i2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A0T == BP0.A03) {
            Bitmap bitmap = this.A01;
            if (bitmap == null) {
                int i = this.A09;
                bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                A03(new Canvas(bitmap));
                this.A01 = bitmap;
            }
            C14360o3.A0A(bitmap);
            int i2 = this.A09;
            canvas.drawBitmap(bitmap, new Rect(0, 0, i2, i2), getBounds(), this.A0M);
            return;
        }
        A03(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if (this.A0U) {
            RectF rectF = this.A0Q;
            InterfaceC09390do interfaceC09390do = this.A0B;
            float A01 = AbstractC167027dH.A01(interfaceC09390do);
            float A012 = AbstractC167027dH.A01(interfaceC09390do);
            int i = this.A0H;
            rectF.set(A01, A012, i - AbstractC167027dH.A01(interfaceC09390do), i - AbstractC167027dH.A01(interfaceC09390do));
        }
        RectF rectF2 = this.A0P;
        float f = this.A0H;
        rectF2.set(0.0f, 0.0f, f, f);
        RectF rectF3 = this.A07;
        if (rectF3 != null) {
            rectF3.set(rect);
            float f2 = this.A0F;
            rectF3.inset(f2, f2);
        }
        invalidateSelf();
    }

    private final void A01() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f = this.A0H;
            matrix.setScale(f / width, f / height);
            matrix.mapRect(new RectF(0.0f, 0.0f, width, height));
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            this.A0M.setShader(bitmapShader);
        }
    }

    private final void A03(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        float f;
        float f2;
        float f3;
        Paint paint;
        Paint paint2;
        Bitmap bitmap;
        C65888Tvs c65888Tvs;
        int i;
        C65890Tvu c65890Tvu;
        BP0 bp0 = this.A0T;
        BP0 bp02 = BP0.A03;
        if (bp0 == bp02) {
            canvas.saveLayer(null, null);
        }
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        List list = this.A03;
        if (list != null && list.size() > 1) {
            int width = getBounds().width();
            int height = getBounds().height();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            C14360o3.A07(createBitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            int size = list.size();
            if (size != 2) {
                if (size != 3) {
                    if (size == 4) {
                        Bitmap bitmap2 = (Bitmap) list.get(0);
                        Bitmap bitmap3 = (Bitmap) list.get(1);
                        Bitmap bitmap4 = (Bitmap) list.get(2);
                        Bitmap bitmap5 = (Bitmap) list.get(3);
                        if (bitmap2 != null && bitmap3 != null && bitmap4 != null && bitmap5 != null) {
                            int i2 = width / 2;
                            int i3 = height / 2;
                            canvas2.drawBitmap(bitmap2, (Rect) null, new Rect(0, 0, i2, i3), (Paint) null);
                            canvas2.drawBitmap(bitmap3, (Rect) null, new Rect(i2, 0, width, i3), (Paint) null);
                            canvas2.drawBitmap(bitmap4, (Rect) null, new Rect(0, i3, i2, height), (Paint) null);
                            canvas2.drawBitmap(bitmap5, (Rect) null, new Rect(i2, i3, width, height), (Paint) null);
                        }
                        A02(null, this);
                    }
                    A02(createBitmap, this);
                } else {
                    Bitmap bitmap6 = (Bitmap) list.get(0);
                    Bitmap bitmap7 = (Bitmap) list.get(1);
                    Bitmap bitmap8 = (Bitmap) list.get(2);
                    if (bitmap6 != null && bitmap7 != null && bitmap8 != null) {
                        int i4 = width / 2;
                        canvas2.drawBitmap(A00(bitmap6), (Rect) null, new Rect(0, 0, i4, height), (Paint) null);
                        int i5 = height / 2;
                        canvas2.drawBitmap(bitmap7, (Rect) null, new Rect(i4, 0, width, i5), (Paint) null);
                        canvas2.drawBitmap(bitmap8, (Rect) null, new Rect(i4, i5, width, height), (Paint) null);
                        A02(createBitmap, this);
                    }
                    A02(null, this);
                    A02(createBitmap, this);
                }
            } else {
                Bitmap bitmap9 = (Bitmap) list.get(0);
                Bitmap bitmap10 = (Bitmap) list.get(1);
                if (bitmap9 != null && bitmap10 != null) {
                    int i6 = width / 2;
                    canvas2.drawBitmap(A00(bitmap9), (Rect) null, new Rect(0, 0, i6, height), (Paint) null);
                    canvas2.drawBitmap(A00(bitmap10), (Rect) null, new Rect(i6, 0, width, height), (Paint) null);
                    A02(createBitmap, this);
                }
                A02(null, this);
                A02(createBitmap, this);
            }
        }
        int i7 = getBounds().left;
        int i8 = this.A0L;
        int i9 = this.A0I;
        float f4 = i7 + i8 + i9;
        float f5 = getBounds().top + i8 + i9;
        canvas.save();
        canvas.translate(f4, f5);
        if (this.A0U) {
            Paint paint3 = new Paint(1);
            Bitmap bitmap11 = this.A00;
            if (bitmap11 != null) {
                c65888Tvs = new C65887Tvr(bitmap11).A00();
            } else {
                c65888Tvs = null;
            }
            int color = this.A0A.getColor(R.color.black_50_transparent);
            if (c65888Tvs != null) {
                i = c65888Tvs.A00(color);
            } else {
                i = color;
            }
            if (i == color) {
                i = color;
                if (c65888Tvs != null && (c65890Tvu = c65888Tvs.A01) != null) {
                    i = c65890Tvu.A05;
                }
            }
            paint3.setColor(i);
            paint3.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.DARKEN));
            rectF2 = this.A0P;
            f2 = this.A0E;
            canvas.drawRoundRect(rectF2, f2, f2, paint3);
            rectF = this.A0Q;
            f = getBounds().width();
            f3 = getBounds().height();
        } else {
            rectF = this.A0P;
            rectF2 = rectF;
            f = this.A0E;
            f2 = f;
            f3 = f;
        }
        if (this.A00 == null || (paint = this.A0M) == null) {
            paint = this.A0O;
        }
        canvas.drawRoundRect(rectF, f, f3, paint);
        if (bp0 != null) {
            int ordinal = bp0.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2 && (bitmap = this.A04) != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rectF2, this.A05);
                }
            } else {
                canvas.drawRoundRect(rectF2, f2, f2, this.A0N);
                Bitmap bitmap12 = this.A04;
                if (bitmap12 != null) {
                    float f6 = this.A0J;
                    InterfaceC09390do interfaceC09390do = this.A0D;
                    canvas.drawBitmap(bitmap12, (Rect) null, new RectF(f6, f6, f6 + ((Number) interfaceC09390do.getValue()).intValue(), ((Number) interfaceC09390do.getValue()).intValue() + f6), this.A05);
                }
            }
        }
        canvas.restore();
        RectF rectF3 = this.A07;
        if (rectF3 != null && (paint2 = this.A05) != null) {
            float f7 = this.A0K;
            C14360o3.A0A(paint2);
            canvas.drawRoundRect(rectF3, f7, f7, paint2);
        }
        if (bp0 == bp02) {
            Picture picture = this.A06;
            if (picture != null) {
                float f8 = (this.A0H / 2.0f) + i9 + this.A0G;
                canvas.translate(f8, f8);
                canvas.drawPicture(picture);
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A0N.setAlpha(i);
        this.A0M.setAlpha(i);
        Paint paint = this.A05;
        if (paint != null) {
            paint.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0N.setColorFilter(colorFilter);
        this.A0M.setColorFilter(colorFilter);
        Paint paint = this.A05;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public static final Bitmap A00(Bitmap bitmap) {
        int width = bitmap.getWidth() / 4;
        int width2 = bitmap.getWidth() / 2;
        int height = bitmap.getHeight();
        C0fK.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, width, 0, width2, height);
        C14360o3.A07(createBitmap);
        return createBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09;
    }
}
