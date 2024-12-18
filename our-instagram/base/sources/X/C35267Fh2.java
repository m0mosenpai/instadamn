package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Fh2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35267Fh2 {
    public String A00;
    public final C18920wW A01;
    public final String A02;
    public final UserSession A03;

    public C35267Fh2(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = userSession.userId;
        this.A01 = AbstractC12220kQ.A02(userSession);
    }

    public final void A0B(DirectShareTarget directShareTarget, String str, String str2, int i) {
        C14360o3.A0B(directShareTarget, 0);
        String A01 = A01(directShareTarget);
        if (A01 != null) {
            A06(this, AbstractC31171DnF.A0V(i), directShareTarget.A08(), A01, "inbox", str, A03(this, directShareTarget), str2.equals("inbox_channel_invitation"));
        }
    }

    public static InterfaceC02590Ai A00(C35267Fh2 c35267Fh2) {
        C18920wW c18920wW = c35267Fh2.A01;
        return c18920wW.A00(c18920wW.A00, "igd_channels_client_actions");
    }

    public static final String A01(DirectShareTarget directShareTarget) {
        int i = directShareTarget.A01;
        if (i != 28) {
            if (i != 29) {
                if (i != 32) {
                    if (i != 61) {
                        if (i != 62) {
                            return null;
                        }
                        return "social";
                    }
                    return "subscriber_social";
                }
                return "social";
            }
            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
            if (creatorBroadcastThreadInfo != null && creatorBroadcastThreadInfo.A00 == 2) {
                return "subscriber_broadcast";
            }
            return "broadcast";
        }
        return "subscriber_social";
    }

    public static final String A02(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 29) {
                return "broadcast";
            }
            if (intValue != 32 && intValue != 62) {
                if (intValue == 28 || intValue == 61) {
                    return "subscriber_social";
                }
                return null;
            }
            return "social";
        }
        return null;
    }

    public static final HashMap A03(C35267Fh2 c35267Fh2, DirectShareTarget directShareTarget) {
        String str;
        if (directShareTarget.A01 != 29) {
            return null;
        }
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
        if (creatorBroadcastThreadInfo != null) {
            str = creatorBroadcastThreadInfo.A03;
        } else {
            str = null;
        }
        User A0k = AbstractC31174DnI.A0k(c35267Fh2.A03, str);
        if (A0k == null) {
            return null;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("is_follower", AbstractC31172DnG.A0z(A0k.A26() ? 1 : 0));
        return A1G;
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai, C35267Fh2 c35267Fh2) {
        interfaceC02590Ai.AAP("user_igid", c35267Fh2.A02);
    }

    public static final void A05(C35267Fh2 c35267Fh2, Long l, String str, String str2, String str3, String str4, Map map, boolean z) {
        String str5;
        String str6;
        InterfaceC02590Ai A00 = A00(c35267Fh2);
        if (A00.isSampled()) {
            A04(A00, c35267Fh2);
            if (z) {
                str5 = "channel_invitation_clicked";
            } else {
                str5 = "channel_suggestion_clicked";
            }
            AbstractC31171DnF.A1B(A00, str5);
            AbstractC31171DnF.A1E(A00, str3);
            if (z) {
                str6 = "channel_invite_item";
            } else {
                str6 = "channel_suggestion_item";
            }
            AbstractC25232BEp.A1K(A00, str6);
            AbstractC31173DnH.A1L(A00, c35267Fh2.A00);
            A00.A9K("suggestion_position", l);
            A00.AAP("ig_thread_id", str);
            A00.AAP("channel_type", str2);
            A00.AAP("ranking_request_id", str4);
            if (map != null) {
                A00.A9M("extra", map);
            }
            A00.Cht();
        }
    }

    public static final void A06(C35267Fh2 c35267Fh2, Long l, String str, String str2, String str3, String str4, Map map, boolean z) {
        String str5;
        String str6;
        InterfaceC02590Ai A00 = A00(c35267Fh2);
        if (A00.isSampled()) {
            A04(A00, c35267Fh2);
            if (z) {
                str5 = "channel_invitation_impression";
            } else {
                str5 = "channel_suggestion_impression";
            }
            AbstractC31171DnF.A1B(A00, str5);
            AbstractC31171DnF.A1E(A00, str3);
            if (z) {
                str6 = "channel_invite_item";
            } else {
                str6 = "channel_suggestion_item";
            }
            AbstractC31177DnL.A1F(A00, str6);
            AbstractC31173DnH.A1L(A00, c35267Fh2.A00);
            A00.AAP("ig_thread_id", str);
            A00.A9K("suggestion_position", l);
            A00.AAP("channel_type", str2);
            A00.AAP("ranking_request_id", str4);
            if (map != null) {
                A00.A9M("extra", map);
            }
            A00.Cht();
        }
    }

    public static final void A07(C35267Fh2 c35267Fh2, Long l, String str, String str2, String str3, Map map) {
        InterfaceC02590Ai A00 = A00(c35267Fh2);
        if (A00.isSampled()) {
            A04(A00, c35267Fh2);
            AbstractC31171DnF.A1B(A00, "channel_invitation_removed");
            AbstractC31171DnF.A1E(A00, str3);
            AbstractC25232BEp.A1K(A00, "channel_invite_item");
            A00.A9K("suggestion_position", l);
            A00.AAP("ig_thread_id", str);
            A00.AAP("channel_type", str2);
            if (map != null) {
                A00.A9M("extra", map);
            }
            A00.Cht();
        }
    }

    public final void A08() {
        InterfaceC02590Ai A00 = A00(this);
        if (A00.isSampled()) {
            A04(A00, this);
            AbstractC31177DnL.A1D(A00, "channel_filter_leave");
            AbstractC25232BEp.A1K(A00, "channel_filter");
            AbstractC31173DnH.A1L(A00, this.A00);
            A00.Cht();
        }
    }

    public final void A09() {
        InterfaceC02590Ai A00 = A00(this);
        if (A00.isSampled()) {
            this.A00 = AbstractC166997dE.A0n();
            A04(A00, this);
            AbstractC31177DnL.A1D(A00, "channel_filter_open");
            AbstractC25232BEp.A1K(A00, "channel_filter");
            AbstractC31173DnH.A1L(A00, this.A00);
            A00.Cht();
        }
    }

    public final void A0A(DirectShareTarget directShareTarget, String str, String str2, int i) {
        String A01 = A01(directShareTarget);
        if (A01 != null) {
            A05(this, AbstractC31171DnF.A0V(i), directShareTarget.A08(), A01, "inbox", str, A03(this, directShareTarget), str2.equals("inbox_channel_invitation"));
        }
    }

    public final void A0C(String str) {
        InterfaceC02590Ai A00 = A00(this);
        if (A00.isSampled()) {
            A04(A00, this);
            AbstractC31171DnF.A1B(A00, MSV.A00(1022));
            AbstractC31171DnF.A1E(A00, str);
            AbstractC31177DnL.A1F(A00, "channel_invite_item");
            AbstractC31173DnH.A1L(A00, this.A00);
            A00.Cht();
        }
    }
}
