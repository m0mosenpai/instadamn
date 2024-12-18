package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Gpa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38107Gpa {
    public final C18920wW A00;
    public final Keyword A01;
    public final String A02;
    public final String A03;

    public final void A00(C132835z6 c132835z6) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_refinement_item_click");
        if (A0f.isSampled()) {
            A0f.A9K("position", AbstractC167007dF.A0d());
            A0f.AAP(AbstractC31198Dnh.A00(), this.A02);
            A0f.AAP("search_session_id", this.A03);
            Keyword keyword = this.A01;
            String str2 = null;
            if (keyword != null) {
                str = keyword.A03;
            } else {
                str = null;
            }
            A0f.AAP("entity_page_id", str);
            if (keyword != null) {
                str2 = keyword.A04;
            }
            A0f.AAP("entity_page_name", str2);
            A0f.AAP("entity_page_type", "keyword");
            A0f.AAP("entity_id", c132835z6.A00().A03);
            A0f.AAP("entity_name", c132835z6.A00().A04);
            A0f.AAP("entity_type", "KEYWORD");
            A0f.AAP("entity_unit", c132835z6.A04);
            AbstractC25233BEq.A17(A0f, "entity_unit_style", AbstractC40609HzT.A00(c132835z6.A02));
            A0f.Cht();
        }
    }

    public /* synthetic */ C38107Gpa(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Keyword keyword, String str, String str2) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        C14360o3.A0B(A01, 6);
        this.A01 = keyword;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = A01;
    }
}
