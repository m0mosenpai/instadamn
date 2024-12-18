package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* loaded from: classes8.dex */
public final class LJg {
    public static final LJg A00 = new Object();

    public static final Long A00(byte[] bArr) {
        try {
            SupplementMessagePayload A0a = AbstractC43592JPx.A0a(LJ5.A00(bArr));
            if (!AbstractC167007dF.A1M(A0a.bitField0_ & 4)) {
                return null;
            }
            SupplementMessageContent supplementMessageContent = A0a.content_;
            if (supplementMessageContent == null) {
                supplementMessageContent = SupplementMessageContent.DEFAULT_INSTANCE;
            }
            C14360o3.A07(supplementMessageContent);
            if (supplementMessageContent.A0M().intValue() == 5 && AbstractC167007dF.A1M(A0a.bitField0_ & 16)) {
                return AbstractC37302Gc3.A0V(A0a.targetWaThreadId_);
            }
            return null;
        } catch (C46328Key e) {
            C0K8.A0F("ArmadilloExpressIncomingPayloadDispatcher", "Not able to create transport payload for incoming message", e);
            return null;
        }
    }

    public static final boolean A01(UserSession userSession, String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5) {
        AbstractC167007dF.A1I(userSession, 0, str);
        AbstractC09800fd.A01("ArmadilloExpressIncomingPayloadDispatcher.handleIncomingPayload", 92391767);
        try {
            M7M m7m = new M7M(userSession, str, str2, bArr, i, i2, i3, i4, j, j2, j3, j4, j5);
            if (C18U.A06(C06090Tz.A05, userSession, 36328693110423265L)) {
                C99Q.A01("handleIncomingPayload").execute(m7m);
            } else {
                m7m.run();
            }
            AbstractC09800fd.A00(-1230695516);
            return true;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-460471470);
            throw th;
        }
    }

    public final boolean A02(UserSession userSession, TransportEvent.Event event, String str, long j, long j2) {
        C81613kW c81613kW;
        AbstractC24481Hr kkc;
        TransportEvent.Event.DeviceChange deviceChange;
        TransportEvent.Event.DeviceChange deviceChange2;
        String str2 = str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(event, 4);
        AbstractC47002KqL.A00(userSession).A00(str2, AbstractC43594JPz.A10(2L), 7020, 0);
        if (str == null) {
            str2 = AbstractC43593JPy.A0w();
        }
        if (AbstractC43593JPy.A1Y(event.eventCase_)) {
            List A1Q = AbstractC16960so.A1Q(EnumC46311Keh.ADDED, EnumC46311Keh.REPLACED);
            if (event.eventCase_ == 1) {
                deviceChange = (TransportEvent.Event.DeviceChange) event.event_;
            } else {
                deviceChange = TransportEvent.Event.DeviceChange.DEFAULT_INSTANCE;
            }
            if (!A1Q.contains(deviceChange.A0L())) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("[broadcastIncomingPayload] Unsupported device admin message type, deviceChangeType: ");
                if (event.eventCase_ == 1) {
                    deviceChange2 = (TransportEvent.Event.DeviceChange) event.event_;
                } else {
                    deviceChange2 = TransportEvent.Event.DeviceChange.DEFAULT_INSTANCE;
                }
                C0K8.A0C("ArmadilloExpressIncomingPayloadDispatcher", AbstractC166997dE.A0v(deviceChange2.A0L(), A1C));
                AbstractC46903Kok.A00(userSession, str2, 5, 15, 0, -2, 0L, j, j, j2);
                return false;
            }
        }
        C81663kb B3V = C2JD.A00(userSession).B3V(j);
        if (B3V != null) {
            c81613kW = B3V.Aic();
        } else {
            c81613kW = null;
        }
        if (!C161867Mw.A02(c81613kW) && !C6X6.A0N(userSession, B3V)) {
            return false;
        }
        C47580Kzq c47580Kzq = (C47580Kzq) userSession.A01(C47580Kzq.class, new C37056GUm(userSession, 45));
        C14360o3.A0B(str2, 4);
        C48518LdG c48518LdG = c47580Kzq.A00;
        LAB lab = c48518LdG.A07;
        lab.A02(null, str2, "transport_event", true);
        C47913LEh c47913LEh = c48518LdG.A05;
        C2DS c2ds = c47913LEh.A01;
        if (!((C2DU) c2ds).A0H.A0F) {
            c2ds.CoS("RenderOperation");
            c47913LEh.A02.A00(str2, null, 413, 0);
        }
        C81663kb B3V2 = c2ds.B3V(j);
        if (B3V2 == null) {
            C47282Kut c47282Kut = new C47282Kut();
            c47913LEh.A00.A00(ThreadFetchReason.AE_MISSING_THREAD_AT_TRANSPORT_SYNC_OP_RENDERER, str2, new MIJ(c47282Kut, event, c47913LEh, str2, j, j2), 15, j, j);
            kkc = c47282Kut.A00;
        } else {
            List A002 = C47913LEh.A00(event, B3V2, c47913LEh, str2, j, j2);
            kkc = new KKC();
            kkc.A0A(A002);
        }
        LJA lja = lab.A01;
        lja.A03(str2, "render_start");
        kkc.A03(new C48529LdS(c48518LdG, str2, 1)).A03(new C48529LdS(c48518LdG, str2, 0));
        lja.A03(str2, "dispatch_end");
        if (event.eventCase_ == 1) {
            EnumC46311Keh A0L = ((TransportEvent.Event.DeviceChange) event.event_).A0L();
            C14360o3.A07(A0L);
            int ordinal = A0L.ordinal();
            if (ordinal != 1) {
                if (ordinal == 3) {
                    InterfaceC02590Ai A0I = JQ0.A0I(userSession);
                    A0I.AAP(CacheBehaviorLogger.SOURCE, "in_thread");
                    A0I.AAP("security_alert_action", "persist_key_changed");
                    AbstractC43594JPz.A1C(A0I, "admin_message_id", str2);
                }
            } else {
                InterfaceC02590Ai A0I2 = JQ0.A0I(userSession);
                A0I2.AAP(CacheBehaviorLogger.SOURCE, "in_thread");
                A0I2.AAP("security_alert_action", "persist_new_login");
                AbstractC43594JPz.A1C(A0I2, "admin_message_id", str2);
                return true;
            }
        }
        return true;
    }
}
