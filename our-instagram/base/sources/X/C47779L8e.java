package X;

import android.os.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.CommandRangeData;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData;
import com.instagram.direct.armadilloexpress.transportpayload.Text;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.List;

/* renamed from: X.L8e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47779L8e {
    public final UserSession A00;
    public final C120025c0 A01;

    public C47779L8e(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C120025c0(userSession);
    }

    public final TransportPayload A00(CommonMediaTransport commonMediaTransport, DirectForwardingParams directForwardingParams, C29271b4 c29271b4) {
        int hashCode = ((C1OW) c29271b4).A05.hashCode();
        UserSession userSession = this.A00;
        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(userSession, hashCode);
        if (A00 != null) {
            A00.onLogCreateArmadilloExpressProtobufPayloadStart();
        }
        AbstractC09800fd.A01("SendTextMessageMutation-createPayload", 140056978);
        String str = c29271b4.A0L;
        C14360o3.A07(str);
        Boolean bool = c29271b4.A08;
        String str2 = c29271b4.A0J;
        L7G l7g = c29271b4.A02;
        List<C206179Ba> list = c29271b4.A0M;
        C47588Kzy c47588Kzy = c29271b4.A05;
        LGK lgk = LGK.A00;
        AbstractC60877RXa A0I = Text.DEFAULT_INSTANCE.A0I();
        Text text = (Text) AbstractC43592JPx.A0K(A0I);
        text.bitField0_ |= 1;
        text.text_ = str;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Text text2 = (Text) AbstractC43592JPx.A0K(A0I);
            text2.bitField0_ |= 2;
            text2.isSuggestedReply_ = booleanValue;
        }
        if (str2 != null) {
            Text text3 = (Text) AbstractC43592JPx.A0K(A0I);
            text3.bitField0_ |= 4;
            text3.postbackPayload_ = str2;
        }
        if (l7g != null) {
            AbstractC60877RXa A0I2 = PowerUpsData.DEFAULT_INSTANCE.A0I();
            int i = l7g.A00;
            PowerUpsData powerUpsData = (PowerUpsData) AbstractC43592JPx.A0K(A0I2);
            powerUpsData.bitField0_ |= 1;
            powerUpsData.style_ = i;
            if (commonMediaTransport != null) {
                PowerUpsData powerUpsData2 = (PowerUpsData) AbstractC43592JPx.A0K(A0I2);
                powerUpsData2.mediaAttachment_ = commonMediaTransport;
                powerUpsData2.bitField0_ |= 2;
            }
            Text text4 = (Text) AbstractC43592JPx.A0K(A0I);
            PowerUpsData powerUpsData3 = (PowerUpsData) A0I2.A02();
            powerUpsData3.getClass();
            text4.powerUpData_ = powerUpsData3;
            text4.bitField0_ |= 8;
        }
        if (list != null) {
            for (C206179Ba c206179Ba : list) {
                AbstractC60877RXa A0I3 = CommandRangeData.DEFAULT_INSTANCE.A0I();
                int i2 = c206179Ba.A03;
                CommandRangeData commandRangeData = (CommandRangeData) AbstractC43592JPx.A0K(A0I3);
                commandRangeData.bitField0_ |= 4;
                commandRangeData.type_ = i2;
                int i3 = c206179Ba.A01;
                CommandRangeData commandRangeData2 = (CommandRangeData) AbstractC43592JPx.A0K(A0I3);
                commandRangeData2.bitField0_ |= 2;
                commandRangeData2.length_ = i3;
                int i4 = c206179Ba.A02;
                CommandRangeData commandRangeData3 = (CommandRangeData) AbstractC43592JPx.A0K(A0I3);
                commandRangeData3.bitField0_ |= 1;
                commandRangeData3.offset_ = i4;
                Number number = (Number) c206179Ba.A04;
                if (number != null) {
                    String A0y = AbstractC43592JPx.A0y(number);
                    CommandRangeData commandRangeData4 = (CommandRangeData) AbstractC43592JPx.A0K(A0I3);
                    commandRangeData4.bitField0_ |= 8;
                    commandRangeData4.fbid_ = A0y;
                }
                Number number2 = (Number) c206179Ba.A05;
                if (number2 != null) {
                    String A0y2 = AbstractC43592JPx.A0y(number2);
                    CommandRangeData commandRangeData5 = (CommandRangeData) AbstractC43592JPx.A0K(A0I3);
                    commandRangeData5.bitField0_ |= 16;
                    commandRangeData5.userOrThreadFbid_ = A0y2;
                }
                Text text5 = (Text) AbstractC43592JPx.A0K(A0I);
                RYn A02 = A0I3.A02();
                A02.getClass();
                InterfaceC65691TsD interfaceC65691TsD = text5.commands_;
                if (!((TZ8) interfaceC65691TsD).A00) {
                    interfaceC65691TsD = RYn.A06(interfaceC65691TsD);
                    text5.commands_ = interfaceC65691TsD;
                }
                interfaceC65691TsD.add(A02);
            }
        }
        C45376K6j A002 = AddMessageContent.A00();
        JQ1.A0B(A002, A0I).addMessageContentCase_ = 1;
        TransportPayload A01 = lgk.A01(userSession, (AddMessageContent) AbstractC43592JPx.A0L(A002), directForwardingParams, c47588Kzy, c29271b4);
        AbstractC09800fd.A00(-626041622);
        if (A00 != null) {
            A00.onLogCreateArmadilloExpressProtobufPayloadEnd();
        }
        return A01;
    }

    public final void A01(DirectForwardingParams directForwardingParams, InterfaceC37261GbE interfaceC37261GbE, C29271b4 c29271b4) {
        int i;
        String str;
        CommonMediaTransport A03;
        String str2;
        String str3;
        InterfaceC37261GbE interfaceC37261GbE2 = interfaceC37261GbE;
        int hashCode = ((C1OW) c29271b4).A05.hashCode();
        UserSession userSession = this.A00;
        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(userSession, hashCode);
        if (A00 != null) {
            A00.onLogSendTextMessageMutationStart();
        }
        IGFOAMessagingSendToSentLogger A002 = C163307Sp.A00(userSession, ((C1OW) c29271b4).A05.hashCode());
        if (A002 != null) {
            A002.maybeAnnotateDiskIOBlocking();
        }
        IGFOAMessagingSendToSentLogger A003 = C163307Sp.A00(userSession, ((C1OW) c29271b4).A05.hashCode());
        if (A003 != null && (str3 = AbstractC46491Khp.A04) != null) {
            A003.annotatePreviousMutation(AbstractC46491Khp.A02, AbstractC46491Khp.A01, str3);
        }
        JTb A004 = this.A01.A00(c29271b4);
        if (A004.A02) {
            AbstractC09800fd.A01(AnonymousClass001.A0R("SendTextMessageMutation-", AbstractC46882KoP.A00(A004.A00)), -1501268745);
        } else {
            AbstractC09800fd.A01("SendTextMessageMutation", 1717246555);
        }
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36610468735162456L);
        if (A07 != 0) {
            i = Process.getThreadPriority(Process.myTid());
            Process.setThreadPriority(A07);
        } else {
            i = 0;
        }
        try {
            String A06 = c29271b4.A06();
            String str4 = ((C1OW) c29271b4).A05;
            C47618L1d A005 = AbstractC46894Kob.A00(userSession);
            java.util.Set set = A005.A01;
            if (set.contains(A06)) {
                A005.A00.markerPoint(20128010, A06.hashCode(), AnonymousClass001.A0R(AbstractC111324zv.A00(5146), "_end"));
            }
            if (set.contains(A06)) {
                A005.A00.markerPoint(20128010, A06.hashCode(), AnonymousClass001.A0R("queue_processing", "_start"));
            }
            AbstractC46927Kp8.A00(userSession).A04(null, 1252, str4);
            C47Z c47z = c29271b4.A07;
            C47Z c47z2 = null;
            if (c47z != null && (str2 = c47z.A35) != null) {
                c47z2 = AbstractC43593JPy.A0h(userSession, str2);
            }
            CommonMediaTransport commonMediaTransport = null;
            if (c47z2 != null && (str = c47z2.A2N) != null && (A03 = LLT.A03(str)) != null) {
                C45377K6k A006 = CommonMediaTransport.A00(A03);
                A006.A06("image/gif");
                commonMediaTransport = (CommonMediaTransport) A006.A02();
            }
            TransportPayload A007 = A00(commonMediaTransport, directForwardingParams, c29271b4);
            List C7R = c29271b4.C7R();
            C14360o3.A07(C7R);
            C14360o3.A07(AbstractC001800i.A0I(C7R));
            C47977LIp A008 = AbstractC46925Kp6.A00(userSession);
            DirectThreadKey directThreadKey = (DirectThreadKey) JQ1.A0H(c29271b4);
            if (c47z2 != null && commonMediaTransport != null) {
                interfaceC37261GbE2 = LCY.A01(userSession, commonMediaTransport, interfaceC37261GbE2, AbstractC47064KrL.A00(c47z2));
            }
            A008.A02(A007, interfaceC37261GbE2, c29271b4, directThreadKey, 0);
            if (A07 != 0) {
                Process.setThreadPriority(i);
            }
            AbstractC09800fd.A00(-389903747);
            if (A00 != null) {
                A00.onLogSendTextMessageMutationEnd();
            }
        } catch (Throwable th) {
            if (A07 != 0) {
                Process.setThreadPriority(i);
            }
            AbstractC09800fd.A00(380756623);
            throw th;
        }
    }
}
