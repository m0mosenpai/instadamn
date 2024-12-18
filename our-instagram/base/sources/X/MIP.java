package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIP extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        switch (this.A00) {
            case 0:
                boolean A1a = AbstractC166987dD.A1a(obj);
                Wap A0H = AbstractC43592JPx.A0H();
                UFX ufx = (UFX) this.A03;
                LoggingContext loggingContext = ufx.A1P;
                String str = this.A05;
                Long l = (Long) this.A01;
                EnumC72407Xcu enumC72407Xcu = (EnumC72407Xcu) this.A02;
                C70073W1q A05 = ufx.A1Q.A05();
                String str2 = this.A04;
                LinkedHashMap A0n = JQ0.A0n(A05, A1a);
                if (str2 != null) {
                    A0n.put("selected_credential_state", str2);
                }
                A0H.A0C(enumC72407Xcu, loggingContext, l, str, A0n);
                return C0eB.A00;
            case 1:
                C14360o3.A0B(obj, 0);
                ((InterfaceC16590sC) this.A02).invoke(obj, this.A05, this.A04, this.A01, this.A03);
                return C0eB.A00;
            case 2:
                C7IR c7ir = ((C7IT) this.A03).A05;
                List list = (List) this.A01;
                c7ir.A05((C26086BgF) this.A02, this.A05, this.A04, list);
                return C0eB.A00;
            case 3:
                boolean A1a2 = AbstractC166987dD.A1a(obj);
                C1W4 c1w4 = ((C1WB) this.A03).A04;
                C7T3 c7t3 = C7T3.A0O;
                String str3 = ((UserSession) this.A02).userId;
                RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) this.A01;
                String str4 = rtcCallConnectionEntity.A0J;
                String str5 = this.A05;
                String str6 = this.A04;
                String str7 = rtcCallConnectionEntity.A0H;
                if (A1a2) {
                    C14360o3.A0B(str3, 1);
                    num = C05F.A0j;
                } else {
                    C14360o3.A0B(str3, 1);
                    num = C05F.A0u;
                }
                C1W5.A00(C1W4.A01(c7t3, c1w4, num, str3, null, str7, str4, str5, str6, null), str3);
                return C0eB.A00;
            default:
                K3X k3x = (K3X) obj;
                C14360o3.A0B(k3x, 0);
                String str8 = this.A04;
                Long BTC = ((User) this.A02).BTC();
                if (BTC != null) {
                    long longValue = BTC.longValue();
                    List list2 = (List) this.A03;
                    String str9 = this.A05;
                    JVL jvl = new JVL(34, (InterfaceC16660sJ) this.A01);
                    InterfaceExecutorC135866Co A0H2 = AbstractC43593JPy.A0H(k3x);
                    MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H2, jvl);
                    AbstractC25231BEo.A1C(A0H2, new LUX(k3x, A0I, str8, str9, list2, longValue), A0I);
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIP(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A05 = str;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str2;
    }
}
