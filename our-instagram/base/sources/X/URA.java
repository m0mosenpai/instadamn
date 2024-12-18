package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class URA extends C0T6 implements XG5 {
    public final InterfaceC72031XFt A00;
    public final XG4 A01;
    public final InterfaceC72032XFu A02;
    public final List A03;

    @Override // X.XG5
    public final URA ExA() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URA) {
                URA ura = (URA) obj;
                if (!C14360o3.A0K(this.A02, ura.A02) || !C14360o3.A0K(this.A01, ura.A01) || !C14360o3.A0K(this.A00, ura.A00) || !C14360o3.A0K(this.A03, ura.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG5
    public final InterfaceC72032XFu Abr() {
        return this.A02;
    }

    @Override // X.XG5
    public final XG4 Aet() {
        return this.A01;
    }

    @Override // X.XG5
    public final InterfaceC72031XFt AfD() {
        return this.A00;
    }

    @Override // X.XG5
    public final List Bd0() {
        return this.A03;
    }

    @Override // X.XG5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardPhotoCardMetadataPayloadV1", AbstractC68379VOn.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        List list = this.A03;
        if (list != null) {
            i = list.hashCode();
        }
        return A0M + i;
    }

    public URA(InterfaceC72031XFt interfaceC72031XFt, XG4 xg4, InterfaceC72032XFu interfaceC72032XFu, List list) {
        this.A02 = interfaceC72032XFu;
        this.A01 = xg4;
        this.A00 = interfaceC72031XFt;
        this.A03 = list;
    }
}
