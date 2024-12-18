package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;

/* loaded from: classes6.dex */
public final class E7s extends C0T6 implements InterfaceC37265GbI {
    public final IGClickToMessagingCardTypeEnum A00;
    public final String A01;

    @Override // X.InterfaceC37265GbI
    public final E7s Eub() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7s) {
                E7s e7s = (E7s) obj;
                if (this.A00 != e7s.A00 || !C14360o3.A0K(this.A01, e7s.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37265GbI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGClickToMessagingCardDict", AbstractC33702Euq.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public E7s(IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum, String str) {
        this.A00 = iGClickToMessagingCardTypeEnum;
        this.A01 = str;
    }

    @Override // X.InterfaceC37265GbI
    public final IGClickToMessagingCardTypeEnum Am0() {
        return this.A00;
    }

    @Override // X.InterfaceC37265GbI
    public final String BEd() {
        return this.A01;
    }
}
