package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TIFUAppDestinationEnum;

/* renamed from: X.4dJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99454dJ extends C0T6 implements InterfaceC99464dK {
    public final TIFUAppDestinationEnum A00;
    public final String A01;

    @Override // X.InterfaceC99464dK
    public final C99454dJ F2m() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99454dJ) {
                C99454dJ c99454dJ = (C99454dJ) obj;
                if (this.A00 != c99454dJ.A00 || !C14360o3.A0K(this.A01, c99454dJ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TIFUAppDestinationEnum tIFUAppDestinationEnum = this.A00;
        int hashCode = (tIFUAppDestinationEnum == null ? 0 : tIFUAppDestinationEnum.hashCode()) * 31;
        String str = this.A01;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC99464dK
    public final TIFUAppDestinationEnum BL4() {
        return this.A00;
    }

    @Override // X.InterfaceC99464dK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTIFUAppUrl", CDY.A00(this));
    }

    @Override // X.InterfaceC99464dK
    public final String getUrl() {
        return this.A01;
    }

    public C99454dJ(TIFUAppDestinationEnum tIFUAppDestinationEnum, String str) {
        this.A00 = tIFUAppDestinationEnum;
        this.A01 = str;
    }
}
