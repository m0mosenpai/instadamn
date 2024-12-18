package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.Reaction;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.1ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31411ek implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1el
        @Override // X.C0KV
        public final Object AXR(UserSession userSession) {
            return new C31411ek(userSession);
        }
    };
    public final UserSession A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, X.L7F] */
    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String obj;
        Integer num;
        String str;
        Long l;
        C31391ei c31391ei = (C31391ei) c1ow;
        DirectThreadKey directThreadKey = c31391ei.A02;
        C47948LGd c47948LGd = c31391ei.A01;
        String str2 = ((C1OW) c31391ei).A05;
        JTa jTa = ((C1OW) c31391ei).A02;
        boolean z = jTa.A09;
        String str3 = jTa.A04;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        if (c31391ei.A00.A00()) {
            num = C05F.A01;
            FGS fgs = (FGS) this.A01.getValue();
            C14360o3.A0B(c19260xA, 1);
            String str4 = c31391ei.A01.A06;
            if (str4 == null) {
                str4 = ((C1OW) c31391ei).A05;
            }
            UserSession userSession = fgs.A00;
            C47977LIp A00 = AbstractC46925Kp6.A00(userSession);
            DirectThreadKey directThreadKey2 = c31391ei.A02;
            C14360o3.A07(directThreadKey2);
            C36427G5c c36427G5c = new C36427G5c(fgs, c31391ei, c31281Dp3, num, str4);
            C47948LGd c47948LGd2 = c31391ei.A01;
            String str5 = c47948LGd2.A01;
            if (str5 == null) {
                if (C14360o3.A0K(c47948LGd2.A05, "double_tap")) {
                    str5 = AbstractC47991LKc.A00(userSession, 0);
                } else {
                    str5 = "❤";
                }
            }
            ImmutableList immutableList = C83863oV.A07;
            if (str5.equals("❤")) {
                str = "like";
            } else {
                str = "reaction";
            }
            AbstractC60877RXa A0I = Reaction.DEFAULT_INSTANCE.A0I();
            A0I.A04();
            Reaction reaction = (Reaction) A0I.A00;
            reaction.bitField0_ |= 4;
            reaction.emoji_ = str5;
            A0I.A04();
            Reaction reaction2 = (Reaction) A0I.A00;
            reaction2.bitField0_ |= 1;
            reaction2.reactionType_ = str;
            String str6 = c31391ei.A01.A07;
            if (str6 != null) {
                A0I.A04();
                Reaction reaction3 = (Reaction) A0I.A00;
                reaction3.bitField0_ |= 2;
                reaction3.reactionStatus_ = str6;
                String str7 = c31391ei.A01.A08;
                if (str7 != null) {
                    A0I.A04();
                    Reaction reaction4 = (Reaction) A0I.A00;
                    reaction4.bitField0_ |= 8;
                    reaction4.superReactType_ = str7;
                }
                User A022 = AnonymousClass189.A00(userSession).A02(userSession.userId);
                if (A022 != null) {
                    l = A022.BTC();
                } else {
                    l = null;
                }
                C47948LGd c47948LGd3 = c31391ei.A01;
                String str8 = c47948LGd3.A04;
                if (str8 == null) {
                    str8 = C4H6.A03(c47948LGd3.A02);
                }
                C45385K6s c45385K6s = (C45385K6s) SupplementMessagePayload.DEFAULT_INSTANCE.A0I();
                if (str8 != null) {
                    c45385K6s.A07(str8);
                    C45370K6d c45370K6d = (C45370K6d) SupplementMessageContent.DEFAULT_INSTANCE.A0I();
                    c45370K6d.A04();
                    SupplementMessageContent supplementMessageContent = (SupplementMessageContent) c45370K6d.A00;
                    RYn A023 = A0I.A02();
                    A023.getClass();
                    supplementMessageContent.supplementMessageContent_ = A023;
                    supplementMessageContent.supplementMessageContentCase_ = 1;
                    c45385K6s.A06(c45370K6d);
                    if (l != null) {
                        c45385K6s.A09(String.valueOf(l));
                    }
                    String str9 = c31391ei.A03;
                    C14360o3.A07(str9);
                    c45385K6s.A08(String.valueOf(C4H6.A00(str9)));
                    C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
                    c45383K6q.A07(c45385K6s);
                    if (c31391ei.A00 == EnumC159397Cz.A05) {
                        c45383K6q.A08(true);
                    }
                    RYn A024 = c45383K6q.A02();
                    C14360o3.A07(A024);
                    A00.A03((TransportPayload) A024, c36427G5c, c31391ei, directThreadKey2, 11, true, false);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (directThreadKey.A00 != null) {
                UserSession userSession2 = this.A00;
                C14360o3.A0B(userSession2, 0);
                if (RealtimeClientManager.getInstance(userSession2).isMqttConnected() && C18U.A06(C06090Tz.A05, userSession2, 2342172033036664793L)) {
                    String str10 = directThreadKey.A00;
                    boolean z2 = c31391ei.A06;
                    C14360o3.A0B(str10, 1);
                    C14360o3.A0B(c47948LGd, 3);
                    AbstractC47886LDg.A00(userSession2, new LGH(null, null, c47948LGd, C2EY.A0m, null, null, null, null, null, null, null, null, null, null, null, AbstractC11060iN.A00(userSession2).BdA(), str10, "send_item", null, null, null, str2, null, str2, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, z2), c31281Dp3);
                    num = C05F.A01;
                }
            }
            UserSession userSession3 = this.A00;
            L1W l1w = ((C1OW) c31391ei).A02.A00;
            boolean z3 = c31391ei.A06;
            C25621Ms c25621Ms = new C25621Ms(userSession3);
            c25621Ms.A09(C05F.A01);
            c25621Ms.A0B(new StringBuilder(AnonymousClass001.A0g("direct_v2/threads/broadcast/", C2EY.A0m.A00, "/")).toString());
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, str2, str2, str3, z, z3, false);
            c25621Ms.A9s("item_type", "reaction");
            c25621Ms.A9s("reaction_type", c47948LGd.A09);
            c25621Ms.A9s("reaction_status", c47948LGd.A07);
            c25621Ms.A9s("node_type", "item");
            c25621Ms.A9s("item_id", c47948LGd.A02);
            c25621Ms.A9s("emoji", c47948LGd.A01);
            c25621Ms.A9s("super_react_type", c47948LGd.A08);
            String str11 = c47948LGd.A03;
            String str12 = null;
            if (str11 != null) {
                C2EY A002 = C2EY.A0A.A00(str11);
                AbstractC34147F4x abstractC34147F4x = AbstractC34147F4x.$redex_init_class;
                int ordinal = A002.ordinal();
                if (ordinal != 4) {
                    if (ordinal == 14) {
                        str12 = "voice_media";
                    }
                } else {
                    str12 = "raven_media";
                }
            }
            c25621Ms.A0H("target_item_type", str12);
            c25621Ms.A0H("original_message_client_context", c47948LGd.A04);
            c25621Ms.A0H("reaction_action_source", c47948LGd.A05);
            L7F l7f = c47948LGd.A00;
            if (l7f != null) {
                try {
                    String str13 = l7f.A00;
                    String str14 = l7f.A01;
                    ?? obj2 = new Object();
                    obj2.A00 = str13;
                    obj2.A01 = str14;
                    obj2.A02 = null;
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    LC7.A00(A0A, obj2);
                    A0A.close();
                    obj = stringWriter.toString();
                } catch (IOException unused) {
                }
                c25621Ms.A0H("avatar_reaction", obj);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = new EE4(userSession3, c31281Dp3);
                C1GJ.A03(A0N);
                num = C05F.A00;
            }
            obj = null;
            c25621Ms.A0H("avatar_reaction", obj);
            C1ON A0N2 = c25621Ms.A0N();
            A0N2.A00 = new EE4(userSession3, c31281Dp3);
            C1GJ.A03(A0N2);
            num = C05F.A00;
        }
        C162337Ov.A0Y(c19260xA, num);
    }

    public C31411ek(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.GRb
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new FGS(UserSession.this);
            }
        });
    }
}
