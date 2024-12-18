package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AfD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23740AfD implements InterfaceC184728Hn {
    public final /* synthetic */ C8HN A00;

    public C23740AfD(C8HN c8hn) {
        this.A00 = c8hn;
    }

    @Override // X.InterfaceC184728Hn
    public final boolean D3S() {
        C8HN c8hn = this.A00;
        C174757qB c174757qB = c8hn.A04;
        int A09 = c174757qB.A09();
        int i = 2;
        if (A09 == 1 || A09 == 2) {
            i = 3;
        }
        UserSession userSession = c8hn.A05;
        c174757qB.A07();
        C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448724r.A01, "ig_camera_ui_tool_click");
        if (c448724r.A0P() && A0f.isSampled()) {
            A0f.A8R(C81X.A1W, "tool_type");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            AbstractC166987dD.A1S(A0f, str);
            AbstractC167007dF.A10(A0f, c448724r);
            AbstractC166997dE.A1N(A0f, "camera_position", AbstractC167017dG.A0I(c22m));
            A0f.A9K("capture_format_index", AbstractC167007dF.A0d());
            AbstractC167007dF.A11(A0f, c448724r);
            AbstractC167017dG.A1A(c22m.A09, A0f);
            A0f.A8R(c22m.A0A, "media_type");
            AbstractC167017dG.A1B(A0f);
            A0f.A8R(EnumC50631MWs.A0J, "surface");
            AbstractC167017dG.A1C(A0f);
        }
        C8HN.A00(c8hn, i);
        return true;
    }
}
