package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1lH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35351lH implements InterfaceC29301b7 {
    public static final C0KV A01 = C35361lI.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        EnumC46310Keg enumC46310Keg;
        Long C7O;
        C35331lF c35331lF = (C35331lF) c1ow;
        C14360o3.A0B(c35331lF, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        boolean z = c35331lF.A06;
        UserSession userSession = this.A00;
        if (z) {
            String str2 = c35331lF.A02;
            if (str2 != null) {
                String str3 = c35331lF.A03;
                if (str3 != null) {
                    int i = c35331lF.A00;
                    DirectThreadKey C7Q = c35331lF.C7Q();
                    boolean z2 = c35331lF.A05;
                    if (C7Q.A00 != null) {
                        C47977LIp A00 = AbstractC46925Kp6.A00(userSession);
                        String valueOf = String.valueOf(C7Q.A00);
                        C14360o3.A0B(valueOf, 3);
                        AbstractC60877RXa A0I = MediaInterventions.DEFAULT_INSTANCE.A0I();
                        A0I.A04();
                        MediaInterventions mediaInterventions = (MediaInterventions) A0I.A00;
                        mediaInterventions.bitField0_ |= 1;
                        mediaInterventions.mediaId_ = str3;
                        if (i != 0) {
                            if (i != 1) {
                                enumC46310Keg = EnumC46310Keg.UNSET;
                            } else {
                                enumC46310Keg = EnumC46310Keg.NUDE;
                            }
                        } else {
                            enumC46310Keg = EnumC46310Keg.NONE;
                        }
                        A0I.A04();
                        MediaInterventions mediaInterventions2 = (MediaInterventions) A0I.A00;
                        mediaInterventions2.interventionType_ = enumC46310Keg.A00;
                        mediaInterventions2.bitField0_ |= 2;
                        C45385K6s c45385K6s = (C45385K6s) SupplementMessagePayload.DEFAULT_INSTANCE.A0I();
                        c45385K6s.A09(str3);
                        c45385K6s.A07(str2);
                        C45370K6d c45370K6d = (C45370K6d) SupplementMessageContent.DEFAULT_INSTANCE.A0I();
                        c45370K6d.A04();
                        SupplementMessageContent supplementMessageContent = (SupplementMessageContent) c45370K6d.A00;
                        RYn A02 = A0I.A02();
                        A02.getClass();
                        supplementMessageContent.supplementMessageContent_ = A02;
                        supplementMessageContent.supplementMessageContentCase_ = 6;
                        c45385K6s.A06(c45370K6d);
                        c45385K6s.A04();
                        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) c45385K6s.A00;
                        supplementMessagePayload.bitField0_ |= 16;
                        supplementMessagePayload.targetWaThreadId_ = valueOf;
                        C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
                        c45383K6q.A07(c45385K6s);
                        if (z2) {
                            c45383K6q.A08(z2);
                        }
                        RYn A022 = c45383K6q.A02();
                        C14360o3.A07(A022);
                        TransportPayload transportPayload = (TransportPayload) A022;
                        C14360o3.A0B(transportPayload, 1);
                        UserSession userSession2 = A00.A00;
                        C81663kb A03 = C2DU.A03((C2DU) C2JD.A00(userSession2), C7Q);
                        if (A03 != null) {
                            if (A03.Ccj()) {
                                C7O = C17060sy.A01.A01(userSession2).BTC();
                            } else {
                                C7O = A03.C7O();
                            }
                            if (C7O != null && !C7O.equals(C2ED.A00)) {
                                LAA laa = A00.A03;
                                String A002 = laa.A00(((C1OW) c35331lF).A05);
                                if (A002 == null) {
                                    A002 = laa.A01(((C1OW) c35331lF).A05);
                                }
                                if (A002 == null && ((C1OW) c35331lF).A00 == 0 && C18U.A06(C06090Tz.A05, userSession2, 36323131128163348L)) {
                                    String str4 = ((C1OW) c35331lF).A05;
                                    List singletonList = Collections.singletonList(0L);
                                    C14360o3.A07(singletonList);
                                    A002 = laa.A02(str4, singletonList);
                                    List singletonList2 = Collections.singletonList(Long.valueOf(AbstractC46881KoO.A00(c35331lF)));
                                    C14360o3.A07(singletonList2);
                                    laa.A03(singletonList2, 7008, A002);
                                }
                                boolean z3 = true;
                                if (transportPayload.transportPayloadCase_ != 1) {
                                    z3 = false;
                                }
                                int A003 = C47977LIp.A00(A03, c35331lF, z3, transportPayload.openEb_);
                                String A012 = C47977LIp.A01(A03, c35331lF, A00);
                                A00.A02.A00(transportPayload, interfaceC37261GbE, c35331lF, A03.BKb(), A012, userSession2.userId, A002, C7O.longValue());
                                LCH.A00(userSession2, new ME7(48, interfaceC37261GbE, A00, c35331lF, transportPayload), new MIT(transportPayload, interfaceC37261GbE, c35331lF, A00, C7O, A012, A003));
                                return;
                            }
                        }
                        C0K8.A0C("ArmadilloExpressOutbox", "Is not selfThread or failed to get the thread");
                        A00.A02.A01(transportPayload, interfaceC37261GbE, C114675Fx.A0J, ((C1OW) c35331lF).A05);
                        return;
                    }
                    return;
                }
                str = "mediaId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "clientContext";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        DirectThreadKey C7Q2 = c35331lF.C7Q();
        String str5 = c35331lF.A04;
        if (str5 != null) {
            String str6 = c35331lF.A03;
            if (str6 != null) {
                Integer valueOf2 = Integer.valueOf(c35331lF.A00);
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A09(C05F.A01);
                c25621Ms.A0B(AbstractC13670mt.A06("direct_v2/threads/%s/items/%s/set_media_interventions/", C7Q2.A00, str5));
                c25621Ms.A0S(C40781ul.class, C55702hA.class);
                c25621Ms.A9s("media_id", str6);
                c25621Ms.A0D("media_intervention_type", valueOf2.intValue());
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            str = "mediaId";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "messageId";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35351lH(UserSession userSession) {
        this.A00 = userSession;
    }
}
