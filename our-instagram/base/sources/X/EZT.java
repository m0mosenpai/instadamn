package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class EZT extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZT(Context context) {
        super(188, 5, false, false);
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62910SWr A00;
        C18720vz c18720vz = AbstractC12960li.A00;
        if (AbstractC31172DnG.A0q(c18720vz).getString("google_ad_id", null) == null && (A00 = C62910SWr.A00(this.A00)) != null) {
            if (A00.A02 != null) {
                C19740y2 A002 = AbstractC19730y1.A00(c18720vz);
                String str = A00.A02;
                InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A002);
                A0P.E7K("fb_attribution_id", str);
                A0P.apply();
            }
            if (A00.A01 != null) {
                AbstractC31176DnK.A1X(AbstractC19730y1.A00(c18720vz).A00, "google_ad_id", A00.A01);
            }
            C19740y2 A003 = AbstractC19730y1.A00(c18720vz);
            boolean z = A00.A03;
            InterfaceC19610xo A0P2 = AbstractC31171DnF.A0P(A003);
            A0P2.E77("opt_out_ads", z);
            A0P2.apply();
        }
    }
}
