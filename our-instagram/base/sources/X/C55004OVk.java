package X;

import android.content.Context;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.instagram.common.session.UserSession;

/* renamed from: X.OVk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55004OVk {
    public static final C7T3 A03 = C7T3.A0E;
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C55004OVk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        AnonymousClass957.A00();
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A01 = C57549PgN.A00(this, enumC09460dv, 5);
        this.A02 = C57549PgN.A00(this, enumC09460dv, 6);
    }

    public final void A00(Context context) {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327357376444959L)) {
            ((C55747OpG) userSession.A01(C55747OpG.class, C57548PgM.A01(userSession, 26))).getValues();
        }
        if (((C54776OIp) this.A01.getValue()).A00()) {
            synchronized (PregenerateSdpWrapper.A01) {
                if (!PregenerateSdpWrapper.A02) {
                    OXE.A00.A00("PregenerateSdpWrapper", AnonymousClass001.A0R("Initialized PregenerateSdp class: ", PregenerateSdp.Companion.toString()));
                    PregenerateSdpWrapper.A02 = true;
                }
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36327357376248348L)) {
            MWJ.A00(AbstractC25225BEi.A0F(userSession), userSession).A00();
        }
        if (C18U.A06(c06090Tz, userSession, 36327357376313885L)) {
            C73254Xys.A00(context, AbstractC43592JPx.A0N(), AbstractC54148Nwk.A00(userSession));
        }
    }
}
