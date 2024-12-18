package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46462Bj {
    public final C46452Bi A01;
    public final LinkedList A04 = new LinkedList();
    public final HashSet A03 = new HashSet();
    public final Object A02 = new Object();
    public int A00 = 0;
    public final AtomicInteger A05 = new AtomicInteger(0);

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:88:0x019d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static void A00(X.C92024Ai r11, final X.C46462Bj r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46462Bj.A00(X.4Ai, X.2Bj, boolean):void");
    }

    public final LinkedList A01(Object obj, String str) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = this.A04;
        synchronized (linkedList2) {
            ListIterator listIterator = linkedList2.listIterator();
            while (listIterator.hasNext()) {
                C92024Ai c92024Ai = (C92024Ai) listIterator.next();
                c92024Ai.getClass();
                InterfaceC91964Ac interfaceC91964Ac = c92024Ai.A00;
                if (obj.equals(interfaceC91964Ac)) {
                    interfaceC91964Ac.DfD(str);
                    linkedList.add(interfaceC91964Ac);
                    listIterator.remove();
                }
            }
        }
        return linkedList;
    }

    public final void A02(Object obj) {
        synchronized (this.A04) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                InterfaceC91964Ac interfaceC91964Ac = ((C92024Ai) it.next()).A00;
                if (obj.equals(interfaceC91964Ac)) {
                    interfaceC91964Ac.AGG("CANCELED_ONGOING_PREFETCH");
                }
            }
        }
    }

    public C46462Bj(C46452Bi c46452Bi) {
        this.A01 = c46452Bi;
    }
}
