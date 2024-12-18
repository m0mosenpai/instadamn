package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.armadilloexpress.transportpayload.MediaReaction;
import com.instagram.direct.armadilloexpress.transportpayload.Reaction;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.1j7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34071j7 implements InterfaceC29301b7 {
    public static final C0KV A01 = C34081j8.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        Boolean bool;
        Long l;
        C34051j5 c34051j5 = (C34051j5) c1ow;
        C14360o3.A0B(c34051j5, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c34051j5.A00;
        if (directThreadKey != null) {
            L1W l1w = ((C1OW) c34051j5).A02.A00;
            if (l1w != null) {
                bool = Boolean.valueOf(AbstractC46831KnQ.A00(l1w));
            } else {
                bool = null;
            }
            if (AbstractC159387Cy.A02(userSession, directThreadKey, bool, C05F.A1F, false).A00()) {
                C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
                String str2 = c34051j5.A03;
                if (str2 == null) {
                    interfaceC37261GbE.DUq(new C114675Fx(null, EnumC46247KdO.A0B, "5", null, "ae", null, "Mutation message ID shouldn't be null when sending Media Reaction Mutation in Armadillo Express", null, new LinkedHashMap(), false, false, false, false, false, false), null);
                    C0K8.A0C("CollectionReactMutationProcessor", "Mutation message ID shouldn't be null when sending Media Reaction Mutation in Armadillo Express");
                    return;
                }
                FGR fgr = new FGR(userSession);
                UserSession userSession2 = fgr.A00;
                String A03 = c34051j5.A03();
                String str3 = c34051j5.A04;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = c34051j5.A05;
                if (str4 != null) {
                    AbstractC60877RXa A0I = Reaction.DEFAULT_INSTANCE.A0I();
                    A0I.A04();
                    Reaction reaction = (Reaction) A0I.A00;
                    str3.getClass();
                    reaction.bitField0_ |= 4;
                    reaction.emoji_ = str3;
                    A0I.A04();
                    Reaction reaction2 = (Reaction) A0I.A00;
                    reaction2.bitField0_ |= 1;
                    reaction2.reactionType_ = "reaction";
                    A0I.A04();
                    Reaction reaction3 = (Reaction) A0I.A00;
                    reaction3.bitField0_ |= 2;
                    reaction3.reactionStatus_ = str4;
                    AbstractC60877RXa A0I2 = MediaReaction.DEFAULT_INSTANCE.A0I();
                    A0I2.A04();
                    MediaReaction mediaReaction = (MediaReaction) A0I2.A00;
                    mediaReaction.bitField0_ |= 1;
                    mediaReaction.mediaId_ = A03;
                    A0I2.A04();
                    MediaReaction mediaReaction2 = (MediaReaction) A0I2.A00;
                    Reaction reaction4 = (Reaction) A0I.A02();
                    reaction4.getClass();
                    mediaReaction2.reaction_ = reaction4;
                    mediaReaction2.bitField0_ |= 2;
                    long currentTimeMillis = System.currentTimeMillis();
                    User A02 = AnonymousClass189.A00(userSession2).A02(userSession2.userId);
                    if (A02 != null) {
                        l = A02.BTC();
                    } else {
                        l = null;
                    }
                    C45385K6s c45385K6s = (C45385K6s) SupplementMessagePayload.DEFAULT_INSTANCE.A0I();
                    c45385K6s.A07(str2);
                    C45370K6d c45370K6d = (C45370K6d) SupplementMessageContent.DEFAULT_INSTANCE.A0I();
                    c45370K6d.A04();
                    SupplementMessageContent supplementMessageContent = (SupplementMessageContent) c45370K6d.A00;
                    RYn A022 = A0I2.A02();
                    A022.getClass();
                    supplementMessageContent.supplementMessageContent_ = A022;
                    supplementMessageContent.supplementMessageContentCase_ = 4;
                    c45385K6s.A06(c45370K6d);
                    if (l != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(l);
                        sb.append(':');
                        sb.append(currentTimeMillis);
                        c45385K6s.A09(sb.toString());
                    }
                    c45385K6s.A08(String.valueOf(C4H6.A00(A03)));
                    C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
                    c45383K6q.A07(c45385K6s);
                    RYn A023 = c45383K6q.A02();
                    C14360o3.A07(A023);
                    AbstractC46925Kp6.A00(userSession2).A03((TransportPayload) A023, new G5Z(fgr, c34051j5, c31281Dp3), c34051j5, c34051j5.C7Q(), 11, true, false);
                    return;
                }
            } else {
                C32226EDz A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                DirectThreadKey C7Q = c34051j5.C7Q();
                String str5 = c34051j5.A02;
                if (str5 != null) {
                    String str6 = c34051j5.A05;
                    if (str6 != null) {
                        String A032 = c34051j5.A03();
                        String str7 = c34051j5.A04;
                        C25621Ms c25621Ms = new C25621Ms(userSession);
                        c25621Ms.A05();
                        c25621Ms.A0B("direct_v2/collection_item/broadcast/reaction/");
                        c25621Ms.A9s("collection_type", str5);
                        c25621Ms.A9s("reaction_status", str6);
                        c25621Ms.A9s("collection_item_id", A032);
                        c25621Ms.A9s("reaction_emoji", str7);
                        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7Q.A00);
                        c25621Ms.A0S(C40781ul.class, C55702hA.class);
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = A00;
                        C1GJ.A03(A0N);
                        return;
                    }
                } else {
                    str = "collectionType";
                }
            }
            str = "reactionStatus";
        } else {
            str = "key";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C34071j7(UserSession userSession) {
        this.A00 = userSession;
    }
}
