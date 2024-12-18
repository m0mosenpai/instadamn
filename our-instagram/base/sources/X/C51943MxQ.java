package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.MxQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51943MxQ extends C0T6 implements InterfaceC57878Pli {
    public final InterfaceC57875Plf A00;
    public final Integer A01;
    public final boolean A02;

    public C51943MxQ(InterfaceC57875Plf interfaceC57875Plf, Integer num, boolean z) {
        C14360o3.A0B(interfaceC57875Plf, 1);
        this.A00 = interfaceC57875Plf;
        this.A02 = z;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51943MxQ) {
                C51943MxQ c51943MxQ = (C51943MxQ) obj;
                if (!C14360o3.A0K(this.A00, c51943MxQ.A00) || this.A02 != c51943MxQ.A02 || this.A01 != c51943MxQ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "CLASSIC";
                break;
            case 2:
                str = "DASHED";
                break;
            case 3:
                str = "MODERNIZED";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return A0D + AbstractC25226BEj.A02(str, intValue);
    }

    public C51943MxQ() {
        this(C56749PGr.A00, C05F.A00, false);
    }
}
