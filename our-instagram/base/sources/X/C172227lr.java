package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.FullHeightLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.7lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172227lr {
    public TargetViewSizeProvider A00;
    public int A01;
    public final InterfaceC172217lq A02;

    public C172227lr(TargetViewSizeProvider targetViewSizeProvider, InterfaceC172217lq interfaceC172217lq) {
        C14360o3.A0B(targetViewSizeProvider, 1);
        this.A00 = targetViewSizeProvider;
        this.A02 = interfaceC172217lq;
        this.A01 = -1;
    }

    public final void A00(int i) {
        int i2;
        int min;
        float A04;
        float f;
        float f2;
        int max;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) this.A00;
        if (nineSixteenLayoutConfigImpl instanceof FullHeightLayoutConfigImpl) {
            if (nineSixteenLayoutConfigImpl.A02 <= 0.5625f) {
                i2 = ((nineSixteenLayoutConfigImpl.A08 - nineSixteenLayoutConfigImpl.A05) - nineSixteenLayoutConfigImpl.A03) - nineSixteenLayoutConfigImpl.A0A;
            } else {
                i2 = nineSixteenLayoutConfigImpl.A0K.getHeight();
            }
        } else {
            i2 = nineSixteenLayoutConfigImpl.A0E;
        }
        TargetViewSizeProvider targetViewSizeProvider = this.A00;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl2 = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        int max2 = Math.max(0, (nineSixteenLayoutConfigImpl2.A0I + i) - nineSixteenLayoutConfigImpl2.A0G);
        boolean CV5 = targetViewSizeProvider.CV5();
        if (CV5) {
            min = 0;
            A04 = 1.0f;
        } else {
            int BRK = targetViewSizeProvider.BRK();
            int i3 = nineSixteenLayoutConfigImpl2.A0A;
            if (BRK == 0) {
                min = Math.min(i, i3);
            } else {
                int i4 = i3 + BRK;
                min = Math.min((int) AbstractC70163Da.A04(max2, BRK, BRK + i4, 0.0d, i4), i4) - BRK;
            }
            A04 = (float) AbstractC70163Da.A04(min, i3 / 2, i3, 0.0d, 1.0d);
        }
        int max3 = Math.max(max2 + min, 0);
        float f3 = i2;
        float f4 = 1.0f - (max3 / f3);
        if (f4 < 0.3f) {
            max3 = (int) (f3 * (1.0f - 0.3f));
            f4 = 0.3f;
        }
        if (CV5) {
            f = nineSixteenLayoutConfigImpl2.A0A;
            f2 = f - (f * f4);
            max3 = (int) (max3 + f2);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (f4 != 0.3f || (max = this.A01) < 0) {
            max = (int) Math.max(0.0f, (nineSixteenLayoutConfigImpl2.A0B + ((nineSixteenLayoutConfigImpl2.A09 - r1) / 2.0f)) - (nineSixteenLayoutConfigImpl2.A04 - ((((nineSixteenLayoutConfigImpl2.A0H + max3) - f2) - ((min + f) / 2.0f)) - nineSixteenLayoutConfigImpl2.A03)));
            if (f4 == 0.3f) {
                this.A01 = max;
            }
        }
        this.A02.Dyf(max3, max, f4, A04);
    }
}
