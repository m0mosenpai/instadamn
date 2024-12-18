package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class G1U implements InterfaceC37220GaV {
    public final Context A00;
    public final UserSession A01;
    public final C2EE A02;
    public final C19L A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final C05A A06 = AbstractC25225BEi.A1H(EnumC33328EoN.A02);

    public final int A00() {
        C2EE c2ee = this.A02;
        if (c2ee != null) {
            return c2ee.AdZ();
        }
        return 0;
    }

    public final String A01() {
        C2EE c2ee = this.A02;
        if (c2ee != null) {
            return c2ee.C7I();
        }
        return null;
    }

    public final String A02() {
        C2EE c2ee = this.A02;
        if (c2ee != null) {
            return c2ee.C7q();
        }
        return null;
    }

    public final void A03(EnumC33328EoN enumC33328EoN) {
        AbstractC166987dD.A1Z(new MCE(this, enumC33328EoN, null, 43), this.A03);
    }

    public final void A04(AbstractC33531Es5 abstractC33531Es5) {
        GSS.A02(abstractC33531Es5, this, this.A03, 2);
    }

    public final void A05(InterfaceC37159GYw interfaceC37159GYw) {
        String str;
        if (this instanceof C32696EaN) {
            C32696EaN c32696EaN = (C32696EaN) this;
            C2DS c2ds = (C2DS) c32696EaN.A02.getValue();
            C2EE c2ee = ((G1U) c32696EaN).A02;
            String str2 = null;
            if (c2ee != null) {
                str = c2ee.C7I();
                str2 = c2ee.C7q();
            } else {
                str = null;
            }
            new C32827EcV(c32696EaN.A00, ((G1U) c32696EaN).A01, c32696EaN.A01).A07(new C36382G3i(), interfaceC37159GYw, C2DU.A04((C2DU) c2ds, str, str2), null, false);
            return;
        }
        interfaceC37159GYw.onFailure();
    }

    public G1U(Context context, UserSession userSession, C2EE c2ee) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c2ee;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A04 = c24721Ip;
        this.A05 = AbstractC07080Za.A03(c24721Ip);
        this.A03 = AnonymousClass194.A02(C12L.A00.A04);
    }
}
