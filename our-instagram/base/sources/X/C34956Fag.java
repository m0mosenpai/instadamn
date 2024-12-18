package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This logger is only used for the old thread details. For new end channel logging use SocialChannelsLogHelper, BroadcastChatLogHelper or CreatorSubscriberChatLogger")
/* renamed from: X.Fag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34956Fag {
    public final C18920wW A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C34956Fag(UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(str2, 3);
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = AbstractC111324zv.A00(2278);
        this.A00 = c12210kP.A00();
    }

    public static final void A00(C34956Fag c34956Fag, String str, String str2, String str3) {
        try {
            C25531Mh A0F = C25531Mh.A0F(c34956Fag.A00);
            if (AbstractC25226BEj.A1Z(A0F)) {
                AbstractC31178DnM.A1F(A0F, c34956Fag.A01);
                A0F.A0k(str);
                A0F.A0j(str2);
                A0F.A0o("end_chat_dialog");
                AbstractC31175DnJ.A1D(A0F, str3);
                A0F.A0u(c34956Fag.A02);
                A0F.A0r(c34956Fag.A03);
                A0F.A0h(AbstractC166997dE.A0j(c34956Fag.A04));
                A0F.Cht();
            }
        } catch (NumberFormatException e) {
            C0w9.A06("EndChannelLogger", "Failed to convert String to Long", e);
        }
    }
}
