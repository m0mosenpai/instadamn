package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.9C0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C0 extends C0T6 implements InterfaceC66492zQ, InterfaceC129555tK {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    public C9C0(DirectMessageIdentifier directMessageIdentifier, String str, int i, int i2) {
        this.A03 = directMessageIdentifier;
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9C0) {
                    C9C0 c9c0 = (C9C0) obj;
                    if (c9c0.A00 == 1 && C14360o3.A0K(this.A03, c9c0.A03) && C14360o3.A0K(this.A04, c9c0.A04) && this.A01 == c9c0.A01) {
                        i = this.A02;
                        i2 = c9c0.A02;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9C0)) {
                return false;
            }
            C9C0 c9c02 = (C9C0) obj;
            if (c9c02.A00 != 0 || !C14360o3.A0K(this.A04, c9c02.A04) || !C14360o3.A0K(this.A03, c9c02.A03) || this.A02 != c9c02.A02) {
                return false;
            }
            i = this.A01;
            i2 = c9c02.A01;
        } else {
            return true;
        }
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        if (this.A00 != 0) {
            int hashCode3 = this.A03.hashCode() * 31;
            String str = this.A04;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            hashCode = (((hashCode3 + hashCode2) * 31) + this.A01) * 31;
            i = this.A02;
        } else {
            hashCode = ((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public C9C0(DirectMessageIdentifier directMessageIdentifier, String str, int i, int i2, int i3) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A03 = directMessageIdentifier;
        this.A02 = i;
        this.A01 = i2;
    }
}
