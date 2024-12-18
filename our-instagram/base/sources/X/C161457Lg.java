package X;

import com.instagram.user.model.User;

/* renamed from: X.7Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161457Lg extends C0T6 implements InterfaceC66482zP, C7VC {
    public final C161647Lz A00;
    public final C7IK A01;
    public final User A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final InterfaceC16610sE A05;
    public final boolean A06;
    public final InterfaceC09390do A07;

    public C161457Lg(C161647Lz c161647Lz, C7IK c7ik, User user, String str, InterfaceC16610sE interfaceC16610sE, boolean z) {
        C14360o3.A0B(c161647Lz, 4);
        C14360o3.A0B(interfaceC16610sE, 6);
        this.A03 = str;
        this.A02 = user;
        this.A06 = z;
        this.A00 = c161647Lz;
        this.A01 = c7ik;
        this.A05 = interfaceC16610sE;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9E8(this, 29));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, MG6.A00);
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C161457Lg) {
                C161457Lg c161457Lg = (C161457Lg) obj;
                if (!C14360o3.A0K(this.A03, c161457Lg.A03) || !C14360o3.A0K(this.A02, c161457Lg.A02) || this.A06 != c161457Lg.A06 || !C14360o3.A0K(this.A00, c161457Lg.A00) || !C14360o3.A0K(this.A01, c161457Lg.A01) || !C14360o3.A0K(this.A05, c161457Lg.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final int getType() {
        return 168;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04.getValue();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        User user = this.A02;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        int hashCode3 = (((i3 + i4) * 31) + this.A00.hashCode()) * 31;
        C7IK c7ik = this.A01;
        if (c7ik != null) {
            i = c7ik.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.A05.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
