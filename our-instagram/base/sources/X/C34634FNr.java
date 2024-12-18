package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34634FNr {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final InterfaceC169517hR A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public /* synthetic */ C34634FNr(Context context, UserSession userSession) {
        C1GK A00 = AbstractC202778xv.A00();
        boolean A1a = AbstractC31175DnJ.A1a(A00);
        this.A01 = userSession;
        C169127gl A002 = AbstractC31674Dvf.A00(context, userSession, A00, "reshare", null, A1a, A1a, false);
        this.A03 = A002;
        this.A04 = AbstractC09440dt.A01(new C37056GUm(this, 48));
        InterfaceC14020nS A003 = C14120nc.A00();
        C14360o3.A07(A003);
        this.A02 = A003;
        this.A05 = AbstractC09440dt.A01(C37042GTy.A00);
        this.A06 = AbstractC09440dt.A01(new C37056GUm(this, 49));
        A002.EYJ(new C36680GFa(this));
    }
}
