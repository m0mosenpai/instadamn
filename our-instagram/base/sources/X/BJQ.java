package X;

import android.content.Context;
import android.graphics.Paint;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* loaded from: classes5.dex */
public final class BJQ extends AbstractC50792Va {

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A00;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A02;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A05;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A06;
    public C2XI[] A07;

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        if (this != abstractC50812Vc) {
            if (abstractC50812Vc != null && getClass() == abstractC50812Vc.getClass()) {
                BJQ bjq = (BJQ) abstractC50812Vc;
                if (this.A01 != bjq.A01 || this.A02 != bjq.A02 || Float.compare(this.A00, bjq.A00) != 0 || this.A03 != bjq.A03 || this.A04 != bjq.A04 || this.A05 != bjq.A05 || this.A06 != bjq.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public BJQ() {
        super("TransparencyEnabledCardClip");
        this.A01 = -1;
        this.A02 = 0;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new C25573BSk();
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        C25573BSk c25573BSk = (C25573BSk) obj;
        int i = this.A01;
        int i2 = this.A02;
        float f = this.A00;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A03;
        boolean z4 = this.A04;
        Paint paint = c25573BSk.A04;
        if (paint.getColor() != i) {
            paint.setColor(i);
            c25573BSk.invalidateSelf();
        }
        c25573BSk.A00(i2);
        float f2 = (int) (f + 0.5f);
        if (c25573BSk.A00 != f2) {
            c25573BSk.A03 = true;
            c25573BSk.A00 = f2;
            c25573BSk.invalidateSelf();
        }
        int i3 = 0;
        int i4 = 0;
        if (z2) {
            i4 = 2;
        }
        int i5 = i4 | (z ? 1 : 0);
        int i6 = 0;
        if (z3) {
            i6 = 4;
        }
        int i7 = i5 | i6;
        if (z4) {
            i3 = 8;
        }
        c25573BSk.A01(i3 | i7);
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        C25573BSk c25573BSk = (C25573BSk) obj;
        float f = (int) (0.0f + 0.5f);
        if (c25573BSk.A00 != f) {
            c25573BSk.A03 = true;
            c25573BSk.A00 = f;
            c25573BSk.invalidateSelf();
        }
        Paint paint = c25573BSk.A04;
        if (paint.getColor() != -1) {
            paint.setColor(-1);
            c25573BSk.invalidateSelf();
        }
        c25573BSk.A00(0);
        c25573BSk.A02 = AbstractC166997dE.A0P();
        c25573BSk.A01(0);
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }

    @Override // X.AbstractC50792Va
    public final C2XI[] A1A() {
        return this.A07;
    }

    @Override // X.AbstractC50792Va
    public final void A0i(int i, Object obj, Object obj2) {
    }
}
