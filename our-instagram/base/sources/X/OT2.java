package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes9.dex */
public final class OT2 {
    public final C18920wW A00;

    public static final C25531Mh A00(LiveUserPaySupportTier liveUserPaySupportTier, C56803PIu c56803PIu, OT2 ot2, String str, String str2, String str3, String str4, List list, long j) {
        Long l;
        Long l2;
        String str5;
        String pk;
        User user;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(ot2.A00, AbstractC111324zv.A00(4610)), 233);
        A0A.A0Q("a_pk", AbstractC25228BEl.A13(str2));
        A0A.A0l(str);
        A0A.A0R(AbstractC43591JPw.A00(92), str4);
        String str6 = null;
        if (c56803PIu != null && (user = c56803PIu.A08) != null) {
            l = AbstractC25231BEo.A0k(user);
        } else {
            l = null;
        }
        A0A.A0Q("ca_pk", l);
        if (c56803PIu != null && (pk = c56803PIu.getPk()) != null) {
            l2 = AbstractC166997dE.A0j(pk);
        } else {
            l2 = null;
        }
        A0A.A0Q("comment_id", l2);
        if (c56803PIu == null || (str5 = c56803PIu.A0D) == null) {
            str5 = "";
        }
        A0A.A0R("comment_text", str5);
        if (c56803PIu != null) {
            str6 = EnumC53264Nh2.A0A.A01;
        }
        A0A.A0R("comment_type", str6);
        A0A.A0Q(TraceFieldType.BroadcastId, AbstractC166997dE.A0j(str3));
        A0A.A0P("live_position", Double.valueOf(j));
        A0A.A0S("friend_chat_ids", list);
        if (liveUserPaySupportTier != null) {
            A0A.A0R("support_tier", liveUserPaySupportTier.toString());
        }
        return A0A;
    }

    public OT2(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
