package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.MxP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51942MxP extends C0T6 implements InterfaceC57878Pli {
    public final InterfaceC57875Plf A00;
    public final InterfaceC57876Plg A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public C51942MxP(InterfaceC57875Plf interfaceC57875Plf, InterfaceC57876Plg interfaceC57876Plg, Integer num, String str, boolean z) {
        C14360o3.A0B(interfaceC57875Plf, 1);
        this.A00 = interfaceC57875Plf;
        this.A03 = str;
        this.A02 = num;
        this.A04 = z;
        this.A01 = interfaceC57876Plg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51942MxP) {
                C51942MxP c51942MxP = (C51942MxP) obj;
                if (!C14360o3.A0K(this.A00, c51942MxP.A00) || !C14360o3.A0K(this.A03, c51942MxP.A03) || this.A02 != c51942MxP.A02 || this.A04 != c51942MxP.A04 || !C14360o3.A0K(this.A01, c51942MxP.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A00));
        int intValue = this.A02.intValue();
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
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC25231BEo.A0H(str, intValue, A0K)));
    }
}
