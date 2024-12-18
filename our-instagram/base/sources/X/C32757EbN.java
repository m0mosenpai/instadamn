package X;

import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;

/* renamed from: X.EbN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32757EbN extends FKR {
    public final InfoCenterFactShareInfoIntf A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32757EbN) {
                C32757EbN c32757EbN = (C32757EbN) obj;
                if (!C14360o3.A0K(this.A01, c32757EbN.A01) || !C14360o3.A0K(this.A00, c32757EbN.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32757EbN(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, String str) {
        super(C2EY.A13, str);
        this.A01 = str;
        this.A00 = infoCenterFactShareInfoIntf;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
