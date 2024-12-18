package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202588xc extends Drawable implements C5RP, C74Q, Drawable.Callback, C1NJ, InterfaceC133125ze {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Paint A05;
    public C47348Kvx A06;
    public Integer A07;
    public boolean A08;
    public int A09;
    public C6RL A0A;
    public final float A0B;
    public final Context A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RingSpec A0I;
    public final UserSession A0J;
    public final C74X A0K;
    public final C148286ly A0L;
    public final EnumC150226pU A0M;
    public final C38561qk A0N;
    public final String A0O;
    public final Map A0P;
    public final int A0Q;
    public final int A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final String A0U;
    public final CopyOnWriteArraySet A0V;

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        float f = i / 100.0f;
        this.A00 = f;
        this.A0K.A00(f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202588xc(android.content.Context r26, com.instagram.api.schemas.RingSpec r27, com.instagram.common.session.UserSession r28, X.C148286ly r29, X.EnumC150226pU r30, X.C38561qk r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202588xc.<init>(android.content.Context, com.instagram.api.schemas.RingSpec, com.instagram.common.session.UserSession, X.6ly, X.6pU, X.1qk, java.lang.String):void");
    }

    private void A00(int i, ImageUrl imageUrl) {
        C47348Kvx c47348Kvx = this.A06;
        if (c47348Kvx != null) {
            String str = this.A0U;
            C14360o3.A0B(str, 0);
            c47348Kvx.A00.A06.A01(str, false);
        }
        C1OG A0J = C25821No.A00().A0J(imageUrl, null);
        A0J.A02(this);
        A0J.A08 = Integer.valueOf(i);
        A0J.A0M = true;
        A0J.A01();
    }

    private void A01(Bitmap bitmap, int i) {
        Map map = this.A0P;
        Integer valueOf = Integer.valueOf(i);
        Bitmap bitmap2 = bitmap;
        Integer num = this.A07;
        if (num == C05F.A01) {
            C14360o3.A0B(bitmap, 0);
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C0fK.A03(bitmap);
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            C14360o3.A07(bitmap2);
            bitmap2.setDensity(160);
        } else if (num == C05F.A0C) {
            Paint paint = this.A0D;
            C14360o3.A0B(bitmap, 0);
            C14360o3.A0B(paint, 1);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else if (num == C05F.A0N) {
            C14360o3.A0B(bitmap, 0);
            bitmap2 = BlurUtil.blurTranslation(bitmap, 1.0f, -1, 1, 10, 2);
        }
        map.put(valueOf, bitmap2);
        this.A0S.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (A03()) {
            Iterator it = this.A0V.iterator();
            while (it.hasNext()) {
                ((InterfaceC25177BCa) it.next()).DQ0();
            }
            invalidateSelf();
        }
    }

    private boolean A03() {
        C148286ly c148286ly = this.A0L;
        if (c148286ly.A02() != null && !c148286ly.A02().isEmpty()) {
            if (this.A0P.size() != c148286ly.A02().size()) {
                return false;
            }
        } else if (this.A0P.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04() {
        if (this.A0P.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            C148286ly c148286ly = this.A0L;
            ImmutableList A03 = c148286ly.A03();
            if (A03 != null && !A03.isEmpty()) {
                for (int i = 0; i < A03.size(); i++) {
                    Bitmap A02 = C1NC.A02(this.A0C, android.net.Uri.fromFile(new File((String) A03.get(i))));
                    if (A02 != null) {
                        arrayList.add(A02);
                        A01(A02, i);
                    } else {
                        String A0R = AnonymousClass001.A0R("Failed to load bitmap from file. file: ", (String) A03.get(i));
                        C14360o3.A0B(A0R, 1);
                        AbstractC12120kG.A0E("StickerItemDrawable", A0R, null);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (c148286ly.A02() != null && !c148286ly.A02().isEmpty()) {
                    if (c148286ly.A02() != null && !c148286ly.A02().isEmpty()) {
                        if (!((A59) c148286ly.A02().get(0)).A00.isEmpty()) {
                            for (int i2 = 0; i2 < c148286ly.A02().size(); i2++) {
                                A00(i2, new SimpleImageUrl(((A59) c148286ly.A02().get(i2)).A00));
                            }
                            return;
                        }
                    }
                } else {
                    ImageUrl imageUrl = c148286ly.A0H;
                    if (!AbstractC81033jX.A03(imageUrl)) {
                        A00(0, imageUrl);
                        return;
                    }
                }
                List list = c148286ly.A0o;
                if (!ImmutableList.copyOf((Collection) list).isEmpty()) {
                    for (int i3 = 0; i3 < ImmutableList.copyOf((Collection) list).size(); i3++) {
                        A01((Bitmap) ImmutableList.copyOf((Collection) list).get(i3), i3);
                    }
                }
            }
        }
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        this.A0V.add(interfaceC25177BCa);
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A0V.clear();
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A0A;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0L.A0S;
    }

    @Override // X.C74Q
    public final boolean CaH(UserSession userSession) {
        EnumC150226pU enumC150226pU = this.A0M;
        if (enumC150226pU != EnumC150226pU.A0t) {
            if (enumC150226pU != EnumC150226pU.A0L || !C18U.A06(C06090Tz.A05, userSession, 36319909903146825L)) {
                if (enumC150226pU == EnumC150226pU.A0C && C18U.A06(C06090Tz.A05, userSession, 36319909903540047L) && this.A0L.A0i == userSession.userId && this.A07 == C05F.A00) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        int i;
        final Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            C47348Kvx c47348Kvx = this.A06;
            if (c47348Kvx != null) {
                String str = this.A0U;
                C14360o3.A0B(str, 0);
                c47348Kvx.A00.A06.A00.markerEnd(944511429, str.hashCode(), (short) 2);
            }
            this.A00 = 1.0f;
            this.A0K.A00(1.0f);
            if (bitmap.getWidth() > 480 && this.A0M != EnumC150226pU.A1a) {
                boolean z = C1NC.A02;
                bitmap = C0fK.A00(bitmap, 480, (int) (bitmap.getHeight() * (480.0f / bitmap.getWidth())), true);
            }
            Object C4x = interfaceC59502nt.C4x();
            if (C4x instanceof Integer) {
                i = ((Number) C4x).intValue();
            } else {
                AbstractC12120kG.A0E("StickerItemDrawable", "No index tag", null);
                i = 0;
            }
            C148286ly c148286ly = this.A0L;
            if (c148286ly.A03() != null && !c148286ly.A03().isEmpty() && bitmap != null) {
                final File file = new File((String) c148286ly.A03().get(i));
                if (!file.exists() || file.length() == 0) {
                    final UserSession userSession = this.A0J;
                    LH2.A00(C14120nc.A00(), new Callable() { // from class: X.B1H
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            File file2 = file;
                            AHW.A02(bitmap, file2, false);
                            return file2;
                        }
                    }, 205);
                }
            }
            A01(bitmap, i);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        String str;
        C47348Kvx c47348Kvx = this.A06;
        if (c47348Kvx != null) {
            String str2 = this.A0U;
            if (c82183lf != null) {
                str = c82183lf.A02;
            } else {
                str = null;
            }
            C14360o3.A0B(str2, 0);
            L8Q l8q = c47348Kvx.A00.A06;
            int hashCode = str2.hashCode();
            C006802i c006802i = l8q.A00;
            if (str == null) {
                str = "unknown";
            }
            c006802i.markerAnnotate(944511429, hashCode, "error", str);
            c006802i.markerEnd(944511429, hashCode, (short) 3);
        }
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        this.A0V.remove(interfaceC25177BCa);
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A08 = z;
        C6RL c6rl = this.A0A;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        int intValue = this.A0L.A04().intValue();
        if (intValue != 0 && intValue != 1) {
            return false;
        }
        return !A03();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A0K.setBounds(0, 0, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            this.A0D.setAlpha(i);
            this.A05.setAlpha(i);
            Paint paint = this.A0F;
            if (paint.getColor() != 0) {
                paint.setAlpha(i);
            }
            Paint paint2 = this.A0E;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(i);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        Paint paint = this.A0F;
        if (paint.getColor() != 0) {
            paint.setColorFilter(colorFilter);
        }
        Paint paint2 = this.A0E;
        if (paint2.getColor() != 0) {
            paint2.setColorFilter(colorFilter);
        }
    }

    private void A02(Canvas canvas) {
        if (isLoading()) {
            C74X c74x = this.A0K;
            c74x.A00(this.A00);
            c74x.draw(canvas);
        } else {
            Iterator it = this.A0P.values().iterator();
            while (it.hasNext()) {
                canvas.drawBitmap((Bitmap) it.next(), this.A0S, this.A0G, this.A0D);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r1 != 2) goto L13;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            r5.save()
            android.graphics.Rect r2 = r4.getBounds()
            int r0 = r2.left
            float r1 = (float) r0
            int r0 = r2.top
            float r0 = (float) r0
            r5.translate(r1, r0)
            boolean r0 = r4.isLoading()
            if (r0 != 0) goto L2e
            boolean r0 = r4.A08
            if (r0 == 0) goto L2e
            android.graphics.RectF r0 = r4.A0G
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r0)
            float r0 = r4.A02
            float r0 = -r0
            r2.inset(r0, r0)
            float r1 = r4.A01
            android.graphics.Paint r0 = r4.A05
            r5.drawRoundRect(r2, r1, r1, r0)
        L2e:
            X.6ly r3 = r4.A0L
            java.lang.Integer r0 = r3.A04()
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L70
            r0 = 1
            if (r1 == r0) goto L4a
            r0 = 2
            if (r1 == r0) goto L4d
        L41:
            r5.restore()
            X.6RL r0 = r4.A0A
            r0.draw(r5)
            return
        L4a:
            r4.A02(r5)
        L4d:
            java.lang.String r0 = r3.A0d
            if (r0 == 0) goto L41
            android.graphics.Paint r2 = r4.A0E
            int r0 = r2.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L64
            android.graphics.RectF r1 = r4.A0H
            float r0 = r4.A0B
            r5.drawRoundRect(r1, r0, r0, r2)
        L64:
            java.lang.String r3 = r3.A0d
            float r2 = r4.A03
            float r1 = r4.A04
            android.graphics.Paint r0 = r4.A0F
            r5.drawText(r3, r2, r1, r0)
            goto L41
        L70:
            r4.A02(r5)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202588xc.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (isLoading()) {
            return this.A0K.A03;
        }
        int intValue = this.A0L.A04().intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return 0;
                }
                return Math.round(this.A0H.height());
            }
            RectF rectF = this.A0G;
            float f = rectF.top;
            RectF rectF2 = this.A0H;
            return Math.round(Math.max(rectF.bottom, rectF2.bottom)) - Math.round(Math.min(f, rectF2.top));
        }
        return this.A0Q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (isLoading()) {
            return this.A0K.A04;
        }
        int intValue = this.A0L.A04().intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return 0;
                }
                return Math.round(this.A0H.width());
            }
            RectF rectF = this.A0G;
            float f = rectF.left;
            RectF rectF2 = this.A0H;
            return Math.round(Math.max(rectF.right, rectF2.right)) - Math.round(Math.min(f, rectF2.left));
        }
        return this.A0R;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
