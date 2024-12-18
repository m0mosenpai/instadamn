package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3ZM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZM {
    public final InterfaceC59502nt A00;
    public final C75363a3 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        ImageUrl imageUrl;
        if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
            return false;
        }
        C3ZM c3zm = (C3ZM) obj;
        if (!C14360o3.A0K(this.A02, c3zm.A02)) {
            return false;
        }
        InterfaceC59502nt interfaceC59502nt = this.A00;
        if (interfaceC59502nt == null) {
            if (c3zm.A00 != null) {
                return false;
            }
        } else {
            ImageUrl BGt = interfaceC59502nt.BGt();
            InterfaceC59502nt interfaceC59502nt2 = c3zm.A00;
            if (interfaceC59502nt2 != null) {
                imageUrl = interfaceC59502nt2.BGt();
            } else {
                imageUrl = null;
            }
            if (!C2I7.A00(BGt, imageUrl)) {
                return false;
            }
        }
        return C2I7.A00(this.A01, c3zm.A01);
    }

    public final int hashCode() {
        String str = this.A02;
        if (str != null) {
            int hashCode = str.hashCode() * 31;
            int i = 1;
            int i2 = 0;
            if (this.A00 != null) {
                i2 = 1;
            }
            int i3 = (hashCode + i2) * 31;
            if (this.A01 == null) {
                i = 0;
            }
            return i3 + i;
        }
        return super.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.A02;
        InterfaceC59502nt interfaceC59502nt = this.A00;
        String str3 = null;
        if (interfaceC59502nt != null) {
            str = interfaceC59502nt.AjY();
        } else {
            str = null;
        }
        C75363a3 c75363a3 = this.A01;
        if (c75363a3 != null) {
            str3 = c75363a3.A02();
        }
        return AnonymousClass001.A13("ID = ", str2, ", Image = ", str, ", Video = ", str3);
    }

    public C3ZM(InterfaceC59502nt interfaceC59502nt, C75363a3 c75363a3, String str) {
        this.A02 = str;
        this.A00 = interfaceC59502nt;
        this.A01 = c75363a3;
    }
}
