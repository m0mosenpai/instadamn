package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;

/* renamed from: X.Fzu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36299Fzu implements InterfaceC13000lm {
    public String A00;
    public final long A01;
    public final C18920wW A02;
    public final UserSession A03;

    public static C25531Mh A00(C36299Fzu c36299Fzu) {
        return C25531Mh.A0F(c36299Fzu.A02);
    }

    public static final String A01(ChannelCreationSource channelCreationSource) {
        switch (channelCreationSource.ordinal()) {
            case 0:
            case 5:
                throw AbstractC166987dD.A14(AbstractC166997dE.A0x(" is not a valid surface for social channel", AbstractC31174DnI.A0y(channelCreationSource)));
            case 1:
            case 6:
                return "profile";
            case 2:
            case 3:
            case 4:
            case 7:
                return "dm_creation_omnipicker";
            case 8:
            case 9:
            case 10:
            case 11:
                return "create_channel";
            default:
                throw B4Z.A00();
        }
    }

    public static void A04(C25531Mh c25531Mh, C36299Fzu c36299Fzu) {
        c25531Mh.A0g(Long.valueOf(c36299Fzu.A01));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A03(C36299Fzu.class);
    }

    public C36299Fzu(UserSession userSession) {
        this.A03 = userSession;
        this.A01 = AbstractC31178DnM.A03(AbstractC25231BEo.A0j(0, userSession.userId));
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "igd_public_chats_actions";
        this.A02 = c12210kP.A00();
    }

    public static final String A02(EnumC33373Ep6 enumC33373Ep6) {
        int ordinal = enumC33373Ep6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 3) {
                if (ordinal != 10) {
                    if (ordinal != 12) {
                        if (ordinal != 7) {
                            return null;
                        }
                        return "group_link_xma";
                    }
                    return "profile";
                }
                return "direct_invite";
            }
            return "inbox_search";
        }
        return "story";
    }

    public static final HashMap A03(C34628FNl c34628FNl, C36299Fzu c36299Fzu) {
        Integer num;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("chat_type", "public");
        String str = c34628FNl.A06;
        if (str != null) {
            A1G.put("chat_creation_source", str);
        }
        Boolean bool = c34628FNl.A00;
        if (bool != null) {
            A1G.put("has_thread_photo", AbstractC31172DnG.A0z(bool.booleanValue() ? 1 : 0));
        }
        Boolean bool2 = c34628FNl.A02;
        if (bool2 != null) {
            A1G.put("limited_to_subscribers", AbstractC31172DnG.A0z(bool2.booleanValue() ? 1 : 0));
        }
        Boolean bool3 = c34628FNl.A03;
        if (bool3 != null) {
            A1G.put("show_on_profile", AbstractC31172DnG.A0z(bool3.booleanValue() ? 1 : 0));
        }
        Boolean bool4 = c34628FNl.A01;
        if (bool4 != null) {
            A1G.put("categories_selected", AbstractC31172DnG.A0z(bool4.booleanValue() ? 1 : 0));
        }
        Integer num2 = c34628FNl.A04;
        if (num2 != null) {
            A1G.put("number_invited", String.valueOf(num2.intValue()));
        }
        if (C18U.A06(C06090Tz.A05, c36299Fzu.A03, 36327520584612494L) && (num = c34628FNl.A05) != null) {
            A1G.put("chat_duration_seconds", String.valueOf(num.intValue()));
        }
        return A1G;
    }

    public static void A05(C25531Mh c25531Mh, C36299Fzu c36299Fzu, String str) {
        c25531Mh.A0p(str);
        c25531Mh.A0n("instagram");
        c25531Mh.A0u(c36299Fzu.A00);
    }

    public final void A06(ChannelCreationSource channelCreationSource) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            this.A00 = AbstractC166997dE.A0n();
            A04(A00, this);
            AbstractC31174DnI.A1J(A00, AbstractC111324zv.A00(4082));
            String str = "omnipicker_view";
            switch (channelCreationSource.ordinal()) {
                case 4:
                    break;
                case 5:
                    throw AbstractC166987dD.A14(AbstractC166997dE.A0x(" is not a valid source for social channel ", AbstractC31174DnI.A0y(channelCreationSource)));
                default:
                    str = "profile_view";
                    break;
            }
            A00.A0o(str);
            A05(A00, this, A01(channelCreationSource));
            A00.Cht();
        }
    }

    public final void A07(C34628FNl c34628FNl) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, this);
            AbstractC31174DnI.A1I(A00, "thread_create_attempt");
            A00.A0o("create_public_chat_button");
            A05(A00, this, "invite_people");
            A00.A0v(A03(c34628FNl, this));
            A00.Cht();
        }
    }
}
