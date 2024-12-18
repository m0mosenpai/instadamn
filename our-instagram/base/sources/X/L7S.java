package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class L7S {
    public EnumC46279KeB A00;
    public UUID A01;
    public UUID A02;
    public final C18920wW A03;

    public L7S(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = AbstractC12220kQ.A02(userSession);
    }

    public final void A00(EnumC46296KeS enumC46296KeS) {
        String obj;
        EnumC46279KeB enumC46279KeB = this.A00;
        if (enumC46279KeB == null) {
            C0K8.A0E("SuggestedRepliesLogger", AbstractC111324zv.A00(684));
            return;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "ig_creator_agents_suggested_replies_collapse");
        if (A0f.isSampled()) {
            A0f.A8R(enumC46279KeB, "inbox_type");
            UUID uuid = this.A01;
            String str = null;
            if (uuid != null) {
                str = uuid.toString();
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            A0f.AAP("sr_session_id", str);
            UUID uuid2 = this.A02;
            if (uuid2 != null && (obj = uuid2.toString()) != null) {
                str2 = obj;
            }
            A0f.AAP("thread_session_id", str2);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A01(enumC46296KeS, "type_of_collapse");
            A0f.AAQ(c0Zx, "sr_context");
            A0f.Cht();
        }
        this.A01 = C0HM.A00();
    }
}
