package X;

import java.util.List;

/* renamed from: X.Wv5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71501Wv5 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C69650Vsr A01;

    public RunnableC71501Wv5(C69650Vsr c69650Vsr, long j) {
        this.A00 = j;
        this.A01 = c69650Vsr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("prefetch still not done after ");
        sb.append(this.A00);
        sb.append(". We still are waiting on ");
        C69650Vsr c69650Vsr = this.A01;
        List list = c69650Vsr.A08;
        sb.append(list.size());
        sb.append(" video callbacks and ");
        List list2 = c69650Vsr.A07;
        sb.append(list2.size());
        String A0x = AbstractC166997dE.A0x(" image callbacks - finishing job", sb);
        list.clear();
        list2.clear();
        AnonymousClass503 anonymousClass503 = c69650Vsr.A06;
        C14360o3.A0B(A0x, 1);
        if (AnonymousClass503.A00(anonymousClass503)) {
            anonymousClass503.A01.flowEndFail(anonymousClass503.A00, "PREFETCH_MEDIAS_TIMEOUT", A0x);
        }
        c69650Vsr.A04.AVi(AbstractC111324zv.A00(394));
    }
}
