package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.4Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93914Kb {
    public final InterfaceC09390do A00;

    public final boolean A00(C129085sT c129085sT, List list, long j) {
        long j2;
        long j3;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(c129085sT, 2);
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                long j4 = ((C5lP) it.next()).A00;
                loop0: while (true) {
                    j2 = j4;
                    while (it.hasNext()) {
                        j4 = ((C5lP) it.next()).A00;
                        if (j2 > j4) {
                            break;
                        }
                    }
                }
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    long j5 = ((C5lP) it2.next()).A00;
                    loop2: while (true) {
                        j3 = j5;
                        while (it2.hasNext()) {
                            j5 = ((C5lP) it2.next()).A00;
                            if (j3 < j5) {
                                break;
                            }
                        }
                    }
                    long j6 = j2 - j;
                    long j7 = j3 - j;
                    long size = (j3 - j2) - (list.size() - 1);
                    if (size > 0) {
                        C1ZX A00 = ((C1ZW) this.A00.getValue()).A00(C05F.A02, 817891655, 0, false);
                        A00.A05(new RuntimeException("Unexpected hole in batch"));
                        A00.A02("messages.hole.size", size);
                        A00.A00();
                    }
                    if (j7 < 0) {
                        C1ZX A002 = ((C1ZW) this.A00.getValue()).A00(C05F.A02, 817891655, 0, false);
                        A002.A05(new RuntimeException("Unexpected older seqId"));
                        A002.A02("max.seq_id.delta", j7);
                        A002.A00();
                        z = c129085sT.A01;
                    } else if (j6 < 1) {
                        C1ZX A003 = ((C1ZW) this.A00.getValue()).A00(C05F.A02, 817891655, 0, false);
                        A003.A05(new RuntimeException("Unexpected seqId overlap"));
                        A003.A02("min.seq_id.delta", j6);
                        A003.A00();
                        z = c129085sT.A02;
                    } else if (j6 > 1) {
                        C1ZX A004 = ((C1ZW) this.A00.getValue()).A00(C05F.A02, 817891655, 0, false);
                        A004.A05(new RuntimeException("Unexpected hole between highestIrisSeqId and batch"));
                        A004.A02("min.seq_id.delta", j6);
                        A004.A00();
                        z = c129085sT.A00;
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        return !z;
    }

    public C93914Kb(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E3(interfaceC16820sZ, 38));
    }
}
