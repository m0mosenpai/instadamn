package X;

import java.util.List;

/* renamed from: X.BfV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26042BfV extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C26042BfV(String str, String str2, String str3, List list, List list2, List list3) {
        C14360o3.A0B(str, 1);
        AbstractC25234BEr.A1R(list, str2, list2, str3, list3);
        this.A04 = str;
        this.A01 = list;
        this.A06 = str2;
        this.A03 = list2;
        this.A05 = str3;
        this.A02 = list3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26042BfV) {
                    C26042BfV c26042BfV = (C26042BfV) obj;
                    if (c26042BfV.A00 == 1 && C14360o3.A0K(this.A04, c26042BfV.A04) && C14360o3.A0K(this.A01, c26042BfV.A01) && C14360o3.A0K(this.A06, c26042BfV.A06) && C14360o3.A0K(this.A03, c26042BfV.A03) && C14360o3.A0K(this.A05, c26042BfV.A05)) {
                        obj2 = this.A02;
                        obj3 = c26042BfV.A02;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C26042BfV)) {
                return false;
            }
            C26042BfV c26042BfV2 = (C26042BfV) obj;
            if (c26042BfV2.A00 != 0 || !C14360o3.A0K(this.A04, c26042BfV2.A04) || !C14360o3.A0K(this.A01, c26042BfV2.A01) || !C14360o3.A0K(this.A05, c26042BfV2.A05) || !C14360o3.A0K(this.A06, c26042BfV2.A06) || !C14360o3.A0K(this.A02, c26042BfV2.A02)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = c26042BfV2.A03;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A04))))));
        }
        return (((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C26042BfV(Integer num, Integer num2, String str, String str2, String str3, List list) {
        this.A04 = str;
        this.A01 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = list;
        this.A03 = num2;
    }
}
