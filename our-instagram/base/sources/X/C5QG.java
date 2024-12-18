package X;

import java.util.List;

/* renamed from: X.5QG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QG extends C0T6 {
    public int A00;
    public int A01;
    public C93094Fl A02;
    public Boolean A03;
    public Float A04;
    public Float A05;
    public Float A06;
    public Float A07;
    public Float A08;
    public Float A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;

    public C5QG(C93094Fl c93094Fl, Boolean bool, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, int i, int i2, boolean z) {
        this.A0A = num;
        this.A0I = str;
        this.A0H = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = f;
        this.A06 = f2;
        this.A09 = f3;
        this.A04 = f4;
        this.A07 = f5;
        this.A08 = f6;
        this.A0B = num2;
        this.A0P = z;
        this.A0K = str3;
        this.A0L = str4;
        this.A0G = str5;
        this.A03 = bool;
        this.A0J = str6;
        this.A02 = c93094Fl;
        this.A0E = str7;
        this.A0N = list;
        this.A0M = list2;
        this.A0C = str8;
        this.A0D = str9;
        this.A0F = str10;
        this.A0O = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5QG) {
                C5QG c5qg = (C5QG) obj;
                if (this.A0A != c5qg.A0A || !C14360o3.A0K(this.A0I, c5qg.A0I) || !C14360o3.A0K(this.A0H, c5qg.A0H) || this.A01 != c5qg.A01 || this.A00 != c5qg.A00 || !C14360o3.A0K(this.A05, c5qg.A05) || !C14360o3.A0K(this.A06, c5qg.A06) || !C14360o3.A0K(this.A09, c5qg.A09) || !C14360o3.A0K(this.A04, c5qg.A04) || !C14360o3.A0K(this.A07, c5qg.A07) || !C14360o3.A0K(this.A08, c5qg.A08) || !C14360o3.A0K(this.A0B, c5qg.A0B) || this.A0P != c5qg.A0P || !C14360o3.A0K(this.A0K, c5qg.A0K) || !C14360o3.A0K(this.A0L, c5qg.A0L) || !C14360o3.A0K(this.A0G, c5qg.A0G) || !C14360o3.A0K(this.A03, c5qg.A03) || !C14360o3.A0K(this.A0J, c5qg.A0J) || !C14360o3.A0K(this.A02, c5qg.A02) || !C14360o3.A0K(this.A0E, c5qg.A0E) || !C14360o3.A0K(this.A0N, c5qg.A0N) || !C14360o3.A0K(this.A0M, c5qg.A0M) || !C14360o3.A0K(this.A0C, c5qg.A0C) || !C14360o3.A0K(this.A0D, c5qg.A0D) || !C14360o3.A0K(this.A0F, c5qg.A0F) || this.A0O != c5qg.A0O) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        Integer num = this.A0A;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "TEXT";
            } else {
                str = "STICKER";
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = hashCode * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A0H;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (((((i3 + hashCode3) * 31) + this.A01) * 31) + this.A00) * 31;
        Float f = this.A05;
        if (f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Float f2 = this.A06;
        if (f2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = f2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Float f3 = this.A09;
        if (f3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Float f4 = this.A04;
        if (f4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = f4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Float f5 = this.A07;
        if (f5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = f5.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Float f6 = this.A08;
        if (f6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = f6.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Integer num2 = this.A0B;
        if (num2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        int i12 = 1237;
        if (this.A0P) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        String str4 = this.A0K;
        if (str4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str4.hashCode();
        }
        int i14 = (i13 + hashCode11) * 31;
        String str5 = this.A0L;
        if (str5 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str5.hashCode();
        }
        int i15 = (i14 + hashCode12) * 31;
        String str6 = this.A0G;
        if (str6 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str6.hashCode();
        }
        int i16 = (i15 + hashCode13) * 31;
        Boolean bool = this.A03;
        if (bool == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool.hashCode();
        }
        int i17 = (i16 + hashCode14) * 31;
        String str7 = this.A0J;
        if (str7 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str7.hashCode();
        }
        int i18 = (i17 + hashCode15) * 31;
        C93094Fl c93094Fl = this.A02;
        if (c93094Fl == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = c93094Fl.hashCode();
        }
        int i19 = (i18 + hashCode16) * 31;
        String str8 = this.A0E;
        if (str8 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str8.hashCode();
        }
        int i20 = (i19 + hashCode17) * 31;
        List list = this.A0N;
        if (list == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        List list2 = this.A0M;
        if (list2 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = list2.hashCode();
        }
        int i22 = (i21 + hashCode19) * 31;
        String str9 = this.A0C;
        if (str9 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str9.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        String str10 = this.A0D;
        if (str10 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str10.hashCode();
        }
        int i24 = (i23 + hashCode21) * 31;
        String str11 = this.A0F;
        if (str11 != null) {
            i = str11.hashCode();
        }
        int i25 = (i24 + i) * 31;
        int i26 = 1237;
        if (this.A0O) {
            i26 = 1231;
        }
        return i25 + i26;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5QG(X.BE5 r30, X.EnumC150226pU r31, java.lang.Boolean r32, java.lang.String r33) {
        /*
            r29 = this;
            r0 = 1
            r15 = r33
            X.C14360o3.A0B(r15, r0)
            r0 = 2
            r1 = r31
            X.C14360o3.A0B(r1, r0)
            java.lang.Integer r12 = X.C05F.A01
            java.lang.String r14 = r1.toString()
            if (r30 == 0) goto L79
            float r0 = r30.Bzo()
            int r2 = (int) r0
            float r0 = r30.B27()
            int r1 = (int) r0
            float r0 = r30.BYd()
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            float r0 = r30.BYf()
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            float r0 = r30.CHe()
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            float r0 = r30.BDQ()
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            float r0 = r30.Bpb()
            java.lang.Float r10 = java.lang.Float.valueOf(r0)
            float r0 = r30.BqP()
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            int r0 = r30.getZIndex()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L56:
            r4 = 0
            r28 = 0
            r3 = r29
            r5 = r32
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r2
            r27 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        L79:
            r2 = 0
            r1 = 0
            r13 = 0
            r6 = r13
            r7 = r13
            r8 = r13
            r9 = r13
            r10 = r13
            r11 = r13
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5QG.<init>(X.BE5, X.6pU, java.lang.Boolean, java.lang.String):void");
    }

    public C5QG() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false);
    }
}
