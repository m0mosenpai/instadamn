package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GOV implements Runnable {
    public final /* synthetic */ C33086Eij A00;
    public final /* synthetic */ User A01;

    public GOV(C33086Eij c33086Eij, User user) {
        this.A00 = c33086Eij;
        this.A01 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33086Eij c33086Eij = this.A00;
        C006802i c006802i = c33086Eij.A03;
        c006802i.markerPoint(4197923, "navigate_to_next_screen");
        AbstractC59962oe abstractC59962oe = c33086Eij.A01;
        String id = this.A01.getId();
        AbstractC35794FrW.A04(abstractC59962oe, c33086Eij.A02, c33086Eij.A07, c33086Eij.A06.A02(), C05F.A00, id);
        c006802i.markerEnd(4197923, (short) 2);
    }
}
