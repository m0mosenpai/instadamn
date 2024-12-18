package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.Fzq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36296Fzq implements InterfaceC13000lm {
    public String A00;
    public final C18920wW A01;
    public final UserSession A02;

    public final void A04(boolean z, String str) {
        String str2;
        C14360o3.A0B(str, 1);
        this.A00 = "";
        EnumC33512Erl enumC33512Erl = EnumC33512Erl.THREAD_DETAILS;
        if (z) {
            str2 = "thread_end_cancel";
        } else {
            str2 = "thread_end";
        }
        A02(EnumC33514Ern.A0E, enumC33512Erl, this, str2, "tap", AbstractC167007dF.A0n(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = null;
        this.A02.A03(C36296Fzq.class);
    }

    public static void A01(EnumC33514Ern enumC33514Ern, EnumC33512Erl enumC33512Erl, C36296Fzq c36296Fzq, String str) {
        A02(enumC33514Ern, enumC33512Erl, c36296Fzq, str, "tap", null);
    }

    public static final void A02(EnumC33514Ern enumC33514Ern, EnumC33512Erl enumC33512Erl, C36296Fzq c36296Fzq, String str, String str2, Map map) {
        if (c36296Fzq.A00 != null) {
            try {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36296Fzq.A01, "igd_creator_subscriber_chats_action");
                if (A0f.isSampled()) {
                    A0f.A9K("actor_id", AbstractC25228BEl.A13(c36296Fzq.A02.userId));
                    A0f.AAP("parent_surface", "instagram");
                    AbstractC31171DnF.A1B(A0f, str);
                    AbstractC31171DnF.A1C(A0f, str2);
                    A0f.A8R(enumC33514Ern, CacheBehaviorLogger.SOURCE);
                    A0f.A8R(enumC33512Erl, "surface");
                    A0f.AAP(AbstractC50635MWw.A01(), c36296Fzq.A00);
                    if (map != null) {
                        A0f.A9M("extra", map);
                    }
                    A0f.Cht();
                }
            } catch (NumberFormatException e) {
                C0w9.A06("CreatorSubscriberChatLogger", "Failed to convert user id to long", e);
            }
        }
    }

    public C36296Fzq(UserSession userSession) {
        this.A02 = userSession;
        C12210kP A0P = AbstractC31177DnL.A0P(userSession);
        A0P.A01 = "creator_subscriber_chat";
        this.A01 = A0P.A00();
    }

    public static final C09530e4 A00(EnumC33373Ep6 enumC33373Ep6) {
        EnumC33512Erl enumC33512Erl;
        EnumC33514Ern enumC33514Ern;
        int ordinal = enumC33373Ep6.ordinal();
        if (ordinal != 14) {
            if (ordinal != 0) {
                if (ordinal != 10) {
                    return null;
                }
                enumC33512Erl = EnumC33512Erl.DIRECT_INVITE_NOTIFICATION;
            } else {
                enumC33512Erl = EnumC33512Erl.STORY;
            }
            enumC33514Ern = EnumC33514Ern.A0R;
        } else {
            enumC33512Erl = EnumC33512Erl.SSC_LIST_IN_SUBSCRIPTION_SETTINGS;
            enumC33514Ern = EnumC33514Ern.A05;
        }
        return AbstractC166987dD.A1L(enumC33512Erl, enumC33514Ern);
    }

    public final void A03() {
        this.A00 = AbstractC166997dE.A0n();
        A01(EnumC33514Ern.A0A, EnumC33512Erl.STORY, this, "publish_story_with_subscriber_join_chat_sticker");
    }
}
