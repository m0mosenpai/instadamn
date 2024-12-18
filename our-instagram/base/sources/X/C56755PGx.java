package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PGx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56755PGx implements InterfaceC57996Png {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ OIB A02;
    public final /* synthetic */ InterfaceC57997Pnh A03;

    public C56755PGx(Context context, UserSession userSession, OIB oib, InterfaceC57997Pnh interfaceC57997Pnh) {
        this.A02 = oib;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = interfaceC57997Pnh;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.OMq, java.lang.Object] */
    @Override // X.InterfaceC57996Png
    public final /* bridge */ /* synthetic */ void Dd7(Object obj) {
        Integer num;
        EnumC53196Nfs enumC53196Nfs;
        InterfaceC58276PsU interfaceC58276PsU = (InterfaceC58276PsU) obj;
        C14360o3.A0B(interfaceC58276PsU, 0);
        OIB oib = this.A02;
        C54845OMq c54845OMq = oib.A00;
        C54845OMq c54845OMq2 = c54845OMq;
        if (c54845OMq == null) {
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            C55054Oa5.A00 = AbstractC166997dE.A0c(c06090Tz, userSession, 36316220529774759L);
            C55054Oa5.A00(false);
            C55054Oa5.A02 = C18U.A04(c06090Tz, userSession, 36879170483060989L);
            C55054Oa5.A01 = C18U.A04(c06090Tz, userSession, 36879170483126526L);
            C55054Oa5.A03 = C18U.A04(c06090Tz, userSession, 36879170483257599L);
            Context context = this.A00;
            interfaceC58276PsU.ES6(context.getApplicationContext());
            interfaceC58276PsU.EcS(true);
            interfaceC58276PsU.EPm(1);
            N19 n19 = new N19(userSession);
            interfaceC58276PsU.EQK(n19);
            interfaceC58276PsU.Egq(n19.A02());
            String A04 = C18U.A04(c06090Tz, userSession, 36879170480046326L);
            if (A04.equals("TCP")) {
                num = C05F.A00;
            } else if (A04.equals("BLE")) {
                num = C05F.A01;
            } else if (A04.equals("BTC")) {
                num = C05F.A0C;
            } else if (A04.equals("LINK_SWITCH")) {
                num = C05F.A0N;
            } else if (A04.equals("MWA_BTC")) {
                num = C05F.A0Y;
            } else {
                throw AbstractC166987dD.A12(A04);
            }
            interfaceC58276PsU.Ef1(num);
            interfaceC58276PsU.EfH(AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504780176L));
            int i = R.drawable.notification_icon;
            int A0H = AbstractC53242c7.A0H(context, R.attr.defaultNotificationIcon);
            if (A0H != 0) {
                i = A0H;
            }
            interfaceC58276PsU.EZh(Integer.valueOf(i));
            interfaceC58276PsU.EV8(C18U.A06(c06090Tz, userSession, 36316220529578150L));
            interfaceC58276PsU.ERd(C18U.A06(c06090Tz, userSession, 36316220529905832L));
            interfaceC58276PsU.EbG(C18U.A06(c06090Tz, userSession, 2342159229743141029L));
            interfaceC58276PsU.EX2(C18U.A00(c06090Tz, userSession, 37160645459640450L));
            interfaceC58276PsU.EYl(AbstractC25225BEi.A07(c06090Tz, userSession, 36597695506746264L));
            if (C18U.A06(c06090Tz, userSession, 2342159229740847261L)) {
                OUM oum = new OUM(C18U.A01(c06090Tz, userSession, 36597695505107859L), C18U.A01(c06090Tz, userSession, 36597695505173396L));
                interfaceC58276PsU.EX3(oum);
                C51712Msh A02 = n19.A02();
                long A01 = C18U.A01(c06090Tz, userSession, 36597695503928201L);
                double A00 = C18U.A00(c06090Tz, userSession, 37160645457608830L);
                int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504124811L);
                int A072 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504059274L);
                int A073 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504911249L);
                String A042 = C18U.A04(c06090Tz, userSession, 36879170480963834L);
                String A043 = C18U.A04(c06090Tz, userSession, 36879170480701689L);
                double A002 = C18U.A00(c06090Tz, userSession, 37160645458657408L);
                int A074 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695505304469L);
                interfaceC58276PsU.EPK(new C54995OUe(A02, oum, A042, A043, C57603PhF.A00, A00, A002, C18U.A00(c06090Tz, userSession, 37160645458854017L), A07, A072, A073, A074, AbstractC25225BEi.A07(c06090Tz, userSession, 36597695505370006L), A01));
            }
            AbstractC53602Nn9.A00 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504649102L);
            AbstractC53602Nn9.A01 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504714639L);
            AbstractC53595Nn2.A00 = C18U.A06(c06090Tz, userSession, 36316220529971369L);
            C18U.A04(c06090Tz, userSession, 36879170480242935L);
            C18U.A04(c06090Tz, userSession, 36879170480308472L);
            AbstractC53605NnC.A01 = C18U.A00(c06090Tz, userSession, 37160645457150076L);
            AbstractC53605NnC.A00 = C18U.A00(c06090Tz, userSession, 37160645457215613L);
            AbstractC53605NnC.A02 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504386956L);
            AbstractC53605NnC.A03 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597695504452493L);
            interfaceC58276PsU.ETq(new LI7(C18U.A01(c06090Tz, userSession, 36607767200470675L), C18U.A01(c06090Tz, userSession, 36607767200536212L), C18U.A01(c06090Tz, userSession, 36607767200601749L), C18U.A06(c06090Tz, userSession, 36326292223702840L), AbstractC25225BEi.A07(c06090Tz, userSession, 36607767200667286L)));
            Integer num2 = C05F.A00;
            int i2 = 1;
            if (AbstractC54272Nys.A00(userSession)) {
                i2 = 2;
            }
            if (C18U.A06(c06090Tz, userSession, 36311594845602433L)) {
                enumC53196Nfs = EnumC53196Nfs.A03;
            } else {
                enumC53196Nfs = EnumC53196Nfs.A04;
            }
            if (enumC53196Nfs.ordinal() != 0) {
                num2 = C05F.A01;
            }
            interfaceC58276PsU.EPy(new C51664Mrv(num2, num2, AbstractC25225BEi.A07(c06090Tz, userSession, 36593069822509993L), AbstractC25225BEi.A07(c06090Tz, userSession, 36593069822575530L) * i2, i2));
            boolean A1X = AbstractC167007dF.A1X(n19.A04(), num2);
            ?? obj2 = new Object();
            obj2.A0B = interfaceC58276PsU;
            obj2.A0L = A1X;
            obj2.A0K = true;
            AbstractC53596Nn3.A00 = obj2;
            obj2.A05 = 720;
            obj2.A04 = 1280;
            obj2.A0E = new C55790Opz(obj2);
            C55789Opy c55789Opy = new C55789Opy();
            obj2.A0C = c55789Opy;
            obj2.A0D = c55789Opy;
            obj2.A0F = new C55793Oq3();
            oib.A00 = obj2;
            c54845OMq2 = obj2;
        }
        this.A03.Dd6(c54845OMq2);
    }
}
