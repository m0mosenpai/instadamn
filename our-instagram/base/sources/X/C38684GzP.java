package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import java.util.List;
import java.util.Map;

/* renamed from: X.GzP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38684GzP extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    public C38684GzP(C51757Mtg c51757Mtg, int i) {
        this.A09 = 1;
        c51757Mtg = (i & 32) != 0 ? null : c51757Mtg;
        this.A09 = 1;
        this.A08 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = c51757Mtg;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.GyM] */
    public static C38619GyM A00(ProductTaggingFeedComponentType productTaggingFeedComponentType) {
        C38684GzP c38684GzP = new C38684GzP(null, 511);
        ?? obj = new Object();
        obj.A02 = productTaggingFeedComponentType;
        obj.A03 = "";
        obj.A00 = 0;
        obj.A01 = c38684GzP;
        return obj;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A09 != 0) {
            if (this != obj) {
                if (obj instanceof C38684GzP) {
                    C38684GzP c38684GzP = (C38684GzP) obj;
                    if (c38684GzP.A09 == 1 && C14360o3.A0K(this.A08, c38684GzP.A08) && C14360o3.A0K(this.A02, c38684GzP.A02) && C14360o3.A0K(this.A01, c38684GzP.A01) && C14360o3.A0K(this.A04, c38684GzP.A04) && C14360o3.A0K(this.A03, c38684GzP.A03) && C14360o3.A0K(this.A00, c38684GzP.A00) && C14360o3.A0K(this.A07, c38684GzP.A07) && C14360o3.A0K(this.A06, c38684GzP.A06)) {
                        obj2 = this.A05;
                        obj3 = c38684GzP.A05;
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
            if (!(obj instanceof C38684GzP)) {
                return false;
            }
            C38684GzP c38684GzP2 = (C38684GzP) obj;
            if (c38684GzP2.A09 != 0 || !C14360o3.A0K(this.A01, c38684GzP2.A01) || !C14360o3.A0K(this.A02, c38684GzP2.A02) || !C14360o3.A0K(this.A03, c38684GzP2.A03) || !C14360o3.A0K(this.A04, c38684GzP2.A04) || !C14360o3.A0K(this.A07, c38684GzP2.A07) || !C14360o3.A0K(this.A08, c38684GzP2.A08) || !C14360o3.A0K(this.A00, c38684GzP2.A00) || !C14360o3.A0K(this.A05, c38684GzP2.A05)) {
                return false;
            }
            obj2 = this.A06;
            obj3 = c38684GzP2.A06;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int A0I;
        if (this.A09 != 0) {
            A0J = ((((((((((((((AbstractC167017dG.A0M(this.A08) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31;
            A0I = AbstractC166997dE.A0I(this.A05);
        } else {
            A0J = (((AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0M(this.A01) * 31))))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
            A0I = AbstractC166997dE.A0I(this.A06);
        }
        return A0J + A0I;
    }

    public C38684GzP(Integer num, Long l, Long l2, Long l3, List list, List list2, List list3, List list4, Map map) {
        this.A09 = 0;
        AbstractC25234BEr.A1R(map, list, list2, list3, list4);
        this.A01 = num;
        this.A02 = map;
        this.A03 = list;
        this.A04 = list2;
        this.A07 = list3;
        this.A08 = list4;
        this.A00 = l;
        this.A05 = l2;
        this.A06 = l3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38684GzP(java.lang.Integer r2, java.lang.Long r3, java.lang.Long r4, java.lang.Long r5, java.util.List r6, java.util.List r7, java.util.List r8, java.util.List r9, java.util.Map r10, kotlin.jvm.internal.DefaultConstructorMarker r11, int r12, int r13) {
        /*
            r1 = this;
            r0 = 0
            r1.A09 = r0
            r2 = 0
            X.0sk r10 = X.AbstractC06930Yk.A0E()
            X.0sl r6 = X.C16930sl.A00
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r6
            r8 = r6
            r9 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38684GzP.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public C38684GzP() {
        this.A09 = 1;
        this.A09 = 1;
        this.A09 = 1;
        this.A08 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
    }
}
