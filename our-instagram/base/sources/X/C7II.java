package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;

/* renamed from: X.7II, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7II {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final C7F8 A08;
    public final DirectThreadThemeInfo A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;

    public final Drawable A04() {
        C162817Qs c162817Qs = new C162817Qs(null, StringTreeSet.MAX_SYMBOL_COUNT);
        A01(c162817Qs, C7R2.A05, this, 0.0f, 0.0f);
        new Object();
        return (Drawable) AbstractC162857Qw.A00(c162817Qs, true).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r4 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r0 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r0 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r4 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C74843Xy A05(android.content.Context r7, X.C7R2 r8, boolean r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r0 = 4
            X.C14360o3.A0B(r8, r0)
            X.3Xy r5 = new X.3Xy
            r5.<init>()
            boolean r4 = X.AbstractC13620mo.A02(r7)
            r1 = 0
            if (r9 != 0) goto L5c
            X.7R2 r0 = X.C7R2.A02
            if (r8 == r0) goto L4c
            X.7R2 r0 = X.C7R2.A04
            if (r8 == r0) goto L4c
            float r3 = r6.A02
            r2 = r3
        L1f:
            if (r10 != 0) goto L4a
            X.7R2 r0 = X.C7R2.A03
            if (r8 == r0) goto L30
            X.7R2 r0 = X.C7R2.A04
            if (r8 == r0) goto L30
            float r1 = r6.A02
            r0 = r1
        L2c:
            r5.A07(r3, r2, r1, r0)
            return r5
        L30:
            if (r11 == 0) goto L3e
            if (r4 == 0) goto L3b
            float r1 = r6.A01
        L36:
            if (r4 == 0) goto L44
        L38:
            float r0 = r6.A02
            goto L2c
        L3b:
            float r1 = r6.A02
            goto L36
        L3e:
            if (r4 == 0) goto L47
            float r1 = r6.A02
        L42:
            if (r4 == 0) goto L38
        L44:
            float r0 = r6.A01
            goto L2c
        L47:
            float r1 = r6.A01
            goto L42
        L4a:
            r0 = 0
            goto L2c
        L4c:
            if (r11 == 0) goto L55
            if (r4 == 0) goto L57
        L50:
            float r3 = r6.A01
            float r2 = r6.A02
            goto L1f
        L55:
            if (r4 == 0) goto L50
        L57:
            float r3 = r6.A02
            float r2 = r6.A01
            goto L1f
        L5c:
            r3 = 0
            r2 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7II.A05(android.content.Context, X.7R2, boolean, boolean, boolean):X.3Xy");
    }

    public static final C74843Xy A00(C7R2 c7r2, C7II c7ii, float f, float f2) {
        C74843Xy c74843Xy = new C74843Xy();
        int ordinal = c7r2.ordinal();
        if (ordinal != 3) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 0) {
                        float f3 = c7ii.A02;
                        c74843Xy.A07(f3, f3, f3, f3);
                        return c74843Xy;
                    }
                    throw new RuntimeException();
                }
                float f4 = c7ii.A02;
                c74843Xy.A07(f4, f4, f, f2);
                return c74843Xy;
            }
            float f5 = c7ii.A02;
            c74843Xy.A07(f, f2, f5, f5);
            return c74843Xy;
        }
        c74843Xy.A07(f, f2, f, f2);
        return c74843Xy;
    }

    public static final boolean A02(Context context, C162247Oj c162247Oj, AnonymousClass541 anonymousClass541) {
        if (anonymousClass541 == AnonymousClass541.A0G) {
            int rgb = Color.rgb(151, 42, 92);
            C14360o3.A07(context.getResources());
            c162247Oj.A03(rgb, Color.rgb(232, 86, 86), AbstractC69815Vw1.A01(r1, 3.0f));
        } else if (anonymousClass541 == AnonymousClass541.A0H) {
            c162247Oj.A01(Color.rgb(255, 110, 36));
        } else if (anonymousClass541 == AnonymousClass541.A0F) {
            c162247Oj.A01.getPaint().setAlpha(0);
            c162247Oj.A00.getPaint().setAlpha(0);
        } else if (anonymousClass541 == null || !anonymousClass541.A02) {
            return false;
        }
        return true;
    }

    public final int A03(boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        if (z) {
            i = this.A0E;
            i2 = this.A0F;
        } else {
            i = this.A03;
            i2 = this.A04;
        }
        if (i2 != 0) {
            i = i2;
        }
        if (z2 || z3) {
            i = AbstractC13950nL.A02(0.5f, i, this.A0G);
        }
        if (i == this.A03 && z4 && C14640oc.A07()) {
            return this.A07;
        }
        return i;
    }

    public C7II(Context context, C7F8 c7f8, DirectThreadThemeInfo directThreadThemeInfo, int[] iArr, float f, float f2, float f3, int i, int i2, int i3, boolean z) {
        this.A09 = directThreadThemeInfo;
        this.A08 = c7f8;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A04 = i;
        this.A05 = i2;
        this.A0B = iArr;
        this.A0G = i3;
        this.A0A = z;
        int A0F = AbstractC53242c7.A0F(context, R.attr.messageFromOthersGrayBackground);
        this.A03 = A0F;
        this.A07 = AbstractC53242c7.A0F(context, R.attr.igds_color_generic_xma_background_color);
        this.A06 = AbstractC13950nL.A07(i2, 0.4f);
        this.A0F = AbstractC13950nL.A07(i, 0.4f);
        this.A0E = AbstractC13950nL.A07(A0F, 0.4f);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(AbstractC13950nL.A02(0.5f, i4, this.A0G)));
        }
        this.A0C = AbstractC001800i.A0x(arrayList);
        int[] iArr2 = this.A0B;
        ArrayList arrayList2 = new ArrayList(iArr2.length);
        for (int i5 : iArr2) {
            arrayList2.add(Integer.valueOf(AbstractC13950nL.A07(i5, 0.4f)));
        }
        this.A0D = AbstractC001800i.A0x(arrayList2);
    }

    public static final void A01(AbstractC148416mB abstractC148416mB, C7R2 c7r2, C7II c7ii, float f, float f2) {
        int ordinal = c7r2.ordinal();
        if (ordinal != 3) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 0) {
                        float f3 = c7ii.A02;
                        abstractC148416mB.A00(f3, f3, f3, f3);
                        return;
                    }
                    throw new RuntimeException();
                }
                float f4 = c7ii.A02;
                abstractC148416mB.A00(f4, f4, f, f2);
                return;
            }
            float f5 = c7ii.A02;
            abstractC148416mB.A00(f, f2, f5, f5);
            return;
        }
        abstractC148416mB.A00(f, f2, f, f2);
    }
}
