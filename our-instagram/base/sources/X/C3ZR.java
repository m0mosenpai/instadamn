package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ZR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZR implements C3ZQ {
    public static final C3AT A08 = new C3AT(C3ZS.A00, C3ZT.A00, C3ZU.A00, C3ZV.A00);
    public C3ZQ A00;
    public C3ZQ A01;
    public C3ZQ A02;
    public C3ZQ A03;
    public C3ZQ A04;
    public final int A05;
    public final int A06;
    public final C5H0 A07;

    @Override // X.C3ZQ
    public final Object Ava() {
        return null;
    }

    @Override // X.C3ZQ
    public final Iterable BWV(C206209Bd c206209Bd, C3AW c3aw, int i) {
        C3AT c3at;
        C09530e4 c09530e4;
        C14360o3.A0B(c206209Bd, 1);
        ArrayList arrayList = new ArrayList();
        C3ZQ c3zq = this.A01;
        if (c3zq != null) {
            arrayList.add(new C09530e4(c3zq, 0));
        }
        if (c3aw == null || (c3at = c3aw.A00) == null) {
            c3at = A08;
        }
        boolean z = ((C50525MSe) c206209Bd.A02).A00;
        C3ZQ c3zq2 = this.A03;
        if (z) {
            if (c3zq2 != null) {
                arrayList.add(A00(c206209Bd, c3zq2, ((Number) c3at.A02.invoke(Integer.valueOf(i))).intValue()));
            }
            C3ZQ c3zq3 = this.A02;
            if (c3zq3 != null) {
                arrayList.add(A00(c206209Bd, c3zq3, ((Number) c3at.A01.invoke(Integer.valueOf(i))).intValue()));
            }
            C3ZQ c3zq4 = this.A00;
            if (c3zq4 != null) {
                arrayList.add(A00(c206209Bd, c3zq4, ((Number) c3at.A00.invoke(Integer.valueOf(i))).intValue()));
            }
            C3ZQ c3zq5 = this.A04;
            if (c3zq5 != null) {
                c09530e4 = A00(c206209Bd, c3zq5, ((Number) c3at.A03.invoke(Integer.valueOf(i))).intValue());
                arrayList.add(c09530e4);
            }
        } else {
            if (c3zq2 != null) {
                arrayList.add(new C09530e4(c3zq2, c3at.A02.invoke(Integer.valueOf(i))));
            }
            C3ZQ c3zq6 = this.A02;
            if (c3zq6 != null) {
                arrayList.add(new C09530e4(c3zq6, c3at.A01.invoke(Integer.valueOf(i))));
            }
            C3ZQ c3zq7 = this.A00;
            if (c3zq7 != null) {
                arrayList.add(new C09530e4(c3zq7, c3at.A00.invoke(Integer.valueOf(i))));
            }
            C3ZQ c3zq8 = this.A04;
            if (c3zq8 != null) {
                c09530e4 = new C09530e4(c3zq8, c3at.A03.invoke(Integer.valueOf(i)));
                arrayList.add(c09530e4);
            }
        }
        return arrayList;
    }

    private final C09530e4 A00(C206209Bd c206209Bd, C3ZQ c3zq, int i) {
        C5H0 c5h0;
        C5IX c5ix = (C5IX) c206209Bd.A01;
        if (c5ix != null && (c5h0 = this.A07) != null) {
            C50525MSe c50525MSe = (C50525MSe) c206209Bd.A02;
            C0f6 c0f6 = (C0f6) c206209Bd.A00;
            int i2 = this.A06;
            int i3 = this.A05;
            C14360o3.A0B(c50525MSe, 0);
            C14360o3.A0B(c0f6, 1);
            if (c5ix instanceof C27086BxB) {
                C27086BxB c27086BxB = (C27086BxB) c5ix;
                if (C41551w4.class.equals(c27086BxB.A00)) {
                    List list = c27086BxB.A02;
                    C14360o3.A0B(list, 1);
                    if (!list.isEmpty()) {
                        int size = list.size() - 1;
                        int i4 = 0;
                        while (true) {
                            if (i4 > size) {
                                break;
                            }
                            int i5 = (i4 + size) / 2;
                            int intValue = ((Number) ((C09530e4) list.get(i5)).A00).intValue();
                            int i6 = i2 + 1;
                            int i7 = i6 + i5;
                            if (intValue == i7) {
                                int i8 = i5;
                                while (i8 > 0) {
                                    int i9 = i8 - 1;
                                    if (((Number) ((C09530e4) list.get(i9)).A00).intValue() != i6 + i9) {
                                        break;
                                    }
                                    i8--;
                                }
                                while (i5 < list.size() - 1) {
                                    int i10 = i5 + 1;
                                    if (((Number) ((C09530e4) list.get(i10)).A00).intValue() != i6 + i10) {
                                        break;
                                    }
                                    i5 = i10;
                                }
                                C17u c17u = new C17u(i8, i5);
                                C29173Cte A00 = C5H0.A00(c27086BxB, c5h0, new D90(c50525MSe, c0f6, c27086BxB, c5h0, this, c3zq, c17u, i2, i3, i), ((Number) AbstractC001800i.A09(c17u)).intValue());
                                if (A00 != null) {
                                    return new C09530e4(A00, Integer.valueOf(i));
                                }
                            } else if (intValue > i7) {
                                size = i5 - 1;
                            } else {
                                i4 = i5 + 1;
                            }
                        }
                    }
                }
            }
        }
        return new C09530e4(c3zq, Integer.valueOf(i));
    }

    @Override // X.C3ZQ
    public final boolean DR6(Object obj) {
        C3ZQ c3zq = this.A01;
        if (c3zq != null) {
            return c3zq.DR6(obj);
        }
        return true;
    }

    @Override // X.C3ZQ
    public final void DR7(Object obj) {
        C3ZQ c3zq = this.A01;
        if (c3zq != null) {
            c3zq.DR7(obj);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[GridGraphNode] row = ");
        sb.append(this.A06);
        sb.append(", column = ");
        sb.append(this.A05);
        sb.append(", inner: ");
        sb.append(this.A01);
        return sb.toString();
    }

    public C3ZR(C5H0 c5h0, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = c5h0;
    }
}
