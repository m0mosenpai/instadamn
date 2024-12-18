package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GOW implements Runnable {
    public final /* synthetic */ EU3 A00;
    public final /* synthetic */ User A01;

    public GOW(EU3 eu3, User user) {
        this.A00 = eu3;
        this.A01 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EU3 eu3 = this.A00;
        AbstractC59962oe abstractC59962oe = eu3.A02;
        String id = this.A01.getId();
        AbstractC35794FrW.A04(abstractC59962oe, eu3.A03, eu3.A06.A01(), null, C05F.A00, id);
    }
}
