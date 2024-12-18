package X;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class KNG extends C148306m0 {
    public final EnumC46147Kbl A00;
    public final InterfaceC16610sE A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.C148306m0
    public final boolean equals(Object obj) {
        if (obj instanceof KNG) {
            if (obj == this) {
                return true;
            }
            C148276lx c148276lx = super.A00;
            if (c148276lx != null) {
                String str = c148276lx.A0Z;
                KNG kng = (KNG) obj;
                C148276lx c148276lx2 = ((C148306m0) kng).A00;
                if (c148276lx2 != null) {
                    if (C14360o3.A0K(str, c148276lx2.A0Z) && this.A00 == kng.A00 && this.A03 == kng.A03 && this.A02 == kng.A02) {
                        return true;
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        return false;
    }

    @Override // X.C148306m0
    public final int hashCode() {
        String str;
        C148276lx c148276lx = super.A00;
        if (c148276lx != null) {
            str = c148276lx.A0Z;
        } else {
            str = null;
        }
        return Arrays.hashCode(new Object[]{str, this.A00, Boolean.valueOf(this.A03), Boolean.valueOf(this.A02)});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNG(EnumC46147Kbl enumC46147Kbl, C148276lx c148276lx, InterfaceC16610sE interfaceC16610sE, boolean z, boolean z2) {
        super(c148276lx);
        AbstractC167017dG.A1Q(c148276lx, interfaceC16610sE);
        this.A00 = enumC46147Kbl;
        this.A01 = interfaceC16610sE;
        this.A03 = z;
        this.A02 = z2;
    }
}
