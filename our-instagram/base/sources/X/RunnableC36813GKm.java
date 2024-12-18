package X;

import com.instagram.model.business.BusinessInfo;

/* renamed from: X.GKm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36813GKm implements Runnable {
    public final /* synthetic */ ELV A00;

    public RunnableC36813GKm(ELV elv) {
        this.A00 = elv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELV elv = this.A00;
        C35130FeX c35130FeX = new C35130FeX(elv.A06);
        c35130FeX.A0B = elv.A03.getEmail();
        c35130FeX.A01 = elv.A03.getSubmitPublicPhoneContact();
        BusinessInfo businessInfo = new BusinessInfo(c35130FeX);
        elv.A06 = businessInfo;
        FTV.A00(new C32548EUy(this, 13), elv.A05, elv, businessInfo);
    }
}
