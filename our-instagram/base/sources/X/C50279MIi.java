package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.Reaction;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MIi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50279MIi extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50279MIi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i, long j) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A01 = j;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A08 = str;
        this.A07 = str2;
        this.A02 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0Zx] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ?? r1;
        Object obj2;
        Reaction reaction;
        Reaction reaction2;
        String str;
        switch (this.A00) {
            case 0:
                C25531Mh c25531Mh = (C25531Mh) obj;
                ?? c0Zx = new C0Zx();
                LoggingContext loggingContext = (LoggingContext) this.A06;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                C0Zx c0Zx2 = new C0Zx();
                c0Zx2.A05("credential_id", Long.valueOf(this.A01));
                JQ1.A0e(c0Zx2, c0Zx, this.A04);
                List list = (List) this.A03;
                if (list != null) {
                    r1 = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), r1);
                    }
                } else {
                    r1 = C16930sl.A00;
                }
                c0Zx.A07("container_ids", r1);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1N(c0Zx, this.A08);
                c0Zx.A06(TraceFieldType.FailureReason, this.A07);
                c0Zx.A07("applied_discounts", (List) this.A02);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A05);
                return c25531Mh;
            case 1:
                C09530e4 c09530e4 = (C09530e4) obj;
                C14360o3.A0B(c09530e4, 0);
                C83403nh c83403nh = (C83403nh) c09530e4.A00;
                String str2 = (String) c09530e4.A01;
                if (c83403nh != null) {
                    C47911LEf.A00(c83403nh, this.A07, String.valueOf(((L5O) this.A04).A00), null);
                    AbstractC25225BEi.A1U(this.A02, c83403nh);
                } else {
                    String A0g = AnonymousClass001.A0g("Target message is not in cache, reverb fetch failed with ", str2, " or it's not the last message in thread. ");
                    C47911LEf c47911LEf = (C47911LEf) this.A06;
                    TransportPayload transportPayload = (TransportPayload) this.A05;
                    L5O l5o = (L5O) this.A04;
                    C2ED c2ed = (C2ED) this.A03;
                    String str3 = this.A07;
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                    SupplementMessagePayload A0a = AbstractC43592JPx.A0a(transportPayload);
                    String str4 = A0a.targetMessageWaServerTimeSec_;
                    C14360o3.A07(str4);
                    SupplementMessageContent supplementMessageContent = A0a.content_;
                    if (supplementMessageContent == null) {
                        supplementMessageContent = SupplementMessageContent.DEFAULT_INSTANCE;
                    }
                    if (supplementMessageContent.supplementMessageContentCase_ == 1 && str4.length() != 0) {
                        String A04 = C4H6.A04(str3, Long.parseLong(str4));
                        UserSession userSession = c47911LEf.A00;
                        String str5 = c2ed.BKb().A00;
                        if (str5 != null) {
                            C1ON A0D = DirectThreadApi.A0D(userSession, str5, null, AbstractC166987dD.A1J(A04), AbstractC166987dD.A1J(str3));
                            A0D.A00 = new ETS(l5o, c47911LEf, interfaceC16660sJ, A0g, str3, 1);
                            C1GJ.A02(A0D);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        JQ0.A1Q(String.valueOf(l5o.A00), str3, AnonymousClass001.A0R(A0g, "Supplemental is not qualified for EB fetch."));
                        interfaceC16660sJ.invoke(null);
                    }
                }
                return C0eB.A00;
            default:
                C83403nh c83403nh2 = (C83403nh) obj;
                ArrayList A1E = AbstractC166987dD.A1E();
                if (c83403nh2 != null && c83403nh2.A0h() != null) {
                    C47970LIe c47970LIe = (C47970LIe) this.A06;
                    LAB lab = c47970LIe.A04;
                    String str6 = this.A08;
                    lab.A01.A03(str6, "build_end");
                    L5O l5o2 = (L5O) this.A03;
                    String str7 = l5o2.A07;
                    c83403nh2.A1h = str7;
                    C2EC c2ec = (C2EC) this.A02;
                    A1E.add(C47970LIe.A01(c83403nh2, c2ec, c47970LIe));
                    TransportPayload transportPayload2 = (TransportPayload) this.A05;
                    String str8 = c47970LIe.A00.userId;
                    String str9 = c83403nh2.A1u;
                    C14360o3.A07(str9);
                    String str10 = l5o2.A0A;
                    boolean A1R = AbstractC167007dF.A1R(0, transportPayload2, str8);
                    if (AbstractC43594JPz.A0S(transportPayload2).supplementMessageContentCase_ == A1R && str8.equals(str9) && !str8.equals(str10)) {
                        String str11 = this.A07;
                        Iterator it2 = c47970LIe.A03.Ab7(c2ec.BKb(), false).iterator();
                        while (true) {
                            String str12 = null;
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                C83403nh c83403nh3 = (C83403nh) obj2;
                                if (c83403nh3.A10 == C2EY.A0G) {
                                    C83553nw c83553nw = c83403nh3.A0N;
                                    if (c83553nw != null) {
                                        str12 = c83553nw.A05;
                                    }
                                    if (C14360o3.A0K(str12, str11) && C14360o3.A0K(c83403nh3.A1u, str10)) {
                                    }
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        C83403nh c83403nh4 = (C83403nh) obj2;
                        if (c83403nh4 != null) {
                            String A0h = c83403nh4.A0h();
                            String A0g2 = c83403nh4.A0g();
                            if (A0g2 != null) {
                                A1E.add(new C45985KWz(c2ec, A0h, A0g2, str10));
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        SupplementMessageContent A0S = AbstractC43594JPz.A0S(transportPayload2);
                        if (A0S.supplementMessageContentCase_ == A1R) {
                            reaction = (Reaction) A0S.supplementMessageContent_;
                        } else {
                            reaction = Reaction.DEFAULT_INSTANCE;
                        }
                        if (C14360o3.A0K(reaction.reactionStatus_, "created")) {
                            long j = this.A01;
                            C83403nh c83403nh5 = new C83403nh();
                            c83403nh5.A0a = null;
                            String A042 = C4H6.A04(str6, j);
                            long A01 = C4H6.A01(A042);
                            long j2 = l5o2.A00;
                            LGi.A00.A02(new L5O(null, l5o2.A03, l5o2.A04, A042, str6, l5o2.A0B, str10, null, str7, null, j2, A01, false, false, false), c83403nh5);
                            C16930sl c16930sl = C16930sl.A00;
                            C83553nw c83553nw2 = new C83553nw(null, "", null, c16930sl, c16930sl, AbstractC166987dD.A1J(new C9CN()), A1R);
                            SupplementMessageContent A0S2 = AbstractC43594JPz.A0S(transportPayload2);
                            if (A0S2.supplementMessageContentCase_ == A1R) {
                                reaction2 = (Reaction) A0S2.supplementMessageContent_;
                            } else {
                                reaction2 = Reaction.DEFAULT_INSTANCE;
                            }
                            if ((reaction2.bitField0_ & 4) != 0) {
                                str = reaction2.emoji_;
                            } else {
                                str = null;
                            }
                            c83553nw2.A04 = str;
                            c83553nw2.A05 = AbstractC46714KlX.A00(transportPayload2);
                            c83403nh5.A1T = c83553nw2;
                            c83403nh5.A0N = c83553nw2;
                            c83403nh5.A10 = C2EY.A0G;
                            if (c83403nh5.A2D != A1R) {
                                c83403nh5.A2D = A1R;
                                c83403nh5.A2C = A1R;
                            }
                            A1E.add(0, C47970LIe.A01(c83403nh5, c2ec, c47970LIe));
                        }
                    }
                } else {
                    C47970LIe c47970LIe2 = (C47970LIe) this.A06;
                    LAB lab2 = c47970LIe2.A04;
                    String str13 = this.A08;
                    LJA lja = lab2.A01;
                    lja.A03(str13, "build_failed");
                    lja.A07(str13, (short) 3);
                    C0K8.A0C("ArmadilloExpressMessageProcessor", "Message not found in reverb for upsert message payload");
                    c47970LIe2.A06.A07(((L5O) this.A03).A07, str13, "Message not found in reverb for upsert message payload", true);
                    L8o l8o = c47970LIe2.A05;
                    l8o.A00(str13, null, 7035, 6);
                    l8o.A01(str13, false);
                    A1E.add(new KX0("Message not found in reverb for upsert message payload"));
                }
                ((C47282Kut) this.A04).A00.A0A(A1E);
                return C0eB.A00;
        }
    }
}
