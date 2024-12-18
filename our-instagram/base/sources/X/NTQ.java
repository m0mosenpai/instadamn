package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTQ extends AbstractC55206OeJ {
    public C51859Mw3 A00;
    public final Context A01;
    public final UserSession A02;
    public final OI6 A03;
    public final C55177Odh A04;
    public final PCG A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTQ(Context context, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PCG pcg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        super(AbstractC25225BEi.A1D(C51859Mw3.class));
        C14360o3.A0B(c55177Odh, 4);
        AbstractC167017dG.A1T(interfaceC16820sZ, oi6);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = pcg;
        this.A04 = c55177Odh;
        this.A08 = interfaceC16820sZ;
        this.A03 = oi6;
        this.A07 = interfaceC16820sZ2;
        this.A09 = interfaceC16820sZ3;
        this.A06 = C57543PgH.A01(this, 8);
        A0J(new C51903Mwl(false, false, false, false, false));
        this.A05.A00 = new OHN(this);
    }

    public static final boolean A00(NTQ ntq, float f) {
        if (C18U.A06(C06090Tz.A05, ntq.A02, 36314897675979678L) && f < 1.0d - MSW.A00(ntq.A06.getValue()) && MSZ.A08(ntq.A07) == MSZ.A08(ntq.A09)) {
            ntq.A04.A05(C56680PDy.A00);
            return true;
        }
        return false;
    }
}
