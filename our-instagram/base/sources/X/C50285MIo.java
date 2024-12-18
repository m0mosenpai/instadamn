package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MIo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50285MIo extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TransportPayload A02;
    public final /* synthetic */ C2EC A03;
    public final /* synthetic */ InterfaceC37261GbE A04;
    public final /* synthetic */ C1OW A05;
    public final /* synthetic */ C47977LIp A06;
    public final /* synthetic */ IGFOAMessagingSendToSentLogger A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ C15370ps A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ byte[] A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50285MIo(TransportPayload transportPayload, C2EC c2ec, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47977LIp c47977LIp, IGFOAMessagingSendToSentLogger iGFOAMessagingSendToSentLogger, Long l, String str, List list, C15370ps c15370ps, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A06 = c47977LIp;
        this.A0B = c15370ps;
        this.A07 = iGFOAMessagingSendToSentLogger;
        this.A05 = c1ow;
        this.A0F = z;
        this.A0C = z2;
        this.A09 = str;
        this.A0D = z3;
        this.A0A = list;
        this.A08 = l;
        this.A0H = bArr;
        this.A0G = z4;
        this.A0E = z5;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c2ec;
        this.A04 = interfaceC37261GbE;
        this.A02 = transportPayload;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceExecutorC135866Co A0C;
        MailboxFutureImpl A0I;
        MailboxCallback lv3;
        K3X k3x = (K3X) obj;
        C14360o3.A0B(k3x, 0);
        C47977LIp c47977LIp = this.A06;
        LAA laa = c47977LIp.A03;
        C15370ps c15370ps = this.A0B;
        laa.A03(null, 2010, (String) c15370ps.A00);
        IGFOAMessagingSendToSentLogger iGFOAMessagingSendToSentLogger = this.A07;
        if (iGFOAMessagingSendToSentLogger != null) {
            iGFOAMessagingSendToSentLogger.onLogMsysApiMainContextInvoked();
        }
        C1OW c1ow = this.A05;
        PlatformLogger.platformEventStructuredLoggerS2SEventMsysApiMainContextInvoked(c1ow.A05);
        PlatformLogger.platformEventStructuredLoggerInstamadilloAddIsVanishModeAnnotationWithAliasId(c1ow.A05, "is_vanish_mode", this.A0F);
        PlatformLogger.platformEventStructuredLoggerInstamadilloAddIsDisappearingModeAnnotationWithAliasId(c1ow.A05, "is_disappearing_mode", this.A0C);
        C47810L9s c47810L9s = c47977LIp.A02;
        String str = this.A09;
        c47810L9s.A02(str);
        AbstractC09800fd.A01("SendArmadilloExpressPayload-sendViaMEM", 319097164);
        Integer num = null;
        if (this.A0D) {
            List list = this.A0A;
            if (list != null) {
                Long BTC = C17060sy.A01.A01(c47977LIp.A00).BTC();
                if (BTC != null) {
                    ArrayList A0T = AbstractC001800i.A0T(BTC, list);
                    long longValue = this.A08.longValue();
                    byte[] bArr = this.A0H;
                    boolean z = this.A0G;
                    boolean z2 = this.A0E;
                    int i = this.A01;
                    if (iGFOAMessagingSendToSentLogger != null) {
                        num = iGFOAMessagingSendToSentLogger.getInstanceKey();
                    }
                    C48187LUl c48187LUl = new C48187LUl(1, c47977LIp, c15370ps, this.A02, this.A03, c1ow, this.A04);
                    A0C = AbstractC43593JPy.A0H(k3x);
                    A0I = AbstractC43593JPy.A0I(A0C, c48187LUl);
                    lv3 = new LV2(k3x, A0I, num, str, A0T, bArr, i, longValue, z, z2);
                } else {
                    throw AbstractC166987dD.A14("Viewer EIMU is empty for a group send.");
                }
            } else {
                throw AbstractC166987dD.A14("Recipient EIMUs are empty for a group send.");
            }
        } else {
            long longValue2 = this.A08.longValue();
            byte[] bArr2 = this.A0H;
            boolean z3 = this.A0G;
            boolean z4 = this.A0E;
            int i2 = this.A00;
            int i3 = this.A01;
            if (iGFOAMessagingSendToSentLogger != null) {
                num = iGFOAMessagingSendToSentLogger.getInstanceKey();
            }
            C48187LUl c48187LUl2 = new C48187LUl(2, c47977LIp, c15370ps, this.A02, this.A03, c1ow, this.A04);
            A0C = AbstractC43592JPx.A0C(k3x, 2);
            A0I = AbstractC43593JPy.A0I(A0C, c48187LUl2);
            lv3 = new LV3(k3x, A0I, num, str, bArr2, i2, i3, longValue2, z3, z4);
        }
        AbstractC25231BEo.A1C(A0C, lv3, A0I);
        C14360o3.A0A(A0I);
        AbstractC09800fd.A00(1521325755);
        UserSession userSession = c47977LIp.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36328993758920634L) && AbstractC28921aV.A00 != null) {
            C14120nc.A00().ATO(new KLO(userSession));
        }
        return C0eB.A00;
    }
}
