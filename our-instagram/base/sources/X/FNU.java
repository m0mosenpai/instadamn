package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FNU {
    public String A00;
    public final Context A01;
    public final UserSession A02;
    public final EMX A03;
    public final C189478aR A04;
    public final C189458aP A05;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.EMX, androidx.fragment.app.Fragment, X.2oe] */
    public FNU(UserSession userSession, Context context, String str) {
        this.A02 = userSession;
        this.A01 = context;
        ViewOnClickListenerC35673Fp8 viewOnClickListenerC35673Fp8 = new ViewOnClickListenerC35673Fp8(context, new C54527O7e(this, AbstractC23021Ah.A00(userSession)), this, str, 5);
        C189458aP c189458aP = new C189458aP();
        c189458aP.A06 = context.getString(2131973280);
        c189458aP.A05 = viewOnClickListenerC35673Fp8;
        this.A05 = c189458aP;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A1O = true;
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A03 = 1.0f;
        AbstractC25226BEj.A1M(context, A0y, 2131968463);
        c189458aP.A0A = false;
        A0y.A07(c189458aP.A00());
        this.A04 = A0y.A00();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("consumer_id", str);
        ?? abstractC59962oe = new AbstractC59962oe();
        this.A03 = abstractC59962oe;
        abstractC59962oe.setArguments(A0b);
        abstractC59962oe.A01 = new FGJ(this);
    }
}
