package X;

import org.json.JSONObject;

/* renamed from: X.0Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05660Rq extends AbstractC02960Bu {
    public long A00;
    public long A01;
    public boolean A02;
    public final C005001p A03;

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A05((C05660Rq) abstractC02960Bu);
        return this;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long longValue;
        C05660Rq c05660Rq = (C05660Rq) abstractC02960Bu;
        C05660Rq c05660Rq2 = (C05660Rq) abstractC02960Bu2;
        if (c05660Rq2 == null) {
            c05660Rq2 = new C05660Rq(this.A02);
        }
        if (c05660Rq == null) {
            c05660Rq2.A05(this);
        } else {
            c05660Rq2.A01 = this.A01 - c05660Rq.A01;
            c05660Rq2.A00 = this.A00 - c05660Rq.A00;
            if (c05660Rq2.A02) {
                C005001p c005001p = c05660Rq2.A03;
                c005001p.clear();
                C005001p c005001p2 = this.A03;
                int size = c005001p2.size();
                for (int i = 0; i < size; i++) {
                    Object A05 = c005001p2.A05(i);
                    Number number = (Number) c05660Rq.A03.get(A05);
                    long longValue2 = ((Number) c005001p2.A06(i)).longValue();
                    if (number == null) {
                        longValue = 0;
                    } else {
                        longValue = number.longValue();
                    }
                    long j = longValue2 - longValue;
                    if (j != 0) {
                        c005001p.put(A05, Long.valueOf(j));
                    }
                }
            }
        }
        return c05660Rq2;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long longValue;
        C05660Rq c05660Rq = (C05660Rq) abstractC02960Bu;
        C05660Rq c05660Rq2 = (C05660Rq) abstractC02960Bu2;
        if (c05660Rq2 == null) {
            c05660Rq2 = new C05660Rq(this.A02);
        }
        if (c05660Rq == null) {
            c05660Rq2.A05(this);
        } else {
            c05660Rq2.A01 = this.A01 + c05660Rq.A01;
            c05660Rq2.A00 = this.A00 + c05660Rq.A00;
            if (c05660Rq2.A02) {
                C005001p c005001p = c05660Rq2.A03;
                c005001p.clear();
                C005001p c005001p2 = this.A03;
                int size = c005001p2.size();
                for (int i = 0; i < size; i++) {
                    Object A05 = c005001p2.A05(i);
                    Number number = (Number) c05660Rq.A03.get(A05);
                    long longValue2 = ((Number) c005001p2.A06(i)).longValue();
                    if (number == null) {
                        longValue = 0;
                    } else {
                        longValue = number.longValue();
                    }
                    c005001p.put(A05, Long.valueOf(longValue2 + longValue));
                }
                C005001p c005001p3 = c05660Rq.A03;
                int size2 = c005001p3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object A052 = c005001p3.A05(i2);
                    if (c005001p2.get(A052) == null) {
                        c005001p.put(A052, c005001p3.A06(i2));
                    }
                }
            }
        }
        return c05660Rq2;
    }

    public final JSONObject A04() {
        if (!this.A02) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        C005001p c005001p = this.A03;
        int size = c005001p.size();
        for (int i = 0; i < size; i++) {
            Number number = (Number) c005001p.A06(i);
            if (number != null) {
                long longValue = number.longValue();
                if (longValue > 0) {
                    jSONObject.put((String) c005001p.A05(i), longValue);
                }
            }
        }
        return jSONObject;
    }

    public final void A05(C05660Rq c05660Rq) {
        this.A01 = c05660Rq.A01;
        this.A00 = c05660Rq.A00;
        if (c05660Rq.A02 && this.A02) {
            C005001p c005001p = this.A03;
            c005001p.clear();
            c005001p.A09(c05660Rq.A03);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C05660Rq c05660Rq = (C05660Rq) obj;
            if (this.A02 == c05660Rq.A02 && this.A01 == c05660Rq.A01 && this.A00 == c05660Rq.A00) {
                return AbstractC03000By.A01(this.A03, c05660Rq.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.A02 ? 1 : 0) * 31) + this.A03.hashCode()) * 31;
        long j = this.A01;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WakeLockMetrics{isAttributionEnabled=");
        sb.append(this.A02);
        sb.append(", tagTimeMs=");
        sb.append(this.A03);
        sb.append(", heldTimeMs=");
        sb.append(this.A01);
        sb.append(", acquiredCount=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C05660Rq(boolean z) {
        this.A03 = new C005001p(0);
        this.A02 = z;
    }

    public C05660Rq() {
        this(false);
    }
}
