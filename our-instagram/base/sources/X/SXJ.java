package X;

import android.content.Context;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes10.dex */
public final class SXJ {
    public static final Integer A0B = C05F.A0C;
    public SCM A00;
    public List A01;
    public final Context A02;
    public final C58516Pwk A03;
    public final C100004eN A04;
    public final AbstractC128665rZ A05;
    public final UserSession A06;
    public final String A07;
    public final String A08;
    public final java.util.Set A09;
    public final InterfaceC09390do A0A;

    public SXJ(Context context, UserSession userSession) {
        String str;
        AbstractC167007dF.A1D(context, 1, userSession);
        this.A02 = context;
        this.A06 = userSession;
        this.A03 = new C58516Pwk(Float.valueOf(5000.0f), A0B, null, 50000L, 0.0f, 0.6666667f, 120000L, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, true, true, true);
        this.A0A = AbstractC09440dt.A00(EnumC09460dv.A02, new C37015GSu(this, 32));
        this.A09 = AbstractC31171DnF.A0l();
        this.A01 = C16930sl.A00;
        this.A07 = C16030qx.A02.A05(context);
        C19U A01 = C11830jh.A04.A01(userSession).A01(C19T.A1g);
        this.A08 = (A01 == null || (str = A01.A01) == null) ? "Not initiated" : str;
        this.A05 = C3VK.A00(context, userSession).A05();
        this.A04 = C100004eN.A00(context);
    }
}
