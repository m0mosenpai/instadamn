package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.EnumSet;

/* loaded from: classes11.dex */
public final class ULp extends AbstractC66521ULb {
    public static Bitmap A04;
    public static PorterDuffColorFilter A05;
    public static WDS A06;
    public static final ArrayList A07 = new ArrayList(5);
    public int A00;
    public EnumSet A01;
    public final Paint A02;
    public final C66535ULq A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ULp(X.C70394WTw r19, X.C66535ULq r20) {
        /*
            r18 = this;
            r2 = 0
            X.WDS r0 = X.ULp.A06
            if (r0 != 0) goto Lc
            X.WDS r0 = new X.WDS
            r0.<init>()
            X.ULp.A06 = r0
        Lc:
            r1 = r19
            r3 = r20
            r4 = r18
            r4.<init>(r1, r0, r3)
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.A02 = r0
            r0 = 1
            r4.A00 = r0
            r4.A03 = r2
            r4.A03 = r3
            X.W3L r0 = r3.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto La5
            java.lang.String r0 = "dark"
        L2c:
            r3.A01 = r0
            X.WTw r1 = r4.A07
            X.UBx r0 = r1.A0I
            java.util.EnumSet r0 = r0.A0i
            r4.A01 = r0
            X.ULc r0 = new X.ULc
            r0.<init>(r4)
            r4.A08 = r0
            android.graphics.Bitmap r0 = X.ULp.A04
            if (r0 != 0) goto La7
            int r3 = r1.A0F
            android.content.Context r0 = r1.A0G
            android.util.DisplayMetrics r0 = X.AbstractC167007dF.A0K(r0)
            int r1 = r0.densityDpi
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
            X.ULp.A04 = r0
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r0)
            r0 = 320(0x140, float:4.48E-43)
            r2 = 16
            if (r1 < r0) goto L60
            r2 = 32
        L60:
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r0 = -7235677(0xffffffffff9197a3, float:NaN)
            r9.setColor(r0)
            r6 = 0
            r5 = 0
        L6d:
            float r8 = (float) r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto La7
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L7c
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 18
            if (r1 != 0) goto L7e
        L7c:
            r0 = 44
        L7e:
            r9.setAlpha(r0)
            r7 = r5
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r5 - r0
            r10 = r4
            r12 = r6
            r13 = r11
            r14 = r8
            r15 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r12 = r4
            r13 = r6
            r14 = r5
            r15 = r8
            r16 = r5
            r17 = r9
            r12.drawLine(r13, r14, r15, r16, r17)
            r14 = r11
            r16 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            float r0 = (float) r2
            float r5 = r5 + r0
            goto L6d
        La5:
            r0 = 0
            goto L2c
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ULp.<init>(X.WTw, X.ULq):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A07;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (size * 0.1d), 1.1d);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ULX) arrayList.get(i2)).A07;
        }
        int i3 = ((int) (i * max)) + 1;
        iArr[0] = i3;
        iArr[1] = Math.max((i3 - i) - 1, 1);
    }

    @Override // X.ULX, X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A0D(canvas);
        C42961yO.A0M.A02(System.nanoTime() - nanoTime);
    }

    @Override // X.AbstractC66521ULb, X.ULX
    public final C70174WEw A0H(int i, int i2, int i3) {
        C70174WEw A0H = super.A0H(i, i2, i3);
        if (A0H != null) {
            A0H.A02 = i;
            A0H.A03 = i2;
            A0H.A04 = i3;
        }
        return A0H;
    }

    @Override // X.ULX
    public final void A0I() {
        super.A0I();
        ((ULX) this).A07 = 0;
        ArrayList arrayList = A07;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            WDS wds = ((ULX) this).A09;
            if (wds.A03 != -1) {
                wds.A03 = -1;
            }
        }
        int[] iArr = ((ULX) this).A0B;
        A00(iArr);
        WDS wds2 = ((ULX) this).A09;
        wds2.A01 = iArr[0];
        wds2.A02 = iArr[1];
        wds2.A02();
    }
}
