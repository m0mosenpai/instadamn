package X;

import android.content.Context;
import android.graphics.Paint;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26654Bpp extends AbstractC50792Va {

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A00;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A02;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A05;

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        if (this != abstractC50812Vc) {
            if (abstractC50812Vc != null && getClass() == abstractC50812Vc.getClass()) {
                C26654Bpp c26654Bpp = (C26654Bpp) abstractC50812Vc;
                if (this.A01 != c26654Bpp.A01 || Float.compare(this.A00, c26654Bpp.A00) != 0 || this.A02 != c26654Bpp.A02 || this.A03 != c26654Bpp.A03 || this.A04 != c26654Bpp.A04 || this.A05 != c26654Bpp.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public C26654Bpp() {
        super("CardClip");
        this.A01 = -1;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new BYD();
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        BYD byd = (BYD) obj;
        int i = this.A01;
        float f = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        Paint paint = byd.A03;
        if (paint.getColor() != i) {
            paint.setColor(i);
            byd.A02 = true;
            byd.invalidateSelf();
        }
        float f2 = (int) (f + 0.5f);
        if (byd.A00 != f2) {
            byd.A00 = f2;
            byd.A02 = true;
            byd.invalidateSelf();
        }
        int i2 = 0;
        int i3 = 0;
        if (z2) {
            i3 = 2;
        }
        int i4 = i3 | (z ? 1 : 0);
        int i5 = 0;
        if (z3) {
            i5 = 4;
        }
        int i6 = i4 | i5;
        if (z4) {
            i2 = 8;
        }
        int i7 = i2 | i6;
        if ((byd.A01 & i7) == 0) {
            byd.A01 = i7;
            byd.A02 = true;
            byd.invalidateSelf();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        BYD byd = (BYD) obj;
        float f = (int) (0.0f + 0.5f);
        if (byd.A00 != f) {
            byd.A00 = f;
            byd.A02 = true;
            byd.invalidateSelf();
        }
        Paint paint = byd.A03;
        if (paint.getColor() != -1) {
            paint.setColor(-1);
            byd.A02 = true;
            byd.invalidateSelf();
        }
        byd.A01 = 0;
        byd.A02 = true;
        byd.invalidateSelf();
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }
}
