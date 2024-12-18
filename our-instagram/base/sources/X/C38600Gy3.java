package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;

/* renamed from: X.Gy3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38600Gy3 extends C0T6 {
    public final IntentAwareAdsInfo A00;
    public final C38604Gy7 A01;

    public C38600Gy3(IntentAwareAdsInfo intentAwareAdsInfo, C38604Gy7 c38604Gy7) {
        C14360o3.A0B(intentAwareAdsInfo, 1);
        this.A00 = intentAwareAdsInfo;
        this.A01 = c38604Gy7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38600Gy3) {
                C38600Gy3 c38600Gy3 = (C38600Gy3) obj;
                if (!C14360o3.A0K(this.A00, c38600Gy3.A00) || !C14360o3.A0K(this.A01, c38600Gy3.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
