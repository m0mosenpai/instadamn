package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import com.facebook.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.8xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202348xE extends Drawable implements InterfaceC133125ze {
    public final Product A01() {
        Product product;
        if (this instanceof C221089pW) {
            Product product2 = ((C221089pW) this).A03;
            product2.getClass();
            return product2;
        }
        if (this instanceof C221099pX) {
            product = ((C221099pX) this).A01;
        } else if (this instanceof C221079pV) {
            product = ((C221079pV) this).A05;
        } else {
            product = ((C221069pU) this).A02;
        }
        if (product != null) {
            return product;
        }
        C14360o3.A0F("_product");
        throw C00O.createAndThrow();
    }

    public final String A02() {
        if (this instanceof C221089pW) {
            return "product_item_visual_sticker";
        }
        if (this instanceof C221099pX) {
            return ((C221099pX) this).A05;
        }
        if (this instanceof C221079pV) {
            return ((C221079pV) this).A0F;
        }
        return ((C221069pU) this).A0C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(Product product, String str, int i, boolean z) {
        ExtendedImageUrl extendedImageUrl;
        ExtendedImageUrl extendedImageUrl2;
        C221069pU c221069pU;
        C221069pU c221069pU2;
        C1OG c1og;
        String str2;
        String str3;
        if (this instanceof C221099pX) {
            C221099pX c221099pX = (C221099pX) this;
            c221099pX.A01 = product;
            c221099pX.A03 = z;
            String str4 = product.A0J;
            if (str != null) {
                str3 = str.toUpperCase(C1Q2.A02());
                C14360o3.A07(str3);
            } else {
                if (str4 != null) {
                    str3 = str4.toUpperCase(C1Q2.A02());
                    C14360o3.A07(str3);
                } else {
                    str3 = null;
                }
                C14360o3.A0A(str3);
            }
            c221099pX.A04.A05(str3, i);
            return;
        }
        if (this instanceof C221089pW) {
            C221089pW c221089pW = (C221089pW) this;
            c221089pW.A03 = product;
            if (str == null) {
                str = product.A0J;
            }
            c221089pW.A04 = str;
            c221089pW.A00 = i;
            c221089pW.A05 = z;
            if (z) {
                c221089pW.A0H.reset();
                c221089pW.A0G.reset();
            }
            Paint paint = c221089pW.A0F;
            Context context = c221089pW.A0B;
            paint.setColor(context.getColor(AbstractC53242c7.A04(context)));
            paint.setStyle(Paint.Style.FILL);
            Path path = c221089pW.A0H;
            float f = c221089pW.A09;
            RectF rectF = new RectF(0.0f, 0.0f, f, f);
            float f2 = c221089pW.A08;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, f2, f2, direction);
            String str5 = c221089pW.A04;
            if (str5 != null) {
                c221089pW.A0J.A0M(str5);
            }
            C6RB c6rb = c221089pW.A0J;
            int color = context.getColor(R.color.grey_9);
            int i2 = -1;
            int i3 = c221089pW.A00;
            if (i3 != -1) {
                color = AbstractC13950nL.A08(i3, 1.0f);
            }
            c6rb.A0F(color);
            C6RB c6rb2 = c221089pW.A0I;
            boolean z2 = c221089pW.A0L;
            Product product2 = c221089pW.A03;
            if (z2) {
                User user = product2.A0B;
                user.getClass();
                str2 = user.A03.getUsername();
            } else {
                str2 = product2.A0L;
            }
            str2.getClass();
            c6rb2.A0M(str2);
            int color2 = context.getColor(R.color.grey_5);
            int i4 = c221089pW.A00;
            if (i4 != -1) {
                color2 = AbstractC13950nL.A08(i4, 1.0f);
            }
            c6rb2.A0F(color2);
            c221089pW.A01 = c221089pW.A0A + Math.max(c6rb.A0A, c6rb2.A0A);
            c221089pW.A0D.setColor(-1);
            Paint paint2 = c221089pW.A0C;
            int i5 = c221089pW.A00;
            if (i5 != -1) {
                i2 = i5;
            }
            paint2.setColor(i2);
            Path path2 = c221089pW.A0G;
            RectF rectF2 = new RectF(0.0f, 0.0f, c221089pW.A01, c221089pW.A07);
            float f3 = c221089pW.A06;
            path2.addRoundRect(rectF2, f3, f3, direction);
            Bitmap bitmap = c221089pW.A02;
            c221069pU = c221089pW;
            if (bitmap == null) {
                ImageInfo imageInfo = c221089pW.A03.A08;
                c221069pU = c221089pW;
                if (imageInfo != null) {
                    C25821No A00 = C25821No.A00();
                    ExtendedImageUrl A02 = AbstractC40161tk.A02(imageInfo);
                    A02.getClass();
                    c1og = A00.A0J(A02, null);
                    c221069pU2 = c221089pW;
                    c1og.A02(c221069pU2);
                    c1og.A01();
                    c221069pU = c221069pU2;
                }
            }
            c221069pU.invalidateSelf();
        }
        if (this instanceof C221079pV) {
            C221079pV c221079pV = (C221079pV) this;
            c221079pV.A05 = product;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(product.A0J);
            C6RB c6rb3 = c221079pV.A04;
            if (product.A04()) {
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AbstractC41758IeZ.A01(c221079pV.A0B, c221079pV.A0C.getDimensionPixelSize(R.dimen.abc_control_corner_material)));
                SpannableStringBuilder append2 = spannableStringBuilder.append((CharSequence) append);
                if (c6rb3.A08().A00(append2).getLineCount() <= 1) {
                    C14360o3.A0A(append2);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    StaticLayout A002 = c6rb3.A08().A00(spannableStringBuilder2);
                    C14360o3.A07(A002);
                    append2 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, (A002.getLineEnd(0) - "…".length()) - append.length())).append((CharSequence) "…").append((CharSequence) append);
                    C14360o3.A07(append2);
                }
                spannableStringBuilder = append2;
            }
            c6rb3.A0L(spannableStringBuilder);
            C6RB c6rb4 = c221079pV.A03;
            String str6 = product.A0L;
            if (str6 == null) {
                str6 = "";
            }
            c6rb4.A0M(str6);
            int i6 = c221079pV.A07;
            int i7 = c221079pV.A09;
            c221079pV.A00 = i6 + i7 + c6rb3.A06 + c221079pV.A08 + c6rb4.A06 + i7;
            ImageInfo imageInfo2 = product.A08;
            if (imageInfo2 != null) {
                extendedImageUrl2 = AbstractC40161tk.A02(imageInfo2);
            } else {
                extendedImageUrl2 = null;
            }
            c221069pU = c221079pV;
            if (!AbstractC81033jX.A03(extendedImageUrl2)) {
                if (extendedImageUrl2 != null) {
                    c1og = C25821No.A00().A0J(extendedImageUrl2, null);
                    c221069pU2 = c221079pV;
                    c1og.A02(c221069pU2);
                    c1og.A01();
                    c221069pU = c221069pU2;
                }
            } else {
                Context context2 = c221079pV.A0B;
                c221079pV.A01 = context2.getColor(AbstractC53242c7.A04(context2));
                Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
                C14360o3.A07(createBitmap);
                C221079pV.A00(createBitmap, c221079pV);
                c221069pU = c221079pV;
            }
        } else {
            C221069pU c221069pU3 = (C221069pU) this;
            c221069pU3.A02 = product;
            C9S7 c9s7 = c221069pU3.A0B;
            String str7 = product.A0J;
            ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
            String str8 = productDetailsProductItemDict.A0V;
            if (str8 == null) {
                str8 = productDetailsProductItemDict.A0T;
            }
            if (str7 != null) {
                c9s7.A0B.A0M(str7);
            }
            if (str8 != null) {
                c9s7.A0C.A0M(str8);
            }
            int i8 = c9s7.A0A;
            int i9 = c9s7.A0B.A0A;
            int i10 = c9s7.A09;
            if (i9 < i10) {
                i9 = i10;
            }
            int i11 = i8 + i9;
            c9s7.A00 = i11;
            c9s7.A02 = new RectF(0.0f, 0.0f, i11, c9s7.A05);
            c9s7.invalidateSelf();
            ImageInfo imageInfo3 = product.A08;
            if (imageInfo3 != null) {
                extendedImageUrl = AbstractC40161tk.A02(imageInfo3);
            } else {
                extendedImageUrl = null;
            }
            if (!AbstractC81033jX.A03(extendedImageUrl)) {
                if (extendedImageUrl == null) {
                    return;
                }
                C1OG A0J = C25821No.A00().A0J(extendedImageUrl, null);
                A0J.A02(c221069pU3);
                A0J.A01();
                return;
            }
            Context context3 = c221069pU3.A08;
            c221069pU3.A00 = context3.getColor(AbstractC53242c7.A04(context3));
            int i12 = c221069pU3.A05;
            Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
            C14360o3.A07(createBitmap2);
            C9Rz A003 = AbstractC23114AHd.A00(createBitmap2, c221069pU3.A03, i12, i12);
            A003.setCallback(c221069pU3);
            c221069pU3.A01 = A003;
            c221069pU = c221069pU3;
        }
        c221069pU.invalidateSelf();
    }
}
