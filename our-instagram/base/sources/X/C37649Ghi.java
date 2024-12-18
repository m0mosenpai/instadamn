package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Ghi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37649Ghi extends C0T6 {
    public InterfaceC43446JHk A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC43393JFi A04;
    public final List A05;
    public final Map A06;

    public C37649Ghi(InterfaceC43393JFi interfaceC43393JFi, Integer num, Map map) {
        C14360o3.A0B(interfaceC43393JFi, 1);
        this.A04 = interfaceC43393JFi;
        this.A06 = map;
        this.A02 = false;
        this.A01 = num;
        this.A03 = false;
        this.A05 = AbstractC001800i.A0a(map.keySet());
        this.A00 = new C37650Ghj();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37649Ghi) {
                C37649Ghi c37649Ghi = (C37649Ghi) obj;
                if (!C14360o3.A0K(this.A04, c37649Ghi.A04) || !C14360o3.A0K(this.A06, c37649Ghi.A06) || this.A02 != c37649Ghi.A02 || this.A01 != c37649Ghi.A01 || this.A03 != c37649Ghi.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A06, AbstractC166987dD.A0G(this.A04)));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "SKIP_DELAY";
                break;
            case 2:
                str = "SKIP_ALL";
                break;
            default:
                str = "NORMAL";
                break;
        }
        return AbstractC166987dD.A0K(this.A03, AbstractC25231BEo.A0H(str, intValue, A0D));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TimelineTask(id=");
        A1C.append(this.A04);
        A1C.append(", dependencyMap=");
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(563));
        A1C.append(this.A02);
        A1C.append(", executionMode=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "SKIP_DELAY";
                    break;
                case 2:
                    str = "SKIP_ALL";
                    break;
                default:
                    str = "NORMAL";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", isCompleted=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
