package X;

import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.Pvn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58462Pvn implements Runnable {
    public final /* synthetic */ C103744ls A00;

    public RunnableC58462Pvn(C103744ls c103744ls) {
        this.A00 = c103744ls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C103744ls c103744ls = this.A00;
        Integer A00 = C103744ls.A00(c103744ls);
        if (A00 != C05F.A00) {
            boolean A1X = AbstractC167007dF.A1X(A00, C05F.A01);
            Iterator it = c103744ls.A03.iterator();
            while (it.hasNext()) {
                AbstractC128665rZ abstractC128665rZ = (AbstractC128665rZ) ((Reference) it.next()).get();
                if (abstractC128665rZ != null) {
                    synchronized (abstractC128665rZ) {
                        C58516Pwk c58516Pwk = abstractC128665rZ.A02;
                        if (c58516Pwk == null || !c58516Pwk.A08 || !A1X) {
                            abstractC128665rZ.A06();
                        }
                    }
                }
            }
        }
    }
}
