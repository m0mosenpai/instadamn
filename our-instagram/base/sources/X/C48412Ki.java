package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: X.2Ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48412Ki {
    public static final C1N8 A0N;
    public static final String A0O;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public C48562Ky A0B;
    public C48532Kv A0C;
    public C48532Kv A0D;
    public EnumC48482Kp A0E;
    public Integer A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public final int A0K;
    public final int A0L;
    public final String A0M;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C48412Ki(java.lang.String r33, java.lang.String r34) {
        /*
            r32 = this;
            r0 = 1
            r7 = r33
            X.C14360o3.A0B(r7, r0)
            r0 = 2
            r8 = r34
            X.C14360o3.A0B(r8, r0)
            X.2Kp r4 = X.EnumC48482Kp.ENQUEUED
            java.lang.Class<androidx.work.OverwritingInputMerger> r0 = androidx.work.OverwritingInputMerger.class
            java.lang.String r9 = r0.getName()
            X.C14360o3.A07(r9)
            X.2Kv r2 = X.C48532Kv.A01
            X.C14360o3.A08(r2)
            r15 = 0
            X.2Ky r1 = X.C48562Ky.A08
            r10 = 0
            java.lang.Integer r5 = X.C05F.A00
            r21 = 30000(0x7530, double:1.4822E-319)
            r23 = -1
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = -256(0xffffffffffffff00, float:NaN)
            r0 = r32
            r3 = r2
            r6 = r5
            r11 = r10
            r12 = r10
            r13 = r10
            r17 = r15
            r19 = r15
            r25 = r15
            r27 = r23
            r31 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r27, r29, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48412Ki.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48412Ki) {
                C48412Ki c48412Ki = (C48412Ki) obj;
                if (!C14360o3.A0K(this.A0M, c48412Ki.A0M) || this.A0E != c48412Ki.A0E || !C14360o3.A0K(this.A0I, c48412Ki.A0I) || !C14360o3.A0K(this.A0H, c48412Ki.A0H) || !C14360o3.A0K(this.A0C, c48412Ki.A0C) || !C14360o3.A0K(this.A0D, c48412Ki.A0D) || this.A05 != c48412Ki.A05 || this.A06 != c48412Ki.A06 || this.A04 != c48412Ki.A04 || !C14360o3.A0K(this.A0B, c48412Ki.A0B) || this.A02 != c48412Ki.A02 || this.A0F != c48412Ki.A0F || this.A03 != c48412Ki.A03 || this.A07 != c48412Ki.A07 || this.A08 != c48412Ki.A08 || this.A0A != c48412Ki.A0A || this.A0J != c48412Ki.A0J || this.A0G != c48412Ki.A0G || this.A01 != c48412Ki.A01 || this.A0K != c48412Ki.A0K || this.A09 != c48412Ki.A09 || this.A00 != c48412Ki.A00 || this.A0L != c48412Ki.A0L) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        String A01 = C48442Kl.A01("WorkSpec");
        C14360o3.A07(A01);
        A0O = A01;
        A0N = new C1N8() { // from class: X.2Ko
            @Override // X.C1N8
            public final Object apply(Object obj) {
                C48532Kv c48532Kv;
                SOQ soq;
                long j;
                List<SPQ> list = (List) obj;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    for (SPQ spq : list) {
                        List list2 = spq.A0F;
                        if (!list2.isEmpty()) {
                            c48532Kv = (C48532Kv) list2.get(0);
                        } else {
                            c48532Kv = C48532Kv.A01;
                        }
                        UUID fromString = UUID.fromString(spq.A0E);
                        C14360o3.A07(fromString);
                        EnumC48482Kp enumC48482Kp = spq.A0D;
                        HashSet hashSet = new HashSet(spq.A0G);
                        C48532Kv c48532Kv2 = spq.A0C;
                        C14360o3.A09(c48532Kv);
                        int i = spq.A05;
                        int i2 = spq.A04;
                        C48562Ky c48562Ky = spq.A0B;
                        long j2 = spq.A08;
                        long j3 = spq.A09;
                        if (j3 != 0) {
                            soq = new SOQ(j3, spq.A07);
                        } else {
                            soq = null;
                        }
                        if (enumC48482Kp == EnumC48482Kp.ENQUEUED) {
                            boolean z = false;
                            if (i > 0) {
                                z = true;
                            }
                            Integer num = spq.A03;
                            long j4 = spq.A01;
                            long j5 = spq.A02;
                            int i3 = spq.A00;
                            boolean z2 = false;
                            if (j3 != 0) {
                                z2 = true;
                            }
                            j = C2WV.A00(num, i, i3, j4, j5, j2, spq.A07, j3, spq.A0A, z, z2);
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        arrayList.add(new SPO(c48562Ky, c48532Kv2, c48532Kv, soq, enumC48482Kp, hashSet, fromString, i, i2, spq.A06, j2, j));
                    }
                    return arrayList;
                }
                return null;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r21.A02 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A00() {
        /*
            r21 = this;
            r0 = r21
            X.2Kp r2 = r0.A0E
            X.2Kp r1 = X.EnumC48482Kp.ENQUEUED
            if (r2 != r1) goto Le
            int r1 = r0.A02
            r19 = 1
            if (r1 > 0) goto L10
        Le:
            r19 = 0
        L10:
            int r5 = r0.A02
            java.lang.Integer r4 = r0.A0F
            long r7 = r0.A03
            long r9 = r0.A07
            int r6 = r0.A01
            long r15 = r0.A06
            r2 = 0
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            r20 = 0
            if (r1 == 0) goto L26
            r20 = 1
        L26:
            long r11 = r0.A05
            long r13 = r0.A04
            long r0 = r0.A09
            r17 = r0
            long r0 = X.C2WV.A00(r4, r5, r6, r7, r9, r11, r13, r15, r17, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48412Ki.A00():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str;
        String str2;
        int hashCode = ((((((((((this.A0M.hashCode() * 31) + this.A0E.hashCode()) * 31) + this.A0I.hashCode()) * 31) + this.A0H.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31;
        long j = this.A05;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A06;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A04;
        int hashCode2 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A0B.hashCode()) * 31) + this.A02) * 31;
        int intValue = this.A0F.intValue();
        if (1 != intValue) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        int hashCode3 = (hashCode2 + str.hashCode() + intValue) * 31;
        long j4 = this.A03;
        int i3 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A07;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.A08;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.A0A;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        boolean z = this.A0J;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        int intValue2 = this.A0G.intValue();
        if (1 != intValue2) {
            str2 = "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
        } else {
            str2 = "DROP_WORK_REQUEST";
        }
        int hashCode4 = (((((i8 + str2.hashCode() + intValue2) * 31) + this.A01) * 31) + this.A0K) * 31;
        long j8 = this.A09;
        return ((((hashCode4 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.A00) * 31) + this.A0L;
    }

    public final void A01(long j, long j2) {
        if (j < 900000) {
            C48442Kl.A00();
            android.util.Log.w(A0O, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j3 = j;
        if (j < 900000) {
            j3 = 900000;
        }
        this.A06 = j3;
        if (j2 < 300000) {
            C48442Kl.A00();
            android.util.Log.w(A0O, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.A06) {
            C48442Kl.A00();
            android.util.Log.w(A0O, AnonymousClass001.A0Q("Flex duration greater than interval duration; Changed to ", j));
        }
        this.A04 = C17s.A06(j2, 300000L, this.A06);
    }

    public final String toString() {
        return AnonymousClass001.A0S("{WorkSpec: ", this.A0M, '}');
    }

    public C48412Ki(C48562Ky c48562Ky, C48532Kv c48532Kv, C48532Kv c48532Kv2, EnumC48482Kp enumC48482Kp, Integer num, Integer num2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        this.A0M = str;
        this.A0E = enumC48482Kp;
        this.A0I = str2;
        this.A0H = str3;
        this.A0C = c48532Kv;
        this.A0D = c48532Kv2;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = j3;
        this.A0B = c48562Ky;
        this.A02 = i;
        this.A0F = num;
        this.A03 = j4;
        this.A07 = j5;
        this.A08 = j6;
        this.A0A = j7;
        this.A0J = z;
        this.A0G = num2;
        this.A01 = i2;
        this.A0K = i3;
        this.A09 = j8;
        this.A00 = i4;
        this.A0L = i5;
    }
}
