package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTR extends AbstractC55206OeJ {
    public Bitmap A00;
    public O5F A01;
    public String A02;
    public final Activity A03;
    public final Context A04;
    public final UserSession A05;
    public final OI6 A06;
    public final C55177Odh A07;
    public final OHO A08;
    public final PCP A09;
    public final InterfaceC09390do A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTR(Activity activity, Context context, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PCP pcp) {
        super(AbstractC25225BEi.A1D(C51872MwG.class));
        OHO oho = new OHO(oi6);
        AbstractC25229BEm.A1I(c55177Odh, 4, oi6);
        this.A03 = activity;
        this.A04 = context;
        this.A05 = userSession;
        this.A07 = c55177Odh;
        this.A09 = pcp;
        this.A06 = oi6;
        this.A08 = oho;
        this.A0A = C57543PgH.A01(this, 14);
        PCP pcp2 = this.A09;
        pcp2.A02 = new C56692PEk(this);
        pcp2.A01 = new C56690PEi(this);
    }

    public static final void A00(Bitmap bitmap, NTR ntr) {
        ntr.A0J(new C51892Mwa(bitmap, C05F.A0C, false, false));
        ntr.A01 = new O5F(ntr);
        boolean z = !C18U.A06(C06090Tz.A05, ntr.A05, 36310323535347728L);
        C1GJ.A06(new C121275eQ(new PUP(ntr.A04, bitmap, null, new OyT(bitmap, ntr, z), false, z), 473), 1601186431, 1, true, false);
    }
}
