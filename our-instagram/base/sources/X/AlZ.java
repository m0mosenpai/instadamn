package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AlZ implements InterfaceC169327h6 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;

    public AlZ(UserSession userSession, C38321qM c38321qM) {
        this.A00 = userSession;
        this.A01 = c38321qM;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A00;
        String id = this.A01.getId();
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C168037ey.class);
        c25621Ms.A06();
        c25621Ms.A0B("media/story_comment/mention_search_members/");
        c25621Ms.A0H("media_id", id);
        c25621Ms.A0H("query", str);
        c25621Ms.A0H(MSV.A00(62), "comment_composer_page");
        return c25621Ms.A0N();
    }
}
