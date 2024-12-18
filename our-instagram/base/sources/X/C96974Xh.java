package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96974Xh extends AbstractC96984Xi {
    public C116475Pc A00;
    public long A01;
    public long A02;
    public C116525Ph A03;
    public final long A04;
    public final long A05;
    public final C96604Vv A06;
    public final ArrayList A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.exoplayer2.Timeline, X.5Ph] */
    public static void A00(final Timeline timeline, C96974Xh c96974Xh) {
        final long j;
        ArrayList arrayList;
        C96604Vv c96604Vv = c96974Xh.A06;
        timeline.A0E(c96604Vv, 0, 0L);
        long j2 = c96604Vv.A05;
        final long j3 = Long.MIN_VALUE;
        try {
            if (c96974Xh.A03 != null) {
                arrayList = c96974Xh.A07;
                if (!arrayList.isEmpty()) {
                    j = c96974Xh.A02 - j2;
                    if (c96974Xh.A04 != Long.MIN_VALUE) {
                        j3 = c96974Xh.A01 - j2;
                    }
                    ?? r8 = new AbstractC97384Yy(timeline, j, j3) { // from class: X.5Ph
                        public final long A00;
                        public final long A01;
                        public final long A02;
                        public final boolean A03;

                        @Override // X.AbstractC97384Yy, com.google.android.exoplayer2.Timeline
                        public final C4WJ A0D(C4WJ c4wj, int i, boolean z) {
                            long j4;
                            super.A00.A0D(c4wj, 0, z);
                            long j5 = c4wj.A02 - this.A02;
                            long j6 = this.A00;
                            if (j6 == -9223372036854775807L) {
                                j4 = -9223372036854775807L;
                            } else {
                                j4 = j6 - j5;
                            }
                            c4wj.A02(j4, c4wj.A04, j5, c4wj.A05);
                            return c4wj;
                        }

                        @Override // X.AbstractC97384Yy, com.google.android.exoplayer2.Timeline
                        public final C96604Vv A0E(C96604Vv c96604Vv2, int i, long j4) {
                            super.A00.A0E(c96604Vv2, 0, 0L);
                            long j5 = c96604Vv2.A05;
                            long j6 = this.A02;
                            c96604Vv2.A05 = j5 + j6;
                            c96604Vv2.A03 = this.A00;
                            c96604Vv2.A0D = this.A03;
                            long j7 = c96604Vv2.A02;
                            if (j7 != -9223372036854775807L) {
                                long max = Math.max(j7, j6);
                                c96604Vv2.A02 = max;
                                long j8 = this.A01;
                                if (j8 != -9223372036854775807L) {
                                    max = Math.min(max, j8);
                                }
                                c96604Vv2.A02 = max;
                                c96604Vv2.A02 = max - j6;
                            }
                            long A08 = Util.A08(j6);
                            long j9 = c96604Vv2.A06;
                            if (j9 != -9223372036854775807L) {
                                c96604Vv2.A06 = j9 + A08;
                            }
                            long j10 = c96604Vv2.A07;
                            if (j10 != -9223372036854775807L) {
                                c96604Vv2.A07 = j10 + A08;
                            }
                            return c96604Vv2;
                        }

                        {
                            super(timeline);
                            long max;
                            long j4;
                            boolean z = false;
                            if (timeline.A01() == 1) {
                                C96604Vv A0E = timeline.A0E(new C96604Vv(), 0, 0L);
                                long max2 = Math.max(0L, j);
                                if (!A0E.A0F && max2 != 0 && !A0E.A0G) {
                                    throw new IOException(AnonymousClass001.A0R("Illegal clipping: ", "not seekable to start"));
                                }
                                if (j3 == Long.MIN_VALUE) {
                                    max = A0E.A03;
                                } else {
                                    max = Math.max(0L, j3);
                                }
                                long j5 = A0E.A03;
                                if (j5 != -9223372036854775807L) {
                                    max = max > j5 ? j5 : max;
                                    if (max2 > max) {
                                        throw new IOException(AnonymousClass001.A0R("Illegal clipping: ", "start exceeds end"));
                                    }
                                }
                                this.A02 = max2;
                                this.A01 = max;
                                if (max == -9223372036854775807L) {
                                    j4 = -9223372036854775807L;
                                } else {
                                    j4 = max - max2;
                                }
                                this.A00 = j4;
                                if (A0E.A0D && (max == -9223372036854775807L || (j5 != -9223372036854775807L && max == j5))) {
                                    z = true;
                                }
                                this.A03 = z;
                                return;
                            }
                            throw new IOException(AnonymousClass001.A0R("Illegal clipping: ", "invalid period count"));
                        }
                    };
                    c96974Xh.A03 = r8;
                    c96974Xh.A0A(r8);
                    return;
                }
            }
            ?? r82 = new AbstractC97384Yy(timeline, j, j3) { // from class: X.5Ph
                public final long A00;
                public final long A01;
                public final long A02;
                public final boolean A03;

                @Override // X.AbstractC97384Yy, com.google.android.exoplayer2.Timeline
                public final C4WJ A0D(C4WJ c4wj, int i, boolean z) {
                    long j4;
                    super.A00.A0D(c4wj, 0, z);
                    long j5 = c4wj.A02 - this.A02;
                    long j6 = this.A00;
                    if (j6 == -9223372036854775807L) {
                        j4 = -9223372036854775807L;
                    } else {
                        j4 = j6 - j5;
                    }
                    c4wj.A02(j4, c4wj.A04, j5, c4wj.A05);
                    return c4wj;
                }

                @Override // X.AbstractC97384Yy, com.google.android.exoplayer2.Timeline
                public final C96604Vv A0E(C96604Vv c96604Vv2, int i, long j4) {
                    super.A00.A0E(c96604Vv2, 0, 0L);
                    long j5 = c96604Vv2.A05;
                    long j6 = this.A02;
                    c96604Vv2.A05 = j5 + j6;
                    c96604Vv2.A03 = this.A00;
                    c96604Vv2.A0D = this.A03;
                    long j7 = c96604Vv2.A02;
                    if (j7 != -9223372036854775807L) {
                        long max = Math.max(j7, j6);
                        c96604Vv2.A02 = max;
                        long j8 = this.A01;
                        if (j8 != -9223372036854775807L) {
                            max = Math.min(max, j8);
                        }
                        c96604Vv2.A02 = max;
                        c96604Vv2.A02 = max - j6;
                    }
                    long A08 = Util.A08(j6);
                    long j9 = c96604Vv2.A06;
                    if (j9 != -9223372036854775807L) {
                        c96604Vv2.A06 = j9 + A08;
                    }
                    long j10 = c96604Vv2.A07;
                    if (j10 != -9223372036854775807L) {
                        c96604Vv2.A07 = j10 + A08;
                    }
                    return c96604Vv2;
                }

                {
                    super(timeline);
                    long max;
                    long j4;
                    boolean z = false;
                    if (timeline.A01() == 1) {
                        C96604Vv A0E = timeline.A0E(new C96604Vv(), 0, 0L);
                        long max2 = Math.max(0L, j);
                        if (!A0E.A0F && max2 != 0 && !A0E.A0G) {
                            throw new IOException(AnonymousClass001.A0R("Illegal clipping: ", "not seekable to start"));
                        }
                        if (j3 == Long.MIN_VALUE) {
                            max = A0E.A03;
                        } else {
                            max = Math.max(0L, j3);
                        }
                        long j5 = A0E.A03;
                        if (j5 != -9223372036854775807L) {
                            max = max > j5 ? j5 : max;
                            if (max2 > max) {
                                throw new IOException(AnonymousClass001.A0R("Illegal clipping: ", "start exceeds end"));
                            }
                        }
                        this.A02 = max2;
                        this.A01 = max;
                        if (max == -9223372036854775807L) {
                            j4 = -9223372036854775807L;
                        } else {
                            j4 = max - max2;
                        }
                        this.A00 = j4;
                        if (A0E.A0D && (max == -9223372036854775807L || (j5 != -9223372036854775807L && max == j5))) {
                            z = true;
                        }
                        this.A03 = z;
                        return;
                    }
                    throw new IOException(AnonymousClass001.A0R("Illegal clipping: ", "invalid period count"));
                }
            };
            c96974Xh.A03 = r82;
            c96974Xh.A0A(r82);
            return;
        } catch (C116475Pc e) {
            c96974Xh.A00 = e;
            for (int i = 0; i < arrayList.size(); i++) {
                ((C97174Yc) arrayList.get(i)).A03 = e;
            }
            return;
        }
        j = c96974Xh.A05;
        long j4 = c96974Xh.A04;
        long j5 = j2 + j;
        c96974Xh.A02 = j5;
        if (j4 != Long.MIN_VALUE) {
            j3 = j2 + j4;
        }
        c96974Xh.A01 = j3;
        arrayList = c96974Xh.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C97174Yc c97174Yc = (C97174Yc) arrayList.get(i2);
            c97174Yc.A02 = j5;
            c97174Yc.A00 = j3;
        }
        j3 = j4;
    }

    @Override // X.C4XW
    public final C4Z0 AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j) {
        C97174Yc c97174Yc = new C97174Yc(((AbstractC96984Xi) this).A00.AMl(c4wx, interfaceC96344Us, j), this.A02, this.A01);
        this.A07.add(c97174Yc);
        return c97174Yc;
    }

    @Override // X.AbstractC96994Xj, X.C4XW
    public final void Cp0() {
        C116475Pc c116475Pc = this.A00;
        if (c116475Pc == null) {
            super.Cp0();
            return;
        }
        throw c116475Pc;
    }

    @Override // X.C4XW
    public final void EEP(C4Z0 c4z0) {
        ArrayList arrayList = this.A07;
        C4B8.A04(arrayList.remove(c4z0));
        ((AbstractC96984Xi) this).A00.EEP(((C97174Yc) c4z0).A06);
        if (arrayList.isEmpty()) {
            C116525Ph c116525Ph = this.A03;
            c116525Ph.getClass();
            A00(((AbstractC97384Yy) c116525Ph).A00, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96974Xh(C4XW c4xw, long j, long j2) {
        super(c4xw);
        c4xw.getClass();
        C4B8.A03(j >= 0);
        this.A05 = j;
        this.A04 = j2;
        this.A07 = new ArrayList();
        this.A06 = new C96604Vv();
    }

    @Override // X.AbstractC96994Xj, X.C4XV
    public final void A0B() {
        super.A0B();
        this.A00 = null;
        this.A03 = null;
    }
}
