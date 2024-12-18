package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Mw7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51863Mw7 extends C0T6 implements InterfaceC57855PlL {
    public final long A00;
    public final String A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51863Mw7) {
                C51863Mw7 c51863Mw7 = (C51863Mw7) obj;
                if (this.A00 != c51863Mw7.A00 || !C14360o3.A0K(this.A01, c51863Mw7.A01) || this.A02 != c51863Mw7.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A03 = (AbstractC25235BEs.A03(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "STARTED";
                break;
            case 2:
                str = "IN_PROGRESS";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return A03 + AbstractC25226BEj.A02(str, intValue);
    }

    public C51863Mw7(Integer num, String str, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = num;
    }
}
