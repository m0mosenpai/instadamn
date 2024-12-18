package X;

import java.util.Arrays;

/* renamed from: X.Ovf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56120Ovf implements InterfaceC66482zP {
    public final EnumC33419Epq A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56120Ovf)) {
            return false;
        }
        C56120Ovf c56120Ovf = (C56120Ovf) obj;
        return this.A00 == c56120Ovf.A00 && AbstractC50102Ry.A00(this.A01, c56120Ovf.A01);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC167007dF.A1X(this.A00, ((C56120Ovf) obj).A00);
    }

    public C56120Ovf(EnumC33419Epq enumC33419Epq, String str) {
        this.A00 = enumC33419Epq;
        this.A01 = str;
    }
}
