package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OIy {
    public final Context A00;
    public final AbstractC10360h2 A01;
    public final UserSession A02;
    public final C38321qM A03;

    public final void A00(DialogInterface.OnDismissListener onDismissListener) {
        String str;
        Integer num;
        C25621Ms A0c = AbstractC167017dG.A0c(this.A02);
        boolean z = this instanceof NS1;
        C38321qM c38321qM = this.A03;
        Object[] A1b = MSY.A1b(c38321qM);
        if (z) {
            str = "media/%s/cancel_delete/";
        } else {
            str = "media/%s/hard_delete/";
        }
        A0c.A0B(AbstractC13670mt.A06(str, A1b));
        MSY.A1C(A0c, c38321qM);
        C1ON A0J = AbstractC31178DnM.A0J(A0c, C40781ul.class, C55702hA.class);
        AbstractC10360h2 abstractC10360h2 = this.A01;
        if (z) {
            num = C05F.A0C;
        } else {
            num = C05F.A00;
        }
        MWM.A00(A0J, new C54809OKh(onDismissListener, abstractC10360h2, num), this, 12);
        C1GJ.A03(A0J);
    }

    public OIy(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM) {
        this.A00 = context;
        this.A01 = abstractC10360h2;
        this.A03 = c38321qM;
        this.A02 = userSession;
    }
}
