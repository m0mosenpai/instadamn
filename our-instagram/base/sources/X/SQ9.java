package X;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class SQ9 {
    public C64217T4g A00;
    public final int A01;
    public final String A02;
    public final TreeSet A04 = new TreeSet();
    public final ArrayList A03 = AbstractC166987dD.A1E();

    public final long A00(long j, long j2) {
        C4B8.A03(MSY.A1R((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        C4B8.A03(j2 >= 0);
        RFh A01 = A01(j, j2);
        long j3 = Long.MAX_VALUE;
        if (!A01.A07) {
            long j4 = A01.A03;
            if (j4 != -1) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = A01.A04 + A01.A03;
        if (j6 < j3) {
            for (C49802Qq c49802Qq : this.A04.tailSet(A01, false)) {
                long j7 = c49802Qq.A04;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + c49802Qq.A03);
                if (j6 >= j3) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final void A02(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i < arrayList.size()) {
                if (((SEN) arrayList.get(i)).A01 == j) {
                    arrayList.remove(i);
                    return;
                }
                i++;
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        }
    }

    public final boolean A03(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i >= arrayList.size()) {
                return false;
            }
            SEN sen = (SEN) arrayList.get(i);
            long j3 = sen.A00;
            if (j3 == -1) {
                if (j >= sen.A01) {
                    break;
                }
                i++;
            } else {
                if (j2 != -1) {
                    long j4 = sen.A01;
                    if (j4 <= j && j + j2 <= j4 + j3) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean A04(long j, long j2) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 < arrayList.size()) {
                SEN sen = (SEN) arrayList.get(i2);
                long j3 = sen.A01;
                if (j3 <= j) {
                    long j4 = sen.A00;
                    if (j4 == -1) {
                        return false;
                    }
                    i = ((j3 + j4) > j ? 1 : ((j3 + j4) == j ? 0 : -1));
                } else {
                    if (j2 == -1) {
                        return false;
                    }
                    i = ((j + j2) > j3 ? 1 : ((j + j2) == j3 ? 0 : -1));
                }
                if (i > 0) {
                    return false;
                }
                i2++;
            } else {
                arrayList.add(new SEN(j, j2));
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SQ9 sq9 = (SQ9) obj;
            if (this.A01 != sq9.A01 || !this.A02.equals(sq9.A02) || !this.A04.equals(sq9.A04) || !this.A00.equals(sq9.A00)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.RFh, X.2Qq] */
    public final RFh A01(long j, long j2) {
        long j3 = j2;
        String str = this.A02;
        C49802Qq c49802Qq = new C49802Qq(null, str, j, -1L, -9223372036854775807L);
        TreeSet treeSet = this.A04;
        RFh rFh = (RFh) treeSet.floor(c49802Qq);
        if (rFh != null && rFh.A04 + rFh.A03 > j) {
            return rFh;
        }
        C49802Qq c49802Qq2 = (C49802Qq) treeSet.ceiling(c49802Qq);
        if (c49802Qq2 != null) {
            long j4 = c49802Qq2.A04 - j;
            if (j2 == -1) {
                j3 = j4;
            } else {
                j3 = Math.min(j4, j3);
            }
        }
        return new C49802Qq(null, str, j, j3, -9223372036854775807L);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, this.A01 * 31));
    }

    public SQ9(C64217T4g c64217T4g, String str, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c64217T4g;
    }
}
