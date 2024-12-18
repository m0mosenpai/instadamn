package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Raven;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.msys.reverb.ReverbMessage;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class L9R {
    public final UserSession A00;

    public L9R(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C47880LDa.A00();
    }

    public final C09530e4 A00(C7OH c7oh, ReverbMessage reverbMessage, long j, boolean z) {
        AbstractC167007dF.A1E(reverbMessage, 0, c7oh);
        C09530e4 A01 = A01(c7oh, reverbMessage, j, z);
        C83403nh c83403nh = (C83403nh) A01.A00;
        Object obj = A01.A01;
        if (c83403nh != null) {
            Object supplementalKeys = reverbMessage.getSupplementalKeys();
            if (supplementalKeys instanceof ArrayList) {
                List list = (List) supplementalKeys;
                if (list.size() > 1) {
                    JUD.A01(11, list);
                }
                Iterator A13 = AbstractC166997dE.A13((AbstractCollection) supplementalKeys);
                while (A13.hasNext()) {
                    Object next = A13.next();
                    AbstractC25225BEi.A1S(next);
                    A02(c83403nh, c7oh, reverbMessage, (String) next);
                }
            }
        }
        return AbstractC166987dD.A1L(c83403nh, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C09530e4 A01(C7OH c7oh, ReverbMessage reverbMessage, long j, boolean z) {
        String str;
        LJ5 lj5;
        TransportPayload A00;
        int i;
        int i2;
        C45120Jxp c45120Jxp;
        String str2;
        Object obj;
        TransportEvent.Event event;
        C83403nh A01;
        EnumC46308Kee enumC46308Kee;
        TransportEvent.Event event2;
        C81613kW c81613kW;
        C14360o3.A0B(reverbMessage, 0);
        if (reverbMessage.getToplevelEvent() != null) {
            try {
                byte[] toplevelEvent = reverbMessage.getToplevelEvent();
                C14360o3.A07(toplevelEvent);
                try {
                    TransportEvent transportEvent = (TransportEvent) RYn.A04(TransportEvent.DEFAULT_INSTANCE, toplevelEvent);
                    int i3 = transportEvent.contentCase_;
                    if (AbstractC167007dF.A1P(i3, 2)) {
                        if (i3 == 2) {
                            event2 = (TransportEvent.Event) transportEvent.content_;
                        } else {
                            event2 = TransportEvent.Event.DEFAULT_INSTANCE;
                        }
                        int i4 = event2.eventCase_;
                        if (AbstractC43593JPy.A1Y(i4) || AbstractC167007dF.A1P(i4, 2)) {
                            UserSession userSession = this.A00;
                            C81663kb B3V = C2JD.A00(userSession).B3V(j);
                            if (B3V != null) {
                                c81613kW = B3V.Aic();
                            } else {
                                c81613kW = null;
                            }
                            if (!C161867Mw.A02(c81613kW) && !C6X6.A0N(userSession, B3V)) {
                                C0K8.A0C("ReverbMessageParser", "Security alart isn't enabled");
                                return new C09530e4(null, null);
                            }
                        }
                    }
                    try {
                        LGi lGi = LGi.A00;
                        UserSession userSession2 = this.A00;
                        String senderId = reverbMessage.getSenderId();
                        C14360o3.A07(senderId);
                        Long A0j = AbstractC166997dE.A0j(senderId);
                        String messageId = reverbMessage.getMessageId();
                        C14360o3.A07(messageId);
                        long A0L = AbstractC166987dD.A0L(reverbMessage.getTimestampInMs());
                        String str3 = c7oh.A00.A00;
                        String str4 = null;
                        if (C14360o3.A0K(AbstractC166987dD.A10(userSession2).BTC(), A0j)) {
                            str4 = userSession2.userId;
                        } else {
                            Iterator it = c7oh.A01.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (C14360o3.A0K(((User) obj).BTC(), A0j)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            User user = (User) obj;
                            if (user != null) {
                                str4 = user.getId();
                            }
                        }
                        if (str4 != null) {
                            if (str3 != null) {
                                String A04 = C4H6.A04(messageId, A0L);
                                L5O l5o = new L5O(null, true, C05F.A0j, A04, messageId, str3, str4, null, null, null, j, C4H6.A01(A04), false, false, false);
                                int i5 = transportEvent.contentCase_;
                                if (i5 == 1) {
                                    TransportEvent.Placeholder placeholder = (TransportEvent.Placeholder) transportEvent.content_;
                                    C14360o3.A07(placeholder);
                                    boolean z2 = true;
                                    if ((placeholder.bitField0_ & 1) == 0) {
                                        z2 = false;
                                    }
                                    int i6 = 0;
                                    if (z2) {
                                        int i7 = placeholder.type_;
                                        if (i7 != 1) {
                                            if (i7 == 2) {
                                                enumC46308Kee = EnumC46308Kee.UNAVAILABLE_MESSAGE;
                                            } else {
                                                enumC46308Kee = EnumC46308Kee.DECRYPTION_FAILURE;
                                            }
                                        } else {
                                            enumC46308Kee = EnumC46308Kee.DECRYPTION_FAILURE;
                                        }
                                        if (enumC46308Kee == EnumC46308Kee.DECRYPTION_FAILURE) {
                                            i6 = -1;
                                        } else if (enumC46308Kee == EnumC46308Kee.UNAVAILABLE_MESSAGE) {
                                            i6 = -3;
                                        }
                                    }
                                    A01 = lGi.A00(userSession2, l5o, i6);
                                } else {
                                    if (i5 != 2) {
                                        event = TransportEvent.Event.DEFAULT_INSTANCE;
                                    } else {
                                        event = (TransportEvent.Event) transportEvent.content_;
                                    }
                                    if (event.eventCase_ == 1) {
                                        TransportEvent.Event.DeviceChange deviceChange = (TransportEvent.Event.DeviceChange) event.event_;
                                        C14360o3.A07(deviceChange);
                                        A01 = lGi.A01(l5o, deviceChange);
                                    } else {
                                        throw new Exception("Unsupported transport event type, expected event or placeholder type");
                                    }
                                }
                                return AbstractC166987dD.A1L(A01, null);
                            }
                            C0w9.A03("ArmadilloExpressProtobufAdapter", "threadIgid is null");
                            C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve threadIgId");
                            throw new Exception("Not able to resolve threadIgId");
                        }
                        C0w9.A03("ArmadilloExpressProtobufAdapter", "senderIgid is null");
                        C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve senderIgid");
                        throw new Exception("Not able to resolve senderIgid");
                    } catch (C46327Kex e) {
                        C0K8.A0F("ReverbMessageParser", AnonymousClass001.A0r("Failed to parse transport payload (memThreadId: ", ", otid: ", reverbMessage.getMessageId(), j), e);
                        C0K8.A0E("ReverbMessageParser", "Failed to parse transport payload");
                        return AbstractC166987dD.A1L(null, e.getMessage());
                    }
                } catch (C4L5 e2) {
                    C0K8.A0H("ArmadilloExpressProtobufAdapter", "Unable to parse incoming transport event protobuf", e2);
                    throw new Exception("Transport event protobuf parsing failure");
                }
            } catch (C46328Key e3) {
                C0K8.A0F("ReverbMessageParser", AnonymousClass001.A0r("Failed to parse transport event (memThreadId: ", ", otid: ", reverbMessage.getMessageId(), j), e3);
                C0K8.A0J("ReverbMessageParser", "Failed to parse transport event", e3);
                return AbstractC166987dD.A1L(null, e3.getMessage());
            }
        }
        try {
            lj5 = LJ5.A00;
            byte[] toplevelPayload = reverbMessage.getToplevelPayload();
            C14360o3.A07(toplevelPayload);
            A00 = LJ5.A00(toplevelPayload);
            i = A00.transportPayloadCase_;
        } catch (C46328Key e4) {
            e = e4;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failed to parse transport payload (memThreadId: ");
            A1C.append(j);
            A1C.append(", otid: ");
            A1C.append(reverbMessage.getMessageId());
            A1C.append(", payloadVersion: ");
            A1C.append(reverbMessage.getToplevelPayloadVersion());
            C0K8.A0F("ReverbMessageParser", AbstractC167017dG.A0p(A1C), e);
        }
        if (!AbstractC167007dF.A1P(i, 3) && !AbstractC167007dF.A1P(i, 2)) {
            if (reverbMessage.getThreadTypeTag() == 2) {
                i2 = 2;
            } else {
                i2 = AbstractC167007dF.A1P(reverbMessage.getThreadTypeTag(), 1);
            }
            if (A00.transportPayloadCase_ == 1) {
                AddMessageContent addMessageContent = A00.A0L().content_;
                if (addMessageContent == null) {
                    addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
                }
                Raven A0M = addMessageContent.A0L().A0M();
                C14360o3.A07(A0M);
                EnumC46313Kej A0L2 = A0M.A0L();
                C14360o3.A07(A0L2);
                if (A0L2 == EnumC46313Kej.RAVEN_VIEW_MODEL_ONCE || A0L2 == EnumC46313Kej.RAVEN_VIEW_MODEL_REPLAYABLE) {
                    Object supplementalKeys = reverbMessage.getSupplementalKeys();
                    TransportPayload transportPayload = null;
                    if (supplementalKeys != null && (supplementalKeys instanceof ArrayList)) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj2 : (Iterable) supplementalKeys) {
                            if ((obj2 instanceof String) && (str2 = (String) obj2) != null && AbstractC001900j.A0a(str2, "content_view_seen:", false)) {
                                A1E.add(obj2);
                            }
                        }
                        byte[] payloadForSupplementalKey = reverbMessage.getPayloadForSupplementalKey(String.valueOf(AbstractC001800i.A0J(A1E)));
                        if (payloadForSupplementalKey != null) {
                            try {
                                transportPayload = LJ5.A00(payloadForSupplementalKey);
                            } catch (C46328Key e5) {
                                C0K8.A0F("ReverbMessageParser", "Skip rebuild of topLevelPayload for raven as supplementalTransportPayload is null", e5);
                            }
                        }
                    }
                    A00 = lj5.A01(transportPayload, A00);
                }
            }
            try {
                UserSession userSession3 = this.A00;
                String senderId2 = reverbMessage.getSenderId();
                C14360o3.A07(senderId2);
                Long A0j2 = AbstractC166997dE.A0j(senderId2);
                String messageId2 = reverbMessage.getMessageId();
                C14360o3.A07(messageId2);
                C83403nh A02 = lj5.A02(userSession3, A00, c7oh, C05F.A0j, A0j2, messageId2, null, i2, j, AbstractC166987dD.A0L(reverbMessage.getTimestampInMs()), z);
                C45120Jxp c45120Jxp2 = A02.A0D;
                if (c45120Jxp2 != null) {
                    c45120Jxp = new C45120Jxp((Boolean) c45120Jxp2.A03, (Boolean) c45120Jxp2.A02, true, c45120Jxp2.A06, reverbMessage.isFromEBServer());
                } else {
                    c45120Jxp = null;
                }
                A02.A0x(c45120Jxp);
                return AbstractC166987dD.A1L(A02, null);
            } catch (C46327Kex e6) {
                e = e6;
                C0K8.A0J("ReverbMessageParser", "Failed to create from reverb top level payload", e);
                str = e.getMessage();
                return AbstractC166987dD.A1L(null, str);
            }
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("create supplement/delete as toplevel, messageOtid=");
        A1C2.append(reverbMessage.getMessageId());
        A1C2.append(" isSupplement=");
        int i8 = A00.transportPayloadCase_;
        A1C2.append(AbstractC167007dF.A1P(i8, 3));
        A1C2.append(", isDelete=");
        A1C2.append(AbstractC167007dF.A1P(i8, 2));
        C0K8.A0C("ReverbMessageParser", A1C2.toString());
        AbstractC166987dD.A1T(C18950wb.A01, "use_suppliment_as_toplevel", 817895806);
        str = "Not a top level payload";
        return AbstractC166987dD.A1L(null, str);
    }

    public final void A02(C83403nh c83403nh, C7OH c7oh, ReverbMessage reverbMessage, String str) {
        AbstractC167007dF.A1E(c83403nh, 0, str);
        byte[] payloadForSupplementalKey = reverbMessage.getPayloadForSupplementalKey(str);
        if (payloadForSupplementalKey == null) {
            C0K8.A0D("ReverbMessageParser", "Supplemental payload is null");
            return;
        }
        try {
            LJ5 lj5 = LJ5.A00;
            TransportPayload A00 = LJ5.A00(payloadForSupplementalKey);
            lj5.A04(this.A00, AbstractC43592JPx.A0a(A00), c83403nh, c7oh, 1000 * reverbMessage.getTimestampInMsForSupplementalKey(str), AbstractC43592JPx.A05(reverbMessage.getSenderIdForSupplementalKey(str)));
        } catch (C46328Key e) {
            C0K8.A0F("ReverbMessageParser", "Cannot parse supplemental payload", e);
        }
    }
}
