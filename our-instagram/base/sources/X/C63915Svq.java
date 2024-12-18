package X;

import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: X.Svq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63915Svq implements InterfaceC100084eW {
    public final QDJ A00 = new QDJ();

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "wholestat";
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        QDJ qdj = this.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        QDJ.A00(qdj);
        ListIterator listIterator = qdj.A00.listIterator();
        while (listIterator.hasNext()) {
            C100164ee c100164ee = (C100164ee) listIterator.next();
            if (c100164ee != null) {
                if (!c100164ee.A0F.exists()) {
                    qdj.A01.remove(Integer.valueOf(c100164ee.A0E));
                    listIterator.remove();
                } else {
                    String A01 = c100164ee.A01();
                    if (A01 != null) {
                        A1E.add(A01);
                    }
                }
            }
        }
        sn2.A0D = A1E;
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
        QDJ qdj = this.A00;
        QDJ.A00(qdj);
        ListIterator listIterator = qdj.A00.listIterator();
        while (listIterator.hasNext()) {
            C100164ee c100164ee = (C100164ee) listIterator.next();
            if (c100164ee != null) {
                if (!c100164ee.A0F.exists()) {
                    qdj.A01.remove(Integer.valueOf(c100164ee.A0E));
                    listIterator.remove();
                } else {
                    c100164ee.A02();
                }
            }
        }
    }
}
