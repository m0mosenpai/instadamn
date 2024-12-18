package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;

/* renamed from: X.CfX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28371CfX {
    public Integer A00;
    public final int A01;
    public final CdsBottomSheetDimmingBehaviour A02;
    public final U6H A03;
    public final Integer A04;
    public final InterfaceC16820sZ A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28371CfX) {
                C28371CfX c28371CfX = (C28371CfX) obj;
                if (this.A03 != c28371CfX.A03 || this.A04 != c28371CfX.A04 || this.A01 != c28371CfX.A01 || !C14360o3.A0K(this.A02, c28371CfX.A02) || !C14360o3.A0K(this.A05, c28371CfX.A05) || this.A00 != c28371CfX.A00 || this.A06 != c28371CfX.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public static C28371CfX A00(U6H u6h, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, int i) {
        return new C28371CfX(CdsBottomSheetDimmingBehaviour.Default.A00, u6h, num, num2, interfaceC16820sZ, i, true);
    }

    public final int hashCode() {
        String str;
        int A0G = AbstractC166987dD.A0G(this.A03);
        Integer num = this.A04;
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A02, (AbstractC167017dG.A0L(num, U76.A01(num), A0G) + this.A01) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
        Integer num2 = this.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            switch (intValue) {
                case 1:
                    str = "FADE";
                    break;
                case 2:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
                default:
                    str = "DEFAULT";
                    break;
            }
            i = AbstractC25226BEj.A02(str, intValue);
        }
        return AbstractC166987dD.A0K(this.A06, (A0J + i) * 31);
    }

    public C28371CfX(CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, U6H u6h, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        AbstractC167017dG.A1P(u6h, num);
        this.A03 = u6h;
        this.A04 = num;
        this.A01 = i;
        this.A02 = cdsBottomSheetDimmingBehaviour;
        this.A05 = interfaceC16820sZ;
        this.A00 = num2;
        this.A06 = z;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BottomSheetContainerParams(bottomSheetMode=");
        A1C.append(this.A03);
        A1C.append(", darkModeConfig=");
        A1C.append(U76.A01(this.A04));
        A1C.append(", keyboardSoftInputMode=");
        A1C.append(this.A01);
        A1C.append(", dimmingBehaviour=");
        A1C.append(this.A02);
        A1C.append(", backButtonOverride=");
        A1C.append(this.A05);
        A1C.append(", animationType=");
        Integer num = this.A00;
        if (num != null) {
            str = U63.A01(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", addToBackStack=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }

    public C28371CfX() {
        this(CdsBottomSheetDimmingBehaviour.Default.A00, U6H.A08, C05F.A0C, null, null, 48, true);
    }
}
