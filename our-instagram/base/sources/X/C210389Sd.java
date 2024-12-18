package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;
import java.util.Locale;

/* renamed from: X.9Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210389Sd extends Drawable implements C5RQ {
    public float A00;
    public int A01;
    public int A02;
    public Integer A03;
    public C09530e4 A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Rect A08;
    public final Rect A09;
    public final TextPaint A0A;
    public final AnonymousClass693 A0B;
    public final C09530e4 A0C;
    public final C09530e4 A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final Resources A0J;
    public final Rect A0K;
    public final TextPaint A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final C09530e4 A0P;

    public C210389Sd(Context context, String str, String str2, int i, int i2, int i3) {
        int i4;
        this.A0I = context;
        this.A0N = str;
        this.A0H = i;
        this.A0G = i2;
        this.A07 = i3;
        this.A0M = str2;
        Resources resources = context.getResources();
        this.A0J = resources;
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        float f = i;
        int A0B = AbstractC166987dD.A0B(f, 0.85f);
        float f2 = i2;
        int A0B2 = AbstractC166987dD.A0B(f2, 0.228125f);
        int A0B3 = AbstractC166987dD.A0B(f, 0.1f);
        int A0B4 = AbstractC166987dD.A0B(f2, 0.65f);
        int i5 = this.A06;
        Rect A0V = AbstractC166987dD.A0V(A0B, A0B2, A0B + i5, i5 + A0B2);
        this.A08 = A0V;
        int i6 = this.A06;
        this.A09 = AbstractC166987dD.A0V(A0B3, A0B4, A0B3 + i6, i6 + A0B4);
        AnonymousClass693 A00 = C68U.A00(context, R.raw.clips_watermark);
        if (A00 != null) {
            A00.setBounds(A0V);
            A00.A01(255);
        } else {
            C0w9.A03("ClipsWatermarkDrawableV2", "Failed to render clips watermark when downloading video, because Keyframes drawable was null");
            A00 = null;
        }
        this.A0B = A00;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        this.A0O = AnonymousClass001.A0D(AbstractC166997dE.A10(Locale.ROOT, str), '@');
        int A08 = AbstractC166997dE.A08(resources);
        int length = str.length();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAlpha(0);
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AbstractC166987dD.A04(resources, R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0.0f, 0.0f, AbstractC167007dF.A09(context, R.attr.igds_color_shadow_on_media));
        Paint.Align align = Paint.Align.RIGHT;
        textPaint.setTextAlign(align);
        if (length <= 14) {
            i4 = R.dimen.action_bar_item_spacing_right;
        } else if (length <= 17) {
            i4 = R.dimen.achievements_only_you_top_margin;
        } else if (length <= 24) {
            i4 = R.dimen.account_discovery_bottom_gap;
        } else {
            i4 = R.dimen.abc_edit_text_inset_top_material;
            if (length <= 27) {
                i4 = R.dimen.album_music_sticker_text_vertical_padding;
            }
        }
        textPaint.setTextSize(AbstractC166987dD.A04(resources, i4));
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0W));
        this.A0A = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setAlpha(0);
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AbstractC166987dD.A04(resources, R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0.0f, 0.0f, AbstractC167007dF.A09(context, R.attr.igds_color_shadow_on_media));
        textPaint2.setTextAlign(align);
        textPaint2.setTextSize(AbstractC166997dE.A0A(resources));
        textPaint2.setTypeface(AbstractC167017dG.A0S(context));
        this.A0L = textPaint2;
        this.A0F = AbstractC166997dE.A09(resources);
        float f3 = f * 0.28155f;
        float min = str2 != null ? Math.min(0.0f, f3 - textPaint2.measureText(str2)) : 0.0f;
        this.A0E = min;
        int i7 = A0V.right - A08;
        this.A0K = AbstractC166987dD.A0V(C1H4.A01(i7 - f3), 0, i7, i2);
        float f4 = A0V.right - A08;
        C09530e4 A1L = AbstractC166987dD.A1L(Float.valueOf(f4), Float.valueOf(A0V.bottom + dimensionPixelSize));
        this.A0C = A1L;
        this.A0D = AbstractC166987dD.A1L(Float.valueOf(r5.left + A08), Float.valueOf(r5.bottom + dimensionPixelSize));
        this.A0P = AbstractC166987dD.A1L(Float.valueOf(f4 - min), Float.valueOf(r4 + dimensionPixelSize2));
        this.A04 = A1L;
        this.A03 = C05F.A00;
    }

    public static float A00(C210389Sd c210389Sd, float f, float f2) {
        return f2 + ((f - f2) * c210389Sd.A00);
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210389Sd.draw(android.graphics.Canvas):void");
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return -1;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        String str = this.A0N;
        String str2 = this.A0M;
        int i = this.A0H;
        int i2 = this.A0G;
        int i3 = this.A07;
        C14360o3.A0B(str, 1);
        Al1 al1 = new Al1();
        al1.A04 = str;
        al1.A03 = str2;
        al1.A01 = i;
        al1.A00 = i2;
        al1.A02 = i3;
        return al1;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        TextPaint textPaint;
        Paint.Align align;
        int i3 = i - this.A02;
        this.A01 = i3;
        Integer num = this.A03;
        boolean z = false;
        if (i3 >= ADO.A00(num)) {
            z = true;
        }
        boolean z2 = false;
        if (ADO.A00(ADO.A01(num)) + i + C8S8.DEFAULT_SWIPE_ANIMATION_DURATION >= this.A07) {
            z2 = true;
        }
        if (z && !z2) {
            Integer A01 = ADO.A01(this.A03);
            this.A03 = A01;
            this.A02 = i;
            this.A01 = 0;
            if (A01 == C05F.A15) {
                this.A05 = true;
                C09530e4 c09530e4 = this.A04;
                C09530e4 c09530e42 = this.A0C;
                boolean A0K = C14360o3.A0K(c09530e4, c09530e42);
                AnonymousClass693 anonymousClass693 = this.A0B;
                if (A0K) {
                    if (anonymousClass693 != null) {
                        anonymousClass693.setBounds(this.A09);
                    }
                    this.A04 = this.A0D;
                    textPaint = this.A0A;
                    align = Paint.Align.LEFT;
                } else {
                    if (anonymousClass693 != null) {
                        anonymousClass693.setBounds(this.A08);
                    }
                    this.A04 = c09530e42;
                    textPaint = this.A0A;
                    align = Paint.Align.RIGHT;
                }
                textPaint.setTextAlign(align);
            }
        }
        this.A00 = AbstractC13600mm.A00(this.A01 / ADO.A00(this.A03), 0.0f, 1.0f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        AnonymousClass693 anonymousClass693 = this.A0B;
        if (anonymousClass693 != null) {
            return anonymousClass693.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AnonymousClass693 anonymousClass693 = this.A0B;
        if (anonymousClass693 != null) {
            anonymousClass693.A01(i);
        }
        this.A0A.setAlpha(i);
        this.A0L.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        this.A0L.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
