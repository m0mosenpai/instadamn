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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202308xA extends Drawable implements C5RR, InterfaceC133125ze, InterfaceC133135zf {
    public static final List A0T;
    public static final List A0U;
    public static final Map A0V;
    public int A00;
    public Venue A01;
    public String A02;
    public String A03;
    public int[] A04;
    public int A05;
    public int A06;
    public int A07;
    public LinearGradient A08;
    public String A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final Resources A0I;
    public final Bitmap A0J;
    public final Bitmap A0K;
    public final Canvas A0L;
    public final Paint A0M;
    public final PorterDuffXfermode A0N;
    public final Rect A0O;
    public final RectF A0P;
    public final UserSession A0Q;
    public final EnumC223079sm A0R;
    public final Locale A0S;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        EnumC223079sm enumC223079sm = EnumC223079sm.A06;
        A0U = Arrays.asList(enumC223079sm, EnumC223079sm.A0D, EnumC223079sm.A0B);
        A0T = Arrays.asList(EnumC223079sm.A07, enumC223079sm, EnumC223079sm.A08);
        A0V = new C25011B4l();
    }

    private void A00() {
        int i = this.A0E;
        int i2 = this.A0C;
        int width = i + i2 + this.A0J.getWidth() + this.A0D;
        this.A09 = this.A03;
        Paint paint = this.A0M;
        float f = this.A0A;
        paint.setTextSize(f);
        String str = this.A09;
        int length = str.length();
        Rect rect = this.A0O;
        paint.getTextBounds(str, 0, length, rect);
        int width2 = rect.width() + width;
        int i3 = this.A0B;
        if (width2 > i3) {
            float f2 = f * 0.9f;
            while (true) {
                if (f2 >= 0.5f * f) {
                    paint.setTextSize(f2);
                    String str2 = this.A09;
                    paint.getTextBounds(str2, 0, str2.length(), rect);
                    if (rect.width() + width <= i3) {
                        break;
                    } else {
                        f2 -= 0.1f * f;
                    }
                } else {
                    TextPaint textPaint = new TextPaint(paint);
                    textPaint.density = this.A0I.getDisplayMetrics().density;
                    String charSequence = TextUtils.ellipsize(this.A03, textPaint, i3 - width, TextUtils.TruncateAt.END).toString();
                    this.A09 = charSequence;
                    paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                    break;
                }
            }
        }
        this.A07 = Math.min(i3, rect.width() + width);
        this.A06 = Math.min(Math.abs(rect.top), (int) Math.abs(paint.getFontMetrics().ascent));
        this.A05 = (rect.height() + (i2 * 2)) - (this.A0F * 2);
    }

    public final void A02(Venue venue) {
        this.A01 = venue;
        String str = "";
        if (AbstractC172687md.A01(this.A0Q) && A0U.contains(this.A0R)) {
            if (venue.A00.getName() != null) {
                str = venue.A00.getName();
            }
            this.A03 = str;
        } else {
            if (venue.A00.getName() != null) {
                str = venue.A00.getName();
            }
            this.A03 = str.toUpperCase(this.A0S);
        }
        A00();
        invalidateSelf();
    }

    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        UserSession userSession = this.A0Q;
        Context context = this.A0H;
        int i = this.A0B;
        int round = Math.round(this.A0A);
        int i2 = this.A0C;
        int i3 = this.A04[0];
        C202308xA c202308xA = new C202308xA(context, userSession, null, new int[]{i3, i3}, i, round, i2, this.A00);
        Venue venue = this.A01;
        venue.getClass();
        c202308xA.A02(venue);
        c202308xA.A02 = str;
        return c202308xA;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        Venue venue = this.A01;
        if (venue != null) {
            return new C217869kJ(venue, null);
        }
        return null;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.A0M;
        paint.setColor(this.A00);
        RectF rectF = this.A0P;
        rectF.set(getBounds().centerX(), getBounds().centerY(), getBounds().centerX(), getBounds().centerY());
        rectF.inset((-this.A07) / 2, (-this.A05) / 2);
        float f = this.A0G;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(-1);
        paint.setShader(this.A08);
        String str = this.A09;
        int i = getBounds().left;
        Bitmap bitmap = this.A0J;
        int width = i + bitmap.getWidth();
        int i2 = this.A0E;
        canvas.drawText(str, width + i2 + this.A0D, getBounds().centerY() + (this.A06 / 2), paint);
        Bitmap bitmap2 = this.A0K;
        bitmap2.eraseColor(0);
        Canvas canvas2 = this.A0L;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(this.A0N);
        canvas2.save();
        float f2 = rectF.left + i2;
        List list = A0T;
        EnumC223079sm enumC223079sm = this.A0R;
        if (list.contains(enumC223079sm)) {
            paint.setColor(-1);
            float width2 = bitmap.getWidth();
            float height = bitmap.getHeight();
            enumC223079sm.getClass();
            paint.setShader(new LinearGradient(0.0f, 0.0f, width2, height, enumC223079sm.A03, AbstractC23047AEd.A00(), Shader.TileMode.REPEAT));
        } else {
            canvas2.translate(-f2, 0.0f);
        }
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode(null);
        canvas.drawBitmap(bitmap2, f2, getBounds().centerY() - (bitmap.getHeight() / 2), (Paint) null);
        paint.setShader(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public C202308xA(Context context, UserSession userSession, EnumC223079sm enumC223079sm, int[] iArr, int i, int i2, int i3, int i4) {
        Bitmap A00;
        int i5;
        this.A0N = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        Paint paint = new Paint(1);
        this.A0M = paint;
        this.A0O = new Rect();
        this.A0P = new RectF();
        this.A07 = -1;
        this.A05 = -1;
        this.A02 = "";
        this.A0Q = userSession;
        this.A0H = context;
        Resources resources = context.getResources();
        this.A0I = resources;
        this.A0R = enumC223079sm;
        this.A00 = i4;
        this.A04 = iArr;
        if (AbstractC172687md.A01(userSession)) {
            i2 = resources.getDimensionPixelSize(A0U.contains(enumC223079sm) ? R.dimen.avatar_search_sticker_tray_text_size : R.dimen.clips_template_landing_page_template_preview_clip_index_text_size);
        }
        float f = i2;
        this.A0A = f;
        paint.setTextSize(f);
        Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0V);
        Map map = A0V;
        if (map.containsKey(enumC223079sm) && AbstractC172687md.A01(userSession)) {
            A02 = AbstractC15960qq.A00(context).A02(((C6RQ) map.get(enumC223079sm)).A01);
        }
        paint.setTypeface(A02);
        if (AbstractC172687md.A01(userSession)) {
            Bitmap A002 = C6RR.A00(resources, R.drawable.instagram_location_pano_outline_24);
            int dimensionPixelSize = resources.getDimensionPixelSize(A0U.contains(enumC223079sm) ? R.dimen.abc_select_dialog_padding_start_material : R.dimen.abc_dialog_padding_material);
            A00 = C0fK.A00(A002, dimensionPixelSize, dimensionPixelSize, true);
        } else {
            A00 = C6RR.A00(resources, R.drawable.instagram_location_pano_filled_24);
        }
        this.A0J = A00;
        Bitmap createBitmap = Bitmap.createBitmap(A00.getWidth(), this.A0J.getHeight(), Bitmap.Config.ARGB_8888);
        this.A0K = createBitmap;
        this.A0L = new Canvas(createBitmap);
        this.A0S = resources.getConfiguration().locale;
        this.A03 = resources.getString(2131952313);
        this.A0B = i;
        this.A0C = i3;
        int i6 = i3 / 2;
        if (AbstractC172687md.A01(userSession)) {
            i5 = resources.getDimensionPixelSize(R.dimen.universal_location_sticker_icon_offset);
        } else {
            i5 = 0;
        }
        this.A0E = i5 + i6;
        this.A0D = i6 - resources.getDimensionPixelSize(R.dimen.universal_location_sticker_icon_offset);
        if (AbstractC172687md.A01(userSession) && A0U.contains(enumC223079sm)) {
            this.A0F = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        } else {
            this.A0F = 0;
        }
        this.A0G = resources.getDimensionPixelSize(AbstractC172687md.A01(userSession) ? R.dimen.account_discovery_bottom_gap : R.dimen.abc_button_inset_vertical_material);
        A00();
    }

    public static void A01(C202308xA c202308xA) {
        c202308xA.A08 = new LinearGradient(c202308xA.getBounds().centerX() - (c202308xA.A07 / 2), 0.0f, c202308xA.getBounds().centerX() + (c202308xA.A07 / 2), 0.0f, c202308xA.A04, (float[]) null, Shader.TileMode.REPEAT);
    }

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        int A01 = enumC222529rt.A01(i);
        this.A04 = new int[]{A01, A01};
        A01(this);
        invalidateSelf();
        this.A00 = enumC222529rt.A00(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A01(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202308xA(android.content.Context r11, com.instagram.common.session.UserSession r12, X.EnumC223079sm r13, int r14, int r15, int r16) {
        /*
            r10 = this;
            r4 = r13
            int[] r5 = r13.A04
            r2 = r11
            android.content.res.Resources r1 = r11.getResources()
            boolean r0 = r13.A01
            if (r0 != 0) goto L17
            r0 = 1
            r13.A01 = r0
            int r0 = r13.A02
            int r0 = r1.getColor(r0)
            r13.A00 = r0
        L17:
            int r9 = r13.A00
            r1 = r10
            r3 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202308xA.<init>(android.content.Context, com.instagram.common.session.UserSession, X.9sm, int, int, int):void");
    }
}
