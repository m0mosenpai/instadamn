package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;

/* renamed from: X.4qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105984qC extends C0T6 implements InterfaceC105994qD {
    public final IGAdTransparencyDisclaimerPlacement A00;
    public final String A01;

    @Override // X.InterfaceC105994qD
    public final C105984qC EuM() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C105984qC) {
                C105984qC c105984qC = (C105984qC) obj;
                if (!C14360o3.A0K(this.A01, c105984qC.A01) || this.A00 != c105984qC.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement = this.A00;
        return hashCode + (iGAdTransparencyDisclaimerPlacement != null ? iGAdTransparencyDisclaimerPlacement.hashCode() : 0);
    }

    @Override // X.InterfaceC105994qD
    public final String BKx() {
        return this.A01;
    }

    @Override // X.InterfaceC105994qD
    public final IGAdTransparencyDisclaimerPlacement Bde() {
        return this.A00;
    }

    @Override // X.InterfaceC105994qD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdTransparencyDisclaimerInfoDict", CDF.A00(this));
    }

    public C105984qC(IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, String str) {
        this.A01 = str;
        this.A00 = iGAdTransparencyDisclaimerPlacement;
    }
}
