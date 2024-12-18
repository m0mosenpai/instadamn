package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9SS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SS extends Drawable implements C5RP, Drawable.Callback, C1NJ, InterfaceC133125ze, InterfaceC202578xb {
    public Bitmap A00;
    public Bitmap A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Resources A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Path A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final Drawable A0K;
    public final Drawable A0L;
    public final UserSession A0M;
    public final C6RB A0N;
    public final C6RB A0O;
    public final C6RB A0P;
    public final C6RB A0Q;
    public final C1816383s A0R;
    public final boolean A0S;
    public final int A0T;
    public final Drawable A0U;
    public final CopyOnWriteArraySet A0V = new CopyOnWriteArraySet();

    public C9SS(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C1816383s c1816383s) {
        String str;
        CharSequence charSequence;
        Layout.Alignment alignment;
        BitmapDrawable bitmapDrawable;
        this.A0C = context;
        this.A0M = userSession;
        this.A0R = c1816383s;
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A0D = A0M;
        this.A0G = AbstractC166987dD.A0S(3);
        this.A0F = AbstractC166987dD.A0S(3);
        this.A0E = AbstractC166987dD.A0S(1);
        Path A0T = AbstractC166987dD.A0T();
        this.A0H = A0T;
        RectF A0X = AbstractC166987dD.A0X();
        this.A0J = A0X;
        int A00 = (int) (InterfaceC1812882f.A00(targetViewSizeProvider) * 0.8f);
        float f = A00;
        int i = (int) (f / 0.75f);
        this.A0S = AbstractC13620mo.A02(context);
        this.A06 = A00;
        this.A05 = i;
        String str2 = c1816383s.A04;
        if (str2 != null) {
            ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str2, A00, i);
            AHE ahe = c1816383s.A03;
            C14360o3.A07(ahe);
            AHE ahe2 = c1816383s.A02;
            float A08 = AbstractC166997dE.A08(A0M);
            this.A0T = AbstractC166997dE.A06(A0M);
            int A05 = AbstractC166997dE.A05(A0M);
            this.A02 = A05;
            this.A03 = AbstractC166997dE.A06(A0M);
            this.A04 = AbstractC166997dE.A08(A0M);
            int A02 = (int) AbstractC166987dD.A02(A05);
            this.A09 = A02;
            this.A0B = A0M.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            this.A0A = A0M.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            int i2 = A00 - (A05 * 2);
            this.A07 = i2;
            this.A08 = Color.argb(Math.round(38.25f), 0, 0, 0);
            RectF A0Y = AbstractC166987dD.A0Y(f, i);
            this.A0I = A0Y;
            float[] fArr = {A08, A08, A08, A08};
            AbstractC167017dG.A1X(fArr, A08);
            A0T.addRoundRect(A0Y, fArr, Path.Direction.CW);
            Drawable drawable = context.getDrawable(R.drawable.sticker_background_shadow);
            this.A0U = drawable;
            C14360o3.A0A(drawable);
            drawable.setCallback(this);
            float A04 = AbstractC166987dD.A04(this.A0D, R.dimen.abc_dialog_padding_material);
            this.A0J.set(0.0f, 0.0f, A04, A04);
            float f2 = i2;
            this.A0N = AbstractC166987dD.A0z(context, (int) ((f2 - A0X.width()) - A02));
            String A01 = ahe.A01();
            if (ahe2 != null) {
                str = ahe2.A01();
            } else {
                str = null;
            }
            int i3 = c1816383s.A00;
            if (i3 > 0) {
                charSequence = AbstractC07900bA.A02(this.A0C.getResources(), new String[]{A01, String.valueOf(i3)}, R.plurals.standalone_fundraiser_with_cohost_label, i3);
            } else if (str != null && str.length() != 0 && !str.equals(A01)) {
                charSequence = AbstractC07900bA.A01(this.A0C.getResources(), new String[]{A01, str}, 2131974372);
            } else {
                this.A0N.A0J(Typeface.SANS_SERIF, 1);
                charSequence = A01;
            }
            C6RB c6rb = this.A0N;
            AbstractC166997dE.A1B(this.A0D, c6rb, R.dimen.account_discovery_bottom_gap);
            c6rb.A0F(-1);
            c6rb.A0D(10.0f, 0.0f, 0.0f, this.A08);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            c6rb.A0K(alignment2);
            c6rb.A0O = true;
            c6rb.A0M(charSequence);
            int i4 = (int) (f2 * 0.8f);
            C6RB A0z = AbstractC166987dD.A0z(context, i4);
            this.A0Q = A0z;
            Resources resources = this.A0D;
            AbstractC166997dE.A1B(resources, A0z, R.dimen.album_preview_add_item_margin);
            A0z.A0B(AbstractC166987dD.A04(resources, R.dimen.standalone_fundraiser_sticker_title_text_line_spacing), 1.0f);
            A0z.A0J(AbstractC167017dG.A0S(this.A0C), 1);
            A0z.A0F(-1);
            A0z.A0D(10.0f, 0.0f, 0.0f, this.A08);
            A0z.A0K(this.A0S ? Layout.Alignment.ALIGN_OPPOSITE : alignment2);
            A0z.A0G(3, "…");
            A0z.A0O = true;
            A0z.A0M(this.A0R.A09);
            C6RB A0z2 = AbstractC166987dD.A0z(context, i4);
            this.A0O = A0z2;
            AbstractC166997dE.A1B(this.A0D, A0z2, R.dimen.account_discovery_bottom_gap);
            Typeface typeface = Typeface.SANS_SERIF;
            A0z2.A0J(typeface, 1);
            A0z2.A0F(-1);
            A0z2.A0D(10.0f, 0.0f, 0.0f, this.A08);
            if (this.A0S) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            A0z2.A0K(alignment);
            A0z2.A0O = true;
            String str3 = this.A0R.A06;
            if (str3 != null) {
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                A0z2.A0M(AbstractC166997dE.A10(locale, str3));
                this.A0L = context.getDrawable(R.drawable.standalone_fundraiser_sticker_donate_button_background);
                C6RB A0z3 = AbstractC166987dD.A0z(context, i2);
                this.A0P = A0z3;
                Context context2 = this.A0C;
                AbstractC167027dH.A0c(context2, A0z3, 14);
                A0z3.A0J(typeface, 1);
                A0z3.A0F(-16777216);
                A0z3.A0K(Layout.Alignment.ALIGN_CENTER);
                A0z3.A0C(0.0f, 14.0f);
                AbstractC166987dD.A1Q(context2, A0z3, C18U.A06(C06090Tz.A05, this.A0M, 36316607072571936L) ? 2131974371 : 2131974370);
                if ((ahe2 != null && ahe2.A02) || ahe.A02) {
                    Context context3 = this.A0C;
                    int A042 = AbstractC166997dE.A04(context3, R.dimen.account_discovery_bottom_gap);
                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) context3.getDrawable(R.drawable.verified_profile);
                    C14360o3.A0A(bitmapDrawable2);
                    Bitmap bitmap = bitmapDrawable2.getBitmap();
                    if (bitmap != null) {
                        bitmapDrawable = new BitmapDrawable(context3.getResources(), C0fK.A00(bitmap, A042, A042, true));
                        bitmapDrawable.setCallback(this);
                        AbstractC166997dE.A1F(bitmapDrawable, context3.getColor(AbstractC53242c7.A05(context3)));
                        AbstractC167017dG.A14(bitmapDrawable);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    bitmapDrawable = null;
                }
                this.A0K = bitmapDrawable;
                SimpleImageUrl A002 = ahe.A00();
                if (A002 != null) {
                    C1OG A0J = C25821No.A00().A0J(A002, "standalone_fundraiser_sticker");
                    A0J.A08 = "profile_pic";
                    A0J.A02(this);
                    A0J.A01();
                }
                C1OG A0J2 = C25821No.A00().A0J(extendedImageUrl, "standalone_fundraiser_sticker");
                A0J2.A08 = "media";
                A0J2.A02(this);
                A0J2.A01();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166987dD.A12("Requires cover photo url");
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0V.add(interfaceC25177BCa);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[LOOP:0: B:10:0x006d->B:12:0x0073, LOOP_END] */
    @Override // X.C1NJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cza(X.InterfaceC59502nt r12, X.C73033Pe r13) {
        /*
            r11 = this;
            r3 = 0
            X.AbstractC167007dF.A1K(r12, r13)
            java.lang.Object r1 = r12.C4x()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L7d
            android.graphics.Bitmap r2 = r13.A01
            if (r2 == 0) goto L9b
            int r1 = r11.A06
            int r0 = r11.A05
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)
            if (r2 == 0) goto L96
            r11.A00 = r2
            android.graphics.Paint r1 = r11.A0F
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r10, r10)
            r1.setShader(r0)
            android.graphics.RectF r0 = r11.A0I
            float r4 = r0.width()
            float r7 = r0.height()
            android.graphics.Paint r2 = r11.A0E
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r5 = r7 * r0
            r1 = 4
            r0 = 1184197120(0x46956a00, float:19125.0)
            int r0 = java.lang.Math.round(r0)
            int r0 = android.graphics.Color.argb(r0, r3, r3, r3)
            int[] r8 = new int[]{r3, r3, r3, r0}
            float[] r9 = new float[r1]
            r9 = {x00a6: FILL_ARRAY_DATA , data: [0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.setShader(r3)
            X.AtS r0 = new X.AtS
            r0.<init>(r11)
        L64:
            X.C11T.A02(r0)
        L67:
            java.util.concurrent.CopyOnWriteArraySet r0 = r11.A0V
            java.util.Iterator r1 = X.AbstractC166997dE.A13(r0)
        L6d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r1.next()
            X.BCa r0 = (X.InterfaceC25177BCa) r0
            r0.DQ0()
            goto L6d
        L7d:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            android.graphics.Bitmap r0 = r13.A01
            if (r0 == 0) goto La0
            android.graphics.Bitmap r0 = X.C1NC.A05(r0)
            r11.A01 = r0
            X.AtT r0 = new X.AtT
            r0.<init>(r11)
            goto L64
        L95:
            return
        L96:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L9b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        La0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SS.Cza(X.2nt, X.3Pe):void");
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
        this.A0V.remove(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        boolean z;
        int i;
        int i2;
        int i3;
        C14360o3.A0B(canvas, 0);
        if (!isLoading()) {
            Rect A0W = AbstractC166987dD.A0W(this);
            Drawable drawable = this.A0U;
            C14360o3.A0A(drawable);
            drawable.draw(canvas);
            AbstractC167017dG.A11(canvas, A0W);
            canvas.save();
            Path path = this.A0H;
            canvas.drawPath(path, this.A0F);
            canvas.drawPath(path, this.A0E);
            RectF rectF = this.A0J;
            float height = rectF.height();
            float f2 = height / 2.0f;
            int i4 = this.A02;
            float f3 = i4;
            boolean z2 = this.A0S;
            if (z2) {
                canvas.translate(this.A06 - i4, f3);
                canvas.translate(-height, 0.0f);
            } else {
                canvas.translate(f3, f3);
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0G);
                C6RB c6rb = this.A0N;
                float f4 = f2 - (c6rb.A06 / 2.0f);
                int i5 = this.A09;
                if (z2) {
                    f = (-i5) - c6rb.A0A;
                } else {
                    f = height + i5;
                }
                canvas.translate(f, f4);
                c6rb.draw(canvas);
                Drawable drawable2 = this.A0K;
                if (drawable2 != null && this.A0R.A00 == 0) {
                    float intrinsicHeight = (c6rb.A06 - drawable2.getIntrinsicHeight()) - this.A0A;
                    if (z2) {
                        i3 = (-this.A0B) - drawable2.getIntrinsicWidth();
                    } else {
                        i3 = c6rb.A0A + this.A0B;
                    }
                    canvas.translate(i3, intrinsicHeight);
                    drawable2.draw(canvas);
                }
                canvas.restore();
                canvas.save();
                String str = this.A0R.A06;
                if (str != null) {
                    int i6 = 0;
                    if (str.length() == 0) {
                        z = true;
                        i = 0;
                        i2 = 0;
                    } else {
                        z = false;
                        C6RB c6rb2 = this.A0O;
                        i = c6rb2.A06;
                        i2 = c6rb2.A0A;
                        i6 = this.A03;
                    }
                    int i7 = this.A05 - i4;
                    Drawable drawable3 = this.A0L;
                    C14360o3.A0A(drawable3);
                    int intrinsicHeight2 = (((i7 - drawable3.getIntrinsicHeight()) - this.A04) - i) - i6;
                    C6RB c6rb3 = this.A0Q;
                    int i8 = c6rb3.A06;
                    int i9 = this.A06 - i4;
                    int i10 = c6rb3.A0A;
                    float f5 = i9 - i10;
                    float f6 = i8 + i6;
                    float f7 = i10 - i2;
                    canvas.translate(0.0f, intrinsicHeight2 - i8);
                    if (!z2) {
                        f5 = f3;
                    }
                    canvas.translate(f5, 0.0f);
                    c6rb3.draw(canvas);
                    if (!z) {
                        canvas.translate(0.0f, f6);
                        if (z2) {
                            canvas.translate(f7, 0.0f);
                        } else {
                            canvas.translate(0.0f, 0.0f);
                        }
                        this.A0O.draw(canvas);
                    }
                    canvas.restore();
                    canvas.save();
                    C14360o3.A0A(drawable3);
                    canvas.translate(f3, i7 - drawable3.getIntrinsicHeight());
                    int i11 = this.A07;
                    drawable3.setBounds(0, 0, i11, drawable3.getIntrinsicHeight());
                    drawable3.draw(canvas);
                    float f8 = i11 / 2;
                    float intrinsicHeight3 = drawable3.getIntrinsicHeight() / 2;
                    AbstractC167007dF.A0u(canvas, this.A0P, f8 - (r1.A0A / 2), intrinsicHeight3 - (r1.A06 / 2));
                    canvas.restore();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A0V.clear();
    }

    @Override // X.InterfaceC202578xb
    public final String Asj() {
        return this.A0R.A05;
    }

    @Override // X.InterfaceC202578xb
    public final NewFundraiserInfo BWh() {
        return this.A0R.A01;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AnonymousClass001.A0R("standalone_fundraiser_cover_photo_variant_", this.A0R.A07);
    }

    @Override // X.InterfaceC202578xb
    public final String getFundraiserId() {
        return this.A0R.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A00 != null && this.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0E.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0U;
        C14360o3.A0A(drawable);
        int i5 = this.A0T;
        drawable.setBounds(i - i5, i2 - i5, i3 + i5, i4 + i5);
    }
}
