package X;

import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;

/* renamed from: X.EbO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32758EbO extends FKR {
    public final InfoCenterShareInfoIntf A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32758EbO) {
                C32758EbO c32758EbO = (C32758EbO) obj;
                if (!C14360o3.A0K(this.A01, c32758EbO.A01) || !C14360o3.A0K(this.A00, c32758EbO.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32758EbO(InfoCenterShareInfoIntf infoCenterShareInfoIntf, String str) {
        super(C2EY.A14, str);
        this.A01 = str;
        this.A00 = infoCenterShareInfoIntf;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
