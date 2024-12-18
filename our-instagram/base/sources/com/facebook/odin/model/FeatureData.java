package com.facebook.odin.model;

import X.AbstractC06930Yk;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C16920sk;
import X.C16930sl;
import X.C3OO;
import X.C3R7;
import X.C3R8;
import X.C3R9;
import X.C3RD;
import X.C3RJ;
import X.C3RL;
import X.C3RQ;
import X.C3SG;
import X.C3SL;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeatureData extends C0T6 {
    public static final C3R9[] A0E;
    public static final Companion Companion = new Object();
    public final double A00;
    public final long A01;
    public final Type A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return FeatureData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.odin.model.FeatureData$Companion, java.lang.Object] */
    static {
        C3R8 A00 = C3R7.A00("com.facebook.odin.model.Type", Type.values());
        C3RJ c3rj = C3RJ.A00;
        C3SG c3sg = new C3SG(c3rj);
        C3RQ c3rq = C3RQ.A00;
        C3SG c3sg2 = new C3SG(c3rq);
        C3RD c3rd = C3RD.A01;
        C3SG c3sg3 = new C3SG(c3rd);
        C3SL c3sl = C3SL.A00;
        A0E = new C3R9[]{null, A00, null, null, null, null, c3sg, c3sg2, c3sg3, new C3SG(c3sl), new C3RL(c3rd, c3rj), new C3RL(c3rd, c3rq), new C3RL(c3rd, c3rd), new C3RL(c3rd, c3sl)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeatureData() {
        /*
            r10 = this;
            r1 = 0
            r8 = 0
            r5 = 0
            r7 = 16383(0x3fff, float:2.2957E-41)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.model.FeatureData.<init>():void");
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls, getClass())) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.odin.model.FeatureData");
        FeatureData featureData = (FeatureData) obj;
        return C14360o3.A0K(this.A03, featureData.A03) && this.A02 == featureData.A02 && C14360o3.A0K(A00(), featureData.A00());
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, double d, int i, long j) {
        C16930sl c16930sl;
        C16920sk c16920sk;
        C16920sk c16920sk2;
        C16920sk c16920sk3;
        String str3 = str2;
        Type type2 = type;
        List list2 = list;
        double d2 = d;
        long j2 = j;
        String str4 = (i & 1) != 0 ? "" : str;
        type2 = (i & 2) != 0 ? Type.A06 : type2;
        j2 = (i & 4) != 0 ? -1L : j2;
        d2 = (i & 8) != 0 ? -1.0d : d2;
        str3 = (i & 16) != 0 ? null : str3;
        list2 = (i & 64) != 0 ? C16930sl.A00 : list2;
        if ((i & 128) != 0) {
            c16930sl = C16930sl.A00;
        } else {
            c16930sl = null;
        }
        C16930sl c16930sl2 = (i & 256) != 0 ? C16930sl.A00 : null;
        C16930sl c16930sl3 = (i & 512) != 0 ? C16930sl.A00 : null;
        if ((i & 1024) != 0) {
            c16920sk = AbstractC06930Yk.A0E();
        } else {
            c16920sk = null;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            c16920sk2 = AbstractC06930Yk.A0E();
        } else {
            c16920sk2 = null;
        }
        if ((i & 4096) != 0) {
            c16920sk3 = AbstractC06930Yk.A0E();
        } else {
            c16920sk3 = null;
        }
        C16920sk A0E2 = (i & 8192) != 0 ? AbstractC06930Yk.A0E() : null;
        C14360o3.A0B(str4, 1);
        C14360o3.A0B(type2, 2);
        C14360o3.A0B(list2, 7);
        C14360o3.A0B(c16930sl, 8);
        C14360o3.A0B(c16930sl2, 9);
        C14360o3.A0B(c16930sl3, 10);
        C14360o3.A0B(c16920sk, 11);
        C14360o3.A0B(c16920sk2, 12);
        C14360o3.A0B(c16920sk3, 13);
        C14360o3.A0B(A0E2, 14);
        this.A03 = str4;
        this.A02 = type2;
        this.A01 = j2;
        this.A00 = d2;
        this.A04 = str3;
        this.A0D = false;
        this.A07 = list2;
        this.A06 = c16930sl;
        this.A08 = c16930sl2;
        this.A05 = c16930sl3;
        this.A0B = c16920sk;
        this.A0A = c16920sk2;
        this.A0C = c16920sk3;
        this.A09 = A0E2;
    }

    public final String A00() {
        String valueOf;
        Object obj;
        switch (this.A02.ordinal()) {
            case 0:
                valueOf = String.valueOf(this.A01);
                break;
            case 1:
                valueOf = new BigDecimal(String.valueOf(this.A00)).toPlainString();
                break;
            case 2:
                valueOf = this.A04;
                break;
            case 3:
                valueOf = String.valueOf(this.A0D);
                break;
            case 4:
                obj = this.A08;
                valueOf = obj.toString();
                break;
            case 5:
                obj = this.A07;
                valueOf = obj.toString();
                break;
            case 6:
                obj = this.A06;
                valueOf = obj.toString();
                break;
            case 7:
                obj = this.A05;
                valueOf = obj.toString();
                break;
            case 8:
                obj = this.A0C;
                valueOf = obj.toString();
                break;
            case 9:
                obj = this.A0B;
                valueOf = obj.toString();
                break;
            case 10:
                obj = this.A0A;
                valueOf = obj.toString();
                break;
            case 11:
                obj = this.A09;
                valueOf = obj.toString();
                break;
            default:
                valueOf = "Value type unsupported";
                break;
        }
        return String.valueOf(valueOf);
    }

    public final int hashCode() {
        return AnonymousClass001.A0T(this.A03, A00(), '=').hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0v("(id:", this.A03, ", value:", A00(), ')');
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, double d, int i, long j, boolean z) {
        Type type2 = type;
        List list5 = list;
        String str3 = str2;
        List list6 = list4;
        List list7 = list3;
        List list8 = list2;
        Map map5 = map3;
        Map map6 = map2;
        Map map7 = map;
        Map map8 = map4;
        double d2 = d;
        long j2 = j;
        this.A03 = (i & 1) == 0 ? "" : str;
        this.A02 = (i & 2) == 0 ? Type.A06 : type2;
        this.A01 = (i & 4) == 0 ? -1L : j2;
        this.A00 = (i & 8) == 0 ? -1.0d : d2;
        this.A04 = (i & 16) == 0 ? null : str3;
        if ((i & 32) == 0) {
            this.A0D = false;
        } else {
            this.A0D = z;
        }
        this.A07 = (i & 64) == 0 ? C16930sl.A00 : list5;
        this.A06 = (i & 128) == 0 ? C16930sl.A00 : list8;
        this.A08 = (i & 256) == 0 ? C16930sl.A00 : list7;
        this.A05 = (i & 512) == 0 ? C16930sl.A00 : list6;
        this.A0B = (i & 1024) == 0 ? AbstractC06930Yk.A0E() : map7;
        this.A0A = (i & C3OO.FLAG_MOVED) == 0 ? AbstractC06930Yk.A0E() : map6;
        this.A0C = (i & 4096) == 0 ? AbstractC06930Yk.A0E() : map5;
        this.A09 = (i & 8192) == 0 ? AbstractC06930Yk.A0E() : map8;
    }
}
