package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.UpcomingEvent;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202598xd extends Drawable implements C5RP, C1NJ, InterfaceC133125ze, C74R, InterfaceC202608xe, InterfaceC25171BBr {
    public float A00;
    public float A03;
    public Bitmap A04;
    public Bitmap A05;
    public C210419Sg A06;
    public String A07;
    public String A08;
    public boolean A09;
    public float A0A;
    public int A0B;
    public Integer A0C;
    public final float A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Context A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final Path A0R;
    public final Path A0S;
    public final Rect A0T;
    public final Rect A0U;
    public final Rect A0V;
    public final RectF A0W;
    public final RectF A0X;
    public final Drawable A0Y;
    public final Layout A0Z;
    public final StaticLayout A0a;
    public final TextPaint A0b;
    public final C68024V6s A0c;
    public final EnumC40111tc A0d;
    public final ProductType A0e;
    public final C6RB A0f;
    public final C6RB A0g;
    public final Integer A0h;
    public final Runnable A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC09390do A0l;
    public final boolean A0m;
    public final int A0n;
    public final int A0o;
    public final Resources A0p;
    public final Drawable A0q;
    public final Drawable A0r;
    public final UserSession A0s;
    public final C3YU A0t;
    public final UpcomingEvent A0u;
    public final Integer A0v;
    public final CopyOnWriteArraySet A0w;
    public float A02 = 1.0f;
    public float A01 = 1.0f;

    private final void A06(Canvas canvas, TextPaint textPaint, String str) {
        int length = str.length();
        Rect rect = this.A0U;
        textPaint.getTextBounds(str, 0, length, rect);
        canvas.translate(0.0f, rect.height() / 2.0f);
        canvas.drawText(str, 0, length, 0.0f, -rect.exactCenterY(), (Paint) textPaint);
        canvas.translate(0.0f, rect.height() / 2.0f);
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0w.add(interfaceC25177BCa);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa A[LOOP:0: B:15:0x00a4->B:17:0x00aa, LOOP_END] */
    @Override // X.C1NJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cza(X.InterfaceC59502nt r13, X.C73033Pe r14) {
        /*
            r12 = this;
            r4 = 0
            X.C14360o3.A0B(r13, r4)
            r3 = 1
            X.C14360o3.A0B(r14, r3)
            java.lang.Object r1 = r13.C4x()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C14360o3.A0C(r1, r0)
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L82
            android.graphics.Bitmap r2 = r14.A01
            if (r2 == 0) goto L9b
            X.V6s r0 = r12.A0c
            int r1 = r0.A04
            int r0 = r0.A00
            android.graphics.Bitmap r2 = X.C0fK.A00(r2, r1, r0, r3)
            r12.A04 = r2
            android.graphics.Paint r1 = r12.A0M
            if (r2 != 0) goto L37
            java.lang.String r0 = "loadedMediaBitmap"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L37:
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r11, r11)
            r1.setShader(r0)
            java.lang.Integer r1 = r12.A0h
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L96
            android.graphics.RectF r0 = r12.A0W
            float r5 = r0.width()
            float r8 = r0.height()
            android.graphics.Paint r3 = r12.A0L
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r6 = r8 * r0
            r2 = 4
            r0 = 1112276992(0x424c0000, float:51.0)
            int r0 = X.C1H4.A01(r0)
            int r1 = android.graphics.Color.argb(r0, r4, r4, r4)
            r0 = 1124007936(0x42ff0000, float:127.5)
            int r0 = X.C1H4.A01(r0)
            int r0 = android.graphics.Color.argb(r0, r4, r4, r4)
            int[] r9 = new int[]{r1, r4, r4, r0}
            float[] r10 = new float[r2]
            r10 = {x00b6: FILL_ARRAY_DATA , data: [0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.setShader(r4)
            goto L96
        L82:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9b
            android.graphics.Bitmap r0 = r14.A01
            if (r0 == 0) goto L9b
            android.graphics.Bitmap r0 = X.C1NC.A05(r0)
            if (r0 == 0) goto L9b
            r12.A05 = r0
        L96:
            java.lang.Runnable r0 = r12.A0i
            X.C11T.A02(r0)
        L9b:
            java.util.concurrent.CopyOnWriteArraySet r0 = r12.A0w
            java.util.Iterator r1 = r0.iterator()
            X.C14360o3.A07(r1)
        La4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r1.next()
            X.BCa r0 = (X.InterfaceC25177BCa) r0
            r0.DQ0()
            goto La4
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202598xd.Cza(X.2nt, X.3Pe):void");
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C74R
    public final /* synthetic */ void DhX() {
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A0w.remove(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        String str;
        String str2;
        C14360o3.A0B(canvas, 0);
        if (!isLoading()) {
            C14360o3.A07(getBounds());
            canvas.save();
            canvas.translate(r2.left, r2.top);
            int intValue = this.A0h.intValue();
            if (intValue != 0) {
                if (intValue != 3) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 4) {
                                throw new RuntimeException();
                            }
                        } else {
                            if (this.A0m) {
                                canvas.save();
                                canvas.translate(0.0f, this.A0F);
                                canvas.drawPath(this.A0S, this.A0M);
                                canvas.restore();
                            }
                            A03(canvas);
                            A04(canvas);
                            canvas.save();
                            C68024V6s c68024V6s = this.A0c;
                            canvas.translate(0.0f, c68024V6s.A00 + this.A0F);
                            canvas.drawPath(this.A0Q, this.A0K);
                            String str3 = this.A08;
                            if (str3 != null && (str = this.A07) != null && (str2 = c68024V6s.A09) != null) {
                                canvas.save();
                                float f = this.A0D;
                                float f2 = f * 2.0f;
                                canvas.translate(getBounds().width() / 2.0f, f2);
                                A06(canvas, (TextPaint) this.A0l.getValue(), str3);
                                canvas.translate(0.0f, f);
                                A06(canvas, (TextPaint) this.A0k.getValue(), str);
                                canvas.translate(0.0f, f2);
                                A06(canvas, (TextPaint) this.A0j.getValue(), str2);
                            }
                            canvas.restore();
                            canvas.restore();
                        }
                    } else {
                        Layout layout = this.A0Z;
                        if (layout != null) {
                            float A00 = A00();
                            float f3 = this.A01;
                            if (((int) (A00 * f3)) > 0) {
                                canvas.save();
                                int A002 = ((int) (A00() * f3)) - A00();
                                canvas.translate(0.0f, this.A0c.A00 + this.A0F);
                                canvas.drawPath(this.A0Q, this.A0K);
                                canvas.translate(this.A0G, this.A0H + A002);
                                layout.draw(canvas);
                                canvas.restore();
                            }
                        }
                        if (this.A0m) {
                            canvas.save();
                            canvas.translate(0.0f, (int) (this.A0F * this.A02));
                            canvas.drawPath(this.A0S, this.A0M);
                            canvas.restore();
                        }
                        A03(canvas);
                        A04(canvas);
                        canvas.restore();
                    }
                }
                if (this.A0m) {
                    canvas.save();
                    canvas.drawPath(this.A0S, this.A0M);
                    canvas.restore();
                }
                A04(canvas);
                canvas.save();
                float f4 = this.A0G;
                float height = this.A0c.A00 + this.A0H + this.A0V.height();
                C6RB c6rb = this.A0g;
                float f5 = height + c6rb.A0b.getFontMetrics().ascent;
                canvas.translate(f4, f5);
                c6rb.draw(canvas);
                canvas.translate(c6rb.A0A, 0.0f);
                C6RB c6rb2 = this.A0f;
                if (c6rb2 != null) {
                    canvas.translate(this.A0E, 0.0f);
                    c6rb2.draw(canvas);
                    canvas.translate(c6rb2.A0A, 0.0f);
                }
                canvas.restore();
                A05(canvas, f4, f5);
                canvas.restore();
            }
            RectF rectF = this.A0X;
            float height2 = rectF.height();
            float f6 = this.A03;
            float f7 = f6 / 2.0f;
            RectF rectF2 = this.A0W;
            float width = rectF2.width();
            float height3 = rectF2.height();
            Context context = this.A0J;
            float A01 = C1H4.A01(AbstractC13880nE.A04(context, 20));
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_media_play, null);
            RectF rectF3 = new RectF();
            float A012 = C1H4.A01(AbstractC13880nE.A04(context, 3));
            rectF3.set((A01 + A012) * (-1.0f), 0.0f, A012 * (-1.0f), A01);
            canvas.save();
            if (this.A0m) {
                Path path = this.A0S;
                canvas.drawPath(path, this.A0M);
                canvas.drawPath(path, this.A0L);
            }
            float f8 = this.A0G;
            canvas.translate(f8, (height3 - f8) - height2);
            Bitmap bitmap = this.A05;
            if (bitmap == null) {
                C14360o3.A0F("profilePicBitmap");
                throw C00O.createAndThrow();
            }
            canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0O);
            Paint paint = this.A0P;
            canvas.drawCircle(f7, f7, (paint.getStrokeWidth() / 2.0f) + f7, paint);
            canvas.save();
            Rect rect = this.A0V;
            canvas.translate(f6 + f8, (f7 - rect.top) - (rect.height() / 2.0f));
            Spannable spannable = this.A0g.A0F;
            C14360o3.A07(spannable);
            String obj = spannable.toString();
            TextPaint textPaint = this.A0b;
            canvas.drawText(obj, 0.0f, 0.0f, textPaint);
            canvas.restore();
            canvas.save();
            StaticLayout staticLayout = this.A0a;
            if (staticLayout != null) {
                float f9 = -staticLayout.getHeight();
                float f10 = this.A0H;
                canvas.translate(0.0f, f9 - f10);
                staticLayout.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                Rect rect2 = this.A0T;
                canvas.translate((width - rect2.width()) - f8, f10);
                canvas.drawBitmap(decodeResource, (Rect) null, rectF3, this.A0N);
                canvas.save();
                canvas.translate(0.0f, ((A01 / 2.0f) - rect2.top) - (rect2.height() / 2.0f));
                String str4 = this.A0c.A08;
                if (str4 != null) {
                    canvas.drawText(str4, 0.0f, 0.0f, textPaint);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            canvas.restore();
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect rect2;
        int i;
        int A01;
        C14360o3.A0B(rect, 0);
        this.A0B = 0;
        Integer num = this.A0h;
        if (num == C05F.A0C) {
            A02();
        }
        A01();
        Drawable drawable = this.A0Y;
        if (drawable != null) {
            if (num != C05F.A0N) {
                rect2 = new Rect(rect);
                rect2.top += (int) (this.A0F * this.A02);
                i = rect2.bottom;
                A01 = (int) (A00() * this.A01);
            } else {
                rect2 = new Rect(rect);
                i = rect2.bottom;
                int i2 = this.A0H;
                C6RB c6rb = this.A0g;
                A01 = i2 + c6rb.A06 + C1H4.A01(c6rb.A0b.getFontMetrics().descent);
            }
            rect2.bottom = i - A01;
            drawable.setBounds(rect2);
        }
        invalidateSelf();
    }

    private final int A00() {
        String str;
        String str2;
        int i = this.A0B;
        if (i == 0) {
            Layout layout = this.A0Z;
            if (layout != null && this.A0h == C05F.A01) {
                i = layout.getHeight() + (this.A0H * 2);
            } else if (this.A0h == C05F.A0C) {
                A02();
                String str3 = this.A08;
                i = 0;
                if (str3 != null && (str = this.A07) != null && (str2 = this.A0c.A09) != null) {
                    float f = this.A0D;
                    float f2 = f * 2.0f;
                    Paint paint = (Paint) this.A0l.getValue();
                    int length = str3.length();
                    Rect rect = this.A0U;
                    paint.getTextBounds(str3, 0, length, rect);
                    ((Paint) this.A0k.getValue()).getTextBounds(str, 0, str.length(), rect);
                    ((Paint) this.A0j.getValue()).getTextBounds(str2, 0, str2.length(), rect);
                    i = (int) (f2 + 0.0f + rect.height() + f + rect.height() + f2 + rect.height() + f2);
                }
            } else {
                i = 0;
            }
            this.A0B = i;
        }
        return i;
    }

    private final void A01() {
        Path path = this.A0Q;
        path.reset();
        if ((this.A0Z != null && this.A0h == C05F.A01) || this.A0h == C05F.A0C) {
            RectF rectF = new RectF(0.0f, 0.0f, this.A0c.A04, (int) (A00() * this.A01));
            float f = this.A00;
            path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f}, Path.Direction.CW);
        }
    }

    private final void A02() {
        String str;
        C68024V6s c68024V6s = this.A0c;
        String str2 = c68024V6s.A0C;
        if (str2 != null && (str = c68024V6s.A0B) != null) {
            float f = this.A0n * 2.0f;
            float width = getBounds().width() - f;
            if (width < 0.0f && this.A0v == C05F.A01) {
                width = c68024V6s.A04 - f;
            }
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String upperCase = str2.toUpperCase(locale);
            C14360o3.A07(upperCase);
            TextPaint textPaint = (TextPaint) this.A0l.getValue();
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.A08 = TextUtils.ellipsize(upperCase, textPaint, width, truncateAt).toString();
            Locale locale2 = Locale.getDefault();
            C14360o3.A07(locale2);
            String upperCase2 = str.toUpperCase(locale2);
            C14360o3.A07(upperCase2);
            this.A07 = TextUtils.ellipsize(upperCase2, (TextPaint) this.A0k.getValue(), width, truncateAt).toString();
        }
    }

    private final void A03(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        canvas.drawPath(this.A0R, this.A0K);
        canvas.save();
        float f4 = this.A02;
        if (f4 > 1.0f) {
            canvas.scale(f4, f4);
        }
        int i3 = 0;
        if (this.A0C == C05F.A00) {
            z = true;
            i2 = this.A0G;
            f = i2;
        } else {
            z = false;
            C210419Sg c210419Sg = this.A06;
            if (c210419Sg != null) {
                i = c210419Sg.getIntrinsicWidth();
            } else {
                i = 0;
            }
            float max = Math.max(1.0f, f4);
            i2 = this.A0G;
            f = (this.A0c.A04 - (((((this.A0g.A0A + i2) + i2) + this.A03) + i) * max)) / max;
        }
        float f5 = this.A0H;
        canvas.translate(f, f5);
        if (z) {
            Bitmap bitmap = this.A05;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.A0X, this.A0O);
            }
            C14360o3.A0F("profilePicBitmap");
            throw C00O.createAndThrow();
        }
        canvas.save();
        C6RB c6rb = this.A0f;
        if (c6rb != null) {
            i3 = c6rb.A06;
        }
        Rect rect = this.A0V;
        int height = rect.height();
        C6RB c6rb2 = this.A0g;
        int i4 = c6rb2.A0A;
        if (!z) {
            f2 = 0.0f;
        } else {
            f2 = this.A03 + i2;
        }
        float f6 = this.A03;
        float f7 = (((f6 / 2.0f) - rect.top) - ((i3 + height) / 2.0f)) + c6rb2.A0b.getFontMetrics().ascent;
        canvas.translate(f2, f7);
        c6rb2.draw(canvas);
        if (c6rb != null) {
            int save = canvas.save();
            try {
                float f8 = c6rb.A0A;
                if (!z) {
                    f3 = i4 - f8;
                } else {
                    f3 = 0.0f;
                }
                canvas.translate(f3, height + c6rb.A0b.getFontMetrics().descent);
                c6rb.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        if (!z) {
            float f9 = rect.right;
            RectF rectF = this.A0X;
            float f10 = i2;
            rectF.set(f10 + f9, 0.0f, f9 + f6 + f10, f6);
            canvas.translate(0.0f, (-f5) / 2.0f);
            Bitmap bitmap2 = this.A05;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, (Rect) null, rectF, this.A0O);
            }
            C14360o3.A0F("profilePicBitmap");
            throw C00O.createAndThrow();
        }
        canvas.restore();
        canvas.restore();
        A05(canvas, f + f6 + i2, f5 + f7);
    }

    private final void A04(Canvas canvas) {
        int i;
        Drawable drawable = this.A0r;
        if (drawable != null) {
            if (this.A0h == C05F.A0N) {
                i = 0;
            } else {
                i = (int) (this.A0F * this.A02);
            }
            canvas.save();
            canvas.translate((this.A0c.A04 - this.A0o) - this.A0G, i + this.A0H);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final void A05(Canvas canvas, float f, float f2) {
        C210419Sg c210419Sg = this.A06;
        if (c210419Sg != null) {
            canvas.save();
            canvas.translate(-getBounds().left, -getBounds().top);
            c210419Sg.A00(canvas, getBounds().left + f + this.A0g.A0A, getBounds().top + f2, 1.0f);
            canvas.restore();
        }
    }

    public final boolean A07() {
        if (this.A0c.A0D != null) {
            if (C18U.A06(C06090Tz.A05, this.A0s, 36319145398115337L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A0w.clear();
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A0Y;
    }

    @Override // X.InterfaceC202608xe
    public final C3YU BS7() {
        return this.A0t;
    }

    @Override // X.InterfaceC202608xe
    public final ProductType BhP() {
        return this.A0e;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        int intValue = this.A0h.intValue();
        if (intValue != 0) {
            if (intValue != 3) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 4) {
                            return AnonymousClass001.A0R("story-reels-metadata-sticker-", this.A0c.A0E);
                        }
                        throw new RuntimeException();
                    }
                    return "feed_post_sticker_with_event_bubble";
                }
                return "feed_post_sticker_bubble";
            }
            return "feed_post_sticker_square";
        }
        return AnonymousClass001.A0R("media_simple_", this.A0c.A0E);
    }

    @Override // X.C74R
    public final void D2h(boolean z) {
        if (z && this.A0Y != null) {
            Rect bounds = getBounds();
            C14360o3.A07(bounds);
            onBoundsChange(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int A01;
        int intValue = this.A0h.intValue();
        if (intValue != 0) {
            int i2 = this.A0c.A00;
            if (intValue != 3) {
                i = i2 + ((int) (this.A0F * this.A02));
                A01 = (int) (A00() * this.A01);
            } else {
                int i3 = i2 + this.A0H;
                C6RB c6rb = this.A0g;
                i = i3 + c6rb.A06;
                A01 = C1H4.A01(c6rb.A0b.getFontMetrics().descent);
            }
            return i + A01;
        }
        return C1H4.A01(this.A0W.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0c.A04;
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if ((!this.A0m || this.A04 != null) && this.A05 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A0O.setAlpha(i);
        this.A0M.setAlpha(i);
        this.A0L.setAlpha(i);
        this.A0K.setAlpha(i);
        this.A0g.setAlpha(i);
        C6RB c6rb = this.A0f;
        if (c6rb != null) {
            c6rb.setAlpha(i);
        }
        C210419Sg c210419Sg = this.A06;
        if (c210419Sg != null) {
            c210419Sg.setAlpha(i);
        }
        Drawable drawable = this.A0r;
        if (drawable != null) {
            drawable.setAlpha((int) (this.A0A * i));
        }
        this.A0N.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A0O.setColorFilter(colorFilter);
        this.A0M.setColorFilter(colorFilter);
        this.A0L.setColorFilter(colorFilter);
        this.A0K.setColorFilter(colorFilter);
        this.A0g.setColorFilter(colorFilter);
        C6RB c6rb = this.A0f;
        if (c6rb != null) {
            c6rb.setColorFilter(colorFilter);
        }
        C210419Sg c210419Sg = this.A06;
        if (c210419Sg != null) {
            c210419Sg.setColorFilter(colorFilter);
        }
        Drawable drawable = this.A0r;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0N.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x050c, code lost:
    
        if (r0 == null) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202598xd(android.content.Context r32, android.graphics.drawable.Drawable r33, android.graphics.drawable.Drawable r34, android.text.Layout r35, com.instagram.common.session.UserSession r36, com.instagram.common.typedurl.ImageUrl r37, X.C68024V6s r38, X.EnumC40111tc r39, X.C3YU r40, com.instagram.model.mediatype.ProductType r41, com.instagram.user.model.UpcomingEvent r42, java.lang.Integer r43, java.lang.Integer r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202598xd.<init>(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.text.Layout, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.V6s, X.1tc, X.3YU, com.instagram.model.mediatype.ProductType, com.instagram.user.model.UpcomingEvent, java.lang.Integer, java.lang.Integer, boolean):void");
    }
}
