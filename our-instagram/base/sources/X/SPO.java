package X;

import java.util.UUID;

/* loaded from: classes10.dex */
public final class SPO {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C48532Kv A03;
    public final C48532Kv A04;
    public final EnumC48482Kp A05;
    public final java.util.Set A06;
    public final UUID A07;
    public final int A08;
    public final long A09;
    public final C48562Ky A0A;
    public final SOQ A0B;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
            return false;
        }
        SPO spo = (SPO) obj;
        if (this.A01 != spo.A01 || this.A00 != spo.A00 || !C14360o3.A0K(this.A07, spo.A07) || this.A05 != spo.A05 || !C14360o3.A0K(this.A03, spo.A03) || !C14360o3.A0K(this.A0A, spo.A0A) || this.A09 != spo.A09 || !C14360o3.A0K(this.A0B, spo.A0B) || this.A02 != spo.A02 || this.A08 != spo.A08 || !C14360o3.A0K(this.A06, spo.A06)) {
            return false;
        }
        return C14360o3.A0K(this.A04, spo.A04);
    }

    public final int hashCode() {
        return AbstractC167007dF.A07(this.A02, (AbstractC167007dF.A07(this.A09, AbstractC166997dE.A0J(this.A0A, (((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A07))))) + this.A01) * 31) + this.A00) * 31)) + AbstractC25235BEs.A06(this.A0B)) * 31) + this.A08;
    }

    public SPO(C48562Ky c48562Ky, C48532Kv c48532Kv, C48532Kv c48532Kv2, SOQ soq, EnumC48482Kp enumC48482Kp, java.util.Set set, UUID uuid, int i, int i2, int i3, long j, long j2) {
        this.A07 = uuid;
        this.A05 = enumC48482Kp;
        this.A06 = set;
        this.A03 = c48532Kv;
        this.A04 = c48532Kv2;
        this.A01 = i;
        this.A00 = i2;
        this.A0A = c48562Ky;
        this.A09 = j;
        this.A0B = soq;
        this.A02 = j2;
        this.A08 = i3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WorkInfo{id='");
        A1C.append(this.A07);
        A1C.append("', state=");
        A1C.append(this.A05);
        A1C.append(", outputData=");
        A1C.append(this.A03);
        A1C.append(", tags=");
        A1C.append(this.A06);
        A1C.append(", progress=");
        A1C.append(this.A04);
        A1C.append(", runAttemptCount=");
        A1C.append(this.A01);
        A1C.append(", generation=");
        A1C.append(this.A00);
        A1C.append(", constraints=");
        A1C.append(this.A0A);
        A1C.append(", initialDelayMillis=");
        A1C.append(this.A09);
        A1C.append(", periodicityInfo=");
        A1C.append(this.A0B);
        A1C.append(", nextScheduleTimeMillis=");
        A1C.append(this.A02);
        A1C.append("}, stopReason=");
        return AbstractC58318PtA.A0l(A1C, this.A08);
    }
}
