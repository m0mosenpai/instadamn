package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CTj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27949CTj {
    public final C31200Dnj A00;
    public final UserSession A01;

    public final void A00(String str, String str2) {
        C22C A01 = AnonymousClass229.A01(this.A01);
        String str3 = this.A00.A00;
        C448124l c448124l = A01.A09;
        C14360o3.A0B(str3, 0);
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        if (AbstractC25226BEj.A1Z(A08) && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q(str);
            C448124l.A00(A08, c448124l);
            A08.A0R("magicmod_session_id", str3);
            A08.A0R("genai_prompt", null);
            A08.A0Q("prompt_pill_position", null);
            A08.A0M(null, "genai_generation_type");
            A08.A0R("genai_content_id", str2);
            A08.Cht();
        }
    }

    public /* synthetic */ C27949CTj(UserSession userSession) {
        C31200Dnj c31200Dnj = new C31200Dnj(AbstractC25231BEo.A0p(), 13);
        this.A01 = userSession;
        this.A00 = c31200Dnj;
    }
}
