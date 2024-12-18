package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37431og extends AbstractC37441oh {
    public final C0E4 A00 = new C0E4();

    public final void A00(InterfaceC37451oi interfaceC37451oi) {
        C0E4 c0e4 = this.A00;
        synchronized (c0e4) {
            if (c0e4.A00 > 0) {
                ArrayList arrayList = c0e4.A01;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size + 1);
                c0e4.A01 = arrayList2;
                c0e4.A02 = Collections.unmodifiableList(arrayList2);
                for (int i = 0; i < size; i++) {
                    c0e4.A01.add(arrayList.get(i));
                }
            }
            c0e4.A01.add(interfaceC37451oi);
        }
    }

    @Override // X.AbstractC37441oh
    public final void onEventReceivedWithParamsCollectionMap(C0CA c0ca, C42751y3 c42751y3) {
        List list;
        C0E4 c0e4 = this.A00;
        synchronized (c0e4) {
            list = c0e4.A02;
            c0e4.A00++;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC42781y6.A00((InterfaceC37451oi) list.get(i), c42751y3, c0ca);
            }
        } finally {
            c0e4.A00();
        }
    }

    @Override // X.AbstractC37441oh, X.InterfaceC37451oi
    public final void onEventsWritten(int i) {
        List list;
        C0E4 c0e4 = this.A00;
        synchronized (c0e4) {
            list = c0e4.A02;
            c0e4.A00++;
        }
        try {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC37451oi) list.get(i2)).onEventsWritten(i);
            }
        } finally {
            c0e4.A00();
        }
    }
}
