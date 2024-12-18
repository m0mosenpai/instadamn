package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.8xI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202388xI extends Drawable implements C1NJ, InterfaceC133125ze {
    public Bitmap A00;
    public Bitmap A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final Paint A06;
    public final Product A07;
    public final Runnable A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Path A0J;
    public final Path A0K;
    public final Path A0L;
    public final Path A0M;
    public final Path A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Layout A0Q;
    public final TextPaint A0R;
    public final TextPaint A0S;
    public final String A0T;

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AbstractC111324zv.A00(260);
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

    public C202388xI(Context context, ImageUrl imageUrl, Product product, float f) {
        String str;
        int i;
        int i2;
        CharSequence ellipsize;
        TextPaint textPaint = new TextPaint(1);
        this.A0S = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A0R = textPaint2;
        this.A06 = new Paint(3);
        this.A05 = new Paint(3);
        Paint paint = new Paint(3);
        this.A0E = paint;
        Paint paint2 = new Paint(3);
        this.A0I = paint2;
        Paint paint3 = new Paint(3);
        this.A0G = paint3;
        Paint paint4 = new Paint(3);
        this.A0H = paint4;
        Paint paint5 = new Paint(3);
        this.A0F = paint5;
        Rect rect = new Rect();
        this.A0P = rect;
        Rect rect2 = new Rect();
        this.A0O = rect2;
        Path path = new Path();
        this.A0K = path;
        Path path2 = new Path();
        this.A0M = path2;
        Path path3 = new Path();
        this.A0L = path3;
        Path path4 = new Path();
        this.A0J = path4;
        Path path5 = new Path();
        this.A0N = path5;
        this.A08 = new RunnableC24309AqE(this);
        this.A07 = product;
        String str2 = product.A0J;
        str2 = str2 == null ? "" : str2;
        User user = product.A0B;
        if (user != null) {
            str = user.A03.getUsername();
        } else {
            str = null;
        }
        String string = context.getString(2131970007, str);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(-1);
        paint2.setShadowLayer(14.0f, 0.0f, 0.0f, context.getColor(R.color.black_15_transparent));
        textPaint.setTextSize(AbstractC13880nE.A04(context, 14));
        textPaint.setColor(-16777216);
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A13));
        textPaint2.setTextSize(AbstractC13880nE.A04(context, 14));
        textPaint2.setColor(context.getColor(R.color.grey_5));
        paint3.setColor(-16777216);
        paint4.setColor(context.getColor(AbstractC53242c7.A04(context)));
        paint4.setStyle(style);
        paint5.setColor(context.getColor(R.color.grey_2));
        paint5.setStyle(style);
        Pattern pattern = AbstractC13670mt.A00;
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        textPaint.getTextBounds(str2, 0, i, rect);
        if (string != null) {
            i2 = string.length();
        } else {
            i2 = 0;
        }
        textPaint2.getTextBounds(string, 0, i2, rect2);
        this.A03 = f;
        this.A02 = f;
        int A03 = (int) AbstractC13880nE.A03(context, 2.0f);
        float A04 = AbstractC13880nE.A04(context, 12);
        this.A0B = A04;
        float A042 = AbstractC13880nE.A04(context, 6);
        this.A0C = A042;
        float A043 = AbstractC13880nE.A04(context, 12);
        float A044 = AbstractC13880nE.A04(context, 34);
        this.A04 = A044;
        float f2 = A044 / 2.0f;
        float height = rect.height() + rect2.height() + (A04 * 2.0f) + A042;
        this.A0A = height;
        float A00 = AbstractC13880nE.A00(context, 0.5f);
        this.A09 = A00;
        float f3 = (A00 * 2.0f) + A044;
        this.A0D = f3;
        float f4 = f3 / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(new RectF(0.0f, 0.0f, f, f), new float[]{A043, A043, A043, A043, 0.0f, 0.0f, 0.0f, 0.0f}, direction);
        path2.addCircle(f2, f2, f2, direction);
        path3.addCircle(f4, f4, f4, direction);
        path4.addRoundRect(new RectF(0.0f, 0.0f, f, height), new float[]{0.0f, 0.0f, 0.0f, 0.0f, A043, A043, A043, A043}, direction);
        path5.addRoundRect(new RectF(0.0f, 0.0f, f, f + height), A043, A043, direction);
        float f5 = (f - A044) - (A04 * 3.0f);
        C57482kN c57482kN = new C57482kN(Layout.Alignment.ALIGN_NORMAL, textPaint, null, 0.0f, 1.0f, (int) f5, false);
        if (product.A04()) {
            ellipsize = AbstractC41758IeZ.A04(context, c57482kN, str2, A03, 1);
        } else {
            ellipsize = TextUtils.ellipsize(str2, textPaint, f5, TextUtils.TruncateAt.END);
        }
        this.A0T = TextUtils.ellipsize(string, textPaint2, f5, TextUtils.TruncateAt.END).toString();
        this.A0Q = c57482kN.A00(ellipsize);
        C25821No A002 = C25821No.A00();
        imageUrl.getClass();
        C1OG A0J = A002.A0J(imageUrl, null);
        A0J.A08 = "product_image";
        A0J.A02(this);
        A0J.A01();
        C25821No A003 = C25821No.A00();
        user.getClass();
        ImageUrl Bhu = user.A03.Bhu();
        Bhu.getClass();
        C1OG A0J2 = A003.A0J(Bhu, null);
        A0J2.A08 = "profile_pic";
        A0J2.A02(this);
        A0J2.A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.round(this.A02 + this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.round(this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A05.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A0S.setAlpha(i);
        this.A0R.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        this.A0S.setColorFilter(colorFilter);
        this.A0R.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap A00;
        Paint paint;
        Object C4x = interfaceC59502nt.C4x();
        if ("product_image".equals(C4x)) {
            Bitmap bitmap = c73033Pe.A01;
            bitmap.getClass();
            A00 = C0fK.A00(bitmap, Math.round(this.A03), Math.round(this.A02), true);
            this.A00 = A00;
            paint = this.A05;
        } else {
            if (!"profile_pic".equals(C4x)) {
                return;
            }
            Bitmap bitmap2 = c73033Pe.A01;
            bitmap2.getClass();
            int round = Math.round(this.A04);
            A00 = C0fK.A00(bitmap2, round, round, true);
            this.A01 = A00;
            paint = this.A06;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(A00, tileMode, tileMode));
        C11T.A02(this.A08);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawPath(this.A0N, this.A0I);
        Path path = this.A0K;
        if (this.A00 != null) {
            paint = this.A05;
        } else {
            paint = this.A0H;
        }
        canvas.drawPath(path, paint);
        float f = this.A02;
        float f2 = this.A09;
        float f3 = this.A03;
        Paint paint3 = this.A0F;
        canvas.drawRect(0.0f, f - f2, f3, f, paint3);
        canvas.translate(0.0f, f);
        canvas.drawPath(this.A0J, this.A0E);
        canvas.save();
        float f4 = this.A0B;
        float f5 = this.A0A / 2.0f;
        canvas.translate(f4 - f2, f5 - (this.A0D / 2.0f));
        canvas.drawPath(this.A0L, paint3);
        canvas.restore();
        canvas.save();
        float f6 = this.A04;
        canvas.translate(f4, f5 - (f6 / 2.0f));
        Path path2 = this.A0M;
        if (this.A01 != null) {
            paint2 = this.A06;
        } else {
            paint2 = this.A0H;
        }
        canvas.drawPath(path2, paint2);
        canvas.restore();
        canvas.save();
        float f7 = f6 + (f4 * 2.0f);
        Rect rect = this.A0P;
        float f8 = this.A0C;
        canvas.translate(f7, (f4 - rect.bottom) - (0.5f * f8));
        this.A0Q.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f7, ((f4 + rect.height()) + f8) - this.A0O.top);
        canvas.drawText(this.A0T, 0.0f, 0.0f, this.A0R);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
