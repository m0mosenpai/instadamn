package X;

import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jxr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45122Jxr extends C0T6 {
    public Object A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    public C45122Jxr(AbstractC33556EsU abstractC33556EsU, List list, List list2, Map map, int i) {
        this.A02 = 3;
        AbstractC25233BEq.A0x(3, list2, abstractC33556EsU, map);
        this.A00 = list;
        this.A03 = i;
        this.A04 = list2;
        this.A01 = abstractC33556EsU;
        this.A05 = map;
    }

    public final boolean A00() {
        if (AbstractC31178DnM.A03((Number) this.A01) > 0 || AbstractC166997dE.A1Z(this.A00, true)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45122Jxr.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A03;
        int i;
        int A0I;
        String str;
        String str2;
        switch (this.A02) {
            case 0:
                int A0M = ((((this.A03 * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                C2Z3 c2z3 = (C2Z3) this.A05;
                if (c2z3 == null) {
                    A03 = 0;
                } else {
                    A03 = AbstractC25228BEl.A03(c2z3.A00);
                }
                i = (A0M + A03) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                break;
            case 1:
                A0I = (((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31) + this.A03) * 31;
                int A0H = AbstractC166987dD.A0H(this.A05);
                if (1 != A0H) {
                    str = "BANNER";
                } else {
                    str = "MEGAPHONE";
                }
                i = AbstractC25226BEj.A02(str, A0H);
                break;
            case 2:
                int A0M2 = AbstractC167017dG.A0M(this.A01) * 31;
                int A0H2 = AbstractC166987dD.A0H(this.A05);
                switch (A0H2) {
                    case 1:
                        str2 = "EXPIRED";
                        break;
                    case 2:
                        str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                    default:
                        str2 = "UNSENT";
                        break;
                }
                i = (((AbstractC25231BEo.A0H(str2, A0H2, A0M2) + this.A03) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                break;
            default:
                A0I = AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A04, (AbstractC166987dD.A0G(this.A00) + this.A03) * 31));
                i = this.A05.hashCode();
                break;
        }
        return i + A0I;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45122Jxr(CharSequence charSequence, CharSequence charSequence2, Integer num) {
        this(charSequence, charSequence2, (CharSequence) null, num, R.drawable.instagram_lock_pano_outline_24);
        this.A02 = 1;
    }

    public C45122Jxr(Boolean bool, Boolean bool2, Integer num, Long l, int i, int i2) {
        this.A02 = 2;
        l = (i2 & 1) != 0 ? null : l;
        num = (i2 & 2) != 0 ? C05F.A0C : num;
        i = (i2 & 4) != 0 ? -1 : i;
        bool = (i2 & 8) != 0 ? null : bool;
        bool2 = (i2 & 16) != 0 ? null : bool2;
        this.A02 = 2;
        C14360o3.A0B(num, 2);
        this.A01 = l;
        this.A05 = num;
        this.A03 = i;
        this.A04 = bool;
        this.A00 = bool2;
    }

    public C45122Jxr(C2Z3 c2z3, Integer num, Integer num2, Object obj, int i, int i2) {
        this.A02 = 0;
        num = (i2 & 2) != 0 ? null : num;
        obj = (i2 & 4) != 0 ? null : obj;
        c2z3 = (i2 & 8) != 0 ? null : c2z3;
        num2 = (i2 & 16) != 0 ? null : num2;
        this.A02 = 0;
        this.A03 = i;
        this.A04 = num;
        this.A01 = obj;
        this.A05 = c2z3;
        this.A00 = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45122Jxr(X.AbstractC33556EsU r2, java.util.List r3, java.util.List r4, java.util.Map r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 3
            r1.A02 = r0
            X.0sl r3 = X.C16930sl.A00
            r6 = 0
            X.EeK r2 = X.C32939EeK.A00
            X.0sk r5 = X.AbstractC06930Yk.A0E()
            r4 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45122Jxr.<init>(X.EsU, java.util.List, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, int, int, int):void");
    }

    public C45122Jxr(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, int i) {
        this.A02 = 1;
        this.A04 = charSequence;
        this.A00 = charSequence2;
        this.A01 = charSequence3;
        this.A03 = i;
        this.A05 = num;
    }

    public C45122Jxr() {
        this.A02 = 2;
        this.A02 = 2;
        Integer num = C05F.A0C;
        this.A02 = 2;
        C14360o3.A0B(num, 2);
        this.A01 = null;
        this.A05 = num;
        this.A03 = -1;
        this.A04 = null;
        this.A00 = null;
    }
}
