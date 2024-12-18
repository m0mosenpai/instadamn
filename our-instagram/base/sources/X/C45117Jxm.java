package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

/* renamed from: X.Jxm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45117Jxm extends C0T6 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C45117Jxm(String str, String str2, List list, boolean z, boolean z2) {
        AbstractC167007dF.A1G(str2, 3, list);
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A05 = z2;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C45117Jxm)) {
                        return false;
                    }
                    C45117Jxm c45117Jxm = (C45117Jxm) obj;
                    if (c45117Jxm.A00 != 1 || !C14360o3.A0K(this.A02, c45117Jxm.A02) || this.A04 != c45117Jxm.A04 || !C14360o3.A0K(this.A03, c45117Jxm.A03) || this.A05 != c45117Jxm.A05) {
                        return false;
                    }
                    obj2 = this.A01;
                    obj3 = c45117Jxm.A01;
                    break;
                } else {
                    return true;
                }
                break;
            case 2:
                if (this != obj) {
                    if (!(obj instanceof C45117Jxm)) {
                        return false;
                    }
                    C45117Jxm c45117Jxm2 = (C45117Jxm) obj;
                    if (c45117Jxm2.A00 != 2 || !C14360o3.A0K(this.A03, c45117Jxm2.A03) || this.A01 != c45117Jxm2.A01 || this.A05 != c45117Jxm2.A05 || this.A04 != c45117Jxm2.A04) {
                        return false;
                    }
                    obj2 = this.A02;
                    obj3 = c45117Jxm2.A02;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    if (obj instanceof C45117Jxm) {
                        C45117Jxm c45117Jxm3 = (C45117Jxm) obj;
                        if (c45117Jxm3.A00 == 3 && this.A05 == c45117Jxm3.A05 && this.A04 == c45117Jxm3.A04 && C14360o3.A0K(this.A01, c45117Jxm3.A01) && C14360o3.A0K(this.A02, c45117Jxm3.A02)) {
                            obj2 = this.A03;
                            obj3 = c45117Jxm3.A03;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int hashCode;
        String A00;
        switch (this.A00) {
            case 1:
                A0D = AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0O(this.A02) * 31)));
                hashCode = this.A01.hashCode();
                break;
            case 2:
                int A0O = AbstractC167017dG.A0O(this.A03) * 31;
                int A0H = AbstractC166987dD.A0H(this.A01);
                switch (A0H) {
                    case 1:
                        A00 = "IN_PROGRESS";
                        break;
                    case 2:
                        A00 = "ERROR";
                        break;
                    case 3:
                        A00 = "HIDDEN";
                        break;
                    case 4:
                        A00 = AbstractC111324zv.A00(1622);
                        break;
                    default:
                        A00 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                }
                hashCode = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC25231BEo.A0H(A00, A0H, A0O)));
                A0D = AbstractC25227BEk.A07(this.A02);
                break;
            default:
                A0D = AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A05))));
                hashCode = AbstractC167017dG.A0O(this.A03);
                break;
        }
        return hashCode + A0D;
    }

    public C45117Jxm(String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A04 = z2;
        this.A01 = list;
        this.A02 = str;
        this.A03 = str2;
    }

    public C45117Jxm(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = num;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = str2;
    }

    public C45117Jxm(Integer num) {
        this(num, (String) null, (String) null, false, false);
    }
}
