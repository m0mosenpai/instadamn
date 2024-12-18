package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.litho.ComponentTree;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BTV extends AbstractC77583di {
    public final CQ3 A00;
    public final C139336So A01;
    public final C62862tP A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final C40971v4 A05;
    public final InterfaceC31041Dkf A06;
    public final String A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;

    public BTV(CQ3 cq3, C139336So c139336So, C62862tP c62862tP, UserSession userSession, C38321qM c38321qM, C40971v4 c40971v4, InterfaceC31041Dkf interfaceC31041Dkf, String str, Map map, boolean z, boolean z2) {
        AbstractC167007dF.A1G(c62862tP, 2, map);
        this.A03 = userSession;
        this.A02 = c62862tP;
        this.A05 = c40971v4;
        this.A07 = str;
        this.A08 = map;
        this.A06 = interfaceC31041Dkf;
        this.A00 = cq3;
        this.A0A = z;
        this.A01 = c139336So;
        this.A09 = z2;
        this.A04 = c38321qM;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C51532Yb A0j;
        C14360o3.A0B(c77993eR, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c77993eR, BWN.A00);
        C51762Yz A002 = AbstractC77073ct.A00(c77993eR, BWO.A00);
        C51762Yz A003 = AbstractC77073ct.A00(c77993eR, BWP.A00);
        AbstractC77313dH.A00(c77993eR, new MEB(42, A002, A003, this, c77993eR, A00), AbstractC25225BEi.A1b());
        if (C18U.A06(C06090Tz.A05, this.A03, 36326034525664847L)) {
            A0j = new C51532Yb(C77603dk.A00, C25616BUe.A00, 0, false);
        } else {
            A0j = AbstractC25230BEn.A0j(C29008Cqx.A00, false);
        }
        return AbstractC25234BEr.A08(c77993eR, A0j, new BU3((ComponentTree) A00.A03, this.A05, (AbstractC27447C9p) A002.A03), C25610BTx.A00, new C30184DRp(47, c77993eR, A003, this));
    }

    public static final Activity A03(Context context, BTV btv) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            C14360o3.A07(baseContext);
            return A03(baseContext, btv);
        }
        return null;
    }
}
