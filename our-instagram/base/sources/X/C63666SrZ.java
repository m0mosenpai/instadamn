package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.SrZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63666SrZ implements InterfaceC65629Tpq, InterfaceC65308Thk {
    public final C63692Srz A04;
    public final Path A00 = AbstractC166987dD.A0T();
    public final Path A02 = AbstractC166987dD.A0T();
    public final Path A01 = AbstractC166987dD.A0T();
    public final List A03 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.A03;
            if (i < list3.size()) {
                ((InterfaceC65466Tki) list3.get(i)).ES5(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65629Tpq
    public final Path Bbd() {
        Path.Op op;
        Matrix matrix;
        Matrix matrix2;
        Path path = this.A01;
        path.reset();
        C63692Srz c63692Srz = this.A04;
        if (!c63692Srz.A01) {
            int intValue = c63692Srz.A00.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                op = Path.Op.XOR;
                            }
                        } else {
                            op = Path.Op.INTERSECT;
                        }
                    } else {
                        op = Path.Op.REVERSE_DIFFERENCE;
                    }
                } else {
                    op = Path.Op.UNION;
                }
                Path path2 = this.A02;
                path2.reset();
                Path path3 = this.A00;
                path3.reset();
                List list = this.A03;
                for (int size = list.size() - 1; size >= 1; size--) {
                    InterfaceC65629Tpq interfaceC65629Tpq = (InterfaceC65629Tpq) list.get(size);
                    if (interfaceC65629Tpq instanceof C63672Srf) {
                        C63672Srf c63672Srf = (C63672Srf) interfaceC65629Tpq;
                        List A00 = c63672Srf.A00();
                        for (int A03 = AbstractC31172DnG.A03(A00, 1); A03 >= 0; A03--) {
                            Path Bbd = ((InterfaceC65629Tpq) A00.get(A03)).Bbd();
                            SQ3 sq3 = c63672Srf.A00;
                            if (sq3 != null) {
                                matrix2 = sq3.A00();
                            } else {
                                matrix2 = c63672Srf.A02;
                                matrix2.reset();
                            }
                            Bbd.transform(matrix2);
                            path2.addPath(Bbd);
                        }
                    } else {
                        path2.addPath(interfaceC65629Tpq.Bbd());
                    }
                }
                InterfaceC65629Tpq interfaceC65629Tpq2 = (InterfaceC65629Tpq) list.get(0);
                if (interfaceC65629Tpq2 instanceof C63672Srf) {
                    C63672Srf c63672Srf2 = (C63672Srf) interfaceC65629Tpq2;
                    List A002 = c63672Srf2.A00();
                    for (int i = 0; i < A002.size(); i++) {
                        Path Bbd2 = ((InterfaceC65629Tpq) A002.get(i)).Bbd();
                        SQ3 sq32 = c63672Srf2.A00;
                        if (sq32 != null) {
                            matrix = sq32.A00();
                        } else {
                            matrix = c63672Srf2.A02;
                            matrix.reset();
                        }
                        Bbd2.transform(matrix);
                        path3.addPath(Bbd2);
                    }
                } else {
                    path3.set(interfaceC65629Tpq2.Bbd());
                }
                path.op(path3, path2, op);
                return path;
            }
            int i2 = 0;
            while (true) {
                List list2 = this.A03;
                if (i2 >= list2.size()) {
                    break;
                }
                path.addPath(((InterfaceC65629Tpq) list2.get(i2)).Bbd());
                i2++;
            }
        }
        return path;
    }

    public C63666SrZ(C63692Srz c63692Srz) {
        this.A04 = c63692Srz;
    }

    @Override // X.InterfaceC65308Thk
    public final void A75(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if (previous instanceof InterfaceC65629Tpq) {
                this.A03.add(previous);
                listIterator.remove();
            }
        }
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        throw C00O.createAndThrow();
    }
}
