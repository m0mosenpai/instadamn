package X;

/* renamed from: X.0VK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VK extends AbstractC02960Bu {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final C005001p A05;

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C0VK c0vk = (C0VK) obj;
                if (this.A04 == c0vk.A04 && this.A01 == c0vk.A01 && this.A02 == c0vk.A02 && this.A00 == c0vk.A00 && this.A03 == c0vk.A03) {
                    C005001p c005001p = this.A05;
                    int size = c005001p.size();
                    C005001p c005001p2 = c0vk.A05;
                    if (size == c005001p2.size()) {
                        for (int i = 0; i < size; i++) {
                            Object A05 = c005001p.A05(i);
                            Object A06 = c005001p.A06(i);
                            Object obj2 = c005001p2.get(A05);
                            if (A06 == null) {
                                if (obj2 == null) {
                                    equals = c005001p2.containsKey(A05);
                                }
                            } else {
                                equals = A06.equals(obj2);
                            }
                            if (equals) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A04((C0VK) abstractC02960Bu);
        return this;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C0VK c0vk = (C0VK) abstractC02960Bu;
        C0VK c0vk2 = (C0VK) abstractC02960Bu2;
        if (c0vk2 == null) {
            c0vk2 = new C0VK(this.A04);
        }
        if (c0vk == null) {
            c0vk2.A04(this);
        } else {
            c0vk2.A03 = this.A03 - c0vk.A03;
            c0vk2.A01 = this.A01 - c0vk.A01;
            c0vk2.A00 = this.A00 - c0vk.A00;
            c0vk2.A02 = this.A02 - c0vk.A02;
            if (c0vk2.A04) {
                C005001p c005001p = this.A05;
                int size = c005001p.size();
                for (int i = 0; i < size; i++) {
                    Object A05 = c005001p.A05(i);
                    C0C4 c0c4 = (C0C4) c0vk.A05.get(A05);
                    C0C4 c0c42 = (C0C4) c005001p.A06(i);
                    C0C4 c0c43 = new C0C4();
                    long j2 = c0c42.A00;
                    if (c0c4 == null) {
                        c0c43.A00 = j2;
                        c0c43.A02 = c0c42.A02;
                        j = c0c42.A01;
                    } else {
                        c0c43.A00 = j2 - c0c4.A00;
                        c0c43.A02 = c0c42.A02 - c0c4.A02;
                        j = c0c42.A01 - c0c4.A01;
                    }
                    c0c43.A01 = j;
                    c0vk2.A05.put(A05, c0c43);
                }
            }
        }
        return c0vk2;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        long j;
        C0VK c0vk = (C0VK) abstractC02960Bu;
        C0VK c0vk2 = (C0VK) abstractC02960Bu2;
        if (c0vk2 == null) {
            c0vk2 = new C0VK(this.A04);
        }
        if (c0vk == null) {
            c0vk2.A04(this);
        } else {
            c0vk2.A03 = this.A03 + c0vk.A03;
            c0vk2.A01 = this.A01 + c0vk.A01;
            c0vk2.A00 = this.A00 + c0vk.A00;
            c0vk2.A02 = this.A02 + c0vk.A02;
            if (c0vk2.A04) {
                C005001p c005001p = this.A05;
                int size = c005001p.size();
                for (int i = 0; i < size; i++) {
                    Object A05 = c005001p.A05(i);
                    C0C4 c0c4 = (C0C4) c0vk.A05.get(A05);
                    C005001p c005001p2 = c0vk2.A05;
                    C0C4 c0c42 = (C0C4) c005001p.A06(i);
                    C0C4 c0c43 = new C0C4();
                    long j2 = c0c42.A00;
                    if (c0c4 == null) {
                        c0c43.A00 = j2;
                        c0c43.A02 = c0c42.A02;
                        j = c0c42.A01;
                    } else {
                        c0c43.A00 = j2 + c0c4.A00;
                        c0c43.A02 = c0c42.A02 + c0c4.A02;
                        j = c0c42.A01 + c0c4.A01;
                    }
                    c0c43.A01 = j;
                    c005001p2.put(A05, c0c43);
                }
                C005001p c005001p3 = c0vk.A05;
                int size2 = c005001p3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object A052 = c005001p3.A05(i2);
                    if (c005001p.get(A052) == null) {
                        c0vk2.A05.put(A052, c005001p3.A06(i2));
                    }
                }
            }
        }
        return c0vk2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0C4, java.lang.Object] */
    public final void A04(C0VK c0vk) {
        this.A03 = c0vk.A03;
        this.A01 = c0vk.A01;
        this.A02 = c0vk.A02;
        this.A00 = c0vk.A00;
        if (c0vk.A04 && this.A04) {
            C005001p c005001p = this.A05;
            int size = c005001p.size();
            for (int i = 0; i < size; i++) {
                Object A05 = c005001p.A05(i);
                C005001p c005001p2 = c0vk.A05;
                if (!c005001p2.containsKey(A05)) {
                    c005001p.A04(i);
                } else {
                    C0C4 c0c4 = (C0C4) c005001p.A06(i);
                    C0C4 c0c42 = (C0C4) c005001p2.A06(i);
                    c0c4.A00 = c0c42.A00;
                    c0c4.A02 = c0c42.A02;
                    c0c4.A01 = c0c42.A01;
                }
            }
            C005001p c005001p3 = c0vk.A05;
            int size2 = c005001p3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object A052 = c005001p3.A05(i2);
                C0C4 c0c43 = (C0C4) c005001p3.A06(i2);
                if (!c005001p.containsKey(A052)) {
                    ?? obj = new Object();
                    obj.A00 = c0c43.A00;
                    obj.A02 = c0c43.A02;
                    obj.A01 = c0c43.A01;
                    c005001p.put(A052, obj);
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = ((this.A05.hashCode() * 31) + (this.A04 ? 1 : 0)) * 31;
        long j = this.A03;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A02;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A01;
        return i3 + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationMetrics{wifiScanCount=");
        sb.append(this.A03);
        sb.append(", isAttributionEnabled=");
        sb.append(this.A04);
        sb.append(", tagLocationDetails=");
        sb.append(this.A05);
        sb.append(", fineTimeMs=");
        sb.append(this.A01);
        sb.append(", mediumTimeMs=");
        sb.append(this.A02);
        sb.append(", coarseTimeMs=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C0VK(boolean z) {
        this.A05 = new C005001p(0);
        this.A04 = z;
    }

    public C0VK() {
        this(true);
    }
}
