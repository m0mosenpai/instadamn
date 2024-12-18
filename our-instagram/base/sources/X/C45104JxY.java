package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.JxY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45104JxY extends C0T6 {
    public final Integer A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final Map A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public static final C45104JxY A00(Integer num, List list, List list2, List list3, List list4, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(num, 0);
        JQ0.A1O(list, list2, list3, list4, map);
        return new C45104JxY(num, list, list2, list3, list4, map, z, z2, z3, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45104JxY) {
                C45104JxY c45104JxY = (C45104JxY) obj;
                if (this.A00 != c45104JxY.A00 || !C14360o3.A0K(this.A02, c45104JxY.A02) || !C14360o3.A0K(this.A04, c45104JxY.A04) || !C14360o3.A0K(this.A03, c45104JxY.A03) || !C14360o3.A0K(this.A01, c45104JxY.A01) || !C14360o3.A0K(this.A05, c45104JxY.A05) || this.A08 != c45104JxY.A08 || this.A0A != c45104JxY.A0A || this.A0B != c45104JxY.A0B || this.A09 != c45104JxY.A09 || this.A07 != c45104JxY.A07 || this.A06 != c45104JxY.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        Integer num = this.A00;
        if (num != C05F.A0N && num != C05F.A0Y && num != C05F.A0j) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "SEARCH";
                break;
            case 2:
                str = AbstractC111324zv.A00(1481);
                break;
            case 3:
                str = "ONLY_GIPHY";
                break;
            case 4:
                str = "ONLY_FAVORITES";
                break;
            case 5:
                str = "ONLY_RECENTS";
                break;
            default:
                str = "TRENDING";
                break;
        }
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC25228BEl.A0F(str, intValue))))))))))));
    }

    public C45104JxY(Integer num, List list, List list2, List list3, List list4, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = num;
        this.A02 = list;
        this.A04 = list2;
        this.A03 = list3;
        this.A01 = list4;
        this.A05 = map;
        this.A08 = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A09 = z4;
        this.A07 = z5;
        this.A06 = z6;
    }
}
