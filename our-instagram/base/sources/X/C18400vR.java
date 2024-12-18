package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18400vR implements InterfaceC14020nS {
    public final List A00;
    public final C12T A01;
    public final C0o9 A02;
    public final C12R A03;

    @Override // X.InterfaceC14020nS
    public final void ATN(C14160ng c14160ng) {
        C14360o3.A0B(c14160ng, 0);
        AbstractRunnableC14200nk abstractRunnableC14200nk = c14160ng.A00;
        C14360o3.A07(abstractRunnableC14200nk);
        ATO(abstractRunnableC14200nk);
    }

    @Override // X.InterfaceC14020nS
    public final void ATO(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        Object obj;
        C12T c12t;
        C14360o3.A0B(abstractRunnableC14200nk, 0);
        if (abstractRunnableC14200nk.isSendToNetworkThreadPool) {
            c12t = this.A01;
        } else {
            int i = abstractRunnableC14200nk.priority;
            List list = this.A00;
            int i2 = i - 1;
            if (i2 >= 0 && i2 < list.size()) {
                obj = list.get(i2);
            } else {
                obj = (C12T) AbstractC001800i.A0K(list);
            }
            c12t = (C12T) obj;
        }
        C0SJ A02 = C06600Wq.A02("Fury", 1);
        A02.close();
        c12t.A05(abstractRunnableC14200nk, AnonymousClass190.A02(new C13990nP(abstractRunnableC14200nk.runnableId), new C14010nR(abstractRunnableC14200nk.priority)).plus(new C13970nN(A02)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.12T, X.12R] */
    public C18400vR(Integer num, List list, List list2, int i, long j, boolean z, boolean z2) {
        int max;
        final C12R c12r;
        C0o9 c0o9;
        ?? arrayList;
        long j2 = j;
        int i2 = i;
        C14360o3.A0B(list, 1);
        C14360o3.A0B(list2, 2);
        if (num != null) {
            max = num.intValue();
        } else {
            C15900qk A01 = C15900qk.A01();
            max = Math.max(A01.A05(), A01.A04());
        }
        max = max < 8 ? 8 : max;
        if (z) {
            System.setProperty("kotlinx.coroutines.scheduler.core.pool.size", String.valueOf(max));
            C12T c12t = C12P.A00;
            C14360o3.A0C(c12t, "null cannot be cast to non-null type kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher");
            c12r = (C12R) c12t;
        } else {
            long j3 = AbstractC14100na.A00;
            ?? c12t2 = new C12T();
            c12t2.A00 = new ExecutorC213312l(max, 2097150, "IgCoroutineExecutor", j3);
            c12r = c12t2;
        }
        this.A03 = c12r;
        C12T A03 = new C12T(c12r) { // from class: X.0nu
            public final C12R A00;

            {
                C14360o3.A0B(c12r, 1);
                this.A00 = c12r;
            }

            @Override // X.C12T
            public final void A04(Runnable runnable, C12W c12w) {
                C14360o3.A0B(runnable, 1);
                C12R c12r2 = this.A00;
                c12r2.A00.A05(runnable, AbstractC212912g.A06, true);
            }

            @Override // X.C12T
            public final void A05(Runnable runnable, C12W c12w) {
                C14360o3.A0B(runnable, 1);
                C12R c12r2 = this.A00;
                c12r2.A00.A05(runnable, AbstractC212912g.A06, false);
            }
        }.A03(i2 < 128 ? 128 : i2);
        this.A01 = A03;
        if (z2) {
            c0o9 = new C0o9(list, list2, c12r, A03, j < 500 ? 500L : j2);
        } else {
            c0o9 = null;
        }
        this.A02 = c0o9;
        if (c0o9 == null || (arrayList = c0o9.A02) == 0) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.A03.A03(((Number) it.next()).intValue()));
            }
        }
        this.A00 = arrayList;
    }
}
