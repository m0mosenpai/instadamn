package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Dpd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31317Dpd implements InterfaceC41501vz {
    public final /* synthetic */ AbstractC31330Dpv A00;

    public C31317Dpd(AbstractC31330Dpv abstractC31330Dpv) {
        this.A00 = abstractC31330Dpv;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        InterfaceC83733oI A01;
        List list;
        int A03 = C0f9.A03(1858377627);
        C2Io c2Io = (C2Io) obj;
        int A0N = AbstractC167017dG.A0N(c2Io, 1186443538);
        AbstractC31330Dpv abstractC31330Dpv = this.A00;
        if (c2Io.A01 == C05F.A0M && (A01 = AbstractC31330Dpv.A01(c2Io, abstractC31330Dpv)) != null && (list = c2Io.A04) != null && AbstractC166987dD.A1b(list)) {
            LinkedList A02 = AbstractC31330Dpv.A02(abstractC31330Dpv, A01, list);
            if (AbstractC166987dD.A1b(A02)) {
                AbstractC31330Dpv.A06(abstractC31330Dpv, A01, A02);
            }
        }
        C0f9.A0A(1762026909, A0N);
        C0f9.A0A(939737613, A03);
    }
}
