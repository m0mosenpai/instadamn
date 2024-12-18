package X;

import android.content.Context;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26653Bpo extends AbstractC50792Va {

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A00;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public float A01;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public float A02;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public float A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A05;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A06;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A07;

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        if (this != abstractC50812Vc) {
            if (abstractC50812Vc != null && getClass() == abstractC50812Vc.getClass()) {
                C26653Bpo c26653Bpo = (C26653Bpo) abstractC50812Vc;
                if (Float.compare(this.A00, c26653Bpo.A00) != 0 || this.A06 != c26653Bpo.A06 || this.A07 != c26653Bpo.A07 || Float.compare(-1.0f, -1.0f) != 0 || this.A04 != c26653Bpo.A04 || Float.compare(this.A01, c26653Bpo.A01) != 0 || Float.compare(this.A02, c26653Bpo.A02) != 0 || Float.compare(this.A03, c26653Bpo.A03) != 0 || this.A05 != c26653Bpo.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public C26653Bpo() {
        super("CardShadow");
        this.A01 = -1.0f;
        this.A02 = -1.0f;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new BYI();
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        BYI byi = (BYI) obj;
        int i = this.A05;
        int i2 = this.A04;
        float f = this.A00;
        float f2 = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        float f3 = this.A01;
        float f4 = this.A02;
        if (byi.A07 != i) {
            byi.A07 = i;
            byi.A08 = true;
            byi.invalidateSelf();
        }
        if (byi.A06 != i2) {
            byi.A06 = i2;
            byi.A08 = true;
            byi.invalidateSelf();
        }
        float f5 = (int) (f + 0.5f);
        if (byi.A00 != f5) {
            byi.A00 = f5;
            byi.A08 = true;
            byi.invalidateSelf();
        }
        if (f2 >= 0.0f) {
            int i3 = (int) (f2 + 0.5f);
            if (i3 % 2 == 1) {
                i3--;
            }
            float f6 = i3;
            if (byi.A05 != f6) {
                byi.A05 = f6;
                byi.A08 = true;
                byi.invalidateSelf();
            }
            byi.A0A = z;
            byi.A09 = z2;
            byi.A03 = f3;
            byi.A04 = f4;
            if (-1.0f != byi.A01) {
                byi.A01 = -1.0f;
                byi.A08 = true;
                byi.invalidateSelf();
            }
            if (-1.0f != byi.A02) {
                byi.A02 = -1.0f;
                byi.A08 = true;
                byi.invalidateSelf();
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("invalid shadow size");
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }
}
