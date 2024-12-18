package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C210399Se extends Drawable implements C5RQ, InterfaceC25170BBq, InterfaceC202998yH, BBH {
    public float A00;
    public int A01;
    public int A02;
    public C206169Az A03;
    public EnumC222939sY A04;
    public C89F A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Medium A0B;
    public final EnumC222999se A0C;
    public final String A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final UserSession A0J;

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect bounds;
        C14360o3.A0B(rect, 0);
        C89F c89f = this.A05;
        if (c89f != null) {
            int width = rect.width();
            int height = rect.height();
            c89f.A02 = rect.left;
            c89f.A03 = rect.top;
            SimpleVideoLayout simpleVideoLayout = c89f.A0T;
            ViewGroup.LayoutParams layoutParams = simpleVideoLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width != width || layoutParams.height != height) {
                    layoutParams.width = width;
                    layoutParams.height = height;
                    simpleVideoLayout.setLayoutParams(layoutParams);
                }
                Drawable drawable = c89f.A08;
                if (drawable != null && (bounds = drawable.getBounds()) != null) {
                    rect = bounds;
                }
                RoundedCornerFrameLayout roundedCornerFrameLayout = c89f.A0U;
                roundedCornerFrameLayout.setPivotX(rect.exactCenterX() - c89f.A02);
                roundedCornerFrameLayout.setPivotY(rect.exactCenterY() - c89f.A03);
                roundedCornerFrameLayout.setTranslationY(c89f.A03 + c89f.A01);
                roundedCornerFrameLayout.setTranslationX(c89f.A02 + c89f.A00);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:20|21|22|23|(1:102)(1:26)|(15:32|33|(1:35)|36|(1:38)(1:100)|39|40|41|42|43|(2:44|(1:90)(2:46|(1:88)(1:50)))|57|(9:59|(1:61)(1:82)|(1:63)|64|(1:81)(2:68|(1:70)(2:79|80))|71|72|73|74)|83|84)|101|33|(0)|36|(0)(0)|39|40|41|42|43|(3:44|(0)(0)|88)|57|(0)|83|84) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r4 = r2.getInteger("frame-rate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014f, code lost:
    
        r1 = r1.getLong("durationUs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        if (r1 == Long.MAX_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        r5 = X.AbstractC166987dD.A0L(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0165, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0166, code lost:
    
        X.AbstractC12120kG.A0E("VideoStickerDrawable", "FFMpegMediaDemuxer failed to extract duration", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016b, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0175, code lost:
    
        r2 = (java.lang.Integer.parseInt(r0) / r14.A0A) * 1000;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:43:0x0126, B:44:0x012a, B:46:0x0132, B:48:0x013e, B:53:0x014f, B:55:0x0157, B:88:0x014c), top: B:42:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b A[EDGE_INSN: B:90:0x015b->B:57:0x015b BREAK  A[LOOP:1: B:44:0x012a->B:88:0x014c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C210399Se(X.C206169Az r15, com.instagram.common.gallery.Medium r16, com.instagram.common.session.UserSession r17, X.EnumC222999se r18, X.EnumC222939sY r19, java.lang.String r20, float r21, int r22, int r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210399Se.<init>(X.9Az, com.instagram.common.gallery.Medium, com.instagram.common.session.UserSession, X.9se, X.9sY, java.lang.String, float, int, int, int, int, boolean):void");
    }

    public final Bitmap A00(long j) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.A0B.A0X);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j));
            mediaMetadataRetriever.release();
            return frameAtTime;
        } catch (Exception e) {
            AbstractC12120kG.A0I("Exception calling MediaMetadataRetriever#release", e, AbstractC06930Yk.A0E());
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.5NL, java.lang.Object, X.Al8] */
    @Override // X.C5RR
    public final C5NL C0T() {
        Medium medium = this.A0B;
        EnumC222999se enumC222999se = this.A0C;
        int i = this.A0H;
        int i2 = this.A0G;
        C206169Az c206169Az = this.A03;
        float f = this.A00;
        EnumC222939sY enumC222939sY = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A07;
        int i3 = this.A02;
        int i4 = this.A01;
        ?? obj = new Object();
        obj.A07 = EnumC222999se.A0D;
        obj.A06 = medium;
        obj.A07 = enumC222999se;
        obj.A02 = i;
        obj.A01 = i2;
        obj.A05 = c206169Az;
        obj.A00 = f;
        obj.A08 = enumC222939sY;
        obj.A09 = z;
        obj.A0A = z2;
        obj.A04 = i3;
        obj.A03 = i4;
        return obj;
    }

    @Override // X.InterfaceC202998yH
    public final void DtF(int i, int i2) {
        if (this.A0C == EnumC222999se.A06) {
            this.A02 = i;
            this.A01 = i2;
            C89F c89f = this.A05;
            if (c89f != null) {
                c89f.A07 = i;
            }
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0B(this.A0F, this.A0E);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC166987dD.A0B(this.A0I, this.A0E);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC25170BBq
    public final boolean ANp(Canvas canvas, Integer num, Integer num2, long j) {
        int i;
        int i2;
        Rect A0V;
        Bitmap A00 = A00(j);
        if (A00 == null) {
            return false;
        }
        Paint A0R = AbstractC166987dD.A0R();
        Rect A0W = AbstractC166987dD.A0W(this);
        float width = A0W.width() / A0W.height();
        int width2 = A00.getWidth();
        int height = A00.getHeight();
        float f = width2;
        float f2 = height;
        float f3 = f / f2;
        if (AbstractC166987dD.A01(f3, width) < 0.01f) {
            A0V = new Rect(0, 0, width2, height);
        } else {
            if (f3 > width) {
                i2 = (int) (width * f2);
                i = height;
            } else {
                if (f3 < width) {
                    i = (int) (width * f);
                } else {
                    i = height;
                }
                i2 = width2;
            }
            int i3 = (width2 - i2) / 2;
            int i4 = (height - i) / 2;
            A0V = AbstractC166987dD.A0V(i3, i4, i2 + i3, i + i4);
        }
        canvas.drawBitmap(A00, A0V, getBounds(), A0R);
        return true;
    }
}
