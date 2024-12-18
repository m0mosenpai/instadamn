package X;

import java.util.LinkedList;

/* renamed from: X.3yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89153yH implements InterfaceC27191Tt {
    public final /* synthetic */ C89123yE A00;
    public final /* synthetic */ C89143yG A01;
    public final /* synthetic */ C24111Gg A02;
    public final /* synthetic */ C1QW A03;

    public C89153yH(C89123yE c89123yE, C89143yG c89143yG, C24111Gg c24111Gg, C1QW c1qw) {
        this.A02 = c24111Gg;
        this.A03 = c1qw;
        this.A01 = c89143yG;
        this.A00 = c89123yE;
    }

    @Override // X.InterfaceC27201Tu
    public final void FAL(final C1Ef c1Ef) {
        this.A02.A01.ATO(new AbstractRunnableC14200nk() { // from class: X.51q
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(551);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C89153yH c89153yH = C89153yH.this;
                C1Ef c1Ef2 = c1Ef;
                C24111Gg c24111Gg = c89153yH.A02;
                synchronized (c24111Gg.A02) {
                    C89143yG c89143yG = c89153yH.A01;
                    c89143yG.A04.A01(c1Ef2);
                    LinkedList linkedList = c24111Gg.A03;
                    if (linkedList.remove(c89143yG)) {
                        linkedList.addFirst(c89143yG);
                    }
                    C89123yE c89123yE = c89153yH.A00;
                    if (c89123yE != null) {
                        C14360o3.A0B(c1Ef2, 2);
                        if (c1Ef2 == C1Ef.OnScreen) {
                            C24091Ge c24091Ge = c89123yE.A00;
                            synchronized (c24091Ge.A0H) {
                                c24091Ge.A03();
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC27201Tu
    public final void cancel() {
        this.A02.A01.ATO(new Rc2(this));
    }

    @Override // X.InterfaceC27201Tu
    public final int getRequestId() {
        return this.A03.A04;
    }
}
