package X;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.TLc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64591TLc implements Runnable {
    public final /* synthetic */ List A00;

    public RunnableC64591TLc(List list) {
        this.A00 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C218914p c218914p = C218914p.A08;
        List list = this.A00;
        ArrayList<InterfaceC12870lZ> A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj != null) {
                A1E.add(obj);
            }
        }
        int size = A1E.size();
        AtomicInteger atomicInteger = C218914p.A0H;
        int andIncrement = atomicInteger.getAndIncrement();
        C218914p.A00().markerStart(694564060, andIncrement, false);
        C218914p.A00().markerAnnotate(694564060, andIncrement, "operation", "onAppForegrounded");
        C218914p.A00().markerAnnotate(694564060, andIncrement, "asl_session_id", C0L6.A01());
        if (AbstractC58321PtD.A1Y("onAppForegrounded", andIncrement, size)) {
            if (AbstractC166987dD.A1a(AbstractC15930qn.A02.A05.invoke())) {
                try {
                    for (InterfaceC12870lZ interfaceC12870lZ : A1E) {
                        String A0h = MSY.A0h(interfaceC12870lZ);
                        C14360o3.A07(A0h);
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        AbstractC58321PtD.A0a("onAppForegrounded", andIncrement2).markerAnnotate(694559790, andIncrement2, "listener", AnonymousClass001.A0g("<cls>", A0h, "</cls>"));
                        if (AbstractC58321PtD.A1X("onAppForegrounded", andIncrement2)) {
                            try {
                                interfaceC12870lZ.onAppForegrounded();
                            } catch (Throwable th) {
                                AbstractC58321PtD.A1S(th);
                            }
                        } else {
                            interfaceC12870lZ.onAppForegrounded();
                        }
                        AbstractC58320PtC.A1D(andIncrement2);
                    }
                } catch (Throwable th2) {
                    AbstractC58321PtD.A1S(th2);
                }
            } else {
                for (InterfaceC12870lZ interfaceC12870lZ2 : A1E) {
                    try {
                        String A0h2 = MSY.A0h(interfaceC12870lZ2);
                        C14360o3.A07(A0h2);
                        int andIncrement3 = atomicInteger.getAndIncrement();
                        AbstractC58321PtD.A0a("onAppForegrounded", andIncrement3).markerAnnotate(694559790, andIncrement3, "listener", AnonymousClass001.A0g("<cls>", A0h2, "</cls>"));
                        if (AbstractC58321PtD.A1X("onAppForegrounded", andIncrement3)) {
                            try {
                                interfaceC12870lZ2.onAppForegrounded();
                            } catch (Throwable th3) {
                                AbstractC58321PtD.A1S(th3);
                            }
                        } else {
                            interfaceC12870lZ2.onAppForegrounded();
                        }
                        AbstractC58320PtC.A1D(andIncrement3);
                    } catch (Throwable th4) {
                        AbstractC58321PtD.A1S(th4);
                    }
                }
            }
        } else {
            for (InterfaceC12870lZ interfaceC12870lZ3 : A1E) {
                String A0h3 = MSY.A0h(interfaceC12870lZ3);
                C14360o3.A07(A0h3);
                int andIncrement4 = atomicInteger.getAndIncrement();
                AbstractC58321PtD.A0a("onAppForegrounded", andIncrement4).markerAnnotate(694559790, andIncrement4, "listener", AnonymousClass001.A0g("<cls>", A0h3, "</cls>"));
                if (AbstractC58321PtD.A1X("onAppForegrounded", andIncrement4)) {
                    try {
                        interfaceC12870lZ3.onAppForegrounded();
                    } catch (Throwable th5) {
                        AbstractC58321PtD.A1S(th5);
                    }
                } else {
                    interfaceC12870lZ3.onAppForegrounded();
                }
                AbstractC58320PtC.A1D(andIncrement4);
            }
        }
        C218914p.A00().markerEnd(694564060, andIncrement, (short) 2);
    }
}
