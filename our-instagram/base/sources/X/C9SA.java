package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.R;

/* renamed from: X.9SA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SA extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Bitmap A09;
    public Bitmap A0A;
    public Canvas A0B;
    public LinearGradient A0C;
    public C190888ck A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public float A0H;
    public final int A0I;
    public final int A0J;
    public final Context A0K;
    public final Resources A0L;
    public final Paint A0M;
    public final PorterDuffXfermode A0N;
    public final RectF A0O;
    public final String A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final Bitmap A0T;
    public final LinearGradient A0U;
    public final Rect A0V;
    public final boolean A0W;

    public C9SA(Context context, String str, int i, int i2, boolean z) {
        float f;
        float f2;
        C14360o3.A0B(str, 4);
        this.A0K = context;
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A0L = A0M;
        this.A0N = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0M = A0S;
        this.A0V = AbstractC166987dD.A0U();
        this.A0O = AbstractC166987dD.A0X();
        this.A08 = -1;
        this.A04 = -1;
        this.A01 = 255;
        this.A02 = -1;
        this.A0G = true;
        this.A0P = str;
        float f3 = i2;
        this.A00 = f3;
        A0S.setTextSize(f3);
        C190888ck A01 = AbstractC190898cl.A01("modern", null, false);
        this.A0D = A01;
        A0S.setTypeface(AbstractC202838y1.A01(AbstractC15960qq.A00(context), A01.A05));
        this.A0S = context.getColor(R.color.sticker_subtle_light_background);
        this.A0R = i;
        this.A0I = AbstractC166997dE.A0A(A0M);
        this.A0Q = AbstractC166997dE.A08(A0M);
        this.A0J = AbstractC166997dE.A07(A0M);
        this.A0T = C6RR.A00(A0M, R.drawable.instagram_shopping_bag_pano_filled_24);
        this.A0W = z;
        A03(1.0f);
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            f = bitmap.getWidth();
        } else {
            f = 0.0f;
        }
        Bitmap bitmap2 = this.A09;
        if (bitmap2 != null) {
            f2 = bitmap2.getHeight();
        } else {
            f2 = 0.0f;
        }
        this.A0U = new LinearGradient(0.0f, 0.0f, f, f2, AbstractC23047AEd.A01(context), AbstractC23047AEd.A00(), Shader.TileMode.REPEAT);
        A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        EnumC190948cq enumC190948cq;
        int i;
        C14360o3.A0B(canvas, 0);
        A01();
        Paint paint = this.A0M;
        paint.setColor(this.A03);
        RectF rectF = this.A0O;
        rectF.set(AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this), AbstractC166997dE.A0F(this), AbstractC167007dF.A00(this));
        rectF.inset((-this.A08) / 2, (-this.A04) / 2);
        float f = this.A0J;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(this.A07);
        paint.setAlpha(this.A01);
        C190888ck c190888ck = this.A0D;
        if (c190888ck != null) {
            enumC190948cq = c190888ck.A05;
        } else {
            enumC190948cq = null;
        }
        paint.setTypeface(AbstractC202838y1.A01(AbstractC15960qq.A00(this.A0K), enumC190948cq));
        String str = this.A0F;
        if (str != null) {
            int A0E = AbstractC166987dD.A0E(this);
            Bitmap bitmap = this.A09;
            if (bitmap != null) {
                i = bitmap.getWidth();
            } else {
                i = 0;
            }
            canvas.drawText(str, A0E + i + this.A0I + this.A05, getBounds().centerY() + (this.A06 / 2), paint);
        }
        Bitmap bitmap2 = this.A0A;
        if (bitmap2 != null && this.A0B != null) {
            bitmap2.eraseColor(0);
            Canvas canvas2 = this.A0B;
            if (canvas2 != null) {
                Bitmap bitmap3 = this.A09;
                if (bitmap3 != null) {
                    canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        paint.setXfermode(this.A0N);
        Canvas canvas3 = this.A0B;
        if (canvas3 != null) {
            canvas3.save();
            float f2 = rectF.left + this.A0I;
            if (this.A0C != null) {
                paint.setColor(-1);
                paint.setShader(this.A0C);
            } else {
                Canvas canvas4 = this.A0B;
                if (canvas4 != null) {
                    canvas4.translate(-f2, 0.0f);
                }
            }
            Canvas canvas5 = this.A0B;
            if (canvas5 != null) {
                canvas5.drawPaint(paint);
            }
            Canvas canvas6 = this.A0B;
            if (canvas6 != null) {
                canvas6.restore();
            }
            paint.setXfermode(null);
            paint.setAlpha(this.A01);
            Bitmap bitmap4 = this.A0A;
            if (bitmap4 != null) {
                int centerY = getBounds().centerY();
                if (this.A09 != null) {
                    canvas.drawBitmap(bitmap4, f2, centerY - (r0.getHeight() / 2), paint);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            paint.setShader(null);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final int A00(float f) {
        int i = this.A0I * 2;
        if (this.A09 != null) {
            return i + ((int) ((r0.getWidth() + this.A0Q) * (f / this.A00)));
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r5 = this;
            java.lang.String r4 = r5.A0P
            int r0 = r4.hashCode()
            r3 = -16738826(0xffffffffff0095f6, float:-1.7091983E38)
            r2 = 0
            r1 = -1
            switch(r0) {
                case -1247020320: goto L24;
                case -704237492: goto L2a;
                case -469877654: goto L2d;
                case -221789064: goto L33;
                case 177933206: goto L36;
                case 584812081: goto L39;
                case 729142062: goto L4a;
                case 761099283: goto L4d;
                case 1384334763: goto L5c;
                case 1652005773: goto L30;
                case 2091518821: goto L21;
                case 2099890091: goto L27;
                default: goto Le;
            }
        Le:
            r5.A03 = r1
            int r0 = r5.A02
            if (r0 == r1) goto L15
            r3 = r0
        L15:
            r5.A07 = r3
            android.graphics.Paint r1 = r5.A0M
            int r0 = r5.A01
            r1.setAlpha(r0)
        L1e:
            r5.A0C = r2
            return
        L21:
            java.lang.String r0 = "product_item_text_sticker_subtle"
            goto L5e
        L24:
            java.lang.String r0 = "seller_collection_text_sticker_subtle"
            goto L5e
        L27:
            java.lang.String r0 = "multi_product_item_text_sticker_black_white"
            goto L3b
        L2a:
            java.lang.String r0 = "storefront_text_sticker_black_white"
            goto L3b
        L2d:
            java.lang.String r0 = "storefront_text_sticker_subtle"
            goto L5e
        L30:
            java.lang.String r0 = "multi_product_item_text_sticker_media_primary_color"
            goto L4f
        L33:
            java.lang.String r0 = "seller_collection_text_sticker_media_primary_color"
            goto L4f
        L36:
            java.lang.String r0 = "seller_collection_text_sticker_black_white"
            goto L3b
        L39:
            java.lang.String r0 = "product_item_text_sticker_black_white"
        L3b:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            r5.A03 = r1
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.A07 = r0
            android.graphics.LinearGradient r2 = r5.A0U
            goto L1e
        L4a:
            java.lang.String r0 = "storefront_text_sticker_media_primary_color"
            goto L4f
        L4d:
            java.lang.String r0 = "product_item_text_sticker_media_primary_color"
        L4f:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            r5.A03 = r1
            int r0 = r5.A02
            r5.A07 = r0
            goto L1e
        L5c:
            java.lang.String r0 = "multi_product_item_text_sticker_subtle"
        L5e:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            int r0 = r5.A0S
            r5.A03 = r0
            r5.A07 = r1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SA.A01():void");
    }

    private final void A02() {
        Rect rect;
        int length;
        this.A0F = this.A0E;
        Paint paint = this.A0M;
        paint.setTextSize(this.A00);
        String str = this.A0F;
        if (str != null && (length = str.length()) != 0) {
            rect = this.A0V;
            paint.getTextBounds(str, 0, length, rect);
        } else {
            rect = this.A0V;
            paint.getTextBounds("A", 0, 1, rect);
        }
        int width = rect.width() + A00(this.A00);
        int i = this.A0R;
        if (width > i) {
            if (this.A0G && this.A0F != null) {
                float f = this.A00;
                float f2 = f * 0.9f;
                while (Float.compare(f2, f * 0.5f) >= 0) {
                    paint.setTextSize(f2);
                    String str2 = this.A0F;
                    if (str2 != null) {
                        paint.getTextBounds(str2, 0, str2.length(), rect);
                    }
                    if (rect.width() + A00(f2) <= i) {
                        break;
                    }
                    f = this.A00;
                    f2 -= 0.1f * f;
                }
            }
            TextPaint textPaint = new TextPaint(paint);
            textPaint.density = this.A0L.getDisplayMetrics().density;
            String str3 = this.A0E;
            if (str3 == null) {
                str3 = "";
            }
            String obj = TextUtils.ellipsize(str3, textPaint, i - A00(textPaint.getTextSize()), TextUtils.TruncateAt.END).toString();
            this.A0F = obj;
            if (obj != null) {
                paint.getTextBounds(obj, 0, obj.length(), rect);
            }
        }
        int width2 = rect.width() + A00(paint.getTextSize());
        if (i > width2) {
            i = width2;
        }
        this.A08 = i;
        int abs = Math.abs(rect.top);
        int abs2 = (int) Math.abs(paint.getFontMetrics().ascent);
        if (abs > abs2) {
            abs = abs2;
        }
        this.A06 = abs;
        this.A04 = rect.height() + (this.A0I * 2);
        A03(paint.getTextSize() / this.A00);
    }

    private final void A03(float f) {
        Bitmap bitmap;
        if (this.A09 != null && Float.compare(f, this.A0H) == 0) {
            return;
        }
        this.A0H = f;
        if (this.A0W) {
            f *= 0.8f;
        }
        int compare = Float.compare(f, 1.0f);
        Bitmap bitmap2 = this.A0T;
        if (compare != 0) {
            bitmap2 = C0fK.A00(bitmap2, (int) (bitmap2.getWidth() * f), (int) (bitmap2.getHeight() * f), false);
        }
        this.A09 = bitmap2;
        Canvas canvas = null;
        if (bitmap2 != null) {
            bitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmap = null;
        }
        this.A0A = bitmap;
        if (bitmap != null) {
            canvas = new Canvas(bitmap);
        }
        this.A0B = canvas;
        this.A05 = (int) (this.A0Q * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C190888ck r4) {
        /*
            r3 = this;
            r3.A0D = r4
            android.graphics.Paint r2 = r3.A0M
            X.8cq r1 = r4.A05
            android.content.Context r0 = r3.A0K
            X.0qs r0 = X.AbstractC15960qq.A00(r0)
            android.graphics.Typeface r0 = X.AbstractC202838y1.A01(r0, r1)
            r2.setTypeface(r0)
            java.lang.String r1 = r4.A09
            int r0 = r1.hashCode()
            switch(r0) {
                case -1631834134: goto L2e;
                case -409434162: goto L31;
                case -17506012: goto L34;
                case 3347760: goto L37;
                case 1544803905: goto L45;
                default: goto L1c;
            }
        L1c:
            android.content.res.Resources r1 = r3.A0L
            r0 = 2131165692(0x7f0701fc, float:1.7945608E38)
        L21:
            float r0 = X.AbstractC166987dD.A04(r1, r0)
            r3.A00 = r0
            r3.A02()
            r3.invalidateSelf()
            return
        L2e:
            java.lang.String r0 = "directional"
            goto L47
        L31:
            java.lang.String r0 = "typewriter_v2"
            goto L39
        L34:
            java.lang.String r0 = "strong_v2"
            goto L47
        L37:
            java.lang.String r0 = "meme"
        L39:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            android.content.res.Resources r1 = r3.A0L
            r0 = 2131165693(0x7f0701fd, float:1.794561E38)
            goto L21
        L45:
            java.lang.String r0 = "default"
        L47:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            android.content.res.Resources r1 = r3.A0L
            r0 = 2131165579(0x7f07018b, float:1.794538E38)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SA.A04(X.8ck):void");
    }

    public final void A05(String str, int i) {
        this.A0E = str;
        String str2 = this.A0P;
        if (!C14360o3.A0K(str2, "product_item_text_sticker_media_primary_color") && !C14360o3.A0K(str2, "multi_product_item_text_sticker_media_primary_color") && !C14360o3.A0K(str2, "seller_collection_text_sticker_media_primary_color") && !C14360o3.A0K(str2, "storefront_text_sticker_media_primary_color")) {
            this.A02 = i;
        }
        A02();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }
}
