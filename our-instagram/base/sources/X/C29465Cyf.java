package X;

import android.content.Context;

/* renamed from: X.Cyf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29465Cyf implements InterfaceC30959DjG {
    public final C27882CQt A00;
    public final InterfaceC31000Djz A01;
    public final InterfaceC31000Djz A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29465Cyf) {
                C29465Cyf c29465Cyf = (C29465Cyf) obj;
                if (!C14360o3.A0K(this.A02, c29465Cyf.A02) || !C14360o3.A0K(this.A01, c29465Cyf.A01) || !C14360o3.A0K(this.A00, c29465Cyf.A00) || this.A03 != c29465Cyf.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0M = ((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        Integer num = this.A03;
        return A0M + (num != null ? CZC.A00(num) : 0);
    }

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        int A00;
        AbstractC167017dG.A1N(context, interfaceC30923Dia);
        Integer num = this.A03;
        if (num == null) {
            num = C05F.A00;
        }
        C27882CQt c27882CQt = this.A00;
        if (c27882CQt == null) {
            A00 = 0;
        } else {
            A00 = (int) AbstractC28379Cfi.A00(interfaceC30923Dia, C05F.A0P);
        }
        C29474Cyo c29474Cyo = new C29474Cyo(EnumC72394Xcg.A1r, C05F.A15);
        EnumC72394Xcg enumC72394Xcg = EnumC72394Xcg.A2B;
        Integer num2 = C05F.A00;
        C29474Cyo c29474Cyo2 = new C29474Cyo(enumC72394Xcg, num2);
        C29474Cyo c29474Cyo3 = new C29474Cyo(enumC72394Xcg, C05F.A0j);
        Integer num3 = C05F.A01;
        return new CWO(c27882CQt, this.A02, this.A01, new C29472Cym(num2, num3, num3), c29474Cyo, c29474Cyo2, c29474Cyo3, 5, 5, 5, 5, 5, 5, num, num3, A00);
    }

    public C29465Cyf(C27882CQt c27882CQt, InterfaceC31000Djz interfaceC31000Djz, InterfaceC31000Djz interfaceC31000Djz2, Integer num) {
        this.A02 = interfaceC31000Djz;
        this.A01 = interfaceC31000Djz2;
        this.A00 = c27882CQt;
        this.A03 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CdsListCellVariant(headlineMaxLinesOverride=");
        A1C.append((Object) null);
        A1C.append(", headlineTextColorOverride=");
        A1C.append((Object) null);
        A1C.append(", bodyMaxLinesOverride=");
        A1C.append((Object) null);
        A1C.append(", bodyTextColorOverride=");
        A1C.append((Object) null);
        A1C.append(", metaMaxLinesOverride=");
        A1C.append((Object) null);
        A1C.append(", metaTextColorOverride=");
        A1C.append((Object) null);
        A1C.append(", startAddOn=");
        A1C.append(this.A02);
        A1C.append(", endAddOn=");
        A1C.append(this.A01);
        A1C.append(", badge=");
        A1C.append(this.A00);
        A1C.append(", startAddOnVerticalAlignmentOverride=");
        return AbstractC25236BEt.A0Y(CZC.A01(this.A03), A1C);
    }
}
