package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.5jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124355jr extends C0T6 implements InterfaceC124365js {
    public final int A00;
    public final C124545kG A01;
    public final LimitedInteractionsVersions A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C124355jr) {
                C124355jr c124355jr = (C124355jr) obj;
                if (this.A00 != c124355jr.A00 || !C14360o3.A0K(this.A01, c124355jr.A01) || this.A03 != c124355jr.A03 || this.A02 != c124355jr.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A00 * 31;
        C124545kG c124545kG = this.A01;
        int i2 = 0;
        if (c124545kG == null) {
            hashCode = 0;
        } else {
            hashCode = c124545kG.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        int i4 = 1237;
        if (this.A03) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        LimitedInteractionsVersions limitedInteractionsVersions = this.A02;
        if (limitedInteractionsVersions != null) {
            i2 = limitedInteractionsVersions.hashCode();
        }
        return i5 + i2;
    }

    public C124355jr(C124545kG c124545kG, LimitedInteractionsVersions limitedInteractionsVersions, int i, boolean z) {
        this.A00 = i;
        this.A01 = c124545kG;
        this.A03 = z;
        this.A02 = limitedInteractionsVersions;
    }
}
