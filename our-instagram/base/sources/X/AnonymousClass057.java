package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.057, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass057 extends C10B implements InterfaceC06180Ui, InterfaceC14870p1, InterfaceC16480rt {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Object[] A04;
    public final int A05;
    public final int A06;
    public final Integer A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object[], java.lang.Object] */
    private final InterfaceC23621Ds[] A07(InterfaceC23621Ds[] interfaceC23621DsArr) {
        AnonymousClass109[] anonymousClass109Arr;
        C15060pM c15060pM;
        InterfaceC23621Ds interfaceC23621Ds;
        int length = interfaceC23621DsArr.length;
        if (super.A00 != 0 && (anonymousClass109Arr = super.A01) != null) {
            int i = 0;
            int length2 = anonymousClass109Arr.length;
            interfaceC23621DsArr = interfaceC23621DsArr;
            while (i < length2) {
                AnonymousClass109 anonymousClass109 = anonymousClass109Arr[i];
                if (anonymousClass109 != null && (interfaceC23621Ds = (c15060pM = (C15060pM) anonymousClass109).A01) != null && A00(c15060pM) >= 0) {
                    int length3 = interfaceC23621DsArr.length;
                    interfaceC23621DsArr = interfaceC23621DsArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC23621DsArr, Math.max(2, interfaceC23621DsArr.length * 2));
                        C14360o3.A07(copyOf);
                        interfaceC23621DsArr = copyOf;
                    }
                    interfaceC23621DsArr[length] = interfaceC23621Ds;
                    c15060pM.A01 = null;
                    length++;
                }
                i++;
                interfaceC23621DsArr = interfaceC23621DsArr;
            }
        }
        return interfaceC23621DsArr;
    }

    @Override // X.C10B
    public final /* bridge */ /* synthetic */ AnonymousClass109[] A0B(int i) {
        return new C15060pM[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0sl] */
    @Override // X.InterfaceC15070pN
    public final List Bn0() {
        ?? arrayList;
        synchronized (this) {
            long j = this.A02;
            long j2 = this.A03;
            int min = (int) ((Math.min(j, j2) + this.A00) - j2);
            if (min == 0) {
                arrayList = C16930sl.A00;
            } else {
                arrayList = new ArrayList(min);
                Object[] objArr = this.A04;
                C14360o3.A0A(objArr);
                for (int i = 0; i < min; i++) {
                    arrayList.add(objArr[(objArr.length - 1) & ((int) (this.A03 + i))]);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC06180Ui
    public final void EJt() {
        synchronized (this) {
            long j = this.A02;
            long min = Math.min(j, this.A03) + this.A00;
            A03(min, j, min, min + this.A01);
        }
    }

    @Override // X.InterfaceC15070pN, X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return A01(interfaceC23621Ds, interfaceC19960yQ, this);
    }

    @Override // X.InterfaceC06180Ui, X.InterfaceC19960yQ
    public final Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C10O c10o;
        if (!F8m(obj)) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
            C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
            c24891Jo.A0I();
            InterfaceC23621Ds[] interfaceC23621DsArr = C10A.A00;
            synchronized (this) {
                if (A06(obj)) {
                    c24891Jo.resumeWith(C0eB.A00);
                    interfaceC23621DsArr = A07(interfaceC23621DsArr);
                    c10o = null;
                } else {
                    long min = Math.min(this.A02, this.A03);
                    int i = this.A00;
                    int i2 = this.A01;
                    c10o = new C10O(obj, c24891Jo, this, i + i2 + min);
                    A04(c10o);
                    this.A01 = i2 + 1;
                    if (this.A05 == 0) {
                        interfaceC23621DsArr = A07(interfaceC23621DsArr);
                    }
                }
            }
            if (c10o != null) {
                c24891Jo.CPA(new C50152Se(c10o));
            }
            for (InterfaceC23621Ds interfaceC23621Ds2 : interfaceC23621DsArr) {
                if (interfaceC23621Ds2 != null) {
                    interfaceC23621Ds2.resumeWith(C0eB.A00);
                }
            }
            Object A0E = c24891Jo.A0E();
            C1JX c1jx = C1JX.A02;
            if (A0E != c1jx) {
                A0E = C0eB.A00;
            }
            if (A0E == c1jx) {
                return A0E;
            }
        }
        return C0eB.A00;
    }

    private final long A00(C15060pM c15060pM) {
        long j = c15060pM.A00;
        long min = Math.min(this.A02, this.A03);
        if (j >= min + this.A00 && (this.A05 > 0 || j > min || this.A01 == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(X.InterfaceC23621Ds r15, X.InterfaceC19960yQ r16, X.AnonymousClass057 r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass057.A01(X.1Ds, X.0yQ, X.057):java.lang.Object");
    }

    private final void A02() {
        AnonymousClass109[] anonymousClass109Arr;
        Object[] objArr = this.A04;
        C14360o3.A0A(objArr);
        long j = this.A02;
        long j2 = this.A03;
        long min = Math.min(j, j2);
        objArr[(objArr.length - 1) & ((int) min)] = null;
        this.A00--;
        long j3 = min + 1;
        if (j2 < j3) {
            this.A03 = j3;
        }
        if (j < j3) {
            if (super.A00 != 0 && (anonymousClass109Arr = super.A01) != null) {
                for (AnonymousClass109 anonymousClass109 : anonymousClass109Arr) {
                    if (anonymousClass109 != null) {
                        C15060pM c15060pM = (C15060pM) anonymousClass109;
                        if (c15060pM.A00 >= 0 && c15060pM.A00 < j3) {
                            c15060pM.A00 = j3;
                        }
                    }
                }
            }
            this.A02 = j3;
        }
    }

    private final void A04(Object obj) {
        Object[] objArr;
        int i = this.A00 + this.A01;
        Object[] objArr2 = this.A04;
        if (objArr2 == null) {
            objArr = new Object[2];
            this.A04 = objArr;
        } else {
            int length = objArr2.length;
            if (i >= length) {
                int i2 = length * 2;
                if (i2 > 0) {
                    objArr = new Object[i2];
                    this.A04 = objArr;
                    long min = Math.min(this.A02, this.A03);
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = (int) (i3 + min);
                        objArr[(i2 - 1) & i4] = objArr2[(objArr2.length - 1) & i4];
                    }
                } else {
                    throw new IllegalStateException("Buffer size overflow");
                }
            }
            objArr2[(objArr2.length - 1) & ((int) (Math.min(this.A02, this.A03) + i))] = obj;
        }
        objArr2 = objArr;
        objArr2[(objArr2.length - 1) & ((int) (Math.min(this.A02, this.A03) + i))] = obj;
    }

    public static final void A05(AnonymousClass057 anonymousClass057) {
        if (anonymousClass057.A05 == 0 && anonymousClass057.A01 <= 1) {
            return;
        }
        Object[] objArr = anonymousClass057.A04;
        C14360o3.A0A(objArr);
        while (true) {
            int i = anonymousClass057.A01;
            if (i <= 0) {
                return;
            }
            long min = Math.min(anonymousClass057.A02, anonymousClass057.A03);
            int i2 = anonymousClass057.A00;
            int i3 = (int) ((min + (i2 + i)) - 1);
            int length = objArr.length - 1;
            if (objArr[length & i3] != C10M.A00) {
                return;
            }
            anonymousClass057.A01 = i - 1;
            objArr[length & ((int) (min + i2 + r0))] = null;
        }
    }

    private final boolean A06(Object obj) {
        if (super.A00 == 0) {
            int i = this.A06;
            if (i != 0) {
                A04(obj);
                int i2 = this.A00 + 1;
                this.A00 = i2;
                if (i2 > i) {
                    A02();
                }
                this.A02 = Math.min(this.A02, this.A03) + this.A00;
            }
            return true;
        }
        int i3 = this.A00;
        int i4 = this.A05;
        if (i3 >= i4 && this.A02 <= this.A03) {
            int intValue = this.A07.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        A04(obj);
        int i5 = i3 + 1;
        this.A00 = i5;
        if (i5 > i4) {
            A02();
        }
        long j = this.A02;
        long j2 = this.A03;
        long min = Math.min(j, j2) + this.A00;
        if (((int) (min - j2)) <= this.A06) {
            return true;
        }
        A03(j2 + 1, j, min, min + this.A01);
        return true;
    }

    @Override // X.C10B
    public final /* bridge */ /* synthetic */ AnonymousClass109 A0A() {
        return new C15060pM();
    }

    public final InterfaceC23621Ds[] A0C(long j) {
        int i;
        int i2;
        long j2;
        AnonymousClass109[] anonymousClass109Arr;
        long j3 = this.A02;
        if (j <= j3) {
            long min = Math.min(j3, this.A03);
            long j4 = this.A00 + min;
            long j5 = j4;
            int i3 = this.A05;
            if (i3 == 0 && this.A01 > 0) {
                j4++;
            }
            int i4 = super.A00;
            if (i4 != 0 && (anonymousClass109Arr = super.A01) != null) {
                for (AnonymousClass109 anonymousClass109 : anonymousClass109Arr) {
                    if (anonymousClass109 != null) {
                        C15060pM c15060pM = (C15060pM) anonymousClass109;
                        if (c15060pM.A00 >= 0 && c15060pM.A00 < j4) {
                            j4 = c15060pM.A00;
                        }
                    }
                }
            }
            if (j4 > j3) {
                if (i4 > 0) {
                    i2 = this.A01;
                    i = Math.min(i2, i3 - ((int) (j5 - j4)));
                } else {
                    i = this.A01;
                    i2 = i;
                }
                InterfaceC23621Ds[] interfaceC23621DsArr = C10A.A00;
                long j6 = i2 + j5;
                if (i > 0) {
                    interfaceC23621DsArr = new InterfaceC23621Ds[i];
                    Object[] objArr = this.A04;
                    C14360o3.A0A(objArr);
                    long j7 = j5;
                    int i5 = 0;
                    while (j5 < j6) {
                        int length = objArr.length - 1;
                        int i6 = length & ((int) j5);
                        Object obj = objArr[i6];
                        C20730zt c20730zt = C10M.A00;
                        if (obj != c20730zt) {
                            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C10O c10o = (C10O) obj;
                            int i7 = i5 + 1;
                            interfaceC23621DsArr[i5] = c10o.A02;
                            objArr[i6] = c20730zt;
                            objArr[length & ((int) j7)] = c10o.A01;
                            j2 = 1;
                            j7++;
                            if (i7 >= i) {
                                break;
                            }
                            i5 = i7;
                        } else {
                            j2 = 1;
                        }
                        j5 += j2;
                    }
                    j5 = j7;
                }
                int i8 = (int) (j5 - min);
                if (super.A00 == 0) {
                    j4 = j5;
                }
                long max = Math.max(this.A03, j5 - Math.min(this.A06, i8));
                if (i3 == 0 && max < j6) {
                    Object[] objArr2 = this.A04;
                    C14360o3.A0A(objArr2);
                    if (C14360o3.A0K(objArr2[(objArr2.length - 1) & ((int) max)], C10M.A00)) {
                        j5++;
                        max++;
                    }
                }
                A03(max, j4, j5, j6);
                A05(this);
                if (interfaceC23621DsArr.length != 0) {
                    return A07(interfaceC23621DsArr);
                }
                return interfaceC23621DsArr;
            }
        }
        return C10A.A00;
    }

    @Override // X.InterfaceC14870p1
    public final InterfaceC19390xP AWl(Integer num, C12W c12w, int i) {
        if ((i == 0 || i == -3) && num == C05F.A00) {
            return this;
        }
        return new AnonymousClass055(num, c12w, this, i);
    }

    @Override // X.InterfaceC06180Ui
    public final boolean F8m(Object obj) {
        int i;
        boolean z;
        InterfaceC23621Ds[] interfaceC23621DsArr = C10A.A00;
        synchronized (this) {
            if (A06(obj)) {
                interfaceC23621DsArr = A07(interfaceC23621DsArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC23621Ds interfaceC23621Ds : interfaceC23621DsArr) {
            if (interfaceC23621Ds != null) {
                interfaceC23621Ds.resumeWith(C0eB.A00);
            }
        }
        return z;
    }

    public AnonymousClass057(Integer num, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = num;
    }

    private final void A03(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long min2 = Math.min(this.A02, this.A03); min2 < min; min2++) {
            Object[] objArr = this.A04;
            C14360o3.A0A(objArr);
            objArr[(objArr.length - 1) & ((int) min2)] = null;
        }
        this.A03 = j;
        this.A02 = j2;
        this.A00 = (int) (j3 - min);
        this.A01 = (int) (j4 - j3);
    }
}
