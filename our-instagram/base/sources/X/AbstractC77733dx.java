package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.3dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77733dx {
    public AbstractC50792Va A00;
    public final C2XE A01;
    public final C2XH A02;

    public static void A00(BitSet bitSet, String[] strArr, int i) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException(AnonymousClass001.A0R(AbstractC111324zv.A00(695), Arrays.toString(arrayList.toArray())));
        }
    }

    public final void A02() {
        AbstractC50792Va abstractC50792Va = this.A00;
        C50932Vp A0a = abstractC50792Va.A0a();
        String str = abstractC50792Va.A01;
        C76973cj A01 = C50932Vp.A01(A0a);
        A01.A02 |= 512;
        A01.A0F = null;
        A01.A0G = str;
        C76973cj c76973cj = abstractC50792Va.A0a().A05;
        if (c76973cj == null || c76973cj.A0E == null) {
            A07(AbstractC51432Xq.A04);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0.floatValue() > 0.0f) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r4 = this;
            boolean r0 = X.C2V3.isZeroAlphaLoggingEnabled
            if (r0 == 0) goto L41
            X.2Va r0 = r4.A00
            X.2Vp r0 = r0.A00
            if (r0 == 0) goto L41
            X.2Vr r3 = r0.A06
            if (r3 == 0) goto L41
            float r0 = r3.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 1
            if (r0 == 0) goto L21
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L22
        L21:
            r1 = 0
        L22:
            X.2V9 r0 = r3.A0I
            if (r0 != 0) goto L33
            X.2V9 r0 = r3.A0M
            if (r0 != 0) goto L33
            X.2V9 r0 = r3.A0X
            if (r0 != 0) goto L33
            X.2V9 r0 = r3.A0L
            if (r0 != 0) goto L33
            r2 = 0
        L33:
            if (r1 == 0) goto L41
            if (r2 == 0) goto L41
            X.2Ur r1 = X.EnumC50702Ur.A06
            X.B3T r0 = new X.B3T
            r0.<init>()
            X.AbstractC61784Rte.A00(r1, r0)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77733dx.A03():void");
    }

    public final void A04() {
        this.A00.A0a().A0D(100.0f);
    }

    public final void A05(Drawable drawable) {
        this.A00.A0a().A0M(drawable);
    }

    public final void A06(C51322Xf c51322Xf) {
        ((AbstractC50812Vc) this.A00).A01 = c51322Xf;
    }

    public final void A07(EnumC76913cd enumC76913cd) {
        C76973cj A01 = C50932Vp.A01(this.A00.A0a());
        A01.A02 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        A01.A0E = enumC76913cd;
    }

    public final void A08(EnumC77763e0 enumC77763e0, int i) {
        this.A00.A0a().A0U(enumC77763e0, i);
    }

    public final void A09(EnumC77933eL enumC77933eL) {
        this.A00.A0a().A0W(enumC77933eL);
    }

    public AbstractC77733dx(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, int i) {
        c2xe.getClass();
        this.A02 = c2xe.A0D;
        AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
        this.A00 = abstractC50792Va;
        this.A01 = c2xe;
        if (c2xe.A01 != null) {
            abstractC50792Va.A01 = c2xe.A08();
        }
        if (i != 0) {
            AbstractC50792Va abstractC50792Va2 = this.A00;
            abstractC50792Va2.A0a().A00 = i;
            try {
                c2xe.A00 = i;
                abstractC50792Va2.A0o(c2xe);
                c2xe.A00 = 0;
            } catch (Exception e) {
                C51372Xk.A01(abstractC50812Vc, c2xe, e);
            }
        }
        ((AbstractC50812Vc) this.A00).A02 = AbstractC50812Vc.A01(c2xe.A0C);
    }
}
