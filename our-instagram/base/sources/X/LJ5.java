package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.OriginalTransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LJ5 {
    public static final LJ5 A00 = new Object();

    /* JADX WARN: Type inference failed for: r1v23, types: [X.1rF, X.1rE, java.lang.Object] */
    public final C83403nh A02(UserSession userSession, TransportPayload transportPayload, C7OH c7oh, Integer num, Long l, String str, String str2, int i, long j, long j2, boolean z) {
        Object obj;
        EnumC46242KdI enumC46242KdI;
        C83403nh c83403nh;
        Map A0K;
        ImmutableMap A0K2;
        Object obj2;
        ExtendedImageUrl extendedImageUrl;
        C14360o3.A0B(transportPayload, 5);
        DirectThreadKey directThreadKey = c7oh.A00;
        String str3 = directThreadKey.A00;
        String str4 = null;
        if (C14360o3.A0K(AbstractC166987dD.A10(userSession).BTC(), l)) {
            str4 = userSession.userId;
        } else {
            Iterator it = c7oh.A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((User) obj).BTC(), l)) {
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
                if (i != 1) {
                    if (i != 2) {
                        enumC46242KdI = EnumC46242KdI.A06;
                    } else {
                        enumC46242KdI = EnumC46242KdI.A04;
                    }
                } else {
                    enumC46242KdI = EnumC46242KdI.A05;
                }
                L5O A002 = AbstractC46710KlT.A00(transportPayload, enumC46242KdI, num, str2, null, str, str4, str3, j2, j);
                if (A002 != null) {
                    AnonymousClass442 anonymousClass442 = null;
                    String str5 = A002.A09;
                    if (str5 != null) {
                        String str6 = A002.A08;
                        if (C18U.A06(C06090Tz.A05, userSession, 2342161871148948144L)) {
                            c83403nh = C2JD.A00(userSession).BSh(directThreadKey, str5);
                        } else {
                            c83403nh = null;
                        }
                        if (c83403nh == null) {
                            String A03 = C4H6.A03(str5);
                            if (A03 == null) {
                                A03 = "0";
                            }
                            anonymousClass442 = new AnonymousClass442(new LF6(C2EY.A1O, null, new AnonymousClass570(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT), str5, str6, A03, "0", "replyActionSource", null, true));
                        } else {
                            Object A01 = AbstractC1586079v.A01(c83403nh, str6);
                            if (!c83403nh.A1d()) {
                                if (TimeUnit.MILLISECONDS.toDays(AbstractC37300Gc1.A00(TimeUnit.MICROSECONDS.toMillis(c83403nh.C8i()))) < 1) {
                                    if (c83403nh.A10 == C2EY.A1C && (A01 instanceof C38321qM)) {
                                        C38321qM c38321qM = (C38321qM) A01;
                                        if (c38321qM.BRp() == EnumC40111tc.A0Q) {
                                            ImageInfo A1t = c38321qM.A1t();
                                            obj2 = c38321qM;
                                            if (A1t != null) {
                                                List<ExtendedImageUrl> AlQ = A1t.AlQ();
                                                obj2 = c38321qM;
                                                if (AlQ != null) {
                                                    ArrayList A0q = AbstractC167017dG.A0q(AlQ);
                                                    for (ExtendedImageUrl extendedImageUrl2 : AlQ) {
                                                        A0q.add(new ExtendedImageUrl(LLT.A07(extendedImageUrl2.A0A), extendedImageUrl2.getWidth(), extendedImageUrl2.getHeight()));
                                                    }
                                                    obj2 = c38321qM;
                                                    if (!A0q.isEmpty()) {
                                                        IMD AKm = A1t.AKm();
                                                        AKm.A03 = A0q;
                                                        ImageInfo A003 = AKm.A00();
                                                        ?? obj3 = new Object();
                                                        obj3.EW3(A003);
                                                        obj2 = new C38321qM(new C37761pD(null), obj3);
                                                    }
                                                }
                                            }
                                            A01 = obj2;
                                        }
                                    }
                                    if (c83403nh.A10 == C2EY.A0z && (A01 instanceof List)) {
                                        List list = (List) A01;
                                        ArrayList A1E = AbstractC166987dD.A1E();
                                        for (Object obj4 : list) {
                                            if (obj4 instanceof C910143t) {
                                                C910143t c910143t = (C910143t) obj4;
                                                if (c910143t.A02 == 9) {
                                                    String str7 = c910143t.A0w;
                                                    if (str7 != null) {
                                                        EnumC910243u enumC910243u = c910143t.A0Q;
                                                        ExtendedImageUrl extendedImageUrl3 = c910143t.A0X;
                                                        if (extendedImageUrl3 != null) {
                                                            String str8 = extendedImageUrl3.A0A;
                                                            C14360o3.A07(str8);
                                                            extendedImageUrl = new ExtendedImageUrl(LLT.A07(str8), extendedImageUrl3.getWidth(), extendedImageUrl3.getHeight());
                                                        } else {
                                                            extendedImageUrl = null;
                                                        }
                                                        long j3 = c910143t.A0D;
                                                        GifUrlImpl gifUrlImpl = c910143t.A0Z;
                                                        GifUrlImpl gifUrlImpl2 = null;
                                                        if (gifUrlImpl != null) {
                                                            gifUrlImpl2 = gifUrlImpl;
                                                        }
                                                        A1E.add(new C910143t(extendedImageUrl, enumC910243u, gifUrlImpl2, str7, c910143t.A08, c910143t.A02, j3, c910143t.A0K, c910143t.A04()));
                                                    } else {
                                                        throw AbstractC166997dE.A0g();
                                                    }
                                                }
                                            }
                                            A1E.clear();
                                        }
                                        boolean isEmpty = A1E.isEmpty();
                                        obj2 = A1E;
                                        if (isEmpty) {
                                            obj2 = list;
                                        }
                                        A01 = obj2;
                                    }
                                }
                            }
                            if (str6 != null && (A0K2 = c83403nh.A0K()) != null) {
                                A0K = AbstractC166987dD.A1I();
                                Iterator it2 = A0K2.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry A1K = AbstractC166987dD.A1K(it2);
                                    if (C14360o3.A0K(A1K.getKey(), str6)) {
                                        AbstractC31177DnL.A1S(A1K, A0K);
                                    }
                                }
                            } else {
                                A0K = c83403nh.A0K();
                            }
                            String A0i = c83403nh.A0i();
                            String A0g = c83403nh.A0g();
                            if (A0g == null) {
                                A0g = "0";
                            }
                            LF6 lf6 = new LF6(c83403nh.A10, c83403nh.A0z, A01, A0i, str6, A0g, c83403nh.A1u, "replyActionSource", c83403nh.A1q, true);
                            lf6.A0I = A0K;
                            lf6.A07 = c83403nh.A0l;
                            anonymousClass442 = new AnonymousClass442(lf6);
                        }
                    }
                    C83403nh c83403nh2 = new C83403nh();
                    c83403nh2.A0a = anonymousClass442;
                    synchronized (c83403nh2) {
                        if (c83403nh2.A2Q != z) {
                            c83403nh2.A2C = true;
                            c83403nh2.A2Q = z;
                        }
                    }
                    LGi.A00.A02(A002, c83403nh2);
                    if (transportPayload.transportPayloadCase_ == 1) {
                        AddMessageContent addMessageContent = transportPayload.A0L().content_;
                        if (addMessageContent == null) {
                            addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
                        }
                        C14360o3.A07(addMessageContent);
                        boolean z2 = false;
                        for (InterfaceC50453MPh interfaceC50453MPh : AbstractC47152Ksn.A00) {
                            if (interfaceC50453MPh.FDU(addMessageContent)) {
                                interfaceC50453MPh.A8H(userSession, A002, addMessageContent, c83403nh2, c7oh);
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            c83403nh2.A18(C2EY.A1O, new AnonymousClass570("need_update"));
                        }
                        c83403nh2.A0N(userSession, null);
                    }
                    if (transportPayload.transportPayloadCase_ == 2 && !c83403nh2.A2D) {
                        c83403nh2.A2D = true;
                        c83403nh2.A2C = true;
                    }
                    return c83403nh2;
                }
                C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve message metadata");
                throw new Exception("Not able to resolve message metadata");
            }
            C0w9.A03("ArmadilloExpressProtobufAdapter", "threadIgid is null");
            C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve threadIgId");
            throw new Exception("Not able to resolve threadIgId");
        }
        C0w9.A03("ArmadilloExpressProtobufAdapter", "senderIgid is null");
        C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve senderIgid");
        throw new Exception("Not able to resolve senderIgid");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.MYx] */
    /* JADX WARN: Type inference failed for: r3v30, types: [com.instagram.direct.model.DirectMessageEditHistory, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.instagram.common.session.UserSession r14, com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r15, X.C83403nh r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ5.A05(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload, X.3nh, java.lang.String, long):void");
    }

    public static final TransportPayload A00(byte[] bArr) {
        try {
            return (TransportPayload) RYn.A04(TransportPayload.DEFAULT_INSTANCE, bArr);
        } catch (C4L5 e) {
            C0K8.A0H("ArmadilloExpressProtobufAdapter", AnonymousClass001.A0L("Unable to parse incoming protobuf (json: ", ')', AbstractC001900j.A0W(new String(bArr, C15W.A05), '{')), e);
            throw new Exception("Protobuf parsing failure");
        }
    }

    public final TransportPayload A01(TransportPayload transportPayload, TransportPayload transportPayload2) {
        if (transportPayload != null) {
            SupplementMessageContent A0S = AbstractC43594JPz.A0S(transportPayload);
            C14360o3.A07(A0S);
            if (A0S.supplementMessageContentCase_ == 5) {
                byte[] A05 = ((OriginalTransportPayload) A0S.supplementMessageContent_).originalTransportPayload_.A05();
                try {
                    C14360o3.A0A(A05);
                    transportPayload2 = A00(A05);
                    return transportPayload2;
                } catch (C46328Key e) {
                    C0K8.A0H("ArmadilloExpressProtobufAdapter", "Parse originalTransportPayload failed. Use topLevelTransportPayload", e);
                    return transportPayload2;
                }
            }
        }
        return transportPayload2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09530e4 A03(com.instagram.common.session.UserSession r32, X.MRE r33, X.C7OH r34, long r35) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ5.A03(com.instagram.common.session.UserSession, X.MRE, X.7OH, long):X.0e4");
    }

    public final void A04(UserSession userSession, SupplementMessagePayload supplementMessagePayload, C83403nh c83403nh, C7OH c7oh, long j, long j2) {
        Object obj;
        String id;
        Long BTC = AbstractC166987dD.A10(userSession).BTC();
        if (BTC != null && BTC.longValue() == j2) {
            id = userSession.userId;
        } else {
            Iterator it = c7oh.A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Long BTC2 = ((User) obj).BTC();
                    if (BTC2 != null && BTC2.longValue() == j2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                id = user.getId();
            }
            C0w9.A03("ArmadilloExpressProtobufAdapter", "senderIgId is null");
            C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to get the senderIgId");
        }
        if (id != null) {
            A05(userSession, supplementMessagePayload, c83403nh, id, j);
            return;
        }
        C0w9.A03("ArmadilloExpressProtobufAdapter", "senderIgId is null");
        C0K8.A0C("ArmadilloExpressProtobufAdapter", "Not able to get the senderIgId");
    }
}
