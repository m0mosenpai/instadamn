package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BYu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25734BYu extends View {
    public AnonymousClass195 A00;
    public float A01;
    public float A02;
    public C6E A03;
    public C79 A04;
    public C19L A05;
    public final Path A06;
    public final RectF A07;
    public final PointF[] A08;
    public final C28264Cd9[][] A09;
    public final Paint A0A;
    public final Paint A0B;
    public final List A0C;
    public final List A0D;
    public final float[] A0E;
    public final int[] A0F;

    public C25734BYu(Context context) {
        super(context, null);
        Paint A0S = AbstractC166987dD.A0S(1);
        Paint.Style style = Paint.Style.FILL;
        A0S.setStyle(style);
        AbstractC166997dE.A1D(A0S, PorterDuff.Mode.SRC_IN);
        this.A0A = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        A0S2.setStyle(style);
        A0S2.setColor(-7829368);
        this.A0B = A0S2;
        this.A07 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0T();
        this.A0C = AbstractC166987dD.A1E();
        this.A04 = C79.A06;
        this.A03 = C6E.A03;
        this.A01 = 6.0f;
        this.A02 = 5.0f;
        C28264Cd9[][] c28264Cd9Arr = new C28264Cd9[4];
        for (int i = 0; i < 4; i++) {
            C28264Cd9[] c28264Cd9Arr2 = new C28264Cd9[25];
            int i2 = 0;
            do {
                c28264Cd9Arr2[i2] = new C28264Cd9(C6D.A02, 6.0f, false);
                i2++;
            } while (i2 < 25);
            c28264Cd9Arr[i] = c28264Cd9Arr2;
        }
        this.A09 = c28264Cd9Arr;
        this.A08 = new PointF[]{new PointF(0.2f, 1.0f), new PointF(0.4f, 0.75f), new PointF(0.6f, 0.5f), new PointF(0.8f, 0.25f), new PointF(1.0f, 0.0f)};
        C12T c12t = C12P.A00;
        this.A05 = AnonymousClass194.A02(AnonymousClass190.A02(AnonymousClass131.A00, new AnonymousClass197(null)));
        C17u A0C = C17s.A0C(0, 25);
        ArrayList A0i = AbstractC167007dF.A0i(A0C);
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            ((AbstractC16880sg) it).A00();
            A0i.add(C6D.A02);
        }
        ArrayList A0U = AbstractC001800i.A0U(A0i);
        C6D c6d = C6D.A03;
        A0U.set(2, c6d);
        A0U.set(9, c6d);
        A0U.set(14, c6d);
        A0U.set(16, c6d);
        ArrayList A0U2 = AbstractC001800i.A0U(A0i);
        A0U2.set(5, c6d);
        A0U2.set(7, c6d);
        A0U2.set(12, c6d);
        A0U2.set(18, c6d);
        A0U2.set(23, c6d);
        ArrayList A0U3 = AbstractC001800i.A0U(A0i);
        A0U3.set(0, c6d);
        A0U3.set(1, c6d);
        A0U3.set(3, c6d);
        A0U3.set(4, c6d);
        A0U3.set(6, c6d);
        A0U3.set(10, c6d);
        A0U3.set(11, c6d);
        A0U3.set(12, c6d);
        A0U3.set(13, c6d);
        A0U3.set(15, c6d);
        A0U3.set(16, c6d);
        A0U3.set(17, c6d);
        A0U3.set(19, c6d);
        A0U3.set(20, c6d);
        A0U3.set(22, c6d);
        this.A0D = AbstractC16960so.A1Q(A0i, A0U, A0U2, A0U3);
        this.A0F = new int[]{Color.parseColor("#FF74D7"), Color.parseColor("#015CF3"), Color.parseColor("#1D5FF0"), Color.parseColor("#08F2E0")};
        this.A0E = new float[]{0.0f, 0.24f, 0.73f, 1.0f};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r4 > r15) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.graphics.PointF r12, X.C25734BYu r13, int r14, int r15, boolean r16) {
        /*
            r6 = 0
            r1 = 3
            X.17u r0 = new X.17u
            r0.<init>(r6, r1)
            java.util.Iterator r11 = r0.iterator()
        Lb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            r0 = r11
            X.0sg r0 = (X.AbstractC16880sg) r0
            int r5 = r0.A00()
            r0 = 25
            X.17u r0 = X.C17s.A0C(r6, r0)
            java.util.Iterator r10 = r0.iterator()
        L22:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb
            r0 = r10
            X.0sg r0 = (X.AbstractC16880sg) r0
            int r4 = r0.A00()
            X.Cd9[][] r9 = r13.A09
            r0 = r9[r5]
            r8 = r0[r4]
            if (r14 > r4) goto L3a
            r2 = 1
            if (r4 <= r15) goto L3b
        L3a:
            r2 = 0
        L3b:
            boolean r0 = r8.A02
            if (r2 != r0) goto L69
            float r3 = r8.A00
        L41:
            if (r2 == 0) goto L61
            java.util.List r0 = r13.A0D
            java.lang.Object r0 = r0.get(r5)
            java.lang.Object r7 = X.AbstractC25225BEi.A13(r0, r4)
            X.C6D r7 = (X.C6D) r7
        L4f:
            r1 = r9[r5]
            if (r16 != 0) goto L55
            boolean r2 = r8.A02
        L55:
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            X.Cd9 r0 = new X.Cd9
            r0.<init>(r7, r3, r2)
            r1[r4] = r0
            goto L22
        L61:
            if (r16 == 0) goto L66
            X.C6D r7 = X.C6D.A02
            goto L4f
        L66:
            X.C6D r7 = r8.A01
            goto L4f
        L69:
            float r3 = r13.A01
            float r1 = (float) r5
            float r0 = r13.A02
            float r1 = r1 * r0
            if (r2 == 0) goto L76
            float r0 = r12.x
        L73:
            float r1 = r1 * r0
            float r3 = r3 + r1
            goto L41
        L76:
            float r0 = r12.y
            goto L73
        L79:
            r13.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25734BYu.A01(android.graphics.PointF, X.BYu, int, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.isActive() != r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        X.AbstractC25229BEm.A1R(r13.A00);
        r0 = A00(r13.A04);
        r4 = X.AbstractC25230BEn.A0F(r0);
        r3 = X.AbstractC25229BEm.A0A(r0);
        r1 = r13.A08;
        X.C14360o3.A0B(r1, 0);
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r0 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        throw new java.util.NoSuchElementException("Array is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        A01(r1[r0 - 1], r13, r4, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r6 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r13.A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r13.A04 = r15;
        r13.A03 = r14;
        r0 = A00(r15);
        r9 = X.AbstractC25230BEn.A0F(r0);
        r10 = X.AbstractC25229BEm.A0A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r18 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r13.A00 = X.AbstractC25226BEj.A1L(new com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1(r13, null, r9, r10, r16), r13.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r1 = r13.A08;
        X.C14360o3.A0B(r1, 0);
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r0 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        throw new java.util.NoSuchElementException("Array is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        A01(r1[r0 - 1], r13, r9, r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r6 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0012, code lost:
    
        if (r1 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r13.A03 == r14) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r13.A03 != r14) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = r13.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C6E r14, X.C79 r15, long r16, boolean r18) {
        /*
            r13 = this;
            r5 = 0
            boolean r2 = X.AbstractC167007dF.A1R(r5, r15, r14)
            r7 = r13
            X.C79 r0 = r13.A04
            r1 = 1
            if (r0 != r15) goto L11
            r1 = 0
            X.C6E r0 = r13.A03
            r6 = 1
            if (r0 != r14) goto L14
        L11:
            r6 = 0
            if (r1 != 0) goto L19
        L14:
            X.C6E r0 = r13.A03
            if (r0 != r14) goto L19
            return
        L19:
            X.195 r0 = r13.A00
            if (r0 == 0) goto L46
            boolean r0 = r0.isActive()
            if (r0 != r2) goto L46
        L23:
            X.195 r0 = r13.A00
            X.AbstractC25229BEm.A1R(r0)
            X.C79 r0 = r13.A04
            X.0e4 r0 = A00(r0)
            int r4 = X.AbstractC25230BEn.A0F(r0)
            int r3 = X.AbstractC25229BEm.A0A(r0)
            android.graphics.PointF[] r1 = r13.A08
            X.C14360o3.A0B(r1, r5)
            int r0 = r1.length
            if (r0 != 0) goto L49
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L46:
            if (r6 == 0) goto L55
            goto L23
        L49:
            int r0 = r0 + (-1)
            r0 = r1[r0]
            A01(r0, r13, r4, r3, r2)
            if (r6 == 0) goto L55
            r13.A03 = r14
            return
        L55:
            r13.A04 = r15
            r13.A03 = r14
            X.0e4 r0 = A00(r15)
            int r9 = X.AbstractC25230BEn.A0F(r0)
            int r10 = X.AbstractC25229BEm.A0A(r0)
            if (r18 == 0) goto L78
            X.19L r0 = r13.A05
            r8 = 0
            com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1 r6 = new com.meta.metaai.shared.litho.ui.particlering.ParticleRingView$updateToSparkleType$1
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r6, r0)
            r13.A00 = r0
            return
        L78:
            android.graphics.PointF[] r1 = r13.A08
            X.C14360o3.A0B(r1, r5)
            int r0 = r1.length
            if (r0 != 0) goto L88
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L88:
            int r0 = r0 + (-1)
            r0 = r1[r0]
            A01(r0, r13, r9, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25734BYu.A02(X.C6E, X.C79, long, boolean):void");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        int i = 0;
        for (Object obj : this.A0C) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            List list = (List) obj;
            if (this.A03 == C6E.A03) {
                paint = this.A0B;
            } else {
                paint = this.A0A;
            }
            C28264Cd9[] c28264Cd9Arr = this.A09[i];
            int length = c28264Cd9Arr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C28264Cd9 c28264Cd9 = c28264Cd9Arr[i3];
                int i5 = i4 + 1;
                PointF pointF = (PointF) list.get(i4);
                float f = c28264Cd9.A00;
                float f2 = pointF.x - f;
                float f3 = pointF.y - f;
                if (c28264Cd9.A01 == C6D.A02) {
                    canvas.drawCircle(f2 + f, f3 + f, f, paint);
                } else {
                    RectF rectF = this.A07;
                    float f4 = 2.0f * f;
                    rectF.set(f2, f3, f2 + f4, f4 + f3);
                    float width = rectF.width() / 8.0f;
                    float width2 = rectF.width() / 6.0f;
                    Path path = this.A06;
                    path.reset();
                    float f5 = rectF.left;
                    float f6 = width / 2.0f;
                    float centerY = rectF.centerY() - f6;
                    path.arcTo(f5, centerY, f5 + width, centerY + width, 180.0f, 45.0f, false);
                    float f7 = 2.0f * width2;
                    path.lineTo(rectF.left + f7, rectF.top + f7);
                    float centerX = rectF.centerX() - f6;
                    path.lineTo(centerX, rectF.top + f6);
                    float f8 = rectF.top;
                    float f9 = centerX + width;
                    float f10 = f8 + width;
                    path.arcTo(centerX, f8, f9, f10, 225.0f, 45.0f, false);
                    path.arcTo(centerX, f8, f9, f10, 270.0f, 45.0f, false);
                    path.lineTo(rectF.centerX() + width2, rectF.top + f7);
                    float f11 = rectF.right - f6;
                    float f12 = width / 1.8f;
                    float centerY2 = rectF.centerY() - f12;
                    path.lineTo(f11, centerY2);
                    float f13 = rectF.right - width;
                    float f14 = f13 + width;
                    float f15 = centerY2 + width;
                    path.arcTo(f13, centerY2, f14, f15, 315.0f, 45.0f, false);
                    path.arcTo(f13, centerY2, f14, f15, 0.0f, 45.0f, false);
                    path.lineTo(rectF.centerX() + width2, rectF.bottom - f7);
                    path.lineTo(rectF.centerX() + f6, rectF.bottom - f6);
                    float centerX2 = rectF.centerX() - f6;
                    float f16 = rectF.bottom - width;
                    float f17 = centerX2 + width;
                    float f18 = f16 + width;
                    path.arcTo(centerX2, f16, f17, f18, 45.0f, 45.0f, false);
                    path.arcTo(centerX2, f16, f17, f18, 90.0f, 45.0f, false);
                    path.lineTo(rectF.centerX() - width2, rectF.bottom - f7);
                    path.lineTo(rectF.left + f6, rectF.centerY() + f6);
                    float f19 = rectF.left;
                    float centerY3 = rectF.centerY() - f12;
                    path.arcTo(f19, centerY3, f19 + width, centerY3 + width, 135.0f, 45.0f, false);
                    canvas.drawPath(path, paint);
                }
                i3++;
                i4 = i5;
            }
            i = i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static final C09530e4 A00(C79 c79) {
        int i = 6;
        int i2 = 24;
        switch (c79.ordinal()) {
            case 0:
                i = 12;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 1:
                i = 0;
                i2 = 12;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 2:
                i = 0;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 3:
                i = -1;
                i2 = -1;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 4:
                i = 0;
                i2 = 6;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 5:
                i2 = 12;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 6:
                i = 13;
                i2 = 18;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            case 7:
                i = 19;
                return AbstractC167007dF.A0o(Integer.valueOf(i), i2);
            default:
                throw B4Z.A00();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-167162208);
        super.onAttachedToWindow();
        C12T c12t = C12P.A00;
        this.A05 = AbstractC25236BEt.A0e(AnonymousClass131.A00);
        C0f9.A0D(1528476605, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(932230716);
        super.onDetachedFromWindow();
        AnonymousClass194.A05(null, this.A05);
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
        A02(C6E.A02, C79.A06, 300L, false);
        C0f9.A0D(1460868931, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-844558817);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01 = C1H4.A01(AbstractC166987dD.A07(this) / 150.0f);
        this.A02 = C1H4.A01(AbstractC166987dD.A07(this) / 200.0f);
        float height = (getHeight() * 3) / 4.0f;
        this.A0A.setShader(new LinearGradient(height, AbstractC166987dD.A08(this) - height, AbstractC166987dD.A07(this) - height, height, this.A0F, this.A0E, Shader.TileMode.CLAMP));
        float A08 = AbstractC166987dD.A08(this) / 2.5f;
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        List list = this.A0C;
        list.clear();
        float A07 = AbstractC166987dD.A07(this) / 25.0f;
        Iterator it = new C17u(1, 4).iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            Iterator it2 = new C17u(0, 7).iterator();
            while (it2.hasNext()) {
                fArr[((AbstractC16880sg) it2).A00()] = A08 - ((A00 - 1) * A07);
            }
            float f = A00 * A07;
            RectF rectF = new RectF(f, f, AbstractC166987dD.A07(this) - f, AbstractC166987dD.A08(this) - f);
            Path A0T = AbstractC166987dD.A0T();
            A0T.addRoundRect(rectF, fArr, Path.Direction.CW);
            boolean A1M = AbstractC167007dF.A1M(A00 % 2);
            PointF[] pointFArr = new PointF[25];
            PathMeasure pathMeasure = new PathMeasure(A0T, false);
            PathMeasure pathMeasure2 = new PathMeasure(A0T, false);
            RectF A0X = AbstractC166987dD.A0X();
            A0T.computeBounds(A0X, false);
            float length = pathMeasure2.getLength() / 25.0f;
            float centerX = A0X.centerX();
            if (!A1M) {
                centerX += length / 2.0f;
            }
            PointF pointF = new PointF(centerX, A0X.top);
            float[] fArr2 = {0.0f, 0.0f};
            float f2 = 0.0f;
            while (pointF.x > fArr2[0]) {
                pathMeasure2.getPosTan(f2, fArr2, null);
                f2 += 1.0f;
            }
            float length2 = pathMeasure.getLength();
            float f3 = length2 / 25.0f;
            float[] fArr3 = {0.0f, 0.0f};
            int i5 = 0;
            do {
                pathMeasure.getPosTan(f2, fArr3, null);
                pointFArr[i5] = new PointF(fArr3[0], fArr3[1]);
                i5++;
                f2 = (f2 + f3) % length2;
            } while (i5 < 25);
            list.add(AbstractC009903n.A0I(pointFArr));
        }
        C0f9.A0D(-1165878723, A06);
    }
}
