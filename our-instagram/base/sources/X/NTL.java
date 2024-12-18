package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTL extends AbstractC55206OeJ {
    public C51877MwL A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final UserSession A04;
    public final OI6 A05;
    public final C55177Odh A06;
    public final PCF A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC16820sZ A0F;
    public final InterfaceC16820sZ A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTL(Activity activity, Context context, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PCF pcf, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(AbstractC25225BEi.A1D(C51877MwL.class));
        AbstractC167017dG.A1S(c55177Odh, oi6);
        AbstractC167007dF.A1I(interfaceC16820sZ, 7, interfaceC16820sZ2);
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = context;
        this.A06 = c55177Odh;
        this.A05 = oi6;
        this.A07 = pcf;
        this.A0F = interfaceC16820sZ;
        this.A0G = interfaceC16820sZ2;
        this.A0C = C57553PgR.A01(this, 26);
        this.A0E = C57553PgR.A01(this, 28);
        this.A09 = C57553PgR.A01(this, 23);
        this.A08 = C57553PgR.A01(this, 22);
        this.A0D = C57553PgR.A01(this, 27);
        this.A0A = C57553PgR.A01(this, 24);
        this.A0B = AbstractC09440dt.A00(EnumC09460dv.A02, new C57553PgR(this, 25));
        this.A07.A02 = new OKJ(this);
    }
}
