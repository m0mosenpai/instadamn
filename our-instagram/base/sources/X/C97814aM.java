package X;

import java.util.List;

/* renamed from: X.4aM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C97814aM extends C4BB implements InterfaceC97364Yw {
    public final C4BE A00;

    @Override // X.InterfaceC97364Yw
    public final long AeO(long j, long j2) {
        long A01 = this.A00.A01(j);
        if (A01 == -1) {
            return (int) (r4.A05((j2 - r4.A04) + r4.A01, j) - r4.A03(j, j2));
        }
        return A01;
    }

    @Override // X.InterfaceC97364Yw
    public final long Azu(long j, long j2) {
        return this.A00.A04(j, j2);
    }

    @Override // X.InterfaceC97364Yw
    public final long B6Y(long j, long j2) {
        return this.A00.A03(j, j2);
    }

    @Override // X.InterfaceC97364Yw
    public final long B6h() {
        return this.A00.A05;
    }

    @Override // X.InterfaceC97364Yw
    public final long BX6(long j, long j2) {
        C4BE c4be = this.A00;
        if (c4be.A06 != null) {
            return -9223372036854775807L;
        }
        long A03 = c4be.A03(j, j2);
        long A01 = c4be.A01(j);
        if (A01 == -1) {
            A01 = (int) (c4be.A05((j2 - c4be.A04) + c4be.A01, j) - c4be.A03(j, j2));
        }
        long j3 = A03 + A01;
        return (c4be.A02(j3) + c4be.A04(j3, j)) - c4be.A01;
    }

    @Override // X.InterfaceC97364Yw
    public final int BfL(long j) {
        return this.A00.A00(j);
    }

    @Override // X.InterfaceC97364Yw
    public final long BsK(long j) {
        return this.A00.A01(j);
    }

    @Override // X.InterfaceC97364Yw
    public final long BsO(long j, long j2) {
        return this.A00.A05(j, j2);
    }

    @Override // X.InterfaceC97364Yw
    public final long BsP(long j) {
        int i;
        int i2;
        long j2;
        long j3;
        C4BE c4be = this.A00;
        if (c4be instanceof C4BD) {
            C4BD c4bd = (C4BD) c4be;
            long A01 = c4bd.A01(-9223372036854775807L);
            long j4 = c4bd.A05;
            if (A01 > 0 && j4 >= 0) {
                List list = c4bd.A06;
                if (A01 == list.size()) {
                    j3 = ((j4 + A01) - 1) + j;
                    i = c4bd.A00.A01;
                } else {
                    i = ((C23012ACm) list.get(list.size() - 1)).A00;
                    if (j >= i) {
                        j3 = ((j4 + A01) - 1) + j;
                    } else {
                        C23012ACm c23012ACm = (C23012ACm) list.get(0);
                        if (j >= c23012ACm.A00 - (c23012ACm.A02 - 1)) {
                            int size = list.size() - 1;
                            int i3 = 0;
                            while (i3 <= size) {
                                int i4 = (i3 + size) / 2;
                                C23012ACm c23012ACm2 = (C23012ACm) list.get(i4);
                                int i5 = c23012ACm2.A00;
                                int i6 = i5 + 1;
                                int i7 = i5 - (c23012ACm2.A02 - 1);
                                long j5 = i6;
                                if (j5 <= j) {
                                    i3 = i4 + 1;
                                } else if (j5 > j && i4 != 0 && i7 > j) {
                                    size = i4 - 1;
                                } else {
                                    if (j5 > j && (i4 == 0 || i7 <= j)) {
                                        j2 = c23012ACm2.A00 - j;
                                        if (j2 < c23012ACm2.A02) {
                                            j3 = c23012ACm2.A01 + j4 + (r9 - 1);
                                            return j3 - j2;
                                        }
                                        return -1L;
                                    }
                                    throw new IndexOutOfBoundsException("Segment Index out of Segment Timeline bounds");
                                }
                            }
                            Long valueOf = Long.valueOf(j);
                            int i8 = -1;
                            if (list.size() > 0) {
                                i2 = ((C23012ACm) list.get(0)).A00;
                            } else {
                                i2 = -1;
                            }
                            Integer valueOf2 = Integer.valueOf(i2);
                            if (list.size() > 0) {
                                i8 = ((C23012ACm) list.get(list.size() - 1)).A00;
                            }
                            android.util.Log.w("SegmentTemplate", String.format("Search Fail; Index: %d, Start predicted num: %d, End predicted num: %d, Segment Timeline Size: %d", valueOf, valueOf2, Integer.valueOf(i8), Integer.valueOf(list.size())));
                            return -1L;
                        }
                        return -1L;
                    }
                }
                j2 = i;
                return j3 - j2;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // X.InterfaceC97364Yw
    public final C4B0 BsR(long j) {
        return this.A00.A06(this, j);
    }

    @Override // X.InterfaceC97364Yw
    public final long C8V(long j) {
        return this.A00.A02(j);
    }

    @Override // X.InterfaceC97364Yw
    public final boolean isExplicit() {
        return this.A00.A08();
    }

    public C97814aM(C4B6 c4b6, C4BE c4be, List list, List list2, List list3, List list4) {
        super(c4b6, c4be, list, list2, list3, list4);
        this.A00 = c4be;
    }
}
