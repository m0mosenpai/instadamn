package X;

/* renamed from: X.JxF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45085JxF extends C0T6 {
    public final long A00;
    public final EnumC44104JeT A01;
    public final Integer A02;
    public final String A03;
    public final Long A04;
    public final String A05;

    public C45085JxF(EnumC44104JeT enumC44104JeT, Integer num, Long l, String str, String str2, long j) {
        C14360o3.A0B(num, 3);
        this.A03 = str;
        this.A00 = j;
        this.A02 = num;
        this.A01 = enumC44104JeT;
        this.A04 = l;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45085JxF) {
                C45085JxF c45085JxF = (C45085JxF) obj;
                if (!C14360o3.A0K(this.A03, c45085JxF.A03) || this.A00 != c45085JxF.A00 || this.A02 != c45085JxF.A02 || this.A01 != c45085JxF.A01 || !C14360o3.A0K(this.A04, c45085JxF.A04) || !C14360o3.A0K(this.A05, c45085JxF.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, (AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A03)) + 543360879 + this.A02.intValue()) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SafetyIntervention(id=");
        A1C.append(this.A03);
        A1C.append(", expirationTime=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(3382));
        if (this.A02 != null) {
            str = "EDUCATION_NOTICE";
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", uiType=");
        A1C.append(this.A01);
        A1C.append(", startTime=");
        A1C.append(this.A04);
        A1C.append(AbstractC58317Pt9.A00(31));
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
