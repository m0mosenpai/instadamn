package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SPQ {
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final C48562Ky A0B;
    public final C48532Kv A0C;
    public final EnumC48482Kp A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPQ) {
                SPQ spq = (SPQ) obj;
                if (!C14360o3.A0K(this.A0E, spq.A0E) || this.A0D != spq.A0D || !C14360o3.A0K(this.A0C, spq.A0C) || this.A08 != spq.A08 || this.A09 != spq.A09 || this.A07 != spq.A07 || !C14360o3.A0K(this.A0B, spq.A0B) || this.A05 != spq.A05 || this.A03 != spq.A03 || this.A01 != spq.A01 || this.A02 != spq.A02 || this.A00 != spq.A00 || this.A04 != spq.A04 || this.A0A != spq.A0A || this.A06 != spq.A06 || !C14360o3.A0K(this.A0G, spq.A0G) || !C14360o3.A0K(this.A0F, spq.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = (AbstractC166997dE.A0J(this.A0B, AbstractC167007dF.A07(this.A07, AbstractC167007dF.A07(this.A09, AbstractC167007dF.A07(this.A08, AbstractC166997dE.A0J(this.A0C, AbstractC166997dE.A0J(this.A0D, AbstractC166987dD.A0J(this.A0E))))))) + this.A05) * 31;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        return AbstractC166987dD.A0I(this.A0F, AbstractC166997dE.A0J(this.A0G, (AbstractC167007dF.A07(this.A0A, (((AbstractC167007dF.A07(this.A02, AbstractC167007dF.A07(this.A01, (A0J + str.hashCode() + intValue) * 31)) + this.A00) * 31) + this.A04) * 31) + this.A06) * 31));
    }

    public SPQ(C48562Ky c48562Ky, C48532Kv c48532Kv, EnumC48482Kp enumC48482Kp, Integer num, String str, List list, List list2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6) {
        AbstractC167027dH.A13(str, enumC48482Kp, c48532Kv);
        C14360o3.A0B(num, 9);
        this.A0E = str;
        this.A0D = enumC48482Kp;
        this.A0C = c48532Kv;
        this.A08 = j;
        this.A09 = j2;
        this.A07 = j3;
        this.A0B = c48562Ky;
        this.A05 = i;
        this.A03 = num;
        this.A01 = j4;
        this.A02 = j5;
        this.A00 = i2;
        this.A04 = i3;
        this.A0A = j6;
        this.A06 = i4;
        this.A0G = list;
        this.A0F = list2;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WorkInfoPojo(id=");
        A1C.append(this.A0E);
        A1C.append(MSV.A00(134));
        A1C.append(this.A0D);
        A1C.append(", output=");
        A1C.append(this.A0C);
        A1C.append(", initialDelay=");
        A1C.append(this.A08);
        A1C.append(", intervalDuration=");
        A1C.append(this.A09);
        A1C.append(", flexDuration=");
        A1C.append(this.A07);
        A1C.append(", constraints=");
        A1C.append(this.A0B);
        A1C.append(", runAttemptCount=");
        A1C.append(this.A05);
        A1C.append(", backoffPolicy=");
        if (1 - this.A03.intValue() != 0) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        A1C.append(str);
        A1C.append(", backoffDelayDuration=");
        A1C.append(this.A01);
        A1C.append(", lastEnqueueTime=");
        A1C.append(this.A02);
        A1C.append(MSV.A00(635));
        A1C.append(this.A00);
        A1C.append(", generation=");
        A1C.append(this.A04);
        A1C.append(", nextScheduleTimeOverride=");
        A1C.append(this.A0A);
        A1C.append(", stopReason=");
        A1C.append(this.A06);
        A1C.append(", tags=");
        A1C.append(this.A0G);
        A1C.append(", progress=");
        return AbstractC167017dG.A0o(this.A0F, A1C);
    }
}
