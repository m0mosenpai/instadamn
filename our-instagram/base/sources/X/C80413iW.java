package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.3iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80413iW extends AbstractC50792Va {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.DRAWABLE)
    public Drawable A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public ImageView.ScaleType A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A02;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0U() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final void A0o(C2XE c2xe) {
        Drawable drawable = null;
        ImageView.ScaleType scaleType = null;
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        TypedArray A02 = c2xe.A02(0, COC.A02);
        int indexCount = A02.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = A02.getIndex(i);
            if (index == 0) {
                drawable = c2xe.A0C.getResources().getDrawable(A02.getResourceId(index, 0));
            } else if (index == 1) {
                scaleType = AbstractC80443iZ.A00[A02.getInteger(index, -1)];
            }
        }
        A02.recycle();
        if (drawable != null) {
            this.A00 = drawable;
        }
        if (scaleType != null) {
            this.A01 = scaleType;
        }
    }

    @Override // X.AbstractC50792Va
    public final boolean A17() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(X.AbstractC50812Vc r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L39
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.3iW r5 = (X.C80413iW) r5
            android.graphics.drawable.Drawable r1 = r4.A00
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            android.widget.ImageView$ScaleType r1 = r4.A01
            android.widget.ImageView$ScaleType r0 = r5.A01
            if (r1 == 0) goto L2f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
            return r2
        L2f:
            if (r0 == 0) goto L32
            return r2
        L32:
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 == r0) goto L39
            return r2
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80413iW.A19(X.2Vc, boolean):boolean");
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final boolean AFr() {
        return true;
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final int E4c() {
        return 30;
    }

    public C80413iW() {
        super("ImageComponent");
        this.A02 = true;
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        return new Drawable();
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0V(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50922Vo abstractC50922Vo, AbstractC50922Vo abstractC50922Vo2) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        Drawable drawable;
        Drawable drawable2;
        Boolean valueOf;
        C80413iW c80413iW = (C80413iW) abstractC50812Vc;
        C80413iW c80413iW2 = (C80413iW) abstractC50812Vc2;
        Boolean bool = null;
        if (c80413iW == null) {
            scaleType = null;
        } else {
            scaleType = c80413iW.A01;
        }
        if (c80413iW2 == null) {
            scaleType2 = null;
        } else {
            scaleType2 = c80413iW2.A01;
        }
        if (c80413iW == null) {
            drawable = null;
        } else {
            drawable = c80413iW.A00;
        }
        if (c80413iW2 == null) {
            drawable2 = null;
        } else {
            drawable2 = c80413iW2.A00;
        }
        if (c80413iW == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(c80413iW.A02);
        }
        if (c80413iW2 != null) {
            bool = Boolean.valueOf(c80413iW2.A02);
        }
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        if (scaleType2 == scaleType && AnonymousClass530.A00(drawable2, drawable) && bool == valueOf) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2WI, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ C2WI A0e() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        Drawable drawable = this.A00;
        boolean z = this.A02;
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
                c2Vj.A01 = intrinsicWidth;
                c2Vj.A00 = intrinsicHeight;
                return;
            }
            float f = intrinsicWidth / intrinsicHeight;
            if (z) {
                C14360o3.A0B(c2Vj, 5);
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i) > intrinsicWidth) {
                    i = View.MeasureSpec.makeMeasureSpec(intrinsicWidth, Integer.MIN_VALUE);
                }
                if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > intrinsicHeight) {
                    i2 = View.MeasureSpec.makeMeasureSpec(intrinsicHeight, Integer.MIN_VALUE);
                }
            }
            AbstractC85943sO.A01(c2Vj, f, i, i2);
            return;
        }
        c2Vj.A01 = 0;
        c2Vj.A00 = 0;
    }

    @Override // X.AbstractC50792Va
    public final void A0s(C2XE c2xe, C2WI c2wi, C2W6 c2w6) {
        C51332Xg c51332Xg;
        Integer valueOf;
        int A00;
        Drawable drawable = this.A00;
        ImageView.ScaleType scaleType = this.A01;
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        int A02 = c2w6.A02() + c2w6.A03();
        int A04 = c2w6.A04() + c2w6.A01();
        if (ImageView.ScaleType.FIT_XY != scaleType && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            c51332Xg = C51332Xg.A01.A00(drawable, scaleType, c2w6.A05() - A02, c2w6.A00() - A04);
            valueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            A00 = drawable.getIntrinsicHeight();
        } else {
            c51332Xg = null;
            valueOf = Integer.valueOf(c2w6.A05() - A02);
            A00 = c2w6.A00() - A04;
        }
        Integer valueOf2 = Integer.valueOf(A00);
        C80433iY c80433iY = (C80433iY) c2wi;
        c80433iY.A00 = c51332Xg;
        c80433iY.A02 = valueOf;
        c80433iY.A01 = valueOf2;
    }

    @Override // X.AbstractC50792Va
    public final void A0t(C2XE c2xe, C2WI c2wi, Object obj) {
        C80433iY c80433iY = (C80433iY) c2wi;
        Integer num = c80433iY.A02;
        Integer num2 = c80433iY.A01;
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        ((C51202Wt) obj).A02(num.intValue(), num2.intValue());
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        Drawable drawable = this.A00;
        C51332Xg c51332Xg = ((C80433iY) c2wi).A00;
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        ((C51202Wt) obj).A03(drawable, c51332Xg);
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        ImageView.ScaleType[] scaleTypeArr = AbstractC80443iZ.A00;
        ((C51202Wt) obj).A01();
    }

    @Override // X.AbstractC50792Va
    public final void A0y(C2WI c2wi, C2WI c2wi2) {
        C80433iY c80433iY = (C80433iY) c2wi;
        C80433iY c80433iY2 = (C80433iY) c2wi2;
        c80433iY.A01 = c80433iY2.A01;
        c80433iY.A00 = c80433iY2.A00;
        c80433iY.A02 = c80433iY2.A02;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        return super.A0P();
    }
}
