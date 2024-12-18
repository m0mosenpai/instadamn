package X;

import android.widget.RatingBar;

/* renamed from: X.OlO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55530OlO implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ RatingBar A00;
    public final /* synthetic */ PCR A01;

    public C55530OlO(RatingBar ratingBar, PCR pcr) {
        this.A01 = pcr;
        this.A00 = ratingBar;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        PCR pcr = this.A01;
        int i = (int) f;
        NTS nts = pcr.A03().A00;
        C55177Odh c55177Odh = nts.A08;
        c55177Odh.A03(new PFM(i, 0L));
        if (i <= 1 || (i == 2 && Math.random() < 0.6d)) {
            C55177Odh.A00(c55177Odh, C56669PDn.class);
            if (nts.A01 == null) {
                C14360o3.A0F("endStateModel");
                throw C00O.createAndThrow();
            }
            c55177Odh.A05(new C51908Mwq(!r0.A09));
        } else {
            c55177Odh.A06(C56669PDn.A00, nts.A00);
        }
        RatingBar ratingBar2 = this.A00;
        ratingBar2.setIsIndicator(true);
        PCR.A00(ratingBar2);
        MSW.A0D(pcr.A0L).setText(2131954551);
    }
}
