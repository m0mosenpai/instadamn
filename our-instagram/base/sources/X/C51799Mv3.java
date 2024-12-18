package X;

import com.instagram.api.schemas.TrackData;

/* renamed from: X.Mv3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51799Mv3 extends C0T6 implements InterfaceC58243Prn {
    public final int A00;
    public final TrackData A01;

    public C51799Mv3(TrackData trackData, int i) {
        C14360o3.A0B(trackData, 1);
        this.A01 = trackData;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51799Mv3) {
                C51799Mv3 c51799Mv3 = (C51799Mv3) obj;
                if (!C14360o3.A0K(this.A01, c51799Mv3.A01) || this.A00 != c51799Mv3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }
}
