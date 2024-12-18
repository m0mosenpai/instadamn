package X;

import android.content.Context;

/* renamed from: X.Lth, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49468Lth implements C74M {
    public final /* synthetic */ C45522KDn A00;
    public final /* synthetic */ InterfaceC16660sJ A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        C14360o3.A0B(str2, 2);
        C45522KDn c45522KDn = this.A00;
        Context context = c45522KDn.getContext();
        if (context != null) {
            boolean z = this.A02;
            InterfaceC16660sJ interfaceC16660sJ = this.A01;
            if (z) {
                AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new MC9(context, interfaceC16660sJ, str2, (InterfaceC23621Ds) null, 7), AbstractC25235BEs.A0S(c45522KDn));
            } else {
                interfaceC16660sJ.invoke(null);
            }
        }
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    public C49468Lth(C45522KDn c45522KDn, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = c45522KDn;
        this.A02 = z;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }

    @Override // X.C74M
    public final void onError(String str) {
        C45522KDn c45522KDn = this.A00;
        if (c45522KDn.getContext() != null) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(c45522KDn.A08);
            MCD.A02(A0Z, AbstractC141776au.A00(A0Z), 43);
        }
    }
}
