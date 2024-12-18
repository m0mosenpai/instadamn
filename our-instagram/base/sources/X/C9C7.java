package X;

/* renamed from: X.9C7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C7 extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C9C7(C9CQ c9cq, EnumC64262vl enumC64262vl, EnumC74603Ws enumC74603Ws, AnonymousClass317 anonymousClass317, EnumC64222vh enumC64222vh, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(anonymousClass317, 2);
        C14360o3.A0B(enumC74603Ws, 3);
        C14360o3.A0B(enumC64222vh, 4);
        C14360o3.A0B(enumC64262vl, 5);
        C14360o3.A0B(c9cq, 6);
        this.A06 = str;
        this.A04 = anonymousClass317;
        this.A03 = enumC74603Ws;
        this.A05 = enumC64222vh;
        this.A01 = enumC64262vl;
        this.A02 = c9cq;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C9C7) {
                C9C7 c9c7 = (C9C7) obj;
                if (c9c7.A00 != 0 || this.A05 != c9c7.A05 || !C14360o3.A0K(this.A04, c9c7.A04) || !C14360o3.A0K(this.A06, c9c7.A06) || !C14360o3.A0K(this.A01, c9c7.A01) || !C14360o3.A0K(this.A02, c9c7.A02) || !C14360o3.A0K(this.A03, c9c7.A03)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.A00 != 0) {
            return super.hashCode();
        }
        int intValue = ((((-1739844639) + ((Number) this.A05).intValue()) * 31) + this.A04.hashCode()) * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (((((intValue + hashCode) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        Object obj = this.A03;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SignalMetadata(signalId=");
        sb.append(this.A06);
        sb.append(AbstractC111324zv.A00(1455));
        sb.append(this.A04);
        sb.append(AbstractC111324zv.A00(1453));
        sb.append(this.A03);
        sb.append(", surfaceType=");
        sb.append(this.A05);
        sb.append(", itemType=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1437));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C9C7(C9BT c9bt, C9BT c9bt2, CharSequence charSequence, Integer num, Integer num2, String str) {
        this.A05 = num;
        this.A04 = charSequence;
        this.A06 = str;
        this.A01 = c9bt;
        this.A02 = c9bt2;
        this.A03 = num2;
    }
}
